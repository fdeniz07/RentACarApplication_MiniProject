package business.concretes;

import business.abstracts.CustomerService;
import core.helpers.Slow;
import core.validations.DateValidator;
import core.validations.DriverLicenceValidator;
import core.validations.NameValidator;
import core.validations.TcNoValidator;
import entities.concretes.Customers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManager extends CustomerService {


//Müsteri ile ilgili id, ad, soyad, dogum tarihi, ehliyet alis tarihi ve telefon bilgiler

    Customers customer = new Customers();

    public List<Customers> customersNewList = new ArrayList<>();

    public static int counter = 1000;

    //Validations
    NameValidator nameValidator = new NameValidator();
    TcNoValidator tcNoValidator = new TcNoValidator();
    DateValidator dateValidator = new DateValidator();
    DriverLicenceValidator driverLicenceValidator = new DriverLicenceValidator();

    ReservationManager reservationManager = new ReservationManager();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void register() {

        System.out.println("Müşteri kayıt bölümüne hoşgeldiniz !");
        System.out.println("====================================");

        System.out.println("Lütfen adınızı giriniz: ");
        customer.setFirstName(nameValidator.isValidFirstName());

        System.out.println("Lütfen soyadınızı giriniz: ");
        customer.setLastName(nameValidator.isValidLastName());

        System.out.println("Lütfen dogum tarihinizi giriniz: ");
        customer.setBirthDate(dateValidator.getValidDate());

        System.out.println("Lütfen ehliyetinizin verilis tarihinizi giriniz: ");
        customer.setDriverLicenceDate(dateValidator.getValidDate());

        System.out.println("Lütfen kimlik numaranızı giriniz: ");
        customer.setTcNo(tcNoValidator.getValidTcNumber());

        System.out.println("Kiralama icin bilgileriniz kontrol ediliyor");
        driverLicenceValidator.driverLicenceEligibility(customer.getBirthDate(), customer.getDriverLicenceDate());

        customer.setId(idMaker(customer.getTcNo()));

        counter++;

        System.out.println("Müsteri Başarıyla eklenmiştir...");

        System.out.println(customer);



        String s = "Rezervasyon onay bölümüne yönlendiriliyorsunuz...\n";
        Slow.slowPrint(s, 30);
        System.out.println();
        reservationManager.reservationConfirmation();
    }

    @Override
    public void addCustomerToNewList() {

    customersNewList.add(customer);

    }

    @Override
    public String idMaker(String number) {

        String suffix = "CUST";

        number = number.substring(number.length() - 3);

        return suffix + number + counter; //CUST1231000

    }





    //Id olustur (Markaninilkharfi + Modelin ilk karakteri + model yili + sayac) ++
    //Müsteri ile ilgili id, ad, soyad, dogum tarihi, ehliyet alis tarihi ve telefon bilgilerini gir ++
    //dogrulamlari kontrol et ++
    //animasyon ++
    //rezervasyon onayla kismina git ++


}
