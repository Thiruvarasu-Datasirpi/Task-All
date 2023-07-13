var a = "thiru";
console.log("value of String a ".concat(a));
var phno = 1233445;
console.log("phonenumber : ".concat(phno));
var Foods;
(function (Foods) {
    Foods[Foods["bacon"] = 18] = "bacon";
    Foods[Foods["tomato"] = 19] = "tomato";
    Foods[Foods["lettuce"] = 20] = "lettuce";
})(Foods || (Foods = {}));
;
console.log("the value stored in bacon is ");
console.log(Foods['bacon']);
var value = true;
console.log("value is - ".concat(value));
var abc = [
    { name: "Prabha", id: "1", department: "CSE" },
    { name: "Priya", id: "2", department: "ECE" },
    { name: "Selvi", id: "3", department: "IT" },
    { name: "Ravi", id: "4", department: "CSE" }
];
//foreach function
abc.forEach(function (value) {
    console.log(value);
});
//find function
var scopess = abc.find(function (number) { return (number.name == "Prabha"); });
console.log(scopess);
//filter function
var scopesss = abc.filter(function (number) { return (number.name == "Prabha"); });
console.log(scopesss);
var chng = abc.map(function (obj) {
    if (obj.name == "Prabha") {
        return {
            id: obj.id * 2
        };
    }
});
console.log(chng);
