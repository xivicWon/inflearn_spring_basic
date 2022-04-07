package com.inflearn.basic.singleton;

import java.sql.SQLOutput;

public class SingleTonService {

    private static final SingleTonService instance = new SingleTonService();

    public static SingleTonService getInstance(){
        return instance;
    }

    private SingleTonService(){
    }

    public void logic(){
        System.out.println("called singleton logic");
    }
}


