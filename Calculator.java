public class Calculator {
    int x;
    int y;
    

    Calculator(int x) {
        this.x = x;
    }

    Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static int abs( int x) {
        int abs = 0;
        if (x < 0) {
            abs = -x;
            return abs;
        }
        else {
            abs = x;
            return abs;
        }
    }

    public static int max(int x, int y) {
        int max = 0;
        if (x >= y) {
            max = x;
            return max;
        }
        else {
            max = y;
            return max;
        }
    }

    public static int min(int x, int y) {
        int min = 0;
        if (x <= y) {
            min = x;
            return min;
        }
        else {
            min = y;
            return min;
        }
    }
}
