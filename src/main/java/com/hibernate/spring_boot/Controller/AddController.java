package com.hibernate.spring_boot.Controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hibernate.spring_boot.Model.Sanpham;
import com.hibernate.spring_boot.Model.SpReponsitory;

@Controller
@RequestMapping("/add")
public class AddController {
	
	@Autowired
	SpReponsitory spRe;
	
	@PersistenceContext
	EntityManager entt;
	
	@GetMapping
	public String homeUp() {
		return "add";
	}
	
	@PostMapping
	public String homeUp1(@RequestParam String firstname, @RequestParam String add) {
		System.out.println(firstname + "----" + add);
		Sanpham sp = new Sanpham();
		sp.setAddress(add);
		sp.setName(firstname);
		spRe.save(sp);
		return "redirect:./";
	}
}
