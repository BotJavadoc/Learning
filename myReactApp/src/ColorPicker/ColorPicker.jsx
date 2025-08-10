import React , {useState} from "react";

function ColorPicker () {
    const [color, setColor] = useState("#FFFFF");
    function hanldeColor (event) {
        setColor(event.target.value);
    }
    return(
        <div className="colorPicker">
            <h1>Color picker</h1>
            <div className="color-display" style={{backgroundColor : color}}>{color}</div>
            <p>Color code {color} </p>
            <input type="color" value={color}  onChange={hanldeColor}></input>
        </div>
    );
}

export default ColorPicker;