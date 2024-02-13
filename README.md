Java console app with SQLi.  Example app for using Fix.

git clone https://github.com/veracode-demo-labs/java-console-app.git

cd java-console-app

mvn clean install

veracode static scan target\sql-injection-demo-1.0-SNAPSHOT.jar

veracode fix src/main/java/org/example/Main.java

Fix the SQLi

mvn clean install

veracode static scan target\sql-injection-demo-1.0-SNAPSHOT.jar
