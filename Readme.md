# 🚀 DSA Evaluation Preparation

A focused DSA preparation repository for mastering the three techniques covered in my evaluation:

* 🔹 **Two Pointer**
* 🔹 **HashMap**
* 🔹 **Prefix Technique / Prefix Sum**

The goal is not just to solve individual problems, but to develop **pattern recognition** and the ability to combine multiple techniques in harder problems.

---

## 🎯 Evaluation Goal

The evaluation is expected to contain problems ranging from basic technique-based questions to **multi-concept problems**.

Therefore, preparation follows this progression:

```text
Basic Technique
      ↓
Medium Technique
      ↓
Two-Concept Problems
      ↓
Multi-Concept Problems
      ↓
All 3 Techniques
      ↓
Timed Mock Evaluation
```

---

# 📚 Topics

## 1. Two Pointer

Core concepts:

* Opposite-direction pointers
* Same-direction pointers
* Fast & slow pointers
* Sorted array + two pointers
* Sliding window
* Variable-size windows
* Fixed-size windows

---

## 2. HashMap

Core concepts:

* Key-value mapping
* `put()`
* `get()`
* `containsKey()`
* `getOrDefault()`
* `remove()`
* Frequency counting
* Duplicate detection
* Index/value mapping
* Complement lookup
* Character frequency
* Prefix Sum + HashMap

### Most important patterns

```text
Frequency
   ↓
Duplicates
   ↓
Complement
   ↓
Index Mapping
   ↓
Prefix Sum + HashMap
```

---

## 3. Prefix Technique

Core concepts:

* Prefix Sum
* Running Sum
* Range Sum
* Subarray Sum
* Prefix Sum + HashMap
* Prefix transformations
* Difference between prefix and sliding-window approaches

Important pattern:

```text
prefix[i] - prefix[j] = target
```

---

# 🟢 Phase 1 — Basic HashMap

The first priority is to become comfortable with HashMap itself.

| #  | Problem                            | Platform     | Status |
| -- | ---------------------------------- | ------------ | ------ |
| 1  | Two Sum                            | LeetCode 1   | ⬜      |
| 2  | Contains Duplicate                 | LeetCode 217 | ⬜      |
| 3  | Valid Anagram                      | LeetCode 242 | ⬜      |
| 4  | Majority Element                   | LeetCode 169 | ⬜      |
| 5  | First Unique Character in a String | LeetCode 387 | ⬜      |
| 6  | Ransom Note                        | LeetCode 383 | ⬜      |
| 7  | Intersection of Two Arrays         | LeetCode 349 | ⬜      |
| 8  | Intersection of Two Arrays II      | LeetCode 350 | ⬜      |
| 9  | Isomorphic Strings                 | LeetCode 205 | ⬜      |
| 10 | Happy Number                       | LeetCode 202 | ⬜      |

### Goal

Be able to identify:

```text
Need frequency?
      → HashMap

Need existence?
      → HashSet / HashMap

Need index?
      → HashMap

Need previous value?
      → HashMap
```

---

# 🟡 Phase 2 — Medium HashMap

| #  | Problem                                        | Platform     | Status |
| -- | ---------------------------------------------- | ------------ | ------ |
| 11 | Group Anagrams                                 | LeetCode 49  | ⬜      |
| 12 | Top K Frequent Elements                        | LeetCode 347 | ⬜      |
| 13 | Longest Consecutive Sequence                   | LeetCode 128 | ⬜      |
| 14 | Longest Substring Without Repeating Characters | LeetCode 3   | ⬜      |
| 15 | Longest Repeating Character Replacement        | LeetCode 424 | ⬜      |
| 16 | Minimum Window Substring                       | LeetCode 76  | ⬜      |
| 17 | Find All Anagrams in a String                  | LeetCode 438 | ⬜      |
| 18 | Sort Characters By Frequency                   | LeetCode 451 | ⬜      |
| 19 | 4Sum II                                        | LeetCode 454 | ⬜      |
| 20 | Subarray Sum Equals K                          | LeetCode 560 | ⬜      |

⭐ **Problem #20 is especially important.**

It introduces the combination:

```text
Prefix Sum + HashMap
```

---

# 🔥 Phase 3 — HashMap + Two Pointer

These problems introduce multiple concepts.

