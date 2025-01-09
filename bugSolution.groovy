```groovy
def myMethod(List<String> list) {
  list.each { item ->
    println item?.toString() //Safe Navigation
  }
}

myMethod(["apple", null, "banana"])
```