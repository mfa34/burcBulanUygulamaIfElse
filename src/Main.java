import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day , month ;
        String burc="";
        boolean isError = false ;

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen hangi ayda dogdugunuz girin.");
        month = input.nextInt();
        System.out.println("lutfen hangi gunde dogdugunuzu girin.");
        day = input.nextInt();

        if (month==1){
            if ( day>=1 && day<=31){
                if ( day<21){
                    burc="Oglak";
                }else {
                    burc = "kova";
                }
            }
            else{
                isError = true;
            }
        } else if (month==2) {
            if (day >= 1 && day <= 28) {
                if (day < 19) {
                    burc = "Kova";
                } else {
                    burc = "Balik";
                }
            }
        } else if (month==3) {
            if (day >= 1 && day <= 31) {
                if (day < 20) {
                    burc = "balik";
                } else {
                    burc = "Koc";
                }
            }
        } else if (month==4) {
            if (day >= 1 && day <= 30) {
                if (day < 20) {
                    burc = "Koc";
                } else {
                    burc = "Boga";
                }
            }
        } else if (month==5) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    burc = "Boga";
                } else {
                    burc = "Ikizler";
                }
            }
        } else if (month==6) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    burc = "Ikizler";
                } else {
                    burc = "Yengec";
                }
            }
        } else if (month==7) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Yengec";
                } else {
                    burc = "Aslan";
                }
            }
        } else if (month==8) {
            if (day >= 1 && day <= 31) {
                if (day < 19) {
                    burc = "Aslan";
                } else {
                    burc = "Basak";
                }
            }
        } else if (month==9) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    burc = "Basak";
                } else {
                    burc = "Terazi";
                }
            }
        } else if (month==10) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            }
        } else if (month==11) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            }
        } else if (month==12) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    burc = "Akrep";
                } else {
                    burc = "Oglak";
                }
            }
        }
        if (isError==true){
            System.out.printf("Hatali islem gerceklestirdiniz.");
        }else {
            System.out.println("Burcunuz : " + burc);
        }
    }
}
