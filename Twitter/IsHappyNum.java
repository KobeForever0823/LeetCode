class IsHappyNum {
    public boolean isHappy(int n) {
        if (n == 0) return false;
        int loopNum = n;
        int loopNum2 = n;
        while (loopNum > 1) {
            loopNum = calSquare(loopNum);
            if (loopNum == 1) return true;
            loopNum2 = calSquare(calSquare(loopNum2));
            if (loopNum2 == 1) return true;
            if (loopNum == loopNum2) return false;
        }
        return true;
    }

    public int calSquare(int num) {
        int res = 0;
        while (num > 0) {
            int tmp = num % 10;
            res += tmp * tmp;
            num /= 10;
        }
        return res;
    }
}