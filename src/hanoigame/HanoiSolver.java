package hanoigame;

import hanoielements.HanoiRing;
import hanoielements.HanoiStage;

import java.util.List;

class HanoiSolver {

    private int counter = 0;

    void solve(List<HanoiStage> stages, int numberOfRings) {

        HanoiStage first = stages.get(0);
        HanoiStage second = stages.get(1);
        HanoiStage last = stages.get(2);


        recursiveSolve(numberOfRings, first, second, last);
        System.out.println("Rings on first stage: " + first.getRingCount());
        System.out.println("Rings on last stage: " + last.getRingCount());
        System.out.println("Total moves: " + counter);
    }

    private void recursiveSolve(int numberOfRings, HanoiStage first, HanoiStage second, HanoiStage last) {
        counter += 1;

        if (numberOfRings == 1) {
            swapRingBetweenStages(first, last);
            printSwapping(numberOfRings, first, last);
        } else {
            recursiveSolve(numberOfRings - 1, first, last, second);
            swapRingBetweenStages(first, last);
            printSwapping(numberOfRings, first, last);
            recursiveSolve(numberOfRings - 1, second, first, last);
        }

    }

    private void swapRingBetweenStages(HanoiStage first, HanoiStage second) {
        HanoiRing ring = first.getRingFromStage();
        second.addRingToStage(ring);
    }

    private void printSwapping(int numberOfRings, HanoiStage first, HanoiStage last) {
        System.out.println("Ring no. " + numberOfRings + ": " + first.printStageValue() + " -> " + last.printStageValue());
    }
}
