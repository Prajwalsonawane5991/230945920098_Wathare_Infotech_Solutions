
import './App.css';
import FilterData from './Component/FilterData';
import { Footer, Header } from './Component/Headercomponent';
//import AboutUsPage from './Component/About';

import SummaryTable from './Component/SummaryTable';


function App() {
  return (
          <div>
   

   <Header></Header>
   <FilterData></FilterData>
    <SummaryTable></SummaryTable>
   <Footer></Footer>
    </div>
  
  );
}

export default App;
