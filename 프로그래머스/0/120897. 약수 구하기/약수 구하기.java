class Solution {
    public int[] solution(int n) {
        int a = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				a++;
			}
		}
		int [] answer = new int[a];
		int k = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer[k] = i;
				k++;
			}
		}

        for (int i = 1; i < answer.length; i++) {
			for (int j = 0; j < i; j++) {
				if (answer[i] < answer[j]) {
					int temp = answer[i];
					answer[i] = answer[j];
					answer[j] = temp;
				}
			}
		}
        return answer;
    }
}