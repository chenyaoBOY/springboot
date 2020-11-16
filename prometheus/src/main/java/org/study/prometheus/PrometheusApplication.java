package org.study.prometheus;

import com.sun.net.httpserver.HttpServer;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.prometheus.PrometheusConfig;
import io.micrometer.prometheus.PrometheusMeterRegistry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
@RestController
public class PrometheusApplication {

    @GetMapping("/home")
    public String sayHello(){
        return "hello my dear";
    }

    public static void main(String[] args) {
//        PrometheusMeterRegistry prometheusRegistry = new PrometheusMeterRegistry(PrometheusConfig.DEFAULT);
//
//        try {
//            HttpServer server = HttpServer.create(new InetSocketAddress(8081), 0);
//            server.createContext("/prometheus", httpExchange -> {
//                String response = prometheusRegistry.scrape();
//                httpExchange.sendResponseHeaders(200, response.getBytes().length);
//                try (OutputStream os = httpExchange.getResponseBody()) {
//                    os.write(response.getBytes());
//                }
//            });
//
//            new Thread(server::start).start();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        SpringApplication.run(PrometheusApplication.class, args);
//        Calendar calendar = Calendar.getInstance();
//        long now = calendar.getTimeInMillis() / 1000;
//        calendar.set(Calendar.HOUR_OF_DAY,0);
//        calendar.set(Calendar.MINUTE,0);
//        calendar.set(Calendar.SECOND,0);
//        calendar.set(Calendar.MILLISECOND, 0);
//        long todayBegin = calendar.getTimeInMillis() / 1000;
//        System.out.println(now-todayBegin);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2017, Calendar.JANUARY, 4);
        calendar2.set(Calendar.HOUR_OF_DAY, 0);
        calendar2.set(Calendar.MINUTE, 0);
        calendar2.set(Calendar.SECOND, 0);
        calendar2.set(Calendar.MILLISECOND, 0);
        System.out.println( ((System.currentTimeMillis() - calendar2.getTimeInMillis())/ 1000) % (24 * 60 * 60) );

//
//        System.out.println(((System.currentTimeMillis() - 0) % (24 * 60 * 60 * 1000)) / 1000);
    }

    @Bean
    MeterRegistryCustomizer<MeterRegistry> configurer(
            @Value("${spring.application.name}") String applicationName) {
        return (registry) -> registry.config().commonTags("application", applicationName);
    }

}
