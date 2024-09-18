+------------------+              +------------------+
|   UIFactory      |              |  WindowsButton   |
+------------------+              +------------------+
| + main(args:[])  |<>------------| + render()       |
+------------------+              +------------------+

                                     +------------------+
                                     |   MacButton      |
                                     +------------------+
                                     | + render()       |
                                     +------------------+

Relationships:
- UIFactory class creates and uses the concrete classes WindowsButton and MacButton.
- Directly coupled, and the code to switch between "Windows" and "Mac" is done using conditionals.

Legend:
- <>------------ : "has-a" relationship (association).