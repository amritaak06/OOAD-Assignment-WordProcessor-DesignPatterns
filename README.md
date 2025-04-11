# OOAD-Assignment-WordProcessor-DesignPatterns
Java-based word processor that applies text styles using Flyweight and Chain of Responsibility design patterns as a part of our Object Oriented Analysis and Design Course Assignment in 6th Semester
A Java-based mini word processor that demonstrates the use of two core design patterns: **Flyweight** and **Chain of Responsibility**.  
This program applies multiple formatting styles (bold, italic, underline) to individual words based on their configuration.

---

## Features

- Apply **Bold**, **Italic**, and **Underline** styles to words.
- Style combinations using **Chain of Responsibility**.
- Shared style/type instances using **Flyweight Pattern**.
- Clean modular design with extensible formatters.

---

## Design Patterns Used

| Pattern                  | Role in Project |
|--------------------------|-----------------|
| Flyweight Pattern        | Reuses instances of word types and styles to save memory. |
| Chain of Responsibility  | Applies a chain of formatters to style the word based on its configuration. |

---

## 🗂️ Project Structure

```
└───wordprocessor
    │   FlyweightFactory.java
    │   FlyweightFactory.class
    │   Main.java
    │   Main.class
    │   Word.java
    │   Word.class
    │   WordStyle.java
    │   WordStyle.class
    │   WordType.java
    │   WordType.class
    │
    └───formatters
        │   BoldFormatter.java
        │   BoldFormatter.class
        │   ItalicFormatter.java
        │   ItalicFormatter.class
        │   TextFormatter.java
        │   TextFormatter.class
        │   UnderlineFormatter.java
        │   UnderlineFormatter.class

```

---

## How to Run

### Compile the code:
```bash
javac wordprocessor/*.java wordprocessor/formatters/*.java
```

### Run the program:
```bash
java wordprocessor.Main
```

---

## Output Example (CMD)

```
Formatted output (run): <b>run</b>
Formatted output (walk): <i>walk</i>
Formatted output (jump): <u>jump</u>
Formatted output (climb): <i><b>climb</b></i>
Formatted output (slide): <u><b>slide</b></u>
Formatted output (crawl): <u><i>crawl</i></u>
Formatted output (sprint): <u><i><b>sprint</b></i></u>
```

---


---

## 👩‍💻 Author

**Amritaa K**   
6th Semester - Object Oriented Analysis and Design

---
