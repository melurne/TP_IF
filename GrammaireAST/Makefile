GRAM =$(wildcard *.g4)
LIBS =$(wildcard *.java)

ANTLR=java -jar /home/maxence/.antlr/antlr-4.9-complete.jar

all: $(GRAM)
	javac circuits/*.java
	$(ANTLR) *.g4
	javac *.java

clean:
	rm *.class
	rm *.tokens
	rm *.interp
