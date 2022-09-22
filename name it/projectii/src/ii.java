import java.util.Scanner;

public class ii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Işık NameIt Program. ");
        int x = 5;
        for (int i = 0; i < 1; ) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("The following options are available for you: ");
            System.out.println("1) Display a name");
            System.out.println("2) Change the size");
            System.out.println("3) Exit program");
            System.out.println("Choose an option (choose wisely...)");
            int choose = in.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("What is your name? ");
                    String name = in.next();
                    for (int j = 0; j < name.length(); j++) {
                        char a = name.charAt(j);
                        name(a, x);
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("What is the new size? (Default size is 5) ");
                    x = in.nextInt();
                    if (x < 5) {
                        System.out.println("You can't enter a number less than 5");
                    }
                    break;

                case 3:
                    System.out.println("The program will shut down");
                    System.exit(1);

                default:
                    System.out.println("That option doesn' t exists");
                    break;
            }//end of switch
        }//end of first and the biggest for
    }//end of main

    public static void name(char a, int x) {
        if (a == 'A' || a == 'a') {
            for (int i = 1; i <= x; i++) {
                for (int k = i; k < x; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    if (j == 1 || i == x / 2 + 1 || j == 2 * i - 1) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'B' || a == 'b') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if ((i == 1 ^ j == x ^ i == x / 2 + 1 ^ i == x) || j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        if (a == 'C' || a == 'c' || a=='Ç' || a=='ç') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if (j == 1 ^ i == 1 ^ i == x) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'D' || a == 'd') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if (j == 1 || (i == 1 ^ i == x ^ j == x)) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'E' || a == 'e') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if (j == 1 || i == 1 || i == x / 2 + 1 || i == x) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'F' || a == 'f') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if (j == 1 || i == 1 || i == x / 2 + 1) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'G' || a == 'g' || a=='Ğ' || a=='ğ') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if (j == 1 ^ i == x ^ i == 1 || j == x && x / 2 + 1 <= i && i <= x || i == x / 2 + 1 && x / 2 + 1 <= j) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'H' || a == 'h') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if (j == x || j == 1 || i == x / 2 + 1) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'I' || a == 'i' || a=='İ' || a=='ı') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if (j == x / 2 + 1 || i == 1 || i == x) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'J' || a == 'j') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if (j == x - 2 || i == x && j <= x - 2 || j == 1 && i >= x - 1 || i == 1 && i <= x - 3) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'K' || a == 'k') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x / 2 + 2; j++) {
                    if (j == 1 || i + j == x / 2 + 3 || i - j == x / 2 - 1) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'L' || a == 'l') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if (j == 1 || i == x) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'M' || a == 'm') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if (j == 1 || j == x || i + j == x + 1 && i <= x / 2 + 1 || i - j == 0 && i <= x / 2 + 1) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'N' || a == 'n') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if (j == 1 || j == x || i + j == 2 * i) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'O' || a == 'o' || a=='Ö' || a=='ö') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if (j == 1 ^ j == x ^ i == 1 ^ i == x) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'P' || a == 'p') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if (j == 1 || i == 1 ^ i == x / 2 + 1 ^ j == x && i <= x / 2 + 1) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'R' || a == 'r') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if (j == 1 || i == 1 ^ i == x / 2 + 1 ^ j == x && i <= x / 2 + 1 || i - j == 0 && i >= x / 2 + 1) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'S' || a == 's' || a=='Ş' || a=='ş') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if ((j == 1 && i <= x / 2 + 1) ^ i == 1 ^ i == x / 2 + 1 ^ (j == x && i > x / 2 + 1) ^ i == x) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'T' || a == 't') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if (i == 1 || j == x / 2 + 1) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'U' || a == 'u' || a=='Ü' || a=='ü') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if (j == 1 ^ j == x ^ i == x) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'V' || a == 'v') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= 2 * x - 1; j++) {
                    if (j == i || i + j == x * 2) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        if (a == 'Y' || a == 'y') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if (x % 2 == 0) {
                        if ((i + j == 2 * i || i + j == x + 1) && i <= x / 2 + 1 || (j == x / 2 + 1 || j == x / 2) && i >= x / 2 + 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        if ((i + j == 2 * i || i + j == x + 1) && i <= x / 2 + 1 || j == x / 2 + 1 && i >= x / 2 + 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
        if (a == 'Z' || a == 'z') {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if (i == 1 || i == x || i + j == x + 1) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }//end of name method
}//end of class