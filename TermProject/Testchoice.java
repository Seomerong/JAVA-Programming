import java.util.Scanner;
import java.io.*;
class Testchoice{
	public static void main(String [] args){
		String [] string=new String[100];
		
		int cnt=0;
		//�Ұ� ���
		�Ұ� �� = new �Ұ�();
		��.intro();
		System.out.println();
		String userName, daeSang, daeName;
		Scanner s = new Scanner(System.in);
		//��������� �Է¹ޱ�
		System.out.print("������� �̸��� �Է��ϼ���: ");
		
		userName = s.nextLine();
		
		while(true){
			System.out.print("������ ����� ���ϼ���(A, B): ");
			daeSang = s.nextLine();
			if(daeSang.equals("A")||daeSang.equals("B"))
				break;
		}
		System.out.print("������ ��󿡰� �̸��� �����ּ���: ");
		daeName = s.nextLine();
		
		int �⼮Ƚ��=0;
		int day=0;
		int place=0;
		int place2=0;
		int ��A1=0, ��A2=0, ��A3=0,��A4=0, ��A5=0, ��A6=0, ��A7=0, ��A8=0, ��A9=0;
		int ��A1=0, ��A2=0, ��A3=0, ��A4=0, ��A5=0, ��A6=0, ��A7=0, ��A8=0, ��A9=0, ��A10=0, ��A11=0, ��A12=0;
		int ��A1=0, ��A2=0, ��A3=0, ��A4=0, ��A5=0;
		int ��A1=0, ��A2=0, ��A3=0, ��A4=0, ��A5=0, ��A6=0, ��A7=0, ��A8=0, ��A9=0, ��A10=0, ��A11=0, ��A12=0;
		//A ����.
		A a = new A();
		if(daeSang.equals("A")){
			while(true){
				while(true){
				if(cnt%2==0){
				day++;
				System.out.println("DAY"+day);
				System.out.println("����");
				while(true){
					System.out.print("��Ҹ� �����ϼ���.(���ǽ�:1/������:2/��û��:3/����:4/��:5): ");
					place = s.nextInt();
					if(place>=1&&place<=5)
						break;
					else System.out.print("�ٽ� �Է��ϼ���. ");
				}
				}
				else if(cnt%2!=0){
					System.out.println("����");
					while(true){
						System.out.print("��Ҹ� �����ϼ���.(���ǽ�:1/������:2/��û��:3/����:4/��:5/���ڸ�:6): ");
						place2 = s.nextInt();
						if(place2>=1&&place2<=6)
							break;
						else System.out.print("�ٽ� �Է��ϼ���. ");
					}
				}
				if(place==1||place==2||place==3||place==4||place2==1||place2==2||place2==3||place2==4||place2==6){
					if(place==1||place2==1){
						���ǽ�.print();
						�⼮Ƚ��++;
					}
					//A ���ڸ�
					else if(place2==6){
						���ڸ�A.test(string);
						���ڸ�A.change(string,userName,"����");
						���ڸ�A.change(string,daeName, "A");
						int tmp4=a.ho;
						if(tmp4<=50){
						int rnt4=(int)(Math.random()*2);
						if(rnt4==0){
						
						���ڸ�A.print(string,0,1);
						��A1=s.nextInt();
						if(��A1==1){
							System.out.println("ȣ���� -10");
							a.ho-=10;	
							���ڸ�A.print(string,2,3);
						}
						else if(��A1==2){
							System.out.println("ȣ���� +10");
							a.ho+=10;
							���ڸ�A.print(string,4,5);
                            ��A2=s.nextInt();
							if(��A2==1){
								System.out.println("ȣ���� -10");
								a.ho-=10;	
								���ڸ�A.print(string,6,7);
							}
							else if(��A2==2){
								System.out.println("ȣ���� +10");
								a.ho+=10;	
								���ڸ�A.print(string,8,9);
							}
							
						}
						}
						else if(rnt4==1){
						
						
					
							���ڸ�A.print(string,10,11);
						    ��A3=s.nextInt();
						if(��A3==1){
							System.out.println("ȣ���� +0");
							a.ho+=0;	
							���ڸ�A.print(string,12,13);
						}
						else if(��A3==2){
							System.out.println("ȣ���� +10");
							a.ho+=10;
							���ڸ�A.print(string,14,15);
						}
						else if(��A3==3){
							System.out.println("ȣ���� -10");
							a.ho-=10;
							���ڸ�A.print(string,16,17);
						}
						}
						}
						else if(tmp4>50&&tmp4<=110){
						int rnt5=(int)(Math.random()*2);
						if(rnt5==0){
						
						���ڸ�A.print(string,18,19);
						��A4=s.nextInt();
						if(��A4==1){
							System.out.println("ȣ���� +10");
							a.ho+=10;
							���ڸ�A.print(string,20,21);
							��A5=s.nextInt();
							if(��A5==1){
								System.out.println("ȣ���� -10");
								a.ho-=10;	
								���ڸ�A.print(string,22,23);
							}
							else if(��A5==2){
								System.out.println("ȣ���� +10");
								a.ho+=10;
								���ڸ�A.print(string,24,25);
								��A6=s.nextInt();
								if(��A6==1){
									System.out.println("ȣ���� -10");
									a.ho-=10;	
									���ڸ�A.print(string,26,27);
								}
								else if(��A6==2){
									System.out.println("ȣ���� +10");
									a.ho+=10;	
									���ڸ�A.print(string,28,29);
								}
							}
						}
						else if(��A4==2){
							System.out.println("ȣ���� -10");
							a.ho-=10;
							���ڸ�A.print(string,30,31);
							
						}	
						}
						if(rnt5==1){
						
						���ڸ�A.print(string,32,33);
						��A7=s.nextInt();
						if(��A7==1){
							System.out.println("ȣ���� -10");
							a.ho-=10;
							���ڸ�A.print(string,34,35);
							���ڸ�A.print(string,36,37);
						}
						else if(��A7==2){
							System.out.println("ȣ���� +10");
							a.ho+=10;
							���ڸ�A.print(string,38,39);
							��A8=s.nextInt();
							if(��A8==1){
								System.out.println("ȣ���� -10");
								a.ho-=10;
								���ڸ�A.print(string,40,41);
							}
							else if(��A8==2){
								System.out.println("ȣ���� +10");
								a.ho+=10;
								���ڸ�A.print(string,42,43);
							}
						}
						}
						}
						if(tmp4>110){
						int rnt5=(int)(Math.random()*2);
						if(rnt5==0){
						
						���ڸ�A.print(string,44,45);
						��A9=s.nextInt();
						if(��A9==1){
							System.out.println("ȣ���� +10");
							a.ho+=10;
							���ڸ�A.print(string,46,47);
							��A10=s.nextInt();
							if(��A10==1){
								System.out.println("ȣ���� +10");
								a.ho+=10;
								���ڸ�A.print(string,48,49);
							}
							else if(��A10==2){
								System.out.println("ȣ���� -10");
								a.ho-=10;
								���ڸ�A.print(string,50,51);
							}
							else if(��A10==3){
								System.out.println("ȣ���� -10");
								a.ho-=10;
								���ڸ�A.print(string,52,53);
							}
						}
						else if(��A9==2){
							System.out.println("ȣ���� -50");
							a.ho-=50;
							���ڸ�A.print(string,54,55);
							
						}
						}
						else if(rnt5==1){
						
						���ڸ�A.print(string,56,57);
						��A11=s.nextInt();
						if(��A11==1){
							System.out.println("ȣ���� +0");
							a.ho+=0;
							���ڸ�A.print(string,58,59);
						}
						else if(��A11==2){
							System.out.println("ȣ���� +10");
							a.ho+=10;
							���ڸ�A.print(string,60,61);
							��A12=s.nextInt();
							if(��A12==1){
								System.out.println("ȣ���� -10");
								a.ho-=10;
								���ڸ�A.print(string,62,63);
							}
							else if(��A12==2){
								System.out.println("ȣ���� +10");
								a.ho+=10;
								���ڸ�A.print(string,64,65);
							}
						}
						else if(��A11==3){
							System.out.println("ȣ���� -10");
							a.ho-=10;
							���ڸ�A.print(string,66,67);
						}
						}
						}
						for(int i=0;i<100;i++){
							string[i]="";
							}
					}
						
						
					//A ��û��
					else if(place==3||place2==3){
						��û��A.test(string);
						��û��A.change(string,userName,"����");
						��û��A.change(string,daeName, "A");
						int tmp3=a.ho;
						if(tmp3<=50){
						int rnt3=(int)(Math.random()*2);
						if(rnt3==0){	
						
					    ��û��A.print(string,0,1);
						��û��A.print(string,2,3);
						��û��A.print(string,4,5);
						}
						else if(rnt3==1){
						
					    ��û��A.print(string,6,7);
						��û��A.print(string,8,9);
						��û��A.print(string,10,11);
						��û��A.print(string,12,13);
						}
						}
						if(tmp3>50&&tmp3<=110){
						
					    ��û��A.print(string,14,15);
						��A1=s.nextInt();
						if(��A1==1){
							System.out.println("ȣ���� +10");
							��û��A.print(string,16,17);
							��A2=s.nextInt();
							if(��A2==1){
								System.out.println("ȣ���� +10");
								a.ho+=10;
								��û��A.print(string,18,19);
							}
							else if(��A2==2){
								System.out.println("ȣ���� -10");
								a.ho-=10;
								��û��A.print(string,20,21);
							}
						}
						else if(��A1==2){
							System.out.println("ȣ���� -10");
						    a.ho-=10;
							��û��A.print(string,22,23);
						}
						}
						if(tmp3>110){
						
					    ��û��A.print(string,24,25);
						��A3=s.nextInt();
						if(��A3==1){
							System.out.println("ȣ���� +10");
							��A4=s.nextInt();
							��û��A.print(string,26,27);
							if(��A4==1){
								System.out.println("ȣ���� -10");
								a.ho-=10;
								��û��A.print(string,28,29);
							}
							else if(��A4==2){
								System.out.println("ȣ���� -10");
								a.ho-=10;
								��û��A.print(string,30,31);
							}
							else if(��A4==3){
								System.out.println("ȣ���� +10");
								a.ho+=10;
								��û��A.print(string,32,33);
							}
						}
						else if(��A3==2){
							System.out.println("ȣ���� -10");
							a.ho-=10;
							��û��A.print(string,34,35);
							��A5=s.nextInt();
							if(��A5==1){
								System.out.println("ȣ���� -10");
								a.ho-=10;
								��û��A.print(string,36,37);
							}
							else if(��A5==2){
								System.out.println("ȣ���� +10");
								a.ho+=10;
							}
						}
						}
						for(int i=0;i<100;i++){
							string[i]="";
							}
						}
					//A������
					else if(place==2||place2==2){
						������A.test(string);
						������A.change(string,userName,"����");
						������A.change(string,daeName, "A");
						int tmp=a.ho;
						if(tmp<=50){
						int rnt=(int)(Math.random()*2);
						if(rnt==0){
						
						������A.print(string,0,1);
						��A1=s.nextInt();
						if(��A1==1){
							System.out.println("ȣ���� +10");
							a.ho+=10;
							������A.print(string,2,3);
							��A2=s.nextInt();
							if(��A2==1){
								System.out.println("ȣ���� +10");
								a.ho+=10;
								������A.print(string,4,5);
							}
							else if(��A2==2){
								System.out.println("ȣ���� -10");
								a.ho-=10;
								������A.print(string,6,7);
							}
						}
						else if(��A1==2){
							System.out.println("ȣ���� -10");
							a.ho-=10;
							������A.print(string,8,9);
						}
						}
						if(rnt==1){
						
						������A.print(string,10,11);
						��A3=s.nextInt();
						if(��A3==1){
							System.out.println("ȣ���� +10");
							a.ho+=10;
							������A.print(string,12,13);
							��A4=s.nextInt();
							if(��A4==1){
								System.out.println("ȣ���� +10");
								a.ho+=10;
								������A.print(string,14,15);
							}
							else if(��A4==2){
								System.out.println("ȣ���� -10");
								a.ho-=10;
								������A.print(string,16,17);
							}
						}
						else if(��A3==2){
							System.out.println("ȣ���� -10");
							a.ho-=10;	
							������A.print(string,18,19);
						}
						}
						}
						//ȣ���� 50����
						if(tmp>50&&tmp<=110){
						
						������A.print(string,20,21);
						��A5=s.nextInt();
						if(��A5==1){
							System.out.println("ȣ���� +10");
							a.ho+=10;
							������A.print(string,22,23);
							������A.print(string,24,25);
							������A.print(string,26,27);
							��A6=s.nextInt();
							if(��A6==1){
								System.out.println("ȣ���� +10");
								a.ho+=10;
								������A.print(string,28,29);
							}
							else if(��A6==2){
							System.out.println("ȣ���� -10");
							a.ho-=10;	
							������A.print(string,30,31);
							}
						}
						if(��A5==2){
							System.out.println("ȣ���� -10");
							a.ho-=10;
							������A.print(string,32,33);
							��A7=s.nextInt();
							if(��A7==1){
								System.out.println("ȣ���� -10");
								a.ho-=10;
								������A.print(string,34,35);
							}
							else if(��A7==2){
								System.out.println("ȣ���� +10");
								a.ho+=10;	
								������A.print(string,36,37);
							}
						}
						}
						//ȣ���� 50�̻�
						if(tmp>110){
							int rnt2=(int)(Math.random()*2);
							if(rnt2==0){
						
						������A.print(string,38,39);
						��A8=s.nextInt();
						if(��A8==1){
							System.out.println("ȣ���� +10");
							a.ho+=10;
							������A.print(string,40,41);
							��A9=s.nextInt();
							if(��A9==1){
								System.out.println("ȣ���� +10");
								a.ho+=10;
								������A.print(string,42,43);
							}
							else if(��A9==2){
								System.out.println("ȣ���� -10");
								a.ho-=10;	
								������A.print(string,44,45);
							}
						}
						if(��A8==2){
							System.out.println("ȣ���� -10");
							a.ho-=10;
							������A.print(string,46,47);
							��A10=s.nextInt();
							if(��A10==1){
								System.out.println("ȣ���� +10");
								a.ho+=10;
								������A.print(string,48,49);
							}
							else if(��A10==2){
								System.out.println("ȣ���� -10");
								a.ho-=10;	
								������A.print(string,50,51);
							}
						}
						}
						if(rnt2==1){
							
						������A.print(string,52,53);
						��A11=s.nextInt();
						if(��A11==1){
							System.out.println("ȣ���� +10");
							a.ho+=10;
							������A.print(string,54,55);
							��A12=s.nextInt();
							if(��A12==1){
								System.out.println("ȣ���� +10");
								a.ho+=10;
								������A.print(string,56,57);
							}
							else if(��A12==2){
								System.out.println("ȣ���� -10");
								a.ho+=10;
								������A.print(string,58,59);
							}
						}
						else if(��A11==2){
							System.out.println("ȣ���� -10");
							a.ho-=10;
							������A.print(string,60,61);
						}
						}
						}
						for(int i=0;i<100;i++){
							string[i]="";
							}
					}
					//A ����
					else if(place==4||place2==4){
						����A.test(string);
						����A.change(string,userName,"����");
						����A.change(string,daeName, "A");
						int tmp2=a.ho;
						if(tmp2<=50){
						
						����A.print(string, 0,1);
						��A1=s.nextInt();
						if(��A1==1){
							System.out.println("ȣ���� +10");
							a.ho+=10;
							����A.print(string,2,3);
							��A2=s.nextInt();
							if(��A2==1){
								System.out.println("ȣ���� +10");
								a.ho+=10;
								����A.print(string,4,5);
							}
							else if(��A2==2){
								System.out.println("ȣ���� -10");
								a.ho-=10;
								����A.print(string,6,7);
							}
						}
						else if(��A1==2){
							System.out.println("ȣ���� -10");
							a.ho-=10;
							����A.print(string,8,9);
							��A3=s.nextInt();
							if(��A3==1){
								System.out.println("ȣ���� -10");
								a.ho-=10;
								����A.print(string,10,11);
							}
							else if(��A3==2){
								System.out.println("ȣ���� -10");
								a.ho-=10;
								����A.print(string,12,13);
							}
							else if(��A3==3){
								System.out.println("ȣ���� +10");
								a.ho+=10;
								����A.print(string,14,15);
							}
						}
						}
						//ȣ���� 50����
						else if(tmp2>50&&tmp2<=110){
							
							����A.print(string, 16,17);
							��A4=s.nextInt();
							if(��A4==1){
								System.out.println("ȣ���� +10");
								a.ho+=10;
								����A.print(string,18,19);
								��A5=s.nextInt();
								if(��A5==1){
									System.out.println("ȣ���� -10");
									a.ho-=10;
									����A.print(string,20,21);
								}
								else if(��A5==2){
									System.out.println("ȣ���� +10");
									a.ho+=10;
									����A.print(string,22,23);
								}
							}	
							else if(��A4==2){
								System.out.println("ȣ���� -10");
								a.ho-=10;
								����A.print(string,24,25);
								����A.print(string,26,27);
								��A6=s.nextInt();
								if(��A6==1){
									System.out.println("ȣ���� -10");
									a.ho-=10;
								}
								
								else if(��A6==2){
									System.out.println("ȣ���� -10");
									a.ho-=10;
								}
								else if(��A6==3){
									System.out.println("ȣ���� +10");
									a.ho+=10;
								}
							}	
						}
						//ȣ���� 50�̻�
						else if(tmp2>110){
							
							����A.print(string, 28,29);
							��A7=s.nextInt();
							if(��A7==1){
								System.out.println("ȣ���� +10");
								a.ho+=10;
								����A.print(string,30,31);
								��A8=s.nextInt();
								if(��A8==1){
									System.out.println("ȣ���� -10");
									a.ho-=10;
									����A.print(string,32,33);
								}
								else if(��A8==2){
									System.out.println("ȣ���� +10");
									a.ho+=10;
									����A.print(string,34,35);
								}
							}
							else if(��A7==2){
								System.out.println("ȣ���� -10");
								a.ho-=10;
								����A.print(string,36,37);
								��A9=s.nextInt();
								if(��A9==1){
									System.out.println("ȣ���� -10");
									a.ho-=10;
									����A.print(string,38,39);
								}
								else if(��A9==2){
									System.out.println("ȣ���� +10");
									a.ho+=10;
									����A.print(string,40,41);
								}
							}
						}
						for(int i=0;i<100;i++){
							string[i]="";
							}
						//ȣ���� 110�̻�	
					}		
				}//��� ��	
				if(place==5){
					System.out.println("���õ� �������! ������ ����~~~");
					cnt++;
				}	
				if(place2==5){
					System.out.println("���õ� �������! ������ ����~~~");
					
				}	
				if(cnt%2!=0||place==5){
				System.out.println("�Ϸ簡 �������ϴ�.");
				ȣ����.print();
				System.out.println("�⼮Ƚ���� "+�⼮Ƚ��+"�Դϴ�.");
				System.out.println();
				if((a.ho>=150&&�⼮Ƚ��>=10)||day==50)
					break;
				}
				cnt++;//cnt ¦�� : ����, day ���/Ȧ�� : ����, �Ϸ� ��
				place=0;
				place2=0;
								
			}//while ù��°
					
				
				break;
			}//�ι�° while �� ��
		//if A�� ��
			if(a.ho>=150&&�⼮Ƚ��>=10){
				ȣ����.pass();
			}
			else {
				ȣ����.fail();
			}
		}
		
		//B ����
		B b = new B();
		if(daeSang.equals("B")){
			while(true){
				while(true){
				if(cnt%2==0){
				day++;
				System.out.println("DAY"+day);
				System.out.println("����");
				while(true){
					System.out.print("��Ҹ� �����ϼ���.(���ǽ�:1/������:2/��û��:3/����:4/��:5): ");
					place = s.nextInt();
					if(place>=1&&place<=5)
						break;
					else System.out.print("�ٽ� �Է��ϼ���. ");
				}
				}
				else if(cnt%2!=0){
					System.out.println("����");
					while(true){
						System.out.print("��Ҹ� �����ϼ���.(���ǽ�:1/������:2/��û��:3/����:4/��:5/���ڸ�:6): ");
						place2 = s.nextInt();
						if(place2>=1&&place2<=6)
							break;
						else System.out.print("�ٽ� �Է��ϼ���. ");
					}
				}
				if(place==1||place==2||place==3||place==4||place2==1||place2==2||place2==3||place2==4||place2==6){
					if(place==1||place2==1){
						���ǽ�.print();
						�⼮Ƚ��++;
					}
					//B ������
					else if(place==2||place2==2){
						int ��B1=0, ��B2=0, ��B3=0,��B4=0, ��B5=0, ��B6=0, ��B7=0, ��B8=0, ��B9=0, ��B10=0,��B11=0;
						������B.test(string);
						������B.change(string,userName,"����");
						������B.change(string,daeName, "B");
						if(b.ho<=50){
							������B.print(string,0,1);
							��B1=s.nextInt();
							if(��B1==1){
								System.out.println("ȣ���� -10");
								b.ho-=10;
								������B.print(string,2,3);
								��B2=s.nextInt();
								if(��B2==1){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									������B.print(string,4);
								}
								else if(��B2==2){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									������B.print(string,5);
								}
							}
							else if(��B1==2){
								System.out.println("ȣ���� +10");
								b.ho+=10;
								������B.print(string,6,7);
								��B3=s.nextInt();
								if(��B3==1){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									������B.print(string,8,9);
									��B4=s.nextInt();
									if(��B4==1){
										System.out.println("ȣ���� +10");
										b.ho+=10;
									}
									else if(��B4==2){
										System.out.println("ȣ���� -10");
										b.ho-=10;
									}
								}
								else if(��B3==2){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									������B.print(string,10);
								}
							}
						}
						else if(b.ho>50&&b.ho<=110){
							������B.print(string,12,13);
							��B5=s.nextInt();
							if(��B5==1){
								System.out.println("ȣ���� +10");
								b.ho+=10;
								������B.print(string,14,15);
								��B6=s.nextInt();
								if(��B6==1){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									������B.print(string,16);
								}
								else if(��B6==2){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									������B.print(string,17);
								}
							}
							else if(��B5==2){
								System.out.println("ȣ���� -10");
								b.ho-=10;
								������B.print(string,18,19);
								��B7=s.nextInt();
								if(��B7==1){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									������B.print(string,20);
								}
								else if(��B7==2){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									������B.print(string,21);
								}
							}
						}
						else if(b.ho>110){
							������B.print(string,23);
							������B.print(string,24,25);
							��B8=s.nextInt();
							if(��B8==1){
								System.out.println("ȣ���� +10");
								b.ho+=10;
								������B.print(string,26,27);
								������B.print(string,28,29);
								��B9=s.nextInt();
								if(��B9==1){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									������B.print(string,30,31);
									��B10=s.nextInt();
									if(��B10==1||��B10==2){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										������B.print(string,32);
									}
									else if(��B10==3){
										System.out.println("ȣ���� +10");
										b.ho+=10;
										������B.print(string,32);
									}
								}
								else if(��B9==2){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									������B.print(string,33);
								}
							}
							else if(��B8==2){
								System.out.println("ȣ���� -10");
								b.ho-=10;
								������B.print(string,34,35);
								��B11=s.nextInt();
								if(��B11==1){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									������B.print(string,36);
								}
								else if(��B11==2){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									������B.print(string,37);
								}
							}
						}
						 for(int i=0;i<100;i++){
							string[i]="";
							}    
					}
					//B ��û��
					else if(place==3||place2==3){
						��û��B.test(string);
						��û��B.change(string,userName,"����");
						��û��B.change(string,daeName, "B");
						int ��B1=0, ��B2=0, ��B3=0, ��B4=0, ��B5=0, ��B6=0, ��B7=0, ��B8=0;
						
						if(b.ho<=50){
							��û��B.print(string,0,1);
							��û��B.print(string,2,3);
							��B1=s.nextInt();
							if(��B1==1){
								System.out.println("ȣ���� +10");
								b.ho+=10;
								��û��B.print(string,4,5);
								��B2=s.nextInt();
								if(��B2==1){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									��û��B.print(string,6,7);
									��B3=s.nextInt();
									if(��B3==1){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										��û��B.print(string,8);
									}
									else if(��B3==2){
										System.out.println("ȣ���� +10");
										b.ho+=10;
										��û��B.print(string,9,10);
										��B4=s.nextInt();
										if(��B4==1){
											System.out.println("ȣ���� -10");
											b.ho-=10;
											��û��B.print(string,11);
										}
										else if(��B4==2){
											System.out.println("ȣ���� +0");
											b.ho+=0;
											��û��B.print(string,12);
										}
										else if(��B4==3){
											System.out.println("ȣ���� +10");
											b.ho+=10;
											��û��B.print(string,13);
										}	
									}
								}
								else if(��B2==2){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									��û��B.print(string,14);
								}	
							}
							else if(��B1==2){
								System.out.println("ȣ���� -10");
								b.ho-=10;
								��û��B.print(string,15);
							}
						}
						else if(b.ho>50&&b.ho<=110){
							��û��B.print(string,17,18);
							��û��B.print(string,19,20);
							��û��B.print(string,21,22);
							��û��B.print(string,23,24);
							��B5=s.nextInt();
							if(��B5==1){
								System.out.println("ȣ���� +10");
								b.ho+=10;
								��û��B.print(string,25,26);
								��û��B.print(string,27,28);
								��B6=s.nextInt();
								if(��B6==1){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									��û��B.print(string,29);
								}
								else if(��B6==2){
									System.out.println("ȣ���� +0");
									b.ho+=0;
									��û��B.print(string,30);
								}
							}
							else if(��B5==2){
								System.out.println("ȣ���� -10");
								b.ho-=10;
								��û��B.print(string,31,32);
								��B7=s.nextInt();
								if(��B7==1){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									��û��B.print(string,33);
								}
								else if(��B7==2){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									��û��B.print(string,34);
								}
							}
						}
						else if(b.ho>110){
							��û��B.print(string,35,36);
							��û��B.print(string,37,38);
							��û��B.print(string,39,40);
							��û��B.print(string,41,42);
							��û��B.print(string,43,44);
							��û��B.print(string,45,46);
							��B8=s.nextInt();
							if(��B8==1){
								System.out.println("ȣ���� +10");
								b.ho+=10;
								��û��B.print(string,47);
							}
							else if(��B8==2){
								System.out.println("ȣ���� -10");
								b.ho-=10;
								��û��B.print(string,48);
							}
						}
						for(int i=0;i<100;i++){
							string[i]="";
							}
					}
					//B����
					else if(place==4||place2==4){
						����B.test(string);
						����B.change(string,userName,"����");
						����B.change(string,daeName, "B");
						int ��B1=0, ��B2=0, ��B3=0, ��B4=0, ��B5=0, ��B6=0, ��B7=0, ��B8=0, ��B9=0, ��B10=0, ��B11=0, ��B12=0, ��B13=0, ��B14=0, ��B15=0, ��B16=0, ��B17=0, ��B18=0, ��B19=0, ��B20=0;
						
						if(b.ho<=50){
							if((int)(Math.random()*2)==0){
								����B.print(string,0,1);
								��B1=s.nextInt();
								if(��B1==1){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									����B.print(string,2,3);
									��B2=s.nextInt();
									if(��B2==1){
										System.out.println("ȣ���� +10");
										b.ho+=10;
										����B.print(string,4);
									}
									else if(��B2==2){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										����B.print(string,5);
									}
								}
								else if(��B1==2){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									����B.print(string,6,7);
									��B3=s.nextInt();
									if(��B3==1){
										System.out.println("ȣ���� +10");
										b.ho+=10;
										����B.print(string,8);
									}
									else if(��B3==2){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										����B.print(string,9);
									}
								}
							}
							else{
								����B.print(string,11,12);
								��B4=s.nextInt();
								if(��B4==1){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									����B.print(string,13,14);
									��B5=s.nextInt();
									if(��B5==1){
										System.out.println("ȣ���� +10");
										b.ho+=10;
										����B.print(string,15);
									}
									else if(��B5==2){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										����B.print(string,16);
									}
								}
								else if(��B4==2){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									����B.print(string,17,18);
									��B6=s.nextInt();
									if(��B6==1){
										System.out.println("ȣ���� +10");
										b.ho+=10;
										����B.print(string,19);
									}
									else if(��B6==2){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										����B.print(string,20);
									}
									else if(��B6==3){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										����B.print(string,21);
									}
								}
							}
						}
						else if(b.ho>50&&b.ho<=110){
							if((int)(Math.random()*2)==0){
								����B.print(string,23,24);
								��B7=s.nextInt();
								if(��B7==1){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									����B.print(string,25,26);
									��B8=s.nextInt();
									if(��B8==1){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										����B.print(string,27);
									}
									else if(��B8==2){
										System.out.println("ȣ���� +10");
										b.ho+=10;
										����B.print(string,28);
									}
								}
								else if(��B7==2){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									����B.print(string,29,30);
									��B9=s.nextInt();
									if(��B9==1){
										System.out.println("ȣ���� +10");
										b.ho+=10;
										����B.print(string,31);
									}
									else if(��B9==2){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										����B.print(string,32);
									}
								}
							}
							else{
								����B.print(string,34,35);
								��B10=s.nextInt();
								if(��B10==1){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									����B.print(string,36,37);
									��B11=s.nextInt();
									if(��B11==1){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										����B.print(string,38);
									}
									else if(��B11==2){
										System.out.println("ȣ���� +10");
										b.ho+=10;
										����B.print(string,39);
									}
								}
								else if(��B10==2){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									����B.print(string,40,41);
									��B12=s.nextInt();
									if(��B12==1){
										����B.print(string,42,43);
										��B13=s.nextInt();
										if(��B13==1){
											System.out.println("ȣ���� -10");
											b.ho-=10;
											����B.print(string,44);
										}
										else if(��B13==2){
											System.out.println("ȣ���� +10");
											b.ho+=10;
											����B.print(string,45);
										}
									}
									else if(��B12==2){
										����B.print(string,46,47);
										��B14=s.nextInt();
										if(��B14==1){
											System.out.println("ȣ���� +10");
											b.ho+=10;
											����B.print(string,48);
										}
										else if(��B14==2){
											System.out.println("ȣ���� -10");
											b.ho-=10;
											����B.print(string,49);
										}
									}
								}
							}
						}
						else if(b.ho>110){
							if((int)(Math.random()*2)==0){
								����B.print(string,51,52);
								��B15=s.nextInt();
								if(��B15==1){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									����B.print(string,53,54);
									��B16=s.nextInt();
									if(��B16==1){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										����B.print(string,56);
									}
									else if(��B16==2){
										System.out.println("ȣ���� +10");
										b.ho-=10;
										����B.print(string,55);
									}
								}
								else if(��B15==2){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									����B.print(string,57,58);
									��B17=s.nextInt();
									if(��B17==1){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										����B.print(string,59);
									}
									else if(��B17==2){
										System.out.println("ȣ���� +10");
										b.ho+=10;
										����B.print(string,60);
									}
								}
							}
							else{
								����B.print(string,62,63);
								��B18=s.nextInt();
								if(��B18==1){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									����B.print(string,64,65);
									��B19=s.nextInt();
									if(��B19==1){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										����B.print(string,66);
									}
									else if(��B19==2){
										System.out.println("ȣ���� +10");
										b.ho+=10;
										����B.print(string,67);
									}
								}
								else if(��B18==2){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									����B.print(string,68,69);
									��B20=s.nextInt();
									if(��B20==1){
										System.out.println("ȣ���� +10");
										b.ho+=10;
										����B.print(string,70);
									}
									else if(��B20==2){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										����B.print(string,71);
									}
								}
							}
						}
						for(int i=0;i<100;i++){
							string[i]="";
							}
						
					}
					//B���ڸ�
					else if(place2==6){
						���ڸ�B.test(string);
						���ڸ�B.change(string,userName,"����");
						���ڸ�B.change(string,daeName, "B");
						int ��B1=0, ��B2=0, ��B3=0,��B4=0, ��B5=0, ��B6=0, ��B7=0, ��B8=0, ��B9=0, ��B10=0,��B11=0,��B12=0,��B13=0,��B14=0,��B15=0;
			
						if(b.ho<=50){
							if((int)(Math.random()*2)==0){
								���ڸ�B.print(string,0,1);
								��B1=s.nextInt();
								if(��B1==1){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									���ڸ�B.print(string,2,3);
									��B2=s.nextInt();
									if(��B2==1){
										System.out.println("ȣ���� +10");
										b.ho+=10;
										���ڸ�B.print(string,4);
									}
									else if(��B2==2){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										���ڸ�B.print(string,5);
									}
								}
								else if(��B1==2){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									���ڸ�B.print(string,6,7);
									��B3=s.nextInt();
									if(��B3==1){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										���ڸ�B.print(string,8);
									}
									else if(��B3==2){
										System.out.println("ȣ���� +10");
										b.ho+=10;
										���ڸ�B.print(string,9);
									}
								}
							}
							else{
								���ڸ�B.print(string,11);
								���ڸ�B.print(string,12,13);
								��B4=s.nextInt();
								if(��B4==1){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									���ڸ�B.print(string,14,16);
									��B5=s.nextInt();
									if(��B5==1){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										���ڸ�B.print(string,17);
									}
									else if(��B5==2){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										���ڸ�B.print(string,18);
									}
								}
								else if(��B4==2){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									���ڸ�B.print(string,15,19);
									��B6=s.nextInt();
									if(��B6==1){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										���ڸ�B.print(string,20);
									}
									else if(��B6==2){
										System.out.println("ȣ���� +10");
										b.ho+=10;
										���ڸ�B.print(string,21,22);
										��B7=s.nextInt();
										if(��B7==1){
											System.out.println("ȣ���� -20");
											b.ho-=20;
											���ڸ�B.print(string,23);
										}
										else if(��B7==2){
											System.out.println("ȣ���� -10");
											b.ho-=10;
											���ڸ�B.print(string,24);
										}
										else if(��B7==3){
											System.out.println("ȣ���� +10");
											b.ho+=10;
											���ڸ�B.print(string,25);
										}
									}
								}
							}
						}
						else if(b.ho<=110&&b.ho>50){
							���ڸ�B.print(string,27);
							���ڸ�B.print(string,28,29);
							��B8=s.nextInt();
							if(��B8==1){
								System.out.println("ȣ���� +10");
								b.ho+=10;
								���ڸ�B.print(string,30,32);
								��B9=s.nextInt();
								if(��B9==1){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									���ڸ�B.print(string,33);
								}
								else if(��B9==2){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									���ڸ�B.print(string,34);
								}
							}
							else if(��B8==2){
								System.out.println("ȣ���� -10");
								b.ho-=10;
								���ڸ�B.print(string,31,35);
								��B10=s.nextInt();
								if(��B10==1){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									���ڸ�B.print(string,36);
								}
								else if(��B10==2){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									���ڸ�B.print(string,37);
								}
							}
						}
						else if(b.ho>110){
							if((int)(Math.random()*2)==0){
								���ڸ�B.print(string,39,40);
								��B11=s.nextInt();
								if(��B11==1){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									���ڸ�B.print(string,41,10);
								}
								else if(��B11==2){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									���ڸ�B.print(string,42,43);
									��B12=s.nextInt();
									if(��B12==1){
										System.out.println("ȣ���� +10");
										b.ho+=10;
										���ڸ�B.print(string,44);
									}
									else if(��B12==2){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										���ڸ�B.print(string,45);
									}
								}
							}
							else{
								���ڸ�B.print(string,47,48);
								��B13=s.nextInt();
								if(��B13==1){
									System.out.println("ȣ���� +10");
									b.ho+=10;
									���ڸ�B.print(string,49,51);
									��B14=s.nextInt();
									if(��B14==1){
										System.out.println("ȣ���� +10");
										b.ho+=10;
										���ڸ�B.print(string,52);
									}
									else if(��B14==2){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										���ڸ�B.print(string,53);
									}
								}
								else if(��B13==2){
									System.out.println("ȣ���� -10");
									b.ho-=10;
									���ڸ�B.print(string,50,54);
									��B15=s.nextInt();
									if(��B15==1){
										System.out.println("ȣ���� +10");
										b.ho+=10;
										���ڸ�B.print(string,55);
									}
									else if(��B15==2){
										System.out.println("ȣ���� -10");
										b.ho-=10;
										���ڸ�B.print(string,56);
									}
								}
							}
						}
						for(int i=0;i<100;i++){
							string[i]="";
							}
					}
					
					
				}//��ҳ�
				if(place==5){
					System.out.println("���õ� �������! ������ ����~~~");
					cnt++;
				}	
				if(place2==5){
					System.out.println("���õ� �������! ������ ����~~~");
					
				}	
				if(cnt%2!=0||place==5){
				System.out.println("�Ϸ簡 �������ϴ�.");
				ȣ����.print();
				System.out.println("�⼮Ƚ���� "+�⼮Ƚ��+"�Դϴ�.");
				System.out.println();
				if((b.ho>=150&&�⼮Ƚ��>=10)||day==50)
					break;
				}
				cnt++;//cnt ¦�� : ����, day ���/Ȧ�� : ����, �Ϸ� ��
				place=0;
				place2=0;
								
			}//while ù��°
					
				
				break;
			}//�ι�° while �� ��
		//if B�� ��
			
			if(b.ho>=150&&�⼮Ƚ��>=10){
				ȣ����.pass();
			}
			else{
				ȣ����.fail();
			}
		}
	}
}


