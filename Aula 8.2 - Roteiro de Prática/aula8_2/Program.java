package aula8_2;
import aula8_2.entities.Library;
import aula8_2.view.MenuManager;

public class Program {
    public static void main(String[] args) {
        MenuManager menu = new MenuManager();
        Library lib = new Library();
        menu.startMenu(lib);
    }
}
