class Solution {
    public int solution(int n, int k) {
        int yangkkochi = 12000;
        int drink = 2000;
        int service = n/10;
        int answer = (n*yangkkochi)+(k*drink)-(service*drink);
        return answer;
    }
}