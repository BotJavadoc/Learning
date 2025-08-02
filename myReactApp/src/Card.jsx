import profilePicture from './assets/luffy.jpg';

function Card() {
  return (
    <div className="card">
      <img src={profilePicture} alt="profile picture" />
      <h2>MyFirstCard</h2>
      <p>Inside the card component</p>
    </div>
  );
}

export default Card;

