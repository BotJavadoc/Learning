import React,{useState} from "react";
function ObjectState () {
const [anime, setAnime] = useState({name: "Dragon Ball", year: 1986, favChar : "Goku"});
function HandleName (event) {
    setAnime(anime=>({...anime, name : event.target.value}));
}
function HandleYear (event) {
    setAnime(anime=>({...anime, year : event.target.value}));
}
function HandleFavChar (event) {
    setAnime(anime=>({...anime, favChar : event.target.value}));
}

return (<div>
    <p>Anime Name : {anime.name}</p>
    <p>Anime Year : {anime.year}</p>
    <p>Anime Favourite Character : {anime.favChar}</p>
    <input type= "text" value={anime.name} onChange={HandleName}></input>
    <input type= "number" value={anime.year} onChange={HandleYear}></input>
    <input type= "text" value={anime.favChar} onChange={HandleFavChar}></input>
</div>);

}

export default ObjectState;