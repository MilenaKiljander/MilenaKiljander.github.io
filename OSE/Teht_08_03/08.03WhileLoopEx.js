// Function to display the confirm dialog box
function showConfirmDialog() {
    // Display the confirm dialog box
    var userResponse = confirm("Do you want to continue?");
  
    // Check user response
    if (userResponse) {
      // If OK button is clicked, show the alert dialog
      alert("Hello!");
  
      // After the user closes the alert dialog, call the function again
      showConfirmDialog();
    }
    // If Cancel button is clicked, do nothing
  }
  
  // Call the function to start the process
  showConfirmDialog();