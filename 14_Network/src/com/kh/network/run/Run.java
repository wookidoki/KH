package com.kh.network.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {

	public static void main(String[] args) {
		/*
		 *  ��Ʈ��ũ(Network)
		 *  
		 *  ��� ������ �δ� �̻��� ��ġ���� ������ �Ǵ� �������� ������ ȯ��
		 *  ��Ʈ��ũ �� ���� : �������� ��ȯ
		 * 
		 *  ����� ������ ��ġ�� �Ϲ������� Host 
		 *  ���ܰ��� ���� ��� ��ġ�� EndPoint ��� ��
		 * 
		 * MAC(Media ACcess Controler) Address / IP (Internet Protocol) Address
		 * 
		 * - Mac Address : NIC (Network Interface Card) �� ���� ������ �ٿ����� ������ �ּ� 
		 * 
		 * - IP Address : Internet �󿡼� �� Host ���� �ĺ��� �� �ִ� ������ ���� 
		 * 
		 * - Port Nuber : Host ���ο��� �۵��ϴ� Process�� �ĺ��� �� ����ϴ� ���� ��ȣ
		 * 
		 * Mac = �̷л� �������ε� �����δ� �������� �÷���
		 * IP �ּҿ� Port ��ȣ�� �������� 
		 * 
		 * - Server �� Client
		 *  
		 *  Server : Client ���� ���񽺸� �������ִ� �������� ��ǻ�� �Ǵ� ���α׷� / ���� ������
		 *  Client : Server ���� ���񽺸� ��û�ϴ� �������� ��ǻ�� �Ǵ� ���α׷� �� ���񽺸� �޴� ��
		 * 
		 * 
		 */
		
	
			try {
				InetAddress localHost = InetAddress.getLocalHost();
				//localHost = ���� ���α׷��� ���۽�Ų ��ġ�� �ǹ�
				//getLocalHost() �۾��ϰ��ִ� Host �� ������ ��ȯ���ִ� �޼ҵ�
				System.out.println(localHost); // PC �̸�// IP �ּ�
				System.out.println(localHost.getHostName());
				System.out.println(localHost.getHostAddress());
				
				System.out.println("===================");
				/*
				 * �����γ����� ���ؼ� ������ǻ�Ϳ� ���õ� ������ ��� �� ������
				 * DomainName : ����ڰ� ���񽺸� �̿��� �� ������ IP�ּҸ� �ܿ�� �����ϱ�
				 * 				�ܿ�� ������� ����ڿ��� �����Ǵ� �̸�
				 * 
				 * www.google.com -> hosts���� -> DNS
				 * google ������ IP �ּҸ� ������ �������� HTTP(s) ��û
				 */
				
				InetAddress googleHost = InetAddress.getByName("www.google.com");
				System.out.println(googleHost);
				
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); 
			}
			
			/*
			 * Client - Server Model
			 * 
			 * ���� �������� ������ �����Ѵٸ� Ŭ���̾�Ʈ�� ������ ������ ��û�� ���� �� ����
			 * => ������ ���� ����� ���� �־����
			 * 
			 * request �� response ���� ���α׷��� ���(����) �� 
			 * �������� ��� ��� : Hyper Text Transfer Protocol Secure
			 * https
			 * 
			 */
			
			/*
			 * ���� �ڹٸ��� ����ؼ� Ŭ���̾�Ʈ�� ������ ������ ����غ���
			 * 
			 * ��Ĺ(Socket)
			 * 
			 * Process(���α׷��� �޸𸮿� ����� ����) ���� ����� ���
			 * 
			 */
			
			// �ڹٷ� �۾��ؼ� ���� ����� => �ҽ��ڵ�(Source Code)
			// ��Ĺ ��� 
			


	}

}
