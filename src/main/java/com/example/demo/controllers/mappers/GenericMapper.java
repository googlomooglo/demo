package com.example.demo.controllers.mappers;

public interface GenericMapper <F, T>{
    T from(F f);
}
