import './Student.css';
function Student (comp) {
return (
    <div className="student-container">
        <p>Name: {comp.name}</p>
        <p>Age : {comp.age}</p>
        <p>Is he a Student : {comp.isStudent ? "Yes" : "No"}</p>
    </div>
);
}
export default Student;