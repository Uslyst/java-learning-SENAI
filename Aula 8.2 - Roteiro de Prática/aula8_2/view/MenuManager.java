package aula8_2.view;
import aula8_2.MaterialFactory;
import aula8_2.entities.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
    public void startMenu(Library lib) {
        boolean quit = false;
        Scanner scan = new Scanner(System.in);

        while(!quit) {
            try {          
                System.out.print(
                    "\n-==== LIBRARY MENU ====-" + 
                    "\n[1] Add book" +
                    "\n[2] Add magazine" +
                    "\n[3] Add newspaper" +
                    "\n[4] List materials" +
                    "\n[5] Search by title" +
                    "\n[6] Loan material" +
                    "\n[7] Quit"
                );

                int input = InputUtils.readInt(scan, ": ");
                switch(input) {
                    case 1 -> addBookOption(scan, lib);                    
                    case 2 -> addMagazineOption(scan, lib);                        
                    case 3 -> addNewspaperOption(scan, lib);                  
                    case 4 -> System.out.print("\n" + lib.listMaterials());                       
                    case 5 ->  searchByTitleOption(scan, lib);                      
                    case 6 -> loanMaterialOption(scan, lib);                    
                    case 7 -> quit = true;               
                    default -> System.out.print("\nInvalid option!");
                }  

                if(!quit) 
                    InputUtils.pressToContinue(scan);               
                    
            } catch (InputMismatchException e) {
                System.err.println("\nInvalid format");     
                scan.nextLine();      
            } catch (Exception e) {
                System.err.printf("\nMenu error: %s", e.getMessage());     
            }      
        }
        scan.close();
    }
               
    private void addBookOption(Scanner scan, Library lib) {
        System.out.print("\n=== Add book ===");
        lib.addMaterial(MaterialFactory.createBook(scan));
    }

    private void addMagazineOption(Scanner scan, Library lib) {
        System.out.print("\n=== Add magazine ===");
        lib.addMaterial(MaterialFactory.createMagazine(scan));
    }

    private void addNewspaperOption(Scanner scan, Library lib) {
        System.out.print("\n=== Add newspaper ===");
        lib.addMaterial(MaterialFactory.createNewspaper(scan));
    }

    private void searchByTitleOption(Scanner scan, Library lib) {
        System.out.print("\n=== Search by title ===");
        var mat = lib.searchByTitle(InputUtils.readString(scan, "Title to search: "));
        if(mat != null) {
            System.out.print("\nFound material:");
            System.out.print(mat.getDetails());
            return;
        }
        System.out.print("\nNo materials where found...");
    }

    private void loanMaterialOption(Scanner scan, Library lib) {
        System.out.print("\n=== Loan material ===");
        var mat = lib.searchByTitle(InputUtils.readString(scan, "Material title to borrow: "));
        if(mat != null) {
            lib.loanMaterial(mat);
            System.out.printf("\nMaterial named '%s' was borrowed", mat.getTitle());
            return;
        }
        System.out.print("\nNo materials where found...");
    }
}
