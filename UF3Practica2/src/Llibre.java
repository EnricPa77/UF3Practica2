public abstract class Llibre {

    private String nom;

    private String tipus;

    private String editorial;

    private int any;

    private String autor;

    public String getNom() {
        return nom;
    }

    public String getTipus() {
        return tipus;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAny() {
        return any;
    }

    public String getAutor() {
        return autor;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
