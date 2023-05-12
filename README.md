#  👨‍💻 Challenge 1
    This Compass Internship Challenge Week contains a set of coding challenges designed 
    to test my knowledge and skills in Java and database technologies. The challenges
    cover Data Structure and Object oriented programming with Java,SQL(specifically PostgreSQL),
    and NoSQL( MongoDB) databases. Each challenge is organized within
    its respective folder in the repository.  
  
  
## 📋 Preconditions

    To run the Questions, you must have these tools on your computer:

    * Java with JDK 17
    * MongoDB
    * A RDBMS 
    * A compatible IDE
  

## 🔧 Installation

    In your terminal, locate the folder you wanted to clone the project and type the command:

    ```
    git clone https://github.com/DaviFerreiraLima/Challenge1.git
    ```
    After cloning the project in your folder, access it with the command:
    ```
    cd .\Challenge1\
    ```
## 📂 Project Structure
    Each folder has the name corresponding to the question presented

    📁Question 1 
      
    📁Question 2

    📁Question 3

    📁Question 4

    📁Question 5
    

## 📋Questions Description
  
   ### Question 1

   This question ask to write a java program to recieve a Employee , with salary and name, 
   and return the netSalary and the Bonus or The Discount.
   
    If the user receives up to R$ 1000.00 real, he will receive a 20% bonus. If you
    receive more than 1000 and up to 2000, you receive 10%. If it is above 2000, instead
    of a bonus, the employee will have a 10% discount.
    
   Example 1:
        
            Input:
            Employee: XPTO
            Salary: 1200

            Output:
            Employee: XPTO
            Salary: R$ 1.200,00
            Bonus: R$ 120,00
            Liquid salary: R$ 1.320,00
            
   Example 2:
        
            Input:
            Employee: XPTO
            Salary: 3000

            Output:
            Employee: XPTO
            Salary: R$ 3.000,00
            Discount: R$ 300,00
            Liquid salary: R$ 2.700,00

        
          

   ### Question 2
   
   This Question ask to write a java program that receive a phrase and return the mood from that input.
   
    The mood is defined by symbols was written in the phrase.
        * This symbol " :-) " means amused.
        * This symbol ":-( " means annoyed.
    If have more symbols of "amused", the return will be fun.
    If have more symbols of "annoyed", the return will be upset.
    If the quantity of both symbols are the same, the return will 
    be neutral.
    
   Example 1

      Input:
      I hope everything is alright :-) 
      
      Output:
      fun
      
   Example 2:
   
      Input:
      I found the film very entertaining. 
      
      Output:
      neutral
      
   Example 3:
   
      Input:
      :-) :-( :-( :-)
      
      Output:
      neutral
      
    Example 4:
    
      Input:
      I dreamed about the test :-( ( I'm going to
      study)
      
      Output:
       upset

   ### Question 3
   This Question ask to write a java program that create a Quiz that
      ask some questions to the user and he will answer with yes or no.. At the final
      of the quiz, will be informed the quantity of the rights and the
      wrongs of the User.
      
   Example 1
   
    input:
    User: XPTO
    
    // Questions Answered
    
    Output
    User XPTO
    right: 6
    wrong:4
      

   ### Question 4
        This question ask to create a SQL script that contains two tables: Person and Address.
        The Table person must contain, beyond it's fields, the 
        address_id  that will reference the addressId From the
        Address Table.

   ### Question 5
        This question ask to create a script for MongoDB 
        that cotains a Person document.
    