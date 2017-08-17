package generics.problems.paraminterf;

interface Payable<T> {}

class Employee implements Payable<Employee> {}

//public class Hourly extends Employee implements Payable<Hourly> {}
