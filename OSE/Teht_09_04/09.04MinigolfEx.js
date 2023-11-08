// Create an array with minigolf results of eight players 
let minigolf = [23, 19, 37, 20, 21, 30, 26, 24];

function showResults() {
    // Sort the array
    minigolf.sort();

    // Assign the smallest result of to a variable
    let smallestResult = minigolf[0];

    // Assign the index of last array item to an variable
    let lastIndexValue = minigolf.length - 1;

    // Assign the biggest result to a variable
    let maxResult = minigolf[minigolf.length-1];

    // Write the answer on the page, to the answer div, as content of the div
    let text = "The smallest result is " + smallestResult + "(winner).";
    text = text + "<br>The biggest result is " + maxResult + ".";

    document.getElementById('answer').innerHTML = text;


}