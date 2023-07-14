function myfunc(){
let greatest;
let x=parseInt(prompt("Enter First Number"));
let y=parseInt(prompt("Enter second Number"));
let z=parseInt(prompt("Enter third Number"));
if(x>y && x>z)
{
    greatest=x;
}
else if(y>x && y>z) {
    greatest=y;
}
else{
    greatest = z; 
}
alert(greatest);
}



   


