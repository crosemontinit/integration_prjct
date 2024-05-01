#  AreoBot

## Requirements
- jdk 8 ( to build the xatkit library ) and jdk 11 ( to run the bot )
- mvn ( the latest version )
- node.js and yarn or npm ( latest LTS )

## Installation  
Cloning the repository.
```console
git clone https://github.com/crosemontinit/integration_prjct
```

Pulling the submodules.
```console
git submodule update --init --recursive
```

Updating the submodules to the latest changes.
```console
git submodule update --recursive --remote
```

## Building the xatkit lib
( If you're on linux/macOS use the <cd> command instead of <pushd> or <popd> )
```console
pushd xatkit && mvn clean install -DskipTests
```
<!-- 
# Setting up the server bot.
```console
cd src/GreetingsBot && run
``` -->

## Running the NLP.js server
Note : This server will bind on the 6666 port.
Make sure that the port 6666 is available.
```console
cd src/GreetingsBot/nlp.js-server && npm start
```
## Running the UI/electron application ( areo_gui )
Start the electron application.
```console
cd areo_gui/areoui && npm run electron
```

Start the React application.
Note : this will start a browser. Feel free to close it.
```console
cd areo_gui/areoui && npm start
```