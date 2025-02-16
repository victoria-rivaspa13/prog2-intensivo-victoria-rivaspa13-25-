package Intensivo.Práctica_primer_parcial;

import java.util.ArrayList;
import java.util.List;

abstract class Material {
    private String title;
    private String author;
    private boolean available;

    public Material(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return available; }

    public void borrow() {
        if (available) {
            available = false;
        }
    }

    public void returnMaterial() {
        available = true;
    }
}

class Book extends Material {
    public Book(String title, String author) {
        super(title, author);
    }
}

class Magazine extends Material {
    public Magazine(String title, String author) {
        super(title, author);
    }
}

class Thesis extends Material {
    private String advisor;

    public Thesis(String title, String author, String advisor) {
        super(title, author);
        this.advisor = advisor;
    }

    public String getAdvisor() { return advisor; }
}

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
