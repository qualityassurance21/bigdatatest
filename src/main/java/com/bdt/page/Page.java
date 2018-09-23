package com.bdt.page;

import java.io.Serializable;

public class Page implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1631920373937663256L;
	// 数据总条数
	private int total_sum;
	// 页数（第几页）
	private int current_page;

	private int current_page_begin;

	private int current_page_end;
	// 总页数
	private int total_page;
	// 每页显示条数
	private static int page_size = 10;

	public int getTotal_sum() {
		return total_sum;
	}

	public void setTotal_sum(int total_sum) {
		this.total_sum = total_sum;
	}

	public int getCurrent_page() {
		return current_page;
	}

	public void setCurrent_page_begin(int current_page_begin) {
		this.current_page_begin = current_page_begin;
	}

	public void setCurrent_page_end(int current_page_end) {
		this.current_page_end = current_page_end;
	}

	public void setCurrent_page(int current_page) {
		this.current_page = current_page;
	}

	public int getTotal_page() {
		return total_page;
	}

	public void setTotal_page(int total_page) {
		this.total_page = total_page;
	}

	public Page() {

	}

	public int getCurrent_page_begin() {
		return current_page_begin;
	}

	private void setCurrent_page_Index(int current_page) {
		if (current_page <= 1) {
			current_page = 1;
		}
		if (current_page >= this.total_page) {
			current_page = this.total_page;
		}
		setCurrent_page(current_page);
		if (this.total_page == 0) {
			this.current_page_begin = -1;
			this.current_page_end = -1;
		} else {
			this.current_page_begin = (current_page - 1) * page_size;
			if (((current_page - 1) * page_size + (page_size - 1)) < this.total_sum) {
				this.current_page_end = (current_page - 1) * page_size + (page_size - 1);
			} else {
				this.current_page_end = this.total_sum - 1;
			}
		}
	}

	private void setCurrent_page_Index(int current_page, int page_size) {
		if (current_page <= 1) {
			current_page = 1;
		}
		if (current_page >= this.total_page) {
			current_page = this.total_page;
		}
		setCurrent_page(current_page);
		if (this.total_page == 0) {
			this.current_page_begin = -1;
			this.current_page_end = -1;
		} else {
			this.current_page_begin = (current_page - 1) * page_size;
			if (((current_page - 1) * page_size + (page_size - 1)) < this.total_sum) {
				this.current_page_end = (current_page - 1) * page_size + (page_size - 1);
			} else {
				this.current_page_end = this.total_sum - 1;
			}
		}
	}

	public int getCurrent_page_end() {
		return current_page_end;
	}

	public Page(int total_sum, int current_page) {
		this.total_sum = total_sum;
		if (total_sum <= 0) {
			this.total_page = 0;
		} else if (total_sum / page_size == 0) {
			this.total_page = 1;
		} else {
			if (total_sum % page_size == 0) {
				this.total_page = total_sum / page_size;
			} else {
				this.total_page = (total_sum / page_size) + 1;
			}
		}
		setCurrent_page_Index(current_page);
	}

	public Page(int total_sum, int current_page, int page_size) {
		this.total_sum = total_sum;
		if (total_sum <= 0) {
			this.total_page = 0;
		} else if (total_sum / page_size == 0) {
			this.total_page = 1;
		} else {
			if (total_sum % page_size == 0) {
				this.total_page = total_sum / page_size;
			} else {
				this.total_page = (total_sum / page_size) + 1;
			}
		}
		setCurrent_page_Index(current_page, page_size);
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		return buffer.append("total_sum ").append(this.total_sum).append(", current_page ").append(this.current_page)
				.append(", total_page").append(this.total_page).toString();
	}
}