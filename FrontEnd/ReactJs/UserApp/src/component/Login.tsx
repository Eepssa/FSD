import React, { useState } from 'react';

const Login = () => {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [error, setError] = useState('');

    const loginUser = (e:any) => {
        e.preventDefault();

        fetch('http://localhost:9002/user')
            .then(response => {
                if (!response.ok) {
                    throw new Error('Failed to fetch user data');
                }
                return response.json();
            })
            .then(users => {
                const user = users.find(u => u.name === username && u.password === password);
                if (!user) {
                    throw new Error('Invalid credentials');
                }
                // Store user ID in localStorage
                localStorage.setItem('userId', user.id);
                setUsername('');
                setPassword('');
                window.location.href ='/post';
            })
            .catch(error => {
                setError('Login failed. Please check your credentials.');
            });
    };

    return (
       <>

        
            <h2>Login</h2>
            {error && <div style={{ color: 'red' }}>{error}</div>}
            
        <section className="vh-100">
  <div className="container py-5 h-100">
    <div className="row d-flex align-items-center justify-content-center h-100">
      <div className="col-md-8 col-lg-7 col-xl-6">
        <img
          src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.svg"
          className="img-fluid"
          alt="Phone image"
        />
      </div>
      <div className="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
        <form onSubmit={loginUser}>
          {/* Email input */}
          <div>
                    <label htmlFor="username">Username:</label>
                    <input 
                        type="text" 
                        id="username" 
                        name="username" 
                        value={username} 
                        onChange={(e) => setUsername(e.target.value)} 
                        required 
                    />
                </div>
                <br/>
                <div>
                    <label htmlFor="password">Password:</label>
                    <input 
                        type="password" 
                        id="password" 
                        name="password" 
                        value={password} 
                        onChange={(e) => setPassword(e.target.value)} 
                        required 
                    />
                </div>
                <br/>
          {/* Submit button */}
          <button type="submit" className="btn btn-primary btn-lg btn-block">
            Sign in
          </button><br/>

          <div className="divider d-flex align-items-center my-4">
          </div>

          <a
            className="btn btn-primary btn-lg btn-block"
            style={{ backgroundColor: "#55acee" }}
            href="#!"
            role="button"
          >
            <i className="fab fa-twitter me-2" />
            Continue with Twitter
          </a><br/>
        </form>
      </div>
    </div>
  </div>
</section>

        </>
    );
};

export default Login;
