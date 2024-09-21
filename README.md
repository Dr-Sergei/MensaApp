# MensaApp
#Project Overview
The Mensa Account Balance Management App is a Java-based application designed to help students, employees, and guests efficiently manage their account balances related to expenditures at their university cafeteria (Mensa). The app provides an easy-to-use interface for retrieving, tracking, and monitoring daily cafeteria menu items, along with the associated costs for different user categories: students, staff, and external guests.

Using Selenium WebDriver, the app interacts with the online Mensa platform to automatically extract daily menu information and corresponding prices. This allows users to keep track of their cafeteria expenses in a more structured and automated manner.

#Key Features
Menu Extraction: Automatically fetches daily Mensa menus, including dish names, images, and prices for students, employees, and external guests.
Account Balance Management: Tracks user expenses based on selected meals and updates their available balance.
Dynamic Content Loading: Utilizes Selenium to load and extract dynamic content such as the current day’s menu with up-to-date prices.
User Categories: Supports different pricing models based on the user's status (student, staff, guest).

#Installation & Setup
#Pre-requisites:

Java Development Kit (JDK) 8 or later installed.
Maven for dependency management.
Firefox browser installed.
Geckodriver (compatible with your operating system) for Selenium.
Internet connection to access the Mensa website.
Clone the repository:

git clone https://github.com/yourusername/mensa-balance-management-app.git
Navigate to the project directory:

cd mensa-balance-management-app
Install dependencies: Run the following command to download the required dependencies via Maven:

mvn install
Set up Selenium WebDriver:

Download the correct version of geckodriver from here.
Extract and place the geckodriver executable in your desired directory.
Update the geckodriver path in the source code:
java

System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

#Usage
Run the application: After setting up the dependencies and configuring the geckodriver path, you can run the application using:

mvn exec:java -Dexec.mainClass="MensaMenuExtractor"
Interaction with the Mensa platform:

The app will open a Firefox browser window, navigate to the Mensa website, select the appropriate Mensa location, click the "Heute" (Today) button to load the current menu, and extract the menu details.
It will then display the dishes, images, and prices for students, employees, and guests.
Balance Management:

Future updates will allow users to input their current account balance, track their spending based on selected meals, and view their remaining balance after each transaction.

#Future Enhancements
User Authentication: Allow users to log in and save their preferences (balance, favorite meals, etc.).
Balance Tracking: Add a feature for managing multiple account balances across different Mensa locations.
Mobile Support: Create a mobile-friendly version for on-the-go tracking.
Notification System: Send notifications to users when their balance is low or when new menus are available.
