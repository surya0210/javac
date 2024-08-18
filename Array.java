public class Array {
    
    public static void main(String[] a){
         int nums[]={1,2,3,4};
        //  System.out.println(nums[0]);

         nums[0]=6;
        //  System.out.println(nums[0]);


        int nums1[]=new int[4];

        // for (int i :nums){
        //     System.out.print(i+" ");
        // }
         
        // System.out.println(nums1[0]);

        // for (int i=0;i<=3;i++){
        //     System.out.println(nums1[i]);
        // }


        int multinums[][]=new int[4][4];


        // System.out.println(multinums[0][0]);
        // for (int i=0;i<4;i++){
        //     for (int j =0;j<4;j++){
        //         multinums[i][j]= (int) (Math.random()*100);
        //         System.out.print(multinums[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // // System.out.println(multinums[3][3]);




        // for (int n[]:multinums){
        //     for (int j:n){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        int jaggedArray[][]=new int[3][];


        jaggedArray[0]= new int[3];
        jaggedArray[1]= new int[2];
        jaggedArray[2]= new int[4];

        for (int i=0;i<jaggedArray.length;i++){
            System.out.println(jaggedArray[i].length+"->57"); 
            for (int j=0;j<jaggedArray[i].length;j++){
                
                jaggedArray[i][j]=(int) (Math.random()*10);
                System.out.print(jaggedArray[i][j]+" ");
            }
        System.out.println();
        }
    }



    
    
}
