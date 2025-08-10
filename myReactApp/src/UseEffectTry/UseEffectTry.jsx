import React, { useEffect, useState } from "react";

function UseEffectTry() {
    const [count, setCount] = useState(0);

    useEffect(() => {
        document.title = `Count ${count}`;
    }, [count]); 

    return (
        <div style={{ textAlign: "center", marginTop: "50px", fontFamily: "Arial" }}>
            <h1>Count: {count}</h1>
            <button 
                onClick={() => setCount(count + 1)} 
                style={{
                    padding: "10px 20px",
                    fontSize: "16px",
                    borderRadius: "5px",
                    backgroundColor: "#007bff",
                    color: "white",
                    border: "none",
                    cursor: "pointer"
                }}
            >
                Increment
            </button>
            <button 
                onClick={() => setCount(count - 1)} 
                style={{
                    padding: "10px 20px",
                    fontSize: "16px",
                    borderRadius: "5px",
                    backgroundColor: "#dc3545",
                    color: "white",
                    border: "none",
                    cursor: "pointer",
                    marginLeft: "10px"
                }}
            >
                Decrement
            </button>
            <button 
                onClick={() => setCount(0)} 
                style={{
                    padding: "10px 20px",
                    fontSize: "16px",
                    borderRadius: "5px",
                    backgroundColor: "#6c757d",
                    color: "white",
                    border: "none",
                    cursor: "pointer",
                    marginLeft: "10px"
                }}
            >
                Reset
            </button>
        </div>
    );
}

export default UseEffectTry;
