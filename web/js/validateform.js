function validatesform()
{
    var pass1=document.registerform.password;
    var pass2=document.registerform.confirmpassword;
    if(pass1.value!= pass2.value)
    {
        alert("Passwords donot match");
      
        return false;
    }
    if((Register.valueOf(count))>=1)
    {
        alert("Login Successfull");
    }
        return true;
}