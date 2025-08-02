import React,{useState } from "react";

function MyComponet () {
const [name, setName] = useState ();
const [age, setAge] = useState (0);
const [count , setCount] =useState(0);

const updateDetails = () => {
    setName("Abhishek");
}
const increment = () => {
    return(setCount(count+1));
}
const increaseAge = () => {
    setAge(age+1);
}
return (
    <div>
        <p>Name : {name} </p> 
        <p>Age : {age}</p>
        <p>Count: {count}</p>  
            <button onClick={updateDetails}>set Details</button>
            <button onClick={increaseAge}>Increase Age</button>
             <button onClick={increment}>Increment Count</button>
            </div>
);
}
export default MyComponet;