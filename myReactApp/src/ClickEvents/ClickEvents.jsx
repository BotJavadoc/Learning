function ClickEvents () {
    const imageUrl = './assets/luffy.jpg';
    const handleClick = (clickEvent) => {
        clickEvent.target.textContent = "You clicked Me bitch"
    }
return (<>
    <button onClick={(clickEvent)=>handleClick(clickEvent)}>Click me for magic</button>
    <img scr ={imageUrl} onClick={(clickEvent)=> handleClick(clickEvent)}></img>
    </>
);
}
export default ClickEvents;