function calculateProfit() {
    // Read value of rounds from the input field
    const rounds = document.getElementById("rounds").value;

    let pips = 0;
    let wins = 0;
    const bet = 1;
    let bets = rounds * bet;

    // Make a loop which is executed as many times as was set through the input field. 
    // Let win counter cumulating during every round of the loop. 
    for (let i = 1; i <= rounds; i++) {
        // Randomize pips between 1-6 calling Math.round( (Math.random( ) * 5) + 1 );
        pips = Math.round((Math.random() * 5) + 1);

        // If the randomized pips is 1, 3 or 5,  no pay
        if (pips == 1 || pips == 3 || pips == 5) {
            wins = wins + 0;
            // Otherwise if the pips 2 and 4 return the set coins back 125% (=multiplied by 1.25)
        } else if (pips == 2 || pips == 4) {
            wins = wins + bet * 1.25;

            // Otherwise the pips 6 returns the inserted bet 150%	
        } else {
            wins = wins + bet * 1.5;
        }
    }

    //Calculate the profit (euros) by subtracting the win counter (euros) from the bets (euros)
    var profit = bets - wins;

    // Write the answer on the page, to the answer div, as content of the div
    document.getElementById("answer").innerHTML = "<p>Bets were altogether " + bets.toFixed(2) + " euros<br>Wins were " + wins.toFixed(2) + " euros<br>Profit was " + profit.toFixed(2) + " euros" + "</p>";

}