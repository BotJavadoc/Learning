import Button from "./Button";
import Card from "./Card";
import ClickEvents from "./ClickEvents/ClickEvents";
import Food from "./Food";
import Footer from "./Footer";
import Header from "./header";
import ListRendering from "./List/ListRendering";
import MyComponet from "./MyComponet/Mycomponet";
import Student from "./Student/Student";
import UserGreeting from "./UserGreeting/UserGreeting";

function App() {
  return (<>
    <Header />
    <Food />
    <Card/>
    <Button/>
    <Student name = "Abhishek G" age = {24} isStudent={true}/>
    <Student name = "Abhishek G" age = {24} isStudent={false}/>
    <UserGreeting userLoggedIn = {true} userName = "Abhishek"/>
    <ListRendering/>
    <ClickEvents/>
    <MyComponet/>
    <Footer /></>);
}

export default App
