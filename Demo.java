
1. Check Sum of Odd Digits
Sample Input 1:
56895
Sample Output 1:
Sum of odd digits is odd.
Sample Input 2:
84228
Sample Output 2:
Sum of odd digits is even.
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int r=UserMainCode.checkSum(n);
if(r==1)
{
System.out.println("The sum of odd digits are odd");
}
else
{
System.out.println("The sum of odd digits are even");
}
s.close();
}
}
USERMAINCODE:
public class UserMainCode { public static int checkSum(int n)
{
int n1;
int sum=0;
int r;
while(n!=0)
{
n1=n%10;
if(n1%2!=0)
{
sum=sum+n1;
}
n=n/10;
}
if(sum%2==0)
{
r=-1;
}
else
{
r=1;
} return r;
}
}

2. Number Validation
Sample Input 1:
123-456-7895
Sample Output 1:
Valid number format
Sample Input 2:
-123-12344322
Sample Output 2:
Invalid number format
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String number=s.next(); int r=UserMainCode.validateNumber(number); if(r==1)
{
System.out.println("Valid number format“);
}
else
{
System.out.println("Invalid number format");
}
s.close();
}
}

USERMAINCODE:

import java.util.*;
public class UserMainCode { public static int validateNumber(String number)
{
int b;
if(number.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
{
b=1;
}
else
{
b=0;
} return b;
}
}

3. Sum of Squares of Even Digits
Sample Input 1:
56895
Sample Output 1:
100
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(UserMainCode.sumOfSquaresOfEvenDigits(n));
s.close();
}
}
USERMAINCODE:
public class UserMainCode {
public static int sumOfSquaresOfEvenDigits(int n)
{
int n1=0;
int sum=0;
while(n!=0)
{
n1=n%10;
if(n1%2==0)
{
sum+=n1*n1;
}
n=n/10;
}
return sum;
}
}

4. Fetching Middle Characters from String
Sample Input 1:
this
Sample Output 1:
hi
Sample Input 1:
Hell
Sample Output 1:
el
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String str=s.nextLine();
System.out.println(UserMainCode.getMiddleChars(str));
s.close();
}
}
USERMAINCODE:
import java.util.*;
public class UserMainCode { public static String getMiddleChars(String str)
{
StringBuffer sb=new StringBuffer();
if(str.length()%2==0)
{
sb.append(str.substring((str.length()/2)-1,(str.length()/2)+1));
}
return sb.toString();
}
}

5. Check Characters in a String
Sample Input 1:
the picture was great
Sample Output 1:
Valid
Sample Input 1:
this
Sample Output 1:
Invalid
MAIN:
import java.util.*; public class main {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String input=s.nextLine();
int r=UserMainCode.checkCharacters(input);
if(r==1)
{
System.out.println("Valid");
}
else
{
System.out.println("Invalid");
}
s.close();
}
}
USERMAINCODE:
import java.util.*;
public class UserMainCode {
public static int checkCharacters(String input)
{
int r;
StringTokenizer t = new StringTokenizer(input," "); String s = t.nextToken(); String s1 =s ;
while(t.hasMoreTokens())
{
s1 = t.nextToken();
} if(s.charAt(0) == s1.charAt(s1.length()-1))
r=1;
else
r=0;
return r;
}
}

6. Forming New Word from a String
Sample Input 1:
California
3
Sample Output 1:
Calnia
Sample Input 2:
this
1
Sample Output 2:
Ts
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
int n1=s.nextInt();
System.out.println(UserMainCode.formNewWord(s1,n1));
s.close();
}
}
USERMAINCODE:
import java.util.*;
public class UserMainCode {
public static String formNewWord(String s1,int n)
{
String s = new String();
if(s1.length()>n)
{
s = s1.substring(0,n) + s1.substring(s1.length()-n, s1.length());
return s;
}
else
return null;
}
}

7. Reversing a Number
Sample Input 1:
543
Sample Output 1:
345
Sample Input 1:
1111
Sample Output 1:
1111
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(UserMainCode.reverseNumber(n));
s.close();
}
}
USERMAINCODE:
public class UserMainCode {
public static int reverseNumber(int n)
{
int a,r=0;
while(n!=0)
{
a=n%10;
r=r*10+a;
n=n/10;
}
return r;
}
}

8. Array List Sorting and Merging
Sample Input 1:
3
1
17
11
19
5
2
7
6
20
Sample Output 1:
3
11
19
Sample Input 2:
1
2
3
4
5
6
7
8
9
10
Sample Output 2:
3
7
9
Main:
import java.util.*;
public class Main {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
ArrayList<Integer> list1=new ArrayList<Integer>();
ArrayList<Integer> list2=new ArrayList<Integer>();
ArrayList<Integer> newlist=new ArrayList<Integer>();
for (int i = 0; i < 5; i++)
{
list1.add(s.nextInt());
}
for (int i = 0; i < 5; i++)
{
list2.add(s.nextInt());
}
newlist=UserMainCode.sortMergedArraylist(list1,list2);
for (int i = 0; i < 3; i++)
{
System.out.println(newlist.get(i));
}
s.close();
}
}
UERMAINCODE:
import java.util.*;
public class UserMainCode {
public static ArrayList<Integer> sortMergedArraylist(ArrayList<Integer> list1,ArrayList<Integer> list2)
{
list1.addAll(list2);
Collections.sort(list1);
ArrayList<Integer> ans=new ArrayList<Integer>();
ans.add(list1.get(2));
ans.add(list1.get(6));
ans.add(list1.get(8));
return ans;
}
}

9. Validating Date Format
Sample Input 1:
12/06/1987
Sample Output 1:
Valid date format
Sample Input 2:
03/1/1987
Sample Output 2:
Invalid date format
Main:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
int b=UserMainCode.ValidateDate(s1);
if(b==1){
System.out.println("Valid date format");
}
else{
System.out.println("Invalid date format");
}
sc.close();
}}
UserMainCode:
import java.util.*;
import java.text.*;
public class UserMainCode{
public static int ValidateDate(String s1) {
if(s1.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))
{
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
sdf.setLenient(false);
try {
Date d1=sdf.parse(s1);
return 1;
} catch (ParseException e) {
return -1;
}
}
else{
return -1;}}}

10. Validate Time
Sample Input 1:
09:59 pm
Sample Output 1:
Valid time
Sample Input 2:
10:70 AM
Sample Output 2:
Invalid time
Main:
import java.util.*;
public class Main{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int b=UserMainCode.ValidateTime(str);
if(b==1){
System.out.println("Valid time");
}
else{
System.out.println("Invalid time");
}
sc.close();
}}
UserMainCode:
import java.text.*;
import java.util.*;
public class UserMainCode{
public static int ValidateTime(String str){
StringTokenizer st=new StringTokenizer(str,":");
if(st.countTokens()==3)
{
SimpleDateFormat sdf1 = new SimpleDateFormat("h:mm:ss a");
sdf1.setLenient(false);
try
{
Date d2=sdf1.parse(str);
return 1;
}
catch(Exception e)
{
return -1;
}}
else
{
SimpleDateFormat sdf = new SimpleDateFormat("h:mm a");
sdf.setLenient(false);
try
{
Date d1=sdf.parse(str);
return 1;
}
catch(Exception e){
return -1;
}}}}

11. String Encryption
Sample Input 1:
curiosity
Sample Output 1:
dusipsjtz
Sample Input 2:
zzzz
Sample Output 2:
Azaz
Main:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.next(); System.out.println(UserMainCode.encrypt(s1));
s.close();
}
}
UserMainCode:
public class UserMainCode{ public static String encrypt(String s1) {
StringBuffer sb=new StringBuffer();
for(int i=0;i<s1.length();i++){
char c=s1.charAt(i);
if(i%2==0){
if(c==122)
if((c==122)&&(i==0)){
c='A';}
else
c=(char) (c-25);
else{
c=(char) (c+1);}
sb.append(c);}
else
sb.append(c);}
return sb.toString();
}}

12. Password Validation
Sample Input 1:
%Dhoom%
Sample Output 1:
Invalid password
Sample Input 2:
#@6Don
Sample Output 2:
Valid password
Main:
import java.util.*;
public class Main {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String password=s.next();
int b=UserMainCode.ValidatePassword(password);
if(b==1){
System.out.println("Valid Password");
}
else{
System.out.println("Invalid Password");
}
s.close();
}}
UserMainCode:
public class UserMainCode{ public static int ValidatePassword(String password){
if(password.matches(".*[0-9]{1,}.*") && password.matches(".*[@#$]{1,}.*")
&& password.length()>=6 && password.length()<=20)
{
return 1;
}
else
{
return -1;
}}}

13. Removing vowels from String
Sample Input 1:
commitment
Sample Output 1:
cmmitmnt
Sample Input 2:
capacity
Sample Output 2:
Cpcty
Main:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
System.out.println(UserMainCode.removeEvenVowels(s1));
s.close();
}}
UserMainCode:
public class UserMainCode{
public static String removeEvenVowels(String s1) {
StringBuffer sb1=new StringBuffer();
for(int i=0;i<s1.length();i++)
if((i%2)==0)
sb1.append(s1.charAt(i));
else if((i%2)!=0)
if(s1.charAt(i)!='a' && s1.charAt(i)!='e' &&
s1.charAt(i)!='i' && s1.charAt(i)!='o' && s1.charAt(i)!='u')
if(s1.charAt(i)!='A' && s1.charAt(i)!='E' &&
s1.charAt(i)!='I' && s1.charAt(i)!='O' && s1.charAt(i)!='U')
sb1.append(s1.charAt(i));
return sb1.toString();
}}

14. Sum of Powers of elements in an array
Sample Input 1:
4
3
6
2
1
Sample Output 1:
12
Sample Input 2:
4
5
3
7
2
Sample Output 2:
61
Main:
import java.util.Scanner;
public class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println(UserMainCode.getSumOfPower(n,a));
sc.close();
}}
UserMainCode:
public class UserMainCode{ public static int getSumOfPower(int n,int[]a)
{{
int sum=0;
for(int i=0;i<n;i++)
sum=(int)(sum+Math.pow(a[i], i));
return sum;
}}}

15.Difference between largest and smallest elements in an array
Sample Input 1:
4
3
6
2
1
Sample Output 1:
5
Sample Input 2:
4
5
3
7
2
Sample Output 2:
5
Main:
import java.util.*;
public class Main {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println(UserMainCode.getBigDiff(a,n));
sc.close();
}}
UserMainCode:
import java.util.*;
public class UserMainCode{ public static int getBigDiff(int [] a,int n)
{
Arrays.sort(a);
int n1=a[a.length-1]-a[0]; return n1;
}}

16.Find the element position in a reversed string array
Sample Input 1:
4
red
green
blue
ivory
ivory
Sample Output 1:
2
Sample Input 2:
3
grape
mango
apple
apple
Sample Output 2:
3
Main:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int fr=sc.nextInt();
String a[]=new String[fr];
for(int i=0;i<fr;i++)
{
a[i]=sc.next();
}
String ba=sc.next();
UserMainCode.getElementPosition(a,ba);
sc.close();
}}
UserMainCode:
import java.util.*;
public class UserMainCode{
public static void getElementPosition(String[] a, String b) {
ArrayList<String>al=new ArrayList<String>();
for(int i=0;i<a.length;i++)
{
al.add(a[i]);
}
Collections.sort(al);
Collections.reverse(al);
for(int i=0;i<al.size();i++)
{
if(b.equals(al.get(i)))
{
System.out.println(i+1);
}}}}

17.generate the series
Sample Input 1:
9
Sample Output 1:
-3
Sample Input 2:
11
Sample Output 2:
8
Main
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(UserMainCode.addSeries(n));
s.close();
}
}
UserMainCode
import java.util.ArrayList;
import java.util.List;
public class UserMainCode {
public static int addSeries(int n){
List<Integer> l1=new ArrayList<Integer>();
for(int i=1;i<=n;i++)
if(i%2!=0)
l1.add(i);
int n1=l1.get(0);
for(int i=1;i<l1.size();i++)
if(i%2!=0)
n1=n1+l1.get(i);
else
n1=n1-l1.get(i);
return n1;
}
}

18.Calculate Electricity Bill
Sample Input 1:
ABC2012345
ABC2012660
4
Sample Output 1:
1260
Sample Input 2:
ABCDE11111
ABCDE11222
3
Sample Output 2:
333
Main
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String input1=s.next();
String input2=s.next();
int input3=s.nextInt();
System.out.println(UserMainCode.calculateElectricityBill(input1,input2,input3));
s.close();
}
}
UserMainCode
public class UserMainCode {
public static int calculateElectricityBill(String input1, String input2, int input3)
{
int n1=Integer.parseInt(input1.substring(5, input1.length()));
int n2=Integer.parseInt(input2.substring(5, input2.length()));
int n=Math.abs((n2-n1)*input3);
return n;
}
}

19.Sum of Digits in a String
Sample Input 1:
good23bad4
Sample Output 1:
9
Sample Input 2:
good
Sample Output 2:
-1
Main
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.next();
UserMainCode.sumOfDigits(s1);
s.close();
}
}
UserMainCode
public class UserMainCode { public static void sumOfDigits(String s1) {
int sum=0;
for(int i=0;i<s1.length();i++)
{
char a=s1.charAt(i);
if(Character.isDigit(a))
{
int b=Integer.parseInt(String.valueOf(a));
sum=sum+b;
}
}
if(sum==0)
{
System.out.println(-1);
}
else
System.out.println(sum);
}
}

20.String Concatenation
Sample Input 1:
Hello
hi
Sample Output 1:
lohi
Sample Input 2:
Hello
Delhi
Sample Output 2:
HelloDelhi
Main
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.next();
String s2=s.next();
UserMainCode.concatstring(s1,s2);
s.close();
}
} UserMainCode
public class UserMainCode {
public static void concatstring(String s1, String s2) {
StringBuffer sb=new StringBuffer();
int l1=s1.length();
int l2=s2.length();
if(l1==l2)
{
sb.append(s1).append(s2);
}
else if(l1>l2)
{
sb.append(s1.substring(s1.length()-s2.length(),s1.length())).append(s2);
}
else if(l1<l2)
{
sb.append(s1).append(s2.substring(s2.length()-s1.length(),s2.length()));
}
System.out.println(sb);
}
}

21. Color Code
Sample Input 1:
#FF9922
Sample Output 1:
Valid
Sample Input 2:
#FF9(22
Sample Output 2:
Invalid
Main
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.next();
int b=UserMainCode.validateColorCode(s1);
if(b==1)
System.out.println("Valid");
else
System.out.println("Invalid");
s.close();
}
}
UserMainCode
public class UserMainCode { public static int validateColorCode(String s1) {
int b=0,b1=0;
String s2=s1.substring(1,s1.length());
if(s1.length()==7)
if(s1.charAt(0)=='#')
b1=1;
if(b1==1){
/*for(int i=0;i<s2.length();i++){
char c=s2.charAt(i);
if(c!='#')
{*/
if(s2.matches("[A-F0-9]{1,}"))
b=1;
else
b=-1;
//break;
}
return b;
}
}

22.Three Digits
Sample Input 1:
CTS-215
Sample Output 1:
Valid
Sample Input 2:
CTS-2L5
Sample Output 2:
Invalid
Main
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.next();
int b=UserMainCode.validatestrings(s1);
if(b==1){
System.out.println("Valid");}
else
System.out.println("Invalid");
s.close();
}
}
UserMainCode
public class UserMainCode { public static int validatestrings(String s1) {
int res=0;
if(s1.matches("(CTS)[-]{1}[0-9]{3}"))
{
res=1;
}
else
res=-1;
return res;
}
}

23.Removing Keys from HashMap
Sample Input 1:
3
2
hi
4
hello
12
hello world
Sample Output 1:
1
Sample Input 2:
3
2
hi
4
sdfsdf
3
asdf
Sample Output 2:
2
Main
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
HashMap<Integer, String>hm=new HashMap<Integer, String>();
for(int i=0;i<s;i++){
hm.put((sc.nextInt()),(sc.next()));
}
System.out.println(UserMainCode.sizeOfResultandHashMap(hm));
sc.close();
} }
UserMainCode
import java.util.HashMap;
import java.util.Iterator;
public class UserMainCode { public static int sizeOfResultandHashMap(HashMap<Integer, String> hm) {
int count=0;
Iterator<Integer>itr=hm.keySet().iterator();
while(itr.hasNext())
{
int n=itr.next();
if(n%4!=0)
{
count++;
}
}
return count;
}
}

24.Largest Element
Sample Input 1:
5
2
3
8
4
5
Sample Output 1:
8
Main
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
System.out.println(UserMainCode.checkLargestAmongCorner(a));
s.close();
}
}
UserMainCode
public class UserMainCode {
public static int checkLargestAmongCorner(int []a)
{
int max=0;
int x,y,z;
x=a[0];
y=a[a.length/2];
z=a[a.length-1];
if(x>y && x>z)
max=x;
else if(y>x && y>z)
max=y;
else if(z>x && z>y)
max=z;
return max;
}
}

25. nCr
Sample Input 1:
4
3
Sample Output 1:
4
Main
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int r=s.nextInt();
System.out.println(UserMainCode.calculateNcr(n,r));
}
}
UserMainCode
public class UserMainCode { public static int calculateNcr(int n, int r) {
int fact=1,fact1=1,fact2=1;
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
//System.out.println(fact);
for(int i=1;i<=r;i++)
{
fact1=fact1*i;
}
//System.out.println(fact1);
for(int i=1;i<=(n-r);i++)
{
fact2=fact2*i;
}
//System.out.println(fact2);
int res=fact/(fact1*fact2);
return res;
}
}

26.Sum of Common Elements
Sample Input 1:
4
3
2
3
5
1
1
3
9
Sample Output 1:
4
Sample Input 2:
4
3
2
3
5
1
12
31
9
Sample Output 2:
No common elements
Main
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int[] a=new int[n];
int[] b=new int[m];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();}
for(int i=0;i<m;i++){
b[i]=sc.nextInt();}
int u=UserMainCode.getSumOfIntersection (a,b,n,m);
if(u==-1)
System.out.println("No common elements");
else
System.out.println(u);
sc.close();
}}
UserMainCode
public class UserMainCode {
public static int getSumOfIntersection(int a[],int b[],int n,int m)
{
int sum=0;
for(int i=0;i<a.length;i++)
{
for(int j=0;j<b.length;j++)
{if(a[i]==b[j])
sum=sum+a[i];
}}
if(sum==0)
return -1;
else
return sum;
}
}

27.Validating Input Password
Sample Input 1:
ashok_23
Sample Output 1:
Valid
Sample Input 2:
1980_200
Sample Output 2:
Invalid
Main
import java.util.*;
public class Main{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String a=sc.next();
int e=UserMainCode.validatePassword(a);
if(e==1){
System.out.println("Valid");
}
else
{
System.out.println("Invalid");
}
sc.close();
}}
UserMainCode
public class UserMainCode {
public static int validatePassword(String a){
int d=0;
if(a.length()>=8){
if(a.contains("#") || a.contains("@") || a.contains("_"))
{
char c= a.charAt(0);
//System.out.println(c);
if(Character.isAlphabetic(c))
{
char dd=a.charAt(a.length()-1);
//System.out.println(dd);
if((Character.isAlphabetic(dd))||(Character.isDigit(dd)))
{
if(a.matches(".*[0-9]{1,}.*")||a.matches(".*[a-zA-Z]{1,}.*")){
d=1;
}
}
}
}
}
else
d=-1;
return d;
}}

28.iD Validation
Sample Input 1:
CTS-hyd-1234
hyderabad
Sample Output 1:
Valid id
Sample Input 2:
CTS-hyd-123
hyderabad
Sample Output 2:
Invalid id
Main
import java.util.*;
public class Main3 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
boolean b=UserMainCode3.validateIDLocations(s1,s2);
if(b==true)
System.out.println("Valid id");
else
System.out.println("Invalid id");
sc.close();
}
}
UserMainCode
import java.util.StringTokenizer;
public class UserMainCode3 { public static boolean validateIDLocations(String s1, String s2) {
String s3=s2.substring(0, 3);
boolean b=false;
StringTokenizer t=new StringTokenizer(s1,"-");
String s4=t.nextToken();
String s5=t.nextToken();
String s6=t.nextToken();
if(s4.equals("CTS") && s5.equals(s3) && s6.matches("[0-9]{4}"))
b=true;
else{
b=false;}
return b;
}
}

29.Remove Elements
Sample Input 1:
5
a
bb
b
ccc
ddd
2
Sample Output 1:
4
Main
import java.util.*;
public class Main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=Integer.parseInt(sc.nextLine());
String[] a=new String[n];
for(int i=0;i<n;i++)
a[i]=sc.nextLine();
int m=Integer.parseInt(sc.nextLine());
System.out.println(UserMainCode.removeElements(a,m));
sc.close();
}
}
UserMainCode
public class UserMainCode {
public static int removeElements(String[] a,int m){
int u=a.length;
for(int i=0;i<a.length;i++)
{
if(a[i].length()==m)
u--;
}
return u;
}
}

