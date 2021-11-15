install:
	./gradlew clean install
run-dist:
	./build/install/app/bin/app
run:
	./gradlew run
check-updates:
	./gradlew dependencyUpdates


