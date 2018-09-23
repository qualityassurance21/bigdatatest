package com.bdt.service;

import java.util.List;

public interface ServiceBase<T, K> {

	public int save(T entity);

	public T get(K key);

	public int count(T example);

	public List<T> query(T example);

	public List<T> queryAll();

	public int update(T entity);

	public int delete(K key);
}
