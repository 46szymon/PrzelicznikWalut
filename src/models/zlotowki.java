package models;

import interfaces.ZlotowkiInterface;
import interfaces.BasicInterface;


public class zlotowki extends BasicData implements BasicInterface, ZlotowkiInterface {

    private String type;


    public String getType() {
        return this.type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String[] ZlotowkiData() {
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
