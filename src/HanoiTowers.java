import java.util.Scanner;

class HanoiTowers {

    private int counter = 0;

    private void solvePuzzle(int numberOfDisks, String startStage, String auxiliaryStage, String endStage) {
        counter++;
        if(numberOfDisks == 1) {
            System.out.println(numberOfDisks + ": " + startStage + " -> " + endStage);
        }
        else {
            solvePuzzle(numberOfDisks - 1, startStage, endStage, auxiliaryStage);
            System.out.println(numberOfDisks + ": " + startStage + " -> " + endStage);
            solvePuzzle(numberOfDisks - 1, auxiliaryStage, startStage, endStage);
        }
    }


    public static void main(String[] args) {
        HanoiTowers hanoiTowers = new HanoiTowers();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int numberOfDisks = input.nextInt();
        hanoiTowers.solvePuzzle(numberOfDisks, "A", "B", "C");
        System.out.println("Total moves needed: " + hanoiTowers.counter);
    }
}
