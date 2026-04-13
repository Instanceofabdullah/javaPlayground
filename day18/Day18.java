public class Day18
{

    public static void main(String args[])
    {
        System.out.println("Day 18 - Quickstart with maven ");

        // Command to create a java project from a template (archetype)

        // mvn archetype:generate
        //      -DgroupId=com.[CompanyName]
        //      -DartifactId=[AppName]
        //      -DarchetypeArtifactId=maven-archetype-quickstart
        //      -DarchetypeVersion=1.0
        //      -DinteractiveMode=false

        // archetype:generate 
        //   generates project using template (archetype)

        // -DgroupId=com.[CompanyName]
        //    Defines Package name
        
        // -DartifactId=[AppName]
        //    Defines project name, also becomes folder name

        // -DarchetypeArtifactId=maven-archetype-quickstart
        //    Specifies which template to use
        //    Above is basic starter project
        //    Includes : 
        //    Sample App.java, Sample test file, project structure

        // -DarchetypeVersion=1.0
        //    Version of archetype template

        // -DinteracttiveMode=false
        //    Runs in non-interactive mode
        //    skips prompts for above values

        // After running project structure is :
        //      [AppName]/
        //          pom.xml
        //          src/
        //              main/java/com/[PackageName]/App.java
        //              test/java/com/[PackageName]/AppTest.java

    }
}