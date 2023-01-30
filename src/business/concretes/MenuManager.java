package business.concretes;

import application.console.concretes.Start;
import business.abstracts.MenuService;

import java.util.Scanner;

public class MenuManager extends MenuService {


    @Override
    public void getSelectionMenu() {

        HondaMenuManager hondaMenuManager = new HondaMenuManager();
        AudiMenuManager audiMenuManager = new AudiMenuManager();
        BmwMenuManager bmwMenuManager = new BmwMenuManager();

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
                hondaMenuManager.hondaMenu();
                break;
            case 2:
                audiMenuManager.audiMenu();
            case 3:
                bmwMenuManager.bmwMenu();
            case 0:
                Start.start();
        }
    }

    @Override
    public void search() {

    }

    @Override
    public void addCarsNewList() {


    }

}
