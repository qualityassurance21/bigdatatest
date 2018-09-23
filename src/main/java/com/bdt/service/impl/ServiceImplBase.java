package com.bdt.service.impl;

import com.bdt.dao.DAOBase;
import com.bdt.service.ServiceBase;

import java.util.List;

public abstract class ServiceImplBase<T, K> implements ServiceBase<T, K> {

	public int save(T entity) {
		return getDAO().save(entity);
	}

	public T get(K key) {
		return getDAO().get(key);
	}

	public int count(T example) {
		return getDAO().count(example);
	}

	public List<T> query(T example) {
		return getDAO().query(example);
	}

	public List<T> queryAll() {
		return getDAO().queryAll();
	}

	public int update(T entity) {
		return getDAO().update(entity);
	}

	public int delete(K key) {
		return getDAO().delete(key);
	}

	protected abstract DAOBase<T, K> getDAO();
}