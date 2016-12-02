/* Máscaras */
function muda(el) {
    $("#telefone").val('');
    if(el=="celular"){
        $("#telefone").mask("(99)99999-9999");
    }else{
        $("#telefone").mask("(99)9999-9999");
    }
}
jQuery(function($){
    $("#placa").mask("aaa-9999");
    $("#telefone").mask("(99)99999-9999"); //Pré-definido ao carregar página
    $("#campoSenha").mask("***-****");
    $("#cor").attr('readonly', false);
});
