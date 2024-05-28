package oop.enumeration;

public enum Country {

    JAPAN("Япония", 140_000_000L, "японский"),
    GREECE("Греция", 10_000_000L, "греческий"),
    ARGENTINA("Аргентина", 47_000_000L, "испанский");

    Country(String name, long peopleCount, String language) {
        this.name = name;
        this.peopleCount = peopleCount;
        this.language = language;
    }

    private String name;
    private long peopleCount;
    private String language;

    public String getName() {
        return name;
    }

    public long getPeopleCount() {
        return peopleCount;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "County {\n" +
                "name='" + name + ",\n" +
                "language='" + language + ",\n" +
                "peopleCount=" + peopleCount +
                "\n} \n ---------------------- \n";
    }

}
