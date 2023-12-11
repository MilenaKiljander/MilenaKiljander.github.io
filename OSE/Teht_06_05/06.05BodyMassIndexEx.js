function calculateBMI() {

    let weight = parseFloat(document.getElementById("weight").value);
    let height = parseFloat(document.getElementById("height").value);

    if (isNaN(weight) || isNaN(height) || weight <= 0 || height <= 0) {
        document.getElementById("answer").innerHTML = "Please enter valid numbers.";
        return;
    }

    let bmi = weight / (height / 100.0 * height / 100.0);

    let bmiClass;
    if (bmi <= 18.4) {
        bmiClass = "Weight less than normal weight";
    } else if (bmi <= 24.9) {
        bmiClass = "Normal weight";
    } else {
        bmiClass = "Overweight";
    }

    document.getElementById("answer").innerHTML = "Body Mass Index (BMI) is " + bmi.toFixed(2) + " (" + bmiClass + ")";
          
  }