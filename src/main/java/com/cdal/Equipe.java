package main.java.com.cdal;

import java.util.Set;
import java.util.HashSet;

/**
 * Classe représentant une équipe.
 */
public class Equipe implements Participant {
    private boolean sexe;
    private int taille;
    private Pays nationalite;
    private Set<Athlete> coequipiers;

    /**
     * Constructeur de la classe Equipe.
     * @param sexe Sexe de l'équipe (true pour masculin, false pour féminin).
     * @param taille Taille de l'équipe (nombre d'athlètes).
     * @param natio Nationalité de l'équipe.
     */
    public Equipe(boolean sexe, int taille, Pays natio) {
        this.sexe = sexe;
        this.taille = taille;
        this.nationalite = natio;
        this.coequipiers = new HashSet<>(taille);
    }

    /**
     * Vérifie si l'équipe est masculine.
     * @return true si l'équipe est masculine, false sinon.
     */
    public boolean estMasculin() {
        return this.sexe;
    }

    /**
     * Retourne la taille de l'équipe.
     * @return La taille de l'équipe.
     */
    public int getTaille() {
        return this.taille;
    }

    /**
     * Calcule et retourne la somme des forces de tous les coéquipiers de l'équipe.
     * @return La somme des forces de l'équipe.
     */
    public int getForce() {
        int somme = 0;
        for (Athlete coequipier : this.coequipiers) {
            somme += coequipier.getForce();
        }
        return somme;
    }

    /**
     * Calcule et retourne la somme des endurances de tous les coéquipiers de l'équipe.
     * @return La somme des endurances de l'équipe.
     */
    public int getEndurance() {
        int somme = 0;
        for (Athlete coequipier : this.coequipiers) {
            somme += coequipier.getEndurance();
        }
        return somme;
    }

    /**
     * Calcule et retourne la somme des agilités de tous les coéquipiers de l'équipe.
     * @return La somme des agilités de l'équipe.
     */
    public int getAgilite() {
        int somme = 0;
        for (Athlete coequipier : this.coequipiers) {
            somme += coequipier.getAgilite();
        }
        return somme;
    }

    /**
     * Calcule et retourne la moyenne des moyennes de tous les coéquipiers de l'équipe.
     * @return La moyenne des moyennes de l'équipe.
     */
    public double getMoyenne() {
        double somme = 0;
        for (Athlete coequipier : this.coequipiers) {
            somme += coequipier.getMoyenne();
        }
        return somme / this.coequipiers.size();
    }

    /**
     * Retourne la nationalité de l'équipe.
     * @return La nationalité de l'équipe.
     */
    public Pays getNationalite() {
        return this.nationalite;
    }

    /**
     * Retourne l'ensemble des coéquipiers de l'équipe.
     * @return L'ensemble des coéquipiers de l'équipe.
     */
    public Set<Athlete> getCoequipiers() {
        return this.coequipiers;
    }

    /**
     * Ajoute un coéquipier à l'équipe.
     * @param coequipier Le coéquipier à ajouter.
     * @return true si le coéquipier a été ajouté avec succès, false sinon.
     * @throws MauvaisSexeException Si le sexe du coéquipier est différent de celui de l'équipe.
     * @throws MauvaisPaysException Si la nationalité du coéquipier est différente de celle de l'équipe.
     */
    public boolean ajouterCoequipier(Athlete coequipier) throws MauvaisSexeException, MauvaisPaysException {
        if (!(coequipier.getNationalite().equals(this.nationalite))) {
            throw new MauvaisPaysException(this.getNationalite());
        }
        if (!(coequipier.estMasculin() == this.estMasculin())) {
            throw new MauvaisSexeException(this.sexe, "équipe");
        }
        return this.coequipiers.add(coequipier);
    }

    /**
     * Enlève un coéquipier de l'équipe.
     * @param coequipier Le coéquipier à enlever.
     * @return true si le coéquipier a été enlevé avec succès, false sinon.
     */
    public boolean enleverCoequipier(Athlete coequipier) {
        return this.coequipiers.remove(coequipier);
    }

    /**
     * Vérifie l'égalité entre cette équipe et un autre objet.
     * @param o L'objet à comparer.
     * @return true si les objets sont égaux, false sinon.
     */
    public boolean equals(Object o) {
        if (o == null) {return false;}
        if (o == this) {return true;}
        if (!(o instanceof Equipe)) {return false;}
        Equipe tmp = (Equipe) o;
        return tmp.getNationalite().equals(this.nationalite) 
            && tmp.getTaille() == this.taille
            && tmp.estMasculin() == this.sexe
            && tmp.getCoequipiers().equals(this.coequipiers);
    }

    /**
     * Retourne le hashCode pour cette équipe.
     * @return Le hashCode de l'équipe.
     */
    public int hashCode() {
        int res = this.nationalite.hashCode() * 195859813;
        res += Integer.hashCode(this.taille) * 576721217;
        res += Boolean.hashCode(this.sexe) * 576721259;
        res += this.coequipiers.hashCode() * 855763367;
        return res;
    }
}
