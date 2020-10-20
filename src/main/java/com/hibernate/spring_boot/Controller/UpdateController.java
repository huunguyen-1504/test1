package com.hibernate.spring_boot.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hibernate.spring_boot.Model.Sanpham;
import com.hibernate.spring_boot.Model.SpReponsitory;

@Controller
@RequestMapping("/update")
public class UpdateController {
	
	@Autowired
	SpReponsitory spre;
	
	
	
	@GetMapping("/{id}")
	public String defaultHome(@PathVariable int id, ModelMap modelMap) {
		Optional<Sanpham> sp = spre.findById(id);
		modelMap.addAttribute("up", sp);
		return "update";
	}
	
	@PostMapping("/{id}")
	public String update(@RequestParam int id, @RequestParam String firstname, @RequestParam String add) {
		Sanpham sp = new Sanpham();
		sp.setAddress(add);
		sp.setName(firstname);
		sp.setId(id);
		spre.save(sp);	
		return "redirect:../home";
	}
}
