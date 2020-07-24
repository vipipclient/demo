package com.example.demo.service;

import com.example.demo.dao.HtmlLoad;
import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Service
public class IlyasService {
    private final HtmlLoad htmlLoad;
    @Autowired
    public IlyasService(@Qualifier("fakeHTML") HtmlLoad htmlLoad){
        this.htmlLoad = htmlLoad;
    }
    public String getHTML(){return htmlLoad.getHTML();}

}