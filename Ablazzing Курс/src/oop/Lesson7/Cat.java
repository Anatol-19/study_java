package oop.Lesson7;

public class Cat {
    public String color;
    double weight;
    String ownerName;

    public Cat(String colorName, double weightCat, String owner) {
        this.color = colorName;
        this.weight = weightCat;
        this.ownerName = owner;
    }

    public void destroy(String sOwner) {
        System.out.printf("Все коты твари. Бедный %s \n", sOwner);
    }

    public String hunt(boolean isDay) {
        if (isDay) {
            return "Мышь";
        }
        return "Сова";

        }

    public String hunt(boolean isDay, boolean success){
        if (success) {
            if (isDay) {
                return "Мышь";
            }
            return "Сова";
        }
        return "Ничего";
    }

        @Override
        public String toString () {
            return "Cat{" +
                    "color='" + color + '\'' +
                    ", weight=" + weight +
                    ", ownerName='" + ownerName + '\'' +
                    '}';
        }
}

