package unal.poo.java.content;

import java.util.Scanner;

import exercises.Exercise1;
import exercises.Exercise2;

/**
 *
 * @author ALEJANDRO GUTIERREZ MUÑOZ
 * @authorId 1022003484
 * @group 4 REMOTE
 * 
 * @subjectCode 3007744
 * @subjectName PROGRAMACIÓN ORIENTADA A OBJETOS
 * @syllabusCode 3534
 * @syllabusName INGENIERÍA DE SISTEMAS E INFORMÁTICA
 * @facultyCode 3068
 * @facultyName FACULTAD DE MINAS
 */
public class SelectionMenu {
    public static Scanner scanner = new Scanner(System.in);
    
    private static final Option[] options = {
        new Option(1, "Exercise 1"),
        new Option(2, "Exercise 2"),
        new Option(3, "quit")
    };
    
    public static void printMenu(){
        for (Option option : options) {
            System.out.println(option.getId() + ": " + option.getName());
        }
    }
    
    public static void onBadOption(){
        System.out.println(
        "Invalid option selected\n\tReturning to main menu..."
        );
    }
    
    public static void askAndExOption(){
        int option = askForOption();
        if (option == -1){
            onBadOption();
            return;
        }
        try {
            options[option - 1].onSelected();            
        } catch (Exception e) {
            onBadOption();
        }
    }
    
    public static int askForOption(){
        System.out.println();
        System.out.print("Select an option: ");
        try {
            int selectedOption = scanner.nextInt();
            if (selectedOption < 1 || selectedOption > options.length){
                return -1;
            }
            return selectedOption;
        } catch (Exception e) {
            scanner.next();
            return -1;
        }
    }
}

class Option {
    private int id;
    private String name;

    public Option(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void onSelected() {
        switch (id) {
            case 1:
                Exercise1.main();
                break;
            case 2:
                Exercise2.main();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                break;
        }
    }
}
