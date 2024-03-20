// TodoList.js
import React from "react";
import { useSelector, useDispatch } from "react-redux";
import { deleteTodo } from "../action";

const TodoList = () => {
  const todos = useSelector((state: any) => state.todos);
  const dispatch = useDispatch();

  const handleDeleteTodo = (id) => {
    dispatch(deleteTodo(id));
  };
  console.log(todos);
  //   const todoItems = [];
  //   for (let i = 0; i < todos.length; i++) {
  //     const todo = todos[i];
  //     todoItems.push(
  //       <li key={todo.id}>
  //         {todo.text}
  //         <button onClick={() => handleDeleteTodo(todo.id)}>-</button>
  //       </li>);

  return (
    <ul>
      {todos.todos.map((todo: any) => {
        return(
        <li key={todo.id}>
          {todo.text}
          <button onClick={() => handleDeleteTodo(todo.id)} style={{marginLeft:"10px"}}>-</button>
        </li>
        )
      })}
    </ul>
  );
};

export default TodoList;
