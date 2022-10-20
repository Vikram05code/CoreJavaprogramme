package com.vikram;
import java.util.Map;
import java.util.HashMap;
public class EnglishHindiDictionary {
    public static void main(String[] args){
        Map<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Monday", "Somwar");
        dictionary.put("Tuesday", "Mangalwar");
        dictionary.put("Wednesday", "Budhwar");
        dictionary.put("Thrusday", "Brihaspatwar");
        dictionary.put("Friday", "Shukrawar");
        dictionary.put("Saturday", "Shaniwar");
        dictionary.put("Sunday", "Raviwar");

        System.out.println(dictionary.get("Monday"));
        System.out.println(dictionary.keySet());
        System.out.println(dictionary.values());

    }
}
