package com.example.learnnewwords.repository;

import com.example.learnnewwords.model.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<TestModel, Long> {

    TestModel save(TestModel model);
    List<TestModel> findAll();
}
