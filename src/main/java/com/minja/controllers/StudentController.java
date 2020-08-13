package com.minja.controllers;

import java.io.IOException;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.minja.entities.Student;
import com.minja.services.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String hello() {
		return "Spring Boot Works.";
	}

	@RequestMapping(value = "/rest/student/getall", method = RequestMethod.GET)
	public Collection<Student> getStudents() throws IOException {
		return studentService.getStudents();
	}

	@RequestMapping(value = "/rest/student/insert", method = RequestMethod.POST)
	public Student insert(@RequestBody Student s) {
		return studentService.insert(s);
	}

	@RequestMapping(value = "/rest/student/update", method = RequestMethod.PUT)
	public Student update(@RequestBody Student s) {
		return studentService.update(s);
	}

	@RequestMapping(value = "/rest/student/delete/{id}", method = RequestMethod.DELETE)
	public boolean delete(@PathVariable Long id) {
		return studentService.delete(id);
	}

	@RequestMapping(value = "/rest/student/getByIme/{ime}", method = RequestMethod.GET)
	public Collection<Student> getByIme(@PathVariable String ime) throws IOException {
		return studentService.findByImeLike(ime);
	}

}
