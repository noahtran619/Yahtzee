public class Yahtzee
{
    private Die6 die1;
    private Die6 die2;
    private Die6 die3;
    private Die6 die4;
    private Die6 die5;

    public Yahtzee() {
        this.die1 = new Die6();
        this.die2 = new Die6();
        this.die3 = new Die6();
        this.die4 = new Die6();
        this.die5 = new Die6();
        this.Roll();
    }

    public void Roll(int dieNumber) {
        if (dieNumber == 1) {
            this.die1.roll();
        } else if (dieNumber == 2) {
            this.die2.roll();
        } else if (dieNumber == 3) {
            this.die3.roll();
        } else if (dieNumber == 4) {
            this.die4.roll();
        } else if (dieNumber == 5) {
            this.die5.roll();
        }
        return;
    }

    public void Roll() {
        this.die1.roll();
        this.die2.roll();
        this.die3.roll();
        this.die4.roll();
        this.die5.roll();
    }

    public String AllValues() {
        return "Dice values:"+" "+die1.getValue()+" "+die2.getValue()+" "+die3.getValue()+" "+die4.getValue()+" "+die5.getValue();  
    }

    public void summarize() {
        int[] values = {die1.getValue(),die2.getValue(),die3.getValue(),die4.getValue(),die5.getValue()};
        int howMany;
        for(int k = 1; k <= 6; k++) {
            howMany = 0;
            for(int i = 0; i < values.length; i++) {
                if(values[i] == k) {
                    howMany++;
                }
            }
            System.out.println(k + "-" + howMany + ";");
        }
    }
}