package com.algokelvin.android.kotlin.recyclerview.chapter_014_015_recyclerview_part02

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataAvenger(
    val name: String,
    val image: Int,
    val description: String
): Parcelable

fun dataDummy(): ArrayList<DataAvenger> {
    val data = ArrayList<DataAvenger>()

    data.add(
        DataAvenger(
            "Iron Man",
            R.drawable.avenger_ironman,
            "Iron Man is a fictional superhero appearing in American comic books published by Marvel Comics. The character was co-created by writer and editor Stan Lee, developed by scripter Larry Lieber, and designed by artists Don Heck and Jack Kirby. The character made his first appearance in Tales of Suspense #39 (cover dated March 1963), and received his own title in Iron Man #1 (May 1968).\n" +
                "\n" +
                "A wealthy American business magnate, playboy, and ingenious scientist, Anthony Edward \"Tony\" Stark suffers a severe chest injury during a kidnapping. When his captors attempt to force him to build a weapon of mass destruction, he instead creates a mechanized suit of armor to save his life and escape captivity. Later, Stark develops his suit, adding weapons and other technological devices he designed through his company, Stark Industries. He uses the suit and successive versions to protect the world as Iron Man. Although at first concealing his true identity, Stark eventually publicly reveals himself to be Iron Man.")
    )
    data.add(
        DataAvenger(
            "Captain America",
            R.drawable.avenger_captain_america,
            "Captain America is a superhero appearing in American comic books published by Marvel Comics. Created by cartoonists Joe Simon and Jack Kirby, the character first appeared in Captain America Comics #1 (cover dated March 1941) from Timely Comics, a predecessor of Marvel Comics. Captain America was designed as a patriotic supersoldier who often fought the Axis powers of World War II and was Timely Comics' most popular character during the wartime period. The popularity of superheroes waned following the war, and the Captain America comic book was discontinued in 1950, with a short-lived revival in 1953. Since Marvel Comics revived the character in 1964, Captain America has remained in publication."
        )
    )
    data.add(
        DataAvenger(
            "Thor",
            R.drawable.avenger_thor,
            "Thor is a prominently mentioned god throughout the recorded history of the Germanic peoples, from the Roman occupation of regions of Germania, to the Germanic expansions of the Migration Period, to his high popularity during the Viking Age, when, in the face of the process of the Christianization of Scandinavia, emblems of his hammer, Mjölnir, were worn and Norse pagan personal names containing the name of the god bear witness to his popularity."
        )
    )
    data.add(
        DataAvenger(
            "Hulk",
            R.drawable.avenger_hulk,
            "The Hulk is a fictional superhero appearing in publications by the American publisher Marvel Comics. Created by writer Stan Lee and artist Jack Kirby, the character first appeared in the debut issue of The Incredible Hulk (May 1962). In his comic book appearances, the character is both the Hulk, a green-skinned, hulking and muscular humanoid possessing a vast degree of physical strength, and his alter ego Dr. Robert Bruce Banner, a physically weak, socially withdrawn, and emotionally reserved physicist, the two existing as independent personalities and resenting of the other."
        )
    )
    data.add(
        DataAvenger(
            "Black Widow",
            R.drawable.avenger_black_widow,
            "Natalia Alianovna \"Natasha\" Romanova[1] (Russian: Наталья Альяновна \"Наташа\" Романова; alias: Natasha Romanoff; Russian: Наташа Романоф), colloquial: Black Widow (Russian: Чёрная Вдова; transliterated Chyornaya Vdova) is a fictional superhero appearing in American comic books published by Marvel Comics. Created by editor and plotter Stan Lee, scripter Don Rico, and artist Don Heck, the character debuted in Tales of Suspense #52 (April 1964). The character was introduced as a Russian spy, an antagonist of the superhero Iron Man. She later defected to the United States, becoming an agent of the fictional spy agency S.H.I.E.L.D. and a member of the superhero team the Avengers."
        )
    )
    data.add(
        DataAvenger(
            "Hawk Eye",
            R.drawable.avenger_hawkeye,
            "Hawkeye (Clinton Francis Barton) is a fictional superhero appearing in American comic books published by Marvel Comics. Created by writer Stan Lee and artist Don Heck, the character first appeared as a villain in Tales of Suspense #57 (Sept. 1964) and later joined the Avengers in The Avengers #16 (May 1965). He has been a prominent member of the team ever since. He was also ranked at #44 on IGN's Top 100 Comic Book Heroes list."
        )
    )
    data.add(
        DataAvenger(
            "Captain Marvel",
            R.drawable.avenger_captain_marvel,
            "Captain Marvel is a 2019 American superhero film based on the Marvel Comics character Carol Danvers. Produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures, it is the 21st film in the Marvel Cinematic Universe (MCU). The film was written and directed by Anna Boden and Ryan Fleck, with Nicole Perlman, Meg LeFauve, and Geneva Robertson-Dworet also contributing to the screenplay. Brie Larson stars as Danvers, alongside Samuel L. Jackson, Ben Mendelsohn, Djimon Hounsou, Lee Pace, Lashana Lynch, Gemma Chan, Annette Bening, Clark Gregg, and Jude Law. Set in 1995, the story follows Danvers as she becomes Captain Marvel after Earth is caught in the center of a galactic conflict between two alien civilizations."
        )
    )
    data.add(
        DataAvenger(
            "Doctor Strange",
            R.drawable.avenger_doctor_strange,
            "Doctor Stephen Strange is a fictional character appearing in American comic books published by Marvel Comics. Created by artist Steve Ditko and writer Stan Lee, the character first appeared in Strange Tales #110 (cover-dated July 1963). Doctor Strange serves as the Sorcerer Supreme, the primary protector of Earth against magical and mystical threats. Inspired by stories of black magic and Chandu the Magician, Strange was created during the Silver Age of Comic Books to bring a different kind of character and themes of mysticism to Marvel Comics.\n" +
                    "\n" +
                    "The character begins as an egotistical surgeon who loses the ability to operate after a car crash severely damages his hands. Searching the globe for healing, he encounters the Ancient One, the Sorcerer Supreme. Strange becomes his student, and learns to be a master of both the mystical and the martial arts. He acquires an assortment of mystical objects, including the powerful Eye of Agamotto and Cloak of Levitation, and takes up residence in a mansion referred to as the Sanctum Sanctorum, located in 177A Bleecker Street, New York City. Strange assumes the title of Sorcerer Supreme and, with his friend and valet Wong, defends the world from mystical threats."
        )
    )
    data.add(
        DataAvenger(
            "Ant Man",
            R.drawable.avenger_ant_man,
            "Ant-Man is the name of several superheroes appearing in books published by Marvel Comics. Created by Stan Lee, Larry Lieber and Jack Kirby, Ant-Man's first appearance was in Tales to Astonish #35 (September 1962). The persona was originally the brilliant scientist Hank Pym's superhero alias after inventing a substance that can change size, but reformed thieves Scott Lang and Eric O'Grady also took on the mantle after the original changed his superhero identity to various other aliases, such as Giant-Man, Goliath, and Yellowjacket. Ant-Man has appeared in several films based on the Marvel character, such as Ant-Man (2015), Captain America: Civil War (2016), Ant-Man and the Wasp (2018), and Avengers: Endgame (2019)."
        )
    )
    data.add(
        DataAvenger(
            "Black Panther",
            R.drawable.avenger_black_phanter,
            "Black Panther is a 2018 American superhero film based on the Marvel Comics character of the same name. Produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures, it is the 18th film in the Marvel Cinematic Universe (MCU). The film was directed by Ryan Coogler, who co-wrote the screenplay with Joe Robert Cole, and it stars Chadwick Boseman as T'Challa / Black Panther alongside Michael B. Jordan, Lupita Nyong'o, Danai Gurira, Martin Freeman, Daniel Kaluuya, Letitia Wright, Winston Duke, Angela Bassett, Forest Whitaker, and Andy Serkis. In Black Panther, T'Challa is crowned king of Wakanda following his father's death, but he is challenged by Killmonger who plans to abandon the country's isolationist policies and begin a global revolution.\n" +
                    "\n" +
                    "Wesley Snipes expressed interest in working on a Black Panther film in 1992, but the project did not come to fruition. In September 2005, Marvel Studios announced a Black Panther film as one of ten based on Marvel characters and distributed by Paramount Pictures. Mark Bailey was hired to write a script in January 2011. Black Panther was officially announced in October 2014, and Boseman made his first appearance as the character in Captain America: Civil War (2016). Cole and Coogler had joined by then, with additional casting in May making Black Panther the first Marvel film with a predominantly black cast. Principal photography took place from January to April 2017 at EUE/Screen Gems Studios in the Atlanta metropolitan area, and Busan, South Korea."
        )
    )

    return data
}

