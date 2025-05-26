// 34_JavaModulesExample.java
// This example demonstrates two modules: com.greetings and com.utils.
// The modules require separate directories and a module-info.java file for each.
// The following code snippet represents the usage in com.greetings module.

// In com/utils/Utility.java:
package com.utils;

public class Utility {
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

// In com/greetings/Greetings.java:
package com.greetings;

import com.utils.Utility;

public class Greetings {
    public static void main(String[] args) {
        Utility.greet("World");
    }
}

/*
To compile and run:
1. Create directories com/utils and com/greetings.
2. Place the respective .java files and module-info.java files.
3. Example module-info.java for com.utils:
   module com.utils {
       exports com.utils;
   }
4. And for com.greetings:
   module com.greetings {
       requires com.utils;
   }
5. Compile using:
   javac -d mods/com.utils com/utils/Utility.java module-info.java (in com/utils)
   javac --module-path mods -d mods/com.greetings com/greetings/Greetings.java module-info.java (in com/greetings)
6. Run using:
   java --module-path mods -m com.greetings/com.greetings.Greetings
*/
