mvnurl-maven-plugin
===================

Mojo that provides a goal `regscheme` under which the custom `URLStreamHandlerFactory` registers handlers that can recognize and resolve the [PAX MVN URL protocol](https://ops4j1.jira.com/wiki/display/paxurl/Mvn+Protocol).

However, this plugin does not use the custom PAX MVN URL resolver. Instead it is based adopt the Maven 3.0.x Aether `ArtifactResolver`.
The `URLStreamHandlerFactory` implementation used in this plugin can also be used standalone. In such a case some assumptions are made.

By default if no schemes are explicitly provided to `regscheme`, it registers handlers for the schemes `mvn` and `maven`.

## Err.. Why ?

You nearly always have the need to do something with maven artifacts in a maven build. The traditional way is to leverage the `maven-depedency-plugin` and its sisters. However, these plugins have _really_ long and verbose dependency declarators. If you like the verbosity and _love_ gargantuan POM files, then more power to you - just hit Ctrl+W here and proceed on your way. For folks who wish a bit of sanity, the PAX MVN URL scheme is short and sweet. Once this mojo has been called - it is a singleton mojo that binds early - you can use maven URL's in your other mojos.


## TODO:
- Provide a usage guide: document the classes used.
- assumptions made by standalone ``URLStreamHandlerFactory``

## Quick Start

## Bug Tracker

## Copyright and license
[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt)