fun dataDummyGrid(): ArrayList<DataAvenger> {
    val data = ArrayList<DataAvenger>()

    data.add(
        DataAvenger(
            "Iron Man",
            R.drawable.avenger_ironman,
            "Iron Man is a fictional superhero appearing in American comic books published by Marvel Comics. The character was co-created by writer and editor Stan Lee, developed by scripter Larry Lieber, and designed by artists Don Heck and Jack Kirby. The character made his first appearance in Tales of Suspense #39 (cover dated March 1963), and received his own title in Iron Man #1 (May 1968).\n" +
                    "\n" +
                    "A wealthy American business magnate, playboy, and ingenious scientist, Anthony Edward \"Tony\" Stark suffers a severe chest injury during a kidnapping. When his captors attempt to force him to build a weapon of mass destruction, he instead creates a mechanized suit of armor to save his life and escape captivity. Later, Stark develops his suit, adding weapons and other technological devices he designed through his company, Stark Industries. He uses the suit and successive versions to protect the world as Iron Man. Although at first concealing his true identity, Stark eventually publicly reveals himself to be Iron Man.")
    )
    data.add(
        DataAvenger(
            "Captain America",
            R.drawable.avenger_captain_america,
            "Captain America is a superhero appearing in American comic books published by Marvel Comics. Created by cartoonists Joe Simon and Jack Kirby, the character first appeared in Captain America Comics #1 (cover dated March 1941) from Timely Comics, a predecessor of Marvel Comics. Captain America was designed as a patriotic supersoldier who often fought the Axis powers of World War II and was Timely Comics' most popular character during the wartime period. The popularity of superheroes waned following the war, and the Captain America comic book was discontinued in 1950, with a short-lived revival in 1953. Since Marvel Comics revived the character in 1964, Captain America has remained in publication."
        )
    )
    data.add(
        DataAvenger(
            "Thor",
            R.drawable.avenger_thor,
            "Thor is a prominently mentioned god throughout the recorded history of the Germanic peoples, from the Roman occupation of regions of Germania, to the Germanic expansions of the Migration Period, to his high popularity during the Viking Age, when, in the face of the process of the Christianization of Scandinavia, emblems of his hammer, Mjölnir, were worn and Norse pagan personal names containing the name of the god bear witness to his popularity."
        )
    )
    data.add(
        DataAvenger(
            "Hulk",
            R.drawable.avenger_hulk,
            "The Hulk is a fictional superhero appearing in publications by the American publisher Marvel Comics. Created by writer Stan Lee and artist Jack Kirby, the character first appeared in the debut issue of The Incredible Hulk (May 1962). In his comic book appearances, the character is both the Hulk, a green-skinned, hulking and muscular humanoid possessing a vast degree of physical strength, and his alter ego Dr. Robert Bruce Banner, a physically weak, socially withdrawn, and emotionally reserved physicist, the two existing as independent personalities and resenting of the other."
        )
    )
    data.add(
        DataAvenger(
            "Black Widow",
            R.drawable.avenger_black_widow,
            "Natalia Alianovna \"Natasha\" Romanova[1] (Russian: Наталья Альяновна \"Наташа\" Романова; alias: Natasha Romanoff; Russian: Наташа Романоф), colloquial: Black Widow (Russian: Чёрная Вдова; transliterated Chyornaya Vdova) is a fictional superhero appearing in American comic books published by Marvel Comics. Created by editor and plotter Stan Lee, scripter Don Rico, and artist Don Heck, the character debuted in Tales of Suspense #52 (April 1964). The character was introduced as a Russian spy, an antagonist of the superhero Iron Man. She later defected to the United States, becoming an agent of the fictional spy agency S.H.I.E.L.D. and a member of the superhero team the Avengers."
        )
    )
    data.add(
        DataAvenger(
            "Hawk Eye",
            R.drawable.avenger_hawkeye,
            "Hawkeye (Clinton Francis Barton) is a fictional superhero appearing in American comic books published by Marvel Comics. Created by writer Stan Lee and artist Don Heck, the character first appeared as a villain in Tales of Suspense #57 (Sept. 1964) and later joined the Avengers in The Avengers #16 (May 1965). He has been a prominent member of the team ever since. He was also ranked at #44 on IGN's Top 100 Comic Book Heroes list."
        )
    )
    data.add(
        DataAvenger(
            "Captain Marvel",
            R.drawable.avenger_captain_marvel,
            "Captain Marvel is a 2019 American superhero film based on the Marvel Comics character Carol Danvers. Produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures, it is the 21st film in the Marvel Cinematic Universe (MCU). The film was written and directed by Anna Boden and Ryan Fleck, with Nicole Perlman, Meg LeFauve, and Geneva Robertson-Dworet also contributing to the screenplay. Brie Larson stars as Danvers, alongside Samuel L. Jackson, Ben Mendelsohn, Djimon Hounsou, Lee Pace, Lashana Lynch, Gemma Chan, Annette Bening, Clark Gregg, and Jude Law. Set in 1995, the story follows Danvers as she becomes Captain Marvel after Earth is caught in the center of a galactic conflict between two alien civilizations."
        )
    )
    data.add(
        DataAvenger(
            "Doctor Strange",
            R.drawable.avenger_doctor_strange,
            "Doctor Stephen Strange is a fictional character appearing in American comic books published by Marvel Comics. Created by artist Steve Ditko and writer Stan Lee, the character first appeared in Strange Tales #110 (cover-dated July 1963). Doctor Strange serves as the Sorcerer Supreme, the primary protector of Earth against magical and mystical threats. Inspired by stories of black magic and Chandu the Magician, Strange was created during the Silver Age of Comic Books to bring a different kind of character and themes of mysticism to Marvel Comics.\n" +
                    "\n" +
                    "The character begins as an egotistical surgeon who loses the ability to operate after a car crash severely damages his hands. Searching the globe for healing, he encounters the Ancient One, the Sorcerer Supreme. Strange becomes his student, and learns to be a master of both the mystical and the martial arts. He acquires an assortment of mystical objects, including the powerful Eye of Agamotto and Cloak of Levitation, and takes up residence in a mansion referred to as the Sanctum Sanctorum, located in 177A Bleecker Street, New York City. Strange assumes the title of Sorcerer Supreme and, with his friend and valet Wong, defends the world from mystical threats."
        )
    )
    data.add(
        DataAvenger(
            "Ant Man",
            R.drawable.avenger_ant_man,
            "Ant-Man is the name of several superheroes appearing in books published by Marvel Comics. Created by Stan Lee, Larry Lieber and Jack Kirby, Ant-Man's first appearance was in Tales to Astonish #35 (September 1962). The persona was originally the brilliant scientist Hank Pym's superhero alias after inventing a substance that can change size, but reformed thieves Scott Lang and Eric O'Grady also took on the mantle after the original changed his superhero identity to various other aliases, such as Giant-Man, Goliath, and Yellowjacket. Ant-Man has appeared in several films based on the Marvel character, such as Ant-Man (2015), Captain America: Civil War (2016), Ant-Man and the Wasp (2018), and Avengers: Endgame (2019)."
        )
    )
    data.add(
        DataAvenger(
            "Black Panther",
            R.drawable.avenger_black_phanter,
            "Black Panther is a 2018 American superhero film based on the Marvel Comics character of the same name. Produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures, it is the 18th film in the Marvel Cinematic Universe (MCU). The film was directed by Ryan Coogler, who co-wrote the screenplay with Joe Robert Cole, and it stars Chadwick Boseman as T'Challa / Black Panther alongside Michael B. Jordan, Lupita Nyong'o, Danai Gurira, Martin Freeman, Daniel Kaluuya, Letitia Wright, Winston Duke, Angela Bassett, Forest Whitaker, and Andy Serkis. In Black Panther, T'Challa is crowned king of Wakanda following his father's death, but he is challenged by Killmonger who plans to abandon the country's isolationist policies and begin a global revolution.\n" +
                    "\n" +
                    "Wesley Snipes expressed interest in working on a Black Panther film in 1992, but the project did not come to fruition. In September 2005, Marvel Studios announced a Black Panther film as one of ten based on Marvel characters and distributed by Paramount Pictures. Mark Bailey was hired to write a script in January 2011. Black Panther was officially announced in October 2014, and Boseman made his first appearance as the character in Captain America: Civil War (2016). Cole and Coogler had joined by then, with additional casting in May making Black Panther the first Marvel film with a predominantly black cast. Principal photography took place from January to April 2017 at EUE/Screen Gems Studios in the Atlanta metropolitan area, and Busan, South Korea."
        )
    )

    return data
}

