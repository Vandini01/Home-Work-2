import java.util.Scanner;

class Example1Method {
private Scanner scanner = new Scanner(System.in);

    String inputName(){
        System.out.print("Введіть ваше ім'я - ");
        return scanner.next();
    }

    String inputTown(){
        System.out.print("Введіть ваше місто - ");
        return scanner.next();
    }

    int inputAge(){
        System.out.print("Введіь ваш вік - ");
        test();
        return scanner.nextInt();
    }

    String inputHobby(){
        System.out.print("Введіть ваше хобі - ");
        return scanner.next();
    }

    private void test() {
        scanner.nextLine();
        while (!scanner.hasNextInt()) {
            System.out.print("Ви ввели неправильне значення, будьласка введіть число:");
            scanner.nextLine();
        }
    }

}


