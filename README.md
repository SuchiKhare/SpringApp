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
  When spring scan classes find the file annotations , it will see the path for http://localhost:8080/greet
  
<img width="438" alt="2" src="https://user-images.githubusercontent.com/90444833/156600010-0cb192d7-e596-4a9c-80db-191d2316e186.png">

## Step3:
create new package com.suchi.springbootstarter.course
CourseController -- method returning list of courses
Course - model object having courseId, courseName, description.
hit url /courses - spring will return the json object

<img width="959" alt="3" src="https://user-images.githubusercontent.com/90444833/156605697-cc074e19-ce38-4919-b00f-712831285d12.png">

## basics:
 we added parent spring-boot-starter-parent telling which version, dependency tells maven what to download.
 combination of versions and jars- called build of materials in spring.
 Tomcat is embbeded in Springboot app
 why embbeded - 
 convenience,servlet container config is now application config,useful for microservices architectures, stanalone app.
 
 ## few things on MVC Controller
For us MVC dependency was present due to starter.
Input request -->
		App -->
			Spring MVC -- Controller( URI, Http Method, functionality-java method)
			MVC return the proper response meaning as CourseController was RestController it did conversion to json
			Resource- Course is a resource
			Methods- get post - what u want to do with the noun (resources)	

			GET 	/course  -> get all courses
			GET 	/tourse/id --> get the course
			POST 	/courses   --> Create new Topic
			PUT 	/courses/id --> updates the topic
			Delete  /courses/id --> delete the topic
## Step4: 	Request --> Controller-->Service-->Model
Business Service - Spring creates instance of Service which are singleton.
Create a class CourseService and mark @Service , this will mark as business service
in another class say we need in Controller then spring is not going to create the new insatnce of service
but will inject and we can do that by @autowired..	
	
	http://localhost:8080/courses  -->CourseController-->CourseService-->Course
								
<img width="359" alt="4" src="https://user-images.githubusercontent.com/90444833/156617875-0eb52351-0b4c-4c06-b6fc-4ce562817ddf.png">
<img width="417" alt="5" src="https://user-images.githubusercontent.com/90444833/156617901-9b42c1ae-fb83-4887-94a3-8673334b54e0.png">
<img width="909" alt="6" src="https://user-images.githubusercontent.com/90444833/156617952-47f146af-193a-401f-a417-dc1bdd5a997b.png">

## Step5: getCourse by Id  and post to create new course
earning annotations : 
		@RequestMapping("/course/{Id}")
		@RequestMapping(method = RequestMethod.POST, value = "/courses")

<img width="628" alt="7" src="https://user-images.githubusercontent.com/90444833/156633466-8dda6d9f-b8ea-4d18-a278-322dbdf8356d.png">
<img width="693" alt="8" src="https://user-images.githubusercontent.com/90444833/156633483-5cf1244e-7b8c-41d5-af72-d295d98f33a2.png">
Test Get Course by ID
<img width="329" alt="9" src="https://user-images.githubusercontent.com/90444833/156633513-373826f5-234d-42f6-b949-8475e739be30.png">
Test Post by creating new course , used Postman for this
	Also add contenttype as application/json and body to have the to be added course in json format.
<img width="673" alt="10" src="https://user-images.githubusercontent.com/90444833/156633780-1bcb57b1-7303-4a67-bac9-c274fd1815fc.png">
<img width="629" alt="11" src="https://user-images.githubusercontent.com/90444833/156633811-f77ddb32-7b08-4c8a-8223-bc72391dca54.png">
<img width="632" alt="12" src="https://user-images.githubusercontent.com/90444833/156633827-fc31ddcf-7a8c-415b-8cab-4d4824a199f8.png">

## Step6: put - update the Course
<img width="418" alt="13" src="https://user-images.githubusercontent.com/90444833/156639316-d08af5d4-2f19-47a4-9cd8-0f3b4aa4536a.png">
<img width="343" alt="14" src="https://user-images.githubusercontent.com/90444833/156639341-53111228-e8f7-4943-8f1f-51ddb1699aa7.png">
<img width="626" alt="15" src="https://user-images.githubusercontent.com/90444833/156639355-c52a42f2-c61b-4291-a4e7-dbec6aa22caa.png">
<img width="629" alt="16" src="https://user-images.githubusercontent.com/90444833/156639368-03825b1c-355a-4be3-8a15-f51f7ef1d838.png">

## Step7: Embeded Apache Derby and CRUD Repository

<img width="632" alt="17" src="https://user-images.githubusercontent.com/90444833/156658005-19012fb1-cc46-48fa-a568-ea7ea26eee35.png">
<img width="611" alt="18" src="https://user-images.githubusercontent.com/90444833/156658021-9f934597-1ed2-475f-93a5-be1325f48cfc.png">
<img width="626" alt="19" src="https://user-images.githubusercontent.com/90444833/156658034-a35a7156-70bc-405c-9dd8-dc37b800134e.png">

## Step8: Custom Method in CRUD and use of JPA property Many to one
Added Topic using post --> localhost:8081/topic/
{
    "topicId": 1,
    "topicName": "Java",
    "description": "Java"
}
Get Topic -> localhost:8081/topic/
Get particular Topic -> localhost:8081/topic/1

Add Course to particular Topic using post -->localhost:8081/topics/1/courses
{
    "courseId": 3,
    "courseName": "Maven",
    "description": "Maven"
}
<img width="667" alt="20" src="https://user-images.githubusercontent.com/90444833/156792019-6a60c00b-294b-4421-bb23-3c77895b7e6d.png">


