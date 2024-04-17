import React from 'react';

const Header = () => {
  return (
    <header className="header">
    <nav className="navbar">
      <div className="navbar-brand">
        <span className="navbar-item">Machinewise Application</span>
      </div>
      <div className="navbar-menu">
        <div className="navbar-end">
          <a href="/" className="navbar-item">Home</a>
         
          
        </div>
      </div>
    </nav>
  </header>
  );
};

const Footer = () => {
  return (
    <footer className="footer">
      <p>&copy; {new Date().getFullYear()}Wathare Solutions PVT LTD</p>
    </footer>
  );
};

export { Header, Footer };
