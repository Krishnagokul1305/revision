# revision

Here’s a **quick revision cheat-sheet** for the most used Java collections and utilities you mentioned. I’ll keep it **concise + practical**, showing **important methods + tiny usage examples** so you can revise fast.

---

# 1. HashMap (Key → Value)

```java
import java.util.HashMap;

HashMap<Integer, String> map = new HashMap<>();
```

### Important Methods

| Method                 | Use               |
| ---------------------- | ----------------- |
| `put(key,value)`       | Insert/update     |
| `get(key)`             | Get value         |
| `remove(key)`          | Delete            |
| `containsKey(key)`     | Check key         |
| `containsValue(value)` | Check value       |
| `size()`               | Number of entries |
| `isEmpty()`            | Check empty       |
| `clear()`              | Remove all        |
| `keySet()`             | All keys          |
| `values()`             | All values        |
| `entrySet()`           | key + value       |

### Example

```java
map.put(1,"A");
map.put(2,"B");

System.out.println(map.get(1)); // A

for(int key : map.keySet()){
    System.out.println(key + " " + map.get(key));
}
```

### Using `entrySet()` (Best & Recommended)

Access **key and value together**.

```java
for(Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " " + entry.getValue());
}
```

---

# 2. HashSet (Unique Elements)

```java
import java.util.HashSet;

HashSet<Integer> set = new HashSet<>();
```

### Important Methods

| Method        | Use           |
| ------------- | ------------- |
| `add(x)`      | Insert        |
| `remove(x)`   | Delete        |
| `contains(x)` | Check element |
| `size()`      | Count         |
| `isEmpty()`   | Check empty   |
| `clear()`     | Remove all    |
| `iterator()`  | Traverse      |

### Example

```java
set.add(10);
set.add(20);
set.add(10); // duplicate ignored

System.out.println(set.contains(20));

for(int x : set){
    System.out.println(x);
}
```

---

# 3. PriorityQueue (Heap)

Default → **Min Heap**

```java
import java.util.PriorityQueue;

PriorityQueue<Integer> pq = new PriorityQueue<>();
```

### Important Methods

| Method                | Use         |
| --------------------- | ----------- |
| `add(x)` / `offer(x)` | Insert      |
| `poll()`              | Remove min  |
| `peek()`              | See min     |
| `remove()`            | Remove head |
| `size()`              | Count       |
| `isEmpty()`           | Check       |

### Example

```java
pq.add(5);
pq.add(1);
pq.add(3);

System.out.println(pq.peek()); // 1

while(!pq.isEmpty()){
    System.out.println(pq.poll());
}
```

### Max Heap

```java
PriorityQueue<Integer> pq =
    new PriorityQueue<>((a,b) -> b-a);
```

---

# 4. Deque (Double Ended Queue)

```java
import java.util.ArrayDeque;

Deque<Integer> dq = new ArrayDeque<>();
```

### Important Methods

| Method        | Use          |
| ------------- | ------------ |
| `addFirst(x)` | Insert front |
| `addLast(x)`  | Insert back  |
| `pollFirst()` | Remove front |
| `pollLast()`  | Remove back  |
| `peekFirst()` | See front    |
| `peekLast()`  | See back     |

### Example

```java
dq.addFirst(1);
dq.addLast(2);

System.out.println(dq.peekFirst()); // 1

dq.pollLast();
```

Used for:

- **Sliding window**
- **Monotonic queue**
- **Stack + Queue both**

---

# 5. Stack

```java
import java.util.Stack;

Stack<Integer> stack = new Stack<>();
```

### Important Methods

| Method      | Use         |
| ----------- | ----------- |
| `push(x)`   | Insert      |
| `pop()`     | Remove      |
| `peek()`    | Top element |
| `empty()`   | Check empty |
| `search(x)` | Position    |

### Example

```java
stack.push(10);
stack.push(20);

System.out.println(stack.peek()); // 20

stack.pop();
```

Note: Many prefer **Deque instead of Stack**

---

# 6. ArrayList

```java
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();
```

### Important Methods

| Method          | Use             |
| --------------- | --------------- |
| `add(x)`        | Insert          |
| `add(index,x)`  | Insert at index |
| `get(index)`    | Access          |
| `set(index,x)`  | Update          |
| `remove(index)` | Delete          |
| `size()`        | Count           |
| `contains(x)`   | Check           |
| `clear()`       | Remove all      |

### Example

```java
list.add(10);
list.add(20);

System.out.println(list.get(1));

for(int x : list){
    System.out.println(x);
}
```

---

# 7. StringBuilder

Mutable string (fast)

```java
StringBuilder sb = new StringBuilder();
```

### Important Methods

| Method              | Use         |
| ------------------- | ----------- |
| `append(x)`         | Add         |
| `insert(i,x)`       | Insert      |
| `delete(start,end)` | Remove      |
| `deleteCharAt(i)`   | Remove char |
| `reverse()`         | Reverse     |
| `charAt(i)`         | Access      |
| `setCharAt(i,c)`    | Replace     |
| `length()`          | Length      |
| `toString()`        | Convert     |

### Example

```java
StringBuilder sb = new StringBuilder();

sb.append("Hello");
sb.append(" World");

System.out.println(sb.toString());

sb.reverse();
```

---

# 8. String Methods

```java
String s = "Hello World";
```

### Important Methods

