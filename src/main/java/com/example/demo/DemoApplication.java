package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
 
public class DemoApplication {
    public void example(String arg) throws IOException {    
        foo(arg);
    }
     
    public void foo(String arg) throws IOException {
        Runtime.getRuntime().exec(arg);
    }
    
    public static void main(String[] args) {
        System.out.println("Inside Main function");
    }
}
