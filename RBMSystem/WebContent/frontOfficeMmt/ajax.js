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

function SetFirstStr(str, name) {
    document.getElementById(name).innerHTML = str;
    document.getElementById(name).value = str;
}

function YorN(type, name) {
    if (type == "yes") {
        document.getElementById(name).innerHTML = "是";
        document.getElementById(name).value = "0";
    } else if (type == "no") {
        document.getElementById(name).innerHTML = "否";
        document.getElementById(name).value = "-1";
    }
}

function beginTable() {
    var tableId = document.getElementById("tableId").value;
    var waiterId = document.getElementById("waiterId").value;
    var dishNumber = document.getElementById("dishNumber").value;
    $.ajax({
        url : "../front/beginTable.action",
        data : {
            tableId : tableId,
            waiterId : waiterId,
            dishNumber : dishNumber
        },
        type : "post",
        dateType : "json",
        success : function(data) {
            switch (data.status) {
            case -2:
                alert("侍者ID不存在");
                break;
            case -1:
                alert("参数不足");
                break;
            case 0:
                document.getElementById("streamId").value = data.streamId;
                document.getElementById("date").value = data.date;
                document.getElementById("streamNumber").value = data.streamId;
                document.getElementById("dishTypeButton").disabled = false;
                document.getElementById("dishName").disabled = false;
                document.getElementById("isOrderedButton").disabled = false;
                document.getElementById("isGiftsButton").disabled = false;
                document.getElementById("isBackButton").disabled = false;
                document.getElementById("price").disabled = false;
                document.getElementById("discount").disabled = false;
                document.getElementById("producterId").disabled = false;
                document.getElementById("dishType").innerHTML = "请选择";
                document.getElementById("isOrdered").innerHTML = "请选择";
                document.getElementById("isGifts").innerHTML = "请选择";
                document.getElementById("isBack").innerHTML = "请选择";
                break;
            }
        }
    })
}

function pleaseOrder() {
    var streamNumber = document.getElementById("streamNumber").value;
    var dishType = document.getElementById("dishType").value;
    var dishNumber = document.getElementById("dishNumber").value;
    var dishName = document.getElementById("dishName").value;
    var isOrdered = "是";
    var isGifts = document.getElementById("isGifts").value;
    var isBack = document.getElementById("isBack").value;
    var price = document.getElementById("price").value;
    var discount = document.getElementById("discount").value;
    var producterId = document.getElementById("producterId").value;
    if (streamNumber == null || dishType == null || dishNumber == null
            || isOrdered == null || isGifts == null || isBack == null
            || price == null || discount == null || producterId == null
            || streamNumber == "" || dishType == "" || dishNumber == ""
            || isOrdered == "" || isGifts == "" || isBack == "" || price == ""
            || discount == "" || producterId == "") {
        alert("表格不完整,下单失败");
        return;
    }

    $.ajax({
        url : "../front/pleaseOrder.action",
        data : {
            streamNumber : streamNumber,
            dishType : dishType,
            dishNumber : dishNumber,
            dishName : dishName,
            isOrdered : isOrdered,
            isGifts : isGifts,
            isBack : isBack,
            price : price,
            discount : discount,
            producterId : producterId
        },
        type : "post",
        dateType : "json",
        success : function(data) {
            if (data == true)
                alert("下单成功");
            else {
                alert("下单失败");
                return;
            }
        }
    })

    document.getElementById("dishName").value = "";
    document.getElementById("price").value = "";
    document.getElementById("discount").value = "";
    document.getElementById("producterId").value = "";
    document.getElementById("dishType").innerHTML = "请选择";
    document.getElementById("isOrdered").innerHTML = "请选择";
    document.getElementById("isGifts").innerHTML = "请选择";
    document.getElementById("isBack").innerHTML = "请选择";
}

function endTable() {
    var streamId = document.getElementById("endStreamNumber").value;
    var typeOfCoin = document.getElementById("typeOfCoin").value;
    var nameOfCoin = document.getElementById("nameOfCoin").value;
    var shouldPay = document.getElementById("shouldPay").value;
    var payActually = document.getElementById("payActually").value;
    var convertToRMB = document.getElementById("convertToRMB").value;
    var changeMoney = document.getElementById("changeMoney").value;
    var payeeId = document.getElementById("payeeId").value;
    if (streamId == null || typeOfCoin == null || nameOfCoin == null
            || shouldPay == null || convertToRMB == null || changeMoney == null
            || payActually == null || payeeId == null || streamId == ""
            || typeOfCoin == "" || nameOfCoin == "" || shouldPay == ""
            || payActually == "" || convertToRMB == "" || changeMoney == ""
            || payeeId == "") {
        alert("表格不完整,收台失败");
        return;
    }

    $.ajax({
        url : "../front/endTable.action",
        data : {
            streamId : streamId,
            typeOfCoin : typeOfCoin,
            nameOfCoin : nameOfCoin,
            shouldPay : shouldPay,
            payActually : payActually,
            convertToRMB : convertToRMB,
            changeMoney : changeMoney,
            payeeId : payeeId
        },
        type : "post",
        dateType : "json",
        success : function(data) {
            alert("收台成功");
            document.getElementById("endDate").value = data;
        }
    })

}
