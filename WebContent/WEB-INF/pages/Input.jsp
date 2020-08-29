<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CodePlanetEmail</title>

<link href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css" rel="stylesheet">
</head>
<body>
		<section>
        <div class="container px-5 py-24 mx-auto">
          <div class="flex flex-col text-center w-full mb-12">
            <h1 class="sm:text-3xl text-2xl font-medium title-font mb-4 text-gray-900">CodePlanet Technologies Email</h1>
            <p class="lg:w-2/3 mx-auto leading-relaxed text-base">You can send Email to any one with Calender Notification.</p>
          </div>
          <form id="myForm" action="/CodePlanetEmail/EmailCodePlanet" method="post">
          <div class="flex lg:w-2/3 w-full sm:flex-row flex-col mx-auto px-8 sm:px-0">
            <input type="email" class="flex-grow w-full bg-gray-100 rounded border border-gray-400 focus:outline-none focus:border-purple-500 text-base px-4 py-2 mr-4 mb-4 sm:mb-0" placeholder="SenderEmail" name="SenderUsername">
            <input type="text" class="flex-grow w-full bg-gray-100 rounded border border-gray-400 focus:outline-none focus:border-purple-500 text-base px-4 py-2 mr-4 mb-4 sm:mb-0" placeholder="Password" name="password">
          </div>
          <br>
          <div class="flex lg:w-2/3 w-full sm:flex-row flex-col mx-auto px-8 sm:px-0">
          	<input type="email" class="flex-grow w-full bg-gray-100 rounded border border-gray-400 focus:outline-none focus:border-purple-500 text-base px-4 py-2 mr-4 mb-4 sm:mb-0" placeholder="ReceiverEmail" name="ReceiverUsername">
         	<button type="submit" class="text-white bg-purple-500 border-0 py-2 px-8 focus:outline-none hover:bg-purple-600 rounded text-lg" >Submit</button>
          </div>
        </form>
        </div>
      </section>
      
      
      
      
</body>
</html>