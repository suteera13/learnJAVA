public class tower {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(" Rod A:" + "5" + " | Rod B:" + "0"  + " | Rod C:" + "0" );
        System.out.println("===============================");
        int[] rods = new int[3];
        for (int i = 1; i <= n; i++) {
            rods[0]++;
        }
        towerOfHanoi(n, rods, "A", "C", "B");
    }

    public static void towerOfHanoi(int n, int[] rods, String from_rod, String to_rod, String aux_rod) {
        if (n == 0)
            return;
        towerOfHanoi(n - 1, rods, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        if (from_rod.equals("A")) {
            rods[0]--;
        } else if (from_rod.equals("B")) {
            rods[1]--;
        } else if (from_rod.equals("C")) {
            rods[2]--;
        }
        if (to_rod.equals("A")) {
            rods[0]++;
        } else if (to_rod.equals("B")) {
            rods[1]++;
        } else if (to_rod.equals("C")) {
            rods[2]++;
        }
        display(rods);
        towerOfHanoi(n - 1, rods, aux_rod, to_rod, from_rod);
    }

    public static void display(int[] rods) {
        System.out.println(" Rod A:" + rods[0] + " | Rod B:" + rods[1] + " | Rod C:" + rods[2]);
        System.out.println("===============================");
    }

}
