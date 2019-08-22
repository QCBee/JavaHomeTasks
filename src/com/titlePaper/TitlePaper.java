package com.titlePaper;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
Напишите программу, в которой задаются данные(строки): имя, фамилия и отчество и  выводящую эти  данные в следующем
виде:

********************************
        Курс: Java core
            Студент
              ФИО
********************************
Необходимо, чтобы программа сама определяла нужную длину рамки. Сама же длина рамки зависит от длины наибольшей
строки внутри рамки. Используя циклы for легко можно выровнять стороны рамки.

"Строка".length()

 */
public class TitlePaper {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите название курса и нажмите Enter");
        String kursTitle = bufferedReader.readLine(); //читаем строку с клавиатуры
        System.out.println("Ввелите статус человека и нажмите Enter");
        String personStatus = bufferedReader.readLine(); //читаем строку с клавиатуры
        System.out.println("Введите ФИО человека и нажмите Enter");
        String name = bufferedReader.readLine();
        System.out.println(kursTitle + " " + personStatus + " " + name);
        getGridLength(kursTitle,personStatus,name);
    }

    public static void getGridLength (String kursTitle, String personStatus, String name){
        if ((kursTitle.length() > personStatus.length()) && (kursTitle.length() > name.length())) {
            for (int i = 0; i < (kursTitle.length() + 10); i++) {
                for (int j = 0; j < 5 ; j++) {
                    if (j != 0 || j < 4) {
                        System.out.print("*");
                    }

                }
            }
        }
    }

}
