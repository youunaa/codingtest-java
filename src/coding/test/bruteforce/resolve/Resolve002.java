package src.coding.test.bruteforce.resolve;

public class Resolve002 {

    public void execute() {
        int[] answers = {1,2,3,4,5,3,2,4,2,5,9,1,2}; 
        
        solution(answers);
    }
    /**
     * 완전탐색 - 모의고사
     * @param answers : 정답 최대 1000문제
     * @return 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
     */
    public int[] solution(int[] answers) {
        int[] answer;
        
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{2,1,2,3,2,4,2,5};
        int[] c = new int[]{3,3,1,1,2,2,4,4,5,5};
        
        int[] score = new int[3];

        // score[]에 수포자별 맞힌 갯수
        for(int i=0; i<answers.length; i++){
            if(answers[i] == a[i%5])  score[0]++; 
            if(answers[i] == b[i%8])  score[1]++;
            if(answers[i] == c[i%10]) score[2]++;
        }
        
        // 가장 높은 점수
        int max = 0;
        for(int i=0; i<3; i++){
            if(score[i] > max){ max = score[i]; }
        }
        
        // 가장 높은 점수를 받은 사람 수
        int maxCount = 0;
        for(int i=0; i<3; i++){
            if(score[i] == max){ maxCount++; } 
        }

        answer = new int[maxCount];
        int idx = 0;
        for(int i=0; i<3; i++){
            if(score[i] == max) answer[idx++] = i+1;
        }
        
        return answer;
    }

}