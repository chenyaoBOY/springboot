package org.springboot.study.controller;

import org.springboot.study.scheduled.ScheduleThreadPooldTask;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.AsyncContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author chenyao
 * @date 2021/2/18 16:44
 * @description
 */
@RestController
public class HttpAsyncReturnController {

    private ScheduledExecutorService scheduledExecutorService=new ScheduledThreadPoolExecutor(1);


    @GetMapping("/http/async.do")
    public void connect(HttpServletRequest request, HttpServletResponse response){

        AsyncContext asyncContext = request.startAsync(request,response);

        scheduledExecutorService.schedule(() -> {
            response.setStatus(HttpServletResponse.SC_OK);
            try {
                response.getWriter().write("async success!");
            } catch (IOException e) {
                e.printStackTrace();
            }
            asyncContext.complete();
        },3L, TimeUnit.SECONDS);
    }
}
