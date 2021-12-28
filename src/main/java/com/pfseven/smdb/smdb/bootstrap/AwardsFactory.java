package com.pfseven.smdb.smdb.bootstrap;

import com.pfseven.smdb.smdb.base.AbstractLogComponent;
import com.pfseven.smdb.smdb.domain.Award;
import com.pfseven.smdb.smdb.services.AwardService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Profile("content-generator")
public class AwardsFactory extends AbstractLogComponent implements CommandLineRunner {

    private final AwardService awardService;

    @Override
    public void run(String... args)  {

        List<Award> awards = awardService.createAll(
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
                        .build()
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
/*
            //Form used for future inserts.
                Award.builder()
                        .title("")
                        .yearOfAward("")
                        .category("")
                        .build(),

*/
        //awardService.createAll(awards);
        logger.info("Created 45 awards: {}", awards);
    }
}
