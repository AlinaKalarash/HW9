package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.example.Texts.FILE_NOT_FOUND_EXCEPTION_TEXT;
import static org.example.Texts.ENTER_HTTP_STATUS;

public class HttpImageStatusCli {

    void askStatus() {
        System.out.println(ENTER_HTTP_STATUS);
        Scanner scanner = new Scanner(System.in);
        int statusCode = scanner.nextInt();
        try {
            String url = new HttpStatusChecker().getStatusImage(statusCode);
            if (url.length() > 1) {
                HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();
                downloader.downloadStatusImage(statusCode);
            }
        } catch (Exception e) {
            System.out.println(String.format(FILE_NOT_FOUND_EXCEPTION_TEXT, statusCode));
        }
    }

    public static void main(String[] args) {
        HttpImageStatusCli cli = new HttpImageStatusCli();
        cli.askStatus();
    }
}
