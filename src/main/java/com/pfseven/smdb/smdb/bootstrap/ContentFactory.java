package com.pfseven.smdb.smdb.bootstrap;

import com.pfseven.smdb.smdb.base.AbstractLogComponent;
import com.pfseven.smdb.smdb.domain.*;
import com.pfseven.smdb.smdb.services.AwardService;
import com.pfseven.smdb.smdb.services.FilmService;
import com.pfseven.smdb.smdb.services.IndividualService;
import com.pfseven.smdb.smdb.services.TvShowService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
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

        //Individual Factory

        List<Individual> individuals = List.of(
                Individual.builder()
                        .email("liamneeson@outlook.com")
                        .age(69)
                        .firstName("Liam")
                        .lastName("Neeson")
                        .nationality("British")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        //.awards(Set.of(awards.get(3), awards.get(4)))
                        .build(),
                Individual.builder()
                        .email("drewbarrymore@outlook.com")
                        .age(46)
                        .firstName("Drew")
                        .lastName("Barrymore")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Director, ContributingRole.Producer, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(14)))
                        .build(),
                Individual.builder()
                        .email("timallen@gmail.com")
                        .age(68)
                        .firstName("Tim")
                        .lastName("Allen")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        //.awards(Set.of(awards.get(15), awards.get(16)))
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
                        //.awards(Set.of(awards.get(20), awards.get(21)))
                        .build(),
                Individual.builder()
                        .email("stevenspielrock@gmail.com")
                        .age(77)
                        .firstName("Steven")
                        .lastName("Spielberg")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Producer, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(22), awards.get(0), awards.get(5), awards.get(6), awards.get(7), awards.get(8), awards.get(9), awards.get(10), awards.get(11), awards.get(12), awards.get(13)))
                        .build(),
                Individual.builder()
                        .email("melissamathison@gmail.com")
                        .age(65)
                        .firstName("Melissa")
                        .lastName("Mathison")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Writer))
                        //.awards(Set.of(awards.get(17)))
                        .build(),
                Individual.builder()
                        .email("anndruchii@gmail.com")
                        .age(73)
                        .firstName("Ann")
                        .lastName("Druyan")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(18), awards.get(19)))
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
                        //.awards(Set.of(awards.get(23), awards.get(24), awards.get(25), awards.get(26)))
                        .build(),
                Individual.builder()
                        .email("robertdenniro@outlook.com")
                        .age(78)
                        .firstName("Robert")
                        .lastName("De Niro Jr")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Director, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(27), awards.get(28), awards.get(29)))
                        .build(),
                Individual.builder()
                        .email("christophwaltz@gmail.com")
                        .age(65)
                        .firstName("Christoph")
                        .lastName("Waltz")
                        .nationality("German")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("kathleenkennedy@gmail.com")
                        .age(69)
                        .firstName("Kathleen")
                        .lastName("Kennedy")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Producer))
                        .build(),
                Individual.builder()
                        .email("krysztofkies@gmail.com")
                        .age(54)
                        .firstName("Krzysztof")
                        .lastName("Kieslowski")
                        .nationality("Polish")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Director, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("juliettebinoche@gmail.com")
                        .age(57)
                        .firstName("Juliette")
                        .lastName("Binoche")
                        .nationality("French")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Director))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("audreytautou@gmail.com")
                        .age(45)
                        .firstName("Audrey")
                        .lastName("Tautou")
                        .nationality("French")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("guillaumelaurant@gmail.com")
                        .age(60)
                        .firstName("Guillaume")
                        .lastName("Laurant")
                        .nationality("French")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("jeanpierrejeunet@gmail.com")
                        .age(68)
                        .firstName("Jean-Pierre")
                        .lastName("Jeunet")
                        .nationality("French")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("thomasvinterberg@gmail.com")
                        .age(52)
                        .firstName("Thomas")
                        .lastName("Vinterberg")
                        .nationality("Danish")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer, ContributingRole.Director))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("madsmikkelsen@gmail.com")
                        .age(56)
                        .firstName("Mads")
                        .lastName("Mikkelsen")
                        .nationality("Danish")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("abbaskiarostami@gmail.com")
                        .age(76)
                        .firstName("Abbas")
                        .lastName("Kiarostami")
                        .nationality("Iranian")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("tatsuyanakadai@gmail.com")
                        .age(89)
                        .firstName("Tatsuya")
                        .lastName("Nakadai")
                        .nationality("Japanese")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("akirakurosawa@gmail.com")
                        .age(88)
                        .firstName("Akira")
                        .lastName("Kurosawa")
                        .nationality("Japanese")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("toshiromifune@gmail.com")
                        .age(77)
                        .firstName("Toshiro")
                        .lastName("Mifune")
                        .nationality("Japanese, Chinese")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer, ContributingRole.Director))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("wernerkrauss@gmail.com")
                        .age(75)
                        .firstName("Werner")
                        .lastName("Krauss")
                        .nationality("German")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("robertwiene@gmail.com")
                        .age(65)
                        .firstName("Robert")
                        .lastName("Wiene")
                        .nationality("German")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("wolfgangpetersen@gmail.com")
                        .age(80)
                        .firstName("Wolfgang")
                        .lastName("Petersen")
                        .nationality("German")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("denisvilleneuve@gmail.com")
                        .age(54)
                        .firstName("Denis")
                        .lastName("Villeneuve")
                        .nationality("Canadian")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("timotheechalamet@gmail.com")
                        .age(26)
                        .firstName("Timothée")
                        .lastName("Chalamet")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("rebeccaferguson@gmail.com")
                        .age(38)
                        .firstName("Rebecca")
                        .lastName("Ferguson")
                        .nationality("Swedish")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("javierbardem@gmail.com")
                        .age(52)
                        .firstName("Javier")
                        .lastName("Bardem")
                        .nationality("Spanish")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("petedocterm@gmail.com")
                        .age(53)
                        .firstName("Pete")
                        .lastName("Docter")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Producer, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("edasner@gmail.com")
                        .age(91)
                        .firstName("Ed")
                        .lastName("Asner")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("leeunkrich@gmail.com")
                        .age(54)
                        .firstName("Lee")
                        .lastName("Unkrich")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("anthonygonzalez@gmail.com")
                        .age(17)
                        .firstName("Anthony")
                        .lastName("Gonzalez")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("georgelucas@gmail.com")
                        .age(77)
                        .firstName("George")
                        .lastName("Lucas")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Producer, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("markhamill@gmail.com")
                        .age(70)
                        .firstName("Mark")
                        .lastName("Hamill")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer, ContributingRole.Director))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("harrisonford@gmail.com")
                        .age(79)
                        .firstName("Harrison")
                        .lastName("Ford")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("alecguinnesss@gmail.com")
                        .age(86)
                        .firstName("Alec")
                        .lastName("Guinness")
                        .nationality("British")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("carriefisher@gmail.com")
                        .age(60)
                        .firstName("Carrie")
                        .lastName("Fisher")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("rutgerhauer@gmail.com")
                        .age(75)
                        .firstName("Rutger")
                        .lastName("Hauer")
                        .nationality("Dutch")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("ridleyscott@gmail.com")
                        .age(84)
                        .firstName("Ridley")
                        .lastName("Scott")
                        .nationality("British")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("hamptonfancher@gmail.com")
                        .age(83)
                        .firstName("Hampton")
                        .lastName("Fancher")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Director, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("ryangosling@gmail.com")
                        .age(41)
                        .firstName("Ryan")
                        .lastName("Gosling")
                        .nationality("Canadian")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Director, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("robreiner@gmail.com")
                        .age(74)
                        .firstName("Rob")
                        .lastName("Reiner")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("stephenking@gmail.com")
                        .age(74)
                        .firstName("Stephen")
                        .lastName("King")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("riverpheonix@gmail.com")
                        .age(23)
                        .firstName("River")
                        .lastName("Phoenix")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("coreyfeldman@gmail.com")
                        .age(40)
                        .firstName("Corey")
                        .lastName("Feldman")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("stanleykubrick@gmail.com")
                        .age(70)
                        .firstName("Stanley")
                        .lastName("Kubrick")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Producer, ContributingRole.Director, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("jacknicholson@gmail.com")
                        .age(84)
                        .firstName("Jack")
                        .lastName("Nicholson")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("shelleyduvall@gmail.com")
                        .age(72)
                        .firstName("Shelley")
                        .lastName("Duvall")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("frankdarabont@gmail.com")
                        .age(62)
                        .firstName("Frank")
                        .lastName("Darabont")
                        .nationality("French")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Producer, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("thomasjane@gmail.com")
                        .age(52)
                        .firstName("Thomas")
                        .lastName("Jane")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Producer, ContributingRole.Actor))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("marciagayharden@gmail.com")
                        .age(62)
                        .firstName("Marcia Gay")
                        .lastName("Harden")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("richarcmarquand@gmail.com")
                        .age(49)
                        .firstName("Richard")
                        .lastName("Marquand")
                        .nationality("Welsh")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Producer, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("irvinkershner@gmail.com")
                        .age(87)
                        .firstName("Irvin")
                        .lastName("Kershner")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Director))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("jurgenprochnow@gmail.com")
                        .age(70)
                        .firstName("Jürgen")
                        .lastName("Prochnow")
                        .nationality("German")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("carlmayer@gmail.com")
                        .age(49)
                        .firstName("Carl")
                        .lastName("Mayer")
                        .nationality("Austrian")
                        .contributingRole(Set.of(ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("babekahmedpoor@gmail.com")
                        .age(41)
                        .firstName("Babek Ahmed")
                        .lastName("Poor")
                        .nationality("Iranian")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("thomasbolarsen@gmail.com")
                        .age(58)
                        .firstName("Thomas Bo")
                        .lastName("Larsen")
                        .nationality("Danish")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("irenejacob@gmail.com")
                        .age(55)
                        .firstName("Irène")
                        .lastName("Jacob")
                        .nationality("French")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("jeanlouistrintignant@gmail.com")
                        .age(81)
                        .firstName("Jean-Louis")
                        .lastName("Trintignant")
                        .nationality("French")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer, ContributingRole.Director))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("zbigniewzamachowski@gmail.com")
                        .age(50)
                        .firstName("Zbigniew")
                        .lastName("Zamachowski")
                        .nationality("Polish")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("juliedelpy@gmail.com")
                        .age(52)
                        .firstName("Julie")
                        .lastName("Delpy")
                        .nationality("French")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("bradpitt@gmail.com")
                        .age(58)
                        .firstName("Brad")
                        .lastName("Pitt")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("dianekruger@gmail.com")
                        .age(45)
                        .firstName("Diane")
                        .lastName("Kruger")
                        .nationality("German")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("quentintarantino@gmail.com")
                        .age(58)
                        .firstName("Quentin")
                        .lastName("Tarantino")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer, ContributingRole.Producer, ContributingRole.Director))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("jamiefoxx@gmail.com")
                        .age(54)
                        .firstName("Jamie")
                        .lastName("Foxx")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("leonardodicaprio@gmail.com")
                        .age(47)
                        .firstName("Leonardo")
                        .lastName("DiCaprio")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("francisfordcopolla@gmail.com")
                        .age(82)
                        .firstName("Francis")
                        .lastName("Coppola")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("alpacino@gmail.com")
                        .age(71)
                        .firstName("Al")
                        .lastName("Pacino")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Director, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("martinscorsese@gmail.com")
                        .age(79)
                        .firstName("Martin")
                        .lastName("Scorsese")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Director, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("jakelamotta@gmail.com")
                        .age(95)
                        .firstName("Jake")
                        .lastName("LaMotta")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("rayliotta@gmail.com")
                        .age(67)
                        .firstName("Ray")
                        .lastName("Liotta")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("robertzemeckis@gmail.com")
                        .age(70)
                        .firstName("Robert")
                        .lastName("Zemeckis")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("carlsagan@gmail.com")
                        .age(62)
                        .firstName("Carl")
                        .lastName("Sagan")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("jodiefoster@gmail.com")
                        .age(59)
                        .firstName("Jodie")
                        .lastName("Foster")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Director, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("matthewmacconaughey@gmail.com")
                        .age(52)
                        .firstName("Matthew")
                        .lastName("McConaughey")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Director, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("deanparisto@gmail.com")
                        .age(73)
                        .firstName("Dean")
                        .lastName("Parisot")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("davidhoward@gmail.com")
                        .age(64)
                        .firstName("David")
                        .lastName("Howard")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("sigourneyweaver@gmail.com")
                        .age(72)
                        .firstName("Sigourney")
                        .lastName("Weaver")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("alanrickman@gmail.com")
                        .age(69)
                        .firstName("Alan")
                        .lastName("Rickman")
                        .nationality("British")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer, ContributingRole.Director))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("andytennant@gmail.com")
                        .age(66)
                        .firstName("Andy")
                        .lastName("Tennant")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("susannahgrant@gmail.com")
                        .age(58)
                        .firstName("Susannah")
                        .lastName("Grant")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("anjelicahuston@gmail.com")
                        .age(70)
                        .firstName("Anjelica")
                        .lastName("Huston")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Director, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("tonykushner@gmail.com")
                        .age(65)
                        .firstName("Tony")
                        .lastName("Kushner")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("ericbana@gmail.com")
                        .age(53)
                        .firstName("Eric")
                        .lastName("Bana")
                        .nationality("Australian")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("danielcraig@gmail.com")
                        .age(53)
                        .firstName("Daniel")
                        .lastName("Craig")
                        .nationality("British")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("danieldaylewis@gmail.com")
                        .age(64)
                        .firstName("Daniel")
                        .lastName("Day-Lewis")
                        .nationality("British")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("sallyfield@gmail.com")
                        .age(75)
                        .firstName("Sally")
                        .lastName("Field")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Director, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("leonardodicaprio@gmail.com")
                        .age(47)
                        .firstName("Leonardo")
                        .lastName("DiCaprio")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("robertrodat@gmail.com")
                        .age(68)
                        .firstName("Robart")
                        .lastName("Rodat")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("tomhanks@gmail.com")
                        .age(65)
                        .firstName("Tom")
                        .lastName("Hanks")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("mattdamon@gmail.com")
                        .age(41)
                        .firstName("Matt")
                        .lastName("Damon")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("sylvierokab@gmail.com")
                        .age(48)
                        .firstName("Sylvie")
                        .lastName("Rokab")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Writer, ContributingRole.Director))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("billcondon@gmail.com")
                        .age(66)
                        .firstName("Bill")
                        .lastName("Condon")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("johnlasseter@gmail.com")
                        .age(64)
                        .firstName("John")
                        .lastName("Lasseter")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("henrythomas@gmail.com")
                        .age(50)
                        .firstName("Henry")
                        .lastName("Thomas")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("stevenzaillian@gmail.com")
                        .age(68)
                        .firstName("Steven")
                        .lastName("Zaillian")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("ralphfiennes.com")
                        .age(59)
                        .firstName("Ralph")
                        .lastName("Fiennes")
                        .nationality("British")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Director, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("benkingsley@gmail.com")
                        .age(78)
                        .firstName("Ben")
                        .lastName("Kingsley")
                        .nationality("British")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("gregdaniels@gmail.com")
                        .age(58)
                        .firstName("Greg")
                        .lastName("Daniels")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("mikejudge@gmail.com")
                        .age(59)
                        .firstName("Mike")
                        .lastName("Judge")
                        .nationality("Equadorian")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("carmenfinestra@gmail.com")
                        .age(54)
                        .firstName("Carmen")
                        .lastName("Finestra")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("andycardiff@gmail.com")
                        .age(57)
                        .firstName("Andy")
                        .lastName("Cardiff")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("kirktingblad@gmail.com")
                        .age(59)
                        .firstName("Kirk")
                        .lastName("Tingblad")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("mauricelamarche@gmail.com")
                        .age(63)
                        .firstName("Maurice")
                        .lastName("LaMarche")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("robpaulsen@gmail.com")
                        .age(65)
                        .firstName("Rob")
                        .lastName("Paulsen")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("stephenambrose@gmail.com")
                        .age(66)
                        .firstName("Stephen")
                        .lastName("Ambrose")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("scottgrimes@gmail.com")
                        .age(50)
                        .firstName("Scott")
                        .lastName("Grimes")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("damianlewis@gmail.com")
                        .age(50)
                        .firstName("Damian")
                        .lastName("Lewis")
                        .nationality("British")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("lesliebohem@gmail.com")
                        .age(70)
                        .firstName("Leslie")
                        .lastName("Bohem")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer, ContributingRole.Director, ContributingRole.Writer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("dakotafanning@gmail.com")
                        .age(27)
                        .firstName("Dakota")
                        .lastName("Fanning")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Producer, ContributingRole.Director))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("jeremypodeswa@gmail.com")
                        .age(59)
                        .firstName("Jeremy")
                        .lastName("Podeswa")
                        .nationality("Canadian")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("brucecmckenna@gmail.com")
                        .age(62)
                        .firstName("Bruce")
                        .lastName("McKenna")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("jamesbadgedale@gmail.com")
                        .age(43)
                        .firstName("James")
                        .lastName("Dale")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("danharmon@gmail.com")
                        .age(48)
                        .firstName("Dan")
                        .lastName("Harmon")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Writer, ContributingRole.Producer, ContributingRole.Director))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("justinroiland@gmail.com")
                        .age(41)
                        .firstName("Justin")
                        .lastName("Roiland")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("steveboyum@gmail.com")
                        .age(69)
                        .firstName("Steve")
                        .lastName("Boyum")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("tobystephens@gmail.com")
                        .age(52)
                        .firstName("Toby")
                        .lastName("Stephens")
                        .nationality("British")
                        .contributingRole(Set.of(ContributingRole.Actor, ContributingRole.Director))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("jessicaparkerkennedy@gmail.com")
                        .age(37)
                        .firstName("Jessica")
                        .lastName("kennedy")
                        .nationality("Canadian")
                        .contributingRole(Set.of(ContributingRole.Actor))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build(),
                Individual.builder()
                        .email("brannonbraga@gmail.com")
                        .age(56)
                        .firstName("Brannon")
                        .lastName("Braga")
                        .nationality("American")
                        .contributingRole(Set.of(ContributingRole.Director, ContributingRole.Writer, ContributingRole.Producer))
                        //.awards(Set.of(awards.get(30), awards.get(31), awards.get(32), awards.get(33), awards.get(34), awards.get(35)))
                        .build()
        );


        individualService.createAll(individuals);
        logger.info("Created 123 Individuals: {}", individuals);


        //Film Factory

        List<Film> films = List.of(
                Film.builder()
                        .title("Schindler's List")
                        //Directors: Steven Spielberg
                        //Writers: Steven Zaillian
                        //Actors: Liam Neeson, Ralph Fiennes, Ben Kingsley
                        .description("In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.")
                        //.genre("Biography, Drama")
                        .genres(Set.of(Genre.Biography))
                        .length(195)
                        //.releaseDate("1994-02-04")
                        .releaseDate(LocalDate.of(1994, 2, 4))
                        .rating(8.9f)
                        .countryOfOrigin("USA")
                        .language("English, Hebrew, German, Polish, Latin")
                        //.awards(Set.of(awards.get(0), awards.get(10), awards.get(11)))
                        //awards(new HashSet<Award>(awardService.find()))
                        .budget(BigDecimal.valueOf(22000000))
                        .revenue(BigDecimal.valueOf(322161245))
                        .build(),
                Film.builder()
                        .title("E.T. the Extra-Terrestrial")
                        //Directors: Steven Spielberg
                        //Writers: Melissa Mathison
                        //Actors: Henry Thomas, Drew Barrymore
                        .description("A troubled child summons the courage to help a friendly alien escape Earth and return to his home world.")
                        .genres(Set.of(Genre.Adventure)) //, Genre.Family, Genre.Sci_Fi
                        .length(115)
                        .releaseDate(LocalDate.of(1982,6,11))
                        .rating(7.8f)
                        .countryOfOrigin("USA")
                        .language("English")
                        .filmUniverse(FilmUniverse.E_T_And_Star_Wars)
                        //.awards(Set.of(awards.get(17), awards.get(36), awards.get(37), awards.get(38)))
                        .budget(BigDecimal.valueOf(10500000))
                        .revenue(BigDecimal.valueOf(792910554))
                        .build(),
                Film.builder()
                        .title("Toy Story")
                        //Directors: John Lasseter
                        //Writers: John Lasseter
                        //Actors: Tom Hanks, Tim Allen
                        .description("A cowboy doll is profoundly threatened and jealous when a new spaceman figure supplants him as top toy in a boy's room.")
                        .genres(Set.of(Genre.Animation)) // Genre.Adventure, Genre.Comedy
                        .length(81)
                        .releaseDate(LocalDate.of(1995,11,22))
                        .rating(8.3f)
                        .countryOfOrigin("USA")
                        .language("English")
                        .filmUniverse(FilmUniverse.Pixar_Movies)
                        //.awards(Set.of(awards.get(1)))
                        .budget(BigDecimal.valueOf(30000000))
                        .revenue(BigDecimal.valueOf(394436586))
                        .build(),
                Film.builder()
                        .title("Kinsey")
                        //Directors: Bill Condon
                        //Writers: Bill Condon
                        //Actors: Liam Neeson
                        .description("A look at the life of Alfred Kinsey, a pioneer in the area of human sexuality research, whose 1948 publication \"Sexual Behavior in the Human Male\" was one of the first recorded works that saw science address sexual behavior.")
                        .genres(Set.of(Genre.Biography)) //, Genre.Drama, Genre.Romance
                        .length(118)
                        .releaseDate(LocalDate.of(2004,11,12))
                        .rating(7.1f)
                        .countryOfOrigin("USA")
                        .language("English")
                        //.awards(Set.of(awards.get(4)))
                        .budget(BigDecimal.valueOf(11000000))
                        .revenue(BigDecimal.valueOf(16900000))
                        .build(),
                Film.builder()
                        .title("Love thy nature")
                        //Directors: Sylvie Rokab
                        //Writers: Sylvie Rokab
                        //Actors: Liam Neeson
                        .description("The film shows that a renewed connection with nature is key both to good health and to solving our environmental and climate crises.")
                        .genres(Set.of(Genre.Documentary))
                        .length(76)
                        .releaseDate(LocalDate.of(2014,10,18))
                        .rating(6.8f)
                        .countryOfOrigin("USA")
                        .language("English")
                        //.awards(Set.of(awards.get(5)))
                        .budget(BigDecimal.valueOf(60000)) //couldnt find the budget
                        .revenue(BigDecimal.valueOf(53134))
                        .build(),
                Film.builder()
                        .title("Saving Pirate Ryan")
                        //Directors: Steven Spielberg
                        //Writers: Robert Rodat
                        //Actors: Tom Hanks, Matt Damon
                        .description("Following the Normandy Landings, a group of U.S. soldiers go behind enemy lines to retrieve a paratrooper whose brothers have been killed in action.")
                        .genres(Set.of(Genre.War)) //Genre.Drama
                        .length(169)
                        .releaseDate(LocalDate.of(1998,7,24))
                        .rating(8.6f)
                        .countryOfOrigin("USA")
                        .language("English")
                        //.awards(Set.of(awards.get(6)))
                        .budget(BigDecimal.valueOf(70000000))
                        .revenue(BigDecimal.valueOf(482300000))
                        .build(),
                Film.builder()
                        .title("Lincoln")
                        //Directors: Steven Spielberg
                        //Writers: Tony Kushner
                        //Actors: Daniel Day-Lewis, Sally Field
                        .description("As the American Civil War continues to rage, America's president struggles with continuing carnage on the battlefield as he fights with many inside his own cabinet on the decision to emancipate the slaves.")
                        .genres(Set.of(Genre.Biography)) //, Genre.Drama, Genre.History
                        .length(150)
                        .releaseDate(LocalDate.of(2012,10,8))
                        .rating(7.3f)
                        .countryOfOrigin("USA")
                        .language("English")
                        //.awards(Set.of(awards.get(13)))
                        .budget(BigDecimal.valueOf(65000000))
                        .revenue(BigDecimal.valueOf(275300000))
                        .build(),
                Film.builder()
                        .title("Munich")
                        //Directors: Steven Spielberg
                        //Writers: Tony Kushner
                        //Actors: Eric Bana, Daniel Craig
                        .description("After the Black September capture and massacre of Israeli athletes at the 1972 Olympics, five men are chosen to eliminate the people responsible for that fateful day.")
                        .genres(Set.of(Genre.Action)) //, Genre.Drama, Genre.History
                        .length(163)
                        .releaseDate(LocalDate.of(2005,12,23))
                        .rating(7.5f)
                        .countryOfOrigin("USA")
                        .language("English")
                        //.awards(Set.of(awards.get(14)))
                        .budget(BigDecimal.valueOf(70000000))
                        .revenue(BigDecimal.valueOf(130400000))
                        .build(),
                Film.builder()
                        .title("EverAfter")
                        //Directors: Andy Tennant
                        //Writers: Susannah Grant
                        //Actors: Drew Barrymore, Anjelica Huston
                        .description("The Brothers Grimm arrive at the home of a wealthy Grande Dame who speaks of the many legends surrounding the fable of the cinder girl before telling the \"true\" story of her ancestor.")
                        .genres(Set.of(Genre.Comedy)) //, Genre.Drama, Genre.Romance"
                        .length(121)
                        .releaseDate(LocalDate.of(1998,7,31))
                        .rating(7.1f)
                        .countryOfOrigin("USA")
                        .language("English")
                        //.awards(Set.of(awards.get(15)))
                        .budget(BigDecimal.valueOf(26000000))
                        .revenue(BigDecimal.valueOf(98000000))
                        .build(),
                Film.builder()
                        .title("Galaxy Quest")
                        //Directors: Dean Parisot
                        //Writers: David Howard
                        //Actors: Tim Allen, Sigourney Weaver, Alan Rickman
                        .description("The alumni cast of a space opera television series have to play their roles as the real thing when an alien race needs their help. However, they also have to defend both Earth and the alien race from a reptilian warlord.")
                        .genres(Set.of(Genre.Adventure)) //, Genre.Comedy, Genre.Sci-Fi"
                        .length(102)
                        .releaseDate(LocalDate.of(1999,12,25))
                        .rating(7.3f)
                        .countryOfOrigin("USA")
                        .language("English")
                        //.awards(Set.of(awards.get(16)))
                        .budget(BigDecimal.valueOf(45000000))
                        .revenue(BigDecimal.valueOf(90700000))
                        .build(),
                Film.builder()
                        .title("Contact")
                        //Directors: Robert Zemeckis
                        //Writers: Carl Sagan, Ann Druyan
                        //Actors: Jodie Foster, Matthew McConaughey
                        .description("Dr. Ellie Arroway, after years of searching, finds conclusive radio proof of extraterrestrial intelligence, sending plans for a mysterious machine.")
                        .genres(Set.of(Genre.Drama))//, Genre.Mystery, Genre.Sci-Fi"
                        .length(150)
                        .releaseDate(LocalDate.of(1997,7,11))
                        .rating(7.5f)
                        .countryOfOrigin("USA")
                        .language("English")
                        //.awards(Set.of(awards.get(20)))
                        .budget(BigDecimal.valueOf(90000000))
                        .revenue(BigDecimal.valueOf(171100000))
                        .build(),
                Film.builder()
                        .title("GoodFellas")
                        //Directors: Martin Scorsese
                        //Writers: Martin Scorsese
                        //Actors: Robert De Niro, Joew Pesci, Ray Liotta
                        .description("The story of Henry Hill and his life in the mob, covering his relationship with his wife Karen Hill and his mob partners Jimmy Conway and Tommy DeVito in the Italian-American crime syndicate.")
                        .genres(Set.of(Genre.Biography)) //, Genre.Crime, Genre.Drama"
                        .length(146)
                        .releaseDate(LocalDate.of(1990,9,9))
                        .rating(8.7f)
                        .countryOfOrigin("USA")
                        .language("English")
                        //.awards(Set.of(awards.get(24), awards.get(26)))
                        .budget(BigDecimal.valueOf(25000000))
                        .revenue(BigDecimal.valueOf(47100000))
                        .build(),
                Film.builder()
                        .title("Raging Bull")
                        //Directors: Martin Scorsese
                        //Writers: Jake LaMotta
                        //Actors: Robert De Niro, Joe Pesci
                        .description("The life of boxer Jake LaMotta, whose violence and temper that led him to the top in the ring destroyed his life outside of it.")
                        .genres(Set.of(Genre.Biography)) //, Genre.Drama, Genre.Sport"
                        .length(129)
                        .releaseDate(LocalDate.of(1990,12,19))
                        .rating(8.2f)
                        .countryOfOrigin("USA")
                        .language("English")
                        //.awards(Set.of(awards.get(25), awards.get(28), awards.get(30)))
                        .budget(BigDecimal.valueOf(18000000))
                        .revenue(BigDecimal.valueOf(23400000))
                        .build(),
                Film.builder()
                        .title("The Godfather : Part II")
                        //Directors: Francis Ford Coppola
                        //Writers: Francis Ford Coppola
                        //Actors: Al Pacino, Robert De Niro
                        .description("The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate.")
                        .genres(Set.of(Genre.Crime)) //, Genre.Drama"
                        .length(200)
                        .releaseDate(LocalDate.of(1974,12,12))
                        .rating(9.0f)
                        .countryOfOrigin("USA")
                        .language("English, Sicilian")
                        .filmUniverse(FilmUniverse.Godfather)
                        //.awards(Set.of(awards.get(29) ))
                        .budget(BigDecimal.valueOf(13000000))
                        .revenue(BigDecimal.valueOf(93000000))
                        .build(),
                Film.builder()
                        .title("Django Unchained")
                        //Directors: Quentin Tarantino
                        //Writers: Quentin Tarantino
                        //Actors: Jamie Foxx, Christoph Waltz, Leonardo Dicaprio
                        .description("With the help of a German bounty-hunter, a freed slave sets out to rescue his wife from a brutal plantation-owner in Mississippi.")
                        .genres(Set.of(Genre.Drama)) //, Genre.Western"
                        .length(165)
                        .releaseDate(LocalDate.of(2012,12,11))
                        .rating(8.4f)
                        .countryOfOrigin("USA")
                        .language("English")
                        .filmUniverse(FilmUniverse.Quentin_Tarantino_Movies)
                        //.awards(Set.of(awards.get(31) , awards.get(33), awards.get(35)) )
                        .budget(BigDecimal.valueOf(100000000))
                        .revenue(BigDecimal.valueOf(425400000))
                        .build(),
                Film.builder()
                        .title("Inglourious Basterds")
                        //Directors: Quentin Tarantino
                        //Writers: Quentin Tarantino
                        //Actors: Brad Pitt, Diane Kruger, Christoph Waltz
                        .description("In Nazi-occupied France during World War II, a plan to assassinate Nazi leaders by a group of Jewish U.S. soldiers coincides with a theatre owner's vengeful plans for the same.")
                        .genres(Set.of(Genre.Adventure)) //, Genre.Drama, Genre.War"
                        .length(153)
                        .releaseDate(LocalDate.of(2009,5,20))
                        .rating(8.4f)
                        .countryOfOrigin("USA")
                        .language("English, German, French")
                        .filmUniverse(FilmUniverse.Quentin_Tarantino_Movies)
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(70000000))
                        .revenue(BigDecimal.valueOf(321500000))
                        .build(),
                Film.builder()
                        .title("Trois couleurs: Bleu")
                        //Directors: Krzysztof Kieslowski
                        //Writers: Krzysztof Kieslowski
                        //Actors: Juliette Binoche, Zbigniew Zamachowski, Julie Delpy
                        .description("A woman struggles to find a way to live her life after the death of her husband and child.")
                        .genres(Set.of(Genre.Drama)) //, Genre.Drama, Genre.War"
                        .length(94)
                        .releaseDate(LocalDate.of(1993,9,8))
                        .rating(7.9f)
                        .countryOfOrigin("France, Poland, Switzerland")
                        .language("French, Romanian, Polish")
                        .filmUniverse(FilmUniverse.Trois_Couleurs)
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(472591))
                        .revenue(BigDecimal.valueOf(1341154))
                        .build(),
                Film.builder()
                        .title("Trois couleurs: Blanc")
                        //Directors: Krzysztof Kieslowski
                        //Writers: Krzysztof Kieslowski
                        //Actors: Zbigniew Zamachowski, Julie Delpy
                        .description("After his wife divorces him, a Polish immigrant plots to get even with her.")
                        .genres(Set.of(Genre.Comedy)) //, Genre.Drama, Genre.War"
                        .length(92)
                        .releaseDate(LocalDate.of(1994,6,10))
                        .rating(7.6f)
                        .countryOfOrigin("Switzerland, France, Poland")
                        .language("Polish, French, English")
                        .filmUniverse(FilmUniverse.Trois_Couleurs)
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(587336))
                        .revenue(BigDecimal.valueOf(1237219))
                        .build(),
                Film.builder()
                        .title("Trois couleurs: Rouge")
                        //Directors: Krzysztof Kieslowski
                        //Writers: Krzysztof Kieslowski
                        //Actors: Irène Jacob, Jean-Louis Trintignant
                        .description("A model discovers a retired judge is keen on invading people's privacy.")
                        .genres(Set.of(Genre.Drama)) //, Genre.Drama, Genre.War"
                        .length(99)
                        .releaseDate(LocalDate.of(1994,11,23))
                        .rating(8.1f)
                        .countryOfOrigin("Switzerland, France, Poland")
                        .language("French")
                        .filmUniverse(FilmUniverse.Trois_Couleurs)
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(617532))
                        .revenue(BigDecimal.valueOf(3581969))
                        .build(),
                Film.builder()
                        .title("Le fabuleux destin d'Amélie Poulain")
                        //Directors: Jean-Pierre Jeunet
                        //Writers: Jean-Piere Jeunet, Guillaume Laurant
                        //Actors: Audrey Tautou
                        .description("Amélie is an innocent and naive girl in Paris with her own sense of justice. She decides to help those around her and, along the way, discovers love.")
                        .genres(Set.of(Genre.Romance)) //, Genre.Drama, Genre.War"
                        .length(122)
                        .releaseDate(LocalDate.of(2002,2,8))
                        .rating(8.3f)
                        .countryOfOrigin("France, Germany")
                        .language("French, Russian, English")
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(10000000))
                        .revenue(BigDecimal.valueOf(174100765))
                        .build(),
                Film.builder()
                        .title("Druk")
                        //Directors: Thomas Vinterberg
                        //Writers: Thomas Vinterberg
                        //Actors: Mads Mikkelsen, Thomas Bo Larsen
                        .description("Four high school teachers consume alcohol on a daily basis to see how it affects their social and professional lives.")
                        .genres(Set.of(Genre.Comedy)) //, Genre.Drama, Genre.War"
                        .length(117)
                        .releaseDate(LocalDate.of(2020,12,18))
                        .rating(7.8f)
                        .countryOfOrigin("Denmark, Sweden, Netherlands")
                        .language("Danish, Swedish")
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(1518000))
                        .revenue(BigDecimal.valueOf(12475919))
                        .build(),
                Film.builder()
                        .title("Khane-ye doust kodjast?")
                        //Directors: Abbas Kiarostami
                        //Writers: Abbas Kiarostami
                        //Actors: Babek Ahmed Poor
                        .description("8 year old Ahmed has mistakenly taken his friend Mohammad's notebook. He wants to return it, or else his friend will be expelled from school. Determinedly, the conscientious boy sets out to find Mohammad's home in the neighbouring village.")
                        .genres(Set.of(Genre.Family)) //, Genre.Drama, Genre.War"
                        .length(83)
                        .releaseDate(LocalDate.of(1987,2,18))
                        .rating(8.1f)
                        .countryOfOrigin("Iran")
                        .language("Persian")
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(2280))
                        .revenue(BigDecimal.valueOf(4546))
                        .build(),
                Film.builder()
                        .title("Ran")
                        //Directors: Akira Kurosawa
                        //Writers: Akira Kurosawa
                        //Actors: Tatsuya Nakadai
                        .description("In Medieval Japan, an elderly warlord retires, handing over his empire to his three sons. However, he vastly underestimates how the new-found power will corrupt them and cause them to turn on each other...and him.")
                        .genres(Set.of(Genre.War)) //, Genre.Drama, Genre.War"
                        .length(162)
                        .releaseDate(LocalDate.of(1985,6,1))
                        .rating(8.2f)
                        .countryOfOrigin("Japan, France")
                        .language("Japanese")
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(11500000))
                        .revenue(BigDecimal.valueOf(4164283))
                        .build(),
                Film.builder()
                        .title("Shichinin no samurai")
                        //Directors: Akira Kurosawa
                        //Writers: Akira Kurosawa
                        //Actors: Toshiro Mifune
                        .description("A poor village under attack by bandits recruits seven unemployed samurai to help them defend themselves.")
                        .genres(Set.of(Genre.Action)) //, Genre.Drama, Genre.War"
                        .length(207)
                        .releaseDate(LocalDate.of(1956,11,19))
                        .rating(8.6f)
                        .countryOfOrigin("Japan")
                        .language("Japanese")
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(1250000))
                        .revenue(BigDecimal.valueOf(346258))
                        .build(),
                Film.builder()
                        .title("Das Cabinet des Dr. Caligari")
                        //Directors: Robert Wiene
                        //Writers: Carl Mayer
                        //Actors: Werner Krauss
                        .description("Hypnotist Dr. Caligari uses a somnambulist, Cesare, to commit murders.")
                        .genres(Set.of(Genre.Horror)) //, Genre.Drama, Genre.War"
                        .length(67)
                        .releaseDate(LocalDate.of(1920,2,27))
                        .rating(8.1f)
                        .countryOfOrigin("Germany")
                        .language("German")
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(18000))
                        .revenue(BigDecimal.valueOf(8811))
                        .build(),
                Film.builder()
                        .title("Das Boot")
                        //Directors: Wolfgang Petersen
                        //Writers: Wolfgang Petersen
                        //Actors: Jürgen Prochnow
                        .description("The claustrophobic world of a WWII German U-boat; boredom, filth and sheer terror.")
                        .genres(Set.of(Genre.War)) //, Genre.Drama, Genre.War"
                        .length(149)
                        .releaseDate(LocalDate.of(1982,2,10))
                        .rating(8.3f)
                        .countryOfOrigin("Germany")
                        .language("German")
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(14400000))
                        .revenue(BigDecimal.valueOf(11487676))
                        .build(),
                Film.builder()
                        .title("Dune: Part One")
                        //Directors: Denis Villeneuve
                        //Writers: Denis Villeneuve
                        //Actors: Timothée Chalamet, Rebecca Fergusson
                        .description("Feature adaptation of Frank Herbert's science fiction novel about the son of a noble family entrusted with the protection of the most valuable asset and most vital element in the galaxy.")
                        .genres(Set.of(Genre.Sci_Fi)) //, Genre.Drama, Genre.War"
                        .length(155)
                        .releaseDate(LocalDate.of(2021,10,22))
                        .rating(8.2f)
                        .countryOfOrigin("USA, Canada")
                        .language("English, Mandarin")
                        .filmUniverse(FilmUniverse.Dune)
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(165000000))
                        .revenue(BigDecimal.valueOf(394585276))
                        .build(),
                Film.builder()
                        .title("Up")
                        //Directors: Pete Docter
                        //Writers: Pete Docter
                        //Actors: Ed Asner
                        .description("78-year-old Carl Fredricksen travels to Paradise Falls in his house equipped with balloons, inadvertently taking a young stowaway.")
                        .genre(Genre.Adventure) //, Genre.Drama, Genre.War"
                        .length(96)
                        .releaseDate(LocalDate.of(2009,5,29))
                        .rating(8.2f)
                        .countryOfOrigin("USA")
                        .language("English")
                        .filmUniverse(FilmUniverse.Pixar_Movies)
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(175000000))
                        .revenue(BigDecimal.valueOf(735099102))
                        .build(),
                Film.builder()
                        .title("Coco")
                        //Directors: Lee Unkrich
                        //Writers: Lee Unkrich
                        //Actors: Anthony Gonzalez
                        .description("Aspiring musician Miguel, confronted with his family's ancestral ban on music, enters the Land of the Dead to find his great-great-grandfather, a legendary singer.")
                        .genre(Genre.Adventure) //, Genre.Drama, Genre.War"
                        .length(105)
                        .releaseDate(LocalDate.of(2017,11,22))
                        .rating(8.4f)
                        .countryOfOrigin("USA, Mexico")
                        .language("English, Spanish")
                        .filmUniverse(FilmUniverse.Pixar_Movies)
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(175000000))
                        .revenue(BigDecimal.valueOf(807817888))
                        .build(),
                Film.builder()
                        .title("Star Wars: Episode IV - A New Hope")
                        //Directors: George Lucas
                        //Writers: George Lucas
                        //Actors: Mark Hamill, Harrison Ford, Carrie Fisher, Alec Guinness
                        .description("Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, a Wookiee and two droids to save the galaxy from the Empire's world-destroying battle station, while also attempting to rescue Princess Leia from the mysterious Darth Vader.")
                        .genre(Genre.Action) //, Genre.Drama, Genre.War"
                        .length(121)
                        .releaseDate(LocalDate.of(1977,5,25))
                        .rating(8.6f)
                        .countryOfOrigin("USA, UK")
                        .language("English")
                        .filmUniverse(FilmUniverse.E_T_And_Star_Wars)
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(11000000))
                        .revenue(BigDecimal.valueOf(775398007))
                        .build(),
                Film.builder()
                        .title("Star Wars: Episode V - The Empire Strikes Back")
                        //Directors: Irvin Kershner
                        //Writers: George Lucas
                        //Actors: Mark Hamill, Harrison Ford, Carrie Fisher
                        .description("After the Rebels are brutally overpowered by the Empire on the ice planet Hoth, Luke Skywalker begins Jedi training with Yoda, while his friends are pursued across the galaxy by Darth Vader and bounty hunter Boba Fett.")
                        .genre(Genre.Action) //, Genre.Drama, Genre.War"
                        .length(124)
                        .releaseDate(LocalDate.of(2021,10,22))
                        .rating(8.7f)
                        .countryOfOrigin("USA, UK")
                        .language("English")
                        .filmUniverse(FilmUniverse.E_T_And_Star_Wars)
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(18000000))
                        .revenue(BigDecimal.valueOf(538375067))
                        .build(),
                Film.builder()
                        .title("Star Wars: Episode VI - Return of the Jedi")
                        //Directors: Richard Marquand
                        //Writers: Goerge Lucas
                        //Actors: Mark Hamill, Harrison Ford, Carrie Fisher
                        .description("After a daring mission to rescue Han Solo from Jabba the Hutt, the Rebels dispatch to Endor to destroy the second Death Star. Meanwhile, Luke struggles to help Darth Vader back from the dark side without falling into the Emperor's trap.")
                        .genre(Genre.Action) //, Genre.Drama, Genre.War"
                        .length(131)
                        .releaseDate(LocalDate.of(1983,5,25))
                        .rating(8.3f)
                        .countryOfOrigin("USA, UK")
                        .language("English")
                        .filmUniverse(FilmUniverse.E_T_And_Star_Wars)
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(32500000))
                        .revenue(BigDecimal.valueOf(475106177))
                        .build(),
                Film.builder()
                        .title("Blade Runner")
                        //Directors: Ridley Scott
                        //Writers: Hampton Fancher
                        //Actors: Harrison Ford, Rutger Hauer
                        .description("A blade runner must pursue and terminate four replicants who stole a ship in space, and have returned to Earth to find their creator.")
                        .genre(Genre.Action) //, Genre.Drama, Genre.War"
                        .length(117)
                        .releaseDate(LocalDate.of(1982,6,25))
                        .rating(8.1f)
                        .countryOfOrigin("USA")
                        .language("English, German, Cantonese, Japanese, Hungarian, Arabic, Korean")
                        .filmUniverse(FilmUniverse.Blade_Runner)
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(28000000))
                        .revenue(BigDecimal.valueOf(41676878))
                        .build(),
                Film.builder()
                        .title("Blade Runner 2049")
                        //Directors: Denis Villeneuve
                        //Writers: Hampton Fancher
                        //Actors: Harrison Ford, Ryan Gosling
                        .description("Young Blade Runner K's discovery of a long-buried secret leads him to track down former Blade Runner Rick Deckard, who's been missing for thirty years.")
                        .genre(Genre.Action) //, Genre.Drama, Genre.War"
                        .length(164)
                        .releaseDate(LocalDate.of(2017,10,6))
                        .rating(8.0f)
                        .countryOfOrigin("USA, UK, Canada, Hungary, Spain, Mexico")
                        .language("English, Finnish, Japanese, Hungarian, Russian, Somali, Spanish")
                        .filmUniverse(FilmUniverse.Blade_Runner)
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(150000000))
                        .revenue(BigDecimal.valueOf(259334548))
                        .build(),
                Film.builder()
                        .title("Stand by Me")
                        //Directors: Rob Reiner
                        //Writers: Stephen King
                        //Actors: River Phoenix, Corey Feldman
                        .description("After the death of one of his friends, a writer recounts a childhood journey with his friends to find the body of a missing boy.")
                        .genre(Genre.Adventure) //, Genre.Drama, Genre.War"
                        .length(89)
                        .releaseDate(LocalDate.of(1986,8,22))
                        .rating(8.1f)
                        .countryOfOrigin("USA")
                        .language("English")
                        .filmUniverse(FilmUniverse.Stephen_King_Movies)
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(8000000))
                        .revenue(BigDecimal.valueOf(52287414))
                        .build(),
                Film.builder()
                        .title("The Shining")
                        //Directors: Stanley Kubrick
                        //Writers: Stephen King, Stanley Kubrick
                        //Actors: Jack Nicholson, Shelley Duvall
                        .description("A family heads to an isolated hotel for the winter where a sinister presence influences the father into violence, while his psychic son sees horrific forebodings from both past and future.")
                        .genre(Genre.Horror) //, Genre.Drama, Genre.War"
                        .length(146)
                        .releaseDate(LocalDate.of(1980,6,13))
                        .rating(8.4f)
                        .countryOfOrigin("UK, USA")
                        .language("English")
                        .filmUniverse(FilmUniverse.Stephen_King_Movies)
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(19000000))
                        .revenue(BigDecimal.valueOf(46998772))
                        .build(),
                Film.builder()
                        .title("The Mist")
                        //Directors: Frank Darabont
                        //Writers: Frank Darabont, Stephen King
                        //Actors: Thomas Jane, Marcia Gay Harden
                        .description("A freak storm unleashes a species of bloodthirsty creatures on a small town, where a small band of citizens hole up in a supermarket and fight for their lives.")
                        .genre(Genre.Horror) //, Genre.Drama, Genre.War"
                        .length(89)
                        .releaseDate(LocalDate.of(1986,8,22))
                        .rating(7.1f)
                        .countryOfOrigin("USA")
                        .language("English")
                        .filmUniverse(FilmUniverse.Stephen_King_Movies)
                        //.awards(Set.of(awards.get(32), awards.get(34), awards.get(36)) )
                        .budget(BigDecimal.valueOf(18000000))
                        .revenue(BigDecimal.valueOf(57470220))
                        .build()


        );

        List<TvShow> tvshows = List.of(
                TvShow.builder()
                        .title("Cosmos: A Spacetime Odyssey")
                        //Directors: Brannon Braga
                        //Writers: Ann Druyan, Carl Sagan
                        //Actors: Neil deGrasse Tyson
                        .description("An exploration of our discovery of the laws of nature and coordinates in space and time.")
                        .genres(Set.of(Genre.Documentary))
                        .length(44)
                        .releaseDate(LocalDate.of(2014,3,9))
                        .rating(9.3f)
                        .countryOfOrigin("USA")
                        .language("English")
                        //.awards(Set.of(awards.get(18), awards.get(41), awards.get(42), awards.get(43), awards.get(44), awards.get(41)))
                        .budget(BigDecimal.valueOf(6000000))
                        .revenue(BigDecimal.valueOf(135429666))
                        .seasons(1)
                        .episodes(13)
                        .build(),
                TvShow.builder()
                        .title("Black Sails")
                        //Directors: Steve Boyum
                        //Writers: Robert Levine
                        //Actors: Jessica Kennedy, Toby Stephens
                        .description("Follows Captain Flint and his pirates twenty years prior to Robert Louis Stevenson's classic novel \"Treasure Island.\"")
                        .genres(Set.of(Genre.Adventure))
                        .length(56)
                        .releaseDate(LocalDate.of(2014,1,25))
                        .rating(8.2f)
                        .countryOfOrigin("USA, South Africa")
                        .language("English")
                        //.awards(Set.of(awards.get(39), awards.get(40)))
                        .budget(BigDecimal.valueOf(15460000))
                        .revenue(BigDecimal.valueOf(249752131))
                        .seasons(4)
                        .episodes(38)
                        .build(),
                TvShow.builder()
                        .title("Rick and Morty")
                        //Directors: Wesley Archer
                        //Writers: Dan Harmon, Justin Roiland
                        //Actors: Justin Roiland
                        .description("An animated series that follows the exploits of a super scientist and his not-so-bright grandson.")
                        .genres(Set.of(Genre.Animation))
                        .length(23)
                        .releaseDate(LocalDate.of(2013,12,2))
                        .rating(9.2f)
                        .countryOfOrigin("USA")
                        .language("English")
                        //.awards(Set.of(awards.get(20), awards.get(21)))
                        .budget(BigDecimal.valueOf(24000000))
                        .revenue(BigDecimal.valueOf(666732999))
                        .seasons(5)
                        .episodes(52)
                        .build(),
                TvShow.builder()
                        .title("The Pacific")
                        //Directors: Jeremy Podeswa
                        //Writers: Bruce MacKenna
                        //Actors: James Dale
                        .description("The Pacific Theatre of World War II, as seen through the eyes of several young Marines." )
                        .genres(Set.of(Genre.Action))
                        .length(55)
                        .releaseDate(LocalDate.of(2010,3,14))
                        .rating(8.3f)
                        .countryOfOrigin("USA")
                        .language("English")
                        //.awards(Set.of(awards.get(7)))
                        .budget(BigDecimal.valueOf(200000000))
                        .revenue(BigDecimal.valueOf(350000000))
                        .seasons(1)
                        .episodes(10)
                        .build(),
                TvShow.builder()
                        .title("Taken")
                        //Directors: Leslie Bohem
                        //Writers: Leslie Bohem
                        //Actors: Dakota Fanning
                        .description("Three families experience alien abductions over a period of five decades." )
                        .genres(Set.of(Genre.Sci_Fi))
                        .length(87)
                        .releaseDate(LocalDate.of(2002,12,2))
                        .rating(7.8f)
                        .countryOfOrigin("USA")
                        .language("English")
                        //.awards(Set.of(awards.get(8)))
                        .budget(BigDecimal.valueOf(40000000))
                        .revenue(BigDecimal.valueOf(60000000))
                        .seasons(1)
                        .episodes(10)
                        .build(),
                TvShow.builder()
                        .title("Band of Brothers")
                        //Directors: Tom Hanks
                        //Writers: Stephen Ambrose
                        //Actors: Scott Grimes, Damian Lewis
                        .description("The story of Easy Company of the U.S. Army 101st Airborne Division and their mission in World War II Europe, from Operation Overlord to V-J Day." )
                        .genres(Set.of(Genre.War))
                        .length(60)
                        .releaseDate(LocalDate.of(2001,9,9))
                        .rating(9.4f)
                        .countryOfOrigin("USA")
                        .language("English")
                        //.awards(Set.of(awards.get(9)))
                        .budget(BigDecimal.valueOf(125000000))
                        .revenue(BigDecimal.valueOf(183000000))
                        .seasons(1)
                        .episodes(10)
                        .build(),
                TvShow.builder()
                        .title("Pinky and the Brain")
                        //Directors: Kirk Tingblad
                        //Writers: Kirk Tingblad
                        //Actors: Maurice LaMarche, Rob Paulsen
                        .description("A genius mouse and his stupid sidekick try to conquer the world each night." )
                        .genres(Set.of(Genre.Animation))
                        .length(22)
                        .releaseDate(LocalDate.of(1995,9,9))
                        .rating(7.8f)
                        .countryOfOrigin("USA")
                        .language("English")
                        //.awards(Set.of(awards.get(10)))
                        .budget(BigDecimal.valueOf(5200000))
                        .revenue(BigDecimal.valueOf(8700000))
                        .seasons(4)
                        .episodes(66)
                        .build(),
                TvShow.builder()
                        .title("Home Improvement")
                        //Directors: Andy Cardiff
                        //Writers: Carmen Finestra
                        //Actors: Tim Allen
                        .description("The daily trials and tribulations of Tim \"The Tool Man\" Taylor, a television show host raising three mischievous boys with help from his loyal co-host, loving wife, and eccentric neighbor." )
                        .genres(Set.of(Genre.Comedy))
                        .length(22)
                        .releaseDate(LocalDate.of(1991,9,17))
                        .rating(7.2f)
                        .countryOfOrigin("USA")
                        .language("English")
                        //.awards(Set.of(awards.get(17)))
                        .budget(BigDecimal.valueOf(3400000))
                        .revenue(BigDecimal.valueOf(6800000))
                        .seasons(8)
                        .episodes(204)
                        .build(),
                TvShow.builder()
                        .title("King of the Hill")
                        //Directors: Greg Daniels
                        //Writers: Greg Daniels, Mike Judge
                        //Actors: Mike Judge
                        .description("A straight-laced propane salesman in Arlen, Texas tries to deal with the wacky antics of his family and friends, while also trying to keep his son in line." )
                        .genres(Set.of(Genre.Animation))
                        .length(21)
                        .releaseDate(LocalDate.of(1997,1,12))
                        .rating(7.3f)
                        .countryOfOrigin("USA")
                        .language("English")
                        //.awards(Set.of(awards.get(23)))
                        .budget(BigDecimal.valueOf(2800000))
                        .revenue(BigDecimal.valueOf(47800000))
                        .seasons(13)
                        .episodes(259)
                        .build()

        );
        tvShowService.createAll(tvshows);
        logger.info("Created 9 Tv Shows {}", tvshows);

        filmService.createAll(films);
        logger.info("Created 37 films {}", films);

        //Awards Factory

        List<Award> awards = List.of(
                Award.builder()
                        .title("Best Picture - Schindler's List")
                        .yearOfAward("1994")
                        .category("Oscar")
                        .content(films.get(0))
                        .individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Special Achievement Award - Toy Story")
                        .yearOfAward("1996")
                        .category("Oscar")
                        .content(films.get(2))
                        //.individual(individuals.get())
                        .build(),
                Award.builder()
                        .title("Outstanding Animated Program - Rick & Morty")
                        .yearOfAward("2014")
                        .category("Emmy")
                        .content(tvshows.get(2))
                        .individual(individuals.get(4))
                        .build(),
                Award.builder()
                        .title("Best Actor - Kinsey")
                        .yearOfAward("2005")
                        .category("AARP Movies for Grownups")
                        .content(films.get(3))
                        .individual(individuals.get(0))
                        .build(),
                Award.builder()
                        .title("Voice Over Talent - Love Thy Nature")
                        .yearOfAward("2015")
                        .category("Accolade Competition")
                        .content(films.get(4))
                        .individual(individuals.get(0))
                        .build(),
                Award.builder()
                        .title("Best Director - Saving Private Ryan")
                        .yearOfAward("1999")
                        .category("Oscar")
                        .content(films.get(5))
                        .individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Outstanding Miniseries - The Pacific")
                        .yearOfAward("2010")
                        .category("Emmy")
                        .content(tvshows.get(3))
                        .individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Outstanding Miniseries - Taken")
                        .yearOfAward("2003")
                        .category("Emmy")
                        .content(tvshows.get(4))
                        .individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Outstanding Miniseries - Band of Brothers")
                        .yearOfAward("2002")
                        .category("Emmy")
                        .content(tvshows.get(5))
                        .individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Outstanding Animated Program - Pinky and the Brain")
                        .yearOfAward("1996")
                        .category("Emmy")
                        .content(tvshows.get(6))
                        .individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Best Film - Schindler's List")
                        .yearOfAward("1994")
                        .category("BAFTA")
                        .content(films.get(0))
                        .individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Best Director - Schindler's List")
                        .yearOfAward("2014")
                        .category("20/20")
                        .content(films.get(0))
                        .individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Best Director - Lincoln")
                        .yearOfAward("2013")
                        .category("AARP Movies for Grownups")
                        .content(films.get(6))
                        .individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Best Director - Munich")
                        .yearOfAward("2006")
                        .category("AARP Movies for Grownups")
                        .content(films.get(7))
                        .individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Best Actress - EverAfter")
                        .yearOfAward("1999")
                        .category("Academy of Science Fiction")
                        .content(films.get(8))
                        .individual(individuals.get(1))
                        .build(),
                Award.builder()
                        .title("Best Actor - Galaxy Quest")
                        .yearOfAward("2000")
                        .category("Academy of Science Fiction")
                        .content(films.get(9))
                        .individual(individuals.get(2))
                        .build(),
                Award.builder()
                        .title("Best Performance by an Actor in a Television Series - Comedy or Musical Home Improvement")
                        .yearOfAward("1995")
                        .category("Golden Globes")
                        .content(tvshows.get(7))
                        .individual(individuals.get(2))
                        .build(),
                Award.builder()
                        .title("Best Writing - E.T. the Extra-Terrestrial")
                        .yearOfAward("1983")
                        .category("Academy of Science Fiction")
                        .content(films.get(1))
                        .individual(individuals.get(6))
                        .build(),
                Award.builder()
                        .title("Outstanding Writing for Nonfiction Programming - Cosmos: A Spacetime Odyssey")
                        .yearOfAward("2014")
                        .category("Emmy")
                        .content(tvshows.get(0))
                        .individual(individuals.get(7))
                        .build(),
                Award.builder()
                        .title("Best Dramatic Presentation - Contact")
                        .yearOfAward("1998")
                        .category("Hugo")
                        .content(films.get(10))
                        .individual(individuals.get(7))
                        .build(),
                Award.builder()
                        .title("Outstanding Animated Program - Rick and Morty")
                        .yearOfAward("2020")
                        .category("Emmy")
                        .content(tvshows.get(2))
                        .individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Outstanding Animated Program - Rick and Morty")
                        .yearOfAward("2018")
                        .category("Emmy")
                        .content(tvshows.get(2))
                        .individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Outstanding Animated Program (For Programming One Hour or Less) - King of the Hill")
                        .yearOfAward("1999")
                        .category("Emmy")
                        .content(tvshows.get(8))
                        .individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Best Actor in a Supporting Role - Goodfellas")
                        .yearOfAward("1991")
                        .category("Oscar")
                        .content(films.get(0))
                        .individual(individuals.get(10))
                        .build(),
                Award.builder()
                        .title("Most Outstanding Newcomer to Leading Film Roles - Raging Bull")
                        .yearOfAward("1982")
                        .category("BAFTA")
                        .content(films.get(0))
                        .individual(individuals.get(10))
                        .build(),
                Award.builder()
                        .title("Best Supporting Actor - Goodfellas")
                        .yearOfAward("2011")
                        .category("20/20")
                        .content(films.get(11))
                        .individual(individuals.get(10))
                        .build(),
                Award.builder()
                        .title("Funniest Actor in a Motion Picture (Leading Role) - My Cousin Vinny")
                        .yearOfAward("1992")
                        .category("American Comedy")
                        //.content(films.get(0))
                        .individual(individuals.get(11))
                        .build(),
                Award.builder()
                        .title("Best Actor in a Leading Role - Raging Bull")
                        .yearOfAward("1981")
                        .category("Oscar")
                        .content(films.get(12))
                        .individual(individuals.get(11))
                        .build(),
                Award.builder()
                        .title("Best Actor in a Supporting Role - The Godfather: Part II")
                        .yearOfAward("1975")
                        .category("Oscar")
                        .content(films.get(13))
                        .individual(individuals.get(11))
                        .build(),
                Award.builder()
                        .title("Best Actor in a Motion Picture - Drama - Raging Bull")
                        .yearOfAward("1981")
                        .category("Golden Globes")
                        .content(films.get(12))
                        .individual(individuals.get(10))
                        .build(),
                Award.builder()
                        .title("Best Performance by an Actor in a Supporting Role - Django Unchained")
                        .yearOfAward("2013")
                        .category("Oscar")
                        .content(films.get(14))
                        .individual(individuals.get(12))
                        .build(),
                Award.builder()
                        .title("Best Performance by an Actor in a Supporting Role - Inglourious Basterds")
                        .yearOfAward("2010")
                        .category("Oscar")
                        .content(films.get(15))
                        .individual(individuals.get(12))
                        .build(),
                Award.builder()
                        .title("Best Supporting Actor - Django Unchained")
                        .yearOfAward("2013")
                        .category("BAFTA")
                        .content(films.get(14))
                        .individual(individuals.get(12))
                        .build(),
                Award.builder()
                        .title("Best Supporting Actor - Inglourious Basterds")
                        .yearOfAward("2010")
                        .category("BAFTA")
                        .content(films.get(15))
                        .individual(individuals.get(12))
                        .build(),
                Award.builder()
                        .title("Best Performance by an Actor in a Supporting Role in a Motion Picture - Django Unchained")
                        .yearOfAward("2012")
                        .category("Golden Globes")
                        .content(films.get(14))
                        .individual(individuals.get(12))
                        .build(),
                Award.builder()
                        .title("Best Performance by an Actor in a Supporting Role in a Motion Picture - Inglourious Basterds")
                        .yearOfAward("2009")
                        .category("Golden GLobes")
                        .content(films.get(15))
                        .individual(individuals.get(12))
                        .build(),
                Award.builder()
                        .title("Best Music, Original Score - John Williams - E.T.")
                        .yearOfAward("1983")
                        .category("Oscar")
                        .content(films.get(1))
                        //.individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Best Score - John Williams")
                        .yearOfAward("1983")
                        .category("BAFTA")
                        .content(films.get(1))
                        //.individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Best Original Score - Motion Picture John Williams")
                        .yearOfAward("1983")
                        .category("Golden Globes")
                        .content(films.get(1))
                        //.individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Outstanding Sound Editing for a Series - Black Sails")
                        .yearOfAward("2016")
                        .category("Emmy")
                        .content(tvshows.get(1))
                        .individual(individuals.get(8))
                        .build(),
                Award.builder()
                        .title("Outstanding Sound Editing for a Series - Black Sails")
                        .yearOfAward("2014")
                        .category("Emmy")
                        .content(tvshows.get(1))
                        .individual(individuals.get(8))
                        .build(),
                Award.builder()
                        .title("Outstanding Original Main Title Theme Music - Cosmos")
                        .yearOfAward("2014")
                        .category("Emmy")
                        .content(tvshows.get(0))
                        //.individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Outstanding Sound Editing for Nonfiction Programming - Cosmos")
                        .yearOfAward("2014")
                        .category("Emmy")
                        .content(tvshows.get(0))
                        //.individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Outstanding Music Composition for a Series - Cosmos")
                        .yearOfAward("2014")
                        .category("Emmy")
                        .content(tvshows.get(0))
                        //.individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Best Animated Special Production - Cosmos")
                        .yearOfAward("2015")
                        .category("Annie")
                        .content(tvshows.get(0))
                        //.individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Best Foreign Film - Trois couleurs: Bleu")
                        .yearOfAward("2014")
                        .category("20/20 Awards")
                        .content(films.get(17))
                        .individual(individuals.get(14))
                        .build(),
                Award.builder()
                        .title("Best Screenplay - Original Le fabuleux destin d'Amélie Poulain")
                        .yearOfAward("2002")
                        .category("BAFTA")
                        .content(films.get(20))
                        .individual(individuals.get(17))
                        .build(),
                Award.builder()
                        .title("Best International Feature Film - Druk")
                        .yearOfAward("2021")
                        .category("Oscar")
                        .content(films.get(21))
                        .individual(individuals.get(19))
                        .build(),
                Award.builder()
                        .title("Best Film Not in the English Language - Druk")
                        .yearOfAward("2021")
                        .category("BAFTA")
                        .content(films.get(21))
                        .individual(individuals.get(19))
                        .build(),
                Award.builder()
                        .title("Best Costume Design - Ran")
                        .yearOfAward("1986")
                        .category("Oscar")
                        .content(films.get(23))
                        //.individual(individuals.get(5))
                        .build(),
                Award.builder()
                        .title("Best Foreign Language Film - Ran")
                        .yearOfAward("1987")
                        .category("BAFTA")
                        .content(films.get(23))
                        .individual(individuals.get(22))
                        .build(),
                Award.builder()
                        .title("Best Achievement in Music Written for Motion Pictures, Original Score - Up")
                        .yearOfAward("2010")
                        .category("Oscar")
                        .content(films.get(27))
                        //.individual(individuals.get(23))
                        .build(),
                Award.builder()
                        .title("Best Animated Feature Film of the Year - Up")
                        .yearOfAward("2010")
                        .category("Oscar")
                        .content(films.get(27))
                        //.individual(individuals.get(23))
                        .build(),
                Award.builder()
                        .title("Best Achievement in Music Written for Motion Pictures, Original Song - Coco")
                        .yearOfAward("2018")
                        .category("Oscar")
                        .content(films.get(28))
                        //.individual(individuals.get(23))
                        .build(),
                Award.builder()
                        .title("Best Animated Feature Film - Coco")
                        .yearOfAward("2018")
                        .category("Oscar")
                        .content(films.get(28))
                        //.individual(individuals.get(23))
                        .build(),
                Award.builder()
                        .title("Best Music, Original Score - Star Wars IV")
                        .yearOfAward("1978")
                        .category("Oscar")
                        .content(films.get(29))
                        //.individual(individuals.get(23))
                        .build(),
                Award.builder()
                        .title("Best Effects, Visual Effects - Star Wars IV")
                        .yearOfAward("1978")
                        .category("Oscar")
                        .content(films.get(29))
                        //.individual(individuals.get(23))
                        .build(),
                Award.builder()
                        .title("Best Film Editing - Star Wars IV")
                        .yearOfAward("1978")
                        .category("Oscar")
                        .content(films.get(29))
                        //.individual(individuals.get(23))
                        .build(),
                Award.builder()
                        .title("Best Sound - Star Wars V")
                        .yearOfAward("1981")
                        .category("Oscar")
                        .content(films.get(30))
                        //.individual(individuals.get(23))
                        .build(),
                Award.builder()
                        .title("Special Achievement Award For visual effects  - Star Wars VI")
                        .yearOfAward("1984")
                        .category("Oscar")
                        .content(films.get(31))
                        //.individual(individuals.get(23))
                        .build(),
                Award.builder()
                        .title("Best Cinematography - Jordan Cronenweth - Blade Runner")
                        .yearOfAward("1983")
                        .category("BAFTA")
                        .content(films.get(32))
                        //.individual(individuals.get(23))
                        .build(),
                Award.builder()
                        .title("Best Achievement in Cinematography - Blade Runner 2049")
                        .yearOfAward("2018")
                        .category("Oscar")
                        .content(films.get(33))
                        //.individual(individuals.get(23))
                        .build(),
                Award.builder()
                        .title("Best Achievement in Visual Effects - Blade Runner 2049")
                        .yearOfAward("2018")
                        .category("Oscar")
                        .content(films.get(33))
                        //.individual(individuals.get(23))
                        .build(),
                Award.builder()
                        .title("Best Cinematography - Blade Runner 2049")
                        .yearOfAward("2018")
                        .category("BAFTA")
                        .content(films.get(33))
                        //.individual(individuals.get(23))
                        .build(),
                Award.builder()
                        .title("Best Achievement in Special Visual Effects - Blade Runner 2049")
                        .yearOfAward("2018")
                        .category("BAFTA")
                        .content(films.get(33))
                        //.individual(individuals.get(23))
                        .build(),
                Award.builder()
                        .title("Best Science Fiction Film - Blade Runner 2049")
                        .yearOfAward("2018")
                        .category("Academy of Science Fiction")
                        .content(films.get(33))
                        //.individual(individuals.get(23))
                        .build(),
                Award.builder()
                        .title("Best Supporting Actor Scatman Crothers - The Shining")
                        .yearOfAward("1981")
                        .category("Academy of Science Fiction")
                        .content(films.get(35))
                        //.individual(individuals.get(23))
                        .build()
        );

        //67 awards
        awardService.createAll(awards);

        //logger.info("Created 45 awards: {}", (awards.forEach(award -> award.getTitle().equals("Best Animated Special Production Cosmos"))));
        //logger.info("Created 45 awards : {}", awards);

        //awards.get(0).setIndividual(individuals.get(5));
        //awards.get(0).setContent(films.get(0));
        //awards.get(1).setIndividual(individuals.get(5));
        //awards.get(2).setIndividual(individuals.get(5));
