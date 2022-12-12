public class Main {
    public static void main(String[] args) {
        Human max = new Human(-1988, "Максим", "Минск", "Бренд-менеджер");
        Human annie = new Human(1993, "Анна", "Москва", "Методист образовательных программ");
        Human kate = new Human(1992, "Катя", "Калининград", "Продакт-менеджер");
        Human artem = new Human(1995, "Артем", "Москва", "Директор по развитию бизнеса");

        System.out.println(max);
        System.out.println(annie);
        System.out.println(kate);
        System.out.println(artem);
    }
}