package com.kh.network.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {

	public static void main(String[] args) {
		/*
		 *  네트워크(Network)
		 *  
		 *  통신 가능한 두대 이상의 장치들을 물리적 또는 논리적으로 연결한 환경
		 *  네트워크 의 목적 : 데이터의 교환
		 * 
		 *  통신이 가능한 장치는 일반적으로 Host 
		 *  종단간의 실제 통신 장치는 EndPoint 라고 함
		 * 
		 * MAC(Media ACcess Controler) Address / IP (Internet Protocol) Address
		 * 
		 * - Mac Address : NIC (Network Interface Card) 에 실제 제조시 붙여지는 물리적 주소 
		 * 
		 * - IP Address : Internet 상에서 각 Host 들을 식별할 수 있는 논리적인 구조 
		 * 
		 * - Port Nuber : Host 내부에서 작동하는 Process를 식별할 때 사용하는 내부 번호
		 * 
		 * Mac = 이론상 고정값인데 실제로는 가상으로 올려서
		 * IP 주소와 Port 번호는 변동값임 
		 * 
		 * - Server 와 Client
		 *  
		 *  Server : Client 에게 서비스를 제공해주는 물리적인 컴퓨터 또는 프로그램 / 서비스 제공자
		 *  Client : Server 에게 서비스를 요청하는 물리적인 컴퓨터 또는 프로그램 즉 서비스를 받는 고객
		 * 
		 * 
		 */
		
	
			try {
				InetAddress localHost = InetAddress.getLocalHost();
				//localHost = 현재 프로그램을 동작시킨 장치를 의미
				//getLocalHost() 작업하고있는 Host 의 정보를 반환해주는 메소드
				System.out.println(localHost); // PC 이름// IP 주소
				System.out.println(localHost.getHostName());
				System.out.println(localHost.getHostAddress());
				
				System.out.println("===================");
				/*
				 * 도메인네임을 통해서 서버컴퓨터와 관련된 정보를 얻어 낼 수있음
				 * DomainName : 사용자가 서비스를 이용할 때 서버의 IP주소를 외우기 어려우니까
				 * 				외우기 쉬운구조로 사용자에게 제공되는 이름
				 * 
				 * www.google.com -> hosts파일 -> DNS
				 * google 서버의 IP 주소를 가지고 웹서버로 HTTP(s) 요청
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
			 * 현재 구동중인 서버가 존재한다면 클라이언트는 언제든 서버로 요청을 보낼 수 있음
			 * => 무조건 응답 결과를 돌려 주어야함
			 * 
			 * request 과 response 으로 프로그램이 통신(동작) 함 
			 * 웹에서의 통신 방식 : Hyper Text Transfer Protocol Secure
			 * https
			 * 
			 */
			
			/*
			 * 순수 자바만을 사용해서 클라이언트와 서버의 간단한 통신해보기
			 * 
			 * 소캣(Socket)
			 * 
			 * Process(프로그램이 메모리에 적재된 상태) 간의 통신을 담당
			 * 
			 */
			
			// 자바로 작업해서 나온 결과물 => 소스코드(Source Code)
			// 소캣 통신 
			


	}

}
