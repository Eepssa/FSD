import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.tsx'
import './index.css'
import Login from './component/Login.tsx'
import 'bootstrap/dist/css/bootstrap.min.css'
import ListGroup from './component/ListGroup.tsx'

ReactDOM.createRoot(document.getElementById('root')!).render(
  <React.StrictMode>
    <App />
     <Login/>
  </React.StrictMode>,
)
