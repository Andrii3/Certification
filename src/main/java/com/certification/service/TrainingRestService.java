package com.certification.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TrainingRestService {

    public List<String> fillConsumers(List<String> consumers) {
        consumers.add("Andy");
        consumers.add("John");
        consumers.add("Paul");
        consumers.add("Jack");
        consumers.add("Phil");
        return consumers;
    }

    public Map<String, String> putSuppliers(Map<String, String> suppliers) {
        suppliers.put("1", "Andy");
        suppliers.put("2", "John");
        suppliers.put("3", "Paul");
        suppliers.put("4", "Jack");
        suppliers.put("5", "Phil");
        return suppliers;
    }

}
