
function UserGreeting (props) {
    const { userLoggedIn, userName } = props;
if(userLoggedIn) {
return ( 
        <h1>Welcome User {userName}</h1>
    
); 
} else return(<h1>Please log in to access </h1>);
}
export default UserGreeting;