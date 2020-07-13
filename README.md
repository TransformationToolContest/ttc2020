# Henshin solution to the Round-Trip Migration Case of TTC2020

Evaluation framework and reference solution for the TTC 2020 "Round-Trip Migration of Object-Oriented Data Model Instances" case.

## How to run the NMF Solution

The NMF solution is already precompiled in the repository. In order to run it, you need to have the .NET Core 3.1 runtime installed. Please visit [https://dotnet.microsoft.com/download] for instructions how to do that.

In order to run the solution, you may either run the specific or the generic solution executable. Both of them require the same commandline arguments and are started similarly.

For Windows, simply execute 
```
NMFRoundtrips\GenericSolution\bin\Release\netcoreapp3.1\publish\TTC2020.Roundtrip.GenericNMFSolution.exe
NMFRoundtrips\SpecificSolution\bin\Release\netcoreapp3.1\publish\TTC2020.Roundtrip.NMFSolution.exe
```

This will give you an overview on the verbs that are supported by this solution. Each verb will execute one of the scenarios either forward (meaning that a V1 instance is migrated to V2 and back again) or backward (meaning that a V2 instance is migrated to V1 and back again). Each verb requires two arguments that specify which instance should be loaded and where the output should be written to.

Please note that we had to adjust the namespace URI for the NMF solution such that each metamodel has its own namespace URI because NMF does not support different metamodels with the same namespace in the same process. The namespaces already had the version moniker (V1, V2) in them and we simply added the scenario moniker.

For linux, you cannot directly run the exe but instead, you have to run it using `dotnet`, passing the dll as argument, followed by the selected verb and file paths.
