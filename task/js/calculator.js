function calculate() {
  
  var num1 = parseInt(document.getElementById("num1").value);
  const num2 = parseInt(document.getElementById("num2").value);
  const operator = document.getElementById("operator").value;
  var result;
  if (!num1 || !num2 ) {
    alert("Please enter both numbers");
    
  }else{
  
  switch (operator) {
    case "+":
      result = num1 + num2;
      break;
    case "-":
      result = num1 - num2;
      break;
    case "*":
      result = num1 * num2;
      break;
    case "/":
      result = num1 / num2;
      break;
   
  }

  
  document.getElementById("result").innerHTML = "Result: " + result;
 
}

}

function erase(){
  var result;
  document.getElementById("num1").value="";
  document.getElementById("num2").value="";
 
  document.getElementById("result").innerHTML = "";

}