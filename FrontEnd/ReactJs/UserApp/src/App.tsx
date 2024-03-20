import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Login from './component/Login'
import { Route, Routes } from 'react-router-dom'
import Post from './component/PostFile'

function App() {
  return (
    <>
      <Routes>
          <Route path="/" element={<Login/>}/>
       
          <Route path="/post" element={<Post/>}/>
        </Routes>
    </>
  )
}

export default App
