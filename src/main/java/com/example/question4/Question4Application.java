package com.example.question4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class Question4Application {

    public static void main(String[] args) {
        SpringApplication.run(Question4Application.class, args);

       Random random= new Random();
        List<Integer>randomSayi=new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int randomS = random.nextInt(100);
            randomSayi.add(randomS);
        }

        List<Integer> kopya = new ArrayList<>(randomSayi);
        System.out.println("Kopyalanmış Liste: " + kopya);



    }
}
