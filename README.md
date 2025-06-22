# 🏧 ATM System

A simple ATM simulation project implemented in Java, showcasing core banking operations and design patterns.

---

## 📁 Project Structure

- `requirements.md` — Defines the system's functional requirements.
- `solutions.md` — Describes the design decisions and usage of software design patterns.
- `src/` — Contains all Java source code for the ATM system.

---

## ✅ Features

- Card swipe simulation
- PIN authentication
- Account selection (e.g., Checking, Savings)
- Withdraw and deposit operations
- Balance inquiry
- Receipt generation

---

## 🔧 Design Patterns Used

This project demonstrates the use of classic OOP design patterns:

- **Command Pattern** — Encapsulates operations like `Withdraw`, `Deposit`, and `Info`.
- **State Pattern** — Manages the ATM workflow via states like `EnterCardState`, `EnterPinState`, etc.
- **Strategy Pattern** — Allows dynamic selection of account type (e.g., checking vs savings).

Details on implementation are available in `solutions.md`.

---

## 🚀 Getting Started

### Prerequisites

- Java 8 or above
- A Java IDE (e.g., IntelliJ, Eclipse) or CLI tools like `javac` and `java`

### Running the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/atm-system-java.git
   cd atm-system-java
