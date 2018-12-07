.PHONY: clean
.PHONE: nuke

all: UseStudent.java InvalidGradeException.java Student.java
	javac InvalidGradeException.java Student.java UseStudent.java
	
	$(clear)
	
	java UseStudent


clean:
	rm *.class -f 

nuke:
	rm *.class *.java -f