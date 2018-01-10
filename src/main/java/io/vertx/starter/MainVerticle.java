package io.vertx.starter;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start() {

    Router router = Router.router(vertx);

    router.route().handler(ctx -> {
      ctx.request().response().end("Hello Vert.x!");
    });

    vertx.createHttpServer()
        .requestHandler(router::accept)
        .listen(8080);
  }

}
