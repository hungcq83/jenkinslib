void call(){
    stage("Maven: Build"){
        println "build from the maven library"
        def process = "find / -type d -name 'maven'".execute()
        print "Output: " + process.text
        print "Exit code: " + process.exitValue()
        process = "pwd".execute()
        print "Output: " + process.text
        print "Exit code: " + process.exitValue()
    }
}