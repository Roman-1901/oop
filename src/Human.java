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
        if (name == null || name.isEmpty()) {
            name = "Информация не указана";
        }
        this.name = name;
        if (town == null || town.isEmpty()) {
            town = "Информация не указана";
        }
        this.town = town;
        if (jobTitle == null || jobTitle.isEmpty()) {
            jobTitle = "Информация не указана";
        }
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
            return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности "+ jobTitle +". Будем знакомы!";
    }
}
