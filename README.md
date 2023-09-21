# APIautomation
->Coding Language- Java with TestNG
->POM Tool-Maven
->API Testing-Rest Assured Library

1.Test File->This is having test classes along with test method with @test annotation which contains logic as well as assertion for verification.I have used a for loop to traverse through records.
[Reference Path-mavenproject/src/test/java/com/apitest/mavenproject/AppTest.java]
2.POM.XML file->This contains dependencies for rest assured ,testNG and json data fetching dependencies.
3.mavenproject/test-output/emailable-report.html:This contains the output of the run results.

**How to run the code**:**

**Approach 1-**
Via pom.xml: Right click on file and run as Maven test.We should be able to see the build success and the output printed on console as well.

**Approach 2-**
Go to file Apptest.java ,run as Maven test.

**OR**

testNG route: Go to file Apptest.java ,run as testNG test.Post this refresh the project and you will be able to see a file generated in test-output folder with name emailable-report.html.Open this and you should be able to see the pass result.

Thank You.

