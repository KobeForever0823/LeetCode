class TwoSum {
    public int[] solution(int[] numbers, int target) {
        int length = numbers.length;
        int i = 0, j = length - 1;
        int[] res = new int[2];
        while (i < j) {
            if (numbers[i] + numbers[j] < target) i++;
            else if (numbers[i] + numbers[j] > target) j--;
            else {
                res[0] = i + 1;
                res[1] = j + 1;
                break;
            }
        }
        return res;
    }
}