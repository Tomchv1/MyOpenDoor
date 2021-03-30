package com.example.myopendoor;

import android.util.Log;

import androidx.test.espresso.base.Default;

import com.example.myopendoor.data.model.AsyncResponse;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class AccesHTTP extends AsyncResponse<String, Integer, Long>{

    private ArrayList<NameValuePair> parametres;

    public AccesHTTP(){
        parametres = new ArrayList<NameValuePair>()
    }


    /**
     * @param nom
     * @param valeur
     */
    public void addParam(String nom, String valeur){
        parametres.add(new BasicNameValuePair(nom, valeur));
    }

    /**
     * @param strings
     * @return
     */
    @Override
    protected Long doInBackground(String... strings){
        HttpClient cnxHttp = new DefaultHttpClient();
        HttpPost paramCnx = new HttpPost(strings[0]);

        try {
            paramCnx.setEntity(new UrlEncodedFormEntity(parametres));
        } catch (UnsupportedEncodingException e){
            Log.d("Erreur encodage", "++++++++++++++"+e.toString());
        }

        return null;
    }
}
