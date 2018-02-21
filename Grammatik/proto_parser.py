#!/usr/bin/env python
from antlr4 import *
from DeutschLexer import DeutschLexer
from DeutschListener import DeutschListener
from DeutschParser import DeutschParser
from antlr4.tree.Trees import Trees
import sys

def main():
    lexer = DeutschLexer(FileStream(sys.argv[1]))
    stream = CommonTokenStream(lexer)
    parser = DeutschParser(stream)
    tree = parser.expression()
    print(Trees.toStringTree(tree, None, parser))

if __name__ == '__main__':
    main()
