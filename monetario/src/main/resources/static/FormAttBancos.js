async function salvarDados() {
  try {
    const nome = document.getElementById("nome").value;
    const dataFechamento = document.getElementById("vencimento").value;

    const banco = {
      nome,
      dataFechamento: Number(dataFechamento)
    };

    console.log(banco.dataFechamento);

    const response = await fetch("http://localhost:8080/bancos/criarBanco", {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(banco)
    });

    if (!response.ok) {
      throw new Error("Erro na requisição");
    }

    const data = await response.json();
    console.log("Retorno do backend:", data);
    alert("Banco salvo com sucesso!");

  } catch (erro) {
    console.error(erro);
    alert("Ocorreu um erro ao salvar os dados.");
  }
}
