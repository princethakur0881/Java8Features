# Java8Features
##Question 
##Answers\
Q:1 what is JAVA?\
A:1  Java is high-level and  Object-Oriented programming language.which is mostly used to developed standalone backend applications. which follows method "WRITE ONCE, RUN ANYWHERE ".
this is plateform independent programing language. that is the one of the biggest strength.
Q:2 What is JDK, JRE and JVM?\
A:2 JDK- Java Development Kit stands for developing, debugging, documantations, generators.\
    JRE- Java Runtime Environment stands for provide the environment where java runs easily. Java virtual Machine.
    JRE can be installed without JDK since JRE is only needed to run Java applications.\
    JVM- Java Virtual Machine is the actual engine thats runs the Java bytecode on any platecode\
Q:3 Java Program Executions?\
A:3 The Compilation Phase (writing code to bytecode) and the Execution Phase (running the bytecode via the JVM).
Compilations time Ist Phase
1. Source Code (.java): You write your Java code in a text file and save it, for example, as Main.java.
2. Compilation (javac): You run the Java compiler via the terminal Command: javac Main.java.
3. Bytecode (.class): The compiler checks for syntax errors. If the code is error-free, it generates a platform-independent .class file containing Bytecode.
[ Your Code ] (.java)

│
▼  (javac Compiler)
[ Bytecode  ] (.class)  ──► Platform Independent
│
▼  (java Command launches JVM)
┌──────────────────────────────────────────────┐
│ JVM (Java Virtual Machine)                   │
│                                              │
│  Class Loader ──► Verifier                   │
│                       │                      │
│                       ▼                      │
│               Looks for main()               │
│                       │                      │
│                       ▼                      │
│               Execution Engine               │
│             (Interpreter + JIT)              │
└───────────────────────┬──────────────────────┘
│
▼
[ Hardware/OS Execution ]\
Runtime Phase IInd Phase
1-Loading and Verifications
2-Finding EntryPoint of Code
3-Execution Engine 
4-Memory Allocations\
Q:4 Data Types in Java\
A:4 Java have mainly two types of datatypes 1-Primitive, 2-Non-primitive.
Primitive - Integers(byte, int ,short, long),fractional(double, float),Boolean(true/false), Charcters(char).\
Non-primitive - Strings,Arrays,Scaaner,Interfaces,Classes.ex-Starts eith Capital letter.
