#!/bin/sh
export CLASSPATH=/home/parimal/.p2/pool/plugins/org.testng.eclipse_6.10.0.201612030230/lib/testng.jar:/home/parimal/.p2/pool/plugins/org.testng.eclipse_6.10.0.201612030230/lib/jcommander.jar:/home/parimal/workspace/Basic/bin:/home/parimal/Downloads/seleniumlib/client-combined-3.0.1-nodeps.jar
java -classpath ".:$CLASSPATH:/home/parimal/Downloads/seleniumlib/lib/*" org.testng.TestNG testng.xml
