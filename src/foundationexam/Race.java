package foundationexam;

import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Race {
    private final List<Contestant> contestants;
    private final List<Player> players;

    public Race(List<Contestant> contestants, List<Player> players) {
        this.contestants = contestants;
        this.players = players;
    }

    public void startRace() {
        Random random = new Random();
        int[] placements = new int[contestants.size()];
        for (int i = 0; i < placements.length; i++) {
            int placement;
            do {
                placement = random.nextInt(contestants.size()) + 1;
            } while (contains(placements, placement));
            placements[i] = placement;
            contestants.get(i).setPlacement(placement);
        }

        contestants.sort(Comparator.comparingInt(Contestant::getPlacement));
        for (Contestant contestant : contestants) {
            System.out.println(contestant.toString());
        }

        for (Player player : players) {
            Bet bet = (Bet) player.getBets();
            if (bet != null) {
                Contestant contestant = bet.getContestant();
                if (contestant.getPlacement() == 1) {
                    int winnings = bet.getAmount() * 2;
                    player.addMoney(winnings);
                    System.out.println(player.getName() + " has won " + winnings + "$ with the bet: " + bet.getBetId());
                }
            }
        }
    }

    private boolean contains(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
