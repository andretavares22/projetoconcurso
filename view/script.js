//Menu

fetch('menu.html')
.then(response => response.text())
.then(data => {
  document.getElementById('menu').innerHTML = data;
});

//Cadastro Prova
const formProva = document.getElementById('form-prova');

formProva.addEventListener('submit', async (e) => {
    e.preventDefault(); // Evita o recarregamento da página

    const banca = document.getElementById('banca').value;
    const orgao = document.getElementById('orgao').value;
    const questoesgerais = document.getElementById('questoesgerais').value;
    const questoesespecificas = document.getElementById('questoesespecificas').value;
    const discursiva = document.getElementById('discursiva').value;
    const ano = document.getElementById('ano').value;

try {
        const resposta = await fetch('http://localhost:8080/provas', {
          method: 'POST',
          headers: {'Content-Type': 'application/json'},
          body: JSON.stringify({ banca, orgao, questoesgerais, questoesespecificas, discursiva, ano })
        });

        if (resposta.ok) {
          const dados = await resposta.json();
          mensagem.textContent = `Provas "${dados.nome}" Cadastrada com Sucesso!`;
          form.reset();
        }
        else {
          const erro = await resposta.text();
          mensagem.textContent = `Erro ao cadastrar: ${erro}`;
        }
      } 
        catch (erro) {
        mensagem.textContent = `Erro de conexão: ${erro}`;
      }

});
