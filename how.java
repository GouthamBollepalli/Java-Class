package com.Student.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class how {
    public final how repository;

    @Autowired
    public how(how repository) {
        this.repository = repository;
    }
}

