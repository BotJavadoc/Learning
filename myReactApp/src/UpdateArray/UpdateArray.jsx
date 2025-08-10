import React,{useState} from "react";

function UpdateArray() {
const [food, setFood] = useState(["Apple","Bannana","Ornage"]);
function handleFood () {
    const getFood = document.getElementById("food").value;
    if(getFood === "") {
        alert("Food is empty");
        return;
    }
    document.getElementById("food").value="";
    setFood(foods => ([...foods,getFood]));
}
function handleRemoveFood (i) {
    setFood(food.filter((_,index)=>index!==i));
}

return(<div>
    <ul>
        {food.map((food,i)=><li key={i} onClick={()=> handleRemoveFood(i)} >{food}</li>)}
    </ul>
    <input type="text" placeholder="Ener the fruit name" id="food"></input>
    <button onClick={handleFood}>Add Food</button>
</div>);

}

export default UpdateArray;