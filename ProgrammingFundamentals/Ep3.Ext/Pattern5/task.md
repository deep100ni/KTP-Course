### Pattern 5

Define the required function to print the following pattern :

```text
+  *  +
 + * +
  +*+
*******
  +*+
 + * +
+  *  +
```

<div class="hint">
Break the pattern into 3 parts and write separate code for each part.

The outer loop of the first part i.e. lines above the center line will repeat `n/2` times, printing in vertical direction.

The inner loop of the first part will repeat `n` times, printing in horizontal direction. Identify the position of `char1` & `char2` with respect to the inner loop variable. Then, using conditional statements (`if-else` or `when`), print `char1`, `char2` & space as required.
</div>