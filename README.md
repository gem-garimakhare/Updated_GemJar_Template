# Gemjar Template Repository

Welcome to the Gemjar template repository. This repository provides a ready-to-use structure for setting up Gemjar-based test automation projects. It includes the following key components:

## 1. Locators Package

- **GemjarLocators:** The `GemjarLocators` class is the place to define and manage locators for your web application's elements. It helps keep your automation code organized and maintainable.

## 2. Step Definitions Package

- **GemjarStepDefinition:** The `GemjarStepDefinition` class contains the step definitions for your Gherkin scenarios. It allows you to implement the actions and behaviors defined in your feature files.

## 3. Hooks

- **Hook:** The `Hook` class serves as a setup hook for configuring the WebDriver and handling any setup tasks you require before running your tests.

## 4. Features

- **Features Folder:** Inside the `resources` directory, you'll find a `features` folder. It houses your Gherkin feature files, such as `GemjarFeature`. Use these files to define the actions and scenarios to be automated in your web application.

## 5. Configuration

- **gemjar-config.json:** In the `resources` directory, you'll discover the `gemjar-config.json` file. This JSON file contains all the configuration keys used in your project. It includes details like Jewel credentials, URLs, entry points, and more.

## 6. TestNG Configuration

- **testng.xml:** We've included a TestNG configuration file for running tests in parallel. Customize this file according to your testing needs.

## Getting Started

To get started with your Gemjar-based automation project using this template, follow these steps:

1. Click the "Use this template" button to create a new repository based on this template.
2. Clone the newly created repository to your local machine.
3. Customize the project by adding your own locators, step definitions, feature files, and configurations.
4. Install the necessary dependencies.
5. Start writing your feature files and automation tests.

*****You can find all the config-keys available for Gemjar in the below mentioned link*******
https://dev.azure.com/GEM-QualityEngineering/Help-GemEcosystem/_wiki/wikis/Help-GemEcosystem.wiki/60/GemJar-Config-file-keys

https://dev.azure.com/GEM-QualityEngineering/Help-GemEcosystem/_wiki/wikis/Help-GemEcosystem.wiki/209/gemjar-config.json


Feel free to contribute to this template by creating pull requests or reporting issues if you encounter any problems.

Happy testing with Gemjar!
