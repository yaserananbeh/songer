# Songer
## v1.0
this app responsible to set up the server for songer application 
you can use the gradle to run the app 
and the javac to run the test

## To Run the app
- clone the repo in your device
- change the database configuration to be as what you have from the application.properties file that exist inside the resources folder
- change the username and the password and the url 
- reset the application to make sure that the database entities became exist in your database server 
- after that run the app using type ./gradlew bootRun in your terminal to start the app and then go to your localhost in the browser and enjoy our services

## The endpoints that we have and some information about each one 
- /hello to show the user greeting message and ensure that the server working properly 
- /capitalize/{and provide any statement} this end point will show you the text after make it capitalize 
- /  the landing page end point will show you the cover and the navigation buttons
- /albums this endpoint will show the user each album in the songer app with some details about each one and from this page the user can navigate to the addalbum end point  
- /addalbum this page will display a form that make the users able to add their own albums to our website and after submitting the form will return them to the album page 
- /showalbum this endpoint will represent the details for each album with the songs that belong to the album itself 
- /addsongforalbum this page displays a form that can the user fill and submit to add a song 
- /songs this page will display the all songs that we provide in the website regardless it belongs to any album