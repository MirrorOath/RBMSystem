
function stapleIO(type) {
    var id;
    var count;
    if (type == 1) {
        id = document.getElementById("inItemId").value;
        count = document.getElementById("inItemCount").value;
    } else {
        id = document.getElementById("outItemId").value;
        count = document.getElementById("outItemCount").value;
    }
    $.ajax({
        url : "../staple/stapleIO.action",
        data : {
            id : id,
            count : count,
            type : type
        },
        type : "post",
        dateType : "json",
        success : function(data) {
            switch (data) {
            case -3:
                alert("库存不足");
                break;
            case -2:
                alert("原料ID不存在");
                break;
            case -1:
                alert("参数不足");
                break;
            case 0:
                alert("登记成功");
                break;
            }
        }
    })
}
