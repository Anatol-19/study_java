package oop.nested_classes;

public class Human {
    private Passport passport;
    private Heart heart;


    public Human(String series, String number, PassportType passportType,
                 double weight) {
        this.passport = new Passport(series, number, passportType);
        this.heart = new Heart(weight);
    }

    public static class Passport {
        public Passport(String series, String number, PassportType passportType) {
            this.series = series;
            this.number = number;
            this.passportType = passportType;
        }

        @Override
        public String toString() {
            return "Passport{ \n" +
                    "    series = " + series + ", \n" +
                    "    number = " + number + ", \n" +
                    "    type = " + passportType + "\n" +
                    "    }";
        }

        private String series;
        private String number;
        private PassportType passportType;
    }

    @Override
    public String toString() {
        return "Human {" +
                "ID = " + passport + ",\n" +
                "metrics = " + heart + "\n" +
                '}';
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public class Heart {
        private double weight;


        public Heart(double weight) {
            this.weight = weight;
        }
        @Override
        public String toString() {
            return "Heart { \n" +
                    "    weight = " + weight +
                    "\n    }";
        }
    }
}
