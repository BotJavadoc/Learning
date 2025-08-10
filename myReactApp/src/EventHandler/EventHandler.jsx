import React,{useState} from "react";

function EventHandler() {
    const [name,setName] = useState("");
    function eventHandlers(event) {
        setName(event.target.value);
    }
    return(
        <div>
            <input value={name} onChange={eventHandlers}></input>
            <p>Name : {name}</p>
        </div>
    );
}
export default EventHandler;