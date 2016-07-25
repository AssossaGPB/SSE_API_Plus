package xyz.assossa.sap.util;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

public class SSE {

    private static String sseAdr;

    public static String getAddress() {
        if (sseAdr.equals("")) {
            String jsonAddressStr = "";
            String corePropsFileName;
            if (System.getProperty("os.name").startsWith("Windows")) {
                corePropsFileName = System.getenv("PROGRAMDATA") + "\\SteelSeries\\SteelSeries Engine 3\\coreProps.json";
            } else {
                corePropsFileName = "/Library/Application Support/" + "SteelSeries Engine 3/coreProps.json";
            }

            try {
                BufferedReader coreProps = new BufferedReader(new FileReader(corePropsFileName));
                jsonAddressStr = coreProps.readLine();
                coreProps.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (!jsonAddressStr.equals("")) {
                    JSONObject obj = new JSONObject(jsonAddressStr);
                    sseAdr = "http://" + obj.getString("address");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return sseAdr;
    }

    public static void send(String extraAddress, String jsonData) {
        if (sseAdr.equals(""))
            getAddress();
        try {
            URL url = new URL(sseAdr + extraAddress);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setReadTimeout(1);
            connection.setUseCaches(false);
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");

            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            byte[] data = jsonData.getBytes(Charset.forName("UTF-8"));
            wr.write(data);
            wr.flush();
            wr.close();
            connection.getInputStream();
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
