package com.company.Students;

public class StudentB extends Students{

    public StudentB(int averageScore, int visitRating,String name){
        super(averageScore,visitRating,name);
    }

    @Override
    public void voidClassPresident() {
        voidClassPresident();
    }

    @Override
    public void doAHeadCount() {
        System.out.println("Kate");
    }

}
