package com.kh.chap03.model.vo;

/*
 * import java.lang.*;
 * �̰� �����Ǿ��ִ°���
 * 
 */

public class LastTime extends Object {
	
	// ��� Ŭ������ �ֻ��� �θ�Ŭ���� => Object => �������� 
	
	private String name;
	
	public LastTime() {
		//super()  �̰͵� �����Ǿ��ִ� ����
	}
	
	public LastTime(String name) {
		//super() 
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//return;
	}



/*
 *  Overriding
 *  
 *  - ��ӹް� �ִ� �θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ�������� ������ (�ٽþ�) �ϴ� ��
 *  - �θ�Ŭ������ �����ϰ� �ִ� �޼ҵ带 �ڽ��� ���ļ� ����ϰڴٴ� �ǹ�
 *  - �ڽ�Ŭ������ �����ϴ� �������̵� �� �޼ҵ尡 �켱���� ������ ȣ��ǰ� ��
 *  
 *  �������̵� ��������
 *  1. �θ� �޼ҵ�� �޼ҵ� ���� ��Ȯ�ϰ� ����
 *  2. �Ű������� �ڷ���, ����, ������ ���� (��������� ������)
 *  3. ��ȯ���� ����
 *  
 *   *** �������̵� �� �޼ҵ忡�� �ݵ�� @Override �ֳ����̼��� �ٿ�����
 *   @Override 
 *   annotation
 */
	
	@Override
	public String toString() {
		return "����";
	}
	
}
