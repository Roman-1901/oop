public class Human {
    final int yearOfBirth;
    final String name;
    String town;
    String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        if (name == null || name.isEmpty() || town == null || town.isEmpty() || jobTitle == null || jobTitle.isEmpty()) {
            return "Информация не указана";
        } else {
            return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности "+ jobTitle +". Будем знакомы!";
        }
    }
}
