                          +-------------------------+
                          | FileSystemComponent      |
                          +-------------------------+
                          | + showDetails(): void    |  <--- Interface
                          +-------------------------+
                                   ^
                                   |
            +----------------------+----------------------+
            |                                             |
  +------------------------+                +----------------------------+
  | File                    |                | Directory                  |
  +------------------------+                +----------------------------+
  | - name: String          |                | - name: String              |
  +------------------------+                | - components: List<FileSystemComponent>|
  | + showDetails(): void   |                +----------------------------+
  +------------------------+                | + addComponent(FileSystemComponent): void|
                                             | + removeComponent(FileSystemComponent): void|
                                             | + showDetails(): void                     |
                                             +----------------------------+
                                                         |
                                                 has-a relationship
                                                 (Directory can contain File or Directory)

