import java.util.Scanner;
import java.io.*;
class Testchoice{
	public static void main(String [] args){
		String [] string=new String[100];
		
		int cnt=0;
		//소개 출력
		소개 소 = new 소개();
		소.intro();
		System.out.println();
		String userName, daeSang, daeName;
		Scanner s = new Scanner(System.in);
		//사용자한테 입력받기
		System.out.print("사용자의 이름을 입력하세요: ");
		
		userName = s.nextLine();
		
		while(true){
			System.out.print("공략할 대상을 정하세요(A, B): ");
			daeSang = s.nextLine();
			if(daeSang.equals("A")||daeSang.equals("B"))
				break;
		}
		System.out.print("공략할 대상에게 이름을 정해주세요: ");
		daeName = s.nextLine();
		
		int 출석횟수=0;
		int day=0;
		int place=0;
		int place2=0;
		int 과A1=0, 과A2=0, 과A3=0,과A4=0, 과A5=0, 과A6=0, 과A7=0, 과A8=0, 과A9=0;
		int 도A1=0, 도A2=0, 도A3=0, 도A4=0, 도A5=0, 도A6=0, 도A7=0, 도A8=0, 도A9=0, 도A10=0, 도A11=0, 도A12=0;
		int 일A1=0, 일A2=0, 일A3=0, 일A4=0, 일A5=0;
		int 술A1=0, 술A2=0, 술A3=0, 술A4=0, 술A5=0, 술A6=0, 술A7=0, 술A8=0, 술A9=0, 술A10=0, 술A11=0, 술A12=0;
		//A 실행.
		A a = new A();
		if(daeSang.equals("A")){
			while(true){
				while(true){
				if(cnt%2==0){
				day++;
				System.out.println("DAY"+day);
				System.out.println("오전");
				while(true){
					System.out.print("장소를 선택하세요.(강의실:1/도서관:2/일청담:3/과방:4/집:5): ");
					place = s.nextInt();
					if(place>=1&&place<=5)
						break;
					else System.out.print("다시 입력하세요. ");
				}
				}
				else if(cnt%2!=0){
					System.out.println("오후");
					while(true){
						System.out.print("장소를 선택하세요.(강의실:1/도서관:2/일청담:3/과방:4/집:5/술자리:6): ");
						place2 = s.nextInt();
						if(place2>=1&&place2<=6)
							break;
						else System.out.print("다시 입력하세요. ");
					}
				}
				if(place==1||place==2||place==3||place==4||place2==1||place2==2||place2==3||place2==4||place2==6){
					if(place==1||place2==1){
						강의실.print();
						출석횟수++;
					}
					//A 술자리
					else if(place2==6){
						술자리A.test(string);
						술자리A.change(string,userName,"정수");
						술자리A.change(string,daeName, "A");
						int tmp4=a.ho;
						if(tmp4<=50){
						int rnt4=(int)(Math.random()*2);
						if(rnt4==0){
						
						술자리A.print(string,0,1);
						술A1=s.nextInt();
						if(술A1==1){
							System.out.println("호감도 -10");
							a.ho-=10;	
							술자리A.print(string,2,3);
						}
						else if(술A1==2){
							System.out.println("호감도 +10");
							a.ho+=10;
							술자리A.print(string,4,5);
                            술A2=s.nextInt();
							if(술A2==1){
								System.out.println("호감도 -10");
								a.ho-=10;	
								술자리A.print(string,6,7);
							}
							else if(술A2==2){
								System.out.println("호감도 +10");
								a.ho+=10;	
								술자리A.print(string,8,9);
							}
							
						}
						}
						else if(rnt4==1){
						
						
					
							술자리A.print(string,10,11);
						    술A3=s.nextInt();
						if(술A3==1){
							System.out.println("호감도 +0");
							a.ho+=0;	
							술자리A.print(string,12,13);
						}
						else if(술A3==2){
							System.out.println("호감도 +10");
							a.ho+=10;
							술자리A.print(string,14,15);
						}
						else if(술A3==3){
							System.out.println("호감도 -10");
							a.ho-=10;
							술자리A.print(string,16,17);
						}
						}
						}
						else if(tmp4>50&&tmp4<=110){
						int rnt5=(int)(Math.random()*2);
						if(rnt5==0){
						
						술자리A.print(string,18,19);
						술A4=s.nextInt();
						if(술A4==1){
							System.out.println("호감도 +10");
							a.ho+=10;
							술자리A.print(string,20,21);
							술A5=s.nextInt();
							if(술A5==1){
								System.out.println("호감도 -10");
								a.ho-=10;	
								술자리A.print(string,22,23);
							}
							else if(술A5==2){
								System.out.println("호감도 +10");
								a.ho+=10;
								술자리A.print(string,24,25);
								술A6=s.nextInt();
								if(술A6==1){
									System.out.println("호감도 -10");
									a.ho-=10;	
									술자리A.print(string,26,27);
								}
								else if(술A6==2){
									System.out.println("호감도 +10");
									a.ho+=10;	
									술자리A.print(string,28,29);
								}
							}
						}
						else if(술A4==2){
							System.out.println("호감도 -10");
							a.ho-=10;
							술자리A.print(string,30,31);
							
						}	
						}
						if(rnt5==1){
						
						술자리A.print(string,32,33);
						술A7=s.nextInt();
						if(술A7==1){
							System.out.println("호감도 -10");
							a.ho-=10;
							술자리A.print(string,34,35);
							술자리A.print(string,36,37);
						}
						else if(술A7==2){
							System.out.println("호감도 +10");
							a.ho+=10;
							술자리A.print(string,38,39);
							술A8=s.nextInt();
							if(술A8==1){
								System.out.println("호감도 -10");
								a.ho-=10;
								술자리A.print(string,40,41);
							}
							else if(술A8==2){
								System.out.println("호감도 +10");
								a.ho+=10;
								술자리A.print(string,42,43);
							}
						}
						}
						}
						if(tmp4>110){
						int rnt5=(int)(Math.random()*2);
						if(rnt5==0){
						
						술자리A.print(string,44,45);
						술A9=s.nextInt();
						if(술A9==1){
							System.out.println("호감도 +10");
							a.ho+=10;
							술자리A.print(string,46,47);
							술A10=s.nextInt();
							if(술A10==1){
								System.out.println("호감도 +10");
								a.ho+=10;
								술자리A.print(string,48,49);
							}
							else if(술A10==2){
								System.out.println("호감도 -10");
								a.ho-=10;
								술자리A.print(string,50,51);
							}
							else if(술A10==3){
								System.out.println("호감도 -10");
								a.ho-=10;
								술자리A.print(string,52,53);
							}
						}
						else if(술A9==2){
							System.out.println("호감도 -50");
							a.ho-=50;
							술자리A.print(string,54,55);
							
						}
						}
						else if(rnt5==1){
						
						술자리A.print(string,56,57);
						술A11=s.nextInt();
						if(술A11==1){
							System.out.println("호감도 +0");
							a.ho+=0;
							술자리A.print(string,58,59);
						}
						else if(술A11==2){
							System.out.println("호감도 +10");
							a.ho+=10;
							술자리A.print(string,60,61);
							술A12=s.nextInt();
							if(술A12==1){
								System.out.println("호감도 -10");
								a.ho-=10;
								술자리A.print(string,62,63);
							}
							else if(술A12==2){
								System.out.println("호감도 +10");
								a.ho+=10;
								술자리A.print(string,64,65);
							}
						}
						else if(술A11==3){
							System.out.println("호감도 -10");
							a.ho-=10;
							술자리A.print(string,66,67);
						}
						}
						}
						for(int i=0;i<100;i++){
							string[i]="";
							}
					}
						
						
					//A 일청담
					else if(place==3||place2==3){
						일청담A.test(string);
						일청담A.change(string,userName,"정수");
						일청담A.change(string,daeName, "A");
						int tmp3=a.ho;
						if(tmp3<=50){
						int rnt3=(int)(Math.random()*2);
						if(rnt3==0){	
						
					    일청담A.print(string,0,1);
						일청담A.print(string,2,3);
						일청담A.print(string,4,5);
						}
						else if(rnt3==1){
						
					    일청담A.print(string,6,7);
						일청담A.print(string,8,9);
						일청담A.print(string,10,11);
						일청담A.print(string,12,13);
						}
						}
						if(tmp3>50&&tmp3<=110){
						
					    일청담A.print(string,14,15);
						일A1=s.nextInt();
						if(일A1==1){
							System.out.println("호감도 +10");
							일청담A.print(string,16,17);
							일A2=s.nextInt();
							if(일A2==1){
								System.out.println("호감도 +10");
								a.ho+=10;
								일청담A.print(string,18,19);
							}
							else if(일A2==2){
								System.out.println("호감도 -10");
								a.ho-=10;
								일청담A.print(string,20,21);
							}
						}
						else if(일A1==2){
							System.out.println("호감도 -10");
						    a.ho-=10;
							일청담A.print(string,22,23);
						}
						}
						if(tmp3>110){
						
					    일청담A.print(string,24,25);
						일A3=s.nextInt();
						if(일A3==1){
							System.out.println("호감도 +10");
							일A4=s.nextInt();
							일청담A.print(string,26,27);
							if(일A4==1){
								System.out.println("호감도 -10");
								a.ho-=10;
								일청담A.print(string,28,29);
							}
							else if(일A4==2){
								System.out.println("호감도 -10");
								a.ho-=10;
								일청담A.print(string,30,31);
							}
							else if(일A4==3){
								System.out.println("호감도 +10");
								a.ho+=10;
								일청담A.print(string,32,33);
							}
						}
						else if(일A3==2){
							System.out.println("호감도 -10");
							a.ho-=10;
							일청담A.print(string,34,35);
							일A5=s.nextInt();
							if(일A5==1){
								System.out.println("호감도 -10");
								a.ho-=10;
								일청담A.print(string,36,37);
							}
							else if(일A5==2){
								System.out.println("호감도 +10");
								a.ho+=10;
							}
						}
						}
						for(int i=0;i<100;i++){
							string[i]="";
							}
						}
					//A도서관
					else if(place==2||place2==2){
						도서관A.test(string);
						도서관A.change(string,userName,"정수");
						도서관A.change(string,daeName, "A");
						int tmp=a.ho;
						if(tmp<=50){
						int rnt=(int)(Math.random()*2);
						if(rnt==0){
						
						도서관A.print(string,0,1);
						도A1=s.nextInt();
						if(도A1==1){
							System.out.println("호감도 +10");
							a.ho+=10;
							도서관A.print(string,2,3);
							도A2=s.nextInt();
							if(도A2==1){
								System.out.println("호감도 +10");
								a.ho+=10;
								도서관A.print(string,4,5);
							}
							else if(도A2==2){
								System.out.println("호감도 -10");
								a.ho-=10;
								도서관A.print(string,6,7);
							}
						}
						else if(도A1==2){
							System.out.println("호감도 -10");
							a.ho-=10;
							도서관A.print(string,8,9);
						}
						}
						if(rnt==1){
						
						도서관A.print(string,10,11);
						도A3=s.nextInt();
						if(도A3==1){
							System.out.println("호감도 +10");
							a.ho+=10;
							도서관A.print(string,12,13);
							도A4=s.nextInt();
							if(도A4==1){
								System.out.println("호감도 +10");
								a.ho+=10;
								도서관A.print(string,14,15);
							}
							else if(도A4==2){
								System.out.println("호감도 -10");
								a.ho-=10;
								도서관A.print(string,16,17);
							}
						}
						else if(도A3==2){
							System.out.println("호감도 -10");
							a.ho-=10;	
							도서관A.print(string,18,19);
						}
						}
						}
						//호감도 50이하
						if(tmp>50&&tmp<=110){
						
						도서관A.print(string,20,21);
						도A5=s.nextInt();
						if(도A5==1){
							System.out.println("호감도 +10");
							a.ho+=10;
							도서관A.print(string,22,23);
							도서관A.print(string,24,25);
							도서관A.print(string,26,27);
							도A6=s.nextInt();
							if(도A6==1){
								System.out.println("호감도 +10");
								a.ho+=10;
								도서관A.print(string,28,29);
							}
							else if(도A6==2){
							System.out.println("호감도 -10");
							a.ho-=10;	
							도서관A.print(string,30,31);
							}
						}
						if(도A5==2){
							System.out.println("호감도 -10");
							a.ho-=10;
							도서관A.print(string,32,33);
							도A7=s.nextInt();
							if(도A7==1){
								System.out.println("호감도 -10");
								a.ho-=10;
								도서관A.print(string,34,35);
							}
							else if(도A7==2){
								System.out.println("호감도 +10");
								a.ho+=10;	
								도서관A.print(string,36,37);
							}
						}
						}
						//호감도 50이상
						if(tmp>110){
							int rnt2=(int)(Math.random()*2);
							if(rnt2==0){
						
						도서관A.print(string,38,39);
						도A8=s.nextInt();
						if(도A8==1){
							System.out.println("호감도 +10");
							a.ho+=10;
							도서관A.print(string,40,41);
							도A9=s.nextInt();
							if(도A9==1){
								System.out.println("호감도 +10");
								a.ho+=10;
								도서관A.print(string,42,43);
							}
							else if(도A9==2){
								System.out.println("호감도 -10");
								a.ho-=10;	
								도서관A.print(string,44,45);
							}
						}
						if(도A8==2){
							System.out.println("호감도 -10");
							a.ho-=10;
							도서관A.print(string,46,47);
							도A10=s.nextInt();
							if(도A10==1){
								System.out.println("호감도 +10");
								a.ho+=10;
								도서관A.print(string,48,49);
							}
							else if(도A10==2){
								System.out.println("호감도 -10");
								a.ho-=10;	
								도서관A.print(string,50,51);
							}
						}
						}
						if(rnt2==1){
							
						도서관A.print(string,52,53);
						도A11=s.nextInt();
						if(도A11==1){
							System.out.println("호감도 +10");
							a.ho+=10;
							도서관A.print(string,54,55);
							도A12=s.nextInt();
							if(도A12==1){
								System.out.println("호감도 +10");
								a.ho+=10;
								도서관A.print(string,56,57);
							}
							else if(도A12==2){
								System.out.println("호감도 -10");
								a.ho+=10;
								도서관A.print(string,58,59);
							}
						}
						else if(도A11==2){
							System.out.println("호감도 -10");
							a.ho-=10;
							도서관A.print(string,60,61);
						}
						}
						}
						for(int i=0;i<100;i++){
							string[i]="";
							}
					}
					//A 과방
					else if(place==4||place2==4){
						과방A.test(string);
						과방A.change(string,userName,"정수");
						과방A.change(string,daeName, "A");
						int tmp2=a.ho;
						if(tmp2<=50){
						
						과방A.print(string, 0,1);
						과A1=s.nextInt();
						if(과A1==1){
							System.out.println("호감도 +10");
							a.ho+=10;
							과방A.print(string,2,3);
							과A2=s.nextInt();
							if(과A2==1){
								System.out.println("호감도 +10");
								a.ho+=10;
								과방A.print(string,4,5);
							}
							else if(과A2==2){
								System.out.println("호감도 -10");
								a.ho-=10;
								과방A.print(string,6,7);
							}
						}
						else if(과A1==2){
							System.out.println("호감도 -10");
							a.ho-=10;
							과방A.print(string,8,9);
							과A3=s.nextInt();
							if(과A3==1){
								System.out.println("호감도 -10");
								a.ho-=10;
								과방A.print(string,10,11);
							}
							else if(과A3==2){
								System.out.println("호감도 -10");
								a.ho-=10;
								과방A.print(string,12,13);
							}
							else if(과A3==3){
								System.out.println("호감도 +10");
								a.ho+=10;
								과방A.print(string,14,15);
							}
						}
						}
						//호감도 50이하
						else if(tmp2>50&&tmp2<=110){
							
							과방A.print(string, 16,17);
							과A4=s.nextInt();
							if(과A4==1){
								System.out.println("호감도 +10");
								a.ho+=10;
								과방A.print(string,18,19);
								과A5=s.nextInt();
								if(과A5==1){
									System.out.println("호감도 -10");
									a.ho-=10;
									과방A.print(string,20,21);
								}
								else if(과A5==2){
									System.out.println("호감도 +10");
									a.ho+=10;
									과방A.print(string,22,23);
								}
							}	
							else if(과A4==2){
								System.out.println("호감도 -10");
								a.ho-=10;
								과방A.print(string,24,25);
								과방A.print(string,26,27);
								과A6=s.nextInt();
								if(과A6==1){
									System.out.println("호감도 -10");
									a.ho-=10;
								}
								
								else if(과A6==2){
									System.out.println("호감도 -10");
									a.ho-=10;
								}
								else if(과A6==3){
									System.out.println("호감도 +10");
									a.ho+=10;
								}
							}	
						}
						//호감도 50이상
						else if(tmp2>110){
							
							과방A.print(string, 28,29);
							과A7=s.nextInt();
							if(과A7==1){
								System.out.println("호감도 +10");
								a.ho+=10;
								과방A.print(string,30,31);
								과A8=s.nextInt();
								if(과A8==1){
									System.out.println("호감도 -10");
									a.ho-=10;
									과방A.print(string,32,33);
								}
								else if(과A8==2){
									System.out.println("호감도 +10");
									a.ho+=10;
									과방A.print(string,34,35);
								}
							}
							else if(과A7==2){
								System.out.println("호감도 -10");
								a.ho-=10;
								과방A.print(string,36,37);
								과A9=s.nextInt();
								if(과A9==1){
									System.out.println("호감도 -10");
									a.ho-=10;
									과방A.print(string,38,39);
								}
								else if(과A9==2){
									System.out.println("호감도 +10");
									a.ho+=10;
									과방A.print(string,40,41);
								}
							}
						}
						for(int i=0;i<100;i++){
							string[i]="";
							}
						//호감도 110이상	
					}		
				}//장소 끝	
				if(place==5){
					System.out.println("오늘도 힘들었다! 집으로 가자~~~");
					cnt++;
				}	
				if(place2==5){
					System.out.println("오늘도 힘들었다! 집으로 가자~~~");
					
				}	
				if(cnt%2!=0||place==5){
				System.out.println("하루가 끝났습니다.");
				호감도.print();
				System.out.println("출석횟수는 "+출석횟수+"입니다.");
				System.out.println();
				if((a.ho>=150&&출석횟수>=10)||day==50)
					break;
				}
				cnt++;//cnt 짝수 : 오전, day 출력/홀수 : 오후, 하루 끝
				place=0;
				place2=0;
								
			}//while 첫번째
					
				
				break;
			}//두번째 while 문 끝
		//if A문 끝
			if(a.ho>=150&&출석횟수>=10){
				호감도.pass();
			}
			else {
				호감도.fail();
			}
		}
		
		//B 실행
		B b = new B();
		if(daeSang.equals("B")){
			while(true){
				while(true){
				if(cnt%2==0){
				day++;
				System.out.println("DAY"+day);
				System.out.println("오전");
				while(true){
					System.out.print("장소를 선택하세요.(강의실:1/도서관:2/일청담:3/과방:4/집:5): ");
					place = s.nextInt();
					if(place>=1&&place<=5)
						break;
					else System.out.print("다시 입력하세요. ");
				}
				}
				else if(cnt%2!=0){
					System.out.println("오후");
					while(true){
						System.out.print("장소를 선택하세요.(강의실:1/도서관:2/일청담:3/과방:4/집:5/술자리:6): ");
						place2 = s.nextInt();
						if(place2>=1&&place2<=6)
							break;
						else System.out.print("다시 입력하세요. ");
					}
				}
				if(place==1||place==2||place==3||place==4||place2==1||place2==2||place2==3||place2==4||place2==6){
					if(place==1||place2==1){
						강의실.print();
						출석횟수++;
					}
					//B 도서관
					else if(place==2||place2==2){
						int 도B1=0, 도B2=0, 도B3=0,도B4=0, 도B5=0, 도B6=0, 도B7=0, 도B8=0, 도B9=0, 도B10=0,도B11=0;
						도서관B.test(string);
						도서관B.change(string,userName,"정수");
						도서관B.change(string,daeName, "B");
						if(b.ho<=50){
							도서관B.print(string,0,1);
							도B1=s.nextInt();
							if(도B1==1){
								System.out.println("호감도 -10");
								b.ho-=10;
								도서관B.print(string,2,3);
								도B2=s.nextInt();
								if(도B2==1){
									System.out.println("호감도 +10");
									b.ho+=10;
									도서관B.print(string,4);
								}
								else if(도B2==2){
									System.out.println("호감도 -10");
									b.ho-=10;
									도서관B.print(string,5);
								}
							}
							else if(도B1==2){
								System.out.println("호감도 +10");
								b.ho+=10;
								도서관B.print(string,6,7);
								도B3=s.nextInt();
								if(도B3==1){
									System.out.println("호감도 +10");
									b.ho+=10;
									도서관B.print(string,8,9);
									도B4=s.nextInt();
									if(도B4==1){
										System.out.println("호감도 +10");
										b.ho+=10;
									}
									else if(도B4==2){
										System.out.println("호감도 -10");
										b.ho-=10;
									}
								}
								else if(도B3==2){
									System.out.println("호감도 -10");
									b.ho-=10;
									도서관B.print(string,10);
								}
							}
						}
						else if(b.ho>50&&b.ho<=110){
							도서관B.print(string,12,13);
							도B5=s.nextInt();
							if(도B5==1){
								System.out.println("호감도 +10");
								b.ho+=10;
								도서관B.print(string,14,15);
								도B6=s.nextInt();
								if(도B6==1){
									System.out.println("호감도 +10");
									b.ho+=10;
									도서관B.print(string,16);
								}
								else if(도B6==2){
									System.out.println("호감도 -10");
									b.ho-=10;
									도서관B.print(string,17);
								}
							}
							else if(도B5==2){
								System.out.println("호감도 -10");
								b.ho-=10;
								도서관B.print(string,18,19);
								도B7=s.nextInt();
								if(도B7==1){
									System.out.println("호감도 +10");
									b.ho+=10;
									도서관B.print(string,20);
								}
								else if(도B7==2){
									System.out.println("호감도 -10");
									b.ho-=10;
									도서관B.print(string,21);
								}
							}
						}
						else if(b.ho>110){
							도서관B.print(string,23);
							도서관B.print(string,24,25);
							도B8=s.nextInt();
							if(도B8==1){
								System.out.println("호감도 +10");
								b.ho+=10;
								도서관B.print(string,26,27);
								도서관B.print(string,28,29);
								도B9=s.nextInt();
								if(도B9==1){
									System.out.println("호감도 +10");
									b.ho+=10;
									도서관B.print(string,30,31);
									도B10=s.nextInt();
									if(도B10==1||도B10==2){
										System.out.println("호감도 -10");
										b.ho-=10;
										도서관B.print(string,32);
									}
									else if(도B10==3){
										System.out.println("호감도 +10");
										b.ho+=10;
										도서관B.print(string,32);
									}
								}
								else if(도B9==2){
									System.out.println("호감도 -10");
									b.ho-=10;
									도서관B.print(string,33);
								}
							}
							else if(도B8==2){
								System.out.println("호감도 -10");
								b.ho-=10;
								도서관B.print(string,34,35);
								도B11=s.nextInt();
								if(도B11==1){
									System.out.println("호감도 +10");
									b.ho+=10;
									도서관B.print(string,36);
								}
								else if(도B11==2){
									System.out.println("호감도 -10");
									b.ho-=10;
									도서관B.print(string,37);
								}
							}
						}
						 for(int i=0;i<100;i++){
							string[i]="";
							}    
					}
					//B 일청담
					else if(place==3||place2==3){
						일청담B.test(string);
						일청담B.change(string,userName,"정수");
						일청담B.change(string,daeName, "B");
						int 일B1=0, 일B2=0, 일B3=0, 일B4=0, 일B5=0, 일B6=0, 일B7=0, 일B8=0;
						
						if(b.ho<=50){
							일청담B.print(string,0,1);
							일청담B.print(string,2,3);
							일B1=s.nextInt();
							if(일B1==1){
								System.out.println("호감도 +10");
								b.ho+=10;
								일청담B.print(string,4,5);
								일B2=s.nextInt();
								if(일B2==1){
									System.out.println("호감도 +10");
									b.ho+=10;
									일청담B.print(string,6,7);
									일B3=s.nextInt();
									if(일B3==1){
										System.out.println("호감도 -10");
										b.ho-=10;
										일청담B.print(string,8);
									}
									else if(일B3==2){
										System.out.println("호감도 +10");
										b.ho+=10;
										일청담B.print(string,9,10);
										일B4=s.nextInt();
										if(일B4==1){
											System.out.println("호감도 -10");
											b.ho-=10;
											일청담B.print(string,11);
										}
										else if(일B4==2){
											System.out.println("호감도 +0");
											b.ho+=0;
											일청담B.print(string,12);
										}
										else if(일B4==3){
											System.out.println("호감도 +10");
											b.ho+=10;
											일청담B.print(string,13);
										}	
									}
								}
								else if(일B2==2){
									System.out.println("호감도 -10");
									b.ho-=10;
									일청담B.print(string,14);
								}	
							}
							else if(일B1==2){
								System.out.println("호감도 -10");
								b.ho-=10;
								일청담B.print(string,15);
							}
						}
						else if(b.ho>50&&b.ho<=110){
							일청담B.print(string,17,18);
							일청담B.print(string,19,20);
							일청담B.print(string,21,22);
							일청담B.print(string,23,24);
							일B5=s.nextInt();
							if(일B5==1){
								System.out.println("호감도 +10");
								b.ho+=10;
								일청담B.print(string,25,26);
								일청담B.print(string,27,28);
								일B6=s.nextInt();
								if(일B6==1){
									System.out.println("호감도 +10");
									b.ho+=10;
									일청담B.print(string,29);
								}
								else if(일B6==2){
									System.out.println("호감도 +0");
									b.ho+=0;
									일청담B.print(string,30);
								}
							}
							else if(일B5==2){
								System.out.println("호감도 -10");
								b.ho-=10;
								일청담B.print(string,31,32);
								일B7=s.nextInt();
								if(일B7==1){
									System.out.println("호감도 -10");
									b.ho-=10;
									일청담B.print(string,33);
								}
								else if(일B7==2){
									System.out.println("호감도 +10");
									b.ho+=10;
									일청담B.print(string,34);
								}
							}
						}
						else if(b.ho>110){
							일청담B.print(string,35,36);
							일청담B.print(string,37,38);
							일청담B.print(string,39,40);
							일청담B.print(string,41,42);
							일청담B.print(string,43,44);
							일청담B.print(string,45,46);
							일B8=s.nextInt();
							if(일B8==1){
								System.out.println("호감도 +10");
								b.ho+=10;
								일청담B.print(string,47);
							}
							else if(일B8==2){
								System.out.println("호감도 -10");
								b.ho-=10;
								일청담B.print(string,48);
							}
						}
						for(int i=0;i<100;i++){
							string[i]="";
							}
					}
					//B과방
					else if(place==4||place2==4){
						과방B.test(string);
						과방B.change(string,userName,"정수");
						과방B.change(string,daeName, "B");
						int 과B1=0, 과B2=0, 과B3=0, 과B4=0, 과B5=0, 과B6=0, 과B7=0, 과B8=0, 과B9=0, 과B10=0, 과B11=0, 과B12=0, 과B13=0, 과B14=0, 과B15=0, 과B16=0, 과B17=0, 과B18=0, 과B19=0, 과B20=0;
						
						if(b.ho<=50){
							if((int)(Math.random()*2)==0){
								과방B.print(string,0,1);
								과B1=s.nextInt();
								if(과B1==1){
									System.out.println("호감도 +10");
									b.ho+=10;
									과방B.print(string,2,3);
									과B2=s.nextInt();
									if(과B2==1){
										System.out.println("호감도 +10");
										b.ho+=10;
										과방B.print(string,4);
									}
									else if(과B2==2){
										System.out.println("호감도 -10");
										b.ho-=10;
										과방B.print(string,5);
									}
								}
								else if(과B1==2){
									System.out.println("호감도 -10");
									b.ho-=10;
									과방B.print(string,6,7);
									과B3=s.nextInt();
									if(과B3==1){
										System.out.println("호감도 +10");
										b.ho+=10;
										과방B.print(string,8);
									}
									else if(과B3==2){
										System.out.println("호감도 -10");
										b.ho-=10;
										과방B.print(string,9);
									}
								}
							}
							else{
								과방B.print(string,11,12);
								과B4=s.nextInt();
								if(과B4==1){
									System.out.println("호감도 -10");
									b.ho-=10;
									과방B.print(string,13,14);
									과B5=s.nextInt();
									if(과B5==1){
										System.out.println("호감도 +10");
										b.ho+=10;
										과방B.print(string,15);
									}
									else if(과B5==2){
										System.out.println("호감도 -10");
										b.ho-=10;
										과방B.print(string,16);
									}
								}
								else if(과B4==2){
									System.out.println("호감도 +10");
									b.ho+=10;
									과방B.print(string,17,18);
									과B6=s.nextInt();
									if(과B6==1){
										System.out.println("호감도 +10");
										b.ho+=10;
										과방B.print(string,19);
									}
									else if(과B6==2){
										System.out.println("호감도 -10");
										b.ho-=10;
										과방B.print(string,20);
									}
									else if(과B6==3){
										System.out.println("호감도 -10");
										b.ho-=10;
										과방B.print(string,21);
									}
								}
							}
						}
						else if(b.ho>50&&b.ho<=110){
							if((int)(Math.random()*2)==0){
								과방B.print(string,23,24);
								과B7=s.nextInt();
								if(과B7==1){
									System.out.println("호감도 -10");
									b.ho-=10;
									과방B.print(string,25,26);
									과B8=s.nextInt();
									if(과B8==1){
										System.out.println("호감도 -10");
										b.ho-=10;
										과방B.print(string,27);
									}
									else if(과B8==2){
										System.out.println("호감도 +10");
										b.ho+=10;
										과방B.print(string,28);
									}
								}
								else if(과B7==2){
									System.out.println("호감도 +10");
									b.ho+=10;
									과방B.print(string,29,30);
									과B9=s.nextInt();
									if(과B9==1){
										System.out.println("호감도 +10");
										b.ho+=10;
										과방B.print(string,31);
									}
									else if(과B9==2){
										System.out.println("호감도 -10");
										b.ho-=10;
										과방B.print(string,32);
									}
								}
							}
							else{
								과방B.print(string,34,35);
								과B10=s.nextInt();
								if(과B10==1){
									System.out.println("호감도 -10");
									b.ho-=10;
									과방B.print(string,36,37);
									과B11=s.nextInt();
									if(과B11==1){
										System.out.println("호감도 -10");
										b.ho-=10;
										과방B.print(string,38);
									}
									else if(과B11==2){
										System.out.println("호감도 +10");
										b.ho+=10;
										과방B.print(string,39);
									}
								}
								else if(과B10==2){
									System.out.println("호감도 +10");
									b.ho+=10;
									과방B.print(string,40,41);
									과B12=s.nextInt();
									if(과B12==1){
										과방B.print(string,42,43);
										과B13=s.nextInt();
										if(과B13==1){
											System.out.println("호감도 -10");
											b.ho-=10;
											과방B.print(string,44);
										}
										else if(과B13==2){
											System.out.println("호감도 +10");
											b.ho+=10;
											과방B.print(string,45);
										}
									}
									else if(과B12==2){
										과방B.print(string,46,47);
										과B14=s.nextInt();
										if(과B14==1){
											System.out.println("호감도 +10");
											b.ho+=10;
											과방B.print(string,48);
										}
										else if(과B14==2){
											System.out.println("호감도 -10");
											b.ho-=10;
											과방B.print(string,49);
										}
									}
								}
							}
						}
						else if(b.ho>110){
							if((int)(Math.random()*2)==0){
								과방B.print(string,51,52);
								과B15=s.nextInt();
								if(과B15==1){
									System.out.println("호감도 +10");
									b.ho+=10;
									과방B.print(string,53,54);
									과B16=s.nextInt();
									if(과B16==1){
										System.out.println("호감도 -10");
										b.ho-=10;
										과방B.print(string,56);
									}
									else if(과B16==2){
										System.out.println("호감도 +10");
										b.ho-=10;
										과방B.print(string,55);
									}
								}
								else if(과B15==2){
									System.out.println("호감도 -10");
									b.ho-=10;
									과방B.print(string,57,58);
									과B17=s.nextInt();
									if(과B17==1){
										System.out.println("호감도 -10");
										b.ho-=10;
										과방B.print(string,59);
									}
									else if(과B17==2){
										System.out.println("호감도 +10");
										b.ho+=10;
										과방B.print(string,60);
									}
								}
							}
							else{
								과방B.print(string,62,63);
								과B18=s.nextInt();
								if(과B18==1){
									System.out.println("호감도 +10");
									b.ho+=10;
									과방B.print(string,64,65);
									과B19=s.nextInt();
									if(과B19==1){
										System.out.println("호감도 -10");
										b.ho-=10;
										과방B.print(string,66);
									}
									else if(과B19==2){
										System.out.println("호감도 +10");
										b.ho+=10;
										과방B.print(string,67);
									}
								}
								else if(과B18==2){
									System.out.println("호감도 -10");
									b.ho-=10;
									과방B.print(string,68,69);
									과B20=s.nextInt();
									if(과B20==1){
										System.out.println("호감도 +10");
										b.ho+=10;
										과방B.print(string,70);
									}
									else if(과B20==2){
										System.out.println("호감도 -10");
										b.ho-=10;
										과방B.print(string,71);
									}
								}
							}
						}
						for(int i=0;i<100;i++){
							string[i]="";
							}
						
					}
					//B술자리
					else if(place2==6){
						술자리B.test(string);
						술자리B.change(string,userName,"정수");
						술자리B.change(string,daeName, "B");
						int 술B1=0, 술B2=0, 술B3=0,술B4=0, 술B5=0, 술B6=0, 술B7=0, 술B8=0, 술B9=0, 술B10=0,술B11=0,술B12=0,술B13=0,술B14=0,술B15=0;
			
						if(b.ho<=50){
							if((int)(Math.random()*2)==0){
								술자리B.print(string,0,1);
								술B1=s.nextInt();
								if(술B1==1){
									System.out.println("호감도 +10");
									b.ho+=10;
									술자리B.print(string,2,3);
									술B2=s.nextInt();
									if(술B2==1){
										System.out.println("호감도 +10");
										b.ho+=10;
										술자리B.print(string,4);
									}
									else if(술B2==2){
										System.out.println("호감도 -10");
										b.ho-=10;
										술자리B.print(string,5);
									}
								}
								else if(술B1==2){
									System.out.println("호감도 -10");
									b.ho-=10;
									술자리B.print(string,6,7);
									술B3=s.nextInt();
									if(술B3==1){
										System.out.println("호감도 -10");
										b.ho-=10;
										술자리B.print(string,8);
									}
									else if(술B3==2){
										System.out.println("호감도 +10");
										b.ho+=10;
										술자리B.print(string,9);
									}
								}
							}
							else{
								술자리B.print(string,11);
								술자리B.print(string,12,13);
								술B4=s.nextInt();
								if(술B4==1){
									System.out.println("호감도 -10");
									b.ho-=10;
									술자리B.print(string,14,16);
									술B5=s.nextInt();
									if(술B5==1){
										System.out.println("호감도 -10");
										b.ho-=10;
										술자리B.print(string,17);
									}
									else if(술B5==2){
										System.out.println("호감도 -10");
										b.ho-=10;
										술자리B.print(string,18);
									}
								}
								else if(술B4==2){
									System.out.println("호감도 +10");
									b.ho+=10;
									술자리B.print(string,15,19);
									술B6=s.nextInt();
									if(술B6==1){
										System.out.println("호감도 -10");
										b.ho-=10;
										술자리B.print(string,20);
									}
									else if(술B6==2){
										System.out.println("호감도 +10");
										b.ho+=10;
										술자리B.print(string,21,22);
										술B7=s.nextInt();
										if(술B7==1){
											System.out.println("호감도 -20");
											b.ho-=20;
											술자리B.print(string,23);
										}
										else if(술B7==2){
											System.out.println("호감도 -10");
											b.ho-=10;
											술자리B.print(string,24);
										}
										else if(술B7==3){
											System.out.println("호감도 +10");
											b.ho+=10;
											술자리B.print(string,25);
										}
									}
								}
							}
						}
						else if(b.ho<=110&&b.ho>50){
							술자리B.print(string,27);
							술자리B.print(string,28,29);
							술B8=s.nextInt();
							if(술B8==1){
								System.out.println("호감도 +10");
								b.ho+=10;
								술자리B.print(string,30,32);
								술B9=s.nextInt();
								if(술B9==1){
									System.out.println("호감도 -10");
									b.ho-=10;
									술자리B.print(string,33);
								}
								else if(술B9==2){
									System.out.println("호감도 +10");
									b.ho+=10;
									술자리B.print(string,34);
								}
							}
							else if(술B8==2){
								System.out.println("호감도 -10");
								b.ho-=10;
								술자리B.print(string,31,35);
								술B10=s.nextInt();
								if(술B10==1){
									System.out.println("호감도 +10");
									b.ho+=10;
									술자리B.print(string,36);
								}
								else if(술B10==2){
									System.out.println("호감도 -10");
									b.ho-=10;
									술자리B.print(string,37);
								}
							}
						}
						else if(b.ho>110){
							if((int)(Math.random()*2)==0){
								술자리B.print(string,39,40);
								술B11=s.nextInt();
								if(술B11==1){
									System.out.println("호감도 -10");
									b.ho-=10;
									술자리B.print(string,41,10);
								}
								else if(술B11==2){
									System.out.println("호감도 +10");
									b.ho+=10;
									술자리B.print(string,42,43);
									술B12=s.nextInt();
									if(술B12==1){
										System.out.println("호감도 +10");
										b.ho+=10;
										술자리B.print(string,44);
									}
									else if(술B12==2){
										System.out.println("호감도 -10");
										b.ho-=10;
										술자리B.print(string,45);
									}
								}
							}
							else{
								술자리B.print(string,47,48);
								술B13=s.nextInt();
								if(술B13==1){
									System.out.println("호감도 +10");
									b.ho+=10;
									술자리B.print(string,49,51);
									술B14=s.nextInt();
									if(술B14==1){
										System.out.println("호감도 +10");
										b.ho+=10;
										술자리B.print(string,52);
									}
									else if(술B14==2){
										System.out.println("호감도 -10");
										b.ho-=10;
										술자리B.print(string,53);
									}
								}
								else if(술B13==2){
									System.out.println("호감도 -10");
									b.ho-=10;
									술자리B.print(string,50,54);
									술B15=s.nextInt();
									if(술B15==1){
										System.out.println("호감도 +10");
										b.ho+=10;
										술자리B.print(string,55);
									}
									else if(술B15==2){
										System.out.println("호감도 -10");
										b.ho-=10;
										술자리B.print(string,56);
									}
								}
							}
						}
						for(int i=0;i<100;i++){
							string[i]="";
							}
					}
					
					
				}//장소끝
				if(place==5){
					System.out.println("오늘도 힘들었다! 집으로 가자~~~");
					cnt++;
				}	
				if(place2==5){
					System.out.println("오늘도 힘들었다! 집으로 가자~~~");
					
				}	
				if(cnt%2!=0||place==5){
				System.out.println("하루가 끝났습니다.");
				호감도.print();
				System.out.println("출석횟수는 "+출석횟수+"입니다.");
				System.out.println();
				if((b.ho>=150&&출석횟수>=10)||day==50)
					break;
				}
				cnt++;//cnt 짝수 : 오전, day 출력/홀수 : 오후, 하루 끝
				place=0;
				place2=0;
								
			}//while 첫번째
					
				
				break;
			}//두번째 while 문 끝
		//if B문 끝
			
			if(b.ho>=150&&출석횟수>=10){
				호감도.pass();
			}
			else{
				호감도.fail();
			}
		}
	}
}


