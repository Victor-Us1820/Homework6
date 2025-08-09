public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age1 = 18;
        if (age1 == 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он совершеннолетний. ");
        }
        int age2 = 17;
        if (age2 == 17) {
            System.out.println("Если возраст человека равен " + age2 + ". то он не достиг совешеннолетия, нужно немного подождать.");
        }
        // Задача 2
        int temp1 = 3;
        if (temp1 < 5) {
            System.out.println("На улице " + temp1 + " градуса, нужно надеть шапку.");
        }
        int temp2 = 15;
        if (temp1 > 5) {
            System.out.println("На улице " + temp2 + " градусов, можно идти без шапки.");
        }
        // Задача 3
        int speed1 = 81;
        if (speed1 > 60) {
            System.out.println("Если скорость " + speed1 + " км. в час, " + "то придется заплатить штраф.");
        }
        int speed2 = 54;
        if (speed2 < 60) {
            System.out.println("Если скорость " + speed2 + " км. в час, " + "то можно ездить спокойно.");
        }
        // Задача 4
        int ageOfPerson1  = 5;
        int ageOfPerson2  = 14;
        int ageOfPerson3  = 21;
        int ageOfPerson4  = 32;
        if (ageOfPerson1 >= 2 && ageOfPerson1 <= 6) {
            System.out.println("Если возраст человека равен " + ageOfPerson1 + " лет, то ему нужно ходить в детский сад.");
        }
        if (ageOfPerson2 >= 7 && ageOfPerson2 <= 17) {
            System.out.println("Если возраст человека равен " + ageOfPerson2 + " лет, то ему нужно ходить в школу.");
        }
        if (ageOfPerson3 >= 18 && ageOfPerson3 <= 24) {
            System.out.println("Если возраст человека равен " + ageOfPerson3 + " лет, то его место в университете.");
        }
        if (ageOfPerson4 > 24) {
            System.out.println("Если возраст человека равен " + ageOfPerson4 + " лет, то ему пора ходить на работу.");
        }
        // Задача 5
        int ageOfChild1 = 3;
        int ageOfChild2 = 12;
        int ageOfChild3 = 16;
        if (ageOfChild1 < 5) {
            System.out.println("Если возраст ребёнка равен " + ageOfChild1 + " года, то ему нельзя кататься на аттракционе.");
        }
        if (ageOfChild2 > 5 && ageOfChild2 < 14) {
            System.out.println("Если возраст ребёнка равен " + ageOfChild2 + " лет, то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (ageOfChild3 > 14) {
            System.out.println("Если возраст ребёнка равен " + ageOfChild3 + " лет, то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        // Задача 6
        int seatsOccupied = 95;
        int totalSeats = 102;
        int seatingPositions = 60;
        if (seatsOccupied < seatingPositions) {
            System.out.println("Есть свободные сидячие места.");
        } else if (seatsOccupied < totalSeats) {
            System.out.println("Сидячие места заняты, есть стоячие.");
        } else {
            System.out.println("Вагон полностью забит. Мест нет.");
        }
        // Задача 7
        int one = 8;
        int two = 13;
        int three = 21;
        if (one > two && one > three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}