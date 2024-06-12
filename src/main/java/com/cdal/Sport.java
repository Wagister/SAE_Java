package main.java.com.cdal;

/**
 * Classe représentant un sport avec un nom spécifique.
 */
public class Sport {
    private String nom;

    /**
     * Constructeur pour créer un nouveau sport.
     * @param nom Le nom du sport.
     */
    public Sport(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne le nom du sport.
     * @return Le nom du sport.
     */
    public String getNomSport() {
        return this.nom;
    }

    /**
     * Compare cet objet à l'objet spécifié.
     * @param o L'objet à comparer.
     * @return true si les objets sont égaux, false sinon.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) {return false;}
        if (o == this) {return true;}
        if (!(o instanceof Sport)) {return false;}
        Sport tmp = (Sport) o;
        return tmp.getNomSport().equals(this.nom);
    }

    /**
     * Retourne un hashCode pour cet objet.
     * @return Un entier représentant le hashCode.
     */
    @Override
    public int hashCode() {
        int res = this.nom.hashCode() * 806289877;
        return res;
    }
}
