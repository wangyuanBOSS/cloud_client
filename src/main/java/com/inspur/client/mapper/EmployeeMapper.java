package com.inspur.client.mapper;


import com.inspur.client.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//@Mapper或者@MapperScan将接口扫描装配到容器中
@Mapper
public interface EmployeeMapper {
    @Select("select house from employee where lastName=#{lastName}")
    public Employee getEmpById(String lastName);

}
