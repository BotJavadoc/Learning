function ListRendering () {

    const fruits = [{id : 1, name :"Apple", cal : 95},{id : 2 ,name :"bananna", cal : 105},{id :3, name:"Orange" , cal : 45},{id :4,name:"PineApple" , cal : 37}];
    fruits.sort((a,b)=> b.name.localeCompare(a.name))

    const fruitItems = fruits.map(fruit => <li key = {fruit.name}>
        {fruit.name} : {fruit.cal} calories
        </li>);
return  ( 
    <ol>{fruitItems}</ol>
);
}
export default ListRendering;