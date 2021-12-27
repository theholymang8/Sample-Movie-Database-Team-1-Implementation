package com.pfseven.smdb.smdb.bootstrap;

import com.pfseven.smdb.smdb.base.AbstractLogComponent;
import com.pfseven.smdb.smdb.domain.Actor;
import com.pfseven.smdb.smdb.services.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Profile("content-generator")
public class FilmsFactory extends AbstractLogComponent implements CommandLineRunner {

    private final FilmService filmService;

    @Override
    public void run(String... args)  {

        List<Film> films = filmService.createAll(
                Film.builder()
                        .title("Schindler's List")
                        .description("In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.")
                        .genre("Biography, Drama")
                        .length(195)
                        .releasedate('1994-02-04')
                        .rating(8.9)
                        .countryoforigin("USA")
                        .language("English, Hebrew, German, Polish, Latin")
                        .awards("Best Picture, Best Director, Best Writing, Best Cinematography, Best Art Direction-Set Decoration, Best Film Editing, Best Music-Original Score")
                        .budget(22000000)
                        .revenue(322161245)
                        .build(),
                Film.builder()
                        .title("E.T. the Extra-Terrestrial")
                        .description("A troubled child summons the courage to help a friendly alien escape Earth and return to his home world.")
                        .genre("Adventure, Family, Sci-Fi")
                        .length(115)
                        .releasedate('1982-06-11')
                        .rating(7.8)
                        .countryoforigin("USA")
                        .language("English")
                        .awards("Best Sound, Best Visual Effects, Best Sound Effects Editing, Best Music")
                        .budget(10500000)
                        .revenue(792910554)
                        .build(),
                Film.builder()
                        .title("Toy Story")
                        .description("A cowboy doll is profoundly threatened and jealous when a new spaceman figure supplants him as top toy in a boy's room.")
                        .genre("Animation, Adventure, Comedy")
                        .length(81)
                        .releasedate('1995-11-22')
                        .rating(8.3)
                        .countryoforigin("USA")
                        .language("English")
                        .awards("Special Achievement Award - First feature-length computer-animated film")
                        .budget(30000000)
                        .revenue(394436586)
                        .build()
/*
                //Form used for future inserts.
                        Film.builder()
                                .title("")
                                .description("")
                                .genre("")
                                .length()
                                .releasedate('')
                                .rating()
                                .countryoforigin("")
                                .language("")
                                .awards("")
                                .budget()
                                .revenue()
                                .build(),
*/
        );
        //filmService.createAll(films);
        logger.info("Created 3 films: {}", films);
    }
}