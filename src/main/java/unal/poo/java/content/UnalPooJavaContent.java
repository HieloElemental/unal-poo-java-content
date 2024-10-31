/** 
 * Java exercise template
 */

package unal.poo.java.content;

import unal.poo.java.content.SelectionMenu;

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
public class UnalPooJavaContent {

    public static void main(String[] args) {
        while(true){
           SelectionMenu.printMenu();
           SelectionMenu.askAndExOption();
        }
    }
}
