mvnurl-maven-plugin
===================

Mojo that provides a goal _regscheme_ under which the custom `URLStreamHandlerFactory` registers handlers that can recognize and resolve the [PAX MVN URL protocol](https://ops4j1.jira.com/wiki/display/paxurl/Mvn+Protocol).

However, this plugin does not use the custom PAX MVN URL resolver. Instead it is based adopt the Maven 3.0.x Aether `ArtifactResolver`.
The `URLStreamHandlerFactory` implementation used in this plugin can also be used standalone. In such a case some assumptions are made.


## TODO:
- Provide a usage guide: document the classes used.
- assumptions made by standalone ``URLStreamHandlerFactory``

## Quick Start

## Bug Tracker

## Copyright and license


