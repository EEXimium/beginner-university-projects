import java.util.Scanner;

public class ProjectI {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of digits: ");
        int digit=in.nextInt();


        if (digit==3){
            System.out.println("Start guessing!");
            int thenumber=(int)(Math.random()*1000);
            int bir=thenumber%10;
            int on=(thenumber/10)%10;
            int yuz=thenumber/100;

                for (int i = 0; i < 1; ) {
                    if (bir==on || bir==yuz || on==yuz || thenumber<100) {
                        thenumber = (int) (Math.random() * 1000);
                        bir = thenumber % 10;
                        on = (thenumber / 10) % 10;
                        yuz = thenumber / 100;
                    }else{
                        i++;
                    }
                }//for

            //System.out.println(thenumber);

        for (int i = 0; i < 1;) {
            System.out.println(); // + ve - işaretlerin yan yana olması ve girilen sayının işaretlerin yanına değil alt satıra girilmesi için, tüm + ve - işaretlerinin system.out' larındaki "ln" kısmını silip buraya boş bir system.out ekledim.
            int guess = in.nextInt();
            
            if (guess == thenumber) {
                System.out.print("YOU FOUND THE NUMBER!!! YAY!!");
                break;
            }

            int guessbir = guess % 10;
            int guesson = (guess / 10) % 10;
            int guessyuz = guess / 100;

            if (bir == guessbir) {
                System.out.print("+");
            } else if (bir == guesson || bir == guessyuz) {
                System.out.print("-");
            }

            if (on == guesson) {
                System.out.print("+");
            } else if (on == guessbir || on == guessyuz) {
                System.out.print("-");
            }

            if (yuz == guessyuz) {
                System.out.print("+");
            } else if (yuz == guessbir || yuz == guesson) {
                System.out.print("-");
            }

            if (bir != guessbir && bir != guesson && bir != guessyuz && on != guessbir && on != guesson && on != guessyuz && yuz != guessbir && yuz != guesson && yuz != guessyuz) {
                System.out.println("NO MATCH!!");
            }
        }//end of for

        }else if (digit==4){
            System.out.println("Start guessing!");
            int thenumber=(int)(Math.random()*10000);
            int bir=thenumber%10;
            int on=(thenumber/10)%10;
            int yuz=(thenumber/100)%10;
            int bin=thenumber/1000;

            for (int i = 0; i < 1; ) {
                if (bir==on || bir==yuz || bir==bin || on==yuz || on==bin || yuz==bin || thenumber<1000) {
                    thenumber=(int)(Math.random()*10000);
                    bir=thenumber%10;
                    on=(thenumber/10)%10;
                    yuz=(thenumber/100)%10;
                    bin=thenumber/1000;
                }else{
                    i++;
                }
            }//for


            //System.out.println(thenumber);
            for (int i = 0; i < 1;) {
                System.out.println(); // + ve - işaretlerin yan yana olması ve girilen sayının işaretlerin yanına değil alt satıra girilmesi için, tüm + ve - işaretlerinin system.out' larındaki "ln" kısmını silip buraya boş bir system.out ekledim.
                int guess = in.nextInt();

                if (guess == thenumber) {
                    System.out.print("YOU FOUND THE NUMBER!!! YAY!!");
                    break;
                }

                int guessbir = guess % 10;
                int guesson = (guess / 10) % 10;
                int guessyuz = (guess / 100)%10;
                int guessbin = guess / 1000;

                if (bir == guessbir) {
                    System.out.print("+");
                } else if (bir == guesson || bir == guessyuz || bir == guessbin) {
                    System.out.print("-");
                }

                if (on == guesson) {
                    System.out.print("+");
                } else if (on == guessbir || on == guessyuz || on == guessbin) {
                    System.out.print("-");
                }

                if (yuz == guessyuz) {
                    System.out.print("+");
                } else if (yuz == guessbir || yuz == guesson || yuz == guessbin) {
                    System.out.print("-");
                }

                if (bin == guessbin) {
                    System.out.print("+");
                } else if (bin == guessbir || bin == guesson || bin == guessyuz) {
                    System.out.print("-");
                }

                if (bir != guessbir && bir != guesson && bir != guessyuz && bir != guessbin && on != guessbir && on != guesson && on != guessyuz && on != guessbin && yuz != guessbir && yuz != guesson && yuz != guessyuz && yuz != guessbin && bin != guessbir && bin != guesson && bin != guessyuz && bin != guessbin) {
                    System.out.println("NO MATCH!!");
                }
            }// end of for
        }else{
            System.out.println("You must enter either 3 or 4.");
        }
    }//end of main
}//end of class