function calculateRent() {
	let totalRent = parseFloat(document.getElementById("rent").value);
    let participants = parseInt(document.getElementById("participants").value);
    
    if (isNaN(totalRent) || isNaN(participants) || totalRent <= 0 || participants <= 0) {
        document.getElementById("answerDiv").innerHTML = "Please enter valid numbers.";
        return;
    }

    var costPerPerson = totalRent / participants;

    document.getElementById("answerDiv").innerHTML = "Rent per participants is " + costPerPerson.toFixed(2) + " euros.";
}	