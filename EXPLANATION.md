# Explanation of Java Concepts Used

## Objective

This program reads data from a text file, converts all characters to uppercase, and writes the converted text into another text file. It also demonstrates exception handling for file-related errors.

---

# 1. File Handling

Java provides classes in the `java.io` package for file operations.

This program uses:

- `FileReader`
- `BufferedReader`
- `FileWriter`
- `BufferedWriter`

---

# 2. BufferedReader

`BufferedReader` reads the file line by line.

```java
BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
```

Reading one line at a time:

```java
while ((line = reader.readLine()) != null)
```

---

# 3. BufferedWriter

`BufferedWriter` writes data efficiently to a file.

```java
BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));
```

Writing data:

```java
writer.write(line.toUpperCase());
writer.newLine();
```

---

# 4. String Method

The program converts text into uppercase using:

```java
line.toUpperCase();
```

Example:

```
Java Programming
```

becomes

```
JAVA PROGRAMMING
```

---

# 5. Exception Handling

The program uses a `try-catch-finally` block.

```java
try {
    ...
}
catch (...) {
    ...
}
finally {
    ...
}
```

This prevents the program from terminating unexpectedly.

---

# 6. FileNotFoundException

This exception occurs if the source file does not exist.

```java
catch (FileNotFoundException e)
```

Example Output:

```
Error: Source file not found.
```

---

# 7. IOException

This exception occurs if an error happens while reading, writing, or closing the file.

```java
catch (IOException e)
```

Example Output:

```
Error while reading or writing the file.
```

---

# 8. Finally Block

The `finally` block always executes.

It closes the opened files.

```java
reader.close();
writer.close();
```

This prevents resource leaks.

---

# 9. Scanner Class

The `Scanner` class is used to read the source and destination file names.

```java
Scanner sc = new Scanner(System.in);
```

Method used:

```java
nextLine()
```

---

# Program Flow

1. Read the source file name.
2. Read the destination file name.
3. Open the source file using `BufferedReader`.
4. Open the destination file using `BufferedWriter`.
5. Read each line from the source file.
6. Convert the line to uppercase.
7. Write the converted line to the destination file.
8. Repeat until the end of the file.
9. Handle `FileNotFoundException` and `IOException`.
10. Close all resources.
11. End the program.

---

# Java Concepts Covered

- File Handling
- FileReader
- FileWriter
- BufferedReader
- BufferedWriter
- String Method (`toUpperCase()`)
- Scanner Class
- Exception Handling
- try-catch-finally
- FileNotFoundException
- IOException
- Loops
- User Input
- Resource Management
