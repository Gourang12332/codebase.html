public class package.functions {
public static void Area(int arr[][] , int row1,int row2){
int x1 = arr[row1][0];
int y1 = arr[row1][1];
int x2 = arr[row2][0];
int y2 = arr[row2][1];
int x3 = arr[row2+1][0];
int y3 = arr[row2+1][1];
double area = 0.5*(x1*(y2-y3)-x2*(y1-y3) + x3*(y1-y2));
System.out.println("The area of the Traingle is : " + area);
} 
}
