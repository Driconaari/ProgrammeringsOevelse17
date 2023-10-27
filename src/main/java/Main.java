import java.util.List;

public class Main {
    public static void main(String[] args) {
        Election election = new Election();

        Candidate candidate1 = new Candidate("kandidat 1" , "parti A", 1000);
        Candidate candidate4 = new Candidate("kandidat 4" , "parti A", 3000);
        Candidate candidate2 = new Candidate("kandidat 2" , "parti B", 2300);
        Candidate candidate3 = new Candidate("kandidat 3" , "parti C", 8200);


        election.addCandidate(candidate1);
        election.addCandidate(candidate2);
        election.addCandidate(candidate3);
        election.addCandidate(candidate4);


        int totalVotes = election.getTotalVotes();
        System.out.println("Total number of votes" + totalVotes);

        List<Candidate> partyACandidates = election.getCandidatesFromParty("Parti A");
        System.out.println("Candidates from Parti A: ");
        for (Candidate candidate : partyACandidates) {
            System.out.println(candidate.getName() + " ( " + candidate.getParty() + " )" + candidate.getNumberOfVotes());
        }

    }
}
