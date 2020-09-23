package com.timsanalytics.jar.services;

import org.springframework.stereotype.Service;

@Service
public class MeowService {
    public void Meow() {
        System.out.println("The cat goes 'meow'.");
    }
}
