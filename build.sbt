name := "corbeans"
organizationName := "Manos Batsis"
version := "0.28"
scalaVersion := "2.11.8"

lazy val noPublishSettings = Seq(
  publish := ((): Unit),
  publishLocal := ((): Unit),
  publishArtifact := false
)

lazy val micrositeSettings = Seq(
  micrositeName := "corbeans",
  micrositeDescription := "Corda integration for Spring Boot",
  micrositeUrl := "https://manosbatsis.github.io",
  micrositeBaseUrl := "/corbeans",
  micrositeDocumentationUrl := "/corbeans/docs",
  micrositeAuthor := "Manos Batsis",
  micrositeHomepage := "https://manosbatsis.github.io/corbeans/",
  micrositeOrganizationHomepage := "https://manosbatsis.github.io",
  micrositeGithubOwner := "manosbatsis",
  micrositeGithubRepo := "corbeans",
  micrositeGithubToken := sys.env.get("GITHUB_TOKEN"),
  micrositePushSiteWith := GitHub4s,
  micrositeGithubLinks := true,
  micrositeGitterChannel := true,
  micrositeHighlightTheme := "github",
  micrositeHighlightLanguages := Seq("kotlin", "java", "gradle", "xml", "bash", "properties"),
  micrositeStaticDirectory := file("build/dokka"),
  micrositeFooterText := Some("<span> Got a remote contract? Contact me by <a href=\"mailto:manosbatsis@gmail.com?subject=Remote Contract\">email</a> or <a href=\"https://www.linkedin.com/in/manosbatsis\">linkedin</a></span>."),
  micrositeShareOnSocial := false,
  micrositeAnalyticsToken := "UA-131279953-1"
)


lazy val docs = (project in file("docs"))
  .settings(moduleName := "docs")
  .settings(micrositeSettings: _*)
  .settings(noPublishSettings: _*)
  .enablePlugins(MicrositesPlugin)
 // .enablePlugins(GitHub4s)
  .enablePlugins(TutPlugin)