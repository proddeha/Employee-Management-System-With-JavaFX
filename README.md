# Employee Management System

## Overview

Employee Management System is a Java application designed to streamline the management of employees. It allows for the addition, logical deletion, and management of employee records, work hours, days off, and salary calculations . The application can also export data in PDF and Excel formats, making it a comprehensive tool for HR departments.

## Features

- **Employee Management:**
  - Add new employees to the system.
  - Logically delete employees while retaining their records for historical data.
  - Update employee information as needed.
- **Work Hours and Days Off:**
  - Track employee work hours on a daily basis.
  - Manage employee days off and categorize different types of leave.
- **Salary Calculation:**
  - Automatically calculate salaries based on work hours and other criteria.
  - Generate detailed salary reports for employees.
- **Data Export:**
  - Export employee data, work hours, and salary reports in PDF format.
  - Export data in Excel format for further analysis and record-keeping.
- **Database Integration:**
  - Connects to a MySQL database to manage and store all employee-related data.
  - Perform updates, deletions, and inserts directly in the database.

## Technologies Used

- **Programming Language:** Java
- **Frameworks and Libraries:**
  - JavaFX for the graphical user interface.
  - Apache POI for Excel export.
  - iText for PDF generation.
- **Database:** MySQL 
- **Development Tools:** Apache NetBeans
## Usage

- **Launching the Application:**
  - Start the application from your IDE .
  - You will be greeded with the login Page 
  ![image](https://github.com/proddeha/Employee-Management-System-With-JavaFX/assets/119131830/741840f5-27d5-4ffe-a1bd-6b7d6f7f9581)

- **Managing Employees:**
  ![image](https://github.com/proddeha/Employee-Management-System-With-JavaFX/assets/119131830/bffc0bbd-ee4e-4a54-8e07-8561d753965f)
  - After completing the login , you will be in the heart of the program where you can select everything you want to See but also Change about your employees.
  - All of the Applications' Texts are written in greek-lish but bare with me , i'll try to translate as much as possible incase you are not Greek.


- **Information And Details Managment**
![image](https://github.com/proddeha/Employee-Management-System-With-JavaFX/assets/119131830/c214cdfa-70d5-4571-84bf-2a254f29bbac)

  - The Employee Details Management page allows for efficient handling of employee records. Users can search for specific employees, filter records based on various criteria, and perform key actions such as adding, updating, and logically deleting records.
  - A search bar where users can enter the employee's tax identification number (AFM) to look up specific employee records.
  - A dropdown menu for selecting the search filter criteria, allowing users to search by various attributes such as AFM.
  - **Employee Information Display:**
    - View detailed employee information including names, social security number, address, emails, marital status, number of children, job position, and employment status.
  - **Actions:**
    - **Addition:** Add new employee records.
    - **Update:** Modify existing employee records.
    - **Delete:** Logically delete employee records, preserving historical data.
  
 
   In summary , this page is a crucial part of the Employee Management System, ensuring that all employee information is easily accessible and manageable.
  
- **Salary Calculation and Reporting:**
  
  ![image](https://github.com/proddeha/Employee-Management-System-With-JavaFX/assets/119131830/dcfe303a-7c7e-4842-88a3-81c1f2346e9d)
  
- **Search and Filter:**
  - Search by tax identification number (AFM).
  - Filter records by employee ID, salary type, and daily work hours.

- **Salary Information Display:**
  - View detailed salary information including employee ID, salary type, monthly work hours, current salary rate, monthly work days, and monthly salary.

- **Actions:**
  - **Addition:** Add new salary records.
  - **Update:** Modify existing salary records.
  - **Delete:** Logically delete salary records, preserving historical data.
   
This page is a crucial part of the Employee Management System, ensuring that all salary-related information is easily accessible and manageable.

- **Payroll Management:**
  
  ![image](https://github.com/proddeha/Employee-Management-System-With-JavaFX/assets/119131830/438df6d7-8f2a-4545-bb62-94f7e1089b3c)
- **Search and Filter:**
  - Search by payroll record ID (MisthodosiaID).
  - Filter records by various criteria such as payroll ID.

- **Export Options:**
  - Export payroll data to Excel for further analysis and record-keeping.
  - Export payroll data to PDF for easy sharing and documentation.

- **Payroll Information Display:**
  - View detailed payroll information including payroll ID, employee ID, payroll date, salary amount, days of leave, sick days, and unpaid leave days.

- **Actions:**
  - **Addition:** Add new payroll records.

This page is a crucial part of the Employee Management System, ensuring that all payroll-related information is easily accessible and manageable.


- **Phone Number Management**
![image](https://github.com/proddeha/Employee-Management-System-With-JavaFX/assets/119131830/4bb163dc-3759-4e1d-ba4f-bb0342fe8cea)

- **Search and Filter:**
  - Search by tax identification number (AFM).
  - Filter records by phone number ID, phone type, and other criteria.

- **Phone Number Information Display:**
  - View detailed phone number information including phone number ID, employee ID, phone type, and phone number.

- **Actions:**
  - **Addition:** Add new phone number records.
  - **Update:** Modify existing phone number records.
  - **Delete:** Logically delete phone number records, preserving historical data.

This page is a crucial part of the Employee Management System, ensuring that all phone number-related information is easily accessible and manageable.

- **Absence Management**
  
  ![image](https://github.com/proddeha/Employee-Management-System-With-JavaFX/assets/119131830/c1a87dc8-bef9-478f-a0bf-9f9ff3e8a8d6)

  - **Search and Filter:**
  - Search by tax identification number (AFM).
  - Filter records by absence ID, type of absence, and other criteria.

- **Absence Information Display:**
  - View detailed absence information including absence ID, employee ID, type of absence, start date, end date, and total days of absence.

- **Actions:**
  - **Addition:** Add new absence records.
  - **Update:** Modify existing absence records.
  - **Delete:** Logically delete absence records, preserving historical data.

This page is a crucial part of the Employee Management System, ensuring that all absence-related information is easily accessible and manageable.

## Installation

1. **Download the files Or Clone the repository:**

2. **Open the project in your preferred Java IDE:**
    - IntelliJ IDEA
    - Eclipse
    - Apache NetBeans

3. **Import Or Build the project:**


4. **Set up the database:**
    - Ensure your SQL database server is running.
    - Create the Schema `proodos` and run the SQL files.

5. **Configure database connection:**
    - Update the database connection settings in the application.

6. **Run the application:**



## Contact

For any questions or inquiries, please contact at [kwstas.koulai@yahoo.com].
