function validateForm(form){
    var user = form.user;
    if(user.value == "" || user.value=="Escribir usuario"){
        alert("Debe proporcionar un nombre de usuario");
        user.focus();
        user.select();
        return false;
    }
           
    var password = form.password;
    if(password.value == "" || password.value=="Escribir password" || password.value.length < 3){
        alert("Debe proporcionar un password al menos de 3 caracteres.");
        password.focus();
        password.select();
        return false;
    }
    
    var technology = form.tec;
    var checkSelect = false;
     
    for(var i=0; i < technology.length; i++){
        if(technology[i].checked){
            checkSelect=true;
        }
    }
    if(!checkSelect){
        alert("Debe seleccionar una tecnología");
        return false;
    }
    
    var genero = form.genero;
    var radioSelect = false;
    
    for(var i=0; i < genero.length; i++){
        if(genero[i].checked){
            radioSelect = true;
        }
    }
    if(!radioSelect){
        alert("Debe seleccionar un genero");
        return false;
    }
    
    var ocupation = form.ocupation;

    if(ocupation.value==""){
        alert("Debe seleccionar una ocupación");
        ocupation.focus();
        return false;
    }
    alert("El formulario es valido, enviando datos al servidor...");
    return true;
}