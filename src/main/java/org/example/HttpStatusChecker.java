package org.example;

public class HttpStatusChecker {

//    TODO:
//      Якщо для відповідного коду картинки немає (сайт https://http.cat повернув 404) - метод викидає Exception.
//      Наприклад, виклик getStatusImage(200) має повернути рядок https://http.cat/200.jpg.
//      А виклик getStatusImage(10000) має викинути виключення,
//      тому що сайт https://http.cat поверне код відповіді 404
    String getStatusImage(int code) {
        return "https://http.cat/"+code+".jpg";
    }
}
