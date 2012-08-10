name := "scalaj-collection"

version := "2.0"

organization := "org.scalaj"

scalaVersion := "2.9.2"

resolvers ++= Seq(
	Classpaths.typesafeResolver,
	"Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "2.0.M2" % "test"
)
