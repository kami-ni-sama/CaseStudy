import {Link} from 'react-router-dom';
import useFetch from "./useFetch";

const Movies = (props) => {
    const {data: movieList, isPending, error} = useFetch('http://localhost:8080/movies');
    return ( 
        <div className="movies">
            <ul>
                {movieList && movieList.map((movie)=>(
                    <Link to = "/">
                        <li key={movie}>
                            <h2>{movie}</h2>
                        </li>
                    </Link>
                ))}
            </ul>
            <Link to = "/">Go to home</Link>
        </div>    
     );
}
 
export default Movies;