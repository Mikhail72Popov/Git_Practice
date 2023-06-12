package org.example;
import org.example.ToyStore;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.example.Variab.FileName;

public class Writer {
    public static void writeToyStore(ToyStore winnerToyStore) {
        String result_string =
                 winnerToyStore.getId() + System.lineSeparator() +
                 winnerToyStore.getName() + System.lineSeparator() +
                 winnerToyStore.getQuantity() + System.lineSeparator() +
                 winnerToyStore.getWeight() + System.lineSeparator();


        try {
            File myTxt = new File(FileName);
            FileWriter fr = new FileWriter(myTxt);
            BufferedWriter br = new BufferedWriter(fr);

            br.write(result_string);
            br.close();
            fr.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
