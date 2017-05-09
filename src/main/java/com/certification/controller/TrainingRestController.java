package com.certification.controller;

import com.certification.dao.TrainingRestDao;
import com.certification.service.TrainingRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class TrainingRestController {

    private List<String> consumers;
    private Map<String, String> suppliers;
    @Autowired
    private TrainingRestService trainingRestService;
    @Autowired
    private TrainingRestDao trainingRestDao;

    @RequestMapping(value = "/rest/get/{id}", method = RequestMethod.GET)
    public String getValue(@PathVariable int id) {
        consumers = trainingRestService.fillConsumers(trainingRestDao.getConsumers());
        return consumers.get(id);
    }

    @RequestMapping(value = "/rest/put/{id},{value}", method = RequestMethod.PUT)
    public String putValue(@PathVariable int id, @PathVariable String value) {
        consumers = trainingRestService.fillConsumers(trainingRestDao.getConsumers());
        suppliers = trainingRestService.putSuppliers(trainingRestDao.getSuppliers());
        if (suppliers.containsValue(value)) {
            return getValue(id);
        }
        suppliers.put(String.valueOf(id), value);
        return suppliers.get(String.valueOf(id));
    }

    @RequestMapping(value = "/rest/delete/{id}", method = RequestMethod.DELETE)
    public String deleteValue(@PathVariable int id) {
        consumers = trainingRestService.fillConsumers(trainingRestDao.getConsumers());
        String consumer = consumers.get(id);
        if (consumer != null) {
            consumers.remove(id);
            return consumer + " has been removed successfully";
        }
        return "Consumer with id = " + id + " doesn't exist";
    }


}
