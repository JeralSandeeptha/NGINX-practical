import express from "express";

const port = 5050;

const app = express();

app.get('/', (req, res) => {
    console.log('Welcome to post service');
    res.status(200).json({
        statusCode: 200,
        msg: "Get all posts query was successful"
    });
});

app.listen(port, () => {
    console.log('Server is running at port 5050');
});