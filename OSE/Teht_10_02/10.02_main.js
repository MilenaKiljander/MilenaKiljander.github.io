let nutRepository = {
    nutCount: 0
};

let oravat = [
    {
        nimi: "Orkku",
        osoite: "Se iso tammipuu",
        paino: 180.5,
        syntPvm: "24.6.2022"
    },
    {
        nimi: "Vili Vikkelä",
        osoite: "Pähkinäpuu puron varressa",
        paino: 150.5,
        syntPvm: "15.6.2023"
    }
];
let text = "";

for (let i = 0; i < oravat.length; i++) {
    text = text + oravat[i].nimi;
    text = text + "<br>" + oravat[i].osoite;
    text = text + "<br>" + oravat[i].paino;
    text = text + "<br>" + oravat[i].syntPvm;
}

let skuutti1 = {
    nimi: "Cube",
    maxNopeaus: 25,
    nopeus: 0,
    aja: function (nopeus) {
        this.nopeus = nopeus;
    },
    jarruta: function () {
        this.nopeus = 0;
    }
};

let squirrel = {
    add: function (nuts) {
        nutRepository.nutCount += nuts;
    },
    deposit: function () {
        let userInput = prompt("Enter the number of nuts to deposit:");
        let nutsToAdd = parseInt(userInput);

        if (!isNaN(nutsToAdd) && nutsToAdd > 0) {
            this.add(nutsToAdd);
            this.displayTotalNutCount();
        } else {
            alert("Please enter a valid number of nuts.");
        }
    },
    displayTotalNutCount: function () {
        document.getElementById("result").innerHTML = "My total nut count is " + nutRepository.nutCount;
    }
};

// Example usage
squirrel.deposit();
