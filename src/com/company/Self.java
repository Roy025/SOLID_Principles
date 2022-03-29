package com.company;

public class Self implements PaymentMethod{
    //LSP - Derived classes must be completely substitutable for their base classes.
    @Override
    public String MakePayment() {
        return "Went to bank and paid";
    }

    @Override
    public String GetNotification() {
        //return null;
        return "\nAdmission Fees Paid in the Bank.";
    }
}
