package com.kh.plant.run;
import com.kh.plant.view.PlanView;


public class Run {

	public static void main(String[] args) {
		
		//MVC ���� (Model - View - Controller)
		
		/* ���ø����̼��� ���鶧 ������ 3������ �и�����
		 * ����Ʈ���� ��Ű���� 
		 * 
		 * 1. Model (�����Ϳ� ���õ� �۾�)
		 * ������ ��� => VO
		 * �ܺθ�ü���� ��ȣ�ۿ� => DAO
		 * ����Ͻ� ���� 
		 * 
		 * 2.View 
		 * ����� �������̽��� ��� 
		 * ����ڿ��� ������ ǥ��, ������� �Է°��� ���� 
		 * Model ���� ������� �����͸� �ð������� ǥ�� 
		 * �𵨰� ���� ��ȣ�ۿ����� ����
		 * 
		 * 3.Controller
		 * Model�� View�� �߰��ٸ� ��Ȱ
		 * ����� �Է��� ó���ϰ� �𵨿� ����
		 * �𵨿��� �Ͼ ���� ��� 
		 * 
		 */
		PlanView pv = new PlanView();
		pv.mainMenu();
		

	}

}
