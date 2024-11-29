package com.springLearning.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class boardOfGames implements Game{
    @Override
    public String cricket(){
        return "cricket is going on...";
    }
}
