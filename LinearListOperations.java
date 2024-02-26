import java.util.Scanner;

public class LinearListOperations {
    private static final int LIST_SIZE = 30;
    private static int[] element;
    private static int top = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n\n basic operations in linked list......");
            System.out.println("1. create new list\t2. modify list \t3. view list");
            System.out.println("4. Delete first\t5. Insert last\t6. Insert middle ");
            System.out.println("7. Delete first\t8. Delete last \t9.Delete middle");
            System.out.println("Enter the choice 1 to 10");
            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    top = -1;
                    System.out.println("Enter the limit (how many elements):");
                    int n = scanner.nextInt();
                    element = new int[LIST_SIZE];
                    for (int i = 0; i < n; i++) {
                        System.out.println("enter the element [" + (i + 1) + "]:");
                        element[++top] = scanner.nextInt();
                    }
                    break;
                case 2:
                    if (top == -1) {
                        System.out.println("linear list is empty:");
                        break;

                    }
                    System.out.println("enter the element for modification:");
                    int moddata=scanner.nextInt();
                    int found=0;
                    for(int i=0;i<=top;i++){
                        if(element[i]==moddata){
                            found=1;
                            System.out.println("enter the new element:");
                            element[i]=scanner.nextInt();
                            break;
                        }
                    }
                    if(found==0){
                        System.out.println("element"+moddata+"not found");
                        break;

                    }
                    break;
                case 3:
                if(top==-1){
                    System.out.println("\nlinear list is empty:");
                }
                else if(top==LIST_SIZE-1)
                System.out.println("\nlinear list is full:");
                for(int i=0;i<=top;i++)
                    System.out.println("element["+(i+1)+"]is-->"+element[i]);
                    break;

                
                case 4:
                if(top==LIST_SIZE-1){
                    System.out.println("linear list is full");
                    break;
                }
                top++;
                for(int i=top;i>0;i++)
                    element[i]=element[i-1];
                    System.out.println("enter the element:");
                    element[0]=scanner.nextInt();
                    break;
                
                case 5:
                if(top==LIST_SIZE-1){
                    System.out.println("linear list is full:");
                    break;
                }
                System.out.println("enter the element:");
                element[++top]=scanner.nextInt();
                break;

                case 6:
                if(top==LIST_SIZE-1)
                System.out.println("linear list is Full:");
                else if(top==-1)
                System.out.println("linear list is empty:");
                else{
                    found=0;
                    System.out.println("enter the element after which the insertion is to be made:");
                    int insdata=scanner.nextInt();
                    for(int i=0;i<=top;i++)
                        if(element[i]==insdata){
                            found=1;
                            top++;
                            for(int j=top;j>i;j--){
                                element[j]=element[j-1];
                            }
                            System.out.println("enter the element:");
                            element[i+1]=scanner.nextInt();
                            break;
                        }
                        if(found==0)
                        System.out.println("element"+insdata+"Not found");
                        
                    }
                    break;
                    
                case 7:
                if(top==-1){
                    System.out.println("linear list is empty:");
                    break;
                }
                System.out.println("deleted data--> element:"+element[0]);
                top--;
                for(int i=0;i<=top;i++)
                element[i]=element[i+1];
                break;

                case 8:
                if(top==-1)
                    System.out.println("linear list is empty:");
                else
                System.out.println("deleted data-->element:"+element[top-1]);
                break;
                
                case 9:
                if(top==-1){
                    System.out.println("linear list is empty:");
                    break;
                }
                System.out.println("enter the element for deletion:");
                int deldata=scanner.nextInt();
                found=0;
                for(int i=0;i<=top;i++)
                if(element[i]==deldata){
                    found=1;
                    System.out.println("deleted data--> element:"+element[i]);
                    top--;
                    for(int j=i;j<=top;j++)
                      element[j]=element[j+1];
                      break;


                }
                if(found==0)
                System.out.println("element"+deldata+"not found");
                break;

                default:
                System.out.println("end of run of your program......");
                scanner.close();
                System.exit(0);
                



                    

                }
              


            
        }
    }
}