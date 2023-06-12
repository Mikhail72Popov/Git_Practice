package org.example;
import org.example.Variab;
import org.example.ToyStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import static org.example.Variab.allToys;
/*
public class Prizes {

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

}
*/