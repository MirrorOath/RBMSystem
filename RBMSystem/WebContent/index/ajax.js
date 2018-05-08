
function signIns(){
    var name = document.getElementById("inputName").value;
    var password = document.getElementById("inputPassword").value;
    $.ajax({
        url : "../system/signIn.action",
        data : {
            name : name,
            password : password
        },
        type : "post",
        dateType : "json",
        success : function(data) {
            if(data == true)
                alert("登陆成功");
            else
                alert("登陆失败");
        }
    })
    
    
    $.ajax({
        url : "../system/getUser.action",
        type : "post",
        dateType : "json",
        success : function(data) {
            if (data.success) {
                document.getElementById(name).innerHTML = data.name;
            } else {

            }
        }
    })
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


function signUp() {
    name = document.getElementById("signUpName").value;
    if(name == null || name == ""){
        alert("请输入用户名");
        return;
    }
    password = document.getElementById("signUpPassword").value;
    if(password == null || password == ""){
        alert("请输入密码");
        return;
    }
    type = document.getElementById("typeOfSignUp").value;
    if(type == null || type == ""){
        alert("请选择注册类型");
        return;
    }
    $.ajax({
        url : "../empy/signUp.action",
        data : {
            name : name,
            password : password
        },
        type : "post",
        dataType : "json",
        success : function(data) {
            switch (data) {
            case -1:
                alert("注册失败:用户名已存在");
                break;
            case 0:
                alert("注册成功:请返回登陆");
                break;
            }
        }
    });
}


function signIn() {
    var name = document.getElementById("signInName").value;
    if(name == null || name == ""){
        alert("请输入用户名");
        return;
    }
    var password = document.getElementById("signInPassword").value;
    if(password == null || password == ""){
        alert("请输入密码");
        return;
    }
    var type = document.getElementById("typeOfSignIn").value;
    if(type == null || type == ""){
        alert("请选择登陆类型");
        return;
    }
    $.ajax({
        url : "../empy/signIn.action",
        data : {
            name : name,
            password : password,
            type : type
        },
        type : "post",
        dataType : "json",
        success : function(data) {
            switch (data) {
            case -2:
                alert("登陆失败:用户名或密码错误");
                break;
            case -1:
                alert("登陆失败:用户名不存在");
                break;
            case 0:
                alert("登陆成功:管理员");
                self.location="../index.html";
                break;
            case 1:
                alert("登陆成功:员工");
                self.location="../index.html";
                break;
            }
        }
    });
}


