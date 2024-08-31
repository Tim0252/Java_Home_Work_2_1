public class Main {
    public static void main(String[] args) {

        int score = 100; // Начальный счет
        int coming; // Пополнение счета
        int bonus; // Количество бонусов
        {
            coming = 300;
            if (coming > 1000) {
                bonus = (coming / 100);
                System.out.println("Бонусов начислено: " + (bonus));
                System.out.println("На счету: " + (score + coming + bonus));
            } else {
                System.out.println("На счету: " + (score + coming));
            }
        }
        {
            coming = 1100;
            if (coming > 1000) {
                bonus = (coming / 100);
                System.out.println("Бонусов начислено: " + (bonus));
                System.out.println("На счету: " + (score + coming + bonus));
            } else {
                System.out.println("На счету: " + (score + coming));
            }
        }



    }
}