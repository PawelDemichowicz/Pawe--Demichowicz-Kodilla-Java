package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeTest {

    @Autowired
    private CompanyFacade companyFacade;

    @Autowired
    private CompanyDao companyDao;

    @Test
    public void shouldFetchCompanies(){
        //Given
        Employee employee1 = new Employee("Jan","Nowak");
        Employee employee2 = new Employee("Marek","Kowalski");
        Employee employee3 = new Employee("Filip","Malinowski");

        Company company1 = new Company("Amazon");
        Company company2 = new Company("Google");
        Company company3 = new Company("Allegro");

        employee1.getCompanies().add(company3);
        employee2.getCompanies().add(company2);
        employee3.getCompanies().add(company1);

        company1.getEmployees().add(employee3);
        company2.getEmployees().add(employee2);
        company3.getEmployees().add(employee1);

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        //When
        List<Company> companies = companyFacade.searchCompaniesByName("am");
        List<Employee> employees = companyFacade.searchEmployeesByName("ow");

        //Then
        Assert.assertEquals(3,employees.size());
        Assert.assertEquals(1,companies.size());
    }
}
