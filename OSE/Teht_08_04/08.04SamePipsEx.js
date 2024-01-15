function randomizeDice() {
    let count = 0;
    let pips1, pips2;
  
    do {
      pips1 = Math.round(Math.random() * 5) + 1;
      pips2 = Math.round(Math.random() * 5) + 1;
      count++;
    } while (pips1 !== pips2);
  
    displayResult(count);
  }
  
  function displayResult(count) {
    const answerDiv = document.getElementById('answer');
    answerDiv.innerHTML = `Number of rounds needed to get the same pips: ${count}`;
  }