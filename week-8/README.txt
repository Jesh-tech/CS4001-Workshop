Workshop Question:

Task 1: Update Student.java to include:
• Constructor to initialize all attributes
• Method: displayInfo() – displays student details
• Method: isAdult() – returns true if age ≥ 18
• Method: updateGrade(double grade) – adds grade to student
• Override toString() method


Task 2: Create StudentTester.java
• Test all methods with different student objects
• Demonstrate constructor overloading (create 2+ constructors)
Task 3: Method Descriptions
• Write detailed descriptions for each method
• Include: purpose, parameters, return type, example usage


Scenario: Fitness Nepal Gym, Dharan
A local gym, "Fitness Nepal" in Dharan, needs a membership management system.
Create "GymMemberNepal.java" class:
• Attributes: memberName, membershipType (Monthly, Quarterly, Yearly),
monthlyFee, joinDate
• Constructor to initialize all attributes
• Methods:
calculateAnnualFee() – returns yearly cost with Nepali tax (13% VAT)
getDiscountedFee(double discountPercent) – returns discounted
monthly fee for students/seniors
isEligibleForDiscount() – returns true if member for >6 months (loyalty
discount)
displayMemberInfo() – shows formatted member details in Nepali style
• Test with different membership types: Basic (Rs. 1500), Premium (Rs. 2500),
VIP (Rs. 4000)
