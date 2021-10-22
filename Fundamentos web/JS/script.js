function enviar(){
    var nome=document.getElementById('txtnome');
    var email=document.getElementById('txtemail');
    var comentario=document.getElementById('txtComent')
  
    if(nome.value !="" && email.value !="" && comentario.value !=""){
        alert('Obrigado pela sua opinião');
        console.log('testando os comandos no console');
    }
    else{
        alert('Todos os campos devem estar preenchidos')
        console.log('testando os comandos no console')
        document.body.style.clear(nome.value)
      }
  }

  function mudacor() {
      var txtnome= document.getElementById('teste')
      txtnome.style.color='red';
  }
