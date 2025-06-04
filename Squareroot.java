public class Squareroot {
    static int sqBinarySaerch(int n){
        int s=0;
        int e=n;
        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            int square = mid*mid;
            if(square==n){
                // We are out of range, go to the left to find the answer
                return mid;
            }
            else if(square < n){
                //Start the ans & move to the right
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sqBinarySaerch(36));
    }
}
