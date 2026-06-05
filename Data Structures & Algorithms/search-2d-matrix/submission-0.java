class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=matrix[0].length-1;
        int sr=0;
        int er=matrix.length-1;
        int mr=(sr+er)/2;
        int f=0;
        int b=l;
        int m;
        while(sr<=er){
            mr=(sr+er)/2;
            if(target<matrix[mr][0]){
                er=mr-1;
            }else if(target>matrix[mr][l]){
                sr=mr+1;
            } else{
                break;
            }
        }
        while(f<=b){
            m=(f+b)/2;
            if(matrix[mr][m]==target){
                return true;
            }else if(matrix[mr][m]<target){
                f=m+1;
            }else{
                b=m-1;
            }
        }
        return false;


        
    }
}
