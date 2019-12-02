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

    int  choice(){
        System.out.print("Введіть номер варіанту виведення.\n1)Табличний\n2)Текстовий" +
                "\n3)Інший\n4)Разом всі 3 варіанти");
        test();
        return scanner.nextInt();
    }

    void exercise(int choice,String name,String town,int age,String hobby){
        if (choice==1){
            version1(name, town, age, hobby);
        }
        else {
            if (choice==2){
                version2(name, town, age, hobby);
            }
            else {
                if (choice==3){
                    version3(name, town, age, hobby);
                }
                else {
                    if (choice==4){
                        version4(name, town, age, hobby);
                    }
                    else {
                        System.out.println("Такого варіанту не існує");
                        choice();
                    }   }   }   }   }


    private void version1(String name,String town,int age,String hobby){

    }
    private void version2(String name,String town,int age,String hobby){

    }
    private void version3(String name,String town,int age,String hobby){

    }
    private void version4(String name,String town,int age,String hobby){

    }
}






