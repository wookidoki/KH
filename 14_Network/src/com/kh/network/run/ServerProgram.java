package com.kh.network.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//���� ���α׷� , ����� �ް� ������ 
public class ServerProgram {

	public static void main(String[] args) {
		
		//��Ĺ? ��ȭ ������ ��ȭ�ϴ� ���� ��� ����Ǿ��־���ϰ� ����־����
		/*
		 * ����� �ϱ� ���ؼ��� ������ ���� ���� Ŭ���̾�Ʈ�� ������ ������ �ʿ�
		 * 
		 * �� ServerSocket 
		 * - ��Ʈ��ȣ�� ����(Bind)�ؼ� �ܺ��� �����û�� ��ٸ��ٰ� ���� ��û�� ������ �������ִ� �뵵
		 * 
		 * �� Socket
		 * - Process���� ����� ���
		 * - Socket ��ü�� �̿��� ����� ���� ��� ��Ʈ�� InputStream / OutputStream �� ��������
		 * - ��ݽ�Ʈ�������δ� ������ ������ ������Ʈ���� ����� �����̴� ~
		 * 
		 * --������ſ� ������ ���α׷� �ۼ� ����
		 * 
		 * 1) ��Ʈ��ȣ ����( ���������� �� �� ��Ʈ�� ����� ������)
		 * 2) ServerSocket ��ü ���� => ������ ���ڰ����� ��Ʈ��ȣ�� ���� ( ��Ʈ���� (Biding))
		 * 3) ������
		 * 4) Ŭ���̾�Ʈ�� �����û�� �ϸ� ���� �� ��� ������ Socket��ü�� ��ȯ ����
		 * 5) Socket ��ü�� �̿��� ����� ��Ʈ���� �����ֱ�
		 * 6) ������Ʈ���� �߰��Ͽ� ���� ����
		 * 7) ������ �ְ�ޱ�
		 * 8) �ڿ��ݳ�
		 * 
		 * 
		 */
		
		//������ ���α׷�
		
		//0) �ʿ��� ���� ����
		
		Scanner sc = new Scanner(System.in);
		
		//�ڿ��ݳ��� ���� �̸� �������� ����
		ServerSocket server = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		//1) ��Ʈ��ȣ ���� 
		int portNumber = 1025;
		
		try {
			
			server = new ServerSocket(portNumber);
			//�׻� ������ Ŭ���̾�Ʈ�� �����û�� �� ������ ��ٸ� 
			// 3) ������
			System.out.println("���� ��ٸ��� �ʸ�..");
			
			// 4) �ش� Ŭ���̾�Ʈ�� ����� ���ִ� ������ Socket ��ü ����
			// accpet(); 
			Socket socket = server.accept();
			
			System.out.println("Ŭ���̾�Ʈ���� ���� ����!");
			//socket ��ü�� �̿��� Client �� ������ ��ȯ���� �� ����
			System.out.println(socket.getInetAddress());
			
			// 5) Ŭ���̾�Ʈ�� ��� �Ҽ��ִ� ����¿� ��Ʈ��
			// 6) ���Ʈ�� �߰�
			socket.getInputStream();
			// InputStream (����Ʈ ��Ʈ��) �� BufferedReader (char ��Ƽ��) �� ȣȯ���ִ� ��Ʈ��
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//socket ���� �����ϴ� �Է¿� ��� ��Ʈ�� => InputStream => 1 Byte
			//( ����Ʈ��Ʈ���� ���ڽ�Ʈ���� ȣȯ���� �� �ִ� ������Ʈ�� => InputStreamReader )
			//�ӵ� ��� , �ѱ����� �� ���� �Է¿� ������Ʈ�� => BufferedReader =? 2 Byte
			
			
			//��¿� ��Ʈ�� (������ Ŭ���̾�Ʈ���� �����͸� �����ϱ� ���� ��Ʈ��)
			pw = new PrintWriter(socket.getOutputStream());
			//PrintWriter �� 2Byte ¥�� ���ڿ������� 1Byte �� ���� ��¿븸 �ִ�.
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		// 7) epdlxj wnrhqkerl
		while(true) {
			String message;
			
			try {
				message = br.readLine();
				
				System.out.println("Ŭ���̾�Ʈ�� ���� ���� �޽��� : " + message);
				
				System.out.println("Ŭ���̾�Ʈ���� ���� �޽��� > ");
				String sendMessage = sc.nextLine();
				pw.println(sendMessage);
				
				pw.flush();
				
			} catch (IOException e) {
				e.printStackTrace();
				
			}finally {
				// 8) �ڿ��ݳ� => ������ ����
				
				try {if(pw != null) {pw.close();}}
					catch(Exception e) {e.printStackTrace();}
				
				try {if(sc != null) {sc.close();}}
					catch(Exception e) {e.printStackTrace();}
				
				try {if(br != null) {br.close();}}
					catch(IOException e) {e.printStackTrace();}
				
				try {if(server != null) {server.close();}}
					catch(IOException e){e.printStackTrace();}
					}
				}


		}
	}
	

