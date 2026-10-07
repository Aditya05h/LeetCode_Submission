class Solution {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution sol = new Solution();
        int result = sol.subtractProductAndSum(n);
        System.out.println("Result : "+result);
    }
    public int subtractProductAndSum(int n) {
    int product = 1;
    int sum = 0;
        while(n>0){
            int digit = n%10;
            product *= digit;
            sum += digit;
            n = n/10;
        }
        return product - sum;
    }
}