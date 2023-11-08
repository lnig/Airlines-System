import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        LiniaLotnicza Linia = null;
        ArrayList<Lotnisko> listaLotnisk = null;
        ArrayList<Klient> listaKlientow = null;
        ArrayList<Samolot> listaSamolotow = null;
        ArrayList<Trasa> listaTras = null;
        ArrayList<Lot> listaLotow = null;

        int opcja;
        do {
            for (int i = 0; i < 10; i++) {
                System.out.println("\n");
            }


            if (Linia != null) {
                System.out.println("-----------------------------------------------------------\n" + "Linia lotnicza: " + Linia.getNazwa());
            }

            if (listaLotnisk != null) {
                if (!listaLotnisk.isEmpty()) {
                    System.out.println("-----------------------------------------------------------\n" + "Lotniska: ");
                    int i = 1;
                    for (Lotnisko lotnisko : listaLotnisk) {
                        System.out.println(i + " - " + lotnisko.toString());
                        i++;
                    }
                }
            }

            if (listaKlientow != null) {
                if (!listaKlientow.isEmpty()) {
                    System.out.println("-----------------------------------------------------------\n" + "Klienci: ");
                    int i = 1;
                    for (Klient klient : listaKlientow) {
                        System.out.println(i + " - " + klient.toString());
                        i++;
                    }
                }
            }

            if (listaSamolotow != null) {
                if (!listaSamolotow.isEmpty()) {
                    System.out.println("-----------------------------------------------------------\n" + "Samoloty: ");
                    int i = 1;
                    for (Samolot samolot : listaSamolotow) {
                        System.out.println(i + " - " + samolot.toString());
                        i++;
                    }
                }
            }

            if (listaTras != null) {
                if (!listaTras.isEmpty()) {
                    System.out.println("-----------------------------------------------------------\n" + "Trasy: ");
                    int i = 1;
                    for (Trasa trasa : listaTras) {
                        System.out.println(i + " - " + trasa.toString());
                        i++;
                    }
                }
            }

            if (listaLotow != null) {
                if (!listaLotow.isEmpty()) {
                    System.out.println("-----------------------------------------------------------\n" + "Loty: ");
                    int i = 1;
                    for (Lot l : listaLotow) {
                        System.out.println(i + " - " + l.toString());

                        if (!(listaLotow.size() == 1 || i == listaLotow.size())) {
                            System.out.println("-----------------------------------------------------------");
                        }
                        i++;
                    }
                }
            }

            System.out.println("---------------------------Menu----------------------------");

            System.out.println("""
                    1. Stworz Linie Lotnicza.\s
                    2. Dodaj lotnisko.
                    3. Usun lotnisko.
                    4. Dodaj klienta.
                    5. Usun klienta.
                    6. Dodaj samolot.
                    7. Usun samolot.
                    8. Dodaj Trase.
                    9. Usun Trase.
                    10. Dodaj lot.
                    11. Usun lot.
                    12. Dodaj Rezerwacje.
                    13. Usun Rezerwacje.
                    14. Zapisz dane do pliku.
                    15. Wczytaj dane z pliku
                    20. Zamknij program.""");

            System.out.print("-----------------------------------------------------------\n" +
                    "Podaj Opcje: ");

            Scanner opcjaSkaner = new Scanner(System.in);

            opcja = opcjaSkaner.nextInt();

            System.out.print("-----------------------------------------------------------\n");

            switch (opcja) {

//tworzenie linii lotniczej v
                case 1 -> {
                    Scanner skaner = new Scanner(System.in);
                    System.out.print("Podaj Nazwe Linii Lotniczej: ");
                    String nazwaLinii = skaner.nextLine();
                    Linia = new LiniaLotnicza(nazwaLinii);
                }
//dodawanie lotniska v
                case 2 -> {
                    if (listaLotnisk == null) {
                        listaLotnisk = new ArrayList<>();
                    }

                    Scanner skaner = new Scanner(System.in);
                    System.out.print("Podaj Nazwe Lotniska: ");
                    String nazwa = skaner.nextLine();
                    System.out.print("Podaj Miasto, w ktorym znajduje sie Lotnisko: ");
                    String miasto = skaner.nextLine();
                    System.out.print("Podaj Kraj, w ktorym znajduje sie Lotnisko: ");
                    String kraj = skaner.nextLine();
                    System.out.print("Podaj Wspolrzedne Lotniska: ");
                    double wspolX = skaner.nextDouble();
                    double wspolY = skaner.nextDouble();
                    listaLotnisk.add((new Lotnisko(kraj, miasto, nazwa, wspolX, wspolY)));
                }
//usuwanie lotniska v
                case 3 -> {
                    if (listaLotnisk != null) {
                        Scanner skaner = new Scanner(System.in);
                        System.out.print("Podaj Nazwe Lotniska: ");
                        String nazwa = skaner.nextLine();
                        System.out.print("Podaj Miasto, w ktorym znajduje sie Lotnisko: ");
                        String miasto = skaner.nextLine();
                        System.out.print("Podaj Kraj, w ktorym znajduje sie Lotnisko: ");
                        String kraj = skaner.nextLine();
                        System.out.print("Podaj Wspolrzedne Lotniska: ");
                        double wspolX = skaner.nextDouble();
                        double wspolY = skaner.nextDouble();

                        Lotnisko lotnisko = new Lotnisko(kraj, miasto, nazwa, wspolX, wspolY);

                        Iterator<Lotnisko> lotniskoIterator = listaLotnisk.iterator();

                        while (lotniskoIterator.hasNext()) {
                            Lotnisko lotniskoPorown = lotniskoIterator.next();
                            if (lotniskoPorown.getX() == lotnisko.getX() && lotniskoPorown.getY() == lotnisko.getY()
                                    && lotniskoPorown.getMiasto().equals(lotnisko.getMiasto())
                                    && lotniskoPorown.getNazwa().equals(lotnisko.getNazwa())
                                    && lotniskoPorown.getKraj().equals(lotnisko.getKraj())) {
                                lotniskoIterator.remove();
                            }
                        }
                    } else {
                        System.out.println("Nie masz zadnego lotniska w Linii");
                        Thread.sleep(2000);
                    }
                }

//dodawanie klienta v
                case 4 -> {
                    if (listaKlientow == null) {
                        listaKlientow = new ArrayList<>();
                    }

                    System.out.println("""
                            1 - Zwykly Klient.\s
                            2 - Indywidualny Klient.
                            3 - Posrednik Klient.""");
                    System.out.print("-----------------------------------------------------------\n");
                    System.out.print("Podaj opcje: ");

                    Scanner skaner = new Scanner(System.in);
                    int opcja1 = skaner.nextInt();
                    System.out.print("-----------------------------------------------------------\n");

                    switch (opcja1) {

                        //zwykly klient
                        case 1 -> {
                            System.out.print("Podaj Imie: ");
                            String imie = skaner.next();
                            System.out.print("Podaj Nazwisko: ");
                            String nazwisko = skaner.next();
                            System.out.print("Podaj Pesel: ");
                            String Pesel = skaner.next();

                            listaKlientow.add(new Klient(imie, nazwisko, Pesel));
                        }
                        //indywidualny
                        case 2 -> {
                            System.out.print("Podaj Imie: ");
                            String imie = skaner.next();
                            System.out.print("Podaj Nazwisko: ");
                            String nazwisko = skaner.next();
                            System.out.print("Podaj Wiek: ");
                            int wiek = skaner.nextInt();
                            System.out.print("Podaj Plec: ");
                            String plec = skaner.next();
                            System.out.print("Podaj Pesel: ");
                            String Pesel = skaner.next();

                            listaKlientow.add(new KlientIndywidualny(imie, nazwisko, Pesel, wiek, plec));
                        }
                        //posrednik
                        case 3 -> {
                            System.out.print("Podaj Imie: ");
                            String imie = skaner.next();
                            System.out.print("Podaj Nazwisko: ");
                            String nazwisko = skaner.next();
                            System.out.print("Podaj Nazwe Firmy: ");
                            String nazwafirmy = skaner.next();
                            System.out.print("Podaj NIP: ");
                            String NIP = skaner.next();
                            System.out.print("Podaj Pesel: ");
                            String Pesel = skaner.next();
                            listaKlientow.add(new KlientPosrednik(imie, nazwisko, Pesel, nazwafirmy, NIP));
                        }
                    }
                }
//usuwanie klienta
                case 5 -> {
                    if (listaKlientow != null) {
                        Scanner skaner = new Scanner(System.in);
                        System.out.print("Podaj Imie: ");
                        String imie = skaner.next();
                        System.out.print("Podaj Nazwisko: ");
                        String nazwisko = skaner.next();
                        System.out.print("Podaj Pesel: ");
                        String Pesel = skaner.next();

                        Klient klient = new Klient(imie, nazwisko, Pesel);


                        Iterator<Klient> klientIterator = listaKlientow.iterator();

                        //przeszukujemy liste klientow w celu usuniecia klienta
                        while (klientIterator.hasNext()) {
                            Klient klientPorown = klientIterator.next();
                            if (klient.getImie().equals(klientPorown.getImie())
                                    && klient.getNazwisko().equals(klientPorown.getNazwisko())
                                    && klient.getPesel().equals(klientPorown.getPesel())) {
                                klientIterator.remove();
                            }
                        }
                    } else {
                        System.out.println("Linia nie posiada zadnego klienta");
                        Thread.sleep(2000);
                    }

                }
//dodawanie samolotu
                case 6 -> {
                    if (listaSamolotow == null) {
                        listaSamolotow = new ArrayList<>();
                    }

                    Scanner skaner = new Scanner(System.in);
                    System.out.print("Podaj Zasieg: ");
                    int zasieg = skaner.nextInt();
                    System.out.print("Podaj Liczbe Miejsc: ");
                    int liczbamiejsc = skaner.nextInt();
                    System.out.print("Podaj ID: ");
                    int ID = skaner.nextInt();

                    listaSamolotow.add(new Samolot(zasieg, liczbamiejsc, ID));
                }
//usuwanie samolotu
                case 7 -> {
                    if (listaSamolotow != null) {
                        Scanner skaner = new Scanner(System.in);
                        System.out.print("Podaj Zasieg: ");
                        int zasieg = skaner.nextInt();
                        System.out.print("Podaj Liczbe Miejsc: ");
                        int liczbamiejsc = skaner.nextInt();
                        System.out.print("Podaj ID: ");
                        int ID = skaner.nextInt();

                        Samolot samolot = new Samolot(zasieg, liczbamiejsc, ID);


                        Iterator<Samolot> samolotIterator = listaSamolotow.iterator();

                        //przeszukujemy liste samolotow w celu usuniecia
                        while (samolotIterator.hasNext()) {
                            Samolot samolotPorown = samolotIterator.next();
                            if (samolotPorown.getID() == samolot.getID()
                                    && samolotPorown.getID() == samolot.getID()
                                    && samolotPorown.getLiczbaMiejsc() == samolot.getLiczbaMiejsc()) {
                                samolotIterator.remove();
                            }
                        }
                    } else {
                        System.out.println("Nie masz zadnego samolotu w Linii");
                        Thread.sleep(2000);
                    }
                }
//dodawanie trasy
                case 8 -> {
                    if (listaTras == null) {
                        listaTras = new ArrayList<>();
                    }
                    if (listaLotnisk != null) {
                        if (listaLotnisk.size() > 1) {
                            Scanner skaner = new Scanner(System.in);
                            System.out.print("Podaj Nazwe: ");
                            String nazwa = skaner.next();
                            System.out.print("Podaj numery dwoch lotnisk: ");
                            int numLotniskoA = skaner.nextInt();
                            int numLotniskoB = skaner.nextInt();
                            int i = 0;
                            Lotnisko lotniskoA = null;
                            Lotnisko lotniskoB = null;

                            for (Lotnisko lotnisko : listaLotnisk) {
                                if (i + 1 == numLotniskoA)
                                    lotniskoA = new Lotnisko(lotnisko);
                                if (i + 1 == numLotniskoB)
                                    lotniskoB = new Lotnisko(lotnisko);
                                i++;
                            }


                            System.out.print("Podaj ID Trasy: ");
                            int ID = skaner.nextInt();

                            if (lotniskoA != null && lotniskoB != null) {
                                listaTras.add(new Trasa(nazwa, ID, lotniskoA, lotniskoB));
                            }
                        } else {
                            System.out.println("Masz za malo lotnisk aby utworzyc trase");
                            Thread.sleep(2000);
                        }
                    } else {
                        System.out.println("Masz za malo lotnisk aby utworzyc trase");
                        Thread.sleep(2000);
                    }
                }
//usuwanie trasy
                case 9 -> {
                    if (listaTras != null) {
                        Scanner skaner = new Scanner(System.in);
                        System.out.print("Podaj Nazwe: ");
                        String nazwa = skaner.next();
                        System.out.print("Podaj ID: ");
                        int ID = skaner.nextInt();


                        Iterator<Trasa> trasaIterator = listaTras.iterator();

                        while (trasaIterator.hasNext()) {
                            Trasa trasaPorown = trasaIterator.next();
                            if (trasaPorown.getNazwaTrasy().equals(nazwa) && trasaPorown.getID() == ID)
                                trasaIterator.remove();
                        }
                    } else {
                        System.out.println("Linia nie posiada zadnej trasy");
                        Thread.sleep(2000);
                    }
                }
//dodawanie lotu
                case 10 -> {
                    if (listaLotow == null) {
                        listaLotow = new ArrayList<>();
                    }
                    if (listaTras != null && listaSamolotow != null) {
                        Scanner skaner = new Scanner(System.in);
                        System.out.print("Podaj Rodzaj lotu: ");
                        String rodzaj = skaner.next();
                        System.out.print("Podaj Czas lotu: ");
                        int czasLotu = skaner.nextInt();
                        System.out.print("Podaj Numer Trasy: ");
                        int numTrasy = skaner.nextInt();

                        int i = 0;
                        Trasa trasa = null;

                        for (Trasa t : listaTras) {
                            if (i + 1 == numTrasy)
                                trasa = new Trasa(t);
                            i++;
                        }

                        System.out.print("Podaj Numer Samolotu: ");
                        int numSamolotu = skaner.nextInt();

                        i = 0;
                        Samolot samolot = null;

                        for (Samolot samolot1 : listaSamolotow) {
                            if (i + 1 == numSamolotu)
                                samolot = new Samolot(samolot1);
                            i++;
                        }

                        ArrayList<Klient> klienci = new ArrayList<>();

                        listaLotow.add(new Lot(rodzaj, czasLotu, trasa, samolot, klienci));
                    } else {
                        System.out.println("Linia nie posiada zadnej trasy lub samolotu");
                        Thread.sleep(2000);
                    }
                }
//usuwanie lotu
                case 11 -> {
                    if (listaLotow != null) {
                        Scanner skaner = new Scanner(System.in);
                        System.out.print("Podaj Numer lotu: ");
                        int ID = skaner.nextInt();

                        listaLotow.remove(ID - 1);
                    } else {
                        System.out.println("Linia nie posiada lotow");
                        Thread.sleep(2000);
                    }
                }
//dodawanie rezerwacji
                case 12 -> {
                    if (listaLotow != null && listaKlientow != null) {
                        Scanner skaner = new Scanner(System.in);
                        System.out.print("Podaj Numer lotu: ");
                        int numLotu = skaner.nextInt();
                        System.out.print("Podaj Numer klienta: ");
                        int numKlienta = skaner.nextInt();

                        int i = 0;
                        Klient klient = null;

                        for (Klient k : listaKlientow) {
                            if (i + 1 == numKlienta) {
                                klient = k;
                            }
                            i++;
                        }

                        i = 0;


                        for (Lot l : listaLotow) {
                            if (i + 1 == numLotu) {
                                l.dodajKlienta(klient);
                            }
                            i++;
                        }
                    } else {
                        System.out.println("Nie masz klientow lub lotow");
                        Thread.sleep(2000);
                    }
                }
//usuwanie rezereewacji
                case 13 -> {
                    if (listaLotow != null && listaKlientow != null) {
                        Scanner skaner = new Scanner(System.in);
                        System.out.print("Podaj Numer lotu: ");
                        int numLotu = skaner.nextInt();
                        System.out.print("Podaj Numer klienta: ");
                        int numKlienta = skaner.nextInt();

                        int i = 1;


                        for (Lot l : listaLotow) {
                            if (i == numLotu) {
                                l.usunKlienta(numKlienta);
                            }
                            i++;
                        }
                    } else {
                        System.out.println("Nie masz lotow lub klientow");
                        Thread.sleep(2000);
                    }
                }
//zapisywanie w pliku
                case 14 -> {
                    PrintWriter klienciIndPw = new PrintWriter(new FileOutputStream("klienciInd.txt"));
                    PrintWriter klienciPosPw = new PrintWriter(new FileOutputStream("klienciPos.txt"));
                    PrintWriter klienciZw = new PrintWriter(new FileOutputStream("klienciZw.txt"));
                    if (listaKlientow != null) {
                        for (Klient klient : listaKlientow) {
                            if (klient instanceof KlientIndywidualny) {
                                klienciIndPw.println(klient.getImie() + " " + klient.getNazwisko() + " " + klient.getPesel() + " " +
                                        ((KlientIndywidualny) klient).getWiek() + " " + ((KlientIndywidualny) klient).getPlec());
                            } else if (klient instanceof KlientPosrednik) {
                                klienciPosPw.println(klient.getImie() + " " + klient.getNazwisko() + " " + klient.getPesel() + " " +
                                        ((KlientPosrednik) klient).getNazwaFirmy() + " " + ((KlientPosrednik) klient).getNIP());
                            } else if (klient != null) {
                                klienciZw.println(klient.getImie() + " " + klient.getNazwisko() + " " + klient.getPesel());
                            }
                        }
                    }

                    PrintWriter lotniskaPw = new PrintWriter(new FileOutputStream("lotniska.txt"));
                    if (listaLotnisk != null) {
                        for (Lotnisko lotnisko : listaLotnisk) {
                            lotniskaPw.println(lotnisko.getKraj() + " " + lotnisko.getMiasto() + " " +
                                    lotnisko.getNazwa() + " " + lotnisko.getX() + " " + lotnisko.getY());
                        }
                    }
                    PrintWriter samolotyPw = new PrintWriter(new FileOutputStream("samoloty.txt"));
                    if (listaSamolotow != null) {
                        for (Samolot samolot : listaSamolotow) {
                            samolotyPw.println(samolot.getZasieg() + " " + samolot.getLiczbaMiejsc() + " " + samolot.getID());
                        }
                    }
                    PrintWriter trasyPw = new PrintWriter(new FileOutputStream("trasy.txt"));
                    if (listaTras != null) {
                        for (Trasa trasa : listaTras) {
                            trasyPw.println(trasa.getNazwaTrasy() + " " + trasa.getID() + " " + trasa.getL1().getKraj() + " " +
                                    trasa.getL1().getMiasto() + " " + trasa.getL1().getNazwa() + " " + trasa.getL1().getX() +
                                    " " + trasa.getL1().getY() + " " + trasa.getL2().getKraj() + " " +
                                    trasa.getL2().getMiasto() + " " + trasa.getL2().getNazwa() + " " + trasa.getL2().getX() + " " +
                                    trasa.getL2().getY());
                        }
                    }
                    PrintWriter lotyPw = new PrintWriter(new FileOutputStream("loty.txt"));
                    if (listaLotow != null) {
                        for (Lot lot : listaLotow) {
                            ArrayList<Klient> k = lot.getKlienci();
                            StringBuilder s = new StringBuilder();
                            s.append("\n");
                            for (Klient klient : k) {
                                if (klient instanceof KlientIndywidualny) {
                                    s.append("Indywidualny ").append(klient.getImie() + " " + klient.getNazwisko() + " " + klient.getPesel() + " " + ((KlientIndywidualny) klient).getWiek() +
                                            " " + ((KlientIndywidualny) klient).getPlec() + "\n");
                                } else if (klient instanceof KlientPosrednik) {
                                    s.append("Posrednik ").append(klient.getImie() + " " + klient.getNazwisko() + " " + klient.getPesel() +
                                            " " + ((KlientPosrednik) klient).getNIP() + " " + ((KlientPosrednik) klient).getNazwaFirmy() + "\n");
                                } else {
                                    s.append("Zwykly " + klient.getImie() + " " + klient.getNazwisko() + " " + klient.getPesel() + "\n");
                                }
                            }

                            lotyPw.println("LOT: " + lot.getRodzaj() + " " + lot.getCzas() + " " + lot.getTrasa().getNazwaTrasy() + " " + lot.getTrasa().getID() + " " +
                                    lot.getTrasa().getL1().getKraj() + " " + lot.getTrasa().getL1().getMiasto() + " " + lot.getTrasa().getL1().getNazwa() + " " +
                                    lot.getTrasa().getL1().getX() + " " + lot.getTrasa().getL1().getY() + " " + lot.getTrasa().getL2().getKraj() + " " +
                                    lot.getTrasa().getL2().getMiasto() + " " + lot.getTrasa().getL2().getNazwa() + " " + lot.getTrasa().getL2().getX() + " " +
                                    lot.getTrasa().getL2().getY() + " " + lot.getSamolot().getZasieg() + " " + lot.getSamolot().getLiczbaMiejsc() + " " +
                                    lot.getSamolot().getID() + " " + s.toString());

                        }
                    }
                    lotyPw.close();
                    lotniskaPw.close();
                    samolotyPw.close();
                    trasyPw.close();
                    klienciIndPw.close();
                    klienciPosPw.close();
                    klienciZw.close();

                }
//wczytywanie z pliku
                case 15 -> {

                    Scanner klienciZwSkaner = new Scanner(new File("klienciZw.txt"));
                    while (klienciZwSkaner.hasNext()) {
                        if (listaKlientow == null) {
                            listaKlientow = new ArrayList<>();
                        }
                        listaKlientow.add(new Klient(klienciZwSkaner.next(), klienciZwSkaner.next(), klienciZwSkaner.next()));
                    }

                    Scanner klienciIndSkaner = new Scanner(new File("klienciInd.txt"));
                    while (klienciIndSkaner.hasNext()) {
                        if (listaKlientow == null) {
                            listaKlientow = new ArrayList<>();
                        }
                        listaKlientow.add(new KlientIndywidualny(klienciIndSkaner.next(), klienciIndSkaner.next(), klienciIndSkaner.next(),
                                Integer.parseInt(klienciIndSkaner.next()), klienciIndSkaner.next()));
                    }
                    Scanner klienciPosSkaner = new Scanner(new File("klienciPos.txt"));
                    while (klienciPosSkaner.hasNext()) {
                        if (listaKlientow == null) {
                            listaKlientow = new ArrayList<>();
                        }
                        listaKlientow.add(new KlientPosrednik(klienciPosSkaner.next(), klienciPosSkaner.next(), klienciPosSkaner.next(),
                                klienciPosSkaner.next(), klienciPosSkaner.next()));
                    }


                    Scanner samolotySkaner = new Scanner(new File("samoloty.txt"));
                    while (samolotySkaner.hasNext()) {
                        if (listaSamolotow == null) {
                            listaSamolotow = new ArrayList<>();
                        }
                        listaSamolotow.add(new Samolot(Double.parseDouble(samolotySkaner.next()), Integer.parseInt(samolotySkaner.next()),
                                Integer.parseInt(samolotySkaner.next())));
                    }
                    Scanner lotniskaSkaner = new Scanner(new File("lotniska.txt"));
                    while (lotniskaSkaner.hasNext()) {
                        if (listaLotnisk == null) {
                            listaLotnisk = new ArrayList<>();
                        }
                        listaLotnisk.add(new Lotnisko(lotniskaSkaner.next(), lotniskaSkaner.next(), lotniskaSkaner.next(),
                                Double.parseDouble(lotniskaSkaner.next()), Double.parseDouble(lotniskaSkaner.next())));
                    }

                    Scanner trasySkaner = new Scanner(new File("trasy.txt"));
                    while (trasySkaner.hasNext()) {
                        if (listaTras == null) {
                            listaTras = new ArrayList<>();
                        }
                        listaTras.add(new Trasa(trasySkaner.next(), Integer.parseInt(trasySkaner.next()),
                                new Lotnisko(trasySkaner.next(), trasySkaner.next(), trasySkaner.next(), Double.parseDouble(trasySkaner.next()),
                                        Double.parseDouble(trasySkaner.next())), new Lotnisko(trasySkaner.next(), trasySkaner.next(), trasySkaner.next(),
                                Double.parseDouble(trasySkaner.next()), Double.parseDouble(trasySkaner.next()))));
                    }


                    Scanner lotySkaner = new Scanner(new File("loty.txt"));

                    while (lotySkaner.hasNext()) {
                        if (listaLotow == null) {
                            listaLotow = new ArrayList<>();
                            lotySkaner.next();
                        }

                        ArrayList<Klient> klienci = new ArrayList<>();

                        String rodzaj = lotySkaner.next();
                        int czas = Integer.parseInt(lotySkaner.next());
                        Trasa trasa = new Trasa(lotySkaner.next(), Integer.parseInt(lotySkaner.next()),
                                new Lotnisko(lotySkaner.next(), lotySkaner.next(), lotySkaner.next(), Double.parseDouble(lotySkaner.next()),
                                        Double.parseDouble(lotySkaner.next())), new Lotnisko(lotySkaner.next(), lotySkaner.next(), lotySkaner.next(), Double.parseDouble(lotySkaner.next()), Double.parseDouble(lotySkaner.next())));
                        Samolot samolot = new Samolot(Double.parseDouble(lotySkaner.next()),
                                Integer.parseInt(lotySkaner.next()), Integer.parseInt(lotySkaner.next()));


                        String x;
                        if (lotySkaner.hasNext()) {
                            x = lotySkaner.next();

                            while (x.equals("Zwykly") || x.equals("Indywidualny") || x.equals("Posrednik")) {
                                if (x.equals("Zwykly")) {
                                    Klient k = new Klient(lotySkaner.next(), lotySkaner.next(), lotySkaner.next());
                                    klienci.add(k);
                                    System.out.println(k.toString());
                                } else if (x.equals("Indywidualny")) {
                                    KlientIndywidualny k = new KlientIndywidualny(lotySkaner.next(), lotySkaner.next(), lotySkaner.next(), Integer.parseInt(lotySkaner.next()), lotySkaner.next());
                                    klienci.add(k);
                                    System.out.println(k.toString());
                                } else if (x.equals("Posrednik")) {
                                    KlientPosrednik k = new KlientPosrednik(lotySkaner.next(), lotySkaner.next(), lotySkaner.next(), lotySkaner.next(), lotySkaner.next());
                                    klienci.add(k);
                                    System.out.println(k.toString());
                                }

                                if (lotySkaner.hasNext()) {
                                    x = lotySkaner.next();
                                    System.out.println(x);
                                } else {
                                    break;
                                }


                            }
                        }


                        Lot l = new Lot(rodzaj, czas, trasa, samolot, klienci);

                        listaLotow.add(l);
                    }
                }
//koniec
                case 20 -> opcja = 0;
            }

        } while (opcja != 0);
    }
}