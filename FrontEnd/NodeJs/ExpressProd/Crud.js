// Import necessary modules
const express = require('express');
const router = express.Router();

// Mock database of products
let products = [
    { id: 1, name: 'Product 1', category: 'Category A' },
    { id: 2, name: 'Product 2', category: 'Category B' },
    { id: 3, name: 'Product 3', category: 'Category A' }
];

// GET all products
router.get('/products', (req, res) => {
    res.json(products);
});

// POST a new product
router.post('/products', (req, res) => {
    const { name, category } = req.body;
    const id = products.length + 1;
    const newProduct = { id, name, category };
    products.push(newProduct);
    res.status(201).json(newProduct);
});

// GET a product by ID
router.get('/products/:id', (req, res) => {
    const productId = parseInt(req.params.id);
    const product = products.find(product => product.id === productId);
    if (product) {
        res.json(product);
    } else {
        res.status(404).json({ message: 'Product not found' });
    }
});

module.exports = router;
