import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    ArrayList <Admin> admins = new ArrayList<>();

    ArrayList<Inhab> inhabs = new ArrayList<>();


    public void programm()  throws IOException{


        int a = 3;
        int b = 2;
        int c = 1;


        Admin A1 = new Admin("Andriy", "Black sea", "Black sea Street", "andre", "mostwonted", 95556770L, 1);
        Admin A2 = new Admin("Volodymyr", "Black sea", "Black sea Street", "vov4ik137", "qwerty", 9689235L, 2);
        Admin A3 = new Admin("Eugeniy", "Black sea", "Black sea Street", "evgesha81", "qwertyyyyy", 98457256L, 3);


        this.admins.add(A1);
        this.admins.add(A2);
        this.admins.add(A3);
        this.admins.size();


        Inhab I1 = new Inhab("Olexiy", "Kirieshkino Street", "toiletCliner" , "namotaiNaYs", 94756274L, 15, c ,2);
        Inhab I2 = new Inhab("Daniil", "Salevarov Street", "Daniil", "09876543", 96748573L, 22, b,5);
        Inhab I3 = new Inhab("Stepan", "Stepana Bandery Street", "Stepan", "95738693", 95738693L, 34, a,3);
        Inhab I4 = new Inhab("Andriy", "Grigorevskiy Landing Street", "andrushaTop", "1234567",98365920L, 35, a,5);
        Inhab I5 = new Inhab("Ilya", "Balta Street", "Batika9", "12345678765432", 95539563L, 32, a,7);
        Inhab I6 = new Inhab("Eugeniy", "Kooznecka Street", "Eugeniy", "99365830", 99365830L, 24, b,9);
        Inhab I7 = new Inhab("Pavlo", "Peremogi Avanue", "Pavlo", "xkkdxk", 97264836L, 11, c,3);
        Inhab I8 = new Inhab("Mykola", "Variantiv Street", "Mykola", "23", 98294659L, 12, c,6);
        Inhab I9 = new Inhab("Kokgjoo", "NVR C Block Rd", "Kokgjoo", "KOOKOO", 95826593L, 14, c,7);


        this.inhabs.add(I1);
        this.inhabs.add(I2);
        this.inhabs.add(I3);
        this.inhabs.add(I4);
        this.inhabs.add(I5);
        this.inhabs.add(I6);
        this.inhabs.add(I7);
        this.inhabs.add(I8);
        this.inhabs.add(I9);
        this.inhabs.size();


        Scanner sc = new Scanner(System.in);

        String scanner;

        System.out.println("1. Кількість адміністраторів");
        System.out.println("2. Кількість мешканців");
        System.out.println("3. Кількість типів зайнятих номерів");
        System.out.println("4. Список мешканців номерів вказаного типу");
        System.out.println("5. Найбільший термін проживання");
        System.out.println("6. Тип номеру, який має найбільший попит");


        do {
            System.out.println("Оберіть завдання або 'q' для виходу");
            scanner = sc.nextLine();
            if(scanner.equals("1")){
                System.out.println("Зараз у готелі: " + admins.size() + " адміністратори");
            }


            else if(scanner.equals("2")){
                System.out.println("Зараз у готелі: " + inhabs.size() + " мешканців");
            }


            else if(scanner.equals("3")){
                BufferedReader br = null;
                try{
                    File file = new File("Text.txt");

                    if (!file.exists())
                        file.createNewFile();

                    br = new BufferedReader(new FileReader("Text.txt"));
                    String line;
                    while ((line = br.readLine()) != null){
                        System.out.println(line);
                    }
                }catch (FileNotFoundException e){
                    System.out.println("Error" + e);
                    e.printStackTrace();
                } finally {
                    try {
                        br.close();
                    }catch (IOException e){
                        System.out.println("Error: " + e);
                    }
                }
            }

            else if(scanner.equals("4")){

                String choice;
                boolean goNext = true;
                do {
                    System.out.println("Оберить тип кімнати ('a' для економа, 'b' для стандартного, 'c' для люксу): ");
                    choice = sc.nextLine();
                    switch (choice){
                        case "a":
                            writeInhababc(a);
                            goNext = false;
                            break;

                        case "b":
                            writeInhababc(b);
                            goNext = false;
                            break;

                        case "c":
                            writeInhababc(c);
                            goNext = false;
                            break;

                        default:
                            System.out.println("Оберить тип кімнати: ");
                            break;
                    }
                } while (goNext);
            }


            else if(scanner.equals("5")){

                Integer max = 0;

                for (Inhab inhabs : this.inhabs) {
                    Integer residPeriod = inhabs.residPeriod;
                    if (residPeriod > max) {
                        max = residPeriod;
                    }
                }

                System.out.println("Найбільший термін проживання: " + max + " діб");

            }


            else if(scanner.equals("6")){
                    HashMap<String, Integer> type = new HashMap<>();
                    Map.Entry<String, Integer> max = null;
                    for (Inhab inhab: inhabs){
                        if (!type.containsKey(inhab.roomType)){
                            type.put(String.valueOf(inhab.roomType), 1);
                        }

                        else {
                            type.put(String.valueOf(inhab.roomType), type.get(inhab.roomType) + 1);
                        }

                    }

                    for (Map.Entry<String, Integer> temp: type.entrySet()){
                        if (max == null || temp.getValue() > max.getValue()){
                            max = temp;
                        }
                    }

                    if (max != null){
                        System.out.println("Найбільш популярний тип номеру: " + max.getKey()+ "-го классу");
                    }

                    else System.out.println("Нема найбільш популярного типу кімнати");

            }

            else {
                if (! scanner.equals("q")){
                    System.out.println("ERROR");
                }
            }


        } while (! scanner.equals("q"));
        System.out.println("done");

    }

    void writeInhababc(int type){
        for(Inhab inhab: this.inhabs){
            if(inhab.roomType == type){
                System.out.println(inhab);
            }
        }
    }

    public static void main (String[] args) throws IOException {
        Main main = new Main();
        main.programm();
    }
}