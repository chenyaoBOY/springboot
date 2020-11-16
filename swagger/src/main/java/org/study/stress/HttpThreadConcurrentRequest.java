package org.study.stress;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chenyao
 * @date 2020/9/30 13:29
 * @description
 */
public class HttpThreadConcurrentRequest {

    private static final ExecutorService executors = Executors.newFixedThreadPool(50);

    public static void main(String[] args) throws InterruptedException {
        int n=5;
        CountDownLatch count = new CountDownLatch(n);
        for (int i = 0; i < n; i++) {
            executors.execute(() -> request());
            count.countDown();
        }
        count.await();
        executors.shutdown();
    }


    private static void request(){
        try {
            HttpClient httpClient = HttpClientBuilder.create().build();
            HttpGet httpGet = new HttpGet("http://localhost:8080/home");
            RequestConfig requestConfig =  RequestConfig.custom()
                    .setConnectTimeout(100)
                    .setConnectionRequestTimeout(100)
//                    .setSocketTimeout(1000)
                    .build();
            httpGet.setConfig(requestConfig);
            HttpResponse response = httpClient.execute(httpGet);


            InputStream content = response.getEntity().getContent();

            System.out.println(IOUtils.toString(content));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
