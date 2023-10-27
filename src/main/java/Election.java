import java.util.ArrayList;
import java.util.List;

public class Election {

    private List<Candidate> candidates;

    public Election() {
        candidates = new ArrayList<>();
    }

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    public int getTotalVotes(){
        int totalVotes= 0;
        for (Candidate candidate : candidates) {
            totalVotes += candidate.getNumberOfVotes();
        }

        return totalVotes;


    }

    public List<Candidate> getCandidatesFromParty(String party) {
        List<Candidate> partyCandidates = new ArrayList<>();
        for (Candidate candidate : candidates) {
            if (candidate.getParty().equals(party)) {
                partyCandidates.add(candidate);
            }
        }
        return candidates;
    }
}
