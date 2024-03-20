import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import TodoInput from './component/ToDo/ToDoInput'
import TodoList from './component/ToDo/ToDoList'
import { Provider } from 'react-redux'
import store from './component/store'

function App() {
 

  return (
    <>
      <Provider store={store}>
      <div>
        <h1>ToDo List</h1>
        <TodoInput />
        <TodoList />
      </div>
    </Provider>
    </>
  )
}

export default App
