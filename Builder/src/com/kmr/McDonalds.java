package com.kmr;

import java.util.ArrayList;
import java.util.List;

public class  McDonalds implements IHamburgerBuilder {

    private List<String> robot;
    public McDonalds() {
        this.robot = new ArrayList<>();
    }

    public void buildCompanyName() {
        robot.add("McDonalds");
    }
    public void buildSampyla() {
        robot.add("Sämpylä");
    }

    public void buildLiha() {
        robot.add("Naudanlihapihvi");
    }
    public void buildJuusto() {
        robot.add("Mauste juustoa");
    }
    public void buildSalaatti() {
        robot.add("Tuoretta rouskuvaa jäävuorisalaattia");
    }
    public Object getHampurilainen() {
        return this.robot;
    }

}
