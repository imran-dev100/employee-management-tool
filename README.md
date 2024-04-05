<br />
<div>
  <a href="https://github.com/imran-dev100/employee-management-tool/blob/main/src/main/resources/join_raisin_linkedIn.jpeg">
    <img  style="float: right;"  src="src/main/resources/join_raisin_linkedIn.jpeg" alt="Logo" top="0" left="0">
  </a>
</div>

<!-------------------------------------------------------BADGES----------------------------------------------------------->

<br/>

![build][build]
![Coverage][coverage]
![version][version]
![license][license]
![repository][repository]
[![contributors][contributors]][developers]


<br/>
<!------------------------------------------------------PROJECT----------------------------------------------------------->

### Coding Challenge Solution

[![coding_challenge](https://img.shields.io/badge/Coding_Challenge-58D68D)](https://github.com/raisin-recruiting/Imran-Ansari---Technical-challenge/blob/master/README.md)

This project contains a solution for the assignment delivered by the Talent Acquisition Manager.

<br/>
<!---------------------------------------------------PREREQUISITES-------------------------------------------------------->

### Prerequisites

<table>
   <tr>
      <td><a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a></td>
      <td><a>Git</a></td>
   </tr>
   <tr>
      <td><a href="https://www.oracle.com/in/java/technologies/downloads/#java17" target="" rel="noreferrer"> 
            <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/></a></td>
      <td><a>Java 17.0.10</a></td>
   </tr>
   <tr>
      <td><a href="https://maven.apache.org/" target="_blank" rel="noreferrer"> <img src="https://res.cloudinary.com/canonical/image/fetch/f_auto,q_auto,fl_sanitize,w_60,h_60/https://dashboard.snapcraft.io/site_media/appmedia/2024/03/maven.png" alt="maven" width="40" height="40"/></a> 
      </td>
      <td><a>Maven 3.9.5</a></td>
   </tr>
   <tr>
      <td><a href="https://spring.io/" target="_blank" rel="noreferrer"><img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="40" height="40"/> </a></td>
      <td><a>Spring 3.2.4</a></td>
   </tr>
</table>
 
<br/>

<!--------------------------------------------------GETTING STARTED------------------------------------------------------->

### Getting started

- Clone the branch on your Linux or MacOS system using the terminal.
  
     ```
        git clone -b <branch> <repo>
     ```
- Configure desired logs path on line 14 in **_application.yml_**[^1] by using vi or any other editor.

     ```
        vi application.yml
     ```

     **_OR_**
     <br />
     <div>
      <a href="https://github.com/imran-dev100/employee-management-tool/blob/main/src/main/resources/application.yml">
      <img  style="float: right;"  src="src/main/resources/Screenshot%20from%202024-04-05%2019-18-05.png" alt="Logo" top="0" left="0">
      </a>
      
     </div>
     <br/>
      
     > NOTE: To ensure log generation, kindly adjust the directory's file permissions accordingly.
      <br/>
      <br/>
  
- Then, move to the project directory **_/Imran-Ansari---Technical-challenge_**.

     ```
        cd Imran-Ansari---Technical-challenge
     ```

- According to the challenge instructions, execute the appropriate Python script to host the endpoints on port 7299 by utilizing the corresponding fixture file in a terminal.

     ```
        python3 fixture_3.py
     ```

- Now, open a new terminal window and navigate to the solution directory of the project located at **_/Imran-Ansari---technical-challenge/solution_** to run the program.

     ```
        cd Imran-Ansari---Technical-challenge/solution
     ```

- Run the program using the **_maven_** command specified below.

     ```
        mvn spring-boot:run
     ```

<br/>

<!--------------------------------------------------CHECK THE COUNT------------------------------------------------------->

### How to check the count between the process

* From the directory **_/Imran-Ansari---Technical-challenge_** and run below commands.
    - For checking the expected count.

        ```
           cat expected.txt | wc -l
        ```
    - For checking the submitted count.

        ```
           cat submitted.txt | wc -l
        ```
<br/>

<!-------------------------------------------------------TESTS------------------------------------------------------------>

### Tests

- Open the directory **_/Imran-Ansari---Technical-challenge/solution_** and run below command.
```
   mvn test
```

<br/>

<!-------------------------------------------------------CREDITS------------------------------------------------------------>


### Credits
The solution module is developed by [Imran Ansari](https://github.com/imran-dev100).

<br/>

<!-------------------------------------------------------LICENSE------------------------------------------------------------>


### License

Distributed under the MIT License. See [MIT©Imran Ansari](LICENSE) for more information.

<br/>

<!---------------------------------------------------------TIP-------------------------------------------------------------->
> [!TIP]
> Try executing the program from multiple terminals rather than from IDE for better performance and longer run.

<!------------------------------------------------------FOOTNOTES----------------------------------------------------------->

[^1]: Filepath :- /Imran-Ansari---Technical-challenge/solution/src/main/resources/application.yml
<!-----------------------------------------------------BADGES URL----------------------------------------------------------->

[build]:  https://img.shields.io/badge/build-passing-blue
[coverage]: https://img.shields.io/badge/coverage-100-bright_green
[version]: https://img.shields.io/badge/version-1.0-2E86C1
[license]: https://img.shields.io/badge/license-MIT-8E44AD
[repository]: https://img.shields.io/badge/repository-private-0E6655
[contributors]: https://img.shields.io/badge/contributors-1-6E2C00

[developers]: https://github.com/imran-dev100/employee-management-tool/graphs/contributors
<br/>
<!------------------------------------------------------------------------------------------------------------------------->



<!----------------------------------------------------------EOF------------------------------------------------------------>
