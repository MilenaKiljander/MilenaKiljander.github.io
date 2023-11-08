
let rainfall = [47.0, 36.6, 34.7, 37.0, 41.9, 47.5, 61.7, 74.8,
    65.4, 69.7, 66.1, 54.6];

function calculateSum() {
    let sum = 0;

	
for (let i = 0; i < rainfall.length; i++) {
    sum += rainfall[i];
}

document.getElementById('answer').innerHTML = "The annual rainfall in Helsinki is " + sum.toFixed(1) + "mm.";
}

calculateSum();