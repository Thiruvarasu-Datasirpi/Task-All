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
