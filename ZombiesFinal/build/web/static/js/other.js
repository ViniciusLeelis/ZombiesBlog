function deletePost() {
  alert('Post excluido');
}
function confirmar() {
    $( "#dialog-confirm" ).dialog({
      resizable: false,
      height: "auto",
      width: 400,
      modal: true,
      buttons: {
        "Sim": function() {
          $( this ).dialog( "close" );
          deletePost();
        },
        'Não': function() {
          $( this ).dialog( "close" );

        }
      }
    });
}