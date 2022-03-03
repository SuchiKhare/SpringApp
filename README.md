# SpringApp

## Step1:
new maven project
create a simple project skip archtype 
groupId - com.suchi.springboot
artfactid - Spring1

By adding dependencies in pom.xml made the maven project to spring project
how to tell the Spring class start - by annotating @SpringBootApplication

## Step2:
create a controller , mark with @RestConroller
create a method , mark with @RequestMapping("/hello")
  When spring scan classes find the file annotations , it will see the path for http://localhost/hello
  
<img width="438" alt="2" src="https://user-images.githubusercontent.com/90444833/156600010-0cb192d7-e596-4a9c-80db-191d2316e186.png">