fun dataDummyStaggedGrid(): ArrayList<DataAvenger> {
    val data = ArrayList<DataAvenger>()

    data.add(
        DataAvenger(
            "Iron Man",
            R.drawable.avenger_ironman_02,
            "Iron Man is a fictional superhero appearing in American comic books published by Marvel Comics. The character was co-created by writer and editor Stan Lee, developed by scripter Larry Lieber, and designed by artists Don Heck and Jack Kirby. The character made his first appearance in Tales of Suspense #39 (cover dated March 1963), and received his own title in Iron Man #1 (May 1968).\n" +
                    "\n" +
                    "A wealthy American business magnate, playboy, and ingenious scientist, Anthony Edward \"Tony\" Stark suffers a severe chest injury during a kidnapping. When his captors attempt to force him to build a weapon of mass destruction, he instead creates a mechanized suit of armor to save his life and escape captivity. Later, Stark develops his suit, adding weapons and other technological devices he designed through his company, Stark Industries. He uses the suit and successive versions to protect the world as Iron Man. Although at first concealing his true identity, Stark eventually publicly reveals himself to be Iron Man.")
    )
    data.add(
        DataAvenger(
            "Captain America",
            R.drawable.avenger_captain_america,
            "Captain America is a superhero appearing in American comic books published by Marvel Comics. Created by cartoonists Joe Simon and Jack Kirby, the character first appeared in Captain America Comics #1 (cover dated March 1941) from Timely Comics, a predecessor of Marvel Comics. Captain America was designed as a patriotic supersoldier who often fought the Axis powers of World War II and was Timely Comics' most popular character during the wartime period. The popularity of superheroes waned following the war, and the Captain America comic book was discontinued in 1950, with a short-lived revival in 1953. Since Marvel Comics revived the character in 1964, Captain America has remained in publication."
        )
    )
    data.add(
        DataAvenger(
            "Thor",
            R.drawable.avenger_thor_02,
            "Thor is a prominently mentioned god throughout the recorded history of the Germanic peoples, from the Roman occupation of regions of Germania, to the Germanic expansions of the Migration Period, to his high popularity during the Viking Age, when, in the face of the process of the Christianization of Scandinavia, emblems of his hammer, Mjölnir, were worn and Norse pagan personal names containing the name of the god bear witness to his popularity."
        )
    )
    data.add(
        DataAvenger(
            "Hulk",
            R.drawable.avenger_hulk,
            "The Hulk is a fictional superhero appearing in publications by the American publisher Marvel Comics. Created by writer Stan Lee and artist Jack Kirby, the character first appeared in the debut issue of The Incredible Hulk (May 1962). In his comic book appearances, the character is both the Hulk, a green-skinned, hulking and muscular humanoid possessing a vast degree of physical strength, and his alter ego Dr. Robert Bruce Banner, a physically weak, socially withdrawn, and emotionally reserved physicist, the two existing as independent personalities and resenting of the other."
        )
    )
    data.add(
        DataAvenger(
            "Black Widow",
            R.drawable.avenger_black_widow_02,
            "Natalia Alianovna \"Natasha\" Romanova[1] (Russian: Наталья Альяновна \"Наташа\" Романова; alias: Natasha Romanoff; Russian: Наташа Романоф), colloquial: Black Widow (Russian: Чёрная Вдова; transliterated Chyornaya Vdova) is a fictional superhero appearing in American comic books published by Marvel Comics. Created by editor and plotter Stan Lee, scripter Don Rico, and artist Don Heck, the character debuted in Tales of Suspense #52 (April 1964). The character was introduced as a Russian spy, an antagonist of the superhero Iron Man. She later defected to the United States, becoming an agent of the fictional spy agency S.H.I.E.L.D. and a member of the superhero team the Avengers."
        )
    )
    data.add(
        DataAvenger(
            "Hawk Eye",
            R.drawable.avenger_hawkeye,
            "Hawkeye (Clinton Francis Barton) is a fictional superhero appearing in American comic books published by Marvel Comics. Created by writer Stan Lee and artist Don Heck, the character first appeared as a villain in Tales of Suspense #57 (Sept. 1964) and later joined the Avengers in The Avengers #16 (May 1965). He has been a prominent member of the team ever since. He was also ranked at #44 on IGN's Top 100 Comic Book Heroes list."
        )
    )
    data.add(
        DataAvenger(
            "Captain Marvel",
            R.drawable.avenger_captain_marvel_02,
            "Captain Marvel is a 2019 American superhero film based on the Marvel Comics character Carol Danvers. Produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures, it is the 21st film in the Marvel Cinematic Universe (MCU). The film was written and directed by Anna Boden and Ryan Fleck, with Nicole Perlman, Meg LeFauve, and Geneva Robertson-Dworet also contributing to the screenplay. Brie Larson stars as Danvers, alongside Samuel L. Jackson, Ben Mendelsohn, Djimon Hounsou, Lee Pace, Lashana Lynch, Gemma Chan, Annette Bening, Clark Gregg, and Jude Law. Set in 1995, the story follows Danvers as she becomes Captain Marvel after Earth is caught in the center of a galactic conflict between two alien civilizations."
        )
    )
    data.add(
        DataAvenger(
            "Doctor Strange",
            R.drawable.avenger_doctor_strange,
            "Doctor Stephen Strange is a fictional character appearing in American comic books published by Marvel Comics. Created by artist Steve Ditko and writer Stan Lee, the character first appeared in Strange Tales #110 (cover-dated July 1963). Doctor Strange serves as the Sorcerer Supreme, the primary protector of Earth against magical and mystical threats. Inspired by stories of black magic and Chandu the Magician, Strange was created during the Silver Age of Comic Books to bring a different kind of character and themes of mysticism to Marvel Comics.\n" +
                    "\n" +
                    "The character begins as an egotistical surgeon who loses the ability to operate after a car crash severely damages his hands. Searching the globe for healing, he encounters the Ancient One, the Sorcerer Supreme. Strange becomes his student, and learns to be a master of both the mystical and the martial arts. He acquires an assortment of mystical objects, including the powerful Eye of Agamotto and Cloak of Levitation, and takes up residence in a mansion referred to as the Sanctum Sanctorum, located in 177A Bleecker Street, New York City. Strange assumes the title of Sorcerer Supreme and, with his friend and valet Wong, defends the world from mystical threats."
        )
    )
    data.add(
        DataAvenger(
            "Ant Man",
            R.drawable.avenger_ant_man_02,
            "Ant-Man is the name of several superheroes appearing in books published by Marvel Comics. Created by Stan Lee, Larry Lieber and Jack Kirby, Ant-Man's first appearance was in Tales to Astonish #35 (September 1962). The persona was originally the brilliant scientist Hank Pym's superhero alias after inventing a substance that can change size, but reformed thieves Scott Lang and Eric O'Grady also took on the mantle after the original changed his superhero identity to various other aliases, such as Giant-Man, Goliath, and Yellowjacket. Ant-Man has appeared in several films based on the Marvel character, such as Ant-Man (2015), Captain America: Civil War (2016), Ant-Man and the Wasp (2018), and Avengers: Endgame (2019)."
        )
    )
    data.add(
        DataAvenger(
            "Black Panther",
            R.drawable.avenger_black_phanter,
            "Black Panther is a 2018 American superhero film based on the Marvel Comics character of the same name. Produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures, it is the 18th film in the Marvel Cinematic Universe (MCU). The film was directed by Ryan Coogler, who co-wrote the screenplay with Joe Robert Cole, and it stars Chadwick Boseman as T'Challa / Black Panther alongside Michael B. Jordan, Lupita Nyong'o, Danai Gurira, Martin Freeman, Daniel Kaluuya, Letitia Wright, Winston Duke, Angela Bassett, Forest Whitaker, and Andy Serkis. In Black Panther, T'Challa is crowned king of Wakanda following his father's death, but he is challenged by Killmonger who plans to abandon the country's isolationist policies and begin a global revolution.\n" +
                    "\n" +
                    "Wesley Snipes expressed interest in working on a Black Panther film in 1992, but the project did not come to fruition. In September 2005, Marvel Studios announced a Black Panther film as one of ten based on Marvel characters and distributed by Paramount Pictures. Mark Bailey was hired to write a script in January 2011. Black Panther was officially announced in October 2014, and Boseman made his first appearance as the character in Captain America: Civil War (2016). Cole and Coogler had joined by then, with additional casting in May making Black Panther the first Marvel film with a predominantly black cast. Principal photography took place from January to April 2017 at EUE/Screen Gems Studios in the Atlanta metropolitan area, and Busan, South Korea."
        )
    )

    return data
}