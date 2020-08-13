function validaLogin(){

    let userTxt = localStorage.getItem("userLogged");

    if(!userTxt){
        window.location = "index.html";
    }

    let jsonUser = JSON.parse(userTxt);

    document.getElementById("user").innerHTML = `${jsonUser.nome} ( ${jsonUser.racf} )` ;
    document.getElementById("imgUser").innerHTML = `<img src ="${jsonUser.linkFoto}">`;
    
}

function logout(){
    localStorage.removeItem("userLogged");
    window.location = "index.html";
}