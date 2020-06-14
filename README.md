# Henshin solution to the Round-Trip Migration Case of TTC2020

A solution for a [case](https://github.com/lbeurerkellner/ttc2020) in the [Transformation Tool Contest 2020](http://www.transformation-tool-contest.eu/).

## How to use this repository? ##

### Run our solution ###

Set-up

* As a prerequisite, you will need to have the Java 8 SDK or higher installed on your system.
* Download and install a recent version of the Eclipse Modeling Tools, for example, [version 2020-3](https://www.eclipse.org/downloads/packages/release/2020-03/r/eclipse-modeling-tools) distribution. If you already have a local version installed and you are able to complete the installation instructions for Henshin, then the solution should work as well.
* In Eclipse, install the Henshin plugin.
    * *Do Help -> Install New Software...*
    * Under *Work with...* enter the Nightly update site: http://download.eclipse.org/modeling/emft/henshin/updates/nightly
    * After the installation, restart Eclipse.
* Use the Git perspective to duplicate this repository to your local system, and to import the contained projects into your Eclipse workspace. The projects should compile automatically without errors.

### Usage ###

The solution code and transformations are contained  in the ''nl.ru.cs.ttc2020.solution'' project.

* To reproduce the functionality and performance tests, use the classes *AllHenshinFunctionalTests*  and *AllHenshinPerformanceTests* in the  package *nl.ru.cs.ttc2020.solution*  of the project of the same name. Right-click -> "Run as JUnit Test"  (and not as JUnit Plug-In Test, which generally takes much longer) worked on the example system.
* To inspect the transformation rule, open the *.henshin_diagram* files in the folder *rules*. 
* To inspect the glue code, inspect the classes HenshinTaskFactory and HenshinTask in the source folder *src*.
