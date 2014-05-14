import play.Project._

name := """breakout_wui"""

version := "0.0.1-SNAPSHOT"

resolvers += "HTWG Resolver" at "http://lenny2.in.htwg-konstanz.de:8081/artifactory/libs-snapshot-local"

libraryDependencies ++= Seq(
	"org.webjars" %% "webjars-play" % "2.2.0", 
	"org.webjars" % "bootstrap" % "2.3.1",
	"org.projectlombok" % "lombok" % "1.12.6",
	"de.linma.breakout" % "breakout_core" % "0.0.1-SNAPSHOT")

playJavaSettings
