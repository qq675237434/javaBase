package com.yi.design.builder.example1;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		Builder builder = new Builder();
		//批量构建 MailSends
		List<Sender> mailSender = builder.buildMailSender(10);
		
		//批量构建SmsSender
		List<Sender> SmsSender = builder.buildSmsSender(10);
		
		for(Sender s : mailSender){
			s.send("");
		}
		
		for(Sender s : SmsSender){
			s.send("");
		}
	}

}
