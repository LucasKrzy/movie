import { ReactComponent as GithubIcon } from "assets/img/github.svg";
import './styles.css';

function Navbar(){
   return(
    <header>
            <nav className="container">
                <div className="movie-nav-content">
                    <h1>Movie</h1>
                    <a href="https://github.com/LucasKrzy" target="_blank" rel="noreferrer">
                        <div className="movie-contact-container">
                            <GithubIcon />
                            <p className="movie-contact-link">/LucasKrzy</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
   );
}

export default Navbar;