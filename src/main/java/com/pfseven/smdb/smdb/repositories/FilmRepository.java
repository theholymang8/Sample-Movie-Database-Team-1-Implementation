package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.Content;
import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.domain.TvShow;

import com.pfseven.smdb.smdb.projections.ContentPerGenre;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface FilmRepository extends JpaRepository<Film, Long> {

    Film findByTitle(String title);

    List<Film> findByGenres(Genre genre);

    //List<Film> findAll(Pageable pageable);

    //Long exportFilms(Film film);

    //List<Film> findTop10ByOrderByRatingDesc();

    /*@Query(value = "SELECT CONTENT.*, F.FILMUNIVERSE\n" +
            "FROM\n" +
            "(SELECT C.*, CONTENT.GENRE\n" +
            "FROM(SELECT * FROM CONTENT_GENRE WHERE GENRE = ?) AS CONTENT\n" +
            "INNER JOIN CONTENTS C ON CONTENT.CONTENT_ID = C.ID) AS CONTENT\n" +
            "INNER JOIN FILMS F ON CONTENT.ID=F.ID;",  nativeQuery = true)
    List<Film> findByGenre(Genre genre);*/

    //List<Film> findByGenres(Set<Genre> genre);

    //Query 7
    //@Query("select c from ContentIndividual ci join ci.content c  join c.genres g where ci.id=?1 group by g")
    @Query(value="select CG.GENRE, C.TITLE from CONTENT_INDIVIDUALS CI\n" +
            "                                    join CONTENTS C on CI.CONTENT_ID = C.ID\n" +
            "                                    join CONTENT_GENRE CG on C.ID = CG.CONTENT_ID\n" +
            "                                    where CI.INDIVIDUAL_ID=?1 \n" +
            "                                    group by CG.GENRE , C.TITLE", nativeQuery = true)
    List<ContentPerGenre> contentPerGenreForGivenIndividual(Long individualID);

}
