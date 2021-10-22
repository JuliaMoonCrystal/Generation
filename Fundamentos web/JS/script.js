function enviar(){
    var nome=document.getElementById('txtnome');
    var email=document.getElementById('txtemail');
    var comentario=document.getElementById('txtComent')
  
    if(nome.value !="" && email.value !="" && comentario.value !=""){
        alert('Obrigado pela sua opinião');
        console.log('testando os comandos no console');
    }
    else{
        alert('Todos os campus devem estar preenchidos')
        console.log('testando os comandos no console')
      }
  }