30.Find the difference between Dates in months
Sample Input 1:
2012-03-01
2012-04-16
Sample Output 1:
1
Sample Input 2:
2011-03-01
2012-04-16
Sample Output 2:
13
Main
import java.text.*;
import java.util.*;
public class Main {
public static void main(String[] args) throws ParseException {
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
System.out.println(UserMainCode.getMonthDifference(s1,s2));
sc.close();
}}
UserMainCode
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class UserMainCode {
public static int getMonthDifference(String s1, String s2) throws ParseException {
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
Date d1=sdf.parse(s1);
Date d2=sdf.parse(s2);
Calendar cal=Calendar.getInstance();
cal.setTime(d1);
int months1=cal.get(Calendar.MONTH);
int year1=cal.get(Calendar.YEAR);
cal.setTime(d2);
int months2=cal.get(Calendar.MONTH);
int year2=cal.get(Calendar.YEAR);
int n=((year2-year1)*12)+(months2-months1);
return n;
}
}

31.Sum of cubes and squares of elements in an array
Sample Input 1:
5
2
6
3
4
5
Sample Output 1:
208
Main
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println(UserMainCode.addEvenOdd(a));
sc.close();
}
}
UserMainCode
public class UserMainCode6 {
public static int addEvenOdd(int[] a) {
int n1=0,n2=0;
for(int i=0;i<a.length;i++)
if(a[i]%2==0)
n1+=(a[i]*a[i]);
else
n2+=(a[i]*a[i]*a[i]);
return n1+n2;
}
}

32.IP Validator
Sample Input 1:
132.145.184.210
Sample Output 1:
Valid
Sample Input 2:
132.145.184.290
Sample Output 2:
Invalid
Main
import java.util.*;
public class Main7 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String ipAddress=sc.next();
boolean b=UserMainCode7.validateIpAddress(ipAddress);
if(b==true)
System.out.println("Valid");
else
System.out.println("Invalid");
sc.close();
}
}
UserMainCode
import java.util.StringTokenizer;
public class UserMainCode7 {
public static boolean validateIpAddress(String ipAddress) {
boolean b1=false;
StringTokenizer t=new StringTokenizer(ipAddress,".");
int a=Integer.parseInt(t.nextToken());
int b=Integer.parseInt(t.nextToken());
int c=Integer.parseInt(t.nextToken());
int d=Integer.parseInt(t.nextToken());
if((a>=0 && a<=255)&&(b>=0 && b<=255)&&(c>=0 && c<=255)&&(d>=0
&& d<=255))
b1=true;
return b1;
}
}

33.Difference between two dates in days
Sample Input 1:
2012-03-12
2012-03-14
Sample Output 1:
2
Sample Input 2:
2012-04-25
2012-04-28
Sample Output 2:
3
Main
import java.text.ParseException;
import java.util.*;
public class Main {
public static void main(String[] args) throws ParseException
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();
int output=UserMainCode.getDateDifference(s1,s2);
System.out.println(output);
s.close();
}
}
UserMainCode
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class UserMainCode {
public static int getDateDifference(String s1,String s2) throws ParseException
{
SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
Date d=sd.parse(s1);
Calendar c=Calendar.getInstance();
c.setTime(d);
long d1=c.getTimeInMillis();
d=sd.parse(s2);
c.setTime(d);
long d2=c.getTimeInMillis();
int n=Math.abs((int) ((d1-d2)/(1000*3600*24)));
return n;
}
}

34.File Extension
Sample Input 1:
sun.gif
Sample Output 1:
Gif
Main
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String s1=s.nextLine();
String output=UserMainCode.fileIdentifier(s1);
System.out.println(output);
s.close();
}
}
UserMainCode
import java.util.*;
public class UserMainCode {
public static String fileIdentifier(String s1)
{
StringTokenizer t=new StringTokenizer(s1,".");
t.nextToken();
String s2=t.nextToken();
return s2;
}
}

35.Find common characters and unique characters in string
Sample Output 1:
2
[Explanation : b, l and a are the common letters between the 2 input strings. But 'a' appears
more than once in the 1st string. So 'a' should not be considered while computing the count
value.]
Sample Input 2:
australia
sri lanka
Sample Output 2:
4
Main
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
StringBuffer sb1=new StringBuffer(s1.replace(" ",""));
StringBuffer sb2=new StringBuffer(s2.replace(" ",""));
int output=UserMainCode.commonChars(s1,s2,sb1,sb2);
System.out.println(output);
sc.close();
}
}
UserMainCode
import java.util.*;
public class UserMainCode {
public static int commonChars(String s1,String s2,StringBuffer sb1,StringBuffer sb2) {
for(int i=0;i<sb1.length();i++){
int c=0;
for(int j=i+1;j<sb1.length();j++){
if(sb1.charAt(i)==sb1.charAt(j)){
sb1.deleteCharAt(j);
c++;
}
}
if(c>=1){
sb1.deleteCharAt(i);
}
}
for(int i=0;i<sb2.length();i++){
int c=0;
for(int j=i+1;j<sb2.length();j++){
if(sb2.charAt(i)==sb2.charAt(j)){
sb2.deleteCharAt(j);
c++;
}
}
if(c>=1){
sb2.deleteCharAt(i);
}
}
int count=0;
for(int i=0;i<sb1.length();i++){
for(int j=0;j<sb2.length();j++){
if(sb1.charAt(i)==sb2.charAt(j)){
count++;
}
}
}
return (count);
}
}

36.Initial Format
Sample Input :
Jessica Miller
Sample Output:
Miller, J
Main
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String output=UserMainCode.nameFormatter(s1);
System.out.println(output);
s.close();
}
}
UserMainCode
import java.util.*;
public class UserMainCode {
public static String nameFormatter(String s1) {
StringBuffer sb=new StringBuffer();
StringTokenizer st=new StringTokenizer(s1," ");
String s2=st.nextToken();
String s3=st.nextToken();
sb.append(s3).append(",");
sb.append(s2.substring(0,1).toUpperCase());
return sb.toString();
}
}

37.Character cleaning
Sample Input :
elephant
e
Sample Output:
Lphant
Main
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String c=s.nextLine();
String output=UserMainCode.removeCharacter(s1,c);
System.out.println(output);
}
}
UserMainCode
import java.util.*;
public class UserMainCode {
public static String removeCharacter(String s1,String c)
{
String d=s1.replace(c,"");
return d;
}
}

38.Vowel Check
Sample Input 1:
abceiduosp
Sample Output 1:
yes
Sample Input 2:
bceiduosp
Sample Output 2:
No
Main
import java.util.*;
public class User {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=s1.toLowerCase();
int output=UserMainCode.getVowels(s2);
//System.out.println(output);
if(output==1)
{
System.out.println("yes");
}
else
System.out.println("no");
s.close();
}
}
UserMainCode
import java.util.*;
public class UserMainCode {
public static int getVowels(String s2) {
if(s2.contains("a") && s2.contains("e") && s2.contains("i") && s2.contains("o") && s2.contains("u") )
{
return 1;
}
else
return -1;
}
}

39.Swap Characters
Sample Input 1:
TRAINER
Sample Output 1:
RTIAENR
Sample Input 2:
TOM ANDJERRY
Sample output 2:
OT MNAJDREYR
Main
import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String output=UserMainCode.swapCharacter(s1);
System.out.println(output);
s.close();
}
}
UserMainCode
import java.util.*;
public class UserMainCode {
public static String swapCharacter(String s1)
{
StringBuffer sb=new StringBuffer();
int l=s1.length();
if(l%2==0)
{
for(int i=0;i<s1.length()-1;i=i+2)
{
char a=s1.charAt(i);
char b=s1.charAt(i+1);
sb.append(b).append(a);
}
return sb.toString();
}
else
{
for(int i = 0;i<s1.length()-1;i=i+2)
{
char a=s1.charAt(i);
char b=s1.charAt(i+1);
sb.append(b).append(a);
}
sb.append(s1.charAt(l-1));
return sb.toString();
}
}
}

40.Average of Elements in Hashmap
Sample Input 1:
3
1
2.3
2
4.1
6
6.2
Sample Output 1:
5.15
Sample Input 2:
3
9
3.1
4
6.3
1
2.6
Sample Output 2:
6.3
Main
import java.util.HashMap;
import java.util.Scanner;
public class Main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
HashMap<Integer,Float>hm=new HashMap<Integer,Float>();
for(int i=0;i<s;i++)
{
int r=sc.nextInt();
Float j=sc.nextFloat();
hm.put(r,j);
}
System.out.println(UserMainCode.display(hm));
sc.close();
}
}
UserMainCode
import java.text.DecimalFormat;
import java.util.*;
public class UserMainCode
{
public static String display(HashMap<Integer,Float>hm)
{
float sum=0;
int count=0;
DecimalFormat df=new DecimalFormat("#.00");
Iterator<Integer> it=hm.keySet().iterator();
while(it.hasNext())
{
int y=it.next();
if(y%2==0)
{
sum=(float) (sum+hm.get(y));
count++;
}}
float d=sum/count;
return df.format(d);
}
}

41.Calculate Average – Hash Map
Sample Input :
4
1
3.41
2
4.1
3
1.61
4
2.5
Sample Output :
2.51
Main
import java.util.*;
import java.text.*;
public class Main {
public static void main(String[] arg)
{
HashMap<Integer,Double> hm=new HashMap<Integer,Double>();
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
int a=sc.nextInt();
double s=sc.nextDouble();
hm.put(a,s);
} System.out.println(UserMaincode.dis(hm));}}
UserMainCode
class UserMaincode
{
public static double dis(HashMap<Integer,Double> h1)
{
double avg=0.0,sum=0.0;
int k=0;
for(Map.Entry m:h1.entrySet())
{
int a=(Integer)m.getKey();
if(a%2!=0)
{
Double d=(Double) m.getValue();
sum=sum+d;
k++;
}
}
avg = (double)sum/k;
DecimalFormat df = new DecimalFormat(".##");
String b1 = df.format(avg);
double b = Double.parseDouble(b1);
return b;}

42.Count Sequential Characters
Sample Input 1:
abcXXXabc
Sample Output 1:
1
Sample Input 2:
aaaxxyzAAAx
Sample Output 2:
2
Main
import java.util.*;
import java.text.*;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
String input1=sc.next();
System.out.println(UserMainCode.consecutiveRepeatitionOfChar(input1));
}
}
UserMainCode
class UserMainCode
{
public static int consecutiveRepeatitionOfChar(String input1)
{
int c=0;
int n=0;
for(int i=0;i<input1.length()-1;i++){
if(input1.charAt(i)==input1.charAt(i+1))
n++;
else
n=0;
if(n==2)
c++; }
return c;
}
}

43.Length of the Largest Chunk
Sample Input 1:
You are toooo good
Sample Output 1:
4
(Because the largest chunk is letter 'o' which is repeating 4 times)
Sample Input 2:
who are u
Sample Output 2:
No chunks
Main
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
System.out.println(UserMainCode.largestChunk(s1));
}
}
UserMaincode
class UserMainCode
{
public static int largestChunk(String s1) {
int max=1;
int b=0;
StringTokenizer t=new StringTokenizer(s1," ");
while(t.hasMoreTokens()){
String s2=t.nextToken();
int n=0;
for(int i=0;i<s2.length()-1;i++)
if(s2.charAt(i)==s2.charAt(i+1))
n++;
if(n>max)
{
max=n;
b=max+1;
}
}
return b;
}
}

44.Unique Characters in a string
Sample Input 1:
HelloWorld
Sample Output 1:
5
Sample Input 2:
coco
Sample Output 2:
-1
Main
import java.util.*;
import java.text.*;
public class Main {
public static void main(String[] args) throws ParseException {
Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();
System.out.println(UserMaincode.uniqueCounter(s1));
}}
UserMainCode
class UserMaincode
{
public static int uniqueCounter(String s1)
{
StringBuffer sb = new StringBuffer(s1);
for (int i = 0; i < sb.length(); i++) {
int count = 0;
for (int j = i + 1; j < sb.length(); j++) {
if (sb.charAt(i) == sb.charAt(j)) {
sb.deleteCharAt(j);
j--;
count++;
}
}
if (count >= 1) {
sb.deleteCharAt(i);
i--;
}
}
return sb.length();
}
}

45.Name Shrinking
Sample Input:
Sachin Ramesh Tendulkar
Sample Output:
Tendulkar R.S
Main
import java.text.*;
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
System.out.println(UserMainCode.getFormatedString(s1));
}
}
UserMainCode
class UserMainCode
{
public static String getFormatedString(String s1) {
StringBuffer sb=new StringBuffer();
StringTokenizer st=new StringTokenizer(s1," ");
String s2=st.nextToken();
String s3=st.nextToken();
String s4=st.nextToken();
sb.append(s4).append(" ");
sb.append(s3.substring(0,1));
sb.append(".");
sb.append(s2.substring(0,1));
return sb.toString();
}
}

46.Odd Digit Sum
Sample Input :
3
cog2nizant1
al33k
d2t4H3r5
Sample Output :
15
(1+3+3+3+5)
Main
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int s1=sc.nextInt();
String[] s2 = new String[s1];
for (int i = 0; i < s1; i++) {
s2[i] = sc.next();
}
System.out.println(UserMainCode. oddDigitSum(s2));
}}
UserMainCode
public class UserMainCode {
public static int oddDigitSum (String[] s1) {
int sum=0;
for(int i=0;i<s1.length;i++)
for(int j=0;j<s1[i].length();j++){
char c=s1[i].charAt(j);
if(Character.isDigit(c)){
if(c%2!=0)
{
String t=String.valueOf(c);
int n=Integer.parseInt(t);
sum=sum+n; } }}
return sum;
}
}

47.Unique Number
Sample Input 1:
123
Sample Output 1:
Unique
Sample Input 2:
33
Sample Output 2:
Not Unique
import java.util.*;
import java.text.*;
public class Main{
public static void main(String[]args) {int j=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(); j=UserMainCode.getUnique(n); if(j>0)
{
System.out.println("Not Unique");
} else if(j==0)
{
System.out.println("Unique");
}
}}
class UserMainCode
{
public static int getUnique(int n)
{
int []a=new int[100];
int i=0,count=0;
while(n!=0)
{
int num=n%10;
a[i]=num;
i++;
n=n/10;
}
for(int j=0;j<=i-1;j++)
{
for(int k=j+1;k<=i-1;k++)
{
if(a[j]==a[k]){
count++;
}
}}
return count;
}
}

48.Sum of Lowest marks
Sample Input 1:
5
1
54
2
85
3
74
4
59
5
57
Sample Output 1:
170
Sample Input 2:
4
10
56
20
58
30
87
40
54
Sample Output 2:
168
Main
import java.util.*;
public class Main {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.nextLine());
HashMap<Integer,Integer>h1=new HashMap<Integer,Integer>();
for(int i=0;i<n;i++)
{
h1.put(sc.nextInt(),sc.nextInt());
}
System.out.println(UserMainCode.getLowest(h1));
}
}
UserMainCode
class UserMainCode {
public static int getLowest(HashMap<Integer,Integer>h1)
{
ArrayList<Integer>a1=new ArrayList<Integer>();
int m=0;
Iterator<Integer> it=h1.keySet().iterator();
while(it.hasNext())
{
int x=it.next();
a1.add(h1.get(x));
}
Collections.sort(a1);
m=a1.get(0)+a1.get(1)+a1.get(2);
return m;
}}

49.Color Code Validation same as 21
Sample Input 1:
#99FF33
Sample Output 1:
true
Sample Input 2:
#CCCC99#
Sample Output 2:
False
Main
import java.util.*;
public class Add {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.next();
boolean b=userMainCode. validateColourCode (s1);
if(b==true)
System.out.println("valid color code");
else
System.out.println("invalid color code");
}
UserMainCode
static class userMainCode{
public static boolean validateColourCode (String s1)
boolean b=false;
if(s1.length()==7&&s1.matches("#[A-F0-9]{1,}")){
b=true;
}
return b;
}}}

50.Repeating set of characters in a string
Sample Input 1:
Cognizant
3
Sample Output 1:
Cognizantantantant
Sample Input 2:
myacademy
2
Sample Output 2:
Myacademymymy
Main
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s= new Scanner(System.in);
String input= s.next();
int n=s.nextInt();
System.out.println(userMainCode.getString(input,n));
}
}
UserMainCode
class userMainCode {
public static String getString(String input, int n){
StringBuffer sb=new StringBuffer();
sb.append(input); for (int i=0;i<n;i++){ sb.append(input.substring(input.length()-n,input.length()));
}
return sb.toString();
}
}

51.Finding the day of birth
Sample Input 1:
29-07-2013
Sample Output 1:
MONDAY
Sample Input 2:
14-12-1992
Sample Output 2:
MONDAY
Main
import java.util.*;
import java.text.*;
public class Main {
public static void main(String[] args) throws ParseException {
Scanner s= new Scanner(System.in);
String input= s.next();
System.out.println(userMainCode.calculateBornDay(input));
}
}
UserMainCode
class userMainCode{ public static String calculateBornDay(String input) throws ParseException{
SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
SimpleDateFormat sdf1= new SimpleDateFormat("EEEEE"); Date d= sdf.parse(input);
String s1= sdf1.format(d); return s1;
}
}

52.Removing elements from HashMap
Sample Input 1:
4
339
RON
1010
JONS
3366
SMITH
2020
TIM
Sample Output 1:
2
Sample Input 2:
5
1010
C2WE
6252
XY4E
1212
M2ED
7070
S2M41ITH
8585
J410N
Sample Output 2:
3
Main
import java.util.*;
import java.text.*;
public class Main {
public static void main(String[] args) {
Scanner s= new Scanner(System.in);
HashMap<Integer, String>hm=new HashMap<Integer, String>(); int n= s.nextInt(); for(int i=0;i<n;i++){
hm.put(s.nextInt(),s.next());
}
System.out.println(UserMainCode.afterDelete(hm));
s.close();
}
}
UserMainCode
class UserMainCode{
public static int afterDelete(HashMap<Integer, String> hm){
int count=0;
Iterator<Integer>itr=hm.keySet().iterator();
while(itr.hasNext())
{
int n=itr.next();
if(n%3!=0)
{
count++;
}
}
return count;
}
}

53.Experience Calculator
Sample Input 1:
11/01/2010
01/09/2014
4
Sample Output 1:
true
Sample Input 2:
11/06/2009
01/09/2014
4
Sample Output 2:
False
Main
import java.util.*;
import java.text.*;
public class Main {
public static void main(String[] args)throws ParseException {
Scanner sc=new Scanner(System.in);
String a=sc.next();
String b=sc.next();
int c=sc.nextInt();
long res=(userMainCode.calculateExperience(a,b,c));
if(res==c)
{
System.out.println("true");
}
else
System.out.println("false");
}
}
UserMainCode
class userMainCode{
public static long calculateExperience(String a, String b, int c)throws ParseException{
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
Date d=new Date();
Date d1=new Date();
d=sdf.parse(a);
d1=sdf.parse(b);
long t=d.getTime();
long t1=d1.getTime();
long t3=t1-t;
long l1=(24 * 60 * 60 * 1000);
long l=l1*365;
long res=t3/l;
return res;
}
}

54.Flush Characters
Sample Input :
cogniz$#45Ant
Sample Output :
$#45
Main:
import java.util.*;
import java.text.*;
public class Main {
public static void main(String[] args) {
Scanner s= new Scanner(System.in);
String input=s.next();
System.out.println(UserMainCode.getSpecialChar(input));
}
}
UserMainCode:
class UserMainCode{
public static String getSpecialChar(String input){
int i;
StringBuffer sb= new StringBuffer();
for(i=0;i<input.length();i++)
{ char a=input.charAt(i); if (!Character.isAlphabetic(a)) sb.append(a);
}
return sb.toString();
}
}

55.String Repetition
Sample Input 1:
COGNIZANT
4
Sample Output 1:
COG COG COG COG
Sample Input 2:
COGNIZANT
2
Sample Output 2:
CO CO
class Main{
public static void main(String[] args) {
Scanner s= new Scanner(System.in);
System.out.println(“enter a string”);
String input= s.next();
int n= s.nextInt();
System.out.println(UserMainCode.repeatString(input, n));
}
}
class UserMainCode{ public static String repeatString(String input, int n){
StringBuffer sb= new StringBuffer();
String s1= new String(); if (n==1){
s1=input.substring(0,1);
sb.append(s1).append(" ");
} if(n==2){
s1=input.substring(0,2); for(int i=0;i<n;i++)
sb.append(s1).append(" ");
} if(n>=3){
s1=input.substring(0,3); for(int i=0;i<n;i++)
sb.append(s1).append(" ");
}
return sb.toString();
}
}

56.Average of Prime Locations
Sample Input 1:
8
4
1
7
6
5
8
6
9
Sample Output 1:
7.5
Main:
import java.util.*;
import java.text.*;
public class Main {
public static void main(String[] args) {
Scanner s= new Scanner(System.in);
int n,i;
System.out.println("enter the array size");
n=s.nextInt();
int array[]=new int[n];
for(i=0;i<n;i++){
array[i]=s.nextInt();
}
System.out.println(UserMainCode.AverageElements(array));
s.close();
}
}
UserMainCode:
class UserMainCode{
public static double AverageElements(int array[]){
int n, sum=0,count=0,count1=0;
double average;
n=array.length;
for(int i=0;i<=n;i++){
for(int j=1;j<n;j++){
if(i%j==0)
count++;
if(count==2){
sum= sum+array[i];
count1++;
}
}
}
average= sum/count1;
DecimalFormat df=new DecimalFormat("#.00");
double ddd=Double.parseDouble(df.format(average));
return ddd;
}
}

