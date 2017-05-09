package com.certification.dao;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TrainingRestDao {

    private List<String> consumers = new ArrayList<>();
    private Map<String, String> suppliers = new HashMap<>();

    public List<String> getConsumers() {
        return consumers;
    }

    public void setConsumers(List<String> consumers) {
        this.consumers = consumers;
    }

    public Map<String, String> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Map<String, String> suppliers) {
        this.suppliers = suppliers;
    }
}
