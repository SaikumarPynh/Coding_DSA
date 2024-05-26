// class setMaatrixToZero {
//     public void setZeroes(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;
//        for(int i = 0;i<m;i++) {
//         for(int j = 0;j<n;j++){
//             if(matrix[i][j] == 0){
//                 setRowZero(i,n,matrix);
//                 setColZero(j,m,matrix);
//             }
//         }
//        }
       
//        for(int o = 0;o<m;o++){
//         for(int p = 0;p<n;p++){
//             if(matrix[o][p] == -1){
//                 matrix[o][p] = 0;
//             }
//         }
//        }

//     }
//     public void setRowZero(int i,int n,int[][] matrix){
//             for(int k = 0;k<n;k++){
//                 matrix[i][k] = -1;
//             }
//        }
//        public void setColZero(int j,int m,int[][] matrix){
//         for(int l = 0;l<m;l++){
//             matrix[l][j] = -1;
//         }
//        }
// }
class Solution {
    public void setZeroes(int[][] matrix) {
    int rlen = matrix.length;
    int clen = matrix[0].length;
    boolean[] rows = new boolean[rlen];
    boolean[] cols = new boolean[clen];
    for(int i = 0;i<rlen;i++){
        for(int j = 0;j<clen;j++){
            if(matrix[i][j] == 0){
                rows[i] = true;
                cols[j] = true;
            }
        }
    }
    for(int i = 0;i<rlen;i++){
        for(int j = 0;j<clen;j++){
        if(rows[i] || cols[j]){
            matrix[i][j] = 0;
        }

        }
    }

}
}