# web-services-ecdl
A java web-service to handle files for ecdl

## Prerequisites
* To run the application you need to have git, mvn and JDK8 installed.

## Download
* Open command line and move to your workspace.
* Download project using your username: 
<br>`> git clone https://github.com/kmponis-ecdl/web-service-ecdl.git`
* Go to project: 
<br>`> cd /web-service-ecdl`

## Run
* Open command line and move to your project.
* Go to the right branch (ex. develop)
<br>`> git checkout develop`
<br>**Localy Tomcat** 
<br>Copy into \tomcat\lib the libraries of:
<br>`\\wedinufs01.edin.uk.sopra\F\groups\773 health\Software\SML Software\Red Hat JBoss Web Server 5.0\Tomcat Libraries`
<br>Add to web.xml
<br>`<filter>
		<filter-name>CORS</filter-name>
		<filter-class>com.thetransactioncompany.cors.CORSFilter</filter-class>
	</filter>
	<filter-mapping>
		<filter-name>CORS</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>`
<br>**Dev Server Jenkins** 
<br>`TODO`
<br>**Prod Server Jenkins** 
<br>`TODO`

# General Info

## GIT Strategy
* Open command line and move to your workspace.
* Download project using your username: 
<br>`> git clone https://github.com/kmponis-ecdl/web-service-ecdl.git`
* Go to develop branch
<br>`> git checkout develop`
* Create a slave branch - using the story number (ex. sml-9)
<br>`> git branch <newBranchName>`
* Select slave branch 
<br>`> git checkout <newBranchName>`
* Add slave branch to repository 
<br>`> git push --set-upstream origin <newBranchName>`
* When story is finished push and request a merge
* Pull changes from develop
<br>`> git checkout <newBranchName>`
<br>`> git fetch origin`
<br>`> git merge origin/develop`
<br>`> git push`