package com.ramos.demo_java_maven;

class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(Long id) {
      super("Could not find employee " + id);
    }
  }
