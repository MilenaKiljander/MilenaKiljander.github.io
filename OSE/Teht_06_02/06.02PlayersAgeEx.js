function checkAge() {
    // Get the age input field value
    var age = document.getElementById("age").value;
  
    // Check if the user is 18 or older
    if (age >= 18) {
      // If old enough, display the message
      document.getElementById("answer").innerHTML = "Old enough to play.";
    } else {
      // If not old enough, display the message
      document.getElementById("answer").innerHTML = "Adolescents are not allowed to play.";
    }
  }