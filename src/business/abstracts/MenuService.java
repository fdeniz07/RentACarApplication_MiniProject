package business.abstracts;

import core.helpers.Start;

import java.util.Scanner;

public abstract class MenuService {

    public abstract void search();

    public void getSelectionMenu() {


        int select;
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen kiralamak istediğiniz aracın markasını giriniz");
        System.out.println("1-Honda");
        System.out.println("2-Audi");
        System.out.println("3-BMW");
        System.out.println("0-Ana menü");
        select = inp.nextInt();

        switch (select) {
            case 1:
                //hondaMenuService.hondaMenu();
                break;
            case 2:
                // audiMenuService.audiMenu();
            case 3:
                //  bmwMenuService.bmwMenu();
            case 0:
                Start.start();

        }
    }

}