| #  | Problem                                        | Concepts                     | Status |
| -- | ---------------------------------------------- | ---------------------------- | ------ |
| 21 | Longest Substring Without Repeating Characters | HashMap + Two Pointer        | ⬜      |
| 22 | Longest Repeating Character Replacement        | HashMap + Two Pointer        | ⬜      |
| 23 | Permutation in String                          | HashMap + Two Pointer        | ⬜      |
| 24 | Find All Anagrams in a String                  | HashMap + Two Pointer        | ⬜      |
| 25 | Minimum Window Substring                       | HashMap + Two Pointer        | ⬜      |
| 26 | Fruit Into Baskets                             | HashMap + Sliding Window     | ⬜      |
| 27 | Max Consecutive Ones III                       | Two Pointer + Sliding Window | ⬜      |
| 28 | Subarrays with K Different Integers            | HashMap + Two Pointer        | ⬜      |

### Pattern

```text
Two Pointer
     +
HashMap
     ↓
Sliding Window
```

---

# 🔥 Phase 4 — HashMap + Prefix Sum

This is one of the **highest-priority sections**.

| #  | Problem                        | Platform      | Status |
| -- | ------------------------------ | ------------- | ------ |
| 29 | Subarray Sum Equals K          | LeetCode 560  | ⬜      |
| 30 | Contiguous Array               | LeetCode 525  | ⬜      |
| 31 | Binary Subarrays With Sum      | LeetCode 930  | ⬜      |
| 32 | Subarray Sums Divisible by K   | LeetCode 974  | ⬜      |
| 33 | Continuous Subarray Sum        | LeetCode 523  | ⬜      |
| 34 | Count Number of Nice Subarrays | LeetCode 1248 | ⬜      |
| 35 | Make Sum Divisible by P        | LeetCode 1590 | ⬜      |
| 36 | Path Sum III                   | LeetCode 437  | ⬜      |

### Core pattern

```text
Current Prefix
      -
Previous Prefix
      =
Required Sum
```

HashMap stores previous prefix information.

---

# 🟠 Phase 5 — Two Pointer + Prefix / Mixed Techniques

| #  | Problem                      | Platform     | Status |
| -- | ---------------------------- | ------------ | ------ |
| 37 | 3Sum                         | LeetCode 15  | ⬜      |
| 38 | 3Sum Closest                 | LeetCode 16  | ⬜      |
| 39 | 4Sum                         | LeetCode 18  | ⬜      |
| 40 | Container With Most Water    | LeetCode 11  | ⬜      |
| 41 | Trapping Rain Water          | LeetCode 42  | ⬜      |
| 42 | Subarray Product Less Than K | LeetCode 713 | ⬜      |

The purpose of this phase is **not** just solving these questions.

The goal is learning:

> Which technique should I recognize from the problem?

---

# 🔴 Phase 6 — Multi-Concept Problems

These are closer to the expected difficulty of a harder evaluation.

| #  | Problem                                        | Concepts                               | Status |
| -- | ---------------------------------------------- | -------------------------------------- | ------ |
| 43 | 3Sum                                           | Sorting + Two Pointer                  | ⬜      |
| 44 | 4Sum                                           | Sorting + Two Pointer                  | ⬜      |
| 45 | Longest Substring Without Repeating Characters | HashMap + Two Pointer + Sliding Window | ⬜      |
| 46 | Minimum Window Substring                       | HashMap + Two Pointer + Sliding Window | ⬜      |
| 47 | Permutation in String                          | HashMap + Two Pointer + Sliding Window | ⬜      |
| 48 | Subarrays with K Different Integers            | HashMap + Two Pointer + Sliding Window | ⬜      |
| 49 | Subarray Sum Equals K                          | Prefix Sum + HashMap                   | ⬜      |
| 50 | Contiguous Array                               | Prefix Sum + HashMap                   | ⬜      |
| 51 | Binary Subarrays With Sum                      | Prefix Sum + HashMap                   | ⬜      |
| 52 | Subarray Sums Divisible by K                   | Prefix Sum + HashMap                   | ⬜      |
| 53 | Count Number of Nice Subarrays                 | Prefix + HashMap / Sliding Window      | ⬜      |
| 54 | 4Sum II                                        | HashMap + Multiple Arrays              | ⬜      |

---

# ☠️ Phase 7 — All 3 Techniques

There are relatively few clean problems that require **all three techniques simultaneously**, since some patterns overlap.

However, these are excellent final-preparation problems:

