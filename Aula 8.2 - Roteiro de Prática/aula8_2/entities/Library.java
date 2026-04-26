package aula8_2.entities;
import java.util.ArrayList;

public class Library {
    private final ArrayList<LibraryMaterial> materialList = new ArrayList<>();

    public boolean addMaterial(LibraryMaterial material) {
        if(materialList.contains(material)) {
            return false;
        }

        materialList.add(material);
        return true;
    }

    public String listMaterials() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (LibraryMaterial m : materialList) {
            sb.append(String.format("\n%d-%s", i, m.getTitle()));
            i++;
        }
        return sb.toString();
    }

    public LibraryMaterial searchByTitle(String title) {
        return materialList.stream()
                            .filter(m -> m.getTitle().equals(title))
                            .findFirst()
                            .orElse(null);
    }

    public void loanMaterial(LibraryMaterial material) {
        material.loan();
        materialList.remove(material);
    }

}