class �Ұ�{
	void intro(){
		File f = new File("�Ұ�.txt");
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
class ȣ����{
	public static int ho=0;
	static void print(){
		System.out.println("������ ȣ������ "+ho+"�Դϴ�.");
	}
	static void pass(){
		System.out.println("�����߽��ϴ�. �����մϴ�!!!!!^**&^*&^^*^*!!!!!!!!!!!");
	}
	static void fail(){
		System.out.println("�����߽��ϴ�. �����ϼ���.");
	}
}
class A extends ȣ����{
	A(){}
}
class B extends ȣ����{
	B(){}
}
class ���ǽ�{
	static void print(){
		System.out.println("������ ������ �Խ��ϴ�. ������ ��������^^,,");
	}
}
class ����A {
	static void test(String [] line){
		File f=new File("A ����.txt");
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

class ����B {
	static void test(String [] line){
		File f=new File("B ����.txt");
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
class ���ڸ�A {
	static void test(String [] line){
		File f=new File("A ���ڸ�.txt");
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

class ���ڸ�B {
    static void test(String [] line){
		File f=new File("B ���ڸ�.txt");
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
class ��û��A {
    static void test(String [] line){
		File f=new File("A ��û��.txt");
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

class ��û��B {
    static void test(String [] line){
		File f=new File("B ��û��.txt");
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
class ������A {
	static void test(String [] line){
		File f=new File("A ������.txt");
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
class ������B {
	static void test(String [] line){
		File f=new File("B ������.txt");
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