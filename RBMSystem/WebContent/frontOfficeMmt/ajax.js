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
        url : "../front/itemIO.action",
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
                alert("物品ID不存在");
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

function addNewStaple() {

}

function SetFirstStr(str, name){
    document.getElementById(name).innerHTML = str;
    document.getElementById(name).value = str;
}

function YorN(type, name){
    if(type == "yes") {
        document.getElementById(name).innerHTML = "是";
        document.getElementById(name).value = "0";
    }
    else if(type == "no") {
        document.getElementById(name).innerHTML = "否";
        document.getElementById(name).value = "-1";
    }
}
