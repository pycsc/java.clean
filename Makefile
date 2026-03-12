# **************************************************************************** #
#                                                                              #
#                                                            +#                #
#    Makefile                                               +##                #
#                                                         +###+                #
#    By: lucas <lucas@tsiaraso.com>                    +########+              #
#                                                          +###+               #
#    Created: 2026/03/12 12:36:56 by lucas                   ##+               #
#    Updated: 2026/03/12 12:49:02 by lucas                   #+                #
#                                                                              #
# **************************************************************************** #

SRCDIR  = src
BINDIR  = bin
SOURCES = $(shell find $(SRCDIR) -name "*.java")

all:
	mkdir -p $(BINDIR)
	javac -sourcepath $(SRCDIR) -d $(BINDIR) $(SOURCES)

run: all
	java -cp $(BINDIR) adapters.Main

test: all
	java -ea -cp $(BINDIR) tests.TestMain

clean:
	rm -rf $(BINDIR)
