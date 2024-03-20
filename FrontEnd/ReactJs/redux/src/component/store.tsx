
import { configureStore } from '@reduxjs/toolkit';
import todoReducer from './reducer';


const store = configureStore({
  reducer: {
    todos: todoReducer // Assuming todoReducer is the reducer for managing todos
    // You can add more reducers here if needed
  }
});

export default store;