| #  | Problem                                        | Concepts                               | Status |
| -- | ---------------------------------------------- | -------------------------------------- | ------ |
| 55 | Subarray Sum Equals K                          | Prefix + HashMap                       | ⬜      |
| 56 | Binary Subarrays With Sum                      | Prefix + HashMap                       | ⬜      |
| 57 | Subarrays with K Different Integers            | HashMap + Two Pointer + Sliding Window | ⬜      |
| 58 | Count Number of Nice Subarrays                 | Prefix + HashMap + Sliding Window      | ⬜      |
| 59 | Minimum Window Substring                       | HashMap + Two Pointer + Sliding Window | ⬜      |
| 60 | Longest Substring Without Repeating Characters | HashMap + Two Pointer + Sliding Window | ⬜      |

> The purpose of this section is to simulate the **multi-concept thinking** expected in a difficult evaluation.

---

# 🧠 Pattern Recognition Cheat Sheet

Before coding, ask:

### Is the problem asking...

```text
"Have I seen this before?"
        ↓
HashSet / HashMap
```

```text
"How many times does X occur?"
        ↓
Frequency HashMap
```

```text
"Where did I see X?"
        ↓
HashMap
```

```text
"Does the complement exist?"
        ↓
HashMap
```

```text
"Does a subarray have a particular sum?"
        ↓
Prefix Sum
        +
HashMap
```

```text
"Find the longest/shortest valid window?"
        ↓
Two Pointer
        +
HashMap
```

```text
"Find pairs in a sorted array?"
        ↓
Two Pointer
```

---

# 📊 Preparation Strategy

Do **not** try to finish all 60 problems immediately.

Recommended progression:

```text
10 Basic HashMap
       ↓
10 Medium HashMap
       ↓
10 HashMap + Two Pointer
       ↓
10 HashMap + Prefix
       ↓
10 Mixed Problems
       ↓
Mock Evaluation
```

### Priority

```text
HashMap Fundamentals       ⭐⭐⭐⭐⭐
Frequency Maps             ⭐⭐⭐⭐⭐
Prefix + HashMap            ⭐⭐⭐⭐⭐
HashMap + Two Pointer       ⭐⭐⭐⭐⭐
Sliding Window              ⭐⭐⭐⭐
Basic Two Pointer           ⭐⭐⭐
Advanced Mixed Problems     ⭐⭐⭐⭐⭐
```

---

# 🏆 Final Target

Before the evaluation, I should be able to:

* Identify the required technique without immediately looking at the solution.
* Implement a HashMap in Java confidently.
* Use frequency maps naturally.
* Use HashMap for lookup/complement problems.
* Combine HashMap with Two Pointer.
* Combine HashMap with Prefix Sum.
* Recognize Sliding Window patterns.
* Solve unseen problems using pattern recognition.
* Explain the time and space complexity.
* Solve problems under a time limit.

---

# ⏱️ Mock Evaluation

After completing the problem set, simulate the actual evaluation.

### Mock 1

**Easy → Medium**

Focus:

* Individual techniques
* Basic pattern recognition

### Mock 2

**Medium**

Focus:

* Two concepts
* No hints

### Mock 3

**Hard**

Focus:

* Multiple concepts
* Unseen questions
* Strict time limit

### Mock 4 — Final

```text
No topic names
No hints
No solution lookup
Strict timer
Randomized questions
```

The goal is to reproduce the actual evaluation environment as closely as possible.

---

# 💻 Language

All solutions will primarily be implemented in:

```text
Java
```

Solutions should prioritize:

* Clean logic
* Correctness
* Optimal/appropriate complexity
* Readability
* Pattern recognition

---

# 📈 Progress

```text
HashMap Fundamentals      ⬜
Basic Problems            ⬜
Medium Problems           ⬜
HashMap + Two Pointer     ⬜
HashMap + Prefix          ⬜
Mixed Problems            ⬜
Mock Evaluations          ⬜
Final Evaluation Ready    ⬜
```

---

## 🚀 End Goal

> **Don't memorize solutions. Master the patterns.**

The final objective is to look at a new problem and think:

```text
What information do I need to remember?
        ↓
What relationship am I looking for?
        ↓
Which technique gives me that efficiently?
        ↓
Can I combine two or more techniques?
        ↓
Code → Test → Analyze Complexity
```

**DSA Evaluation Preparation — HashMap × Two Pointer × Prefix Sum**