57.Common Elements
Sample Input 1:
4
1
2
3
4
2
3
6
7
Sample Output 1:
5
Main:
import java.util.*;
public class Main {
private static Scanner s ;
;
public static void main(String[] args) {
s = new Scanner (System.in);
int n = s.nextInt();
int a[] = new int[n];
int b[] = new int[n];
for(int i=0;i<n;i++)
{
a[i] = s.nextInt();
}
for(int i=0;i<n;i++)
{
b[i] = s.nextInt();
}
System.out.println(UserMainCode.sumCommonElements(a, b));
}
}
UserMainCode:
public class UserMainCode {
public static int sumCommonElements(int a[],int b[]){
int sum = 0 ;
for(int i=0;i<a.length;i++)
{
for(int j=0;j<b.length;j++){
if(a[i]==b[j])
sum = sum + a[i];}
}
if(sum==0)
return -1;
else return sum;
}
}

58. Middle of Array
Sample Input 1:
5
1
5
23
64
9
Sample Output 1:
23
Main:
import java.util.*;
public class Main {
private static Scanner s;
public static void main(String[] args) {
s = new Scanner(System.in);
int n = s.nextInt();
int[] a = new int[n];
for(int i=0;i<n;i++){
a[i] = s.nextInt();
}
System.out.println(UserMainCode.getMiddleElement(a));
}
}
UserMainCode:
public class UserMainCode {
public static int getMiddleElement(int a[]){
int n = a.length;
return a[n/2];
}
}

59. Simple String Manipulation
Sample Input 1:
hello
Sample Output 1:
llo
Sample Input 2:
java
Sample Output 2:
Jva
Main:
import java.util.*;
public class Main {
private static Scanner s;
public static void main(String[] args) {
s = new Scanner(System.in);
String s1 = s.next();
System.out.println(UserMainCode.getString(s1));
}
}
UserMainCode:
public class UserMainCode {
public static String getString(String s1){
StringBuffer sb=new StringBuffer();
char a=s1.charAt(0);
char b=s1.charAt(1);
if(a!='j'&& b!='b')
sb.append(s1.substring(2));
else if(a=='j' && b!='b')
sb.append("j").append(s1.substring(2));
else if(a!='j' && b=='b')
sb.append(s1.substring(1));
else
sb.append(s1.substring(0));
return sb.toString();
}
}

60. Date Validation
Sample Input 1:
03.12.2013
Sample Output 1:
valid
Sample Input 2:
03$12$2013
Sample Output 3:
Invalid
Main:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s= sc.next();
int b = UserMainCode.getvalues(s);
if(b==1)
System.out.println("Valid");
else
System.out.println("Invalid");
}
}
UserMainCode:
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class UserMainCode {
public static int getvalues(String s) {
if(s.matches("[0-9]{2}[.]{1}[0-9]{2}[.]{1}[0-9]{4}"))
{
SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy"); sdf.setLenient(false);
try
{
Date d1=sdf.parse(s);
return 1;
} catch (ParseException e) {
return -1;
}
}
else if(s.matches("[0-9]{2}[/]{1}[0-9]{2}[/][0-9]{4}"))
{
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy"); sdf.setLenient(false);
try
{
Date d1=sdf.parse(s);
return 1;
} catch (ParseException e) {
return -1;
}
}
else if(s.matches("[0-9]{2}[-]{1}[0-9]{2}[-][0-9]{4}"))
{
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy"); sdf.setLenient(false);
try
{
Date d1=sdf.parse(s);
return 1;
} catch (ParseException e) {
return -1;
}
}
else
return -1;
}
}

61. Boundary Average
Sample Input :
6
3
6
9
4
2
5
Sample Output:
5.5
Main:
import java.util.*;
import java.util.Arrays;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int s = sc.nextInt();
int a[] = new int[s];
for (int i = 0; i < s; i++)
a[i] = sc.nextInt();
System.out.println(UserMainCode.getBoundaryAverage(a));
}
}
UserMainCode
import java.util.Arrays;
public class UserMainCode { public static float getBoundaryAverage(int a[] ){
Arrays.sort(a);
int sum = a[0] + a[a.length - 1];
float avg = (float) sum / 2; return avg;
}
}

62. Count Vowels
Sample Input:
avinash
Sample Output:
3
Main:
import java.util.*;
public class Main {
private static Scanner s;
public static void main(String[] args) {
s = new Scanner(System.in);
String s1= s.next();
System.out.println(countVowels(s1));
}
UserMainCode
public class UserMainCode{
public static int countVowels(String s1)
{
String s2=s1.toLowerCase();
String s3="aeiou";
int count=0;
for(int i=0;i<s2.length();i++)
{
for(int j=0;j<s3.length();j++)
{
if(s2.charAt(i)==s3.charAt(j))
{
count++;
}
}
}
return count;
}
}

63. Month Name
Sample Input:
01-06-82
Sample Output:
JUNE
Main:
import java.text.ParseException;
import java.util.Scanner;
public class Main {
public static void main(String[] args) throws ParseException {
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
System.out.println(UserMainCode.calculateBornDay(s1));
sc.close();
}
}
UserMainCode:
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class UserMainCode {
public static String calculateBornDay(String s1) throws ParseException
{
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy");
SimpleDateFormat sdf1=new SimpleDateFormat("MMMM");
Date d=sdf.parse(s1);
String s=sdf1.format(d);
return s.toUpperCase();
}
}

64. Reverse SubString
Sample Input:
rajasthan
2
3
Sample Output:
hts
Main:
import java.util.*;
public class Main {
private static Scanner s;
public static void main(String[] args) {
s =new Scanner(System.in);
String input1= s.next();
int input2=s.nextInt();int input3=s.nextInt();
System.out.println(UserMainCode.retrieveString(input1,input2,input3));
}
}
UserMainCode
class UserMainCode {
public static String retrieveString(String input1, int input2, int input3) {
StringBuffer sb=new StringBuffer(input1);
sb.reverse();
String output=sb.substring(input2, input2+input3);
return output;
}
}

65. String Finder
Sample Input 1: Sample Output 1:
geniousRajKumarDev Yes
Raj
Dev
Sample Input 2: Sample Output 2:
geniousRajKumarDev No
Dev
Raj
USERMAINCODE:
public class UserMainCode { public static int stringFinder(String s1,String s2,String s3)
{ String a1=s1.toLowerCase(); String a2=s2.toLowerCase(); String a3=s3.toLowerCase();
if(a1.contains(a2)&&a1.contains(a3))
{
if(a1.indexOf(a2)<a1.indexOf(a3))
{
return 1;
}
else
return 2;
}
return 0;
}}
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args) { Scanner s=new Scanner(System.in);
String s1=s.next();
String s2=s.next();
String s3=s.next();
int b=UserMainCode.stringFinder(s1, s2, s3);
if(b==1)
{
System.out.println("yes");
}
else
System.out.println("No");
s.close();
}
}

66. Phone Number Validator
Sample Input 1: Sample Output 1:
265-265-7777 Valid
Sample Input 2: Sample Output 2:
265-65-7777 Invalid
USERMAINCODE:
public class UserMainCode {
public static int validatePhoneNumber(String s1)
{
String s2 = s1.replaceAll("-", "");
if (s2.matches("[0-9]{10}"))
{
return 1;
}
else
return 2;
}
}
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args) { Scanner s=new Scanner(System.in);
String s1=s.nextLine();
int b=UserMainCode.validatePhoneNumber(s1);
if(b==1)
{
System.out.println("Valid");
}
else
System.out.println("Invalid");
s.close();
}
}

67. Month : Number of Days
Sample Input: Sample Output:
2000 29
1
USERMAINCODE:
import java.util.Calendar;
public class UserMainCode {
public static int getNumberOfDays(int y,int c)
{
Calendar cal=Calendar.getInstance();
cal.set(Calendar.YEAR, y);
cal.set(Calendar.MONTH, c); int day=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
return day;
}
}
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int y=s.nextInt();
int c=s.nextInt();
System.out.println(UserMainCode.getNumberOfDays(y, c));
s.close();
}
}

68. Negative String
Sample Input 1: Sample Output 1:
This is just a misconception This is not just a misconception
Sample Input 2: Sample Output 2:
Today is misty Today is not misty
USERMAINCODE:
public class UserMainCode {
public static String negativeString(String s1)
{
String str=s1.replace(" is ", " is not ");
return str;
}
}
MAIN:
import java.util.*;
public class Main { public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
System.out.println(UserMainCode.negativeString(s1));
s.close();
}
}

69. Validate Number
Sample Input 1: Sample Output 1:
-94923 94923
Sample Input 2: Sample Output 2:
-6t -1
USERMAINCODE:
public class UserMainCode { public static String validateNumber(String s1)
{ String ss="-1";
if (s1.matches("[-]{1}[0-9]{1,}"))
{
String st=s1.replace("-",""); return st;
}
else return ss;
}
}
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.next(); System.out.println(UserMainCode.validateNumber(s1));
s.close();
}
}

70. Digits
Sample Input 1: Sample Output 1:
717 2
Sample Input 2: Sample Output 2:
4534 0
USERMAINCODE:
public class UserMainCode {
public static int countSeven(int n)
{
int rem,sum=0;
while(n>0)
{
rem=n%10;
if(rem==7)
{
sum++;
}
n=n/10;
}
return sum;
}
}
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(UserMainCode.countSeven(n));
s.close();
}
}

71. String Processing – III
Sample Input 1: Sample Output 1:
xxhixx hixxxx
Sample Input 2: Sample Output 2:
XXxxtest XXtestxx
USERMAINCODE:
public class UserMainCode {
public static String moveX(String s1)
{
String s2="";
String s3="";
for(int i=0;i<s1.length();i++)
{
char c=s1.charAt(i);
if(c=='x')
{
s2=s2+s1.charAt(i);
}
else
{
s3=s3+s1.charAt(i)
}
}
String st=s3.concat(s2);
return st;
}
}
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.next();
System.out.println(UserMainCode.moveX(s1));
s.close();
} }

72. String Processing – IV
Sample Input 1: Sample Output 1:
HelloWorld HelWrd
USERMAINCODE:
public class UserMainCode {
public static String getStringUsingNthCharacter(String s1,int n)
{
StringBuffer sb=new StringBuffer();
sb.append(s1.charAt(0));
for(int i=n-1;i<s1.length();i+=n)
{
sb.append(s1.charAt(i));
}
return sb.toString();
} }
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.next();
int n=s.nextInt();
System.out.println(UserMainCode.getStringUsingNthCharacter(s1, n));
s.close();
}
}

73. Digit Comparison
Sample Input 1:
59
29
Sample Output 1:
TRUE
UserMainCode
public class UserMainCode {
public static boolean compareLastDigit(int c,int d)
{
int c1=c%10;
int d1=d%10;
boolean b=false;
if(c1==d1)
{
b=true;
}
return b;
}
}
Main
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int c=s.nextInt();
int d=s.nextInt();
boolean res=UserMainCode.compareLastDigit(c,d);
if(res==true)
{
System.out.println("TRUE");
}
else
{
System.out.println("FALSE");
}
s.close();
}
}

74. Duplicates
Sample Input 1:
1
2
1
Sample Output 1:
2
Sample Input 2:
1
2
3
Sample Output 2:
6
UserMainCode:
public class UserMainCode {
public static int getDistinctSum(int a,int b,int c)
{
int sum;
if(a==b)
{
sum=c;
}
else if(b==c)
{
sum=a;
}
else if(c==a)
{
sum=b;
}
else
{
sum=a+b+c;
}
return sum;
}
}
Main:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int sum=UserMainCode.getDistinctSum(a, b, c);
System.out.println(sum);
s.close();
}
}

75. String Processing - MixMania
Sample Input 1:
Mix Mania
Sample Output 1:
TRUE
UserMainCode
public class UserMainCode {
public static boolean checkPattern(String str)
{
String str1=str.substring(0,3);
int a=0,b=0,c=0;
char c1=str1.charAt(0);
char c2=str1.charAt(1);
char c3=str1.charAt(2);
boolean b1=false;
if(Character.isDigit(c1)||Character.isLetter(c1))
{
a=1;
}
if(c2=='i')
{
b=1;
}
if(c3=='x')
{
c=1;
}
if(a==1&&b==1&&c==1)
{
b1=true;
}
return b1;
}
}
Main:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String str=s.nextLine();
boolean b2=UserMainCode.checkPattern(str);
if(b2==true)
{
System.out.println("TRUE");
}
else
{
System.out.println("FALSE");
}
s.close();
}
}

76. String Processing
Sample Input 1:
HelloWorld
Sample Output 1:
delloWorlH
UserMainCode
public class UserMainCode {
public static String exchangeCharacters(String s1)
{
String s2=s1.substring(1,s1.length()-1);
StringBuffer sb=new StringBuffer();
char c1=s1.charAt(0);
char c2=s1.charAt(s1.length()-1);
sb.append(c2).append(s2).append(c1);
return sb.toString();
}
}
Main:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.next();
System.out.println(UserMainCode.exchangeCharacters(s1));
s.close();
}
}

77. Regular Expression - II
Sample Input 1:
AcB
Sample Output 1:
TRUE
Sample Input 2:
A2B
Sample Output 2:
FALSE
UserMainCode:
public class UserMainCode {
public static boolean validateString(String s1)
{
boolean b=false;
if(s1.length()==3)
{
if(s1.matches("[a-zA-z]{3}"))
{
b=true;
}
}
return b;
}
}
Main:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.next();
boolean b1=userMainCode.validateString(s1);
if(b1==true)
{
System.out.println("TRUE");
}
else
{
System.out.println("FALSE");
}
s.close();
}
}

78. Strings Processing - Replication
Sample Input 1:
Lily
2
Sample Output 1:
LilyLily
UserMainCode:
public class UserMainCode { public static String repeatString(String s1,int n)
{
StringBuffer sb=new StringBuffer();
for(int i=0;i<n;i++)
{
sb.append(s1);
} return sb.toString();
}
}
Main:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.next();
int n=s.nextInt();
System.out.println(UserMainCode.repeatString(s1, n));
s.close();
}
}

79. SumOdd
Sample Input 1:
6
Sample Output 1:
9
UserMainCode:
public class UserMainCode { public static int addOddNumbers(int n)
{
int sum=0;
for(int i=1;i<=n;i+=2)
{
sum=sum+i;
} return sum;
}
}
Main:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(UserMainCode.addOddNumbers(n));
s.close();
}
}

80. String Processing - V
Sample Input 1:
3
AAA
BBB
CCC
Sample Output 1:
AAA,BBB,CCC
UserMainCode:
public class UserMainCode {
public static String concatString(int n,String[] s1)
{
StringBuffer sb=new StringBuffer();
for(int i=0;i<s1.length;i++)
{
sb.append(s1[i]).append(",");
}
String s2=sb.toString(); String s3=s2.substring(0,s2.length()-1);
return s3;
}
}
Main:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String s1[]=new String[n];
for(int i=0;i<n;i++)
{
s1[i]=s.next();
}
System.out.println(UserMainCode.concatString(n, s1));
s.close();
}
}

81.Unique Number
Sample Input 1:
12
4
3
Sample Output 1:
3
Sample Input 2:
4
-4
4
Sample Output 2:
2
Main:
import java.util.*;
public class Main {
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
System.out.println(UserMainCode.calculateUnique(a, b, c));
s.close();
}
}
UserMainCode:
public class UserMainCode {
public static int calculateUnique(int a,int b,int c)
{
int d=0;
if(a!=b&&a!=c&&b!=c)
{
d=3;
}
else if(a==b&&a==c&&b==c)
{
d=1;
}
else if((a!=b&&a==c&&b==c) || (a!=b&&a!=c&&b==c))
{
d=2;
}
else if((a==b&&a!=c&&b==c) || (a==b&&a!=c&&b!=c))
{
d=2;
}
else if((a==b&&a==c&&b!=c) || (a!=b&&a==c&&b!=c))
{
d=2;
}
return d;
}}

82. Math Calculator
Sample Input 1:
23
2
*
Sample Output 1:
46
Main:
import java.util.*;
public class Main {
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
char c = s.next().trim().charAt(0);
System.out.println(UserMainCode.calculator(a, b, c));
s.close();
}}
UserMainCode:
public class UserMainCode {
public static int calculator(int a,int b,char c)
{
int a1=0;
if(c=='*')
{
a1=a*b;
}
else if(c=='+')
{
a1=a+b;
}
else if(c=='-')
{
a1=a-b;
}
else if(c=='/')
{
a1=a/b;
}
else if(c=='%')
{
a1=a%b;
}
return a1;
}}

83. Scores
Sample Input 1:
3
1
100
100
Sample Output 1:
TRUE
Sample Input 2:
3
100
1
100
Sample Output 2:
FALSE
Main:
import java.util.*;
public class Main {
public static void main (String[] args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for(int i=0;i<n;i++){
arr[i] = sc.nextInt();
}
System.out.println(UserMainCode.checkScores(arr, n));
sc.close();
}
}
UserMainCode:
public class UserMainCode {
public static boolean checkScores(int arr[], int n){
boolean b = false;
for(int i=0;i<n-1;i++){
if(arr[i] == 100){
if(arr[i+1] == 100){
b = true;
break;
}
}
}
return b;
}
}

84. ArrayFront
Sample Input 1:
6
1
2
3
4
5
6
Sample Output 1:
FALSE
Sample Input 2:
3
1
2
9
Sample Output 2:
TRUE
Main:
import java.util.*;
public class Main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int []a=new int[s];
for(int i=0;i<s;i++)
{
a[i]=sc.nextInt();
}
if(UserMainCode.scanArray(a)==true)
System.out.println("TRUE");
else
System.out.println("FALSE");
sc.close();
}
}
UserMainCode:
public class UserMainCode { public static boolean scanArray(int[] a)
{
int u=0,l=0;
boolean b=false;
if(a.length>=4)
l=4;
else
l=a.length;
for(int i=0;i<l;i++)
if(a[i]==9)
u=10;
if(u==10)
b=true;
return b;
}
}

85. Word Count
Sample Input 1:
4
a
bb
b
ccc
1
Sample Output 1:
2
Sample Input 2:
5
dog
cat
monkey
bear
fox
3
Sample Output 2:
3
Main:
import java.util.*;
public class Main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(); String[] str=new String[n];
for(int i=0;i<n;i++)
{ str[i]=sc.next();
}
int c=sc.nextInt(); System.out.println(UserMainCode.countWord(n,str,c));
sc.close();
}}
UserMainCode:
public class UserMainCode { public static int countWord(int n,String str[],int c)
{
int count=0;
for(int i=0;i<str.length;i++)
{
if(str[i].length()==c)
{
count++;
}
}
return count;
}
}

86. Find Distance
Sample Input 1:
3
4
5
2
Sample Output 1:
3
Sample Input 2:
3
1
5
2
Sample Output 2:
2
Main:
import java.util.*;
public class Main {
public static void main (String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d=s.nextInt();
System.out.println(UserMainCode.findDistance(a,b,c,d));
s.close();
}
}
UserMainCode:
public class UserMainCode {
public static int findDistance(int a,int b,int c,int d) {
long q=(int)Math.round(Math.sqrt(((a-c)*(a-c))+((b-d)*(b-d))));
return (int) q;
}
}

87. Word Count - II
Sample Input 1:
Today is Sunday
Sample Output 1:
3
Main:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
UserMainCode.countWord(s1);
s.close();
}
}
UserMainCode:
import java.util.StringTokenizer;
public class UserMainCode {
public static void countWord(String s1){
StringTokenizer st=new StringTokenizer(s1," ");
int n=st.countTokens();
System.out.println(n);
}
}

88. Sum of Max & Min
Sample Input 1:
12
17
19
Sample Output 1:
31
Main:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
System.out.println(UserMainCode.getSumMaxMin(a,b,c));
s.close();
}}
UserMainCode:
public class UserMainCode {
public static int getSumMaxMin(int a,int b,int c)
{
int d=0;
if(a<b&&b<c)
{
d=a+c;
}
else if(a<b&&b>c)
{
d=b+c;
}
else if(a>b&&b<c)
{
d=a+b;
}
return d;
}}

89. Decimal to Binary Conversion
Sample Input 1:
5
Sample Output 1:
101
MAIN
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(UserMainCode.convertDecimalToBinary(n));
s.close();
}
}
UserMainCode
public class UserMainCode {
public static long convertDecimalToBinary(int n){
String s1=Integer.toBinaryString(n);
long y=Long.parseLong(s1);
return y;
}
}

90.String Processing - V
Sample Input 1:
Hello
2
Sample Output 1:
lolo
Sample Input 2:
Hello
3
Sample Output 2:
Llollollo
MAIN
import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
int n1=s.nextInt();
System.out.println(UserMainCode.returnLastRepeatedCharacters(s1,n1));
s.close();
}
}
USERMAINCODE
public class UserMainCode{
public static String returnLastRepeatedCharacters(String s1, int n1)
{
StringBuffer sb = new StringBuffer();
for(int i = 0 ; i < n1 ; i++)
sb.append(s1.substring(s1.length()-n1, s1.length()));
return sb.toString();
}
}

