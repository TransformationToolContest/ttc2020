# https://hub.docker.com/_/microsoft-dotnet-core
FROM mcr.microsoft.com/dotnet/core/sdk:3.1 AS build
WORKDIR /source

# copy csproj and restore as distinct layers
COPY *.sln .
COPY GenericSolution/*.csproj GenericSolution/
COPY Metamodel/*.csproj Metamodel/
COPY SpecificSolution/*.csproj SpecificSolution/
RUN dotnet restore

# copy and publish app and libraries
COPY . .
RUN dotnet publish --configuration Release

# final stage/image
FROM mcr.microsoft.com/dotnet/core/runtime:3.1
WORKDIR /app
COPY --from=build /source/GenericSolution GenericSolution
COPY --from=build /source/SpecificSolution SpecificSolution
ENTRYPOINT /bin/bash
