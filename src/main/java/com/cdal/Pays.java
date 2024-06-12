package main.java.com.cdal;

import java.util.Set;
import java.util.HashSet;

/**
 * Classe représentant un pays avec un ensemble de sportifs.
 */
public class Pays {
    private String nom;
    private Set<Athlete> sportifs;
    public static Set<String> ensemblePays = new HashSet<String>();

    /**
     * Constructeur pour créer un nouveau pays.
     * @param nom Le nom du pays.
     * @throws PaysExistantException si le pays existe déjà.
     */
    public Pays(String nom) throws PaysExistantException {
        if (!Pays.ensemblePays.contains(nom)) {
            this.nom = nom;
            this.sportifs = new HashSet<>();
            Pays.ensemblePays.add(this.nom);
        } else {
            throw new PaysExistantException();
        }
    }

    /**
     * Retourne le nom du pays.
     * @return Le nom du pays.
     */
    public String getNomPays() {
        return this.nom;
    }

    /**
     * Retourne l'ensemble des sportifs du pays.
     * @return Un ensemble de {@link Participant} représentant les sportifs du pays.
     */
    public Set<Athlete> getSportifs() {
        return this.sportifs;
    }

    /**
     * Ajoute un sportif à l'ensemble des sportifs du pays.
     * @param sportif Le sportif à ajouter.
     * @return true si le sportif a été ajouté avec succès, false sinon.
     */
    public boolean ajouterSportif(Athlete sportif) {
        if (sportif.getNationalite().equals(this)) {
            return this.sportifs.add(sportif);
        }
        return false;
    }

    /**
     * Enlève un sportif de l'ensemble des sportifs du pays.
     * @param sportif Le sportif à enlever.
     * @return true si le sportif a été enlevé avec succès, false sinon.
     */
    public boolean enleverSportif(Athlete sportif) {
        return this.sportifs.remove(sportif);
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
        if (!(o instanceof Pays)) {return false;}
        Pays tmp = (Pays) o;
        return tmp.getNomPays().equals(this.nom);
    }

    /**
     * Retourne un hashCode pour cet objet.
     * @return Un entier représentant le hashCode.
     */
    @Override
    public int hashCode() {
        int res = this.nom.hashCode() * 607810823;
        return res;
    }
}
