# What

It's Kotlin code compiled to JS.

# How to compile

    ./gradlew build


Two files will be created in web/
- kotlin.js contains Kotlin's standard library
- KotlinSim.js contains this project code

# Usage

Include the two JS files, in order, in some HTML page.
They both export stuff to the global scope.
You can now use their values, functions :

    window.KotlinSim.someExposedFunction(...)
