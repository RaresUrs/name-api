package com.numbers.test.controller;

import com.numbers.test.api.Number;
import com.numbers.test.service.NumberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumbersController {

    private final NumberService numberService;

    public NumbersController(final NumberService numberService) {
        this.numberService = numberService;
    }

    @PostMapping("addNumber/{numberToBeAdded}")
    public ResponseEntity<Number> addNumber(final @PathVariable Double numberToBeAdded) {
        return new ResponseEntity<>(numberService.addNumber(numberToBeAdded), HttpStatus.ACCEPTED);
    }

    @GetMapping("/refresh")
    public Number refresh() {
        return numberService.refreshNumber();
    }
}
