import { useState } from "react";
import { Link } from "react-router-dom";
import UserRating from "./UserRating";

const UserRatingInput = () => {
    const [userId, setUserId] = useState('') ;
    const [inputFlag, setInputFlag] = useState(false);
    const handleSubmit = (e) => {
        e.preventDefault();
        setInputFlag(true);
    }
    return ( 
        <div className="userRatingInput">
            <form>
                <label>Enter User ID: </label><br></br><br></br>
                <input type="text" value={userId} onChange={(e)=>setUserId(e.target.value)}></input><br></br><br></br>
                <button onClick={(e)=>handleSubmit(e)}>Search user ratings</button>
            </form>
            {/* <h1>{userId}</h1> */}
            {inputFlag && <UserRating userId={userId}></UserRating>}
            <Link to = "/">Go to home</Link>
        </div>
     );
}
 
export default UserRatingInput;