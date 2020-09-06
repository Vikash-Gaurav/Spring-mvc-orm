# Case Study – PreReq for PRMC2

#  Developing Web MVC applications using Spring

# Problem Statement
FieldSpot is a product development organization.  As a part of their employee recreation policy, the HR department of FieldSpot want to conduct recreational games for their employees.
All the employees should form teams and send their details.  The team size may be 1, 2, 4, 6, or 11. The team size will be different for different games (for example chess, carroms, TT, volleyball, cricket and so on). Based on teams, the HR department will conduct matches.  
The HR department of FieldSpot has already carried out such activities multiple times.
They stored all these information in the form of excel sheets.  But gradually they noticed a sharp increase in the the number of participants, teams, and matches.  They are also receiving multiple queries from participants and teams, such as:  
    • When are matches scheduled for my team?
    • What are all other matches are going on?
    • Show the list of matches my team is going to play, and so on 
The HR have realized that it is extremely difficult to manage these recreational operations manually in excel sheet and therefor have planned to digitize its operation in a phased manner.

# Proposed Solution
In the first phase, they wanted to complete registration of individual players so that registration can be closed.
In the second phase, will build the teams (group of players).

# High Level Requirements
FieldSpot HR(admin) team will add player information and team information.

Admin can view the registered list of players and form teams. Admin should authenticate first and then should form teams with maximum of 11 players in each team. Registration of players should be closed once the team is formed. A player cannot re register if he has been already allotted to a team by the admin. Admin stores the player team information formed. 

All layers of the application should be tested by writing automated test cases.
To reduce redundant calls to the database, the Development Team should implement caching at the service layer for reducing the load as well as improving the response time of queries.
To make the API robust, the Development Team should handle the exceptions and errors that can occur in the application.
Logs are essential data that an application generates during its lifetime. Logs provide invaluable insights on how the application is working. Hence, logging will have to be implemented and aggregated.

There is only one role i.e., Admin in  this application. Activities are performed based on their role:
 
    • Admin : Manage player details, team details and allot the registered players to teams



# Tech Stack

* Java 11
• Spring Framework 5
* Spring Boot
• Embedded database / MySQL
• JUnit 5 and Mockito
• Logback

User Stories :




    • As an admin, I can add team, add player to team so that games can be played.
    • As an admin, i can view all the registered players so that i can edit the details when required
    • As an admin, I can allot the players to the team based on the availability so that each team can have a maximum of eleven players only.



# Milestones 

# Milestone 2: Building Spring MVC with ORM  for Player and Team Module (Approx. 4 hours)

* Step 1 : Define Web mvc configuration and application context
* Step 2 : Define datasource properties
* Step 3 : Define the domain objects
* Step 4 : Implement the DaoImpl for all the modules 
* Step 5 : Write Junit Testcases for all Daos and test it.
• Step 6 : Implement the ServiceImpl for all the modules.
* Step 7 : Write Junit Testcases for all Daos and test it( Mock the data)
* Step 8 : Define the controller for all the modules 
* Step 9 : Log all the activities performing on all the modules
* Step 10 : Write Junit Testcases for all Daos and test it( Mock the data)
* Step 11 : Perform CRUD operations on team and player modules(through UI)
      


      
