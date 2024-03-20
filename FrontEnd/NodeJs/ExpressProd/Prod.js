const express = require('express');
const productRoutes = require('./Crud');

const app = express();

// Middleware
app.use(express.json());

// Routes
app.use('/prod', productRoutes);

// Start server
const PORT = 3000;
app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});