91.Regular Expression - III
Sample Input 1:
ab2
Sample Output 1:
TRUE
Sample Input 2:
72CAB
Sample Output 2:
FALSE
MAIN
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
if(UserMainCode.validateString(s1)==true) System.out.println("TRUE");
else System.out.println("FALSE");
s.close();
}
}
USERMAINCODE
public class UserMainCode { public static boolean validateString(String s)
{
boolean b=false;
if(s.charAt(0)=='0'||s.charAt(0)=='1'||s.charAt(0)=='2'||s.charAt(0)=='3'||s.charAt(0)=='4'||s.charAt(0)=='5'||s.charAt(0)=='6'||s.charAt(0)=='7'||s.charAt(0)=='8'||s.charAt(0)=='9'){
b=false;
}
else
b=true; return b;
}
}

92.String Processing - TrimCat
Sample Input 1:
Hello
Sample Output 1:
Hlo
MAIN
import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
System.out.println(UserMainCode.getAlternateChars(s1));
s.close();
}
}
USERMAINCODE
public class UserMainCode{
public static String getAlternateChars(String s)
{
//String s1=s.replaceAll(“ “, “”);
StringBuffer sbf = new StringBuffer();
for(int i = 0; i < s.length() ; i=i+2)
{
sbf.append(s.charAt(i));
}
String str = sbf.toString();
return str;
}
}

93. String Processing - Username
Sample Input 1:
admin@xyz.com
Sample Output 1:
admin
MAIN CLASS
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
System.out.println(UserMainCode.fetchUserName(s1));;
s.close();
}
}
USERMAINCODE
import java.util.StringTokenizer;
public class UserMainCode {
public static String fetchUserName(String s1) {
StringTokenizer st=new StringTokenizer(s1,"@");
String s2=st.nextToken();
return(s2);
}}

94. String Processing - VII
Sample Input 1:
AAAA
abab
2
Sample Output 1:
TRUE
Sample Input 2:
MNOP
QRST
3
Sample Output 2:
FALSE 

MAIN
 import java.util.Scanner;
 public class Main {
 public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 String s1=s.nextLine(); 
 String s2=s.nextLine();
 int n=s.nextInt();
boolean output=UserMainCode.isEqual(s1,s2,n); 
System.out.println(output);
 s.close();
 } } 
 
 USERMAINCODE
 public class UserMainCode {
 public static boolean isEqual(String s1,String s2,int n){
 boolean a=false; 
 if(n<s1.length()&&n<s2.length())
 { 
 char c=s1.charAt(n); 
 char d=s2.charAt(s2.length()-n); 
 String s3=Character.toString(c); 
 //System.out.println(s3); 
 String s4=Character.toString(d); 
 //System.out.println(s4); 
 if(s3.equalsIgnoreCase(s4)) {
 a=true;
}
 else {
 a=false;
 } } 
 return a;
 } }

95. Largest Difference
Sample Input 1:
7
2
4
5
1
9
3
8
Sample Output 1:
4
MAIN CLASS
import java.util.Scanner;
public class Main{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int m=s.nextInt();
int[] n1=new int[m];
for(int i=0;i<m;i++){
n1[i]=s.nextInt();
}
System.out.println(UserMainCode.checkDifference(n1));
s.close();
}
}
USERMAIN CODE
public class UserMainCode {
public static int checkDifference(int[] n1){
int n2,n3=0,n4=0,i;
for(i=0;i<n1.length-1;i++){
n2=Math.abs(n1[i]-n1[i+1]);
if(n2>n3){
n3=n2;
n4=i+1; }}
return n4;
}
}

1.Start Case
Sample Input:
Now is the time to act!
Sample Output:
Now Is The Time To Act!
MAIN CLASS
import java.util.Scanner;
public class Main {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
System.out.println(UserMainCode.printCapitalized(s1));
s.close();
}
}
USERMAIN CODE
import java.util.StringTokenizer;
public class UserMainCode{
public static String printCapitalized(String s1){
StringBuffer sb=new StringBuffer();
StringTokenizer t=new StringTokenizer(s1," ");
while(t.hasMoreTokens()){
String s2=t.nextToken();
String s3=s2.substring(0,1);
String s4=s2.substring(1, s2.length());
sb.append(s3.toUpperCase()).append(s4).append(" "); }
return sb.toString();
}
}

2. Maximum Difference
Sample Input :
6
4
8
6
1
9
4
Sample Output :
4
[In the sequence 4 8 6 1 9 4 the maximum distance is 8 (between 1 and 9). The function
should return the index of the greatest of two. In this case it is 9 (which is at index 4). output
= 4.]
Main:
import java.util.Scanner;
public class Main {
public static void main(String[] args) {Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[20];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int max=UserMainCode.findMaxDistance(a);
System.out.println(max);
s.close();
}
}
UserMainCode:
public class UserMainCode {
static int findMaxDistance(int[] a)
{
int max=0,index=0;
for(int i=0;i<19;i++)
{
int d=Math.abs(a[i]-a[i+1]);
if(d>max)
{
max=d;
if(a[i]>a[i+1])
{
index=i;
}
else
{
index=i+1;
}
}
}
return index;
}
}

3. Palindrome - In Range
Sample Input :
130
150
Sample Output :
272
(131+141 = 272)
Main:
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
int n2=s.nextInt();
System.out.println(UserMainCode.addPalindromes(n1,n2));
s.close();
}
}
UserMainCode:
public class UserMainCode {
public static int addPalindromes(int n1,int n2){
int sum=0;
for(int i=n1;i<=n2;i++){
int r=0,n3=i;
while(n3!=0){
r=(r*10)+(n3%10);
n3=n3/10;
}
if(r==i)
sum=sum+i;
}
return sum;
}
}

4. PAN Card
Sample Input 1:
ALD3245E
Sample Output 1:
Valid
Sample Input 2:
OLE124F
Sample Output 2:
Invalid
Main:
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
UserMainCode.validatePAN(s1);
s.close();
}
}
UserMainCode:
public class UserMainCode {public static void validatePAN(String s1) {
if(s1.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}"))
{
System.out.println("Valid");
}
else
System.out.println("Invalid");
}
}

5. Fibonacci Sum
Sample Input :
5
Sample Output :
7
[0 + 1 + 1 + 2 + 3 = 7]
Main:
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(UserMainCode.getSumOfNfibos(n));
s.close();
}
}

UserMainCode: 
public class UserMainCode { 
public static int getSumOfNfibos(int n){ 
int a=-1,b=1,c=0,d=0; 
for(int i=0;i<n;i++) {
 c=a+b; 
 d=d+c;
 a=b;
 b=c;
 } 
 return d;
 }
}

6.Test Vowels
Sample Input 1:
acbisouzze
Sample Output 1:
Yes
Sample Input 2:
cbisouzze
Sample Output 2:
No
Main:
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine(); int b=UserMainCode.testVowels(s1);
if(b==1)
System.out.println("Yes");
else
System.out.println("No");
s.close();
}
}
UserMainCode:
public class UserMainCode {
public static int testVowels(String s1) {
int b;
int n1=0,n2=0,n3=0,n4=0,n5=0;
String s2=s1.toLowerCase();
for(int i=0;i<s2.length();i++){
char c=s2.charAt(i);
if(c=='a')
n1++;
if(c=='e')
n2++;
if(c=='i')
n3++;
if(c=='o')
n4++;
if(c=='u')
n5++;}
if(n1==1&&n2==1&n3==1&&n4==1&&n5==1)
b=1;
else b=2;
return b;
}
}

7.Dash Check
Sample Input 1:
hi—there-you.
12--(134)-7539
Sample Output 1:
Yes
Sample Input 2:
-15-389
-xyw-zzy
Sample Output 2:
No
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();
int p=UserMainCode.compareDashes(s1,s2);
if(p==1)
System.out.println("Yes");
else
System.out.println("No");
s.close();
}
}
import java.util.ArrayList;
public class UserMainCode {
public static int compareDashes(String s1, String s2) {
ArrayList<Integer>l1=new ArrayList<Integer>();
for(int i=0;i<s1.length();i++)
{
if(s1.charAt(i)=='-')
{
l1.add(i);
}
}
ArrayList<Integer>l2=new ArrayList<Integer>();
for(int i=0;i<s2.length();i++)
{
if(s2.charAt(i)=='-')
{
l2.add(i);
}
}
//System.out.println(l1);
//System.out.println(l2);
if(l1.equals(l2))
{
return 1;
}
else
return 2;
}
}

8.Reverse Split
Sample Input:
Rabbit
-
Sample Output:
t-i-b-b-a-R

import java.util.Scanner; 
public class Main { 
public static void main(String[] args) { 
Scanner s=new Scanner(System.in); 
String s1=s.nextLine();
 String s2=s.next(); 
 System.out.println(UserMainCode.reShape(s1,s2));
 s.close();
 } } 
 public class UserMainCode {
 public static String reShape(String s,String s1){ 
 StringBuffer sb=new StringBuffer(s);
 StringBuffer sb2=new StringBuffer(); 
 String s2=sb.reverse().toString(); 
 for(int i=0;i<s2.length();i++) {
 sb2.append(s2.charAt(i));
 sb2.append(s1);
 } 
 sb2.deleteCharAt(sb2.length()-1);
 //System.out.println(sb2.toString()); 
 return sb2.toString();
 }
}

9.Remove 10's
Sample Input :
5
1
10
20
10
2
Sample Output :
1
20
import java.io.*;
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int i;
int n = sc.nextInt();
int a[] = new int[n];
for (i = 0; i < n; i++) {
a[i] = sc.nextInt();
}
UserMainCode.removeTens(a);
sc.close();
}
}
import java.util.*;
public class UserMainCode {
public static void removeTens(int a[]){
Scanner sc = new Scanner(System.in);
int i,k = 0;
int b[] = new int[a.length];
ArrayList<Integer> al = new ArrayList<Integer>();
for (i = 0; i <a.length; i++) {
if (a[i] != 10) {
al.add(a[i]);
}
}
if (al.size() < a.length) {
k = a.length- al.size();
for (i = 0; i < k; i++) {
al.add(0);
}
}
int b1[] = new int[a.length];
for (i = 0; i < a.length; i++) {
b1[i] = al.get(i);
System.out.println(b1[i]);
}
}}

10.Last Letters
Smaple Input :
This is a cat
Sample Output :
S$S$A$T
Main:
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String input=s.nextLine();
System.out.println(UserMainCode.getLastLetter(input));
}
}
UserMainCode:
import java.util.*;
public class UserMainCode {
public static String getLastLetter(String input){
String str1=null;
StringTokenizer st=new StringTokenizer(input," ");
StringBuffer sb=new StringBuffer();
while(st.hasMoreTokens()){
str1=st.nextToken();
/// String str2=Character.toString(str1.charAt(str1.length()-1));
String str2=str1.substring(str1.length()-1);
String str3= str2.toUpperCase();
sb.append(str3).append("$");
}sb.deleteCharAt(sb.length()-1);
return sb.toString();
}
}

11.Largest Key in HashMap
Sample Input 1:
3
12
amron
9
Exide
7
SF
Sample Output 1:
Amron
Main:
import java.util.*;
public class Main {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
HashMap<Integer, String>hm=new HashMap<Integer, String>();
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<n;i++)
{
int a=s.nextInt();
String s1=s.next();
hm.put(a,s1);
}
System.out.println(UserMainode.getMaxKeyValue(hm));
}
}
Hashmap:
import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
public class UserMainode {
public static String getMaxKeyValue(HashMap<Integer, String> hm) {
int max=0;
String s3=null;
Iterator<Integer>itr=hm.keySet().iterator();
while(itr.hasNext())
{
int b=itr.next();
if(b>max)
{
max=b;
s3=hm.get(b);
}
}
return (s3);
}
}

12.All Numbers
Sample Input 1:
4
123
24.5
23
one
Sample Output 1:
invalid
Sample Input 2:
2
123
24.5
Sample Output 2:
valid
Main: 
import java.util.*; 
public class Main 
{ 
public static void main(String[] args) 
{ 
Scanner s = new Scanner(System.in);
 int n = s.nextInt();
 String[] s1 = new String[n]; 
 for(int i=0;i<n;i++){ s1[i] = s.next(); 
 } 
 int out=(userMainCode.validateNumber(s1));
 System.out.println(out); 
 } } 
 
 UserMainCode: 
 class userMainCode{
 public static int validateNumber(String[] s1)
 { 
 int b =0 ,count,out=0; 
 for(int i=0;i<s1.length;i++){
 String s2 = s1[i];
 if(s2.matches("[0-9.]{1,}"))
{ 
count =0; 
for(int j=0;j<s2.length();j++)
 { char c = s2.charAt(j); 
 if(c=='.') 
 count++;
 }
 if(count>1)
 b=1; 
 } 
 else b=1; 
 } 
 if(b==0)
 { 
 out=1; 
 } else
 out=-1; 
 return out;
 }
}

13.Day of the Week
Sample Input 1:
07-13-2012
Main:
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
public static void main(String[] args)throws ParseException {
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
System.out.println(UserMainCode.getDay(s1));
}
// TODO Auto-generated method stub
}
UserMainCode:
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class UserMainCode {
public static String getDay(String s1) throws ParseException
{
SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
SimpleDateFormat sdf1=new SimpleDateFormat("EEEEE");
Date d=sdf.parse(s1);
String s=sdf1.format(d);
return s;
}
}

14.Max Substring
Sample Input 1:
delhi-pune-patna
-
Sample Output 1:
Delhi\
Main:
import java.util.*;
public class Main { public static void main(String[] args){
Scanner sc=new Scanner(System.in); String input1=sc.next(); String input2=sc.next();
System.out.println(UserMainCode.extractMax(input1,input2));
}
}
Usermaincode:
import java.util.StringTokenizer;
import java.util.*;
public class UserMainCode {
public static String extractMax(String input1,String input2){
int max=0;
String s3=null;
StringTokenizer st=new StringTokenizer(input1,"-");
while( st.hasMoreTokens())
{
String s2=st.nextToken();
int n=s2.length();
if(n>max)
{
max=n;
s3=s2;
}
}
return(s3);
}}

15.States and Capitals
Sample Input 1:
3
Karnataka
Bangaluru
Punjab
Chandigarh
Gujarat
Gandhinagar
Punjab
Sample Output 1:
chandigarh$punjab
Main:
import java.util.HashMap;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
HashMap<String,String> hm=new
HashMap<String,String>();
for(int i=0;i<n;i++)
{
String s1=sc.next();
String s2=sc.next();
hm.put(s1,s2);
}
String sa=sc.next();
System.out.print(UserMainCode.getCapital(hm,sa));
}
}
UserMainCode:
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class UserMainCode {
public static String getCapital(HashMap<String,String>
hm,String sa)
{
String chan=null;
Iterator<String>it=hm.keySet().iterator();
StringBuffer sb=new StringBuffer();
while(it.hasNext()){
String a=it.next();
if(a.equals(sa))
{
chan=hm.get(a);
sb.append(chan).append("$").append(sa);
}
}
return sb.toString();
}
}

16.Simple String Manipulation - II
Sample Input 1:
COGNIZANT TECHNOLOGY SOLUTIONS COGNIZANT
Sample Output 1:
9
Sample Input 2:
HOW ARE YOU
Sample Output 2:
6
Main:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String inpList=sc.nextLine();
System.out.println(UserMainCode.calculateWordSum(inpList));
}
}
UserMainCode:
import java.util.*;
public class UserMainCode { public static int calculateWordSum(String inp) {
int count=0;
String st[]=inp.split(" ");
String s1=st[0];
String slst=st[st.length-1];
if(s1.equals(slst))
{
count=s1.length();
}
else
{
count=s1.length()+slst.length();
} return count;
}
}

17.Vowels, Arrays & ArrayLists
Sample Input 1:
4
abcde
pqrs
abci
orto
Sample Output 1:
abcde
abci
orto
Main:
package vowels;
import java.util.*;
public class Main {
public static void main(String[] args) {
int n;
Scanner sc=new Scanner(System.in);
n=Integer.parseInt(sc.nextLine());
String[] str=new String[n];
for(int i=0;i<n;i++)
{
str[i]=sc.nextLine();
}
ArrayList<String> arr=new ArrayList<String>();
arr=UserMainCode.matchCharacter(str);
Iterator<String> it=arr.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}
Usermaincode:
package vowels;
import java.util.*;
public class UserMainCode {
public static ArrayList<String> matchCharacter (String[] ss)
{
ArrayList<String> as=new ArrayList<String>();
for(int i=0;i<ss.length;i++)
{
String sp=ss[i];
char[] mp=sp.toLowerCase().toCharArray();
if((mp[0]=='a'||mp[0]=='e'||mp[0]=='i'||mp[0]=='o'||mp[0]=='u')&&(mp[sp.length()-
1]=='a'||mp[sp.length()-1]=='e'||mp[sp.length()-1]=='i'||mp[sp.length()-
1]=='o'||mp[sp.length()-1]=='u'))
{
as.add(sp);
}
}
return as;
}
}

18.Transfer from Hashmap to Arraylist
Sample Input 1:
4
1
ravi5raJ
2
sita8gitA
3
ram8sitA
4
rahul
Sample Output 1:
ravi5raJ
sita8gitA
ram8sitA
main:
import java.util.*;
import java.text.*;
public class Main {
public static void main(String[] args) {
HashMap<Integer,String> hm1=new HashMap<Integer,String>();
int n;
Scanner sc=new Scanner(System.in);
n=Integer.parseInt(sc.nextLine());
for(int i=0;i<n;i++)
{
hm1.put(Integer.parseInt(sc.nextLine()),sc.nextLine());
}
ArrayList<String> al1=new ArrayList<String>();
al1=UserMainCode.getName(hm1);
Iterator<String> it=al1.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}
Usermaincode:
import java.util.*;
import java.text.*;
public class UserMainCode {
public static ArrayList<String> getName(HashMap<Integer,String> hm1)
{
ArrayList<String> al2=new ArrayList<String>();
Iterator<Integer> it =hm1.keySet().iterator();
while(it.hasNext())
{
int id=it.next();
String name=hm1.get(id);
if(name.matches("[a-z]{1,}.*[0-9]{1,}.*[A-Z]{1}"))
al2.add(name);
}
return al2;
}
}

19.Max Admissions
Sample Input 1:
4
2010
200000
2011
300000
2012
45000
2013
25000
Sample Output 1:
2011
 USERMAINCODE:
 import java.util.ArrayList; 
 public class UserMainCode { 
 public static int year (ArrayList<Integer> a1) {
 int max=0,pos=0;
 for(int i=1;i<a1.size();i+=2) 
 { 
 if(a1.get(i)>max) {
 max=a1.get(i); pos=i; 
 } }
 return a1.get(pos-1);
 } }
 MAIN:
 import java.util.*; 
 class Main
 {
 public static void main(String [] args) {
 Scanner s=new Scanner(System.in); 
 ArrayList<Integer> a1=new ArrayList<Integer>();
int n=s.nextInt();
 n=n*2; 
 for(int i=0;i<n;i++)
 { 
 a1.add(s.nextInt());
 } 
System.out.println(UserMainCode.year(a1));
 s.close();
 } }

20.Sum Non Prime Numbers
Sample Input:
9
Sample Output:
28
Main:
import java.util.*;
public class Main {
public static void main(String[] args) {
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(UserMainCode.addNumbers(n));
}
}
}
Usermaincode:
public class UserMainCode {
public static int addNumbers(int n) {
int sum=0;int k=0;int sum1=0;
for(int i=1; i<=n; i++)
{ k=0;
for(int j=1; j<=i; j++)
{
if(i%j==0)
k++;
}
if(k!=2)
{
sum=sum+i;
}
}
return sum;
}
}

21.Date Format Conversion
Sample Input:
12/11/1998
Sample Output:
12-11-98
Main:
import java.util.*;
import java.text.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.next();
UserMainCode.convertDateFormate(s1);
}
}
Usermaincode:
import java.util.*;
import java.text.*;
public class UserMainCode {
public static void convertDateFormate(String s1) {
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
sdf.setLenient(false);
try {
Date d1=sdf.parse(s1);
SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yy");
String s2=sdf1.format(d1);
System.out.println(s2);
} catch (ParseException e) {
e.printStackTrace();
}
}
}

22.Valid Date
Sample Input 1:
12.03.2012
Sample Output 1:
Valid
Sample Input 2:
27#01#1977
Sample Output 2:
Invalid
UserMainCode: 

public class UserMainCode 
{ 
public static int dateformat(String s1) throws ParseException {
 String s2=" ";
int n=-1;
 if(s1.matches("[0-9]{2}[.]{1}[0-9]{2}[.]{1}[0-9]{4}")) { 
 SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy"); 
 Date d=sdf.parse(s1);
 s2=sdf.format(d);
 n=1;
 } 
 else if(s1.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{2}")) { 
 SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yy"); 
 Date d1=sdf1.parse(s1);
 s2=sdf1.format(d1);
 n=1; 
 } else if(s1.matches("[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}")) 
 { 
 SimpleDateFormat sdf2=new SimpleDateFormat("dd-MM-yyyy");
 Date d2=sdf2.parse(s1); 
 s2=sdf2.format(d2);
 n=1;
 } else 
 { 
 n=-1; 
 } 
 return n;
} }
 MAIN:
 import java.text.ParseException; 
 import java.util.*; 
 class Main 
 {
 public static void main(String [] args) throws ParseException { 
 Scanner s=new Scanner(System.in); 
 String s1=s.next(); 
 int b=UserMainCode.dateformat(s1); 
 if(b==1) { 
 System.out.println("Valid"); 
 } Else
 {
 System.out.println("Invalid"); 
 } 
 s.close();
 } }

