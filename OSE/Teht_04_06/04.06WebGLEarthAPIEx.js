var earth;

function initialize() {
    var options = {
        atmosphere: true,
        center: [0, 0],
        zoom: 0
    };
    earth = new WE.map('earth_div', options);
  
    WE.tileLayer('http://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
        attribution: 'Â© OpenStreetMap contributors'
    }).addTo(earth);

    // Add buttons to the HTML for GO HOME and SHOW COORDS
    addButtons();
}

function goHome() {
    // Set the map center to the latitude/longitude position of your home
    earth.setView([YOUR_HOME_LATITUDE, YOUR_HOME_LONGITUDE], 13);
}

function showCoords() {
    // Get current coordinates of the map center
    var currentCoords = earth.getCenter();

    // Show the coordinates in an alert dialog box
    alert(currentCoords);
}

function addButtons() {
    var buttonsDiv = document.getElementById('buttons');

    // Create "GO HOME" button
    var goHomeButton = document.createElement('button');
    goHomeButton.innerHTML = 'GO HOME';
    goHomeButton.onclick = goHome;
    buttonsDiv.appendChild(goHomeButton);

    // Create "SHOW COORDS" button
    var showCoordsButton = document.createElement('button');
    showCoordsButton.innerHTML = 'SHOW COORDS';
    showCoordsButton.onclick = showCoords;
    buttonsDiv.appendChild(showCoordsButton);
}
