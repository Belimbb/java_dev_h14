package com.example.java_dev_h14.repository;

import com.example.java_dev_h14.entity.Note;

import lombok.Getter;
import lombok.ToString;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@ToString
public class FakeDB {
    @Getter
    private List<Note> notes;
    private final AtomicLong idGenerator = new AtomicLong(0);
    private static FakeDB INSTANCE;
    private static final Logger LOGGER = LoggerFactory.getLogger(FakeDB.class);

    private FakeDB(){}

    public static FakeDB getInstance(){
        if (INSTANCE == null){
            INSTANCE = new FakeDB();
            LOGGER.info("Initialized FakeDB repository");
        }
        return INSTANCE;
    }

    public Long generateId() {
        return idGenerator.incrementAndGet();
    }
}
