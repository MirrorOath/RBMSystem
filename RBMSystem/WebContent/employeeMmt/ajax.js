function atdc(type) {
    var id;
    if (type == 1)
        id = document.getElementById("work").value;
    else
        id = document.getElementById("home").value;
    $.ajax({
        url : "../empy/atdc.action",
        data : {
            id : id,
            type : type
        },
        type : "post",
        dateType : "json",
        success : function(data) {
            if (data == false)
                alert("登记失败");
            else
                alert("登记成功");
        }
    })
}
