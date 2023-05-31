package models;

import interfaces.JenyInterface;
import interfaces.BasicInterface;


public class jeny extends BasicData implements BasicInterface, JenyInterface {

    private String type;


    public String getType() {
        return this.type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String[] JenyData() {
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
