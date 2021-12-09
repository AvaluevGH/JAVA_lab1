package com.company;

public class Potatoes implements Nutritious  {
    int  calories;
    String type;

    public Potatoes (String potatoesType, int potatoesCalories)
    {
        this.type=potatoesType;
        this.calories=potatoesCalories;
    }
    public void system_print(){
        System.out.println("Тип:"+ type+", калории: "+calories);

    }

    @Override
    public int calculateCalories() { return this.calories;}

}
