function validaLogin(){

    let userTxt = localStorage.getItem("userLogged");

    if(!userTxt){
        window.location = "index.html";
    }
}

function logout(){
    localStorage.removeItem("userLogged");
    window.location = "index.html";
}