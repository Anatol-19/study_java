package start.Lesson4;

public class BooleanLogic {
    public static void main(String[] args) {
        //купи хлеб
        boolean isBoughtBread = false;
        //купил молоко
        boolean isBoughtMilk = true;
        boolean isBoughtBreadAndMilk = isBoughtMilk && isBoughtMilk;
        if (isBoughtBread && isBoughtMilk) {
            System.out.println("Молодец");
        }  else if (isBoughtMilk) {
            System.out.println("Хотя бы молоко");
        } else if (isBoughtBread) {
            System.out.println("Хоят бы хлеб");
        }
        else {
            System.out.println("Не Молодец");
        }

        //OR - логическое ИЛИю Хотябы 1 true - true.  ||
        boolean isBoughtMilkOrBread = isBoughtBread || isBoughtMilk;

        //NOT - логическое не !

    }
}
