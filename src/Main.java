import java.util.Stack;
import java.util.Arrays;

public class Main {
	public static void main(String...args) {
	}
}


final class FishProblemSolution {
	public static int solution(int[] A, int[] B) {
		Stack<Integer[]> downstreamFish = new Stack<Integer[]>();
		int N = A.length;
		for(int i = 0; i < N; i++) {
			if (B[i] == 1) {
				Integer[] fishToAdd = {i, A[i]};
				downstreamFish.push(fishToAdd);
			} else {
				while(!downstreamFish.empty()) {
					Integer[] topFish = downstreamFish.peek();
					if (topFish[1] < A[i]) {
						A[topFish[0]] = 0;
						downstreamFish.pop();
					} else {
						A[i] = 0;
						break;
					}
				}
			}
		}
		int count = 0;
		for(int i = 0; i < A.length; i++) {
			if (A[i] != 0) {
				count += 1;
			}
		}
		return count;
	}
}