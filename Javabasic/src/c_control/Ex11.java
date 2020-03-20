package c_control;
import java.util.Scanner;
public class Ex11 {
private static Scanner input;
public static void main(String[] args) {



// 3개의 정수 비교
input = new Scanner(System.in);
System.out.print("첫번째 수를 입력->");
int a = input.nextInt();
System.out.print("두번째 수를 입력->");
int b = input.nextInt();
System.out.print("세번째 수를 입력->");
int c = input.nextInt();

int max = (a>b && a>c)? a:((b>c)? b:c);
int min = (a<b && a<c)? a:((b<c)? b:c);
int mid = ((c != max) && (c != min))? c:((b != max) && (b != min))? b:((b==c || b==a))? b:a;


// c가 최소최대에 사용되지 않았다면 중간값=c
// c가 사용 되었을 경우 b를 검사하여 b가 사용되지 않았다면 중간값=b
// c,b 모두 사용 되었고, b가 c와a중에 중복이 있을경우 b (중복이 있을경우 a,c중에 각각 최소최대가 존재하기에 b가 어느값이든 중간값이 된다.)
// 중복이 없을경우 a (중복이 없는경우 c와 b가 각각 최소 최대가 되기때문에 자동으로 a가 중간값)
System.out.println("max: "+max);
System.out.println("mid: "+mid);
System.out.println("min: "+min);

}

}