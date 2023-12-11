let inventoryData = {
    sum: 0
};

let inventoryCounterApp = {
    add: function(count) {
        inventoryData.sum += count;
    },
    counter: function() {
        let userInput = prompt("Enter the inventory count:");
        let countToAdd = parseInt(userInput);

        if (!isNaN(countToAdd) && countToAdd > 0) {
            this.add(countToAdd);
            this.displayTotalInventoryCount();
        } else {
            alert("Please enter a valid inventory count.");
        }
    },
    displayTotalInventoryCount: function() {
        document.getElementById("result").innerHTML = "Total Inventory count: " + inventoryData.sum;
    }
};

// You can call the counter method when needed
// inventoryCounterApp.counter();