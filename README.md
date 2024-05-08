#  AreoBot
Conversational Bot Customizable By Different Parties.

## Requirements
- JDK 8 ( to build the xatkit library ).
- Maven ( the latest version )
- Node.js and yarn or npm ( latest LTS )

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

**NOTE : ( If you're on linux/macOS use the <cd> command instead of <pushd> or <popd> )**

```console
pushd xatkit && mvn clean install -DskipTests && popd
```

## Running the NLP.js server
Note : This server will bind on the 6666 port.
Make sure that the port 6666 is available.
```console
pushd src/GreetingsBot/nlp.js-server && npm start && popd
```
## Running the UI/electron application ( areo_gui )
Start the electron application.
```console
pushd areo_gui/areoui && npm run electron && popd
```

Start the React application.
Note : this will start a browser. Feel free to close it.
```console
pushd areo_gui/areoui && npm start && popd
```