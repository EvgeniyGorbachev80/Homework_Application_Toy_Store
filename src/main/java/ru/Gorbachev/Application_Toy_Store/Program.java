package ru.Gorbachev.Application_Toy_Store;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Raffle r = new Raffle();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    Главное меню:
                    1 - Добавить новую игрушку в призовой фонд
                    2 - Изменить частоту выпадения той или иной игрушки
                    3 - Провести розыгрыш и сохранить результаты
                    0 - ВЫХОД
                    >\s""");
            var selection = sc.next();
            switch (selection) {
                case "1" -> r.addToy();
                case "2" -> r.setFrequency();
                case "3" -> r.raffle();
                case "0" -> {
                    System.out.println("До свидания");
                    System.exit(0);
                }
                default -> System.out.println("Неправильный выбор. Попробуйте еще раз.");
            }
        }
    }
}
