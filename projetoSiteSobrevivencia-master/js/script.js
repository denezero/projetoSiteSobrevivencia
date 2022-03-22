function login () {
    var valipasso = window.document.getElementById("inpassoword").value;
    var valemail = window.document.getElementById("inemail").value;
    var es = window.document.getElementById("escre");
    
    if (valipasso == "Allan" && valemail == "allan@gmail.com") {
        es.innerHTML= "Ola allan"
    } else {
        es.innerHTML = `Senha Incorreta`
    }

}
function selection() {
    var sele
}

