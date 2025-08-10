import Button from "./Button";
import Card from "./Card";
import ClickEvents from "./ClickEvents/ClickEvents";
import ColorPicker from "./ColorPicker/ColorPicker";
import EventHandler from "./EventHandler/EventHandler";
import Food from "./Food";
import Footer from "./Footer";
import Header from "./header";
import ListRendering from "./List/ListRendering";
import MultipleCount from "./MutipleCount/MultipleCount";
import MyComponet from "./MyComponet/Mycomponet";
import ObjectState from "./ObjectState/ObjectState";
import Student from "./Student/Student";
import ToDoList from "./ToDoList/ToDoList";
import UpdateArray from "./UpdateArray/UpdateArray";
import UseEffectTry from "./UseEffectTry/UseEffectTry";
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
    <EventHandler/>
    <ColorPicker/>
    <MultipleCount/>
    <ObjectState/>
    <UpdateArray/>
    <ToDoList/>
    <UseEffectTry/>
    <Footer /></>);
}

export default App
