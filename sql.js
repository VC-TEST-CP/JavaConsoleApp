const express = require('express');
const mysql = require('mysql');
const app = express();

const db = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: 'password',
  database: 'test'
});

app.get('/users', (req, res) => {
  const { id } = req.query;
  const sql = `SELECT * FROM users WHERE id = ${id}`;

  db.query(sql, (err, result) => {
    if (err) throw err;
    res.send(result);
  });
});

app.listen(3000, () => {
  console.log('Server started on port 3000');
});
