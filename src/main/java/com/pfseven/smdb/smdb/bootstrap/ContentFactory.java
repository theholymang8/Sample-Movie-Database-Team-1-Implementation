package com.pfseven.smdb.smdb.bootstrap;

import com.pfseven.smdb.smdb.base.AbstractLogComponent;
import com.pfseven.smdb.smdb.domain.Award;
import com.pfseven.smdb.smdb.domain.ContributingRole;
import com.pfseven.smdb.smdb.domain.Individual;
import com.pfseven.smdb.smdb.services.AwardService;
import com.pfseven.smdb.smdb.services.FilmService;
import com.pfseven.smdb.smdb.services.IndividualService;
import com.pfseven.smdb.smdb.services.TvShowService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
@RequiredArgsConstructor
@Profile("content-generator")
public class ContentFactory extends AbstractLogComponent implements CommandLineRunner {

    private final AwardService awardService;
    private final FilmService filmService;
    private final TvShowService tvShowService;
    private final IndividualService individualService;

    @Override
    public void run(String... args) {

        //Awards Factory

        List<Award> awards = List.of(
                Award.builder()
                        .title("Best Picture - Schindler's List")
                        .yearOfAward("1994")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Special Achievement Award - Toy Story")
                        .yearOfAward("1996")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Outstanding Animated Program - Rick & Morty")
                        .yearOfAward("2014")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Best Actor - Kinsey")
                        .yearOfAward("2005")
                        .category("AARP Movies for Grownups")
                        .build(),
                Award.builder()
                        .title("Voice Over Talent Love Thy Nature")
                        .yearOfAward("2015")
                        .category("Accolade Competition")
                        .build(),
                Award.builder()
                        .title("Best Director Saving Private Ryan")
                        .yearOfAward("1999")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Outstanding Miniseries The Pacific")
                        .yearOfAward("2010")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Outstanding Miniseries Taken")
                        .yearOfAward("2003")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Outstanding Miniseries Band of Brothers")
                        .yearOfAward("2002")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Outstanding Animated Program Pinky and the Brain")
                        .yearOfAward("1996")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Best Film Schindler's List")
                        .yearOfAward("1994")
                        .category("BAFTA")
                        .build(),
                Award.builder()
                        .title("Best Director Schindler's List")
                        .yearOfAward("2014")
                        .category("20/20")
                        .build(),
                Award.builder()
                        .title("Best Director Lincoln")
                        .yearOfAward("2013")
                        .category("AARP Movies for Grownups")
                        .build(),
                Award.builder()
                        .title("Best Director Munich")
                        .yearOfAward("2006")
                        .category("AARP Movies for Grownups")
                        .build(),
                Award.builder()
                        .title("Best Actress EverAfter")
                        .yearOfAward("1999")
                        .category("Academy of Science Fiction")
                        .build(),
                Award.builder()
                        .title("Best Actor Galaxy Quest")
                        .yearOfAward("2000")
                        .category("Academy of Science Fiction")
                        .build(),
                Award.builder()
                        .title("Best Performance by an Actor in a Television Series - Comedy or Musical Home Improvement")
                        .yearOfAward("1995")
                        .category("Golden Globes")
                        .build(),
                Award.builder()
                        .title("Best Writing E.T. the Extra-Terrestrial")
                        .yearOfAward("1983")
                        .category("Academy of Science Fiction")
                        .build(),
                Award.builder()
                        .title("Outstanding Writing for Nonfiction Programming Cosmos: A Spacetime Odyssey")
                        .yearOfAward("2014")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Best Dramatic Presentation Contact")
                        .yearOfAward("1998")
                        .category("Hugo")
                        .build(),
                Award.builder()
                        .title("Outstanding Animated Program Rick and Morty")
                        .yearOfAward("2020")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Outstanding Animated Program Rick and Morty")
                        .yearOfAward("2018")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Outstanding Animated Program (For Programming One Hour or Less) King of the Hill")
                        .yearOfAward("1999")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Best Actor in a Supporting Role Goodfellas")
                        .yearOfAward("1991")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Most Outstanding Newcomer to Leading Film Roles Raging Bull")
                        .yearOfAward("1982")
                        .category("BAFTA")
                        .build(),
                Award.builder()
                        .title("Best Supporting Actor Goodfellas")
                        .yearOfAward("2011")
                        .category("20/20")
                        .build(),
                Award.builder()
                        .title("Funniest Actor in a Motion Picture (Leading Role) My Cousin Vinny")
                        .yearOfAward("1992")
                        .category("American Comedy")
                        .build(),
                Award.builder()
                        .title("Best Actor in a Leading Role Raging Bull")
                        .yearOfAward("1981")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Best Actor in a Supporting Role The Godfather: Part II")
                        .yearOfAward("1975")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Best Actor in a Motion Picture - DramaRaging Bull")
                        .yearOfAward("1981")
                        .category("Golden Globes")
                        .build(),
                Award.builder()
                        .title("Best Performance by an Actor in a Supporting Role Django Unchained")
                        .yearOfAward("2013")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Best Performance by an Actor in a Supporting Role Inglourious Basterds")
                        .yearOfAward("2010")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Best Supporting Actor Django Unchained")
                        .yearOfAward("2013")
                        .category("BAFTA")
                        .build(),
                Award.builder()
                        .title("Best Supporting Actor Inglourious Basterds")
                        .yearOfAward("2010")
                        .category("BAFTA")
                        .build(),
                Award.builder()
                        .title("Best Performance by an Actor in a Supporting Role in a Motion Picture Django Unchained")
                        .yearOfAward("2012")
                        .category("Golden Globes")
                        .build(),
                Award.builder()
                        .title("Best Performance by an Actor in a Supporting Role in a Motion Picture Inglourious Basterds")
                        .yearOfAward("2009")
                        .category("Golden GLobes")
                        .build(),
                Award.builder()
                        .title("Best Music, Original Score John Williams E.T.")
                        .yearOfAward("1983")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Best Score John Williams")
                        .yearOfAward("1983")
                        .category("BAFTA")
                        .build(),
                Award.builder()
                        .title("Best Original Score - Motion Picture John Williams")
                        .yearOfAward("1983")
                        .category("Golden Globes")
                        .build(),
                Award.builder()
                        .title("Outstanding Sound Editing for a Series Black Sails")
                        .yearOfAward("2016")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Outstanding Sound Editing for a Series Black Sails")
                        .yearOfAward("2014")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Outstanding Original Main Title Theme Music Cosmos")
                        .yearOfAward("2014")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Outstanding Sound Editing for Nonfiction Programming Cosmos")
                        .yearOfAward("2014")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Outstanding Music Composition for a Series Cosmos")
                        .yearOfAward("2014")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Best Animated Special Production Cosmos")
                        .yearOfAward("2015")
                        .category("Annie")
                        .build()
        );

        //awardService.createAll(awards);


        //Award award = awards.get(0);
        //logger.info("Created 45 awards: {}", (awards.forEach(award -> award.getTitle().equals("Best Animated Special Production Cosmos"))));
        logger.info("Created 45 awards : {}", awards);
        //Individual Factory

        List<Individual> individuals = List.of(
                Individual.builder()
                        .email("liamneeson@outlook.com")
                        .age(69)
                        .firstName("Liam")
                        .lastName("Neeson")
                        .nationality("British")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        .awards(Set.of(awards.get(3), awards.get(4)))
                        .build(),
                Individual.builder()
                        .email("drewbarrymore@outlook.com")
                        .age(46)
                        .firstName("Drew")
                        .lastName("Barrymore")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Director, ContributingRole.Producer, ContributingRole.Writer))
                        .awards(Set.of(awards.get(14)))
                        .build(),
                Individual.builder()
                        .email("timallen@gmail.com")
                        .age(68)
                        .firstName("Tim")
                        .lastName("Allen")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        .awards(Set.of(awards.get(15), awards.get(16)))
                        .build(),
                Individual.builder()
                        .email("jonburton@gmail.com")
                        .age(52)
                        .firstName("Jon")
                        .lastName("Burton")
                        .nationality("British")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Writer))
                        .build(),
                Individual.builder()
                        .email("ronweasley@gmail.com")
                        .age(60)
                        .firstName("Wesley")
                        .lastName("Archer")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director))
                        .awards(Set.of(awards.get(20), awards.get(21)))
                        .build(),
                Individual.builder()
                        .email("stevenspielrock@gmail.com")
                        .age(77)
                        .firstName("Steven")
                        .lastName("Spielberg")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Producer, ContributingRole.Writer))
                        .awards(Set.of(awards.get(22), awards.get(0), awards.get(5), awards.get(6), awards.get(7), awards.get(8), awards.get(9), awards.get(10), awards.get(11), awards.get(12), awards.get(13)))
                        .build(),
                Individual.builder()
                        .email("melissamathison@gmail.com")
                        .age(65)
                        .firstName("Melissa")
                        .lastName("Mathison")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Writer))
                        .awards(Set.of(awards.get(17)))
                        .build(),
                Individual.builder()
                        .email("anndruchii@gmail.com")
                        .age(73)
                        .firstName("Ann")
                        .lastName("Druyan")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Producer))
                        .awards(Set.of(awards.get(18), awards.get(19)))
                        .build(),
                Individual.builder()
                        .email("robertlevine@gmail.com")
                        .age(45)
                        .firstName("Robert")
                        .lastName("Levine")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Producer))
                        .build(),
                Individual.builder()
                        .email("nothisispatrick@gmail.com")
                        .age(59)
                        .firstName("Patrick")
                        .lastName("Gilmore")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        .build(),
                Individual.builder()
                        .email("joepesci@gmail.com")
                        .age(77)
                        .firstName("Joe")
                        .lastName("Pesci")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        .awards(Set.of(awards.get(23), awards.get(24), awards.get(25), awards.get(26)))
                        .build(),
                Individual.builder()
                        .email("robertdenniro@outlook.com")
                        .age(78)
                        .firstName("Robert")
                        .lastName("De Niro Jr")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Director, ContributingRole.Producer))
                        .awards(Set.of(awards.get(27), awards.get(28), awards.get(29)))
                        .build(),
                Individual.builder()
                        .email("christophwaltz@gmail.com")
                        .age(65)
                        .firstName("Christoph")
                        .lastName("Waltz")
                        .nationality("German")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        .awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("kathleenkennedy@gmail.com")
                        .age(69)
                        .firstName("Kathleen")
                        .lastName("Kennedy")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Producer))
                        .build()
        );

        individualService.createAll(individuals);
        logger.info("Created 13 Individuals: {}", individuals);

        //Film Factory
