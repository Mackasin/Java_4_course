package java_ls.lr1.imutable;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Исходные данные для создания объекта
        HashMap<String, Character> grades = new HashMap<>();
        grades.put("Math", 'A');
        grades.put("History", 'B');

        // Создаем объект неизменяемого класса
        ImmutableClass student = new ImmutableClass("John", 20, grades);

        // Печатаем исходные данные
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grades: " + student.getSubjectGrade());

        // Попытаемся изменить исходную карту, переданную в объект
        grades.put("Math", 'C');
        System.out.println("\nAfter changing original map:");
        System.out.println("Grades in original map: " + grades);
        System.out.println("Grades in ImmutableClass: " + student.getSubjectGrade());

        // Попытаемся изменить данные через геттер
        HashMap<String, Character> gradesFromObject = student.getSubjectGrade();
        gradesFromObject.put("History", 'D');
        System.out.println("\nAfter changing cloned map from ImmutableClass:");
        System.out.println("Grades in cloned map: " + gradesFromObject);
        System.out.println("Grades in ImmutableClass: " + student.getSubjectGrade());
    }
}
