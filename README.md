# Object-Oriented Programming

A Java coursework portfolio demonstrating a progression from programming fundamentals to
object-oriented design, collections, inheritance, interfaces, and data persistence.
The repository contains small, focused console applications and domain models.

## What this project contains

- **Fundamentals and algorithms (`T1_3`, `T1_4`)**
  - Binary-to-decimal conversion, prime number generation, multiplication practice, and
    quadratic-equation solving.
  - Array processing exercises including maximum sub-array sum and duplicate removal.
  - Random name generation and basic console input/output.
- **Encapsulation and object collaboration (`T2_1`–`T2_3`)**
  - Stateful `Car`, `CoffeeMaker`, and `Television` classes with driver programs.
  - A grocery-list manager using maps for item costs, categories, and quantities.
  - A library system that models books, users, borrowing/returns, reviews, ratings, and
    availability.
- **Inheritance, abstraction, and interfaces (`T3_1`, `T3_2`)**
  - Shape hierarchies for area calculation and polymorphic output.
  - Vehicle hierarchies using abstract classes and `Vehicle`/`ElectricVehicle` interfaces,
    including petrol and electric vehicles.
  - Specialized behavior such as sports-car acceleration and bus passenger management.
- **Domain modeling and persistence (`T3_3`, `T3_4`)**
  - Bank-account operations with account numbering and aggregate account tracking.
  - A package-organized library model with books, members, borrowing, and reservations.
  - HTTP CSV reading and temperature averaging, Fibonacci CSV generation, and serialized
    student/course enrollment data.
- **Validation-focused calculator (`T4`)**
  - A small calculator that supports reset and non-negative additions, rejects invalid
    input with `IllegalArgumentException`, and includes explanatory documentation.

## Repository structure

```text
src/
├── T1_3/       Algorithm and numeric exercises
├── T1_4/       Array and string exercises
├── T2_1/       Encapsulated device and vehicle classes
├── T2_2/       Collection-based grocery-list manager
├── T2_3/       Library domain model
├── T3_1/       Inheritance and polymorphic shapes
├── T3_2/       Abstract vehicle and interface hierarchy
├── T3_3/       Banking and a package-organized library system
├── T3_4/       Networking, file I/O, and serialization
└── T4/         Calculator exercise and notes
```

The standalone Java files in `src/` are introductory exercises and demonstrations.

## Running the examples

The project has no build-tool configuration; each exercise can be compiled and run
independently with a JDK. From the repository root, for a packaged class:

```bash
javac -d out src/T1_3/BinaryValue.java
java -cp out T1_3.BinaryValue
```

For a class in the default package, compile and run its source file directly:

```bash
javac src/Main.java
java -cp src Main
```

Some programs expect console input, network access, or create local output files such as
`fibonacci.csv` and `enrollments.ser`.
