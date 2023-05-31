package models;

import interfaces.BasicInterface;
import interfaces.EuroInterface;


public class euro extends BasicData implements BasicInterface, EuroInterface {
    public String type;


    public String getType() {
        return this.type;
    }


    public void setType(String type) {
        this.type = type;
    }

    public String[] EuroData() {
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