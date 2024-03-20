var products = [
    { id: 1, name: 'Jacket', price: 1000 },
    { id: 2, name: 'Shoes', price: 500 },
    { id: 3, name: 'Pants', price: 250 }
];

// Initialize total and quantity
var total = 0;
var quantities = {};

// Function to add product to cart
function addToCart(productId) {
    var product = products.find(function(p) { return p.id == productId; });
    total += product.price;
    if (quantities[productId] === undefined) {
        quantities[productId] = 1;
    } else {
        quantities[productId]++;
    }
    document.getElementById('total').textContent = total.toFixed(2);
    document.getElementById('quantity_' + productId).textContent = quantities[productId];
}

// Function to remove product from cart
function removeFromCart(productId) {
    var product = products.find(function(p) { return p.id == productId; });
    if (quantities[productId] > 0) {
        total -= product.price;
        quantities[productId]--;
    }
    document.getElementById('total').textContent = total.toFixed(2);
    document.getElementById('quantity_' + productId).textContent = quantities[productId];
}