addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.21")
addSbtPlugin("com.typesafe.play" % "sbt-play-ebean" % "6.2.0-RC4")
addSbtPlugin("com.github.sbt" % "sbt-native-packager" % "1.10.0")

libraryDependencies += "io.ebean" % "ebean" % "12.8.1"

ThisBuild / libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always
