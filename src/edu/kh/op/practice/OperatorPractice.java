package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("�ο� �� : ");
		int person = sc.nextInt();
		//System.out.println(person + "��");
		
		System.out.print("�������� : ");
		int candy = sc.nextInt();
		//System.out.println(candy + "��");
		
		System.out.println("1�δ� ���� ����: " + (candy / person));
		System.out.println("���� ���� ����: " + (candy % person));
		
	}
	
	public void practice2() {
		
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("�г�(���ڸ��Է�) : ");
		int grade = sc.nextInt();
		System.out.print("��(���ڸ��Է�) : ");
		int scoolClass = sc.nextInt();
		System.out.print("��ȣ(���ڸ��Է�) : ");
		int number = sc.nextInt();
		System.out.print("����(���л�/���л�) : ");
		String gender = sc.next();
		System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ�����) : ");
		float scores = sc.nextFloat();
		System.out.println(grade + "�г� " + scoolClass + "�� " + 
						   number + "�� " + name + " " + gender + 
						   "�� " + "������ " + scores + "�̴�.");
		
	}
	
	public void practice3() {
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		double avg = sum / 3.0;
		System.out.println(sum);
		System.out.println(avg);
	}
}
