# ConcurrentModificationException in Kotlin
This repository demonstrates a common error in Kotlin involving the `removeIf()` function and `ConcurrentModificationException`. The `bug.kt` file contains code that throws this exception, and `bugSolution.kt` provides a corrected version.

## Problem
The `removeIf()` function modifies the list while it's being iterated. This causes a `ConcurrentModificationException` if another operation tries to access the list during this process. 

## Solution
The solution involves using an iterator to safely remove elements from the list during iteration, thereby avoiding the exception.

## How to reproduce
1. Clone this repository.
2. Compile and run `bug.kt`. It will throw `ConcurrentModificationException`.
3. Run `bugSolution.kt` to see a working example.