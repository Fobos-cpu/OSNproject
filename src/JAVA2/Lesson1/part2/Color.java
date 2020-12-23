package JAVA2.Lesson1.part2;

public enum Color {
    BLACK("Чёрный","Чернь"),WHITE("Белый","Беляш"),RED("Рыжий","Рыжик");
    private String russianColor;
    private String fName;

    Color(String russianColor, String hrenZnaet) {
        this.russianColor = russianColor;
        this.fName = fName;
    }

    public String getRussianColor() {
        return russianColor;
    }

    public String getfName() {
        return fName;
    }

    @Override
    public String toString() {
        return "Color{" +
                "russianColor='" + russianColor + '\'' +
                ", fName='" + fName + '\'' +
                '}';
    }
}
