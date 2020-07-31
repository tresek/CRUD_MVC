function validarForma(forma){
    var usuario = forma.usuario;
    if(usuario.value == "" || usuario.value == "Escribir Usuario"){
        alert("Debe ingresar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
       
    }
    var password = forma.password;
    if(password.value == "" || password.length <3 ){
        alert("Debes ingresar tu password con almenos 3 caracteres");
        password.focus();
        password.select();
        return false;
        
    }
    var tegnologia = forma.tegnologia;
    var checkSeleccionado = false;
    for(var i=0; i<tegnologia.length; i++){
        if(tegnologia[i].checked){
            checkSeleccionado = true;
        }
    }
    if(!checkSeleccionado){
        alert("Debes seleccionar una tegnologia");
        return false;
    }
    var generos = forma.genero;
    var radioSeleccionado = false;
    
    for(var i=0; i<generos.length; i++){
        if(generos[i].checked){
            radioSeleccionado = true;
        }
    }
    if(!radioSeleccionado){
        alert("Debe igresar un Sexo");
        return false;
    }
    var ocupacion = forma.ocupacion;
    if(ocupacion.value == ""){
        alert("Debe ingresar una ocupacion ");
        return false;
    }
    //Formulario es valido
    alert ("Formulario valido, enviando datos al server");
    return true;
        
}

