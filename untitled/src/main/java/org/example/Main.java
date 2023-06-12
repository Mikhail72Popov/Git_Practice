package org.example;
import org.example.Variab;
import org.example.ToyStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static org.example.Variab.allToys;
import static org.example.Variab.prizToys;
public class Main {
    public static void main(String[] args) {

        ToyStore doll = new ToyStore(01, "Кукла", 10, 50);
        ToyStore car = new ToyStore(02, "Автомобиль", 5, 60);
        ToyStore plane = new ToyStore(03, "Самолёт", 8, 65);
        ToyStore tractor = new ToyStore(04, "Трактор", 11, 70);
        ToyStore designer = new ToyStore(05, "Конструктор", 6, 70);
        ToyStore robot = new ToyStore(06, "Робот", 9, 69);


        addToListWithNewWeight(doll, 50);
        addToListWithNewWeight(car, 60);
        addToListWithNewWeight(plane, 65);
        addToListWithNewWeight(tractor, 70);
        addToListWithNewWeight(designer, 70);
        addToListWithNewWeight(robot, 69);

        System.out.println("Спсок всех игрушек в магазине: ");
        showNewList(allToys);

        System.out.print("Введите минимальный вес игрушки, для создания призового списка: ");
        Scanner m = new Scanner(System.in);
        int mass = m.nextInt();
        // список призовых игрушек
        List<ToyStore> addedWinners = selectToyStoreByMinWeight(allToys, mass);
        prizToys.addAll(addedWinners);

    // призовые игрушки
        System.out.println("призовой список: ");
        showNewList(prizToys);

    //выбираем призовую игрушку на выдачу из призового списка (пусть случайным образом)
    //    System.out.print("Выбирете призовую игрушку: ");
    //    Scanner choice = new Scanner(System.in);
        ToyStore choice = selectRandomToyStore(prizToys);
    //удаляем выданную игрушку из списка к выдаче
        prizToys.remove(choice);
        System.out.println("Призовая игрушка на выдачу: " + choice.info());

    // в текстовый файл
        Writer.writeToyStore(choice);
}

    private static List<ToyStore> selectToyStoreByMinWeight(ArrayList<ToyStore> allToys, int minWeight) {
        List<ToyStore> result = new ArrayList<>();
        for (ToyStore currentToyStore : allToys) {
            if (currentToyStore.getWeight() >= minWeight) {
                result.add(currentToyStore);
            }
        }
        return result;
    }

    private static ToyStore selectRandomToyStore(ArrayList<ToyStore> prizToys) {
        Random rand = new Random();
        int winnerElement = rand.nextInt(prizToys.size());
        return prizToys.get(winnerElement);
    }

    private static void addToListWithNewWeight(ToyStore newToyStore, int newWeight) {
        newToyStore.setWeight(newWeight);
        allToys.add(newToyStore);
    }

    private static void showNewList(ArrayList<ToyStore> myList) {
        int winListSize = myList.size();
        for (int i = 0; i < winListSize; i++) {
            System.out.println("" + i + ":" + myList.get(i).getName() + ", кол-во = " + myList.get(i).getQuantity()  +
                    ", вес = " + myList.get(i).getWeight());
        }
        System.out.println("");
    }
}
