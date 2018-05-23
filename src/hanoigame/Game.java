package hanoigame;

import hanoigame.creator.HanoiCreator;

public class Game {

    public static void main(String[] args) {
        HanoiCreator hanoiCreator = HanoiCreator.prepareHanoiElements(3, 5);
        HanoiSolver solver = new HanoiSolver();
        solver.solve(hanoiCreator.getHanoiStageList(), hanoiCreator.getHanoiRingList().size());
    }


}
