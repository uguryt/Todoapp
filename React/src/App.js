import ItemList from './ItemList';
import { Route, Routes } from "react-router-dom";
import ItemAdd from './ItemAdd';

function App() {
  
  return (
    <div>
      <Routes>
        <Route exact path="/" element = {<ItemList/>}></Route>
        <Route exact path="/add" element = {<ItemAdd/>}></Route>
      </Routes>

    </div>
  );
}

export default App;
