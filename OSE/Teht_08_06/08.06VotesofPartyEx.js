// Function to calculate D'Hondt comparison scores for a party
function calculateScores(votes, candidates) {
    // Convert input values to numbers
    votes = parseInt(votes, 10);
    candidates = parseInt(candidates, 10);

    // Check if input values are valid
    if (isNaN(votes) || isNaN(candidates) || votes < 1 || candidates < 1) {
        return "Invalid input. Please enter positive numeric values for votes and candidates.";
    }

    // Calculate comparison scores
    const comparisonScores = Array.from({ length: candidates }, (_, index) => {
        const ordinal = index + 1;
        const score = Math.floor(votes / ordinal);
        return `${ordinal}. candidate: ${score}`;
    });

    // Display the comparison scores with <br> after the last candidate
    return comparisonScores.join('<br>') + '<br>';
}

// Function to handle the button click and display comparison scores
function showComparisonScores() {
    // Get input values
    const votesInput = document.getElementById('votes');
    const candidatesInput = document.getElementById('candidates');

    // Get the element where the answer will be displayed
    const answerElement = document.getElementById('answer');

    // Call the calculateScores function with input values
    const result = calculateScores(votesInput.value, candidatesInput.value);

    // Display the result in the answerElement
    answerElement.innerHTML = result;
}