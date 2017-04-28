package com.hunsh;

import io.vertx.core.Vertx;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @Author : Edward Jia
 * @Description :
 * @Date : 17/4/5
 * @Version :
 */
@RunWith(VertxUnitRunner.class)
public class MyFirstVerticleTest {

    private Vertx vertx;

    @Before
    public void before (TestContext testContext){
        vertx = Vertx.vertx();
        vertx.deployVerticle(MyFirstVertx.class.getName(), testContext.asyncAssertSuccess());
    }


    @After
    public void after (TestContext testContext){
        vertx.close(testContext.asyncAssertSuccess());
    }

    @Test
    public void test (TestContext testContext){
        final Async async = testContext.async();

        vertx.createHttpClient().getNow(9093, "localhost", "/",
                response -> {
                    response.handler(body -> {
                        testContext.assertTrue(body.toString().contains("Hello"));
                        async.complete();
                    });
                });
    }


}
