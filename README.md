# TTC 2020 Round-Trip Migration Case

Evaluation framework and reference solution for the TTC 2020 "Round-Trip Migration of Object-Oriented Data Model Instances" case.

## Performance Evaluation

To use the provided plotting scripts, make sure your Python environment provides the dependencies listed in `requirements.txt`.

To plot the runtime results of the reference solution using the plotting script, execute the following command. Make sure to execute the corresponding `AllJavaPerformanceTests` JUnit test beforehand, which creates the `results.csv` file.

```python
python plot.py de.hub.mse.ttc2020.solution/results.csv
```

The resulting plot will be saved to the file `./runtime.pdf`.

## EMFSyncer Solution

* The EMFSyncer solution can be found at [ttc2020.emfsyncer](ttc2020.emfsyncer/).
* The original benchmark framework available [here](https://github.com/lbeurerkellner/ttc2020) has been modified. Please use this [de.hub.mse.ttc2020.benchmark](de.hub.mse.ttc2020.benchmark/). 
* The modified reference solution can be found at [de.hub.mse.ttc2020.solution](de.hub.mse.ttc2020.solution/).

### Installation guide

* Download [Eclipse IDE for Java and DSL Developers](https://www.eclipse.org/downloads/packages/)
* Install EMF Compare 3.3 from the update site `https://download.eclipse.org/modeling/emf/compare/updates/releases/3.3/` and restart Eclipse. 
* Install AJDT for Eclipse 4.10, from the update site `http://download.eclipse.org/tools/ajdt/410/dev/update` and restart Eclipse.

### Get the EMFSyncer solution and run it

* Clone the git repository containing the EMFSyncer solution: `https://github.com/emf-syncer/ttc20-roundtrip.git` using EGit
* From the EGit repository view, select the three projects and click `Import projects`, then select `Import existing Eclipse projects (3 selected)` and click `Finished`.
* Go to the Java perspective, select the project `ttc2020.emfsyncer`. Then click on `Project > Clean...`.
* Task solutions can be found [here](./ttc2020.emfsyncer/src/emfsyncer/solution/)
* To run functional tests use [this launch configuration](./ttc2020.emfsyncer/AllJavaFunctionalTests.launch) (right click > `Run As` > `AllJavaFunctionalTests`)
* To run performance tests use [this launch configuration](./ttc2020.emfsyncer/AllJavaPerformanceTests.launch) (right click > `Run As` > `AllJavaPerformanceTests`)

## Henshin Solution

### Set-up

* As a prerequisite, you need to have the Java 8 SDK or higher installed on your system.
* Download and install a recent version of the Eclipse Modeling Tools distribution, for example, [version 2020-3](https://www.eclipse.org/downloads/packages/release/2020-03/r/eclipse-modeling-tools). If you already have a version installed and you are able to complete the installation instructions for Henshin below, you should be able to use the solution as well.
* In Eclipse, install the Henshin plugin.
    * *Do Help -> Install New Software...*
    * Under *Work with...* enter the Nightly update site: http://download.eclipse.org/modeling/emft/henshin/updates/nightly
    * After the installation, restart Eclipse.
* Use the Git perspective to duplicate this repository to your local system, and to import the contained projects into your Eclipse workspace. The projects should compile automatically without errors.

### Usage

The solution artifacts are contained  in the *nl.ru.cs.ttc2020.solution* project.

* To reproduce the functionality and performance tests, use the classes *AllHenshinFunctionalTests*  and *AllHenshinPerformanceTests* in the  package *nl.ru.cs.ttc2020.solution*  of the project of the same name. Right-click -> "Run as JUnit Test"  (and not as JUnit Plug-In Test, which generally takes much longer) worked on the example system.
* To inspect the transformation specifications, open the *.henshin_diagram* files in the folder *rules*. 
* To inspect the glue code, inspect the classes *HenshinTaskFactory* and *HenshinTask* in the source folder *src*.

## NMF Solution

The NMF solution is already precompiled in the repository. In order to run it, you need to have the .NET Core 3.1 runtime installed. Please visit [https://dotnet.microsoft.com/download] for instructions how to do that.

In order to run the solution, you may either run the specific or the generic solution executable. Both of them require the same commandline arguments and are started similarly.

For Windows, simply execute 
```
NMFRoundtrips\GenericSolution\bin\Release\netcoreapp3.1\publish\TTC2020.Roundtrip.GenericNMFSolution.exe
NMFRoundtrips\SpecificSolution\bin\Release\netcoreapp3.1\publish\TTC2020.Roundtrip.NMFSolution.exe
```

This will give you an overview on the verbs that are supported by this solution. Each verb will execute one of the scenarios either forward (meaning that a V1 instance is migrated to V2 and back again) or backward (meaning that a V2 instance is migrated to V1 and back again). Each verb requires two arguments that specify which instance should be loaded and where the output should be written to.

Please note that we had to adjust the namespace URI for the NMF solution such that each metamodel has its own namespace URI because NMF does not support different metamodels with the same namespace in the same process. The namespaces already had the version moniker (V1, V2) in them and we simply added the scenario moniker.

For Linux, you cannot directly run the exe but instead, you have to run it using `dotnet`, passing the dll as argument, followed by the selected verb and file paths.

