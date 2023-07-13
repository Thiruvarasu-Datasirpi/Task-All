type thiru = {
  name: string;
  id: String;
  department: String;
};


var a:String = "thiru";
console.log(`value of String a ${a}` );


var phno:number =1233445;
console.log(`phonenumber : ${phno}`);

enum Foods {'bacon'= 18, 'tomato', 'lettuce'};
console.log("the value stored in bacon is ");

console.log(Foods['bacon']); 

var value : boolean = true;
console.log(`value is - ${value}`);

var abc: any = [
  { name: "Prabha", id: "1", department: "CSE" },

  { name: "Priya", id: "2", department: "ECE" },

  { name: "Selvi", id: "3", department: "IT" },

  { name: "Ravi", id: "4", department: "CSE" }

];

//foreach function
abc.forEach((value: thiru) => {
  console.log(value);
});

//find function
var scopess = abc.find(number=>(number.name=="Prabha"))
console.log(scopess);

//filter function
var scopesss = abc.filter(number=>(number.name=="Prabha"))
console.log(scopesss);

var chng = abc.map((obj) => {
  if(obj.name=="Prabha"){
  return {
    
    id: obj.id * 2
  };
}
});

console.log(chng);
