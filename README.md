# sbt-worksheets

## Motivation

Run Metals worksheets from the sbt shell

## Context

[Metals](https://scalameta.org/metals/) supports [Worksheets](https://scalameta.org/metals/docs/troubleshooting/faq/#worksheets).

These files, which use the extension `.worksheet.sc` allow to code
interactively in the editor, and can use the dependencies declared in the
`build.sbt`.

Unfortunately sbt does not have any knowledge of these files. The main problem
with this is that we cannot compile and run worksheets from the sbt shell or
from the commandline. This also mean that they cannot be checked in Continuous
Integration (CI) environments.

This sbt plugin uses [mdoc](https://scalameta.org/mdoc/), the same project used
by Metals, to run worksheets from the sbt shell.

## How to use

Add the following to your `project/plugins.sbt`:

```
addSbtPlugin("io.github.vincenzobaz" % "sbt-worksheets" % <VERSION>)
```

Then, in your `build.sbt`:


```
enablePlugins(WorksheetsRunner)
```

finally, you can use the

```
checkWorksheets
```
task in sbt


## How it works

It copies all files to a new directory inside `target`, avoiding collisions,
and decorates them to be valid mdoc markdown. It then runs mdoc.

