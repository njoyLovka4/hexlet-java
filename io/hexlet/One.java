package io.hexlet;

// Импортируем класс для работы со строками из внешней библиотеки
import org.apache.commons.lang3.StringUtils;

public class One {
    public static void main(String[] args) {
        // Переворачиваем строку "Hexlet"
        String reversed = StringUtils.reverse("Hexlet");
        
        // Выводим результат на экран
        System.out.println(reversed);
    }
}

