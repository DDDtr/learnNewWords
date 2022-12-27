package com.example.learnnewwords.controller;

import com.example.learnnewwords.model.TestModel;
import com.example.learnnewwords.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final TestService testService;

    @GetMapping("/")
    public String test() {
        return "Hi, World!";
    }

    @GetMapping("/test")
    public TestModel postModel() {
        TestModel testModel = new TestModel("test");
        return testService.save(testModel);
    }

    @GetMapping("/all")
    public List<TestModel> getAll() {
        return testService.findAll();
    }
}