23.Convert Format
Sample Input:
555-666-1234
Sample Output:
55-56-661-234
Main:
import java.util.*;
import java.text.*;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s=sc.next();
System.out.println(UserMainCode.convertFormate(s));
}
}
Usermaincode:
import java.util.*;
import java.text.*;
public class UserMainCode {
public static String convertFormate(String s) {
StringTokenizer t=new StringTokenizer(s,"-");
String s1=t.nextToken();
String s2=t.nextToken();
String s3=t.nextToken();
StringBuffer sb=new StringBuffer();
sb.append(s1.substring(0, s1.length()-1)).append('-');
sb.append(s1.charAt(s1.length()-1)).append(s2.charAt(0)).append('-');
sb.append(s2.substring(1, s2.length())).append(s3.charAt(0)).append('-');
sb.append(s3.substring(1, s3.length()));
return sb.toString();
}
}

24.Add and Reverse
Sample Input
6
10
15
20
25
30
100
15
Sample Output
571
Main:
import java.util.*;
public class Main {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int b=sc.nextInt();
System.out.println(UserMainCode.addAndReverse(n,b,a)) ;
sc.close();
}
}
Usermaincode:
import java.util.*;
public class UserMainCode {
public static int addAndReverse(int n,int b,int a[])
{
int i=0,sum=0,r=0;
for(i=0;i<a.length;i++)
{
if(a[i]>b)
{
sum=sum+a[i];
}
}
System.out.println(sum);
while(sum!=0)
{
r=((r*10)+(sum%10));
sum=sum/10;
}
return r;
}
}

25.Next Year day
Sample Input:
13/07/2012
Sample Output:
Saturday
Main:
import java.util.*;
import java.text.*;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s1=sc.next(); UserMainCode u=new UserMainCode();
{ System.out.println(u.nextYearDay(s1));
}
}
}
Usercodemain:
import java.util.*;
import java.text.*;
public class UserMainCode
{
public String nextYearDay(String s1)
{
String s=null;
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
sdf.setLenient(false);
try {
Date d1=sdf.parse(s1);
Calendar cal=Calendar.getInstance();
cal.setTime(d1);
cal.add(Calendar.YEAR, 1);
Date d2=cal.getTime();
SimpleDateFormat sdf1=new SimpleDateFormat("EEEEE");
s=sdf1.format(d2);
}
catch (ParseException e)
{
e.printStackTrace();
}
return s;
}
}

26.Sum Squares of Digits
Sample Input:
321
Sample Output:
14
Main:-
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
UserMainCode.getSumOfSquaresOfDigits(n);
s.close();
}
}
UserMainCode:-
import java.util.*;
public class UserMainCode {
public static void getSumOfSquaresOfDigits(int n) {
int a=n;
int rem=0;
int sum=0;
while(a!=0)
{
rem=a%10;
sum=sum+(rem*rem);
a=a/10;
}
System.out.println(sum);
}
}

27.Even and Odd Index Sum
Sample Input 1:
23050
Sample Output 1:
no
Sample Input 2:
231
Sample Output 2:
Yes
Main:-
import java.util.Scanner;
public class Main {
public static void main(String[] args) { Scanner sc = new Scanner(System.in); int n = sc.nextInt();
UserMainCode.sumOfOddEvenPositioned(n); sc.close();
}
}
UserMainCode:-
import java.util.*;
public class UserMainCode {
public static void sumOfOddEvenPositioned(int n) {
int rem = 0, i = 0;
int a[] = new int[10];
while (n > 0) {
rem = n % 10;
a[i] = rem;
n = n / 10;
i++;
}
int sume = 0, sumo = 0;
for (int j = i - 1; j >= 0; j--) {
if(j%2!=0)
{
sumo = sumo + a[j];
}
else
{
sume = sume + a[j];
}
}
if (sume == sumo) {
System.out.println("Yes");
} else
System.out.println("No");
}
}

28.Remove 3 Multiples
Sample Input:
6
3
1
11
19
17
19
Sample Output
3
1
19
17
Main:-
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Main{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
ArrayList<Integer> al=new ArrayList<Integer>();
ArrayList<Integer> al1=new ArrayList<Integer>();
int n=Integer.parseInt(sc.nextLine());
for(int i=0;i<n;i++)
{
al.add(sc.nextInt());
}
al1=UserMainCode.removeMultiplesOfThree(al);
Iterator it=al1.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}
UserMainCode:-
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
public class UserMainCode
{ public static ArrayList<Integer> removeMultiplesOfThree(ArrayList<Integer> al)
{
ArrayList<Integer> al2=new ArrayList<Integer>();
for(int i=0;i<al.size();i++)
{
if((i+1)%3!=0)
al2.add(al.get(i));
}
return al2;
}
}

29.String Occurances - II
Sample Input 1:
catcowcat
cat
Sample Output 1:
2
Sample Input 2:
catcowcat
CAT
Sample Output 2:
0
Main:-
MAIN 
import java.util.Scanner;
public class Main { 
public static void main(String[]args){ 
Scanner sc=new Scanner(System.in); 
String s=sc.nextLine(); 
String s1=sc.nextLine();
 System.out.println(UserMainCode.getSubstring(s, s1));
 sc.close(); 
 } } 
 USERMAINCODE 
 public class UserMainCode{ 
 public static int getSubstring(String s,String s1)
 { int t=s1.length(); int count=0; 
 for(int i=0;i<s.length()-t+1;i++) 
 {
 String s3=s.substring(i,t+i);
 if(s3.equals(s1)) 
 { 
 count++; 
 } } 
 return count;
 }
}

30. Programming Logic
Sample Input 1:
1
2
3
Sample Output 1:
6
Sample Input 2:
1
2
13
Sample Output 2:
3
Sample Input 3:
13
3
8
Sample Output 3:
8
Main:-
import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
System.out.println(UserMainCode.luckySum(a,b,c));
}
}
UserMainCode:-
public class UserMainCode{
public static int luckySum(int a, int b, int c)
{
if(a == 13)
return 0;
if(b == 13)
return a;
if(c == 13)
return (a + b);
return (a + b + c);
}
}

31.Triplets
Sample Input 1:
7
3
3
5
5
5
2
3
Sample Output 1:
TRUE
Sample Input 2:
7
5
3
5
1
5
2
3
Sample Output 2:
FALSE
Main:-
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
boolean s=UserMainCode.checkTripplets(a);
if(s==true)
System.out.println("TRUE");
else
System.out.println("FALSE");
}
}
UserMainCode:-
import java.util.*;
public class UserMainCode {
public static boolean checkTripplets(int[] a)
{
boolean b=false;
for(int i=0;i<a.length-2;i++)
{
if((a[i]==a[i+1])&&(a[i+1]==a[i+2]))
{
b=true;
}
}
return b;
}
}

32.Repeat Front
Sample Input 1:
Coward
2
Sample Output 1:
CowCow
Sample Input 2:
So
3
Sample Output 2:
SoSoSo
Main:-
import java.util.*;
public class Main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int n=Integer.parseInt(sc.nextLine());
System.out.println(UserMainCode.repeatFirstThreeCharacters(s,n));
sc.close();
}
}
UserMaincode:-
import java.util.*;
public class UserMainCode
{ public static String repeatFirstThreeCharacters(String s,int n)
{
StringBuffer sb=new StringBuffer();
StringBuffer sb1=new StringBuffer();
if(s.length()>3)
{ sb.append(s.substring(0,3));
s=sb.toString();
}
for(int i=0;i<n;i++)
sb1.append(s);
return sb1.toString();
}
}

33.Sorted Array
Sample Input 1:
6
AAA
BBB
AAA
AAA
CCC
CCC
Sample Output 1:
AAA
BBB
CCC
Sample Input 2:
7
AAA
BBB
aaa
AAA
Abc
A
b
Sample Output 2:
A
AAA
Abc
BBB
aaa
b
Main:-
import java.util.*;
public class Main
{
public static void main(String[] args)
{
int n;
Scanner sin = new Scanner(System.in);
n = sin.nextInt();
String[] a1 = new String[n];
for(int i=0;i<n;i++)
{
a1[i] = sin.next();
}
a1 = UserMainCode.orderElements(a1);
for(int i=0;i<a1.length;i++)
System.out.println(""+a1[i]);
}
}
UserMainCode:-
import java.util.*;
public class UserMainCode
{
public static String[] orderElements(String[] arr)
{
HashSet<String> al=new HashSet<String>();
for(int i=0;i<arr.length;i++)
{
al.add(arr[i]);
}
Iterator<String> itr=al.iterator(); String ar[] = new String[al.size()];
int i =0 ;
while(itr.hasNext()){ ar[i] = itr.next();
i++;
} Arrays.sort(ar); return ar;
}
}

34.Pattern Matcher
Sample Input 1:
CPT-302020
Sample Output 1:
TRUE
Sample Input 2:
CPT123412
Sample Output 2:
FALSE
Main:
import java.util.*;
public class Main
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String s = sc.next();
System.out.println(UserMainCode.CheckID(s));
sc.close();
}}
UserMainCode:
public class UserMainCode
{ public static boolean CheckID(String s)
{
boolean b=false;
if(s.matches("(CPT)[-]{1}[0-9]{6}"))
{
b=true;
}
else
{
b=false;
}
return b;
}
}

35.Playing with String - I
Sample Input 1:
4
ABC
XYZ
EFG
MN
3
Sample Output 1:
CZG$
Main:
import java.util.Scanner;
public class Main
{
public static void main(String[] arg)
{
Scanner s=new Scanner(System.in);
int n=Integer.parseInt(s.nextLine());
String[] sc=new String[n];
for(int i=0;i<n;i++)
{
sc[i]=s.nextLine();
}
int a=Integer.parseInt(s.nextLine());
System.out.println(UserMainCode.formString(n,sc,a));
s.close();
}
}
UserMainCode:
public class UserMainCode {
public static String formString(int n,String[] input,int a)
{
StringBuffer sb=new StringBuffer();
for(int i=0;i<n;i++)
{
if(input[i].length()>=a)
{
String a1=input[i];
sb.append(a1.charAt(a-1));
}
else
{
sb.append('$');
}
}
return sb.toString();
}}

36.Regular Expression - 1
Sample Input 1:
vR4u
Sample Output 1:
TRUE
Sample Input 2:
vRau
Sample Output 2:
FALSE
Sample Input 3:
vrau
Sample Output 3:
FALSE
S.36) import java.util.Scanner;
public class Main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
String n=sc.nextLine();
System.out.println(UserMainCode.validate(n));
sc.close();
}
}
public class UserMainCode
{ public static String validate(String s)
{
String w="FALSE";
if(s.length()==4 &&
(Character.isDigit(s.charAt(0))||Character.isAlphabetic(s.charAt(0)))&&s.charAt(1)=='R')
{
if(Character.isDigit(s.charAt(2)))
w="TRUE";
}
return w;
}
}

37.Regular Expression – 2 (Age Validator)
Sample Input 1:
23
Sample Output 1:
TRUE
Sample Input 2:
-34
Sample Output 2:
FALSE
Sample Input 3:
3a
Sample Output 3:
FALSE
AcB/TRUE
Main:
import java.util.*;
public class Main {
public static void main(String[]args){
Scanner s=new Scanner(System.in); //Regular Expression – 2 (Age Validator) pg.No:150
String n=s.nextLine();
boolean b=UserMainCode.ValidateAge(n);
if(b==true)
{
System.out.println("TRUE");
}
else
System.out.println("FALSE");
s.close();
}
}
UserMainCode:
public class UserMainCode {
public static boolean ValidateAge(String n)
{
boolean b = false;
if(n.matches("[0-9]{2}"))
{ //Regular Expression – 2 (Age Validator) pg.No:150
int a=Integer.parseInt(n);
if(a>0&&a>=21&&a<=45)
{
b=true;
}
else
b=false;
}
return b;
}}

38. Regular Expression – 3 (Phone Validator)
Sample Input 1:
9987684321
Sample Output 1:
TRUE
Sample Input 2:
0014623452
Sample Output 2:
FALSE
Main: 
import java.util.*;
 public class Main {
 public static void main(String[]args)
 { 
 Scanner s=new Scanner(System.in); 
 String s1=s.nextLine(); 
 boolean b1=UserMainCode.validatePhone(s1); 
 if(b1==true) {
 //phone validation pg.no:151 System.out.println("TRUE"); 
 } 
 else 
 { 
 System.out.println("FALSE");
 } 
 s.close();
 } }
 
UserMainCode: 
public class UserMainCode { 
public static boolean validatePhone(String s1) {
 boolean b=false; 
 if(s1.matches("[0]{1}[0]{1}[0-9]{8}") ) {
 b=false; 
 }
 //phone validation pg.no:151 
 else {
 b=true;
 } 
 return b;
 }
}

39.String Splitter
Sample Input 1:
AAA/bba/ccc/DDD
/
Sample Output 1:
aaa
abb
ccc
ddd
import java.util.*;
public class Main
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
String ip1=s.next();
char ip2='/';
String op[]=UserMainCode.manipulateLiteral(ip1,ip2);
for(int i=0;i<op.length;i++)
System.out.println(op[i]);
s.close();
}} import java.util.ArrayList;
import java.util.StringTokenizer;
public class UserMainCode
{
public static String[] manipulateLiteral(String ip1, char ip2)
{
StringTokenizer t1 = new StringTokenizer(ip1,"/"); ArrayList<String> lst = new ArrayList<String>();
while(t1.hasMoreTokens())
{
StringBuffer sb = new StringBuffer();
sb.append(t1.nextToken().toLowerCase());
lst.add(sb.reverse().toString());
}
String[] op = new String[lst.size()];
for(int i = 0;i<lst.size();i++)
{
op[i] = lst.get(i);
}
return op;
}
}

40.Vowel Count
Sample Input 1:
NewYork
Sample Output 1:
2
Sample Input 2:
Elephant
Sample Output 2:
3
import java.util.*;
public class Main
{
public static void main(String[]args) // Second set: 40.Vowel Count//
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int max=UserMainCode.tellVowelCount(s);
System.out.println(max);
sc.close();
}
}
public class UserMainCode {
public static int tellVowelCount(String s)
{
int max=0;
int count=0;
for(int i=0;i<s.length();i++)
{
char c=s.charAt(i);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||
c=='O'||c=='U')
{
count++;
}
}
if(count>max)
{
max=count;
}
return max;
}
}

41.Playing with String - II
Sample Input 1:
5
AAA
BB
CCCC
A
ABCDE
Sample Output 1:
a
aaa
abcde
bb
cccc
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String s1[]=new String[n];
String s2[]=new String[n];
for(int i=0;i<n;i++) //S.41.Playing with String - II//
{
s1[i]=s.next();
}
s2=UserMainCode.sortArray(s1,n);
for (int i = 0; i < n; i++) {
System.out.println(s2[i]);
}
s.close();
}}
import java.util.Arrays;
public class UserMainCode
{
public static String[] sortArray(String s1[],int n){
String s2[]=new String[n];
for (int i = 0; i < n; i++)
{
s2[i]=s1[i].toLowerCase();
}
Arrays.sort(s2);
return s2;
}
}

42.Median Calculation
Sample Input 1:
7
1
2
1
4
7
1
2
Sample Output 1:
2
Sample Input 2:
6
52
51
81
84
60
88
Sample Output 2:
71
Main
import java.util.*;
public class Main
{
public static void main(String[] args)
{
int n;
Scanner sin = new Scanner(System.in);
n = sin.nextInt();
int[] a1 = new int[n];
for(int i=0;i<n;i++)
{
a1[i] = sin.nextInt();
}
System.out.println(""+UserMainCode.calculateMedian(a1));
sin.close();
}
}
UserMainCode
import java.util.Arrays;
public class UserMainCode
{
public static int calculateMedian(int[] a)
{
Arrays.sort(a);
int length = a.length; int result=0,mid=0,midNext=0;
if((length%2) != 0)
{
mid = (length/2)+1; result = a[mid];
}
else
{
mid = length/2;
midNext = mid+1;
float add = a[mid-1]+a[midNext-1];
float div = add/2; result = Math.round(div);
} return result;
}
}

43.Sequence in Array
Sample Input 1:
9
11
-2
5
1
2
3
4
5
6
Sample Output 1:
TRUE
Sample Input 2:
6
-2
5
1
3
2
6
Sample Output 2:
FALSE
Main
import java.util.*;
public class Main
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
System.out.println(UserMainCode.searchsequence(a));
s.close();
}
}
UserMainCode
public class UserMainCode { public static boolean searchsequence(int[] a)
{
boolean b = false; for(int i = 0 ; i< a.length-3; i++)
{ if(a[i]==1 && a[i+1]==2 && a[i+2]==3)
b = true;
}
return b;
}
}

44.Asterisk & Characters
Sample Input 1:
Hello*World
Sample Output 1:
FALSE
Sample Input 2:
Welcome*elizabeth
Sample Output 2:
TRUE
Main
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String input=s.next();
System.out.println( UserMainCode. scanStarNeighbors (input));
s.close();
}
}
UserMainCode
import java.util.StringTokenizer;
public class UserMainCode {
public static boolean scanStarNeighbors (String input) {
boolean b=false;
StringTokenizer t=new StringTokenizer(input,"*");
String s1=t.nextToken();
String s2=t.nextToken();
String s3=s1.substring(s1.length()-1);
String s4=s2.substring(0,1);
if(s3.equalsIgnoreCase(s4))
b=true;
return b;
}
}

45.Occurance Count
Sample Input 1:
Hello world Java is best programming language in the world
world
Sample Output 1:
2
Sample Input 2:
hello world
World
Sample Output 2:
0
Main
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in); String s1=s.nextLine(); String s2=s.nextLine();
int v=UserMainCode.countWords(s1,s2);
System.out.println(v);
s.close();
}
}
UserMainCode
import java.util.StringTokenizer;
public class UserMainCode {
public static int countWords(String s1,String s2){
StringTokenizer t=new StringTokenizer(s1," ");
int c=0;
while(t.hasMoreTokens())
{
String s3=t.nextToken();
if(s3.equals(s2))
c++;
}
return c;
}
}

46.Regular Expressions - III
Sample Input 1:
Catcowcat
cat
Sample Output 1:
2
Sample Input 2:
Catcowcat
catp
Sample Output 2:
0
Main
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.next();
String s2=s.next();
int v=UserMainCode.searchString(s1,s2);
System.out.println(v);
s.close();
}
}
UserMainCode
public class UserMainCode {
public static int searchString(String s1,String s2){
int c=0;
int t=s2.length();
for(int i=0;i<s1.length()-t+1;i++){
if(s2.equals(s1.substring(i,t+i))){
c++;
}
}
return c;
}
}

47.Strings Processing
Sample Input 1:
Apple,Banana,Orange
2
Sample Output 1:
Banana
Sample Input 2:
Apple,Banana,Orange
4
Sample Output 2:
Orange
Main
import java.util.Scanner;
public class Main
{
public static void main(String args[])
{
String str=new String();
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
int n=sc.nextInt();
String k=UserMainCode.findFruitName(str, n);
System.out.println(k);
sc.close();
}
}
UserMainCode
import java.util.StringTokenizer;
public class UserMainCode
{
public static String findFruitName(String m,int n)
{
int i=0;
String h=null;
StringTokenizer st=new StringTokenizer(m,",");
int max=st.countTokens();
String[] ss=new String[max];
while(st.hasMoreElements())
{
ss[i++]=st.nextToken();
}
if(n>max)
h=ss[i-1];
else
h=ss[n-1];
return h;
}
}

48.Proper Case
Sample Input 1:
This is cognizant academy
Sample Output 1:
This Is Cognizant Academy
Main
import java.util.*;
public class Main {
public static void main(String[] args){
Scanner s=new Scanner(System.in); String s1=s.nextLine();
System.out.println(UserMainCode.changeCase(s1));
s.close();
}
}
UserMainCode
import java.util.StringTokenizer;
public class UserMainCode {
public static String changeCase(String s1){
StringBuffer s5=new StringBuffer();
StringTokenizer t=new StringTokenizer(s1," ");
while(t.hasMoreTokens()){
String s2=t.nextToken();
String s3=s2.substring(0,1);
String s4=s2.substring(1, s2.length());
s5.append(s3.toUpperCase()).append(s4).append(" ");
}
return s5.toString();
}
}

49.Length of same word
Sample Input 1:
This is Cognizant Academy
Sample Output 1:
11
Sample Input 2:
Hello World Hello
Sample Output 2:
5
Main
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
// TODO Auto-generated method stub
String s1=sc.nextLine();
System.Out.Println(UserMainCode.compareLastWords(s1));
sc.close();
}
}
UserMainCode
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class UserMainCode {
public static int compareLastWords(String s1){
List<String> l=new ArrayList<String>();
StringTokenizer t=new StringTokenizer(s1," ");
while(t.hasMoreTokens())
{
String s2=t.nextToken();
l.add(s2);
}
String s3=l.get(0);
String s4=l.get(l.size()-1);
if(s3.equals(s4))
{
int n=s3.length();
System.out.println(n);
}
else
{
int n1=s3.length();
int n2=s4.length();
int n=n1+n2;
}
Return n;
}
}

