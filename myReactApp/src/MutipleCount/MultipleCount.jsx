import React, { useState } from "react";
import "./MutipleCountCss.css";

function MultipleCount() {

  const [count, setCount] = useState(0);
  function handleIncrementCount() {
    setCount(c => c + 1);
    setCount(c => c + 1);
    setCount(c => c + 1);
  }

  function handleDecrementCount() {
    setCount(c => Math.max(0, c - 1));
    setCount(c => Math.max(0, c - 1));
    setCount(c => Math.max(0, c - 1));
  }
  
  function handleResetCount() {
    setCount(0);
  }

  return (
    <div className="counter-container">
      <div className="counter-card">
        <div className="aurora-glow"></div>

        <h2 className="card-title">Super Counter</h2>
        
        <div className="count-display" aria-live="polite">
          <div className="count-display-inner">{count}</div>
        </div>

        <div className="button-group">
          <button className="btn primary" onClick={handleIncrementCount}>
            +3
          </button>
          <button className="btn secondary" onClick={handleDecrementCount} disabled={count === 0}>
            -3
          </button>
          <button className="btn ghost" onClick={handleResetCount} disabled={count === 0}>
            Reset
          </button>
        </div>
      </div>
    </div>
  );
}

export default MultipleCount;
