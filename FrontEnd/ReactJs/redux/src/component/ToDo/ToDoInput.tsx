import React, { useState } from 'react';
import { useDispatch } from 'react-redux';
import { addTodo } from '../action';

const TodoInput = () => {
  const [text, setText] = useState('');
  const dispatch = useDispatch();

  const handleAddTodo = () => {
    if (text.trim() !== '') {
      dispatch(addTodo(text));
      setText('');
    }
  };
  return (
    <div>
      <input type="text" value={text} onChange={(e) => setText(e.target.value)} />
      <button onClick={handleAddTodo}>+</button>
    </div>
  );
};

export default TodoInput;