| Method                    | Use                            |
| ------------------------- | ------------------------------ |
| `length()`                | String length                  |
| `charAt(i)`               | Character at index             |
| `substring(start)`        | From start to end              |
| `substring(start, end)`   | From start to end-1            |
| `contains(CharSequence)`  | Check if contains substring    |
| `indexOf(str)`            | First index of substring       |
| `indexOf(str, fromIndex)` | Index from position            |
| `lastIndexOf(str)`        | Last occurrence index          |
| `startsWith(prefix)`      | Check prefix                   |
| `endsWith(suffix)`        | Check suffix                   |
| `equals(str)`             | Compare content                |
| `equalsIgnoreCase(str)`   | Compare ignoring case          |
| `compareTo(str)`          | Lexicographic compare          |
| `toLowerCase()`           | Convert to lowercase           |
| `toUpperCase()`           | Convert to uppercase           |
| `trim()`                  | Remove leading/trailing spaces |
| `strip()`                 | Remove whitespace (Java 11+)   |
| `replace(old, new)`       | Replace all occurrences        |
| `replaceAll(regex, new)`  | Replace with regex             |
| `split(regex)`            | Split into array               |
| `toCharArray()`           | Convert to char array          |
| `isEmpty()`               | Check if length is 0           |
| `isBlank()`               | Check if empty/whitespace      |

### Example

```java
String s = "Hello World";

// contains & indexOf
System.out.println(s.contains("World"));    // true
System.out.println(s.indexOf("o"));         // 4
System.out.println(s.lastIndexOf("o"));     // 7
System.out.println(s.indexOf("o", 5));      // 7

// substring
System.out.println(s.substring(6));         // World
System.out.println(s.substring(0, 5));      // Hello

// split
String[] parts = "a,b,c".split(",");        // ["a","b","c"]

// replace
String replaced = s.replace("World", "Java"); // Hello Java
```

---

# 9. Arrays Utility (java.util.Arrays)

```java
import java.util.Arrays;
```

### Important Methods

| Method                              | Use                    |
| ----------------------------------- | ---------------------- |
| `Arrays.sort(arr)`                  | Sort ascending         |
| `Arrays.sort(arr, comparator)`      | Sort with custom order |
| `Arrays.binarySearch(arr, key)`     | Search in sorted array |
| `Arrays.fill(arr, value)`           | Fill all elements      |
| `Arrays.copyOf(arr, newLen)`        | Copy with new length   |
| `Arrays.copyOfRange(arr, from, to)` | Copy range [from, to)  |
| `Arrays.equals(arr1, arr2)`         | Compare arrays         |
| `Arrays.deepEquals(arr1, arr2)`     | Compare 2D arrays      |
| `Arrays.toString(arr)`              | Print 1D array         |
| `Arrays.deepToString(arr)`          | Print 2D array         |
| `Arrays.asList(arr)`                | Convert to List        |
| `Arrays.stream(arr)`                | Create stream          |

### Example

```java
int[] arr = {5, 2, 8, 1, 9};

// sort
Arrays.sort(arr);                           // [1, 2, 5, 8, 9]

// binarySearch (array must be sorted)
int idx = Arrays.binarySearch(arr, 5);      // 2

// fill
int[] filled = new int[5];
Arrays.fill(filled, 7);                     // [7, 7, 7, 7, 7]

// copyOf & copyOfRange
int[] copy = Arrays.copyOf(arr, 3);         // [1, 2, 5]
int[] range = Arrays.copyOfRange(arr, 1, 4); // [2, 5, 8]

// toString
System.out.println(Arrays.toString(arr));   // [1, 2, 5, 8, 9]

// 2D array
int[][] matrix = {{1,2}, {3,4}};
System.out.println(Arrays.deepToString(matrix)); // [[1,2], [3,4]]

// asList (for Objects only)
String[] strs = {"a", "b", "c"};
List<String> list = Arrays.asList(strs);
```

### Sort with Custom Comparator

```java
Integer[] nums = {5, 2, 8, 1};

// Descending order
Arrays.sort(nums, (a, b) -> b - a);         // [8, 5, 2, 1]

// Sort 2D array by first element
int[][] intervals = {{3,4}, {1,2}, {2,5}};
Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
```

---

# 10. Collections Utility (java.util.Collections)

```java
import java.util.Collections;
```

### Important Methods

| Method                                | Use                 |
| ------------------------------------- | ------------------- |
| `Collections.sort(list)`              | Sort list           |
| `Collections.reverse(list)`           | Reverse list        |
| `Collections.shuffle(list)`           | Random shuffle      |
| `Collections.max(collection)`         | Find maximum        |
| `Collections.min(collection)`         | Find minimum        |
| `Collections.frequency(c, obj)`       | Count occurrences   |
| `Collections.binarySearch(list, key)` | Search sorted list  |
| `Collections.fill(list, obj)`         | Fill all with value |
| `Collections.swap(list, i, j)`        | Swap two elements   |
| `Collections.rotate(list, n)`         | Rotate elements     |

### Example

```java
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 1));

Collections.sort(list);                     // [1, 2, 5, 8]
Collections.reverse(list);                  // [8, 5, 2, 1]
Collections.shuffle(list);                  // random order

System.out.println(Collections.max(list));  // 8
System.out.println(Collections.min(list));  // 1

// frequency
List<Integer> nums = Arrays.asList(1, 2, 2, 3, 2);
System.out.println(Collections.frequency(nums, 2)); // 3
```

---

# Quick Interview Notes

| Structure               | Time Complexity |
| ----------------------- | --------------- |
| HashMap get/put         | O(1)            |
| HashSet add             | O(1)            |
| PriorityQueue insert    | O(log n)        |
| PriorityQueue remove    | O(log n)        |
| ArrayList access        | O(1)            |
| ArrayList insert middle | O(n)            |
| Deque operations        | O(1)            |
| Stack push/pop          | O(1)            |

---

If you want, I can also give you a **“DSA contest cheat sheet” version (super short 1-page revision used in LeetCode/Codeforces)** which is much faster to revise before coding.
