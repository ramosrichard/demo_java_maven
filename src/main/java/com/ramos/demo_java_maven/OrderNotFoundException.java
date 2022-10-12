package com.ramos.demo_java_maven;

class OrderNotFoundException extends RuntimeException {

    OrderNotFoundException(Long id) {
      super("Could not find Order " + id);
    }
  }
