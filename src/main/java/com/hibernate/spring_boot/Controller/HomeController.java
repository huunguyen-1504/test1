package com.hibernate.spring_boot.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hibernate.spring_boot.Model.Sanpham;
import com.hibernate.spring_boot.Model.SpReponsitory;

@Controller
@RequestMapping("/")
public class HomeController {
	@Autowired
	private SpReponsitory spReponsitory;
	
	@GetMapping({"home",""})
	public String getAllSp(ModelMap modelMap){
		List<Sanpham> list = new ArrayList<>();
		list = (List<Sanpham>) spReponsitory.findAll();
		modelMap.addAttribute("list", list);
		return "home";
	}
	 
	/*
	 * @GetMapping("/add") public String addSP() { return "update"; }
	 */
	/*
	 * @GetMapping("/upadate")
	 * 
	 * @ResponseBody public String updateSP() { Sanpham sp = new Sanpham();
	 * sp.setId(3); sp.setAddress("Hà nội"); sp.setName("Test 2");
	 * spReponsitory.save(sp); System.out.println("Dang sửa ...");
	 * System.out.println(sp.getAddress()+sp.getName()); return "Done"; }
	 */
	
	@GetMapping("/del/{id}")
	public String del(@PathVariable int id) {
		Sanpham sp = new Sanpham();
		sp.setId(id);
		spReponsitory.delete(sp);
		return "redirect:../home";
	}
	
}
