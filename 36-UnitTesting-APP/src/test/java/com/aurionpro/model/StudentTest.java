package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class StudentTest {
	private IStudentService studentService;
	private Student student;

	@BeforeEach
	public void init() {
		studentService = Mockito.mock(IStudentService.class);
		student =  new Student(studentService);
	}

	@Test
	void testCalculatePercentage() {
		
		
		Mockito.when(studentService.getTotalMarks()).thenReturn((double) 650);
		Mockito.when(studentService.numberOfSubjects()).thenReturn(10);
		
		assertEquals(65, student.calculatePercentage());
	}

}
