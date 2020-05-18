package hu.hibernate;

import oracle.net.ns.Message;

import java.util.ArrayList;

class product {



    private String naam;
    private double prijs;

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public product(String msg,double prijs) {
        this.prijs=prijs;
        this.naam = msg;
    }

    public String getMsg() {
        return naam;
    }

    public void setMsg(String msg) {
        this.naam = msg;
    }
    public String getMessage() {
        return this.naam;
    }

    public void setMessage(String message) {
        this.naam = naam;
    }
    public void updatemsg(Message message){}
    public void deletemsg(){}
    public ArrayList<product> readallmsg(){
        return null;
    }





}