//        awards.get(3).setIndividual(individuals.get(0));
//        awards.get(4).setIndividual(individuals.get(0));
//        awards.get(5).setIndividual(individuals.get(5));
//        awards.get(6).setIndividual(individuals.get(5));
//        awards.get(7).setIndividual(individuals.get(5));
//        awards.get(8).setIndividual(individuals.get(5));
//        awards.get(9).setIndividual(individuals.get(5));
//        awards.get(10).setIndividual(individuals.get(5));
//        awards.get(10).setContent(films.get(0));
//        awards.get(11).setIndividual(individuals.get(5));
//        awards.get(11).setContent(films.get(0));
//        awards.get(12).setIndividual(individuals.get(5));
//        awards.get(13).setIndividual(individuals.get(5));
//        awards.get(14).setIndividual(individuals.get(1));
//        awards.get(15).setIndividual(individuals.get(2));
//        awards.get(16).setIndividual(individuals.get(2));
//        awards.get(17).setIndividual(individuals.get(6));
//        awards.get(18).setIndividual(individuals.get(7));
//        awards.get(19).setIndividual(individuals.get(7));
//        awards.get(20).setIndividual(individuals.get(4));
//        awards.get(21).setIndividual(individuals.get(4));
//        awards.get(22).setIndividual(individuals.get(5));
//        awards.get(23).setIndividual(individuals.get(10));
//        awards.get(24).setIndividual(individuals.get(10));
//        awards.get(25).setIndividual(individuals.get(10));
//        awards.get(26).setIndividual(individuals.get(10));
//        awards.get(27).setIndividual(individuals.get(11));
//        awards.get(28).setIndividual(individuals.get(11));
//        awards.get(29).setIndividual(individuals.get(11));
//        awards.get(30).setIndividual(individuals.get(12));
//        awards.get(31).setIndividual(individuals.get(12));
//        awards.get(32).setIndividual(individuals.get(12));
//        awards.get(33).setIndividual(individuals.get(12));
//        awards.get(34).setIndividual(individuals.get(12));
//        awards.get(35).setIndividual(individuals.get(12));
        //awards.get(37).setIndividual(individuals.get(5));
        //awards.get(38).setIndividual(individuals.get(5));
        //awards.get(39).setIndividual(individuals.get(5));
        //awards.get(40).setIndividual(individuals.get(5));
        //awards.get(41).setIndividual(individuals.get(5));
        //awards.get(42).setIndividual(individuals.get(5));
        //awards.get(43).setIndividual(individuals.get(5));
        //awards.get(44).setIndividual(individuals.get(5));
        //awards.get(45).setIndividual(individuals.get(5));


        //logger.info("Search Individual by first name: {}", individualService.findIndividualByFirstName("joe").get(0));
        //logger.info("Search Individual by fullname: {}", individualService.findIndividualByFullName("joe", "peci").isPresent());

        //logger.info("Search film by title: {}", filmService.findMovieByTitle(""));
        //individualService.exportToCsv();

    }
}
