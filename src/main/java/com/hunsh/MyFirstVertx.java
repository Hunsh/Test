package com.hunsh;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

import java.io.InputStream;

/**
 * @Author : Edward Jia
 * @Description :
 * @Date : 17/3/15
 * @Version :
 */
public class MyFirstVertx extends AbstractVerticle{


    @Override
    public void start(Future<Void> startFuture) throws Exception {
        super.start(startFuture);

        vertx.createHttpServer().requestHandler(request ->{
            request.response().end("hello world");
        }).listen(9091, result -> {
            if(result.succeeded()){
                startFuture.complete();
            }else {
                startFuture.failed();
            }
        });


    }
}
