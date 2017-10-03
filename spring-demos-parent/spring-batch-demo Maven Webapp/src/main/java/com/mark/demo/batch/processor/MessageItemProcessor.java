package com.mark.demo.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.mark.demo.batch.entity.Message;
import com.mark.demo.batch.entity.ProcessedMessage;

/*
*hxp(hxpwangyi@126.com)
*2017Äê10ÔÂ3ÈÕ
*
*/
public class MessageItemProcessor implements ItemProcessor<Message,ProcessedMessage> {

	public ProcessedMessage process(Message message) throws Exception {
		return null;
	}

}
