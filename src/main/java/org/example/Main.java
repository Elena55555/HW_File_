package org.example;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws IOException {
            /** - Объявляем Scanner - для считывания введенных пользователем данных типа String (может использоваться для типов byte, short, int, long, float, double)
             *  - читаем с клавиатуры сообщение с помощью метода nextLine() или next()
             *  - File file = new File - объявляем файл и указываем к нему точный путь "C://My file/writer.txt"
             *  - используем класс FileWriter для добавления текста в уже  существующий файл
             *  - обязательным условием работы с объектами класса java.io.Writer
             *  является обработка исключения java.io.IOException, поэтому код выполняется в блоке try - catch
             *  - write() - этот метод записывает последовательность символов  в файл
             *  - создаем переменную   messageSecond  для сохранения в ней сообщений во внешней области видимости для дальнейшей работы с ней
             *  - используем бесконечный цикл do-while который прервется введением пользователем 0 (!messageSecond.equals("0"))
             *  - writer.close() при работе с потоками записи важно закрывать, чтобы освободить ресурсы
             */


            Scanner scannerFirst = new Scanner(System.in); //
            System.out.println("Введите данные для записи");
            String message = scannerFirst.nextLine();
            try {//
                File file = new File("C://My file/writer.txt");
                java.io.FileWriter writer = new java.io.FileWriter(file, true);
                writer.write(message  +  '\n');

                String messageSecond;//
                do {
                    Scanner scannerSecond = new Scanner(System.in);
                    System.out.println("Введите что-нибудь еще");
                    messageSecond = scannerSecond.next();
                    writer.write(messageSecond  +  '\n');

                } while (!messageSecond.equals("0"));
                System.out.println("Файл создан");
                writer.close();

            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден ");
            }
        }
    }


