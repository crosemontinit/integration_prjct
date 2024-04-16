#  AreoBot

# Requirements
- jdk 8
- mvn ( preferrably the latest )
- node, npm ( latest LTS )

# Installation  
```console
git clone https://github.com/crosemontinit/integration_prjct &&
git submodule --update --init --recursive
```

## Building the xatkit lib
The xatkit library is installed by default in this repo.
To build it :
```console
cd xatkit && mvn clean install -DskipTests
```

## Server side setup
```console
cd integration_prjct
```

```console
cd src/GreetingsBot && run
```

## Running the nlp js server
```console
cd src/GreetingsBot/nlp.js-server && run
```

# Customizing
From the root directory.
```console
cd aero_rc && mvn clean install
```

Also from the root directory.
```console
cd areo_gui\areoui && npm i
```

## Running the UI 
```console
npm start 
```

( Open a new command line and then navigate to the previous path )
```console
npm run electron
```