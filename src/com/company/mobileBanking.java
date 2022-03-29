package com.company;

public class mobileBanking implements PaymentMethod{
    //LSP - Derived classes must be completely substitutable for their base classes.
    @Override
    public String MakePayment() {
        return "Used Mobile Banking to pay.";
    }

    @Override
    public String GetNotification() {
        return "\nAdmission Fees Paid using Mobile Banking.";
    }
}
