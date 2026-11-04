# Watermelon

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green) ![Rating](https://img.shields.io/badge/Rating-*800-blue) ![Contest](https://img.shields.io/badge/Contest-Codeforces%20Beta%20Round%204%20(Div.%202%20Only)-orange)

## Problem

A. Watermelon
time limit per test1 second
memory limit per test64 megabytes

One hot summer day Pete and his friend Billy decided to buy a watermelon. They chose the biggest and the ripest one, in their opinion. After that the watermelon was weighed, and the scales showed  *w*  kilos. They rushed home, dying of thirst, and decided to divide the berry, however they faced a hard problem.

Pete and Billy are great fans of even numbers, that's why they want to divide the watermelon in such a way that each of the two parts weighs even number of kilos, at the same time it is not obligatory that the parts are equal. The boys are extremely tired and want to start their meal as soon as possible, that's why you should help them and find out, if they can divide the watermelon in the way they want. For sure, each of them should get a part of positive weight.

Input

The first (and the only) input line contains integer number  *w*  (1 ≤  *w*  ≤ 100) — the weight of the watermelon bought by the boys.

Output

Print YES, if the boys can divide the watermelon into two parts, each of them weighing even number of kilos; and NO in the opposite case.

Examples
input

```
8

```

output

```
YES

```

Note

For example, the boys can divide the watermelon into two parts of 2 and 6 kilos respectively (another variant — two parts of 4 and 4 kilos).

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 0 KB  
**Submitted:** 2026-11-04T12:59:57.940Z  

```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int w = input.nextInt();

        int pete = 2;
        int billy = w - pete;

        System.out.println(
            (billy > 0 && billy % 2 == 0) ? "YES" : "NO"
        );

        input.close();
    }
}

```

---

[View on Codeforces](https://codeforces.com/problemset/status?my=on)