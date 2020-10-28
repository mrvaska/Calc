public class Calc {

    public static void main(String[] args) {
        UserInput s2 = new UserInput();
        Parser p = new Parser();


        try {
            while(true){
                p.sch(s2.textUserInput());
            }
        } catch (Exception e) {
            System.out.println("Не разрешенный диапазон или не правильный ввод цифр");
        }

    }


}