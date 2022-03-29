package com.company;

public class Student implements Pet,PaymentMethod,SocialMedia{
//DIP - Dependency inversion refers to the decoupling of software modules.
//This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.
    public static void main(String[] args) {
       //SRP

        name name = new name();
        roll roll = new roll();
        Student st = new Student();
        System.out.println(name.n());
        System.out.println(roll.r());
        System.out.println("\n\n");

        //OCP
        Facebook f = new Facebook();
        Instagram i = new Instagram();
        WhatsApp w = new WhatsApp();
        System.out.println(st.MediaName());
        System.out.println("Sttudent A " + f.MediaName());
        System.out.println("Sttudent B " + f.MediaName() + " and " + w.MediaName());
        System.out.println("Sttudent C " + i.MediaName());
        System.out.println("\n\n");


        //LSP
        mobileBanking m = new mobileBanking();
        Self s = new Self();
        System.out.println(st.MakePayment() + " " + st.GetNotification());
        System.out.println("Student A " + m.MakePayment() + m.GetNotification());
        System.out.println("\n");
        System.out.println("Student B " + s.MakePayment() + s.GetNotification());


        //ISP
        StudentA a = new StudentA();
        StudentB b = new StudentB();
        StudentC c = new StudentC();

        System.out.println(a.d() + b.fish() + c.d() + b.c() + a.fish() + b .d());
        System.out.println(st.pet());
    }

    @Override
    public String pet() {
        return "\nEvery student has a Snake as pet.";
    }

    @Override
    public String MakePayment() {
        return "Give Admission Fees.";
    }

    @Override
    public String GetNotification() {
        return "Waiting for the details.";
    }

    @Override
    public String MediaName() {
        return "Tell name of the media you are using.";
    }
}
