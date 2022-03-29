package com.company;

public class StudentB implements Dog, Cat, Fish{
    //ISP - Clients should not be forced to depend upon interfaces that they do not use.
    @Override
    public String c() {
        return "\nStudent B has a Cat. ";
    }

    @Override
    public String d() {
        return "\nStudent B has a Dog. ";
    }

    @Override
    public String fish() {
        return "\nStudent B has Fish as pet.";
    }
}
