public class stringSearch {
    void searchNumber(){
        int check = 0;
        int a[] = {1,2,3,4,5};
        int find = 4;
        for(int i=0; i<a.length ; i++){
            if(a[i] == find){
                check = 1;
            }
        }
        if(check == 1){
            System.out.println("number is present");
        }
        else{
            System.out.println("number is not present");
        }
    }
   void find(){
        String a[] = { "sumit", "katkar", "sayali", "jagdale"};
        int check = 0;
        String find = "sumit";

        for(int i=0; i< a.length;i++){
            if(a[i]==find){
                check = 1;
            }
        }
        if(check == 1){
            System.out.println("String is present");
        }
        else{
            System.out.println("String is not present");
        }

    }

    void CharFind(){
       String a = "Sumit";
       char find = 'u';
       int check = 0;

       for(int i=0; i<a.length(); i++){
           if(find == a.charAt(i)){
               check = 1;
           }
       }
       if(check == 1){
           System.out.println("char is present");
       }
       else {
           System.out.println("char is not present");
       }
    }

    void range(int start, int end){
       int a[] = {20, 12, 13, 15, 18, 21};
       int check = 0;
       int find = 13;
       for(int i=start; i<end; i++){
           if(find == a[i]){
               check = 1;
           }
       }
       if(check == 1){
           System.out.println("number is present in that range");
       }
       else{
           System.out.println("number is present in that range");
       }
    }

    void min(int find){
        int a[] = {20, 12, 13, 15, 18, 21};
        int check = 0;

        for(int i=0; i<a.length; i++){
            if(a[i] < find ){
                find = a[i];
                check = 1;
            }
        }
        if(check == 1){
            System.out.println("minimum number is = "+find);
        }
        else{
            System.out.println("minimum number is not present");
        }
    }

    void twoDArray(){
        int a[][] = {
                {20, 12, 13, 15, 18, 21},
                 {1,2,3,4,5},
                {20,30,40},
                {23,34,66,12}
        };
        int find = 66;
        int check = 0;
        for(int row=0; row < a.length; row++){
            for(int col=0; col<a[row].length; col++){
                if(a[row][col] == find){
                    check = 1;
                }
            }
        }
        if(check == 1){
            System.out.println("number is present ");
        }
        else {
            System.out.println("number is present ");
        }
    }

    void evenNumber(){
        int a[] = {11,13,12,44,33};
        int check = 0;
        int  count = 0;
        for(int i=0; i<a.length;i++){
            if(a[i] % 2 == 0){
                check = 1;
                count++;
            }
        }
        if(check == 1){
            System.out.println("even number count in array is = "+count);
        }
        else{
            System.out.println("even number count in array is = "+count);
        }
    }

    void additionOfArray(){
        int a[] = {11,13,12,44,33};
        int addtion = 0;
        for(int i =0; i<a.length;i++){
            addtion = addtion+ a[i];
        }
        System.out.println("addtion of arryas number is = "+addtion);
    }

    void additionOfTwoDArray(){
        int a[][] = {
                {11,13,12,44,33},
                {1,2,3,4,5}
        };
        int addition = 0;
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[row].length; col++){
                addition += a[row][col];
            }
        }
        System.out.println("addition of two d array is = " +addition);
    }
}
