function tellAge() {
    // Read value of yearOfBirth from the input field 
   
    let yearOfBirth = parseInt(document.getElementById("yearOfBirth").value);

    // Figure out the current date into today variable 
  


    // Use getFullYear() method to get the current year out from the today variable
   
    let currentYear = new Date().getFullYear();

    // Calculate the (rough estimate of the) age

    let age = currentYear - yearOfBirth;
    
    if (isNaN(yearOfBirth) || yearOfBirth > new Date().getFullYear()) {
        document.getElementById("answer").innerHTML = "Please enter a valid year of birth.";
        return;
    }

    document.getElementById("answer").innerHTML = "You are now " + age + " years old.<br> (Current year is " + currentYear + ".)";

}