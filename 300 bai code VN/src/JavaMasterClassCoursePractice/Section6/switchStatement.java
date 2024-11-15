package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class switchStatement {

    public static void switchStatement(int value) {
        switch(value)
        {
            case 1:
                System.out.println("switch 1");
                break;
                case 2:
                    System.out.println("switch 2");
                    break;
                    case 3:
                        System.out.println("switch 3");
                        break;
                        case 4:
                            System.out.println("switch 4");
                            break;
            case 5: case 6: case 7:
                System.out.println("switch 5,6 or 7");
                System.out.println("Actually it is a " + value);
                break;
            default:
                System.out.println("Other switch statement");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switchStatement(a);
    }
}
