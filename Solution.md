# 💡 ATM Machine Solution Design

## ✅ Functional Requirements

- User should be able to swipe card
- User should be able to authenticate via PIN
- User should be able to withdraw money
- User should be able to check balance
- Notification when withdrawal occurs
- User should be able to select account
- Card should be ejected after transaction is completed
- User should be able to deposit money

---

## 🛠️ Design Patterns Used

### 1. Command Pattern

Used to encapsulate ATM operations as individual command objects:

- `DepositCommand`
- `WithdrawCommand`
- `InfoCommand` (for balance inquiry)

This pattern helps in decoupling UI from transaction logic and allows easy extension of commands.

---

### 2. State Pattern

Manages transitions between various user interaction states via an `ATMState` interface. The following states are implemented:

- `EnterCardState`
- `EnterPinState`
- `InvalidState`
- `TransactionSelectionState`
- `ReceiptState`
- `ThankYouState`

A central `ATMStateManager` handles the current state and transitions, delegating behavior accordingly.

---

### 3. Strategy Pattern

Used for dynamic account selection at runtime:

- `SelectCheckingAccountStrategy`
- `SelectSavingsAccountStrategy`

Each strategy defines how the account is chosen before a transaction.

---

### 4. Account Class

Encapsulates user account data and behavior. It includes:

- `accountNumber`
- `deposit(amount)`
- `withdraw(amount)`
- `getInfo()` – for checking balance

Provides a clean abstraction of banking operations.

---

## 📤 Additional Features

- **Withdrawal Notification**: Triggered after a successful withdrawal (e.g., via a logging or alert system).
- **Card Ejection**: Implemented in `ThankYouState` to ensure the card is returned at the end of the session.

---

## 🔄 State Flow Overview

```text
EnterCardState
   ↓
EnterPinState
   ↓
TransactionSelectionState
   ↓
(WithdrawCommand / DepositCommand / InfoCommand)
   ↓
ReceiptState
   ↓
ThankYouState (Card Ejected)
```
