/*
 * package com.yash.service;
 * 
 * import static org.assertj.core.api.Assertions.assertThat; import static
 * org.junit.Assert.assertThat; import static
 * org.junit.jupiter.api.Assertions.assertEquals; import static
 * org.mockito.Mockito.times; import static org.mockito.Mockito.verify; import
 * static org.mockito.Mockito.when;
 * 
 * import java.util.Optional; import java.util.stream.Collectors; import
 * java.util.stream.Stream;
 * 
 * import org.junit.jupiter.api.Test; import org.junit.runner.RunWith; import
 * org.mockito.Mockito; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.boot.test.mock.mockito.MockBean; import
 * org.springframework.test.context.junit4.SpringRunner;
 * 
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @SpringBootTest(classes = {EmployeeService.class,EmployeeServiceImpl.class})
 * public class EmployeeServiceTest {
 * 
 * 
 * @MockBean EmployeeDao empdao;
 * 
 * @Autowired EmployeeService employeeservice;
 * 
 * @SuppressWarnings("unlikely-arg-type")
 * 
 * @Test void getEmployee() {
 * 
 * when(empdao.findById(101)).thenReturn(Optional.ofNullable(new Employee(101,
 * "Deepika Salve"))); equals(employeeservice.getEmployee(101));
 * 
 * }
 * 
 * @Test void getAllEmployee() {
 * 
 * when(empdao.findAll()).thenReturn(Stream .of(new Employee(101,
 * "Deepika Salve")).collect(Collectors.toList())); assertEquals(1,
 * employeeservice.getAllEmployee().size());
 * 
 * }
 * 
 * @Test public void addEmployee() { Employee emp = new
 * Employee(102,"Shreya Tapdiya"); when(empdao.save(emp)).thenReturn(emp);
 * assertEquals(emp, employeeservice.addEmployee(emp)); }
 * 
 * @Test public void modifyEmployee() { Employee emp = new
 * Employee(101,"surbhi Tapdiya");
 * 
 * Mockito.when(empdao.save(emp)).thenReturn(emp);
 * assertThat(employeeservice.addEmployee(emp)).isEqualTo(emp); }
 * 
 * 
 * @Test public void removeEmployee() { Optional<Employee> emp =
 * Optional.ofNullable(new Employee(101,"Deepika Salve")); Employee e =new
 * Employee(101, "Deepika Salve"); //when(empdao.findById(101)).thenReturn(emp);
 * when(employeeservice.getEmployee(101)).thenReturn(e);
 * //when(empdao.delete(101)); employeeservice.removeEmployee(101);
 * verify(empdao, times(1)).delete(e); }
 * 
 * }
 */