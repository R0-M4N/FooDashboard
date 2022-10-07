import Home from '../../pages/Home';
import SwapIngredient from '../../pages/SwapIngredient';
import {BrowserRouter as Router} from 'react-router-dom';
import {Routes, Route} from 'react-router-dom';
import TemporaryDrawer from '../sidebar/TemporaryDrawer';

const Routing = () => {
  return (
    <Router>
        <TemporaryDrawer />
        <Routes>
        <Route path='/' exact element={<Home />} />
        <Route path='/swap' exact element={<SwapIngredient />} />
        </Routes>
    </Router>
  )
}

export default Routing