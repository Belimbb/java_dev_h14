package com.example.java_dev_h14.service;

import com.example.java_dev_h14.entity.Note;

import java.util.List;

public interface NoteCrudService {
    Note add(Note note);
    Note getById(Long id);
    List<Note> listAll();
    void update(Note note);
    void deleteById(Long id);
}
