package com.threelm.vsgame.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import com.threelm.vsgame.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
//TODO page parcer is needed
public class VsForumService extends Service{

    private static final String TAG = VsForumService.class.getSimpleName();

    private static final String LOGIN_URL = "http://enet.nnov.ru/forum/vs/ucp.php?mode=login";
    private static final String EMBASSY = "http://enet.nnov.ru/forum/vs/viewtopic.php?f=30&t=1584";
    private static final String LOGIN = "URrik";
    private static final String PASS = "Saarem01";
    private static final String POST = "POST";
    private static final String GET = "GET";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final String URL_ENCODED = "application/x-www-form-urlencoded";

    private String sid;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public VsForumService() {

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        int result = super.onStartCommand(intent, flags, startId);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                tryLogin(LOGIN, PASS);
            }
        });
        thread.start();
        return result;
    }

    protected void tryLogin(String username, String password) {
        Log.d(TAG, "tryLogin user: "+ username + ", pass: " + password);
        String parameters = getResources().getString(R.string.login_parameters, username, password);
        tryQuery(POST, parameters);
    }

    protected void tryQuery(String method, String parameters)
    {
        Log.d(TAG, "tryQuery method: "+ method + ", parameters: " + parameters);
        HttpURLConnection connection;
        OutputStreamWriter request = null;

        URL url = null;
        String response = null;

        try
        {
            url = new URL(LOGIN_URL);
            connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestProperty(CONTENT_TYPE, URL_ENCODED);
            connection.setRequestMethod(method);

            request = new OutputStreamWriter(connection.getOutputStream());
            request.write(parameters);
            request.flush();
            request.close();
            String line = "";
            InputStreamReader isr = new InputStreamReader(connection.getInputStream());
            BufferedReader reader = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null)
            {
                sb.append(line + "\n");
            }
            // Response from server after login process will be stored in response variable.
            response = sb.toString();
            // You can perform UI operations here
            Log.e(TAG, "Message from Server: \n"+ response);
            isr.close();
            reader.close();
        }
        catch(IOException e)
        {
            Log.e(TAG, " Exception: " + e.getMessage());
        }
    }
}
