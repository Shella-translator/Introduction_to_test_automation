package ru.geekbrains;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
* Урок 1. Фреймворки для автоматизации процесса сборки и тестирования проекта
* В проекте есть ответы ко всем заданиям. Чтобы обучение было эффективным — вам необходимо сначала самостоятельно решать задания и только потом сверяться с исходниками.
* Выполняя домашнее задание, вам необходимо разработать своё решение. Скопированная домашняя работа из исходников принята не будет.
* В качестве домашнего задания вам предложена задача реализовать Java приложение для демонстрации парадокса Монти Холла (Парадокс Монти Холла — Википедия) и наглядно убедиться в верности парадокса (запустить игру в цикле на 1000 и вывести итоговый счет).
* Вам необходимо:
* 1. Создать свой Java Maven проект;
* 2. Добавить зависимости JUnit;
* 3. Реализовать прикладную задачу - приложение для демонстрации парадокса Монти Холла;
* 4. Покрыть проект тестами;
* 5. Использовать абстрактные классы;
* 6. Использовать параметризованные тесты;
* 7. Использовать ЖЦ тестов;
* 8. Написать негативные тесты;
* 9. Запушить проект на GitHub и сдать ссылку на свой проект как результат выполнения домашнего задания.
 */

public class MontyHallParadox {
    static Random random;
    static Map<Integer, Boolean> res1;       // Статистика для игрока, не меняющего свой выбор.
    static Map<Integer, Boolean> res2;       // Статистика для игрока, изменяющего свой выбор.
    static int doorsNum;                      // Количество дверей.
    static int attempts;                         // Количество попыток.

    public static void main(String[] args) {
        random = new Random();
        res1 = new HashMap<>();
        res2 = new HashMap<>();
        doorsNum = 3;
        attempts = 1000;

        for (int i = 0; i < attempts; i++) {     // Розыгрыш (1000 попыток).
            trial(i);
        }

        int win = 0;                             // Статистика для первого игрока, не меняющего свой выбор.
        for (Map.Entry<Integer, Boolean> entry: res1.entrySet()){
            if (entry.getValue()){
                win++;
            }
        }
        System.out.println("\nПарадокс Монти Холла");
        System.out.println("\nСтатистика выигрышей для игрока, не меняющего свой выбор: ");
        System.out.println("Количество побед: " + win + " раз из " + attempts + " попыток.");

        win = 0;                                  // Статистика для второго игрока, изменяющего свой выбор.
        for (Map.Entry<Integer, Boolean> entry: res2.entrySet()){
            if (entry.getValue()){
                win++;
            }
        }
        System.out.println("\nСтатистика выигрышей для игрока, изменяющего свой выбор: ");
        System.out.println("Количество побед: " + win + " раз из " + attempts + " попыток.");
    }

    private static void trial(int numRound) {
        int success = random.nextInt(doorsNumber);
        int firstChoice = random.nextInt(doorsNumber);
        int freeOpenDoor = -1;
        int secondChoice = -1;

        for (int i = 0; i < doorsNum; i++) {
            if (i != success && i != firstChoice){
                freeOpenDoor = i;
            }
        }

        for (int i = 0; i < doorsNum; i++) {            // Игрок не изменяет свой выбор.
            if (i != freeOpenDoor && i != firstChoice){
                secondChoice = firstChoice;
            }
        }
        res.put(numRound, success == secondChoice);   // Статистика для первого игрока.

        for (int i = 0; i < doorsNum; i++) {            // Игрок не изменяет свой выбор.
            if (i != freeOpenDoor && i != firstChoice){
                secondChoice = i;
            }
        }
        res.put(numRound, success == secondChoice);   // Статистика для второго игрока.
    }
}
