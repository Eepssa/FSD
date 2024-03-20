import { Key } from "react";

export const ADD_TODO = 'ADD_TODO';
export const DELETE_TODO = 'DELETE_TODO';

export const addTodo = (text: string) => ({
  type: ADD_TODO,
  payload: {
    id: Date.now(),
    text
  }
});

export const deleteTodo = (id: any) => ({
  type: DELETE_TODO,
  payload: {
    id
  }
});