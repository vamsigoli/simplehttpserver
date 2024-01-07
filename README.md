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
