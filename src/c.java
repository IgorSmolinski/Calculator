import java.util.Scanner;

class Calculate{


    public Calculate(){

    }

    public double add(double a, double b){
        return a+b;
    }

    public double substraction(double a, double b){
        return a-b;
    }

    public double multiplication(double a, double b){
        return a*b;
    }

    public double devide(double a, double b){
        return a/b;
    }
}

class Apllication{
    public static void main(String [] args) throws java.io.IOException {
        Scanner choice = new Scanner(System.in);
        int selectionNumber;
        double nr1,nr2, score;
        Calculate work = new Calculate();
        do {
            System.out.println("Please chose mathematical operation:");
            System.out.println("1. Add");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Devide");
            System.out.println("5. End program");

            selectionNumber = choice.nextInt();

            if ((selectionNumber < 1) | (selectionNumber > 5) ){
                System.out.println("You selected wrong number, please chose number from scope 1-5");
            }

            switch(selectionNumber) {
                case 1:
                    System.out.println("Please write the first number to add");
                    nr1 = choice.nextDouble();
                    System.out.println("Please write the second number to add");
                    nr2 = choice.nextDouble();
                    System.out.println(work.add(nr1, nr2));
                    break;
                case 2:
                    System.out.println("Please write the first number to substraction");
                    nr1 = choice.nextDouble();
                    System.out.println("Please write the second number to substraction");
                    nr2 = choice.nextDouble();
                    System.out.println(work.substraction(nr1, nr2));
                    break;
                case 3:
                    System.out.println("Please write the first number to multiplication");
                    nr1 = choice.nextDouble();
                    System.out.println("Please write the second number to multiplication");
                    nr2 = choice.nextDouble();
                    System.out.println(work.multiplication(nr1, nr2));
                    break;
                case 4:

                    do {
                        System.out.println("Please write the first number to devide");
                        nr1 = choice.nextDouble();
                        System.out.println("Please write the second number to devide");
                        nr2 = choice.nextDouble();
                        if((nr1 == 0 | nr2 == 0)){
                            System.out.println("You can not devide by 0");
                        }

                    } while (nr1 == 0 | nr2 == 0);
                    System.out.println(work.devide(nr1, nr2));
                    break;
            }


        } while (selectionNumber !=5);

    }
}