50.Perfect Number
Sample Input 1:
28
Sample Output 1:
TRUE
import java.util.*;
public class Main {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
boolean j=(UserMainCode.getPerfection(n));
if(j==true)
System.out.println("TRUE");
else
System.out.println("FALSE");
}
}
public class UserMainCode {
public static boolean getPerfection(int n){
boolean b=false;
int sum=0;
for(int i=1;i<n;i++){
int r=n%i;
if(r==0)
sum=sum+i;
}
b=(sum==n);
return b;
}
}

51.Find Digits
Sample Input 1:
843.21
Sample Output 1:
3:2
Sample Input 2:
20.130
Sample Output 2:
2:2
Sample Input 3:
20.130
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
double d=s.nextDouble();
System.out.println(UserMainCode.findNoDigits(d));
}}
import java.util.StringTokenizer;
public class UserMainCode {
public static String findNoDigits(double d) {
int n1=0,n2=0;
String s=String.valueOf(d);
StringTokenizer t=new StringTokenizer(s,".");
String s1=t.nextToken();
String s2=t.nextToken();
n1=s1.length();
n2=s2.length();
if(s1.charAt(0)=='0')
n1=s1.length()-1;
if(n2!=1)
if(s2.charAt(s2.length()-1)=='0')
n2=s2.length()-1;
String s3=String.valueOf(n1)+":"+String.valueOf(n2);
return s3;
}
}

52.Employees & Designations
Sample Input 1:
4
Manish
MGR
Babu
CLK
Rohit
MGR
Viru
PGR
MGR
Sample Output 1:
Manish
Rohit
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int k1=Integer.parseInt(sc.nextLine());
LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();
for(int i=0;i<k1;i++)
{
String k=sc.nextLine();
String s=sc.nextLine();
hm.put(k,s);
}
String n=sc.nextLine();
LinkedHashMap<String,String> hm1=new LinkedHashMap<String,String>();
hm1=UserMainCode.obtainDesignation(hm,n);
Iterator<String> it=hm1.keySet().iterator();
while(it.hasNext())
{
String s2=it.next();
System.out.println(s2);
}
}
}
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class UserMainCode
{
public static LinkedHashMap<String,String> obtainDesignation(LinkedHashMap<String,String> h1,String n)
{
int k=0;
LinkedHashMap<String,String> hm1=new LinkedHashMap<String,String>();
Iterator<String>it=h1.keySet().iterator();
while(it.hasNext())
{
String s2=it.next();
String s3=h1.get(s2);
if(s3.equals(n))
hm1.put(s2,s3);
}
return hm1;
}}

53. Grade Calculator
Sample Input 1:
3
Avi
76.36
Sunil
68.42
Raja
36.25
Sample Output 1:
Avi
PASS
Sunil
PASS
Raja
FAIL
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int k1=Integer.parseInt(sc.nextLine());
LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();
for(int i=0;i<k1;i++)
{
String k=sc.nextLine();
String s=sc.nextLine();
hm.put(k,s);
}
String n=sc.nextLine();
LinkedHashMap<String,String> hm1=new LinkedHashMap<String,String>();
hm1=UserMainCode.obtainDesignation(hm,n);
Iterator<String> it=hm1.keySet().iterator();
while(it.hasNext())
{
String s2=it.next();
System.out.println(s2);
}
}
}
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class UserMainCode
{
public static LinkedHashMap<String,String> obtainDesignation(LinkedHashMap<String,String> h1,String n)
{
int k=0;
LinkedHashMap<String,String> hm1=new LinkedHashMap<String,String>();
Iterator<String>it=h1.keySet().iterator();
while(it.hasNext())
{
String s2=it.next();
String s3=h1.get(s2);
if(s3.equals(n))
hm1.put(s2,s3);
}
return hm1;
}}

54. DOB - Validation
Sample Input 1:
12/23/1985
Sample Output 1:
TRUE
Sample Input 2:
31/12/1985
Sample Output 2:
FALSE
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
String str=new String();
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
Boolean b=UserMainCode.ValidateDOB(str);
if(b==”true”)
System.out.println("TRUE");
if(b==”false”)
System.out.println("FALSE");
}
}
import java.text.SimpleDateFormat;
import java.util.Date;
public class UserMainCode {
public static Boolean ValidateDOB(String str){
Boolean b=”false”;
SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
sdf.setLenient(false);
try
{
Date d1=sdf.parse(str);
return b=”true”;
}
catch(Exception e)
{
return b=”false”;
}
}
}

55.Experience Validator
Sample Input:
2001
5
Sample Output:
TRUE
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String s=sc.nextLine();
String s1=sc.nextLine();
System.out.println(UserMainCode.validateExp(s,s1));
}
}
import java.util.Calendar;
import java.util.Date;
public class UserMainCode {
public static boolean validateExp(String s,String s1)
{
int y1=Integer.parseInt(s);
Date d=new Date();
Calendar c=Calendar.getInstance();
int y2=c.get(Calendar.YEAR);
int y=Math.abs(y1-y2);
int e=Integer.parseInt(s1);
if(y>=e)
return true;
else
return false;
}}

56. ArrayList to String Array
Sample Input 1:
4
a
d
c
b
Sample Output 1:
a
b
c
d
import java.util.*;
public class Main
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
ArrayList<String> l=new ArrayList<String>();
int n=s.nextInt();
for(int i=0;i<n;i++)
{
l.add(s.next());
}
String a[]=new String[n];
a=UserMainCode.convertToStringArray(l);
for(int j=0;j<n;j++)
{
System.out.println(a[j]);
}
}
}
import java.util.ArrayList;
import java.util.Collections;
class UserMainCode
{
public static String[] convertToStringArray(ArrayList<String> l)
{
Collections.sort(l);
String [] a = l.toArray(new String[l.size()]);
return a;
}
}

57.State ID generator
Sample Input 1:
3
Kerala
Gujarat
Goa
Sample Output 1:
KER:Kerala
GUJ:Gujarat
GOA:Goa Main 
Class import java.util.*; 
public class Main {
 public static void main(String[] args) 
 { 
 Scanner s=new Scanner(System.in); int n=s.nextInt();
String[] s1=new String[n];
 for(int i=0;i<n;i++)
 { s1[i]=s.next();
 }
 HashMap<String, String> hm = new HashMap<String, String>(); 
 hm = UserMainCode.putvalues(s1); 
 for(Map.Entry<String, String> ans: hm.entrySet()) 
 {
 System.out.println(ans.getKey()+":"+ans.getValue());
 } 
 }}
 User main code 
 import java.util.ArrayList; 
 import java.util.HashMap;
 import java.util.Map;
 public class UserMainCode
 { 
 public static HashMap<String, String> putvalues(String[] s1) 
 { 
 HashMap<String, String> hm = new HashMap<String, String>(); 
 ArrayList<String> lst1 = new ArrayList<String>(); 
 ArrayList<String> lst2 = new ArrayList<String>();
for(String s : s1) 
lst1.add(s.toUpperCase().substring(0,3));
 for(String s : s1) 
 lst2.add(s); 
 for(int i=0;i<s1.length;i++) 
 { 
 hm.put(lst1.get(i),lst2.get(i)); 
 } 
 return hm;
 }
}

58. ArrayList to String Array
Sample Input 1:
3
Apple
Cherry
Grapes
4
Orange
Mango
Melon
Apple
Sample Output 1:
Cherry
Grapes
Orange
USERMAINCODE:
import java.util.ArrayList;
import java.util.*;
public class UserMainCode {
public static String[] fruitSelector(ArrayList<String> a1,ArrayList<String> a2)
{
ArrayList<String> a3=new ArrayList<String>();
for(int i=0;i<a1.size();i++)
{
String s1=a1.get(i);
if(s1.charAt(s1.length()-1)!='a'&&s1.charAt(s1.length()-1)!='e'&&s1.charAt(s1.length()-1)!='A'&&s1.charAt(s1.length()-1)!='E')
{
a3.add(s1);
}
}
ArrayList<String> a4=new ArrayList<String>();
for(int j=0;j<a2.size();j++)
{
String s2=a2.get(j);
if(s2.charAt(0)!='m'&&s2.charAt(0)!='a'&&s2.charAt(0)!='M'&&s2.charAt(0)!='A')
{
a4.add(s2);
}
}
a3.addAll(a4);
Collections.sort(a3);
String st[]=new String[a3.size()];
for(int k=0;k<a3.size();k++)
{
st[k]=a3.get(k);
}
return st;
}
}
MAIN:
import java.util.*;
import java.util.ArrayList;
public class Main {
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
int m=s.nextInt();
ArrayList<String> aa1=new ArrayList<String>();
for(int i=0;i<m;i++)
{
aa1.add(s.next());
}
int n=s.nextInt();
ArrayList<String> aa2=new ArrayList<String>();
for(int j=0;j<n;j++)
{
aa2.add(s.next());
}
int k;
String st[]=UserMainCode.fruitSelector(aa1,aa2);
for( k=0;k<st.length;k++)
{
System.out.println(st[k]);
}
if(st.length==0)
System.out.println("No Fruit Found");
s.close();
}
}

59)Elements in ArrayList
Sample Input 1:
4
1
8
3
5
2
3
5
Sample Output 1:
1
8
Sample Input 2:
4
9
1
3
5
4
1
3
5
6
Sample Output 2:
6
9
MAIN:
import java.util.*;
public class Main
{
public static void main(String[] args)
{
int n,m;
Scanner sin = new Scanner(System.in);
n = sin.nextInt();
ArrayList<Integer> a1 = new ArrayList<Integer>(n);
for(int i=0;i<n;i++)
{
int k = sin.nextInt();
a1.add(k);
}
m = sin.nextInt();
ArrayList<Integer> a2 = new ArrayList<Integer>(m);
for(int i=0;i<m;i++)
{
int k = sin.nextInt();
a2.add(k);
}
int[] result = UserMainCode.arrayListSubtractor(a1,a2);
Arrays.sort(result);
for(int i=0;i<result.length;i++)
System.out.println(result[i]);
}
}
USERMAINCODE:
import java.util.ArrayList;
public class UserMainCode
{
public static int[] arrayListSubtractor(ArrayList<Integer> arrlist1,ArrayList<Integer>
arrlist2)
{
int count=0,key;
int max = arrlist1.size();
if(arrlist1.size() < arrlist2.size())
max = arrlist2.size();
ArrayList<Integer> temp = new ArrayList<Integer>(max);
for(int i=0;i<arrlist1.size();i++)
{
key = (int)arrlist1.get(i);
if(arrlist2.indexOf(key) == -1)
{
++count;
temp.add(key);
}
}
for(int i=0;i<arrlist2.size();i++)
{
key = (int)arrlist2.get(i);
if(arrlist1.indexOf(key) == -1)
{
if(!temp.contains(key))
{
++count;
temp.add(key);
}
}
}
int[] result = new int[count];
for(int i=0;i<count;i++)
result[i] = (int)temp.get(i);
return result;
}
}

60.Price Calculator - II
Sample Input 1:
3
Monitor
1200.36
Mouse
100.42
Speakers
500.25
2
Speakers
Mouse
Sample Output 1:
600.67
MAIN:
import java.util.HashMap;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner S=new Scanner(System.in);
int n=S.nextInt();
HashMap<String, Float> m1=new HashMap<String, Float>();
for(int i=0;i<n;i++)
{
String name=S.next();
float price=S.nextFloat();
m1.put(name,price);
}
int m=S.nextInt();
String s[]=new String[m];
for(int j=0;j<m;j++)
{
s[j]=S.next();
}
System.out.println(UserMainCode.getTheTotalCostOfPheripherals(m1,s));
}
}
USERMAINCODE:
import java.util.HashMap;
import java.util.Iterator;
public class UserMainCode {
public static float getTheTotalCostOfPheripherals(HashMap<String,Float> m1, String[] s) {
Float f=(float) 0;
Iterator<String> i=m1.keySet().iterator();
while(i.hasNext()){
String s1=i.next();
Float f1=m1.get(s1);
for(int j=0;j<s.length;j++)
if(s[j].equals(s1))
f+=f1; }
return f;
}
}

61.String Processing - ZigZag
Sample Input 1:
12-06-2012
Sample Output 1:
30
Sample Input 2:
10-02-2012
Sample Output 2:
29
MAIN:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
public static void main(String[] args) throws IOException, ParseException {
Scanner S=new Scanner(System.in);
String s1=S.next();
UserMainCode.getLastDayOfMonth(s1);
}
}
USERMAINCODE:
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class UserMainCode {
public static void getLastDayOfMonth(String s1) throws ParseException{
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
Calendar cal=Calendar.getInstance();
Date d1=sdf.parse(s1);
cal.setTime(d1);
int n=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
System.out.println(n);
}
}

62.Leap Year
Sample Input 1:
23/02/2012
Sample Output 1:
TRUE
Sample Input 2:
12/12/2011
Sample Output 2:
FALSE
MAIN:
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
public static void main(String[] args) throws IOException, ParseException {
Scanner S=new Scanner(System.in);
String s1=S.next();
UserMainCode.isLeapyear(s1);
}
}
USERMAINCODE:
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;
public class UserMainCode {
public static void isLeapyear(String s1) throws ParseException{
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
GregorianCalendar g=new GregorianCalendar();
StringTokenizer t=new StringTokenizer(s1,"/");
String s2=t.nextToken();
String s3=t.nextToken();
String s4=t.nextToken();
int n1=Integer.parseInt(s4);
Date d1=sdf.parse(s1);
boolean b=g.isLeapYear(n1);
System.out.println(b);
}
}

63) Largest Chunk
Sample Input 1:
This place is soooo good
Sample Output 1:
4
MAIN:
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner S=new Scanner(System.in);
String s1=S.nextLine();
System.out.println(UserMainCode.getLargestSpan(s1));
}
}
USERMAINCODE:
import java.util.StringTokenizer;
public class UserMainCode {
public static int getLargestSpan(String s1) {
int max=0;
StringTokenizer t=new StringTokenizer(s1," ");
while(t.hasMoreTokens()){
String s2=t.nextToken();
int n=0;
for(int i=0;i<s2.length()-1;i++)
if(s2.charAt(i)==s2.charAt(i+1))
n++;
if(n>max)
max=n;
}
return (max+1);
} }

64) Largest Span
Sample Input 1:
6
4
2
1
4
5
7
Sample Output 1:
4
MAIN:
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.print(UserMainCode.getLargestSpan(a,n));
}}
USERMAINCODE:
public class UserMainCode {
public static int getLargestSpan(int[] x,int n)
{
int gap=0,max=0;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(x[i]==x[j])
{
gap=j;
}
}
if(gap-i>max)
max=gap-i;
}
return max+1;
}
}

65 )Even Sum & Duplicate Elements
Sample Input 1:
7
2
3
54
1
6
7
7
Sample Output 1:
62
Sample Input 2:
6
3
7
9
13
17
21
Sample Output 2:
-1
MAIN:
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println(UserMainCode.sumElements(a));
}}
USERMAINCODE:
import java.util.Iterator;
import java.util.LinkedHashSet;
public class UserMainCode {
public static int sumElements(int a[])
{
LinkedHashSet<Integer>h1=new LinkedHashSet<Integer>();
int s=0;
for(int i=0;i<a.length;i++)
{
h1.add(a[i]);
}
Iterator<Integer> it=h1.iterator();
while(it.hasNext())
{
int k=it.next();
if(k%2==0)
{
s=s+k;
}
}
if(s>0)
return s;
else
return -1;
}
}

66. Regular Expression - III
Sample Input 1:
Technology$1213
Sample Output 1:
valid
Main:
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String a=s.next();
System.out.println(UserMainCode.passwordValidation(a));
s.close();
}
}
UserMainCode:
public class UserMainCode
{
public static String passwordValidation(String a)
{
String k;
if(a.matches(".*[0-9]{1,}.*")&&a.matches(".*[@#$]{1,}.*")&&a.length()>=8&&a.matches(".*[A-Z]{1,}.*")&&a.matches(".*[a-z].*"))
{
k="validinput";
}
else
{
k="Invalidinput";
}
return k;
}
}

67. Integer Factorial
Sample Input1:
4
2
3
5
4
Sample Output1:
2:2
3:6
5:120
4:24
Main:
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=Integer.parseInt(s.nextLine());;
int[]k=new int[a];
for(int i=0;i<a;i++)
{
k[i]=s.nextInt();
}
LinkedHashMap<Integer,Integer>hm=new LinkedHashMap<Integer,Integer>();
hm=UserMainCode.getFactorial(k);
Iterator<Integer> it=hm.keySet().iterator();
for(int i=0;i<a;i++)
{
int n=it.next();
int fac=hm.get(n);
System.out.println(n+":"+fac);
s.close();
}
}
}
UserMainCode;
import java.util.LinkedHashMap;
public class UserMainCode
{
public static LinkedHashMap<Integer,Integer> getFactorial(int[] k)
{
LinkedHashMap<Integer,Integer> hm1=new LinkedHashMap<Integer,Integer>();
for(int i=0;i<k.length;i++)
{
int u=1;
for(int j=1;j<=k[i];j++)
{
u=u*j;
}
hm1.put(k[i],u);
}
return hm1;
}
}

68. String processing – Long + Short + Long
Sample Input 1:
Hello
Hi
Sample Output 1:
HelloHiHello
Main;
import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String s1=s.next();
String s2=s.next();
System.out.println(UserMainCode.getCombo(s1,s2));
s.close();
}
}
UserMainCode;
public class UserMainCode
{
public static String getCombo(String s1,String s2)
{
StringBuffer sb=new StringBuffer();
int p=s1.length();
int q=s2.length();
if(p>q)
{
sb.append(s1).append(s2).append(s1);
}
else
{
sb.append(s2).append(s1).append(s2);
}
return sb.toString();
}
}

69. Age for Voting
Sample Input 1:
16/11/1991
Sample Output 1:
eligible
Main:
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String a=s.nextLine();
System.out.println(UserMainCode.getAge(a));
s.close();
}
}
UserMainCode:
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class UserMainCode
{
public static String getAge(String n)
{
Scanner s=new Scanner(System.in);
int year=0;
String s1=s.next();
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
try
{
Date d=sdf.parse(n);
Date d1=sdf.parse(s1);
int y=d.getYear();
int y1=d1.getYear();
int m=d.getMonth();
int m1=d1.getMonth();
int day=d.getDate();
int day1=d1.getDate();
year=y1-y;
if(m>m1)
year--;
else if(m==m1)
{if(day<day1)
year--;
}
}
catch(Exception e)
{
e.printStackTrace();
}
if(year>18)
return "eligible";
else
return "not-eligible";
}
}

1. Unique Even Sum
Sample Input 1:
4
2
5
1
4
Sample Output 1:
6
Sample Input 2:
3
1
1
1
Sample Output 2:
no even numbers
Main:
import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] a=new int [n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println(UserMainCode.addUniqueEven(a));
s.close();
}
}
UserMainCode;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class UserMainCode
{
public static int addUniqueEven(int[] a)
{
int sum=0;
LinkedHashSet<Integer> hm=new LinkedHashSet<Integer>();
for(int i=0;i<a.length;i++)
{
hm.add(a[i]);
}
Iterator<Integer> im=hm.iterator();
while(im.hasNext())
{
int b=im.next();
if(b%2==0)
sum=sum+b;
}
if(sum>0)
{
return sum;
}
else
return -1;
}
}

2. Palindrome & Vowels
Sample Input 1:
abceecba
Sample Output 1:
valid
Sample Input 2:
abcd
Sample Output 2:
invalid
Main;
import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(UserMainCode.checkPalindrome(s));
sc.close();
}
}
UserMainCode;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class UserMainCode
{
public static int checkPalindrome(String s)
{
StringBuffer sb=new StringBuffer(s);
int k=0;
LinkedHashSet<Character>l1=new LinkedHashSet<Character>();
String s2=sb.reverse().toString();
if(s2.equals(s))
{
String s3=s2.toLowerCase();
for(int i=0;i<s3.length();i++)
{
l1.add(s3.charAt(i));
}
Iterator<Character> it=l1.iterator();
while(it.hasNext())
{
char a=it.next();
if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
k++;
}
}
if(k>=2)
return 1;
else
return -1;
}
}

3. Strings – Unique & Existing Characters
Sample Input 1:
abcxyz
axdef
Sample Output 1:
a++ x++
Sample Input 2:
ABCDEF
feCBAd
Sample Output 2:
ABCDEF
Main;
import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
String s1=sc.next();
System.out.println(UserMainCode.replacePlus(s,s1));
sc.close();
}
}
UserMainCode;
public class UserMainCode
{
public static String replacePlus(String s,String s1)
{
{
String s2=s.toLowerCase();
String s3=s1.toLowerCase();
StringBuffer sb=new StringBuffer();
for(int i=0;i<s.length();i++)
{
char c=s2.charAt(i);
if(s3.indexOf(c)==-1)
sb.append("+");
else
sb.append(s.charAt(i));
} return sb.toString();
}
}
}

