#  AreoBot

# Requirements
- jdk 8
- mvn ( preferrably the latest )
- node, npm ( latest LTS )

## Building the xatkit lib
The xatkit is included in this repo.
To build it, follow the clear instructions in the following link : https://github.com/xatkit-bot-platform/xatkit/wiki/Build-XatkitU

# Installation  
```console
git clone https://github.com/crosemontinit/integration_prjct &&
git submodule --update --init --recursive
```

## Running the XATKIT bot
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