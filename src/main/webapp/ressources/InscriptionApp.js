/**
 * 
 */
 
 $(document).ready(function() {
    $("#show_hide_ConfirmPassword a").on('click', function(event) {
        event.preventDefault();
        if($('#show_hide_ConfirmPassword input').attr("type") == "text"){
            $('#show_hide_ConfirmPassword input').attr('type', 'password');
            $('#show_hide_ConfirmPassword i').addClass( "bi-eye-slash" );
            $('#show_hide_ConfirmPassword i').removeClass( "bi-eye" );
        }else if($('#show_hide_ConfirmPassword input').attr("type") == "password"){
            $('#show_hide_ConfirmPassword input').attr('type', 'text');
            $('#show_hide_ConfirmPassword i').removeClass( "bi-eye-slash" );
            $('#show_hide_ConfirmPassword i').addClass( "bi-eye" );
        }
    });
    $("#show_hide_InputPassword a").on('click', function(event) {
        event.preventDefault();
        if($('#show_hide_InputPassword input').attr("type") == "text"){
            $('#show_hide_InputPassword input').attr('type', 'password');
            $('#show_hide_InputPassword i').addClass( "bi-eye-slash" );
            $('#show_hide_InputPassword i').removeClass( "bi-eye" );
        }else if($('#show_hide_InputPassword input').attr("type") == "password"){
            $('#show_hide_InputPassword input').attr('type', 'text');
            $('#show_hide_InputPassword i').removeClass( "bi-eye-slash" );
            $('#show_hide_InputPassword i').addClass( "bi-eye" );
        }
    });
});