function validarSenha() {
	senha = document.getElementById('cSenha').value;
	senha2 = document.getElementById('cSenha2').value;
	if (senha != senha2) {
		alert("SENHAS DIFERENTES!\nFAVOR DIGITAR SENHAS IGUAIS");
		return false;
	} 
}