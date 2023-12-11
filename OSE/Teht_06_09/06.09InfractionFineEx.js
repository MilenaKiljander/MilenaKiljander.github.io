function tellInfractionFine() {
    let drivingSpeed = parseInt(document.getElementById("drivingSpeed").value);
    let speedLimit = parseInt(document.getElementById("speedLimit").value);

    if (isNaN(drivingSpeed) || isNaN(speedLimit) || drivingSpeed < 0 || speedLimit <= 0) {
        document.getElementById("answer").innerHTML = "Please enter valid speed values.";
        return;
    }

    let excessSpeed = drivingSpeed - speedLimit;

    let infractionFine;

    if (speedLimit >= 10 && speedLimit <= 60) {
        if (excessSpeed <= 15) {
            infractionFine = 85;
        } else if (excessSpeed <= 20) {
            infractionFine = 115;
        }
    } else if (speedLimit >= 70 && speedLimit <= 120) {
        if (excessSpeed <= 15) {
            infractionFine = 70;
        } else if (excessSpeed <= 20) {
            infractionFine = 100;
        }
    }

    if (infractionFine) {
        document.getElementById("answer").innerHTML = "Infraction fine is " + infractionFine + " euros.";
    } else if (excessSpeed > 20) {
        document.getElementById("answer").innerHTML = "Income-based unit fine.";
    } else {
        document.getElementById("answer").innerHTML = "No speeding, no fine.";
    }
}

