package Intensivo.Práctica_primer_parcial;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Material> materials;

    public Library() {
        this.materials = new ArrayList<>();
    }

    public void addMaterial(Material material) {
        materials.add(material);
    }

    public boolean borrowMaterial(String title) {
        for (Material material : materials) {
            if (material.getTitle().equals(title) && material.isAvailable()) {
                material.borrow();
                return true;
            }
        }
        return false;
    }

    public void returnMaterial(String title) {
        for (Material material : materials) {
            if (material.getTitle().equals(title)) {
                material.returnMaterial();
                break;
            }
        }
    }

    public List<Material> listAvailableMaterials() {
        List<Material> availableMaterials = new ArrayList<>();
        for (Material material : materials) {
            if (material.isAvailable()) {
                availableMaterials.add(material);
            }
        }
        return availableMaterials;
    }
}
