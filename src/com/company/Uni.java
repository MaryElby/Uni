package com.company;

import java.util.List;

public class Uni {

    public static void main(String[] args){
//        new Student().whenDoIStudy();
//        new DegreeApprentice().whenDoIStudy();
//        new UnderGrad().whenDoIStudy();
//        new PartTime().whenDoIStudy();

        UnderGrad ug= new UnderGrad();
        DegreeApprentice da=new DegreeApprentice();
        PartTime pt = new PartTime();

        List<Student> students = List.of(ug,da,pt);

        for (Student theStudent: students){
            theStudent.whenDoIStudy();
        }

    }
}
