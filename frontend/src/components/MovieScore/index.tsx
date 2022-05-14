import MovieStars from "components/MovieStars";
import './styles.css';

function MovieScore() {

    const score = 3.6;
    const count = 10;
    
    return (
        <div className="movie-score-container">
            <p className="movie-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
            <MovieStars />
            <p className="movie-score-count">{count} avaliações</p>
        </div>
    );
}

export default MovieScore;