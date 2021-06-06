package cz.tul.alg.matpech.oop;

public class RunnerApp {
    public static void main(String[] args) {

        Runner[] marathon = new Runner[]{
                new Runner(7500, "Josef", "Novák", 1),
                new Runner(7565, "František", "Sova", 4),
                new Runner(7426, "Jiří", "Rychlý", 8)
        };
        int fastestTime = Integer.MAX_VALUE;
        Runner fastestRunner;

        for (int i = 0; i < marathon.length; i++) {
            if(marathon[i].getTime() < fastestTime)
            {
                fastestRunner = marathon[i];
                if(i == marathon.length-1)
                {
                    System.out.println(fastestRunner);
                }
            }
        }
        for (int i = 0; i < marathon.length; i++) {
            if(marathon[i].getTime() < 7620)
            {
                System.out.println(marathon[i]);
            }
        }
    }
    public static double avgSpeed(int time)
    {
        return ((42.195 / time) * 3600);
    }

    /*public static String underTime(Runner[] marathon)
    {

    }*/
}
