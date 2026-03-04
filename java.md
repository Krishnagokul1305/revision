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
