+------------------+              +-----------------------+
|    Application   |              |     GUIFactory        |<--<<Interface>>
+------------------+              +-----------------------+
| - button: Button |<>------------| + createButton():Button|
| - checkbox:Checkbox|            | + createCheckbox():Checkbox|
| + paint()        |              +-----------------------+
+------------------+
                                      /|\
                                       |
                +----------------------+------------------+
                |                                         |
   +-----------------------+                 +-----------------------+
   |    WindowsFactory      |                 |      MacFactory       |
   +-----------------------+                 +-----------------------+
   | + createButton():Button|                 | + createButton():Button|
   | + createCheckbox():Checkbox|             | + createCheckbox():Checkbox|
   +-----------------------+                 +-----------------------+
              |                                           |
              |                                           |
   +-------------------+                       +-------------------+
   |   WindowsButton    |                       |   MacButton       |
   +-------------------+                       +-------------------+
   | + render()        |                       | + render()        |
   +-------------------+                       +-------------------+

   +-------------------+                       +-------------------+
   | WindowsCheckbox   |                       |   MacCheckbox      |
   +-------------------+                       +-------------------+
   | + render()        |                       | + render()        |
   +-------------------+                       +-------------------+

+-------------------+                   +-----------------+
|     Button        |<<--<<Interface>>   |   Checkbox      |<<--<<Interface>>
+-------------------+                   +-----------------+
| + render()        |                   | + render()      |
+-------------------+                   +-----------------+

Relationships:
- Application class "has-a" relationship (<>------) with abstract products (Button, Checkbox).
- Abstract products (Button, Checkbox) are realized by concrete products (WindowsButton, MacButton, WindowsCheckbox, MacCheckbox).
- Abstract factory (GUIFactory) is realized by concrete factories (WindowsFactory, MacFactory).
- Client code (Application) depends on GUIFactory, not concrete implementations.

Legend:
- <>------------ : "has-a" relationship (association).
- ----->> : "is-a" relationship (inheritance or implementation).