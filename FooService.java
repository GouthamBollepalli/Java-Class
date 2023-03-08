package com.Student.org;

public class FooService {

    private final FooService repository;

    public FooService(FooService repository) {
        this.repository = repository;
    }
}
