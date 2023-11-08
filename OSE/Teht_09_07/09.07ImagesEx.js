
let images = ["face.png", "heart.png", "sun.png", "moon.png", "cloud.png"];

function addImages() {

    let text = "";
    
    for (let i=0; i<images.length; i++) {

        text = text + "<img src=\'" + images[i] + "\' alt=\'Funny shape\'></img>";

    }

    document.write(text);
}