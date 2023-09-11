package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.spring.Employee;

public class EmployeeClient 
{
	public static void main(String a[])
	{
		Resource resourse=new FileSystemResource("EmployeeCfg.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resourse);
		Employee emp = (Employee)beanFactory.getBean("employee");
		System.out.println(emp);
		
		
		
	}

}
