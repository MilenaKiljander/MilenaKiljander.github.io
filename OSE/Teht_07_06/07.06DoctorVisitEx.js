// Defne a function (1.) 
function kelaReimbursement(visitTime){
    let kelaKorvaus = 0;

    if (visitTime <= 10) {
        kelaKorvaus = 8;
    } else if (visitTime <= 20) {
        kelaKorvaus = 11;
    } else if (visitTime <= 30) {
        kelaKorvaus = 13.5;
    } else if (visitTime <= 45) {
        kelaKorvaus = 16.5;
    } else {
        kelaKorvaus = 21;
    }

    return kelaKorvaus;
}

// Defne a function (2.) 
function customerHasToPay(doctorsFee, kelaKorvaus, officeFee){
    let asiakasMaksaa = 0;

    asiakasMaksaa = doctorsFee - kelaKorvaus;
    if (asiakasMaksaa <= 0) {
        asiakasMaksaa = 0;
    }
    asiakasMaksaa = asiakasMaksaa + officeFee;
    return asiakasMaksaa;

}
	
	
// Define a function (3.) 
function calculate() {
    // Read values from the input fields
    let visitTime = Number(document.getElementById('length').value);
    let doctorsFee = parseFloat(document.getElementById('doctorsFee').value); 
    
    // Call the function (1.) which calculates Kela reimbursement 
    let kelaKorvaus = kelaReimbursement(visitTime);

    // Call the function (2.) which calculates amount left for the customer to pay
    let asiakasMaksaa = customerHasToPay(doctorsFee, kelaKorvaus, 15.9);
    
    // Write the answer on the page, to the answer div, as content of the div
    let tulostus = "Doctor\'s Fee is " + doctorsFee.toFixed(2) + " euros.";
    tulostus = tulostus + "<br>Kela reimbursement is " + kelaKorvaus.toFixed(2) + " euros.";
    tulostus = tulostus + "<br>Office Fee is 15.90 euros.";
    tulostus = tulostus + "<br>Customer needs to pay " + asiakasMaksaa.toFixed(2) + " euros.";

    document.getElementById('answer').innerHTML = tulostus;
    
}