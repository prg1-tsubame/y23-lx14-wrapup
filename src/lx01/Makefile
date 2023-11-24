all: simple simple.s lx01/run.class

simple: simple.c
	clang -o simple simple.c

simple.s: simple.c
	clang -O0 -S simple.c

lx01/run.class: simple.scala
	scalac simple.scala

clean:
	rm -f simple simple.s *.class

run-c: simple
	./simple

run-s: lx01/run.class
	scala lx01.run

run-j: lx01/run.class
	java -classpath `brew --prefix`/opt/scala/libexec/lib/scala-library.jar:. lx01.run