# Groovy NullPointerException in 'each' method

This repository demonstrates a common error encountered when using the `each` method in Groovy with lists containing null values.  The `each` method iterates through a collection, but doesn't inherently handle null elements, leading to potential `NullPointerExceptions`. 

The `bug.groovy` file showcases this issue.  The solution, provided in `bugSolution.groovy`, uses safe navigation and the `?` operator to prevent the exception.
