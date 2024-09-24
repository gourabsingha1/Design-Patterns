        +-------------------+                    
        |       File         |                    
        +-------------------+                    
        | - name: String     |                    
        +-------------------+                    
        | + showDetails(): void |                 
        +-------------------+                    


        +-------------------------+
        |      Directory           |
        +-------------------------+
        | - name: String           |
        | - files: List<File>      |   <--- has-a relationship (Directory has File)
        | - directories: List<Directory> |
        +-------------------------+
        | + addFile(File): void    |
        | + addDirectory(Directory): void |
        | + showDetails(): void    |
        +-------------------------+