//
//        List<Film> films = List.of(
//                Film.builder()
//                        .title("Schindler's List")
//                        .description("In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.")
//                        //.genre("Biography, Drama")
//                        .genre(Genre.Biography)
//                        .length(195)
//                        //.releaseDate("1994-02-04")
//                        .releaseDate(LocalDate.of(1994, 2, 4))
//                        .rating(8.9f)
//                        .countryOfOrigin("USA")
//                        .language("English, Hebrew, German, Polish, Latin")
//                        .awards(Set.of(awards.get(0), awards.get(10), awards.get(11)))
//                        //awards(new HashSet<Award>(awardService.find()))
//                        .budget(BigDecimal.valueOf(22000000))
//                        .revenue(BigDecimal.valueOf(322161245))
//                        .build(),
//                Film.builder()
//                        .title("E.T. the Extra-Terrestrial")
//                        .description("A troubled child summons the courage to help a friendly alien escape Earth and return to his home world.")
//                        .genre(Genre.Adventure) //, Genre.Family, Genre.Sci_Fi
//                        .length(115)
//                        .releaseDate(LocalDate.of(1982,6,11))
//                        .rating(7.8f)
//                        .countryOfOrigin("USA")
//                        .language("English")
//                        .awards(Set.of(awards.get(17), awards.get(36), awards.get(37), awards.get(38)))
//                        .budget(BigDecimal.valueOf(10500000))
//                        .revenue(BigDecimal.valueOf(792910554))
//                        .build(),
//                Film.builder()
//                        .title("Toy Story")
//                        .description("A cowboy doll is profoundly threatened and jealous when a new spaceman figure supplants him as top toy in a boy's room.")
//                        .genre(Genre.Animation) // Genre.Adventure, Genre.Comedy
//                        .length(81)
//                        .releaseDate(LocalDate.of(1995,11,22))
//                        .rating(8.3f)
//                        .countryOfOrigin("USA")
//                        .language("English")
//                        .awards(Set.of(awards.get(1)))
//                        .budget(BigDecimal.valueOf(30000000))
//                        .revenue(BigDecimal.valueOf(394436586))
//                        .build(),
//                Film.builder()
//                        .title("Kinsey")
//                        .description("A look at the life of Alfred Kinsey, a pioneer in the area of human sexuality research, whose 1948 publication \"Sexual Behavior in the Human Male\" was one of the first recorded works that saw science address sexual behavior.")
//                        .genre(Genre.Biography) //, Genre.Drama, Genre.Romance
//                        .length(118)
//                        .releaseDate(LocalDate.of(2004,11,12))
//                        .rating(7.1f)
//                        .countryOfOrigin("USA")
//                        .language("English")
//                        .awards(Set.of(awards.get(4)))
//                        .budget(BigDecimal.valueOf(11000000))
//                        .revenue(BigDecimal.valueOf(16900000))
//                        .build(),
//                Film.builder()
//                        .title("Love thy nature")
//                        .description("The film shows that a renewed connection with nature is key both to good health and to solving our environmental and climate crises.")
//                        .genre(Genre.Documentary)
//                        .length(76)
//                        .releaseDate(LocalDate.of(2014,10,18))
//                        .rating(6.8f)
//                        .countryOfOrigin("USA")
//                        .language("English")
//                        .awards(Set.of(awards.get(5)))
//                        .budget(BigDecimal.valueOf(60000)) //couldnt find the budget
//                        .revenue(BigDecimal.valueOf(53134))
//                        .build(),
//                Film.builder()
//                        .title("Saving Pirate Ryan")
//                        .description("Following the Normandy Landings, a group of U.S. soldiers go behind enemy lines to retrieve a paratrooper whose brothers have been killed in action.")
//                        .genre(Genre.War) //Genre.Drama
//                        .length(169)
//                        .releaseDate(LocalDate.of(1998,07,24))
//                        .rating(8.6f)
//                        .countryOfOrigin("USA")
//                        .language("English")
//                        .awards(Set.of(awards.get(6)))
//                        .budget(BigDecimal.valueOf(70000000))
//                        .revenue(BigDecimal.valueOf(482300000))
//                        .build(),
//                Film.builder()
//                        .title("Lincoln")
//                        .description("As the American Civil War continues to rage, America's president struggles with continuing carnage on the battlefield as he fights with many inside his own cabinet on the decision to emancipate the slaves.")
//                        .genre(Genre.Biography) //, Genre.Drama, Genre.History
//                        .length(150)
//                        .releaseDate(LocalDate.of(2012,10,8))
//                        .rating(7.3f)
//                        .countryOfOrigin("USA")
//                        .language("English")
//                        .awards(Set.of(awards.get(13)))
//                        .budget(BigDecimal.valueOf(65000000))
//                        .revenue(BigDecimal.valueOf(275300000))
//                        .build(),
//                Film.builder()
//                        .title("Munich")
//                        .description("After the Black September capture and massacre of Israeli athletes at the 1972 Olympics, five men are chosen to eliminate the people responsible for that fateful day.")
//                        .genre(Genre.Action) //, Genre.Drama, Genre.History
//                        .length(163)
//                        .releaseDate(LocalDate.of(2005,12,23))
//                        .rating(7.5f)
//                        .countryOfOrigin("USA")
//                        .language("English")
//                        .awards(Set.of(awards.get(14)))
//                        .budget(BigDecimal.valueOf(70000000))
//                        .revenue(BigDecimal.valueOf(130400000))
//                        .build(),
//                Film.builder()
//                        .title("EverAfter")
//                        .description("The Brothers Grimm arrive at the home of a wealthy Grande Dame who speaks of the many legends surrounding the fable of the cinder girl before telling the \"true\" story of her ancestor.")
//                        .genre(Genre.Comedy) //, Genre.Drama, Genre.Romance"
//                        .length(121)
//                        .releaseDate(LocalDate.of(1998,7,31))
//                        .rating(7.1f)
//                        .countryOfOrigin("USA")
//                        .language("English")
//                        .awards(Set.of(awards.get(15)))
//                        .budget(BigDecimal.valueOf(26000000))
//                        .revenue(BigDecimal.valueOf(98000000))
//                        .build(),
//                Film.builder()
//                        .title("Galaxy Quest")
//                        .description("The alumni cast of a space opera television series have to play their roles as the real thing when an alien race needs their help. However, they also have to defend both Earth and the alien race from a reptilian warlord.")
//                        .genre(Genre.Adventure) //, Genre.Comedy, Genre.Sci-Fi"
//                        .length(102)
//                        .releaseDate(LocalDate.of(1999,12,25))
//                        .rating(7.3f)
//                        .countryOfOrigin("USA")
//                        .language("English")
//                        .awards(Set.of(awards.get(16)))
//                        .budget(BigDecimal.valueOf(45000000))
//                        .revenue(BigDecimal.valueOf(90700000))
//                        .build(),
//                Film.builder()
//                        .title("Contact")
//                        .description("Dr. Ellie Arroway, after years of searching, finds conclusive radio proof of extraterrestrial intelligence, sending plans for a mysterious machine.")
//                        .genre(Genre.Drama)//, Genre.Mystery, Genre.Sci-Fi"
//                        .length(150)
//                        .releaseDate(LocalDate.of(1997,7,11))
//                        .rating(7.5f)
//                        .countryOfOrigin("USA")
//                        .language("English")
//                        .awards(Set.of(awards.get(20)))
//                        .budget(BigDecimal.valueOf(90000000))
//                        .revenue(BigDecimal.valueOf(171100000))
//                        .build(),
//                Film.builder()
//                        .title("GoodFellas")
//                        .description("The story of Henry Hill and his life in the mob, covering his relationship with his wife Karen Hill and his mob partners Jimmy Conway and Tommy DeVito in the Italian-American crime syndicate.")
//                        .genre(Genre.Biography) //, Genre.Crime, Genre.Drama"
//                        .length(146)
//                        .releaseDate(LocalDate.of(1990,9,9))
//                        .rating(8.7f)
//                        .countryOfOrigin("USA")
//                        .language("English")
//                        .awards(Set.of(awards.get(24), awards.get(26)))
//                        .budget(BigDecimal.valueOf(25000000))
//                        .revenue(BigDecimal.valueOf(47100000))
//                        .build(),
//                Film.builder()
//                        .title("Raging Bull")
//                        .description("The life of boxer Jake LaMotta, whose violence and temper that led him to the top in the ring destroyed his life outside of it.")
//                        .genre(Genre.Biography) //, Genre.Drama, Genre.Sport"
//                        .length(129)
//                        .releaseDate(LocalDate.of(1990,12,19))
//                        .rating(8.2f)
//                        .countryOfOrigin("USA")
//                        .language("English")
//                        .awards(Set.of(awards.get(25), awards.get(28), awards.get(30)))
//                        .budget(BigDecimal.valueOf(18000000))
//                        .revenue(BigDecimal.valueOf(23400000))
//                        .build(),
//                Film.builder()
//                        .title("The Godfather : Part II")
//                        .description("The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate.")
//                        .genre(Genre.Crime) //, Genre.Drama"
//                        .length(200)
//                        .releaseDate(LocalDate.of(1974,12,12))
//                        .rating(9.0f)
//                        .countryOfOrigin("USA")
//                        .language("English, Sicilian")
//                        .awards(Set.of(awards.get(29) ))
//                        .budget(BigDecimal.valueOf(13000000))
//                        .revenue(BigDecimal.valueOf(93000000))
//                        .build(),
//                Film.builder()
//                        .title("Django Unchained")
//                        .description("With the help of a German bounty-hunter, a freed slave sets out to rescue his wife from a brutal plantation-owner in Mississippi.")
//                        .genre(Genre.Drama) //, Genre.Western"
//                        .length(165)
//                        .releaseDate(LocalDate.of(2012,12,11))
//                        .rating(8.4f)
//                        .countryOfOrigin("USA")
//                        .language("English")
//                        .awards(Set.of(awards.get(31) , awards.get(33), awards.get(35)) )
//                        .budget(BigDecimal.valueOf(100000000))
//                        .revenue(BigDecimal.valueOf(425400000))
//                        .build(),
//                Film.builder()
//                        .title("Inglourious Basterds")
//                        .description("In Nazi-occupied France during World War II, a plan to assassinate Nazi leaders by a group of Jewish U.S. soldiers coincides with a theatre owner's vengeful plans for the same.")
//                        .genre(Genre.Adventure) //, Genre.Drama, Genre.War"
//                        .length(153)
//                        .releaseDate(LocalDate.of(2009,5,20))
//                        .rating(8.4f)
//                        .countryOfOrigin("USA")
//                        .language("English, German, French")
//                        .awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
//                        .budget(BigDecimal.valueOf(70000000))
//                        .revenue(BigDecimal.valueOf(321500000))
//                        .build()
//
//                );
//
//        filmService.createAll(films);
//        logger.info("Created 16 films {}", films);
//
////
        List<TvShow> tvshows = List.of(
                TvShow.builder()
                        .title("Cosmos: A Spacetime Odyssey")
                        .description("An exploration of our discovery of the laws of nature and coordinates in space and time.")
                        .genre(Genre.Documentary)
                        .length(44)
                        .releaseDate(LocalDate.of(2014,3,9))
                        .rating(9.3f)
                        .countryOfOrigin("USA")
                        .language("English")
                        .awards(Set.of(awards.get(18), awards.get(41), awards.get(42), awards.get(43), awards.get(44), awards.get(41)))
                        .budget(BigDecimal.valueOf(6000000))
                        .revenue(BigDecimal.valueOf(135429666))
                        .seasons(1)
                        .episodes(13)
                        .build(),
                TvShow.builder()
                        .title("Black Sails")
                        .description("Follows Captain Flint and his pirates twenty years prior to Robert Louis Stevenson's classic novel \"Treasure Island.\"")
                        .genre(Genre.Adventure)
                        .length(56)
                        .releaseDate(LocalDate.of(2014,1,25))
                        .rating(8.2f)
                        .countryOfOrigin("USA, South Africa")
                        .language("English")
                        .awards(Set.of(awards.get(39), awards.get(40)))
                        .budget(BigDecimal.valueOf(15460000))
                        .revenue(BigDecimal.valueOf(249752131))
                        .seasons(4)
                        .episodes(38)
                        .build(),
                TvShow.builder()
                        .title("Rick and Morty")
                        .description("An animated series that follows the exploits of a super scientist and his not-so-bright grandson.")
                        .genre(Genre.Animation)
                        .length(23)
                        .releaseDate(LocalDate.of(2013,12,2))
                        .rating(9.2f)
                        .countryOfOrigin("USA")
                        .language("English")
                        .awards(Set.of(awards.get(20), awards.get(21)))
                        .budget(BigDecimal.valueOf(24000000))
                        .revenue(BigDecimal.valueOf(666732999))
                        .seasons(5)
                        .episodes(52)
                        .build(),
*/
    }
}

