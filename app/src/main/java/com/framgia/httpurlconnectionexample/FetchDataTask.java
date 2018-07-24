package com.framgia.httpurlconnectionexample;

import android.os.AsyncTask;

import com.framgia.httpurlconnectionexample.entity.Data;
import com.framgia.httpurlconnectionexample.entity.Owner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class FetchDataTask extends AsyncTask<String, Void, ArrayList<Data>> {

    private static final String KEY_ID = "id";
    private static final String KEY_NODE_ID = "node_id";
    private static final String KEY_NAME = "name";
    private static final String KEY_FULL_NAME = "full_name";
    private static final String KEY_OWNER = "owner";
    private static final String KEY_OWNER_ID = "id";
    private static final String KEY_OWNER_AVATAR_URL = "avatar_url";
    private static final String REQUEST_METHOD = "GET";
    private OnLoadDataFinishedListener mListener;

    public FetchDataTask(OnLoadDataFinishedListener listener) {
        this.mListener = listener;
    }

    @Override
    protected ArrayList<Data> doInBackground(String... strings) {

        StringBuilder response = new StringBuilder();
        String apiEndPoint = strings[0];
        try {
            URL url = new URL(apiEndPoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(REQUEST_METHOD);

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine = bufferedReader.readLine()) != null) {
                response.append(inputLine);
            }
            bufferedReader.close();
            connection.disconnect();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<Data> datas = getDataFromResponse(response.toString());
        return datas;
    }

    private ArrayList<Data> getDataFromResponse(String s) {
        ArrayList<Data> listDatas = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(s);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                int id = jsonObject.getInt(KEY_ID);
                String nodeId = jsonObject.getString(KEY_NODE_ID);
                String name = jsonObject.getString(KEY_NAME);
                String fullName = jsonObject.getString(KEY_FULL_NAME);
                JSONObject ownerObject = jsonObject.getJSONObject(KEY_OWNER);
                int ownerId = ownerObject.getInt(KEY_OWNER_ID);
                String ownerAvatar = ownerObject.getString(KEY_OWNER_AVATAR_URL);

                listDatas.add(new Data(id, nodeId, name, fullName, new Owner(ownerId, ownerAvatar)));
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return listDatas;
    }


    @Override
    protected void onPostExecute(ArrayList<Data> data) {
        super.onPostExecute(data);
        mListener.onLoadFinished(data);
    }

    interface OnLoadDataFinishedListener {
        void onLoadFinished(ArrayList<Data> datas);
    }
}
