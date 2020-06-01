package Exam06;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int count = 0;
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		
		String ano;
		String owner;
		int balaned;
		System.out.println("------------");
		System.out.println("계좌생성");
		System.out.println("------------");
		System.out.println("계좌번호: ");
		ano = scanner.next();
		System.out.println("계좌주: ");
		owner = scanner.next();
		System.out.println("초기입금액: ");
		balaned = scanner.nextInt();
		accountArray[count]= new Account(ano,owner,balaned);
		count++;
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}
	private static void accountList() {

		System.out.println("------------");
		System.out.println("계좌목록");
		System.out.println("------------");
		
		for(int i =0; i<=count - 1; i++)
		{			
			System.out.print(accountArray[i].getAno() + "    ");
			System.out.print(accountArray[i].getOwner() + "    ");
			System.out.println(accountArray[i].getBalance());			
		}		
	}
	private static void deposit() {
		System.out.println("------------");
		System.out.println("예금");
		System.out.println("------------");
		
		String ano;
		int balaned;
		int i;
		System.out.println("계좌번호: ");
		ano = scanner.next();
		System.out.println("예금액: ");
		balaned = scanner.nextInt();
		Account find = findAccount(ano);
		find.setBalance(balaned, "+");	
	}
	private static void withdraw() {
		System.out.println("------------");
		System.out.println("출금");
		System.out.println("------------");
		
		String ano;
		int balaned;
		int i;
		System.out.println("계좌번호: ");
		ano = scanner.next();
		System.out.println("출금액: ");
		balaned = scanner.nextInt();
		Account find = findAccount(ano);
		find.setBalance(balaned, "-");		
	}
	private static Account findAccount(String ano) {
		int i =0;
		for(i =0; i<accountArray.length; i++) 
		{
			if(ano.equals(accountArray[i].getAno())) 
			{
				break;				
			}
		}	
		return accountArray[i];
	}

}
