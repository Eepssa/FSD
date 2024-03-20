import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.tsx'
import './index.css'
import ListName from './component/ListName.tsx'
import ListGroup from './component/ListGroup.tsx'
import 'bootstrap/dist/css/bootstrap.min.css'
import Card from './component/card.tsx'
import CountBtn from './component/CountBtn.tsx'

const cars:string[]=["BMW","AUDI","MERCEDES"]

const moviesToBeAvoided:string[]=["RRR","JAWAN","PATHAN"]


ReactDOM.createRoot(document.getElementById('root')!).render(
  <React.StrictMode>
    {/* <App />
    <ListName/>
    <ListGroup items={cars} heading={"Car Data"}/>
    <br/>
    <ListGroup items={moviesToBeAvoided} heading={"Must Watch"}/> */}
    
    <div className="row">
    <div className="column">
    <Card images={"https://www.tripsavvy.com/thmb/tm4BaNcEHqi3N3PEhTDBJ24aXJ0=/3918x2612/filters:fill(auto,1)/luxury-meal--beef-wellington-1049342816-4322c6fe8aa54229a7d17b735c7a38a5.jpg"} 
    titles={""} buttons={"btn btn-primary"} />
   </div>
   <div className="column">
    <Card images={"https://th.bing.com/th/id/R.749c39ca9a94d5923c05dba22f01ecd5?rik=5JMtFb7HvvkzGA&riu=http%3a%2f%2flinkfeel.com%2fwp-content%2fuploads%2f2019%2f10%2ftypes-of-sport.jpeg&ehk=LTWLMpFMRi%2fTdPk2BJkrtH2wLI36k%2fza23eSJyEnn2A%3d&risl=&pid=ImgRaw&r=0"} 
    titles={"Sports"} buttons={"btn btn-secondary"} />
    </div>
    </div>
   <br/>
  <CountBtn prop={10} />
  </React.StrictMode>
)
