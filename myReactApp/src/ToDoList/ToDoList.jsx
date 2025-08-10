import React, { useState } from "react";
import "./ToDoList.css"; 

function ToDoList() {
    const [task, setTask] = useState([]);
    const [newTask, setNewTask] = useState("");

    function handleAddTask() {
        if (newTask.trim() === "") return;
        setTask((task) => [...task, newTask.trim()]);
        setNewTask("");
    }

    function handleNewTask(event) {
        setNewTask(event.target.value);
    }

    function handleDelete(index) {
        setTask((task) => task.filter((_, i) => i !== index));
    }

    function handleUp(index) {
        if (index > 0) {
            const updatedTasks = [...task];
            [updatedTasks[index], updatedTasks[index - 1]] = [updatedTasks[index - 1], updatedTasks[index]];
            setTask(updatedTasks);
        }
    }
    function handleDown(index) {
        if (index < task.length - 1) {
            const updatedTasks = [...task];
            [updatedTasks[index], updatedTasks[index + 1]] = [updatedTasks[index + 1], updatedTasks[index]];
            setTask(updatedTasks);
        }
    }

    return (
        <div className="todo-container">
            <h1>📝 Todo List</h1>
            
            <div className="input-container">
                <input
                    type="text"
                    placeholder="Enter your new task"
                    value={newTask}
                    onChange={handleNewTask}
                />
                <button onClick={handleAddTask} className="add-btn">Add</button>
            </div>

            <ol className="task-list">
                {task.map((element, index) => (
                    <li key={index} className="task-item">
                        <span className="task-text">{element}</span>
                        <div className="btn-group">
                            <button onClick={() => handleDelete(index)} className="delete-btn">❌</button>
                            <button onClick={() => handleUp(index)} className="up-btn">⬆️</button>
                            <button onClick={() => handleDown(index)} className="down-btn">⬇️</button>
                        </div>
                    </li>
                ))}
            </ol>
        </div>
    );
}

export default ToDoList;
