public class IfStatementAPP {
    public static void main(String[] args) {
        quarEuqa(1,5,1);
    }


    //2. Write a Java program to solve quadratic equations (use if, else if and else).
    //一元二次方程格式如下：ax^2 + bx + c = 0 (a≠0)
    //Test Data
    //Input a: 1
    //Input b: 5
    //Input c: 1
    //Expected Output :
    //The roots are -0.20871215252208009 and -4.7912878474779195


    public static void quarEuqa(int a,int b,int c){
        double judge = b*b - 4*a*c;
        double root1,root2;
        if(judge>0){
            root1 = (-b + Math.sqrt(judge)) / 2*a;
            root2 = (-b - Math.sqrt(judge)) / 2*a;
            System.out.println("The roots are "+root1+" and "+root2);
        } else if (judge == 0) {
            root1 = (double) -b / (2*a);
            root2 = root1;
            System.out.println("The roots are "+root1+" and "+root2);
        }
        else {
            System.out.println("no root");
        }
    }
}
