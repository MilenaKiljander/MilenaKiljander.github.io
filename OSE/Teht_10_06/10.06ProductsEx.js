// JSON data representing product information
let productData = [
    {
        "number": 1,
        "name": "Samsung Smart LED-TV",
        "price": 449.00,
        "description": "HD-digi ready"
    },
    {
        "number": 2,
        "name": "Samsung 2.1 SoundBar Home Theater",
        "price": 198.00,
        "description": "Connect to TV and stream music wirelessly"
    },
    {
        "number": 3,
        "name": "Dilog CI+/CA module for pay-tv-cards",
        "price": 63.90,
        "description": "CI+ module for the table televisions"
    }
];

// Function to generate HTML for each product
function generateProductHTML(product) {
    return `<p>Number: ${product.number}<br>Name: ${product.name}<br>Price: ${product.price.toFixed(2)}<br>Description: ${product.description}</p>`;
}

// Function to list products and display them on the page
function listProducts() {
    // Get the element where the products will be displayed
    const productListElement = document.getElementById('productList');

    // Clear previous content
    productListElement.innerHTML = '';

    // Generate HTML for each product and append it to the productListElement
    productData.forEach(product => {
        const productHTML = generateProductHTML(product);
        productListElement.innerHTML += productHTML;
    });
}