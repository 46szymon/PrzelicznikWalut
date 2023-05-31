package models;

import interfaces.DolaryInterface;
import interfaces.BasicInterface;


public class dolary extends BasicData implements BasicInterface, DolaryInterface {

    private String type;


    public String getType() {
        return this.type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String[] DolaryData() {
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
