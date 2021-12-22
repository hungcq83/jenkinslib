void call(){
    stage("SonarQube: Static Code Analysis"){
        println "static code analysis from the sonarqube library"
        def process = "find / -type d -name 'maven'".execute()
        print "Output: " + process.text
        print "Exit code: " + process.exitValue()
        process = "pwd".execute()
        print "Output: " + process.text
        print "Exit code: " + process.exitValue()
    }
}