package com.neill.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public record DBWords(int id, int category_id, String word) {
}
