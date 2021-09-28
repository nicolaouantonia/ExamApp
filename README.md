This is a sample Web Application to use during Continuous Integration demos.

#War file creation Instruction

```
mvn clean install
```
#War file deployment in artifactory

```
mvn clean deploy
```


# Will result in CPDOF*******.war creation

#For the exam you have to submit the following
1. Screen shots of three jenkins jobs both the latest build and the main job screenshot is a must. Following needs to be done
a. PMD - code quality
b. Cobertura - code coverage
c. Deployment to local tomcat and docker - through ansible and CI Tool
d. Console output log for the last successful or unsuccessful jobs
