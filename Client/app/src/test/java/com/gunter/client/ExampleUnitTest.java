package com.gunter.client;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.junit.Test;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    OkHttpClient client = new OkHttpClient.Builder().build();

    final String BASE_HOST = "http://127.0.0.1:8477";

    @Test
    public void okhttp_get() throws Exception {
        client.newCall(new Request.Builder().url(BASE_HOST + "/todo/api/v1.0/tasks").get().build()).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                System.out.println(e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                ResponseBody body;
                if ((body = response.body()) != null) {
                    Gson gson = new Gson();
                    IResponse<Tasks> iRes = gson.fromJson(body.string(), new TypeToken<IResponse<Tasks>>() {
                    }.getType());
                    System.out.print("response:" + iRes.getRESULT().string());
                }
            }
        });

        Thread.sleep(3000);
    }

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}