import { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import Movies from "./Movies";


const Home = () => {
    return ( 
        <div className="home">
            <h1>Welcome to movie catalogue</h1>
            <Link to ="/movies">All movies</Link><br></br>
            <Link to ="/ratings">User Ratings</Link>
        </div>
     );
}
 
export default Home;