$(function (){
    // 페이징 헤더
    $("[name='pageRows']").change(function (){
        // alert($(this).val()); //확인용

        $("[name='frmPageRows']").attr({
            "method":"Post",
            "action":"/board/pageRows",
        }).submit();

    });
});