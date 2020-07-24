package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.List;


@Component("fakeHTML")
public class HtmlLoad {
    public String getHTML(){
        StringBuffer stringBuffer= new StringBuffer();
        System.out.println("Trying to open file");
//        try(FileWriter fileWriter = new FileWriter("example.html")){
//            fileWriter.write("abcd");
//        }catch (IOException e){e.printStackTrace();}
        try(FileReader fileReader = new FileReader("C:\\Users\\Ilyas\\IdeaProjects\\demo\\src\\main\\java\\com\\example\\demo\\resousre\\index.html")){
            int c;
            while ((c = fileReader.read()) != -1)
                {stringBuffer.append((char) c);
                     }
            return stringBuffer.toString();
        }catch (IOException e){e.printStackTrace();return "This is HTML";}


    }


}
