package hanoigame.creator;

import hanoielements.HanoiRing;
import hanoielements.HanoiStage;

import java.util.ArrayList;
import java.util.List;

public class HanoiCreator {

    private static final Integer NUMBER_OF_STAGES = 3;

    private final List<HanoiStage> hanoiStageList = new ArrayList<>();
    private final List<HanoiRing> hanoiRingList = new ArrayList<>();

    public static HanoiCreator prepareHanoiElements(int numberOfCircles) {
        HanoiCreator hanoiCreator = new HanoiCreator();
        hanoiCreator.prepareStages();
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

        HanoiStage first = hanoiStageList.get(0);
        first.addAllRings(hanoiRingList);
    }

    private void prepareStages() {
        for (int i = 0; i < HanoiCreator.NUMBER_OF_STAGES; i++) {
            char[] value = Character.toChars(i + 65);
            String valueToAdd = String.valueOf(value);
            hanoiStageList.add(new HanoiStage(valueToAdd));
        }
    }
}