class 소개{
	void intro(){
		File f = new File("소개.txt");
		String [] line = new String [17];
		try{
			Scanner s=new Scanner(f);
			int i=0;
			while(s.hasNext()){
				line[i]=s.nextLine();
				i++;
			}
			s.close(); 
		}catch(FileNotFoundException fnfe){
			return;
		}
		for(int i=0;i<17;i++){
            System.out.println(line[i]);
		}
	}
}
class 호감도{
	public static int ho=0;
	static void print(){
		System.out.println("오늘의 호감도는 "+ho+"입니다.");
	}
	static void pass(){
		System.out.println("성공했습니다. 축하합니다!!!!!^**&^*&^^*^*!!!!!!!!!!!");
	}
	static void fail(){
		System.out.println("실패했습니다. 자퇴하세요.");
	}
}
class A extends 호감도{
	A(){}
}
class B extends 호감도{
	B(){}
}
class 강의실{
	static void print(){
		System.out.println("수업을 들으러 왔습니다. 열심히 들으세요^^,,");
	}
}
class 과방A {
	static void test(String [] line){
		File f=new File("A 과방.txt");
	    //String [] line=new String [100];
		try{
			Scanner s=new Scanner(f);
			int i=0;
			while(s.hasNext()){
				line[i]=s.nextLine();
				i++;
        }
        s.close();
        }catch(FileNotFoundException fnfe){
			return;
		}
	}
	
