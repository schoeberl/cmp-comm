// scalaVersion := "2.12.6"

// scalacOptions := Seq("-Xsource:2.11")

// No Chisel 2 version for Scala 2.12
scalaVersion := "2.11.7"

resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases")
)

// switch between Chisel 2 and 3

 libraryDependencies += "edu.berkeley.cs" %% "chisel" % "2.2.38"

// libraryDependencies += "edu.berkeley.cs" %% "chisel3" % "3.1.7"
// libraryDependencies += "edu.berkeley.cs" %% "chisel-iotesters" % "1.2.8"
