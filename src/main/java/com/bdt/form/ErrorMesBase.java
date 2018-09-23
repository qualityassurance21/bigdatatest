package com.bdt.form;

import com.bdt.page.Page;


//只有成功/失败状态
public class ErrorMesBase extends Page{

	private static final long serialVersionUID = 4335906807907568053L;

	protected String error_no = "-1";
	protected String error_value = "执行失败";
	protected String error_msg;

	public void setSuccess() {
		this.error_no = "0";
		this.error_value = "执行成功";
	}

	public String getError_msg() {
		return error_msg;
	}

	public void setError_msg(String error_msg) {
		this.error_msg = error_msg;
	}

	public String getError_no() {
		return error_no;
	}

	public void setError_no(String error_no) {
		this.error_no = error_no;
	}

	public String getError_value() {
		return error_value;
	}

	public void setError_value(String error_value) {
		this.error_value = error_value;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		return buffer.append("error_no ").append(this.error_no).append(", error_value ").append(this.error_value)
				.append(", error_msg").append(this.error_msg).toString();
	}
}