4. Longest Word
Sample Input 1:
Welcome to the world of Programming
Sample Output 1:
Programming
Sample Input 2:
ABC DEF
Sample Output 2:
ABC
Main;
import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
System.out.println(UserMainCode.getLargestWord(s1));
s.close();
}
}
UserMainCode;
import java.util.StringTokenizer;
public class UserMainCode
{
public static String getLargestWord(String s1)
{
int max=0;
String s2=new String();
StringTokenizer t=new StringTokenizer(s1," ");
{
while(t.hasMoreTokens()){
String s3=t.nextToken();
int n=s3.length();
if(n>max){
max=n;
s2=s3;}
}
return s2;
}
}
}

5. String Occurences
Sample Input 1:
abc bcd abc bcd abc abc
av abc
Sample Output 1:
4
Sample Input 2:
ABC xyz AAA
w abc
Sample Output 2:
0
UserMainCode
import java.util.StringTokenizer;
public class UserMainCode
{
public static void countNoOfWords(String s1, String s2) {
int count=0;
StringTokenizer st=new StringTokenizer(s2," ");
String s3=st.nextToken();
String s4=st.nextToken();
//System.out.println(s4);
StringTokenizer st1=new StringTokenizer(s1," ");
while(st1.hasMoreTokens())
{
String s5=st1.nextToken();
if(s4.equals(s5))
{
count++;
}
}
System.out.println(count);
}
}
Main
import java.util.*;
public class Main
{
/**
* @param args
*/
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();
UserMainCode.countNoOfWords(s1,s2);
s.close();
}
}

6. ArrayList Manipulation
Sample Input 1:
5
12
13
14
15
16
2
3
4
5
6
Sample Output 1:
2
13
4
15
6
UserMainCode
import java.util.ArrayList;
import java.util.Iterator;
public class UserMainCode
{
public static ArrayList<Integer> generateOddEvenList (ArrayList<Integer>al1,ArrayList<Integer>al2)
{
ArrayList<Integer>al3=new ArrayList<Integer>();
for(int i=0;i<al1.size();i++)
{
if(i%2==0)
al3.add(al2.get(i));
else
al3.add(al1.get(i));
}
return al3;
}
}
Main
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
ArrayList<Integer>al1=new ArrayList<Integer>();
ArrayList<Integer>al2=new ArrayList<Integer>();
for(int i=0;i<s;i++)
al1.add(sc.nextInt());
for(int i=0;i<s;i++)
al2.add(sc.nextInt());
ArrayList<Integer>al3=new ArrayList<Integer>();
al3=UserMainCode.generateOddEvenList(al1,al2);
Iterator<Integer> it=al3.iterator();
while(it.hasNext())
{
int n=it.next();
System.out.println(n);
sc.close();
}
}
}

7. Duplicate Characters
Sample Input 1:
hi this is sample test
Sample Output 1:
hi tsample
Sample Input 2:
ABC DEF
Sample Output 2:
ABC DEF
UserMainCode
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;
public class UserMainCode
{
public static void removeDuplicates(String s1) {
char a[]=s1.toCharArray();
StringBuffer sb=new StringBuffer();
LinkedHashSet<Character>hs=new LinkedHashSet<Character>();
for(int i=0;i<a.length;i++)
{
hs.add(a[i]);
}
Iterator<Character>itr=hs.iterator();
while(itr.hasNext())
{
char o=itr.next();
if(o!=' ');
{
sb.append(o);
}
}
System.out.println(sb);
}
}
Main
import java.util.*;
public class Main {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
UserMainCode.removeDuplicates(s1);
s.close();
}
}

8. Mastering Hashmap
Sample Input 1:
4
2
34
1
4
5
12
4
22
Sample Output 1:
8
UserMainCode
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
public class UserMainCode {
public static int getAverageOfOdd(HashMap<Integer,Integer>h1)
{
int av=0,c=0,s=0;
Iterator<Integer> it=h1.keySet().iterator();
while(it.hasNext())
{
int a=it.next();
if(a%2!=0)
{
int b=h1.get(a);
s=s+b;
c++;
}
}
av=s/c;
return av;
}}
Main
import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
for(int i=0;i<n;i++)
{
h1.put(sc.nextInt(),sc.nextInt());
}
System.out.println(UserMainCode.getAverageOfOdd(h1));
sc.close();
}
}

9. Managers & Hashmaps
SampleInput1:
2
2
programmer
3000
8
manager
50000
SampleOutput1:
8
55000
UserMainCode
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashMap;
public class UserMainCode
{public static HashMap<Integer,Integer> display(HashMap<Integer,String>hm,HashMap<Integer,Integer>hm1)
{
HashMap<Integer,Integer>hm3=new HashMap<Integer,Integer>();
Iterator<Integer> it=hm.keySet().iterator();
while(it.hasNext())
{
int id=it.next();
String name=hm.get(id);
if(name.equals("manager"))
{int salary=hm1.get(id)+5000;
hm3.put(id,salary);
}}
return hm3;
}
}
Main
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class Main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
HashMap<Integer,String>hm=new HashMap<Integer,String>();
HashMap<Integer,Integer>hm1=new HashMap<Integer,Integer>();
for(int i=0;i<s;i++)
{
int id=Integer.parseInt(sc.nextLine());
hm.put(id, sc.nextLine());
hm1.put(id,Integer.parseInt(sc.nextLine()));
}
HashMap<Integer,Integer>hm2=new HashMap<Integer,Integer>();
hm2=UserMainCode.display(hm,hm1);
Iterator<Integer> it=hm2.keySet().iterator();
while(it.hasNext())
{
int n=it.next();
int fac=hm2.get(n);
System.out.println(n);
System.out.println(fac);
}
}
}

10. Check first and last word
Sample Input 1:
how are you you are how
Sample Output 1:
3
Sample Input 2:
how is your child
Sample Output 2:
8
UserMainCode
import java.util.StringTokenizer;
public class UserMainCode
{
public static int check(String s)
{
int count=0;
String fin="";
StringTokenizer st=new StringTokenizer(s);
String ini=st.nextToken();
while(st.hasMoreTokens())
{ fin=st.nextToken();
}
if(ini.equals(fin))
count=ini.length();
else
count=ini.length()+fin.length();
return count;
}
}
Main
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class Main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
String age=sc.nextLine();
System.out.println(UserMainCode.check(age));
sc.close();
}}

11. Concatenate Characters
Sample Input:
3
ab
a
abcd
Sample Output:
Bad
UserMainCode
public class UserMainCode
{ public static String concatCharacter(String[] a)
{
StringBuffer sb=new StringBuffer();
for(int i=0;i<a.length;i++)
sb.append(a[i].charAt(a[i].length()-1));
return sb.toString();
}
}
Main
import java.util.*;
public class Main
{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
String []a=new String[s];
for(int i=0;i<s;i++)
{
a[i]=sc.nextLine();
}
System.out.println(UserMainCode.concatCharacter(a));
sc.close();
}
}

12.Anagram
Sample Input 1:
eleven plus two
twelve plus one
Sample Output 1:
Anagrams
Sample Input 2:
orchestra
carthorse
Sample Output 2:
Anagrams
Sample Input 3:
cognizant
technologies
Sample Output 3:
Not Anagrams
UserMainCode
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class UserMainCode
{
public static void getAnagram(String s1,String s2)
{
List<Character> l1=new ArrayList<Character>();
List<Character> l2=new ArrayList<Character>();
String s3=s1.replace(" ","");
String s4=s2.replace(" ","");
String s5=s3.toUpperCase();
String s6=s4.toUpperCase();
for (int i = 0; i < s5.length(); i++)
{
l1.add(s5.charAt(i));
}
for (int i = 0; i < s6.length(); i++)
{
l2.add(s6.charAt(i));
}
Collections.sort(l1);
Collections.sort(l2);
// System.out.println(l1);
// System.out.println(l2);
if(l1.equals(l2))
System.out.println("Anagram");
else
System.out.println("Not Anagram");
}
}
Main
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
UserMainCode.getAnagram(s1,s2);
}
}

13.Calculate Meter Reading
Sample Input:
CSECE12390
CSECE12400
Sample Output:
40
import java.util.Scanner;
public class Main{
public static void main (String[] args)
{
// your code goes here
Scanner sc = new Scanner(System.in);
String input1=sc.next();
String input2=sc.next();
System.out.println(UserMainCode.calculateMeterReading(input1,input2));
sc.close();
}}
public class UserMainCode {
public static int calculateMeterReading(String input1, String input2)
{
int n1=Integer.parseInt(input1.substring(5,input1.length()));
int n2=Integer.parseInt(input2.substring(5,input2.length()));
int n=Math.abs((n2-n1)*4);
return n;
}
}

14.Retirement
Sample Input :
4
C1010
02/11/1987
C2020
15/02/1980
C3030
14/12/1952
T4040
20/02/1950
Sample Output :
[C3030, T4040]
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class Main
{
public static void main(String args[]) throws ParseException{ Scanner sc=new Scanner(System.in); int
n=Integer.parseInt(sc.nextLine());
LinkedHashMap<String,String>a1=new LinkedHashMap<String,String>(); for(int i=0;i<n;i++) {
a1.put(sc.nextLine(),sc.nextLine());
}
System.out.println(UserMainCode.retirementEmployeeList(a1));
}
}
import java.text.*;
import java.util.*;
public class UserMainCode {
public static ArrayList<String> retirementEmployeeList(LinkedHashMap<String,String>a1) throws ParseException
{
ArrayList<String>al=new ArrayList<String>();
Iterator <String>it=a1.keySet().iterator();
while(it.hasNext())
{String s=it.next();
String s1=a1.get(s);
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
sdf.setLenient(false);
try{
Date d=new Date();
Date d1=new Date();
String a=s1;
String b="01/01/2014";
d=sdf.parse(a);
d1=sdf.parse(b);
long t=d.getTime();
long t1=d1.getTime();
long t3=t1-t;
long l1=(24 * 60 * 60 * 1000);
long l=l1*365;
long res=t3/l;
if(res>=60)
{
al.add(s);
}
}
catch (Exception e) {
e.printStackTrace();
}
}
Collections.sort(al);
return al;
}
}

15.Kaprekar Number
Sample Input 1:
9
Sample Output 1:
Kaprekar Number
Sample Input 2:
45
Sample Output 2:
Kaprekar Number
Sample Input 3:
4
Sample Output 3:
Not A Kaprekar Number
import java.util.*;
public class Main{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int v=UserMainCode.getKaprekarNumber(n);
if (v==1)
System.out.println("Kaprekar Number");
else
System.out.println("Not a Kaprekar Number");
}}
public class UserMainCode {
public static int getKaprekarNumber(int a)
{
int count=0,j=0;
int a1=a;
while(a1!=0)
{
count=count+1;
a1=a1/10;
}
int square=a*a;
String s=Integer.toString(square);
String s1=s.substring(0,count);
String s2=s.substring(count);
int x=Integer.parseInt(s1);
int y=Integer.parseInt(s2);
int result =x+y;
if(result==a){
j=1;
}
else
{
j=2;
}
return j;
}}

16.Vowels
Sample Input :
What is your name?
Sample Output :
your
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s1 =sc.nextLine();
UserMainCode.storeMaxVowelWord(s1);
}
}
import java.util.StringTokenizer;
public class UserMainCode {
public static void storeMaxVowelWord(String s1) {
int i = 0;
StringTokenizer st = new StringTokenizer(s1," ");
int len = 0;
int count = 0;
int count2 = 0;
String s6 = null;
while (st.hasMoreTokens()) {
String s5 = st.nextToken();
len = s5.length();
count=0;
for (i = 0; i < len; i++) {
if (s5.charAt(i) == 'a' || s5.charAt(i) == 'e'|| s5.charAt(i) == 'i' || s5.charAt(i) == 'o'|| s5.charAt(i) == 'u'
||s5.charAt(i) == 'A' ||s5.charAt(i) == 'E' ||s5.charAt(i) == 'I' ||s5.charAt(i) == 'O' ||s5.charAt(i) == 'U')
count++;
}
if (count > count2)
{
count2 = count;
s6 = s5;
}
}
System.out.println(s6);
}
}

17.Unique Characters REPEATED
Sample Input 1:
HOWAREYOU
Sample Output 1:
7
(Hint :Unique characters are : H,W,A,R,E,Y,U and other characters are repeating)
Sample Input 2:
MAMA
Sample Output2:
-1
import java.util.*;
public class Main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s1=sc.next();
UserMainCode.checkUnique(s1);
}
}
import java.util.*;
public class UserMainCode {
public static void checkUnique(String s1)
{
String s2=s1.toLowerCase();
StringBuffer sb=new StringBuffer(s2);
int l=sb.length();
int count=0;
for(int i=0;i<l;i++)
{ count=0;
for(int j=i+1;j<l;j++)
{
if(sb.charAt(i)==sb.charAt(j))
{
sb.deleteCharAt(j);
count++;
j--;
l--;
}
}
if(count>0)
{
sb.deleteCharAt(i);
i--;
l--;
}
}
if(sb.length()==0)
{
System.out.println(-1);
}
else
System.out.println(sb.length());
}
}

18.average of primes
Sample Input 1:
4
2
5
2
4
Sample Output 1:
3
import java.util.Scanner;
public class Main{
public static void main (String[] args)
{
// your code goes here
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
System.out.println(UserMainCode.addPrimeIndex(n));
}}
import java.util.*;
public class UserMainCode {
public static int addPrimeIndex(int n) {
Scanner sc=new Scanner(System.in);
int[] a = new int[n];
for(int i=0;i<n;i++){
a[i] = sc.nextInt();
}
int sum=0;
int count=0;
int sum_count=0;
for(int i=0;i<a.length;i++)
{
count=0;
for(int j=1;j<=i;j++)
{
if(i%j==0)
{
count++;
}
}
if(count==2)
{
sum=sum+a[i];
sum_count++;
}
}
int avg=sum/sum_count;
return avg;
}}

19. ArrayList and Set Operations
Sample Input 1:
3
1
2
3
3
5
7
+
Sample Output 1:
1
2
3
5
7
Sample Input 2:
4
10
9
8
7
2
4
6
8
*
Sample Output 2:
8
Sample Input 3:
4
5
10
15
20
0
10
12
20
-
Sample Output 3:
5
15
Main:
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.nextLine());
ArrayList<Integer>a1=new ArrayList<Integer>();
ArrayList<Integer>a2=new ArrayList<Integer>();
for(int i=0;i<n;i++)
a1.add(Integer.parseInt(sc.nextLine()));
for(int i=0;i<n;i++)
a2.add(Integer.parseInt(sc.nextLine()));
char c=sc.nextLine().charAt(0);
System.out.println(UserMainCode.performSetOperations(a1,a2,c));
}
}
UserMainCode:
import java.util.ArrayList;
import java.util.ArrayList;
public class UserMainCode {
public static ArrayList<Integer> performSetOperations(ArrayList<Integer>a1,ArrayList<Integer>a2,char c)
{
ArrayList<Integer>op1=new ArrayList<Integer>();
int k=0;
switch(c)
{
case '+':
a1.removeAll(a2);
a1.addAll(a2);
op1=a1;
break;
case '*':
a1.retainAll(a2);
op1=a1;
break;
case '-':
for(int i=0;i<a1.size();i++)
{
k=0;
for(int j=0;j<a2.size();j++)
{
if(a1.get(i)==a2.get(j))
k=1;
}
if(k==0)
op1.add(a1.get(i));
}
break;
}
return op1;
}}
}
return tm;
}
}

20.Largest Span
Sample Input 1:
5
1
2
1
1
3
Sample Output 1:
4
Sample Input 2:
7
1
4
2
1
4
1
5
Sample Output 2:
6
MAIN:
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
} System.out.print(UserMainCode.getMaxSpan(a,n));
}}
USERMAINCODE:
class UserMainCode { public static int getMaxSpan(int[] x,int n)
{
int gap=0,max=0;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(x[i]==x[j])
gap=j;
}
if(gap-i>max)
max=gap-i;
} return max+1;
}
}

21. Max Scorer
Sample Input 1:
3
sunil-56-88-23
bindul-88-70-10
john-70-49-65
Sample Output 1:
John
USERMAINCODE:
import java.util.ArrayList;
import java.util.StringTokenizer;
public class UserMainCode
{
public static String highestScorer(ArrayList<String>s1)
{
int max=0;
String s4=null;
for(int i=0;i<s1.size();i++)
{
String s2=s1.get(i);
StringTokenizer t=new StringTokenizer(s2,"-");
String s3=t.nextToken();
int n1=Integer.parseInt(t.nextToken());
int n2=Integer.parseInt(t.nextToken());
int n3=Integer.parseInt(t.nextToken());
int n=n1+n2+n3;
if(n>max)
{
max=n;
s4=s3;
}
}
return s4;
}
}
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
ArrayList<String> s1=new ArrayList<String>();
for(int i=0;i<n;i++)
{
s1.add(s.next());
}
System.out.println(UserMainCode.highestScorer(s1));
s.close();
}
}

22. Max Vowels
Sample Input 1:
Appreciation is the best way to motivate
Sample Output 1:
Appreciation
USERMAINCODE:
import java.util.StringTokenizer;
public class UserMainCode {
public static String getWordWithMaximumVowels(String s1)
{
int i;
StringTokenizer t=new StringTokenizer(s1," ");
int count=0,max=0;
String s2=null;
while(t.hasMoreTokens())
{
String s3=t.nextToken();
count=0;
for(i=0;i<s3.length();i++)
{
if(s3.charAt(i)=='a'||s3.charAt(i)=='e'||s3.charAt(i)=='i'||s3.charAt(i)=='o'||s3.charAt(i)=='u'
||s3.charAt(i)=='A'||s3.charAt(i)=='E'||s3.charAt(i)=='I'||s3.charAt(i)=='O'||s3.charAt(i)=='U')
count++;
}
if(count>max)
{
max=count;
s2=s3;
}
}
return s2;
}
}
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
System.out.println(UserMainCode.getWordWithMaximumVowels(s1));
s.close(); }
}

23. All Vowels
Sample Input 1:
acebisouzz
Sample Output 1:
valid
Sample Input 2:
Alphabet
Sample Output 2:
Invalid
USERMAINCODE:
public class UserMainCode {
public static int getOrderVowels(String s1)
{
String s2="aeiou";
StringBuffer sb=new StringBuffer();
for(int i=0;i<s1.length();i++)
{
for(int j=0;j<s2.length();j++)
{
if(s1.charAt(i)==s2.charAt(j))
{
sb.append(s1.charAt(i));
}
}
}
if(sb.toString().equals(s2))
{
return 1;
}
return -1;
}
}
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args) {
// TODO Auto-generated method stub Scanner s=new Scanner(System.in);
String s1=s.next();
int b=UserMainCode.getOrderVowels(s1);
if(b==1)
{
System.out.println("Valid");
}
else
System.out.println("Invalid");
s.close();
}
}

24. Adjacent Swaps
Sample Input 1:
forget
Sample Output 1:
ofgrte
Sample Input 2:
New York
Sample Output 2:
eN woYkr
USERMAINCODE:
import java.util.*;
public class UserMainCode {
public static String swapPairs(String s1)
{
int i;
StringBuffer sb=new StringBuffer();
for(i=0;i<s1.length()-1;i=i+2)
{
if(i%2==0)
{
char a=s1.charAt(i);
char b=s1.charAt(i+1);
sb.append(b).append(a);
}
else
for(i=0;i<s1.length()-1;i=i+2)
{
char a=s1.charAt(i);
char b=s1.charAt(i+1);
sb.append(b).append(a);
sb.append(s1.charAt(s1.length()-1));
}
}
return sb.toString();
}
}
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
System.out.println(UserMainCode.swapPairs(s1));
s.close();
}
}

25. Sum of Digits
Sample Input 1:
abc12de4
Sample Output 1:
7
USERMAINCODE:
public class UserMainCode {
public static int getDigits(String s1)
{
int sum=0;
for(int i=0;i<s1.length();i++)
{
char a=s1.charAt(i);
if(Character.isDigit(a))
{
int b=Integer.parseInt(String.valueOf(a));
sum=sum+b;
}
}
return sum;
}
}
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s=new Scanner(System.in); String s1=s.next();
System.out.println(UserMainCode.getDigits(s1));
s.close();
}
}

26. Password
Sample Input 1:
cts@1010
Sample Output 1:
Valid
Sample Input 2:
punitha3
Sample Output 2:
Invalid
USERMAINCODE:
public class UserMainCode {
public static boolean validatePassword(String s1)
{
boolean b=false;
if(s1.length()>=8)
b=true;
if(b=true)
{
if(s1.matches(".*[0-9]{1,}.*")&&s1.matches(".*[a-zA-Z]{1,}.*")&&s1.matches(".*[@#%]{1,}.*"))
{
b=true;
}
else
b=false;
}
return b;
}
}
MAIN:
import java.util.*;
public class Main {
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
boolean b=(UserMainCode.validatePassword(s1));
if(b==true)
{
System.out.println("Valid");
}
else
System.out.println("Invalid");
s.close();
}
}

