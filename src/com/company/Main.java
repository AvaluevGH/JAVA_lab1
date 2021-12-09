package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Potatoes potatoes1 = new Potatoes("Фри", 150);
        Potatoes potatoes2 = new Potatoes("Варенная", 80);
        Potatoes potatoes3 = new Potatoes("Жаренная", 100);
        potatoes1.system_print();
        potatoes2.system_print();
        potatoes3.system_print();
        Potatoes[] breakfast = new Potatoes[6];


        breakfast[0] = new Potatoes("Фри", 150  );
        breakfast[1] = new Potatoes("Варенная", 80);
        breakfast[2] = new Potatoes("Жаренная", 100);
        breakfast[3] = new Potatoes("Варенная", 50);
        breakfast[4] = new Potatoes("Фри", 150);
        breakfast[5] = new Potatoes("Фри", 200);

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (Potatoes potatoes : breakfast) {
            if (Objects.equals(potatoes.type, "Варенная")) {
                count1++;
            }
        }
        for (Potatoes potatoes : breakfast) {
            if (Objects.equals(potatoes.type, "Жаренная")) {
                count2++;
            }
        }
        for (Potatoes potatoes : breakfast) {
            if (Objects.equals(potatoes.type, "Фри")) {
                count3++;
            }
        }
        System.out.println("Завтрак состоит из "+ count1+" Варенной, "+count2+" Жаренной, "+count3+" Фри Картошки");
        int cal = 0;
        for (Potatoes potatoes : breakfast) {
            cal+=potatoes.calculateCalories();
        }
        System.out.println("Общее число калорий завтрака: " + cal);
    }
}
