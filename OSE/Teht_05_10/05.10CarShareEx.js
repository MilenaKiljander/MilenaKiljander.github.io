function calculateCosts() {

    let kilometers = parseFloat(document.getElementById("kilometers").value);
    let consumption = parseFloat(document.getElementById("consumption").value);
    let price = parseFloat(document.getElementById("price").value);
    let participants = parseInt(document.getElementById("participants").value);

    // Check if the input is valid
    if (isNaN(kilometers) || isNaN(consumption) || isNaN(price) || isNaN(participants) || kilometers <= 0 || consumption <= 0 || price <= 0 || participants <= 0) {
        document.getElementById("answerId").innerHTML = "Please enter valid numbers.";
        return;
    }

    // Calculate fuel costs per participant
    let fuelCostPerParticipant = (consumption / 100) * price * (kilometers / participants);

    // Display the result
    document.getElementById("answerId").innerHTML = "Fuel costs per participant is " + fuelCostPerParticipant.toFixed(2) + " euros.";
}
    