27. Employee Bonus
Sample Input 1:
2
1010
20-12-1987
10000
2020
01-01-1985
14400
Sample Output 1:
1010
12000
2020
17280
USERMAINCODE:
import java.text.ParseException;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date; 
 import java.util.Iterator;
 import java.util.LinkedHashMap; 
 import java.util.TreeMap; 
 class UserMainCode
 { public static TreeMap<Integer,Integer> calculateRevisedSalary(LinkedHashMap<Integer,String>a1,LinkedHashMap<Integer,Integer>a2) throws ParseException 
 {
 TreeMap<Integer,Integer>ans=new TreeMap<Integer,Integer>(); 
 ArrayList<String>al=new ArrayList<String>();
 Iterator <Integer>it=a1.keySet().iterator(); 
 while(it.hasNext()) {
 int s=it.next(); 
 String s1=a1.get(s);
 SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy"); 
 sdf.setLenient(false); 
 try{
Date d=new Date(); 
Date d1=new Date(); 
String a=s1; 
String b="01-09-2014";
 d=sdf.parse(a);
 d1=sdf.parse(b);
 long t=d.getTime(); 
 long t1=d1.getTime();
 long t3=t1-t; 
 long l1=(24 * 60 * 60 * 1000); 
 long l=l1*365; long res=t3/l; 
 //System.out.println("Result="+res);
 if(res>=25 && res<=30)
 {
 float bonus=(float)((0.2*a2.get(s))+a2.get(s));
 int r=(int)bonus; ans.put(s,r ); 
 }
 else if(res>30 && res<=60) {
 float bonus=(float)((0.3*a2.get(s))+a2.get(s)); 
 int r=(int)bonus; ans.put(s,r ); }
 else if(a2.get(s)<5000)
 { ans.put(s, -100); }
 else if(res<25 ||res>60) { 
 ans.put(s, -200); } } 
 catch (Exception e) {
 e.printStackTrace();
 } }
 return ans; 
 } }
MAIN:
import java.text.ParseException;
 import java.text.SimpleDateFormat; 
 import java.util.ArrayList; 
 import java.util.Date; 
 import java.util.Iterator;
 import java.util.LinkedHashMap; 
 import java.util.Scanner; 
 import java.util.TreeMap;
 public class Main { 
 public static void main(String args[]) throws ParseException
 { Scanner sc=new Scanner(System.in); 
 int n=sc.nextInt(); 
 LinkedHashMap<Integer,String>a1=new LinkedHashMap<Integer,String>();
 LinkedHashMap<Integer,Integer>a2=new LinkedHashMap<Integer,Integer>();
 TreeMap<Integer,Integer>ans=new TreeMap<Integer, Integer>();
for(int i=0;i<n;i++)
 {int id=sc.nextInt();
 a1.put(id,sc.next());
 int salary=sc.nextInt(); 
 a2.put(id,salary); } 
 ans=UserMainCode.calculateRevisedSalary(a1,a2); 
 Iterator <Integer>it=ans.keySet().iterator(); 
 while(it.hasNext()) 
 { 
 int a=it.next(); 
 int b=ans.get(a); 
 System.out.println(a); 
 System.out.println(b); 
 } } }

28. Grade Calculator REFER 53 FROM LEVEL2
Sample Input 1:
2
1010
80
100
40
Sample Output 1:
100
FAIL
1010
GOLD
USERMAINCODE:
import java.util.Iterator; import java.util.HashMap; import java.util.TreeMap; public class UserMainCode { public static TreeMap<Integer,String>calculateGrade(HashMap<Integer,Integer>hm) { TreeMap<Integer,String>tm=new TreeMap<Integer,String>(); Iterator<Integer> it=hm.keySet().iterator(); while(it.hasNext()) { int id=it.next(); int mark=hm.get(id); if(mark>=80) tm.put(id,"GOLD"); else if(mark<80 && mark>=60) tm.put(id,"SILVER"); else if(mark<60 && mark>=45) tm.put(id,"BRONZE"); else tm.put(id,"FAIL"); } return tm; }}
MAIN:
import java.util.HashMap; 
import java.util.Iterator; 
import java.util.HashMap; 
import java.util.TreeMap; 
import java.util.Scanner; 
public class Main { public static void main(String []args){ 
Scanner sc=new Scanner(System.in);
int s=sc.nextInt(); 
HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>(); 
for(int i=0;i<s;i++) 
{ hm.put(sc.nextInt(),
sc.nextInt()); } 
TreeMap<Integer,String>tm=new TreeMap<Integer,String>(); 
tm=UserMainCode.calculateGrade(hm); 
Iterator<Integer> it=tm.keySet().iterator(); 
for(int i=0;i<s;i++) 
{ int n=it.next(); String fac=tm.get(n);
 System.out.println(n); 
 System.out.println(fac); } } }

29.Digits - II
Sample Input 1: 9999 Sample Output 1: 9
Sample Input 2: 698 Sample Output 2: 5
MAIN:
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int sum=UserMainCode.getDigitSum(a);
System.out.println(sum);
}
}
USERMAINCODE:
public class UserMainCode
{
public static int getDigitSum(int n)
{
int sum = 0 ;
int n1=n;
while(n>10)
{
int a = 0 ; sum = 0;
while(n!=0)
{
a = n%10;
sum+=a;
n=n/10;
}
n=sum;
}
return sum;
}
}

30.Anagrams
Sample Input 1: tea eat Sample Output 1: TRUE
Sample Input 2: Desperation A Rope Ends It Sample Output 2: TRUE
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();
System.out.println(UserMainCode.checkAnagram(s1,s2));
}
}
USERMAINCODE:
import java.util.*;
import java.text.*;
public class UserMainCode {
public static boolean checkAnagram(String s1,String s2)
{
boolean b=false;
String aj1 =s1.toLowerCase(); //ANAGRAMS
String aj2=s2.toLowerCase();
ArrayList<Character> a1 = new ArrayList<Character>();
ArrayList<Character> a2 = new ArrayList<Character>();
for(int i=0;i<aj1.length();i++)
{
char c=aj1.charAt(i);
if(c!=' ')
{
a1.add(c);
}
}
for(int j=0;j<aj2.length();j++)
{
char c=aj2.charAt(j);
if(c!=' ')
{
a2.add(c);
}
}
if(a1.size()==a2.size())
{
if(a1.containsAll(a2))
{
b= true;
}
}
return b;
}
}

31.Shift Left
Sample Input 1: 7 1 5 2 4 5 3 5
Sample Output 1: 1 2 4 3 0 0 0
MAIN:
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int[]m=new int[size];
int[]n=new int[size];
for(int i=0;i<size;i++)
{
n[i]=sc.nextInt();
}
m=UserMainCode.shiftLeft(n);
for(int i=0;i<size;i++)
{
System.out.println(m[i]);
}
}
}
USERMAINCODE:
public class UserMainCode {
public static int[] shiftLeft(int n[])
{
int j=0;
int[]m=new int[n.length];
for(int i=0;i<n.length;i++)
{
if(n[i]!=5)
{
m[j]=n[i];
j++;
}
}
return m;
}
}

32.Word Count
Sample Input 1: 5 AAA1
B2B 4CCC A5 ABCDE Sample Output 1: 12
Sample Input 2: 3 12 C23 5CR2 Sample Output 2: 15
MAIN:
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String a[]=new String[n];
for(int i=0;i<n;i++)
{
a[i]=s.next();
}
System.out.println(UserMainCode.sumOfDigits(a));
}
}
USERMAINCODE:
public class UserMainCode {
public static int sumOfDigits(String[] s1)
{
int sum = 0;
for(int i=0;i<s1.length;i++)
{
String s = s1[i];
for(int j = 0;j<s.length();j++)
{
Character c = s.charAt(j);
if(Character.isDigit(c))
{
sum+=Integer.parseInt(s.valueOf(c));
}
}
}
return sum;
}
}

33.Prefix Finder
Sample Input 1: 4 0 1 11 110 Sample Output 1: 3
MAIN:
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.nextLine());
String s[]=new String[n];
for(int i=0;i<n;i++)
s[i]=sc.nextLine();
System.out.println(UserMainCode.findPrefix(s));
}
}
USERMAINCODE:
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class UserMainCode
{
public static int findPrefix (String s[]) {
LinkedHashSet<String>l1=new LinkedHashSet<String>();
ArrayList<String>a1=new ArrayList<String>();
int c=0;
for(int i=0;i<s.length;i++)
l1.add(s[i]);
Iterator<String> it=l1.iterator();
while(it.hasNext())
{
a1.add(it.next());
}
for(int i=0;i<a1.size();i++)
{
String s2=a1.get(i);
for(int j=0;j<a1.size();j++)
{
String s3=a1.get(j);
if(i!=j&&s3.length()>s2.length())
{
String s4=s3.substring(0,s2.length());
if(s2.equals(s4))
c++;
}
}
}
return c;
}
}

34.Commons
Sample Input 1: 3 a c e 3 b d e Sample Output 1: 1
Sample Input 2: 5 ba ba black sheep wool 5 ba ba have any wool Sample Output 2: 2
MAIN:
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n1 = sc.nextInt();
String[] s1 = new String[n1];
for (int i = 0; i < n1; i++) {
s1[i] = sc.next();
}
int n2 = sc.nextInt();
String[] s2 = new String[n2];
for (int i = 0; i < n2; i++) {
s2[i] = sc.next();
}
System.out.println(UserMainCode.countCommonStrings(s1,s2));
}
}
USERMAINCODE:
import java.util.ArrayList;
public class UserMainCode {
public static int countCommonStrings(String[] s1,String[] s2)
{ int count=0;
ArrayList<String> al = new ArrayList<String>();
for (int i = 0; i < s1.length; i++) {
for (int j = 0; j < s2.length; j++) {
if(s1[i].equals(s2[j])){
if(!al.contains(s1[i])){ count++;
al.add(s1[i]);
}
}
}
} return count;
}
}

35.Sequence Sum
Input and Output Format:
Input consists of a integer.
Output consists of integer.
Refer sample output for formatting specifications.
Sample Input 1:
5
Sample Output 1:
7
MAIN:
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(UserMainCode.getFibonacciSum(n));
}
}
USERMAINCODE:
import java.util.ArrayList;
import java.util.Scanner;
public class UserMainCode {
public static int getFibonacciSum(int n){
int a=0,b=1,c=0,d=1;
for(int i=3;i<=n;i++){
c=a+b;
a=b; b=c;
d=d+c;
}
return d;
}
}

36.E-Mail Validation
Input and Output Format: Input consists of a string. Output consists of TRUE / FALSE. Refer sample output for formatting specifications.
Sample Input 1: test@gmail.com Sample Output 1: TRUE
Sample Input 2: academy@xyz.com Sample Output 2: FALSE
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String ip;
ip=s.next();
boolean b=UserMainCode.ValidateEmail(ip);
if(b==true)
System.out.println("TRUE");
else
System.out.println("FALSE");
}}
USERMAINCODE:
import java.util.StringTokenizer;
public class UserMainCode {
public static boolean ValidateEmail(String ip) {
int i=0;
boolean b=false;
StringTokenizer t=new StringTokenizer(ip,"@");
String s1=t.nextToken();
String s2=t.nextToken();
StringTokenizer t1=new StringTokenizer(s2,".");
String s3=t1.nextToken();
String s4=t1.nextToken();
if(ip.contains("@") && ip.contains("."))
i++;
if(i==1)
if(s3.length()==5)
if(s1.length()>=3)
if(s4.equals("com"))
b=true;
return b;
}
}

37.Symmetric Difference
Input and Output Format:
Input consists of an integer n which is the number of elements followed by n integer values. The same sequnce is followed
for the next array.
Output consists of sorted symmetric difference array.
Refer sample output for formatting specifications.
Sample Input 1:
5
11
5
14
26
3
3
5
3
1
Sample Output 1:
1
11
14
26
MAIN:
import java.util.*;
public class Main
{
public static void main(String[] args)
{
int n,m;
Scanner sin = new Scanner(System.in);
n = sin.nextInt();
int[] a1 = new int[n];
for(int i=0;i<n;i++)
{
a1[i] = sin.nextInt();
}
m = sin.nextInt();
int[] a2 = new int[m];
for(int i=0;i<m;i++)
{
a2[i] = sin.nextInt();
}
int[] result = UserMainCode.getSymmetricDifference (a1,a2);
for(int i=0;i<result.length;i++)
System.out.println(result[i]);
}
}
USERMAINCODE:
import java.util.*;
public class UserMainCode
{
public static int[] getSymmetricDifference (int[] a1,int[] a2)
{
//int[] a1 = new int[]{11,5,14,26,3};
//int[] a2 = new int[]{5,3,1};
int[] union,inter,result;
int count=0;
int max = a1.length+a2.length;
ArrayList<Integer> temp = new ArrayList<Integer>(max);
/*union*/
for(int i=0;i<a1.length;i++)
{
if(!temp.contains(a1[i]))
{
++count;
temp.add(a1[i]);
}
}
for(int i=0;i<a2.length;i++)
{
if(!temp.contains(a2[i]))
{
++count;
temp.add(a2[i]);
}
}
union = new int[count];
for(int i=0;i<count;i++)
{
union[i] = (int)temp.get(i);
}
Arrays.sort(union);
/*intersection*/
temp = new ArrayList<Integer>(max);
count =0;
Arrays.sort(a2);
for(int i=0;i<a1.length;i++)
{
if(Arrays.binarySearch(a2,a1[i]) >= 0)
{
++count;
temp.add(a1[i]);
}
}
inter = new int[count];
for(int i=0;i<count;i++)
{
inter[i] = (int)temp.get(i);
}
Arrays.sort(inter);
/*difference */
temp = new ArrayList<Integer>(max);
count =0;
Arrays.sort(inter);
for(int i=0;i<union.length;i++)
{
if(Arrays.binarySearch(inter,union[i]) < 0)
{
++count;
temp.add(union[i]);
}
}
result = new int[count];
for(int i=0;i<count;i++)
{
result[i] = (int)temp.get(i);
}
Arrays.sort(result);
//System.out.println("resultant array : \n "+Arrays.toString(result));
return result;
}
}

38.Day of Week
Input and Output Format:
Input consists of a string.
Output consists of a string.
Refer sample output for formatting specifications.
Sample Input 1:
02/04/1985
Sample Output 1:
Tuesday
MAIN:
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
public static void main(String[] args) throws ParseException {
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
System.out.println(UserMainCode.getDayofWeek(s1));
}
}
USERMAINCODE:
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class UserMainCode { public static String getDayofWeek(String s1) throws ParseException
{
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
SimpleDateFormat sdf1=new SimpleDateFormat("EEEEE");
Date d=sdf.parse(s1);
String s=sdf1.format(d);
return s.toLowerCase();
}
}

39.Add Time
Input and Output Format:
Input consists of two string.
Output consists of a string.
Refer sample output for formatting specifications.
Sample Input 1:
12:45:30
13:50:45
Sample Output 1:
1:2:36:15
Sample Input 2:
23:59:59
23:59:59
Sample Output 2:
1:23:59:58
MAIN:
import java.util.*;
import java.io.IOException;
import java.text.*;
public class Main {
public static void main(String[] args) throws IOException, ParseException {
Scanner s = new Scanner(System.in);
String s1=s.next();
String s2=s.next();
System.out.println(UserMainCode.addTime(s1,s2));
}
}
USERMAINCODE:
import java.util.*;
import java.io.IOException;
import java.text.*;
public class UserMainCode {
public static String addTime(String s1,String s2) throws IOException, ParseException{
SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
sdf.setTimeZone(TimeZone.getTimeZone("s1"));
sdf.setTimeZone(TimeZone.getTimeZone("s2"));
Date d1=sdf.parse(s1);
Date d2=sdf.parse(s2);
long add=d1.getTime()+d2.getTime();
String s=sdf.format(add);
Calendar cal=Calendar.getInstance();
cal.setTime(sdf.parse(s));
int FindDay=cal.get(Calendar.DAY_OF_MONTH);
if(FindDay>1)
FindDay=FindDay-1;
String op=FindDay+":"+s;
return op;
}
}

40.ISBN Validation
Input and Output Format:
Input consists of a string.
Output consists of TRUE / FALSE.
Refer sample output for formatting specifications.
Sample Input 1:
0201103311
Sample Output 1:
TRUE
MAIN:
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String ip=s.next();
System.out.println(UserMainCode.ISBNnumber(ip));
}
}
USERMAINCODE:
import java.util.*;
import java.text.*;
public class UserMainCode {
public static String ISBNnumber(String ip) {
String b="FALSE";
int sum=0;
for(int i=0,j=ip.length();i<ip.length();i++,j--){
String s=String.valueOf(ip.charAt(i));
int n=Integer.parseInt(s);
sum+=(n*j); }
//System.out.println(sum);
if(sum%11==0)
b="TRUE";
return b;
}
}

41.Date Format
Sample Input 1:
05-12-1987
8-11-2010
Sample Output 1:
12/05/1987
MAIN:
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
public static void main(String[] args) throws ParseException {
Scanner s = new Scanner(System.in);
String s1=s.next();
String s2=s.next();
System.out.println(UserMainCode.findOldDate(s1,s2));
}
}
USERMAINCODE:
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class UserMainCode { public static String findOldDate(String s1,String s2) throws ParseException {
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
SimpleDateFormat sdf1=new SimpleDateFormat("MM-dd-yyyy"); Date d1=sdf.parse(s1); Date d2=sdf.parse(s2);
Calendar cal=Calendar.getInstance();
cal.setTime(d1);
long y=cal.getTimeInMillis();
cal.setTime(d2);
long y1=cal.getTimeInMillis();
String s3=sdf1.format(d1);
String s4=sdf1.format(d2);
if(y<y1)
return s3;
else
return s4;
}
}

42.Interest Calculation
Sample Input 1:
4
SBI-1010
20-01-1987
10000
SBI-1011
03-08-1980
15000
SBI-1012
05-11-1975
20000
SBI-1013
02-12-1950
30000
Sample Output 1:
SBI-1010:10400
SBI-1011:16050
SBI-1012:21400
SBI-1013:33000
MAIN
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
HashMap<String,String>hm=new HashMap<String,String>();
HashMap<String,Integer>hm1=new HashMap<String,Integer>();
for(int i=0;i<s;i++)
{
String id=sc.nextLine();
hm.put(id, sc.nextLine());
hm1.put(id,Integer.parseInt(sc.nextLine()));
}
TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
tm=UserMainCode.calculateInterestRate(hm,hm1);
Iterator<String> it=tm.keySet().iterator();
while(it.hasNext())
{
String n=it.next();
int fac=tm.get(n);
System.out.println(n+":"+fac);
}
}
}
USERMAINCODE
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashMap;
import java.util.TreeMap; public class UserMainCode
{
public static TreeMap<String,Integer> calculateInterestRate (HashMap<String,String>hm,HashMap<String,Integer>hm1)
{
int year=0,amount=0;
double dis=0;
String now="01/01/2015";
TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
Iterator<String> it=hm.keySet().iterator();
while(it.hasNext())
{
String id=it.next();
String dor=hm.get(id);
amount=hm1.get(id);
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
try
{
Date d=sdf.parse(dor);
Date d1=sdf1.parse(now);
sdf.setLenient(false);
int y=d.getYear();
int y1=d1.getYear();
int m=d.getMonth();
int m1=d1.getMonth();
int day=d.getDay();
int day1=d1.getDay();
year=y1-y;
if(m>m1)
year--;
else if(m==m1)
{if(day<day1)
year--;
}
if(year>=60)
dis=0.1*amount+amount;
else if(year<60 && year>=30 )
dis=0.07*amount+amount;
else
dis=0.04*amount+amount;
tm.put(id,(int)dis);
}
catch(Exception e)
{
e.printStackTrace();
}
}
return tm;
}
}

43.Discount Rate Calculation
Sample Input 1:
4
A-1010
20-11-2007
25000
B-1011
04-12-2010
30000
C-1012
11-11-2005
15000
D-1013
02-12-2012
10000
Sample Output 1:
A-1010:5000
B-1011:3000
C-1012:2250
D-1013:500
MAIN:
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Scanner;
public class Main{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
HashMap<String,String>hm=new HashMap<String,String>();
HashMap<String,Integer>hm1=new HashMap<String,Integer>();
for(int i=0;i<s;i++)
{
String id=sc.nextLine();
hm.put(id, sc.nextLine());
hm1.put(id,Integer.parseInt(sc.nextLine()));
}
TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
tm=UserMainCode.calculateDiscount(hm,hm1);
Iterator<String> it=tm.keySet().iterator();
while(it.hasNext())
{
String n=it.next();
int fac=tm.get(n);
System.out.println(n+":"+fac);
}
}
}
USERMAINCODE
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.*;
public class UserMainCode
{
public static TreeMap<String,Integer> calculateDiscount (HashMap<String,String>hm,HashMap<String,Integer>hm1)
{
int amount=0;
double dis=0;
String now="01/01/2015";
TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
Iterator<String> it=hm.keySet().iterator();
while(it.hasNext())
{
String id=it.next();
String dor=hm.get(id);
amount=hm1.get(id);
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
sdf.setLenient(false);
try{
Date d=new Date();
Date d1=new Date();
String a=dor;
String b="01-01-2014";
d=sdf.parse(a);
d1=sdf.parse(b);
long t=d.getTime();
long t1=d1.getTime();
long t3=t1-t;
long l1=(24 * 60 * 60 * 1000);
long l=l1*365;
long year1=t3/l;
//System.out.println("Result="+year1);
if(year1>=5 && amount>=20000)
dis=0.2*amount;
else if(year1<5 && amount>=20000)
dis=0.1*amount;
else if(year1>=5 && amount<20000)
dis=0.15*amount;
else
dis=0.05*amount;
tm.put(id,(int)dis);
}
catch(Exception e)
{
e.printStackTrace();
}
}
return tm;
}
}
