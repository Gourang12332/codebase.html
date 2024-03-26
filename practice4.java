import java.util.Stack;
class practice4{
 public static int precedence(char item){
 if(item == '*' || item == '/'){
    return 2;
 } else if (item == '+' || item == '-'){
    return 1;
 } else if(item == '('){
    return 3;
 } else return -1;
 }
 
public static void main(String[] args) {
    String str = "5*(6+2)-12/4";
    String ans = " ";
    Stack <Integer> st = new Stack<>();
    st.push(precedence('('));
    for(int i = 0 ;i<str.length() ;i++){
    if(str.charAt(i) != '+' && str.charAt(i) != '*' && str.charAt(i) != '/' && str.charAt(i) != '-'){
     ans+=str.charAt(i);
    }
    else if(str.charAt(i) == '('){
        st.push(precedence('('));
    }
    else if(str.charAt(i) == '+' || str.charAt(i) == '*' || str.charAt(i) == '/' || str.charAt(i) == '-'){
      while(st.peek()<precedence(str.charAt(i)) && st.peek() != '('){
        ans += convert(st.pop());
      }
      st.push(precedence(str.charAt(i)));
        
    } else if(str.charAt(i) == ')') {
      while(st.peek()!=precedence('(')){
        ans += covert(st.pop());
      }
      st.pop();
    }
    }   
    System.out.println(ans);
}

}