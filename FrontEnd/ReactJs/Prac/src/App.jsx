import React, { useEffect, useState } from 'react';
import axios from 'axios';

const App = () => {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');

  // const handleSubmit = async (e) => {
  //   e.preventDefault();
  //   try {
  //     const response = await axios.post('http://localhost:8080/register', { username, password });
  //     console.log('Login successful', response.data);
  //   } catch (error) {
  //     setError('Invalid username or password');
  //   }
  // };
//   const getDetails =()=>{
// fetch('http://localhost:8080/flight/DEL/BOM/3')
// .then(res=>res.json())
// .then(json=>console.log(json))
//   }
// useEffect(()=>{
//   getDetails();
// })
  return (
    <>
    </>
    // <div>
    //   <h2>Login</h2>
    //   {error && <p>{error}</p>}
    //   <form onSubmit={handleSubmit}>
    //     <div>
    //       <label>Username</label>
    //       <input type="text" value={username} onChange={(e) => setUsername(e.target.value)} />
    //     </div>
    //     <div>
    //       <label>Password</label>
    //       <input type="password" value={password} onChange={(e) => setPassword(e.target.value)} />
    //     </div>
    //     <button type="submit">Login</button>
    //   </form>
    // </div>
  );
};

export default App;
