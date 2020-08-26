package testio;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader;
        String userPath = System.getProperty("user.home");


        try(FileWriter fileWriter = new FileWriter(userPath+"/test.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter))
        {
            printWriter.println("Hi");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            reader = new BufferedReader(new FileReader(userPath+"/data.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
