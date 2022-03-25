package controlStatements;

public class SwitchDemo {
    public static void main(String[] args) {

        //byte, short, int, char, String, enum, Byte, Short, Integer, Character
        //not allowed : float, double, boolean, Long, long
        switch ('A') {
            default:
                System.out.println("Invalid case label");
                break;
            case 65:
                System.out.println("case 12 ");
                break;
            case 2:
                System.out.println("case 2 ");
                break;
            case 3:
                System.out.println("case 3 ");
                break;
            case 4:
                System.out.println("case 4 ");
                break;
            case 5:
                System.out.println("case 5 ");
                break;
        }
    }
}
