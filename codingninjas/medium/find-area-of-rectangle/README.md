# Find Area of Rectangle

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

# Find Area of Rectangle
Easy
0/40
1900 upvotes
Asked in company
## Problem statement
Send feedback

Take the length(L) and breadth(B) of the rectangle as input and find its area.

 **Note:** 

```
Length and breadth must be an integer value and the area will always be in the range of integers.

```

Detailed explanation (Input/output format, Notes, Images)
 **Constraints:** 

```
1 <= L, B <= 10ˆ2

```

 **Sample Input 1:** 

```
4 20

```

 **Sample Output 1:** 

```
80

```

 **Explanation of Sample Input 1:** 

```
Length of the rectangle is 4 and breadth is 20. 
Hence the area of the rectangle is (length*breadth). 
So the answer is 4*20=80.

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T13:13:49.215Z  

```cpp
#include <iostream>
using namespace std;

int main() {
    int L, B;

    cin >> L >> B;

    int area = L * B;

    cout << area << endl;

    return 0;
}
```

---

[View on Coding Ninjas](https://www.naukri.com/code360/problems/find-area-of-rectangle_1112574?interviewProblemRedirection=true&leftPanelTabValue=SUBMISSION)