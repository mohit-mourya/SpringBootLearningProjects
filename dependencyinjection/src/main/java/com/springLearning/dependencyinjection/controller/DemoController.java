package com.springLearning.dependencyinjection.controller;

import com.springLearning.dependencyinjection.boardOfGames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private boardOfGames board;
    @Autowired
    DemoController(boardOfGames b){
        this.board =b;
    }

    @GetMapping("/cricket")
    String cricketPage(){
        return board.cricket();
    }

    @GetMapping("/hockey")
    String hockeyPage(){
        return "Hockey game is going on..";
    }
}
