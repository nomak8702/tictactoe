import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tic = "         ";
        String xw = "X wins";
        String ow = "O wins";
        String draw = "Draw";

        System.out.println("---------");
        System.out.println("| " + " " + " " + " " + " " + " " + " |" + '\n' +
                "| " + " " + " " + " " + " " + " " + " |" + '\n' + "| "
                + " " + " " + " " + " " + " " + " |");
        System.out.println("---------");

        int cordinateX;
        int cordinateY;
        boolean incorectException = true;
        boolean numberException = false;
        boolean freeException = true;

        char tic1 = tic.charAt(0);
        char tic2 = tic.charAt(1);
        char tic3 = tic.charAt(2);
        char tic4 = tic.charAt(3);
        char tic5 = tic.charAt(4);
        char tic6 = tic.charAt(5);
        char tic7 = tic.charAt(6);
        char tic8 = tic.charAt(7);
        char tic9 = tic.charAt(8);

        char[][] arr = new char[3][3];
        arr[0][0] = tic1;//1,3
        arr[0][1] = tic2;//2,3
        arr[0][2] = tic3;//3,3
        arr[1][0] = tic4;//1,2
        arr[1][1] = tic5;//2,2
        arr[1][2] = tic6;//3,2
        arr[2][0] = tic7;//1,1
        arr[2][1] = tic8;//2,1
        arr[2][2] = tic9;//3,1
        int count = 0;
        do {
            try {
                System.out.print("Enter the coordinates:");
                String input = new Scanner(System.in).nextLine();
                String trim = input.replaceAll("\\s", "");
                cordinateX = Integer.parseInt(trim.substring(0, 1));
                cordinateY = Integer.parseInt(trim.substring(1, 2));


                numberException = true;
                incorectException = true;
                if ((cordinateX > 3 || cordinateY > 3) || (cordinateX == 0 || cordinateY == 0)) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    incorectException = false;
                }
                int coordinateXO = Integer.parseInt(cordinateX + "" + cordinateY);
                freeException = true;
                if ((coordinateXO == 13 && count % 2 == 0) && tic1 == ' ') {
                    tic1 = 'X';
                    count++;
                } else if (coordinateXO == 13 && count % 2 != 0 && tic1 == ' ') {
                    tic1 = 'O';
                    count++;
                } else if (coordinateXO == 23 && count % 2 == 0 && tic2 == ' ') {
                    tic2 = 'X';
                    count++;
                } else if (coordinateXO == 23 && count % 2 != 0 && tic2 == ' ') {
                    tic2 = 'O';
                    count++;
                } else if (coordinateXO == 33 && count % 2 == 0 && tic3 == ' ') {
                    tic3 = 'X';
                    count++;
                } else if (coordinateXO == 33 && count % 2 != 0 && tic3 == ' ') {
                    tic3 = 'O';
                    count++;
                } else if (coordinateXO == 12 && count % 2 == 0 && tic4 == ' ') {
                    tic4 = 'X';
                    count++;
                } else if (coordinateXO == 12 && count % 2 != 0 && tic4 == ' ') {
                    tic4 = 'O';
                    count++;
                } else if (coordinateXO == 22 && count % 2 == 0 && tic5 == ' ') {
                    tic5 = 'X';
                    count++;
                } else if (coordinateXO == 22 && count % 2 != 0 && tic5 == ' ') {
                    tic5 = 'O';
                    count++;
                } else if (coordinateXO == 32 && count % 2 == 0 && tic6 == ' ') {
                    tic6 = 'X';
                    count++;
                } else if (coordinateXO == 32 && count % 2 != 0 && tic6 == ' ') {
                    tic6 = 'O';
                    count++;
                } else if (coordinateXO == 11 && count % 2 == 0 && tic7 == ' ') {
                    tic7 = 'X';
                    count++;
                } else if (coordinateXO == 11 && count % 2 != 0 && tic7 == ' ') {
                    tic7 = 'O';
                    count++;
                } else if (coordinateXO == 21 && count % 2 == 0 && tic8 == ' ') {
                    tic8 = 'X';
                    count++;
                } else if (coordinateXO == 21 && count % 2 != 0 && tic8 == ' ') {
                    tic8 = 'O';
                    count++;
                } else if (coordinateXO == 31 && count % 2 == 0 && tic9 == ' ') {
                    tic9 = 'X';
                    count++;
                } else if (coordinateXO == 31 && count % 2 != 0 && tic9 == ' ') {
                    tic9 = 'O';
                    count++;
                } else if ((cordinateX < 4 && cordinateY < 4)) {
                    System.out.println("This cell is occupied! Choose another one!");
                    freeException = false;
                }


            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
            } catch (NoSuchElementException e) {
            }
            System.out.println("---------");
            System.out.println("| " + tic1 + " " + tic2 + " " + tic3 + " |" + '\n' +
                    "| " + tic4 + " " + tic5 + " " + tic6 + " |" + '\n' + "| "
                    + tic7 + " " + tic8 + " " + tic9 + " |");
            System.out.println("---------");

            arr[0][0] = tic1;//1,3
            arr[0][1] = tic2;//2,3
            arr[0][2] = tic3;//3,3
            arr[1][0] = tic4;//1,2
            arr[1][1] = tic5;//2,2
            arr[1][2] = tic6;//3,2
            arr[2][0] = tic7;//1,1
            arr[2][1] = tic8;//2,1
            arr[2][2] = tic9;//3,1

            String line1 = (String.valueOf(arr[0][0])) + (String.valueOf(arr[0][1])) + (String.valueOf(arr[0][2]));
            String line2 = (String.valueOf(arr[1][0])) + (String.valueOf(arr[1][1])) + (String.valueOf(arr[1][2]));
            String line3 = (String.valueOf(arr[2][0])) + (String.valueOf(arr[2][1])) + (String.valueOf(arr[2][2]));
            String line4 = (String.valueOf(arr[0][0])) + (String.valueOf(arr[1][0])) + (String.valueOf(arr[2][0]));
            String line5 = (String.valueOf(arr[0][1])) + (String.valueOf(arr[1][1])) + (String.valueOf(arr[2][1]));
            String line6 = (String.valueOf(arr[0][2])) + (String.valueOf(arr[1][2])) + (String.valueOf(arr[2][2]));
            String line7 = (String.valueOf(arr[0][0])) + (String.valueOf(arr[1][1])) + (String.valueOf(arr[2][2]));
            String line8 = (String.valueOf(arr[0][2])) + (String.valueOf(arr[1][1])) + (String.valueOf(arr[2][0]));

            String[] conditi = {line1, line2, line3, line4, line5, line6, line7, line8};
            int xwin = 0;
            int owin = 0;
            for (String s : conditi) {
                if (s.equalsIgnoreCase("XXX")) {
                    // System.out.println(xw);
                    xwin++;

                } else if (s.equalsIgnoreCase("OOO")) {
                    // System.out.println(ow);
                    owin++;
                }
            }

            if (xwin > 0) {
                System.out.println(xw);
                System.exit(1);
            } else if (owin > 0) {
                System.out.println(ow);
                System.exit(1);
            }

        } while (count != 9);
        System.out.println(draw);
    }
}
