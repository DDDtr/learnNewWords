package com.example.learnnewwords.service;

import com.example.learnnewwords.model.TestModel;
import com.example.learnnewwords.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

     public TestModel save(TestModel testModel) {
        return testRepository.save(testModel);
    }

    public List<TestModel> findAll() {
        return testRepository.findAll();
    }
}
