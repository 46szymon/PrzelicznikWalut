package models;

import interfaces.FuntyInterface;
import interfaces.BasicInterface;


public class funty extends BasicData implements BasicInterface, FuntyInterface {

    private String type;


    public String getType() {
        return this.type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String[] FuntyData() {
        return new String[]{
                "waluta wynikowa: " + this.getType(),
                "ilość przeliczanej waluty: " + this.getAmount(),

        };
    }


    @Override
    public void welcome(String opt) {
        System.out.println(HELLO + opt);
    }
}
