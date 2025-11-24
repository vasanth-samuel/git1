class arrays {
    public static void main(String[] args) {
       
       // array declaration
     /*    int a[]={33,3,4,5};
           System.out.println(a[1]); 
    
      // Changing array
         int a[]={33,3,48,5};
         System.out.println(a[0]); 
         a[2] =1222;
         System.out.println("After" +a[2]);  
    
     // length of the array
         int a[]={33,3,4,5,8,6};
         int length = a.length;
         System.out.println("Length" +length);
    
     // declares an Array of integers.
         int[] arr;
         arr = new int[8];
             arr[0] = 10;
             arr[1] = 20;
             arr[2] = 30;
             arr[3] = 40;
             arr[4] = 50; 
             arr[5] = 58;
             arr[6] = 45;
             arr[7] = 95;
             for (int i = 0; i < arr.length; i++) 
         System.out.println("Element at index "+ i + " : " + arr[i]); 


    // two dimensional array
           int[][] arr = new int[1][9];
           System.out.println("Rows : " + arr.length);
           System.out.println("Columns : " + arr.length);
           int arrr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };
             for (int i = 0; i < 3; i++)   // i=2 2<3 3
              { 
              for (int j = 0; j < 3; j++)   // j=2 2<3 3
              { 
             System.out.print(arrr[i][j] + " "); 
              }
         System.out.println();   
            }

     String[] cars = {"Royal Enfield", "BMW", "Java", "Hero"};
     for (int i = 0; i < cars.length; i++)
          {
             System.out.println(cars[i]);
          }
     
     
         int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
         System.out.println(myNumbers[1][1]); */



   int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7, 8} };
    myNumbers[0][1] = 22;
    System.out.println(myNumbers[0][2]);
    for (int i = 0; i < 3; i++) { // i=2 2<3 3
            for (int j = 0; j < 4; j++) { // j=2 2<3 3
                System.out.print(myNumbers[i][j] + " "); 
            }   
          System.out.println();

         }
    }
}

    

