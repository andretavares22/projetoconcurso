//Menu

fetch('menu.html')
.then(response => response.text())
.then(data => {
  document.getElementById('menu').innerHTML = data;
});

//
const formProva = document.getElementById('form-prova');

formProva.addEventListener('submit', async (e) => {
    e.preventDefault();
    const nome = document.getElementById('nome').value;
    const data = document.getElementById('data').value;

    const response = await fetch('http://localhost:5000/provas', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ nome, data })
    });

    const result = await response.json();
    alert(result.message);
});
