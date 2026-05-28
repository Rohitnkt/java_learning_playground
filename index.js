
const app = express();
const port = 3000;

app.get('/', (req, res) => {
  res.send('welcome to my server');
});

app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);
});