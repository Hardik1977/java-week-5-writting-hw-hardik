package week5_homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Programme_6_RetrieveArraylistAtGivenIndex {

    public static void main(String[] args) {

        ArrayList<String> vegetablelist = new ArrayList<>();
        vegetablelist.add("Cucumber");
        vegetablelist.add("Potato");
        vegetablelist.add("Cauliflower");
        vegetablelist.add("Bringle");
        vegetablelist.add("Onion");
        vegetablelist.add("Beetroot");
        vegetablelist.add("Mushroom");
        vegetablelist.add("Bitter_Gourd");
        System.out.println("vegitablelist");
        Scanner scanner = new Scanner((System.in));
        System.out.println("Please enter an Index number :");
        int index = scanner.nextInt();
        if (index < vegetablelist.size()) {
            System.out.println(vegetablelist.get(index));
        } else {
            System.out.println("invalid index!!");
        }
        scanner.close();

    }


}
