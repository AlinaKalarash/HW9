package org.example;

import java.io.FileNotFoundException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.example.Texts.START_URL;
import static org.example.Texts.EXTENSION;
import static org.example.Texts.FILE_NOT_FOUND_EXCEPTION_TEXT;

public class HttpStatusChecker {

    String getStatusImage(int code) throws Exception {
        String url = START_URL + code + EXTENSION;
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        int response = connection.getResponseCode();
        if (response == 404) {
            System.out.println(String.format(FILE_NOT_FOUND_EXCEPTION_TEXT, code));
            throw new FileNotFoundException(String.format(FILE_NOT_FOUND_EXCEPTION_TEXT, code));
        } else {
            return url;
        }
    }
}
