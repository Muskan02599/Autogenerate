// src/main/java/com/example/schedulermicroservice/scheduler/DataScheduler.java
package com.example.Autogenerate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DataScheduler {

    @Autowired
    private DataRepository dataRepository;
    @Autowired
    private RepeatedRepo repeatedRepo;

    private int counter = 0;

    @Scheduled(fixedRateString ="${no.of.time}")
    public void scheduleTask() {
        // Create a new DataModel and save it to the database
        DataModel data = new DataModel();
        String id=IdGenerator.generateId();
        Optional<DataModel> idpresent=dataRepository.findById(id);
        if(idpresent.isPresent()){
            Repeated_entries repeatedEntries=new Repeated_entries();
            repeatedEntries.setId(idpresent.get().getId());
            repeatedRepo.save(repeatedEntries);
        }
        data.setId(id);
        data.setName("Name" + counter);
        dataRepository.save(data);

        counter++;
    }
}
