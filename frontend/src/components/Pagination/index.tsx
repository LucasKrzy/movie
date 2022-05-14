import { ReactComponent as Arrow } from "assets/img/arrow.svg";
import './styles.css';

function Pagination() {
    return (
        <div className="movie-pagination-container">
            <div className="movie-pagination-box">
                <button className="movie-pagination-button" disabled={true} >
                    <Arrow />
                </button>
                <p>{`${1} de ${3}`}</p>
                <button className="movie-pagination-button" disabled={false} >
                    <Arrow className="movie-flip-horizontal" />
                </button>
            </div>
        </div>
    );
}

export default Pagination;