	static void print(String [] k,int i,int j){
		try{
			Thread.sleep(1000);	
			System.out.println(k[i]);
			Thread.sleep(1000);
			System.out.println(k[j]);
		}catch(Exception e){
				System.out.println(e);
			}
	}
	
	static void change(String [] k,String a,String b){
		try{
		for(int i=0;i<100;i++){
			if(k[i].contains(b)){
			k[i]=k[i].replace(b,a);}
			else {k[i]=k[i];}
		
		}
		}catch(NullPointerException npe){
			System.out.print("");
		}
	}
		
}

class 과방B {
	static void test(String [] line){
		File f=new File("B 과방.txt");
		try{
			Scanner s=new Scanner(f);
			int i=0;
			while(s.hasNext()){
				line[i]=s.nextLine();
				i++;
			}
			s.close(); 
		}catch(FileNotFoundException fnfe){
			return;
		}
	}
	static void print(String [] k,int i,int j){
		try{
			Thread.sleep(1000);	
			System.out.println(k[i]);
			Thread.sleep(1000);
			System.out.println(k[j]);
		}catch(Exception e){
				System.out.println(e);
			}
	}
	static void print(String [] k,int i){
		try{
			Thread.sleep(1000);
			System.out.println(k[i]);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	static void change(String [] k,String a,String b){
		try{
		for(int i=0;i<100;i++){
			if(k[i].contains(b)){
			k[i]=k[i].replace(b,a);}
			else {k[i]=k[i];}
		
		}
		}catch(NullPointerException npe){
			System.out.print("");
		}
	}
	
	
}
class 술자리A {
	static void test(String [] line){
		File f=new File("A 술자리.txt");
		try{
			Scanner s=new Scanner(f);
			int i=0;
			while(s.hasNext()){
				line[i]=s.nextLine();
				i++;
			}
			s.close();
			
		}catch(FileNotFoundException fnfe){
			return;
		}
	}
	static void print(String [] k,int i,int j){
		try{
			Thread.sleep(1000);	
			System.out.println(k[i]);
			Thread.sleep(1000);
			System.out.println(k[j]);
		}catch(Exception e){
				System.out.println(e);
			}
	}
	static void change(String [] k,String a,String b){
		try{
		for(int i=0;i<100;i++){
			if(k[i].contains(b)){
			k[i]=k[i].replace(b,a);}
			else {k[i]=k[i];}
		
		}
		}catch(NullPointerException npe){
			System.out.print("");
		}
	}
}

class 술자리B {
    static void test(String [] line){
		File f=new File("B 술자리.txt");
		try{
			Scanner s=new Scanner(f);
			int i=0;
			while(s.hasNext()){
				line[i]=s.nextLine();
				i++;
			}
			s.close();
			
		}catch(FileNotFoundException fnfe){
			return;
		}
	}
	static void print(String [] k,int i,int j){
		try{
			Thread.sleep(1000);	
			System.out.println(k[i]);
			Thread.sleep(1000);
			System.out.println(k[j]);
		}catch(Exception e){
				System.out.println(e);
			}
	}
	static void print(String [] k,int i){
		try{
			Thread.sleep(1000);
			System.out.println(k[i]);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	static void change(String [] k,String a,String b){
		try{
		for(int i=0;i<100;i++){
			if(k[i].contains(b)){
			k[i]=k[i].replace(b,a);}
			else {k[i]=k[i];}
		
		}
		}catch(NullPointerException npe){
			System.out.print("");
		}
	}
	
}
class 일청담A {
    static void test(String [] line){
		File f=new File("A 일청담.txt");
		try{
			Scanner s=new Scanner(f);
			int i=0;
			while(s.hasNext()){
				line[i]=s.nextLine();
				i++;
			}
			s.close();
			
		}catch(FileNotFoundException fnfe){
			return;
		}
	}
	static void print(String [] k,int i,int j){
		try{
			Thread.sleep(1000);	
			System.out.println(k[i]);
			Thread.sleep(1000);
			System.out.println(k[j]);
		}catch(Exception e){
				System.out.println(e);
			}
	}
	static void change(String [] k,String a,String b){
		try{
		for(int i=0;i<100;i++){
			if(k[i].contains(b)){
			k[i]=k[i].replace(b,a);}
			else {k[i]=k[i];}
		
		}
		}catch(NullPointerException npe){
			System.out.print("");
		}
	}
		
}

class 일청담B {
    static void test(String [] line){
		File f=new File("B 일청담.txt");
		try{
			Scanner s=new Scanner(f);
			int i=0;
			while(s.hasNext()){
				line[i]=s.nextLine();
				i++;
			}
			s.close();
			
		}catch(FileNotFoundException fnfe){
			return;
		}
	}
	static void print(String [] k,int i,int j){
		try{
			Thread.sleep(1000);	
			System.out.println(k[i]);
			Thread.sleep(1000);
			System.out.println(k[j]);
		}catch(Exception e){
				System.out.println(e);
			}
	}
	static void print(String [] k,int i){
		try{
			Thread.sleep(1000);
			System.out.println(k[i]);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	static void change(String [] k,String a,String b){
		try{
		for(int i=0;i<100;i++){
			if(k[i].contains(b)){
			k[i]=k[i].replace(b,a);}
			else {k[i]=k[i];}
		
		}
		}catch(NullPointerException npe){
			System.out.print("");
		}
	}
	
}
class 도서관A {
	static void test(String [] line){
		File f=new File("A 도서관.txt");
		try{
			Scanner s=new Scanner(f);
			int i=0;
			while(s.hasNext()){
				line[i]=s.nextLine();
				i++;
			}
			s.close();
			
		}catch(FileNotFoundException fnfe){
			return;
		}
    }
	static void print(String [] k, int i, int j){
		try{
			Thread.sleep(1000);	
			System.out.println(k[i]);
			Thread.sleep(1000);
			System.out.println(k[j]);
		}catch(Exception e){
				System.out.println(e);
			}
	}
	static void change(String [] k,String a,String b){
		try{
		for(int i=0;i<100;i++){
			if(k[i].contains(b)){
			k[i]=k[i].replace(b,a);}
			else {k[i]=k[i];}
		
		}
		}catch(NullPointerException npe){
			System.out.print("");
		}
	}
}
class 도서관B {
	static void test(String [] line){
		File f=new File("B 도서관.txt");
		try{
			Scanner s=new Scanner(f);
			int i=0;
			while(s.hasNext()){
				line[i]=s.nextLine();
				i++;
			}
			s.close(); 
		}catch(FileNotFoundException fnfe){
			return;
		}
	}
	static void print(String [] k,int i,int j){
		try{
			Thread.sleep(1000);	
			System.out.println(k[i]);
			Thread.sleep(1000);
			System.out.println(k[j]);
		}catch(Exception e){
				System.out.println(e);
			}
	}
	static void print(String [] k,int i){
		try{
			Thread.sleep(1000);
			System.out.println(k[i]);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	static void change(String [] k,String a,String b){
		try{
		for(int i=0;i<100;i++){
			if(k[i].contains(b)){
			k[i]=k[i].replace(b,a);}
			else {k[i]=k[i];}
		
		}
		}catch(NullPointerException npe){
			System.out.print("");
		}
	}
}