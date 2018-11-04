package com.slokam.healthcare.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.Dao.MedicineDao;
import com.slokam.healthcare.entity.Medicine;
@RestController
public class MedicineController {
	@Autowired
	private MedicineDao medicinedao;
	@RequestMapping("saveMedicine")
	public void saveMedicine(@RequestBody Medicine medicine){
		medicinedao.save(medicine);
	}
	

}
