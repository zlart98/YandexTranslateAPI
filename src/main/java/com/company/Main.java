package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
            for (;;){
                System.out.println("Введите текст:");
                String text = in.nextLine();


                YandexTranslate yandexTranslate = new YandexTranslate(text);
                yandexTranslate.translate();
            }
    }
}
