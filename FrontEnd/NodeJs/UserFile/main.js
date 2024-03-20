const express = require('express');
const userRouter = require('./router');

const app = express();
app.use(express.json());
app.use('/users', userRouter);

app.listen(4000, () => console.log('Server Started at 4000'));
