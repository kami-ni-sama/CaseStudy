// import logo from './logo.svg';
import './App.css';
import Home from './Home';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import Movies from './Movies';
import UserRating from './UserRating';
import UserRatingInput from './UserRatingInput';

function App() {
  return (
    <Router>
      <div className="App">
        <div className="content">
          <Switch>
            <Route exact path = "/">
              <Home />
            </Route>
          </Switch>
          <Switch>
            <Route exact path = "/movies">
              <Movies />
            </Route>
          </Switch>
          <Switch>
            <Route exact path = "/ratings">
              <UserRatingInput />
            </Route>
          </Switch>
          <Switch>
            <Route exact path = "/ratings/:id">
              <UserRating />
            </Route>
          </Switch>
        </div>
      </div>
    </Router>
  );
}

export default App;
