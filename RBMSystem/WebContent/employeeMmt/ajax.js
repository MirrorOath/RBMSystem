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
            switch (data) {
            case 0:
                alert("登记成功");
                break;
            case 1:
                alert("上班登记失败，已有24小时内上班记录");
                break;
            case 2:
                alert("下班登记失败，未有24小时内上班记录");
                break;
            case 3:
                alert("请输入员工号");
                break;
            }
        }
    })
}
