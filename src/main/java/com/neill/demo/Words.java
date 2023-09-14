package com.neill.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
@RestController
public class Words {
    private final Database words = new Database();

    @GetMapping("/words")
    public ArrayList<DBWords> getWords() {
        try {
            return words.getWords();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
