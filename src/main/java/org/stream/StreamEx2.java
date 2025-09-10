package main.java.org.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

import static java.util.stream.Collectors.partitioningBy;

enum Gender {MALE, FEMALE}

enum Level {HIGH, MID, LOW}

class Student {
    private Long id;
    private String name;
    private Gender gender;
    private int grade;
    private int score;

    public Student(Long id, String name, Gender gender, int grade, int score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.score = score;
    }

    String getName() {
        return this.name;
    }

    boolean isMale() {
        return gender == Gender.MALE;
    }

    public int getGrade() {
        return grade;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", score=" + score +
                '}';
    }


}


public class StreamEx2 {
    public static void main(String[] args) {
        ArrayList<Student> strArr = new ArrayList<>(10);
        for(int i=0; i<10; i++){
            String name = getRandomName();
            Gender gender = getRandomGender();
            int grade = getRandomGrade();
            int score = getRandomScore();
            strArr.add(new Student(Long.parseLong(String.valueOf(i)),name, gender, grade, score));
        }

//        Map<Boolean, List<Student>> stuByGender = Stream.of(strArr)
        Map<Boolean, List<Student>> stuByGender = strArr.stream().collect(partitioningBy(Student::isMale));

        List<Student> male = stuByGender.get(true);
        List<Student> female = stuByGender.get(false);

        System.out.println(male);
        System.out.println(female);

    }

    public static String getRandomName() {
        String al = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            int idx = (int)(Math.random() * al.length());
            sb.append(al.charAt(idx));
        }

        return sb.toString();
    }

    public static Gender getRandomGender() {
        double random = Math.random();
        return random > 0.5 ? Gender.MALE : Gender.FEMALE;
    }

    public static int getRandomGrade() {
        Random r = new Random();
        return r.nextInt(6) + 1; // 1~6
    }

    public static int getRandomScore() {
        Random r = new Random();
        return r.nextInt(100) + 1; // 1~100
    }





}
