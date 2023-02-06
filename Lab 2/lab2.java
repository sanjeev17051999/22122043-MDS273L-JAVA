import java.util.Scanner;

class lab2{

    public static int searchName(String[] Names , String str){
        int index = 0 ;
        do{
            if (Names[index].equals(str)){
                return index;
            }
           
            index++;
        }while( index <= Names.length);

        return -1;
    }


    public static String[] enterName(String[] Arr , String name){
        String[] newArr = new String[Arr.length + 1];
        for (int i = 0; i < Arr.length; i++) {
            newArr[i] = Arr[i];
        }

        newArr[Arr.length] = name;
        System.out.println(name+ " Added Sucessfully");  
        return newArr;
    }

    public static String[] removeName(String[] Arr, int index)
    { String name = Arr[index];
        String[] newArr = new String[Arr.length - 1];
        for (int i = 0, k = 0; i < Arr.length; i++) {
            if (i == index) {
                continue;
            }
            newArr[k++] = Arr[i];
        }
        System.out.println(name+ " Removed Sucessfully"); 
        return newArr; 
    }

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String[] Names = new String[3];
        Names[0] ="Sourabh" ;
        Names[1] ="Sphurti"; 
        Names[2] = "Sreejesh";

        do{ 
            System.out.println("**************************************");
            System.out.println("Press 1 to Enter a name"); 
            System.out.println("Press 2 to Search for a name"); 
            System.out.println("Press 3 to Remove a name");
            System.out.println("Press 0 to exit");
            System.out.println("**************************************");

            int Choice = Integer.parseInt(scan.nextLine());

            switch(Choice){
                case 0 :
                return;
                case 1:
                //ENTERING NAME IN ARRAY
                System.out.println("Enter Name that you want to Add");
                String inpName = scan.nextLine();

                Names = enterName(Names, inpName);
                break;

                case 2:
                // SEARCHING NAME IN ARRAY
                System.out.println("Enter Name that you want to Search");
                String  input = scan.nextLine();
                int index  = searchName(Names,input); 

                if (index != -1){
                    System.out.println (input + " Does exist at "+ index + " Index");

                }else{System.out.println (input + " Does not exist");}
                break;

                case 3 :
                // REMOVING NAME FROM ARRAY
                System.out.println("Enter Name that you want to Remove");
                String rmName = scan.nextLine();
                index = searchName(Names, rmName);
                if (index != -1){
                    Names = removeName(Names, index);

                }else{System.out.println (rmName + " Does not exist");}
                break;
                



            }


        }while(true);

    
    }


}
