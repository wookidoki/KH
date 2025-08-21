package com.kh.chap05.model.vo;

public abstract class  Music implements MusicI{
	
	// Ŭ���̾�Ʈ�� �䱸���׿� ���� ��ȹ �� ����
	private String title;
	private String runningTime;
	private String author;
	
	public Music() {
		
	}
	
	public Music(String title, String runningTime, String author) {
		this.title =title;
		this.runningTime =runningTime;
		this.author =author;
	}

	
	public String getTitle() {
		return title;
	}
	public String getRunningTime() {
		return runningTime;
	}
	public String getAuthor() {
		return author;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setRunningTime(String runningTime) {
		this.runningTime = runningTime;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public void stop() {
		System.out.println("Stop Music");
	}

		
	

}
