# 조건문
- **조건에 따라서 여러개의 실행 경로 가운데 하나를 선택한다.**
### if문
<pre>if(조건식) 문장; 혹은 {문장1;, ...., 문장n;}</pre>
다음 예시를 보자.
<pre>if(size<100){ //size가 100보다 작을 경우
  System.out.println("small"); // small을 출력
}
else if(size>=100 && size<200){ // size가 100보다 크거나 같고 200보다 작은 경우
  System.out.println("middle"); // middle을 출력
}
else System.out.println("large"); // 그외의 경우 large를 출력</pre>
else if는 여러개를 쓸 수 있지만 else는 오직 하나만 쓸 수 있다.
### switch문
<pre>switch(변수){
case 조건:
....
default:
}</pre>
다음 예시를 보자.
<pre>switch(number){
case 0: // number값이 0인 경우
  System.out.println("비어있다."); // '비어있다'를 출력
  break; // switch문에서 빠져나온다.
case 1:
  System.out.println("하나 존재");
  break;
default: // number에 0,1외의 값이 들어간 경우
  System.out.println("그런것 존재하지 않는다."); // '그런것 존재하지 않는다.'를 출력
  break;</pre>

# 반복문
- **조건에 따라서 여러개의 같은 처리를 반복한다.**
### for문
<pre>for(초기식; 조건식; 증감식){
  반복하고자 하는 문장들
}
</pre>
다음 예시를 보자.
<pre>for(int i=0;i<3;i++){ // i는 0에서 2까지 3번 반복한다.
  System.out.println(i); // 0, 1, 2가 순서대로 출력된다. 
}</pre>
응용으로 도형만들기, 구구단 등의 문제를 풀 수 있다.
### while문
<pre>while(조건식){
  반복할 문장들
}</pre>
다음 예시를 보자.
<pre>int i=0; // i의 초기값을 0으로 지정
while(i<5){ // i가 5보다 작을 경우 안의 문장을 반복
System.out.println(i);
i++; // i가 5가 되는 순간 조건문을 만족하지 못해 loop를 빠져나온다.
} // 0, 1, 2, 3, 4가 순서대로 출력된다.
</pre>
