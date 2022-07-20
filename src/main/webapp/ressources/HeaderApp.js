/**
 * 
 */
 $(document).ready(function() {
    $("#show_hide_InputLoginPassword a").on('click', function(event) {
        event.preventDefault();
        if($('#show_hide_InputLoginPassword input').attr("type") == "text"){
            $('#show_hide_InputLoginPassword input').attr('type', 'password');
            $('#show_hide_InputLoginPassword i').addClass( "bi-eye-slash" );
            $('#show_hide_InputLoginPassword i').removeClass( "bi-eye" );
        }else if($('#show_hide_InputLoginPassword input').attr("type") == "password"){
            $('#show_hide_InputLoginPassword input').attr('type', 'text');
            $('#show_hide_InputLoginPassword i').removeClass( "bi-eye-slash" );
            $('#show_hide_InputLoginPassword i').addClass( "bi-eye" );
        }
    });
})