package com.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.form.ResultSet;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EncodingUtils;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by fujiwara_shuhei_gn on 2017/04/13.
 */
@Service
public class WorkshopService {

    public ResultSet loadWorkshops() {
        String url = "https://connpass.com/api/v1/event/?keyword=python&count=1";
        HttpUriRequest req = new HttpGet(url);
        req.setHeader("Content-Type", "application/json; charset=utf-8");
        HttpEntity entity;

        try {
            HttpResponse response = new DefaultHttpClient().execute(req);
            entity = response.getEntity();
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(EntityUtils.toString(entity), ResultSet.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
