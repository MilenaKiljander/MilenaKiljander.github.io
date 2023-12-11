function processName() {

    // read value of name from the input field
   
    let textInput = document.getElementById("textInput").value;

    // show it with "ALL CAPS" using toUpperCase()

    let upperCaseText = textInput.toUpperCase();
    document.getElementById("upperCase").innerHTML = "With upper case letters: " + upperCaseText;

    // show it with  "all small letters" using toLowerCase()
 
    let lowerCaseText = textInput.toLowerCase();
    document.getElementById("lowerCase").innerHTML = "With lower case letters: " + lowerCaseText;

    //tell how many characters are there (length, includes also all spaces) 
   
    let characterCount = textInput.length;
    document.getElementById("lenght").innerHTML = "Character count: " + characterCount;

    // tell, whether the input string contains the word 'muumi'

    if (textInput.toLowerCase().indexOf('muumi') !== -1) {
        document.getElementById("contains").innerHTML = "Contains the text muumi.";
    } else {
        document.getElementById("contains").innerHTML = "Doesn't contain the text muumi.";
    }
    
    // tell the first character using charAt()
    
    let firstCharacter = textInput.charAt(0);
    document.getElementById("firstCharacters").innerHTML = "First character: " + firstCharacter;

    // tell which ones are the first three characters using substring().
   
    let firstThreeCharacters = textInput.substring(0, 3);
    document.getElementById("manyCharacters").innerHTML = "First three characters: " + firstThreeCharacters;

}