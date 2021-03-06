package 최윤정;
/*
 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
 * 
 * 
 * 
 * a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
 * a와 b의 대소관계는 정해져있지 않습니다. 
 */

/*
 * 유준혁 멘토 덧댐 2020.02.10 00:24
 * ---------------------------
 * 일반적인 방법.
 * 작은 수 부터 큰 수 까지 모두 더하는 방법.
 */

class Solution_12912 {
	public long solution(int a, int b) {
		long result = 0;
		for(int i = Math.min(a, b);i<=Math.max(a,b);i++) {
			result += i;
		}
		return result;
	}

	public static void main(String[] args) {
		Solution_12912 s = new Solution_12912();
		System.out.println(s.solution(3, 5));
		System.out.println(s.solution(3, 3));
		System.out.println(s.solution(5, 3));
	}
}
