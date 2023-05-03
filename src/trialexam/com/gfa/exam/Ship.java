package trialexam.com.gfa.exam;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private List<Pirate> crew;

    public Ship() {
        crew = new ArrayList<>();
    }

    public boolean addPirate(Pirate pirate) {
        if (pirate instanceof Captain) {
            for (Pirate p : crew) {
                if (p instanceof Captain) {
                    return false;
                }
            }
        }
        crew.add(pirate);
        return true;
    }

    public int getCrewSize() {
        return crew.size();
    }

    public List<String> getPoorPirates() {
        List<String> poorPirates = new ArrayList<>();
        for (Pirate p : crew) {
            if (p.isPoor()) {
                poorPirates.add(p.getName());
            }
        }
        return poorPirates;
    }

    public int getTotalGold() {
        int totalGold = 0;
        for (Pirate p : crew) {
            totalGold += p.getGoldAmount();
        }
        return totalGold;
    }

    public void lastDayOnTheShip() {
        for (Pirate p : crew) {
            p.party();
        }
    }

    public void prepareForBattle() {
        for (int i = 0; i < 5; i++) {
            for (Pirate p : crew) {
                p.work();
            }
        }
        lastDayOnTheShip();
    }
}
