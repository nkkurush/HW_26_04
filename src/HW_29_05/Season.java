package HW_29_05;

public enum Season {
    WINTER(1,"зима"), SPRING(2,"весна"),SUMMER(3,"лето"),
    AUTUMN(4,"осень");

    private int numberOfSeason;
    private String russianName;

    Season(int numberOfSeason, String russianName) {
        this.numberOfSeason = numberOfSeason;
        this.russianName = russianName;
    }

    public int getNumberOfSeason() {
        return numberOfSeason;
    }

    public String getRussianName() {
        return russianName;
    }
}
