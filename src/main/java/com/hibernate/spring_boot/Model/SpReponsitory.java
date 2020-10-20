package com.hibernate.spring_boot.Model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SpReponsitory extends CrudRepository<Sanpham, Integer>{
	public List<Sanpham> findByName(String name);
}
