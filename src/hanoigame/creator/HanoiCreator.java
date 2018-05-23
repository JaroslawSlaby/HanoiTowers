package hanoigame.creator;

import hanoielements.HanoiRing;
import hanoielements.HanoiStage;

import java.util.ArrayList;
import java.util.List;

public class HanoiCreator {

    private final List<HanoiStage> hanoiStageList = new ArrayList<>();
    private final List<HanoiRing> hanoiRingList = new ArrayList<>();

    public static HanoiCreator prepareHanoiElements(int numberOfStages, int numberOfCircles) {
        HanoiCreator hanoiCreator = new HanoiCreator();
        hanoiCreator.prepareStages(numberOfStages);
        hanoiCreator.prepareCircles(numberOfCircles);
        return hanoiCreator;
    }

    public List<HanoiStage> getHanoiStageList() {
        return hanoiStageList;
    }

    public List<HanoiRing> getHanoiRingList() {
        return hanoiRingList;
    }

    private void prepareCircles(int numberOfCircles) {

        for (int i = 0; i < numberOfCircles; i++) {
            hanoiRingList.add(new HanoiRing(i + 1));
        }

        hanoiStageList.get(0).addAllRings(hanoiRingList);
    }

    private void prepareStages(int numberOfStages) {
        for (int i = 0; i < numberOfStages; i++) {
            hanoiStageList.add(new HanoiStage(String.valueOf(Character.toChars(i + 65))));
        }

    }
}
