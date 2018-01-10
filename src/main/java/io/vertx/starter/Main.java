package io.vertx.starter;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;

public class Main {

  public static void main(String[] args) {

    Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(new MainVerticle(), new DeploymentOptions(), ar -> {
      if (ar.succeeded()) {
        System.out.println(ar.succeeded());
      } else {
        ar.cause().printStackTrace();
      }
    });
  }
}
