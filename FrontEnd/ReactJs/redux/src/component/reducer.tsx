import { ADD_TODO, DELETE_TODO } from "./action";


const initialState = {
  todos: []
};

const todoReducer = (state = initialState, action: any) => {
  switch(action.type) {
    case ADD_TODO:
      return {
        ...state,
        todos: [...state.todos, action.payload]
      };
    case DELETE_TODO:
      return {
        ...state,
        todos: state.todos.filter(todo => todo.id !==action.payload.id)
      };
    default:
      return state;
  }
};

export default todoReducer;