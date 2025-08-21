package com.kh.network.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//서버 프로그램 , 통신을 받고 보내는 
public class ServerProgram {

	public static void main(String[] args) {
		
		//소캣? 전화 같은것 전화하는 동안 계속 연결되어있어야하고 들고있어야함
		/*
		 * 통신을 하기 위해서는 데이터 전송 이전 클라이언트와 서버의 연결이 필요
		 * 
		 * ● ServerSocket 
		 * - 포트번호와 연결(Bind)해서 외부의 연결요청을 기다리다가 연결 요청이 들어오면 수락해주는 용도
		 * 
		 * ● Socket
		 * - Process간의 통신을 담당
		 * - Socket 객체를 이용해 통신을 위한 기반 스트림 InputStream / OutputStream 을 제공받음
		 * - 기반스트림만으로는 제약이 있으니 보조스트림을 사용할 예정이다 ~
		 * 
		 * --소켓통신용 서버측 프로그램 작성 절차
		 * 
		 * 1) 포트번호 지정( 서버측에서 몇 번 포트를 열어둘 것인지)
		 * 2) ServerSocket 객체 생성 => 생성자 인자값으로 포트번호를 전달 ( 포트결합 (Biding))
		 * 3) 대기상태
		 * 4) 클라이언트가 연결요청을 하면 수락 후 통신 가능한 Socket객체를 반환 받음
		 * 5) Socket 객체를 이용해 입출력 스트림을 열어주기
		 * 6) 보조스트림을 추가하여 성능 개선
		 * 7) 데이터 주고받기
		 * 8) 자원반납
		 * 
		 * 
		 */
		
		//서버측 프로그램
		
		//0) 필요한 변수 세팅
		
		Scanner sc = new Scanner(System.in);
		
		//자원반납을 위해 미리 참조변수 선언
		ServerSocket server = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		//1) 포트번호 지정 
		int portNumber = 1025;
		
		try {
			
			server = new ServerSocket(portNumber);
			//항상 대기상태 클라이언트가 연결요청을 할 때까지 기다림 
			// 3) 대기상태
			System.out.println("나는 기다린다 너를..");
			
			// 4) 해당 클라이언트와 통신할 수있는 서버측 Socket 객체 생성
			// accpet(); 
			Socket socket = server.accept();
			
			System.out.println("클라이언트와의 연결 성공!");
			//socket 객체를 이용해 Client 의 정보를 반환받을 수 있음
			System.out.println(socket.getInetAddress());
			
			// 5) 클라이언트와 통신 할수있는 입출력용 스트림
			// 6) 보즈스트림 추가
			socket.getInputStream();
			// InputStream (바이트 스트림) 과 BufferedReader (char 스티림) 을 호환해주는 스트림
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//socket 에서 제공하는 입력용 기반 스트림 => InputStream => 1 Byte
			//( 바이트스트림과 문자스트림을 호환해줄 수 있는 보조스트림 => InputStreamReader )
			//속도 향상 , 한글전달 도 위한 입력용 보조스트림 => BufferedReader =? 2 Byte
			
			
			//출력용 스트림 (서버가 클라이언트에게 데이터를 전송하기 위한 스트림)
			pw = new PrintWriter(socket.getOutputStream());
			//PrintWriter 는 2Byte 짜리 문자용이지만 1Byte 도 가능 출력용만 있다.
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		// 7) epdlxj wnrhqkerl
		while(true) {
			String message;
			
			try {
				message = br.readLine();
				
				System.out.println("클라이언트로 부터 받은 메시지 : " + message);
				
				System.out.println("클라이언트에게 보낼 메시지 > ");
				String sendMessage = sc.nextLine();
				pw.println(sendMessage);
				
				pw.flush();
				
			} catch (IOException e) {
				e.printStackTrace();
				
			}finally {
				// 8) 자원반납 => 생성의 역순
				
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
	

