import java.util.List;

public class Pays {
    private String nom;
    private List<Participant> listeParticipants; 

    public Pays(String nom) {
        this.nom = nom;
        this.listeParticipants = new ArrayList<>();
    } 

    public boolean ajouterParticipant(Participant participant) {
        return this.listeParticipants.add(participant);
    }   

    public int getIndiceParticipant(Participant participant) {
        return this.listeParticipants.indexOf(participant);
    }

    public boolean enleverParticipant(int indice) {
        return this.listeParticipants.remove(indice);
    }
}
