package oops.abstraction;

import oops.abstraction.interfaceDemo.SeasonService;
import oops.abstraction.interfaceDemo.SeasonServiceImpl;

public class InterfaceDemo {
    public static void main(String[] args) {
        SeasonService seasonService = new SeasonServiceImpl();
        seasonService.printSeasonDetails();
    }
}
