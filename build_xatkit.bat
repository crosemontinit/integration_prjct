@REM run this script if you're rosemont computer lab.
@echo off
pushd xatkit && mvn -Dmaven.compiler.fork=true -Dmaven.compiler.executable="C:\Program Files\Java\jdk1.8.0_311\bin\javac" clean install -DskipTests && popd