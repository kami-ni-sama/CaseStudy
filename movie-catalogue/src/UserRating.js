import { useParams } from "react-router-dom";
import useFetch from "./useFetch";

const UserRating = (props) => {
    const id = props.userId;
    const {data: userRatingList, isPending, error} = useFetch('http://localhost:8084/catalogues/'+id);
    return ( 
        <div className="userRating">
            <h1>User rating for user {id}</h1>
            <ul>
                {userRatingList && userRatingList.map((userRating)=>(
                    <li key={userRating.movieName}>
                        <h3>{userRating.movieName}  :  {userRating.rate}</h3>
                    </li>
                ))}
            </ul>
        </div>
     );
}
 
export default UserRating;