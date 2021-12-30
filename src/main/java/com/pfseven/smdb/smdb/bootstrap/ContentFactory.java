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
                        .title("Best Picture - Schindler's List - Steven Spielberg")
                        .yearOfAward("1994")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Special Achievement Award - Toy Story")
                        .yearOfAward("1996")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Outstanding Animated Program - Rick & Morty - Wesley Archer")
                        .yearOfAward("2014")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Best Actor - Kinsey -  Liam Neeson")
                        .yearOfAward("2005")
                        .category("AARP Movies for Grownups")
                        .build(),
                Award.builder()
                        .title("Voice Over Talent Love Thy Nature - Liam Neeson")
                        .yearOfAward("2015")
                        .category("Accolade Competition")
                        .build(),
                Award.builder()
                        .title("Best Director Saving Private Ryan - Steven Spielberg")
                        .yearOfAward("1999")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Outstanding Miniseries The Pacific - Steven Spielberg")
                        .yearOfAward("2010")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Outstanding Miniseries Taken - Steven Spielberg")
                        .yearOfAward("2003")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Outstanding Miniseries Band of Brothers - Steven Spielberg")
                        .yearOfAward("2002")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Outstanding Animated Program Pinky and the Brain - Steven Spielberg")
                        .yearOfAward("1996")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Best Film Schindler's List - Steven Spielberg")
                        .yearOfAward("1994")
                        .category("BAFTA")
                        .build(),
                Award.builder()
                        .title("Best Director Schindler's List - Steven Spielberg")
                        .yearOfAward("2014")
                        .category("20/20")
                        .build(),
                Award.builder()
                        .title("Best Director Lincoln - Steven Spielberg")
                        .yearOfAward("2013")
                        .category("AARP Movies for Grownups")
                        .build(),
                Award.builder()
                        .title("Best Director Munich - Steven Spielberg")
                        .yearOfAward("2006")
                        .category("AARP Movies for Grownups")
                        .build(),
                Award.builder()
                        .title("Best Actress EverAfter - Drew Barrymore")
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
                        .title("Outstanding Animated Program (For Programming One Hour or Less) King of the Hill - Wesley Archer")
                        .yearOfAward("1999")
                        .category("Emmy")
                        .build(),
                Award.builder()
                        .title("Best Actor in a Supporting Role Goodfellas - Joe Pesci")
                        .yearOfAward("1991")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Most Outstanding Newcomer to Leading Film Roles Raging Bull - Joe Pesci")
                        .yearOfAward("1982")
                        .category("BAFTA")
                        .build(),
                Award.builder()
                        .title("Best Supporting Actor Goodfellas - Joe Pesci")
                        .yearOfAward("2011")
                        .category("20/20")
                        .build(),
                Award.builder()
                        .title("Funniest Actor in a Motion Picture (Leading Role) My Cousin Vinny - Joe Pesci")
                        .yearOfAward("1992")
                        .category("American Comedy")
                        .build(),
                Award.builder()
                        .title("Best Actor in a Leading Role Raging Bull - Robert De Niro")
                        .yearOfAward("1981")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Best Actor in a Supporting Role The Godfather: Part II - Robert De Niro")
                        .yearOfAward("1975")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Best Actor in a Motion Picture - DramaRaging Bull - Robert De Niro")
                        .yearOfAward("1981")
                        .category("Golden Globes")
                        .build(),
                Award.builder()
                        .title("Best Performance by an Actor in a Supporting Role Django Unchained - Christoph Waltz")
                        .yearOfAward("2013")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Best Performance by an Actor in a Supporting Role Inglourious Basterds - Christoph Waltz")
                        .yearOfAward("2010")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Best Supporting Actor Django Unchained - Christoph Waltz")
                        .yearOfAward("2013")
                        .category("BAFTA")
                        .build(),
                Award.builder()
                        .title("Best Supporting Actor Inglourious Basterds - Christoph Waltz")
                        .yearOfAward("2010")
                        .category("BAFTA")
                        .build(),
                Award.builder()
                        .title("Best Performance by an Actor in a Supporting Role in a Motion Picture Django Unchained - Christoph Waltz")
                        .yearOfAward("2012")
                        .category("Golden Globes")
                        .build(),
                Award.builder()
                        .title("Best Performance by an Actor in a Supporting Role in a Motion Picture Inglourious Basterds - Christoph Waltz")
                        .yearOfAward("2009")
                        .category("Golden GLobes")
                        .build(),
                Award.builder()
                        .title("Best Music, Original Score John Williams E.T.")
                        .yearOfAward("1983")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Best Score John Williams E.T.")
                        .yearOfAward("1983")
                        .category("BAFTA")
                        .build(),
                Award.builder()
                        .title("Best Original Score - Motion Picture John Williams E.T.")
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
                        .awards(Set.of(awards.get(20), awards.get(21), awards.get(22)))
                        .build(),
                Individual.builder()
                        .email("stevenspielrock@gmail.com")
                        .age(77)
                        .firstName("Steven")
                        .lastName("Spielberg")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Producer, ContributingRole.Writer))
                        .awards(Set.of(awards.get(0), awards.get(5), awards.get(6), awards.get(7), awards.get(8), awards.get(9), awards.get(10), awards.get(11), awards.get(12), awards.get(13)))
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

        List<Film> films = filmService.createAll(
                Film.builder()
                        .title("Schindler's List")
                        .description("In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.")
                        //.genre("Biography, Drama")
                        .genre(Genre.Biography)
                        .length(195)
                        //.releaseDate("1994-02-04")
                        .releaseDate(LocalDate.of(1994, 2, 4))
                        .rating(8.9)
                        .countryOfOrigin("USA")
                        .language("English, Hebrew, German, Polish, Latin")
                        .awards(Set.of(awards.get(0), awards.get(10), awards.get(11)))
                        .awards(new HashSet<Award>(awardService.find()))
                        .budget(22000000)
                        .revenue(322161245)
                        .build(),
                Film.builder()
                        .title("E.T. the Extra-Terrestrial")
                        .description("A troubled child summons the courage to help a friendly alien escape Earth and return to his home world.")
                        .genre("Adventure, Family, Sci-Fi")
                        .length(115)
                        .releasedate(LocalDate.of(1982,6,11)
                        .rating(7.8)
                        .countryoforigin("USA")
                        .language("English")
                        .awards(Set.of(awards.get(17), awards.get(36), awards.get(37), awards.get(38)))
                        .budget(10500000)
                        .revenue(792910554)
                        .build(),
                Film.builder()
                        .title("Toy Story")
                        .description("A cowboy doll is profoundly threatened and jealous when a new spaceman figure supplants him as top toy in a boy's room.")
                        .genre("Animation, Adventure, Comedy")
                        .length(81)
                        .releasedate(LocalDate.of(1995,11,22)
                        .rating(8.3)
                        .countryoforigin("USA")
                        .language("English")
                        .awards(Set.of(awards.get(1)))
                        .budget(30000000)
                        .revenue(394436586)
                        .build()
            );

        List<TvShow> tvshows = tvshowService.createAll(
                TvShow.builder()
                        .title("Cosmos: A Spacetime Odyssey")
                        .description("An exploration of our discovery of the laws of nature and coordinates in space and time.")
                        .genre("Documentary")
                        .length(44)
                        .releasedate(LocalDate.of(2014,3,9)
                        .rating(9.3)
                        .countryoforigin("USA")
                        .language("English")
                        .awards(Set.of(awards.get(18), awards.get(41), awards.get(42), awards.get(43), awards.get(44), awards.get(41)))
                        .budget(6000000)
                        .revenue(135429666)
                        .seasons(1)
                        .episodes(13)
                        .build(),
                TvShow.builder()
                        .title("Black Sails")
                        .description("Follows Captain Flint and his pirates twenty years prior to Robert Louis Stevenson's classic novel \"Treasure Island.\"")
                        .genre("Adventure, Drama")
                        .length(56)
                        .releasedate(LocalDate.of(2014,01,25)
                        .rating(8.2)
                        .countryoforigin("USA, South Africa")
                        .language("English")
                        .awards(Set.of(awards.get(39), awards.get(40)))
                        .budget(15460000)
                        .revenue(249752131)
                        .seasons(4)
                        .episodes(38)
                        .build(),
                TvShow.builder()
                        .title("Rick and Morty")
                        .description("An animated series that follows the exploits of a super scientist and his not-so-bright grandson.")
                        .genre("Animation, Adventure, Comedy")
                        .length(23)
                        .releasedate(LocalDate.of(2013,12,02)
                        .rating(9.2)
                        .countryoforigin("USA")
                        .language("English")
                        .awards(Set.of(awards.get(20), awards.get(21)))
                        .budget(24000000)
                        .revenue(666732999)
                        .seasons(5)
                        .episodes(52)
                        .build()
    }
}
