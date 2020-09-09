package com.loserico.common.lang.exception;

import com.loserico.common.lang.vo.ErrorType;

import java.util.ArrayList;
import java.util.List;

/**
 * 通用业务异常
 * <p>
 * Copyright: (C), 2020/5/17 19:11
 * <p>
 * <p>
 * Company: Sexy Uncle Inc.
 *
 * @author Rico Yu ricoyu520@gmail.com
 * @version 1.0
 */
public class BusinessException extends RuntimeException {
	
	private String code;
	
	private String msgTemplate;
	
	private String message;
	
	private List<Object> messageParams = new ArrayList<>();
	
	public BusinessException() {
	}
	
	public BusinessException(ErrorType errorType) {
		super(errorType.getMsg());
		this.code = errorType.getCode();
		this.msgTemplate = errorType.getMsgTemplate();
		this.message = errorType.getMsg();
	}
	
	public BusinessException(String code, String message) {
		super(message);
		this.code = code;
		this.message = message;
	}
	
	public BusinessException(String code, String messageTemplate, String defaultMesssage) {
		this.code = code;
		this.msgTemplate = messageTemplate;
		this.message = defaultMesssage;
	}
	
	public BusinessException(String code, String messageTemplate, List<Object> messageParams, String defaultMesssage) {
		this.code = code;
		this.msgTemplate = messageTemplate;
		this.messageParams = messageParams;
		this.msgTemplate = messageTemplate;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMsgTemplate() {
		return msgTemplate;
	}
	
	public void setMsgTemplate(String msgTemplate) {
		this.msgTemplate = msgTemplate;
	}
	
	public List<Object> getMessageParams() {
		return messageParams;
	}
	
	public void setMessageParams(List<Object> messageParams) {
		this.messageParams = messageParams;
	}
	
	
}
