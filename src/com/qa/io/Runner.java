package com.qa.io;

import java.io.*;
import java.util.Arrays;

public class Runner {


    public static void main(String[] args) {
        String[] names = {"JH", "Piers", "Morgan", "Nick"};

        File file = new File("./names.txt");

        if (!file.exists()) {
            try (FileOutputStream fos = new FileOutputStream(file);) {
                for (String name : names) {
                    byte[] bytes = name.getBytes();
                    System.out.println(Arrays.toString(bytes));
                    fos.write(bytes);                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

//
//        if (!file.exists()) {
//            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));) {
//                for (String name : names) {
//                    bw.write(name);
//                }
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }

        if (!file.exists()) {
            try (PrintWriter pw = new PrintWriter(new FileOutputStream(file))) {
                for (String name : names) {
                    pw.println(name);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            String line = null;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }

            // function (String line) { sout(line); }
            br.lines().forEach(line -> System.out.println(line));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
