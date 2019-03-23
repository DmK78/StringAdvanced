package com.android.dmk78.stringadvanced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*String nameString = "Андрей, Степан, Анатолий, Дмитрий, Иван, Сергей";
        String []names = nameString.split(", ");
        for(String name: names){
            Log.i("Myname", name);
        }*/

        /*String geometria = "Геометрия";
        String meter=geometria.substring(3,7);
        Log.i("Myname", meter);*/

        String url = "\t<div class=\"image\">\n" +
                "\t\t\t\t\t\t<img src=\"http://cdn.posh24.se/images/:profile/c/50012\" alt=\"Jessica Simpson\"/>\n" +
                "\t\t\t\t\t</div>";
        Pattern patternImg = Pattern.compile("src=\"(.*?)\"");
        Pattern patternName = Pattern.compile("alt=\"(.*?)\"");

        Matcher matcherImg = patternImg.matcher(url);
        Matcher matcherName = patternName.matcher(url);
        while (matcherImg.find()){
            Log.i("Myname", matcherImg.group(1));
        }
        while (matcherName.find()){
            Log.i("Myname", matcherName.group(1));
        }

    }
}
