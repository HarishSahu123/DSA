package org.practice.dsa.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class StreamCodingAdvance {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        List < Integer > list = Arrays.asList(1, 3, 6, 8, 10, 18, 36);

        employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
        employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
        employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
        employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
        employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
        employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
        employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
        employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
        employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
        employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
        employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
        employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));


        //1. How many male and female employees are there in the organization ?

        Map<String, Long> collect9 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect9);


        Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect);

        //2.Print the name of all departments in the organization ?

        List<String> collect1 = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
        System.out.println(collect1);

        //3. find 2rd highest salary
        Optional<Employee> first = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()) // sort by salary descending
                .skip(1)   // skip the highest salary
                .findFirst();// pick the next one (2nd highest)

        System.out.println(first);


        //who is oldest employee in orgnazation?

//        1. way
        Optional<Employee> max = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));

        //2 way only salary
        IntSummaryStatistics collect4 = employeeList.stream().collect(Collectors.summarizingInt(Employee::getAge));
        int max1 = collect4.getMax();
        System.out.println(max1);
        max.ifPresent(System.out::println);

//        14.  Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years ?

        long collect2 = employeeList.stream().filter(i -> i.getAge() >= 25).count();
        System.out.println(collect2);

//        13.  What is the average salary and total salary of the whole organization ?

        DoubleSummaryStatistics collect3 = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Avg salary+"+collect3.getAverage());
        System.out.println("Total salary+"+collect3.getAverage());

//        12. List down the names of all employees in each department ?

        Map<String, List<String>> collect10 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(collect10);

//        How many male and female employees are there in the organization ?

        Map<String, Long> collect5 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect5);

        List<Employee> collect6 = employeeList.stream().distinct().collect(Collectors.toList());
        System.out.println(collect6);

        List<Employee> collect7 = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList());
        System.out.println(collect7);

        Optional<Employee> first1 = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
        first1.ifPresent(System.out::println);

        OptionalDouble average = list.stream().mapToDouble(Integer::doubleValue).average();
        System.out.println(Math.round(average.getAsDouble()*100.0)/100.0);

        List<Integer> collect8 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

//        Group employees by department and get the list of employee names sorted alphabetically.
        Map<String , List<String> > EmployenamebyDepartmentInSorting= employeeList.stream().sorted
                (Comparator.comparing(Employee::getName)).collect(Collectors.groupingBy(Employee::getDepartment ,Collectors.mapping(Employee::getName ,Collectors.toList())));
        System.out.println("The"+EmployenamebyDepartmentInSorting);



//                Find department having maximum number of employees.
        Map<String, Long> collect11 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(collect11);


//        Convert employee list into a Map with key = employeeId, value = employeeName.
       Map<Integer,String> employeeidAndName= employeeList.stream().collect(Collectors.toMap(Employee::getId ,Employee::getName));
        System.out.println(employeeidAndName);

//                Join all employee names into a single comma-separated string.
        String collect12 = employeeList.stream().map(Employee::getName).collect(Collectors.joining(","));
        System.out.println(collect12);


//                Find the top 3 highest salaries from the list.
        List<Employee> collect13 = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(collect13);


        //Seconds Highest salary

        List<String> limit = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary )
                .reversed()).skip(1).limit(3).map(Employee::getName).collect(Collectors.toList());
        System.out.println(limit);;











    }







}
