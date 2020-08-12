function login() {
    let campoNome = document.getElementById("txtnome");
    let campoResposta = document.getElementById("resposta");

    console.log('Nome do usuário: '+ campoNome.value);

    let resposta = "Emerson";

    if(resposta == campoNome.value){
        alert('Login com sucesso');
        campoResposta.value = 'Olá ' + campoNome.value;
    }else{
        alert('Falha no Login');
    }

    let divBloco = document.getElementById("bloco");

    divBloco.innerHTML = "<input type='text' id='blocoInner' value = 'Emerson'>";

}



