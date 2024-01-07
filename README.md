# Java Implementation of https://www.youtube.com/watch?v=Ka8vG5miErk

## First command to execute in the console of blogs.oracle.com
`fetch("http://localhost:8500").then(a => a.text()).then(console.log)`

## Second Command to execute
`fetch("http://localhost:8500",{headers: {"Content-Type": "json/application"}}).then(a => a.text()).then(console.log)`

# Java HttpClient auto close https://www.youtube.com/watch?v=ctYJmOlCUY4
The new java httpclient from jdk 21 is auto closable. A test case has been added to demonstrate how it is used

# Another java in-memory server
InMemoryHttpServer has another implementation for in-memory server
Help document stored in vamsi-laptop/tech-june23

# Another nice java web server
The SWSJRT class in this project has a nice implementation that servers
the java classes through http. article stored in vamsi-laptop/tech-june23
https://inside.java/2021/12/06/working-with-the-simple-web-server/

