function calculateSalary(hours, hourlySalary) {
    // calculate salary
    let grossSalary = hours*hourlySalary;
    // return the gross salary with the return statement
    return grossSalary;
}

function showGrossSalary() {
    // assign the input field value to the variable hours
    let hours = document.getElementById("hours").value;

    // assign the second input field value to the variable hourlySalary
    let hourlySalary = document.getElementById("hourlySalary").value;

    // call the calculateSalary function
    let grossSalary = calculateSalary(hours, hourlySalary);

    // write the answer on the html page
    document.getElementById("answer").innerHTML = "Gross salary is " + grossSalary.toFixed(2) + " euros."
}