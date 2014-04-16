import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "linmabreakout"
    val appVersion      = "0.0.1-SNAPSHOT"

   // general project dependencies
	val appDependencies = Seq(
	    "com.google.inject" % "guice" % "3.0",
	    "com.google.inject.extensions" % "guice-multibindings" % "3.0",
	    "de.linma.breakout" % "breakout_core" % "0.0.1-SNAPSHOT"
	)

    val main = play.Project(appName, appVersion, appDependencies).settings(
    	organization := "de.linma.breakout", // group id
    	crossPaths := false, // disable using the Scala version in output paths and artifacts
    	resolvers += "HTWG Resolver" at "http://lenny2.in.htwg-konstanz.de:8081/artifactory/libs-snapshot-local",
    	publishTo := Some("HTWG Publisher" at "http://lenny2.in.htwg-konstanz.de:8081/artifactory/libs-snapshot-local;build.timestamp=" + new java.util.Date().getTime()),
	  	
    	// setup entry points for sonar code analyzer
	  	pomExtra :=
		  <build>
		    <sourceDirectory>app</sourceDirectory>
		    <testSourceDirectory>test</testSourceDirectory>
		    <resources>
		      <resource>
		        <directory>app</directory>
		      </resource>
		    </resources>
		  </build>
    )

}