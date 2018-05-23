package hanoielements;

import java.util.ArrayList;
import java.util.List;

public class HanoiStage {

    private final String stageLetter;
    private final List<HanoiRing> rings = new ArrayList<>();

    public HanoiStage(String stageLetter) {
        this.stageLetter = stageLetter;
    }

    public void addRingToStage(HanoiRing ring) {
        rings.add(ring);
    }

    public void addAllRings(List<HanoiRing> ringsToAdd) {
        rings.addAll(ringsToAdd);
    }

    public HanoiRing getRingFromStage() {
        HanoiRing ring = rings.get(0);
        rings.remove(ring);
        return ring;
    }

    public String printStageValue() {
        return "Stage " + stageLetter;
    }

    public int getRingCount() {
        return rings.size();
    }
}
