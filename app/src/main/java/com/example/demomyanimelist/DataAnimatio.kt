package com.example.demomyanimelist

import com.example.demomyanimelist.adapter.Animation


object DataAnimatio {

    private val movie = arrayOf(
        "Fate/stay night Movie Heavens Feel III Spring Song",
        "Gintama: The Final",
        "Kimetsu no Yaiba Movie: Mugen Ressha-hen",
        "Kimi no Na wa",
        "Koe no Katachi",
        "Mahou Shoujo Madoka Magica Movie 3: Hangyaku no Monogatari",
        "No Game No Life: Zero",
        "Sen to Chihiro no Kamikakushi",
        "Violet Evergarden Movie",
        "Yoru wa Mijikashi Arukeyo Otome"
    )

    private val tvhow = arrayOf(
        "Gangsta",
        "Kimetsu no Yaiba",
        "Made in Abyys",
        "Mahouka Koukou no Rettousei",
        "No Gamee No Life",
        "One Piece",
        "Platinum End",
        "Princess Principal",
        "Shadow House",
        "Violet Evergarden"
    )

    private val movie_details = arrayOf(
        "The Fifth Holy Grail War in Fuyuki City has reached a turning point in which the lives of all participants are threatened as the hidden enemy finally reveals itself. As Shirou Emiya, Rin Toosaka, and Illyasviel von Einzbern discover the true, corruptive nature of the shadow that has been rampaging throughout the city, they realize just how dire the situation is.",
        "Two years have passed following the Tendoshuus invasion of the O-Edo Central Terminal. Since then, the Yorozuya have gone their separate ways. Foreseeing Utsuros return, Gintoki Sakata begins surveying Earths ley lines for traces of the other mans Altana. After an encounter with the remnants of the Tendoshuu—who continue to press on in search of immortality—Gintoki returns to Edo.",
        "After a string of mysterious disappearances begin to plague a train, the Demon Slayer Corps multiple attempts to remedy the problem prove fruitless. To prevent further casualties, the flame pillar, Kyoujurou Rengoku, takes it upon himself to eliminate the threat. Accompanying him are some of the Corps most promising new blood: Tanjirou Kamado, Zenitsu Agatsuma, and Inosuke Hashibira, who all hope to witness the fiery feats of this model demon slayer firsthand.",
        "Mitsuha Miyamizu, a high school girl, yearns to live the life of a boy in the bustling city of Tokyo—a dream that stands in stark contrast to her present life in the countryside. Meanwhile in the city, Taki Tachibana lives a busy life as a high school student while juggling his part-time job and hopes for a future in architecture.",
        "As a wild youth, elementary school student Shouya Ishida sought to beat boredom in the cruelest ways. When the deaf Shouko Nishimiya transfers into his class, Shouya and the rest of his class thoughtlessly bully her for fun. However, when her mother notifies the school, he is singled out and blamed for everything done to her.",
        "The young girls of Mitakihara happily live their lives, occasionally fighting off evil, but otherwise going about their peaceful, everyday routines. However, Homura Akemi feels that something is wrong with this unusually pleasant atmosphere—though the others remain oblivious, she cannot help but suspect that there is more to what is going on than meets the eye: someone who should not exist is currently present to join in on their activities.",
        "In ancient Disboard, Riku is an angry, young warrior intent on saving humanity from the warring Exceed, the sixteen sentient species, fighting to establish the One True God amongst the Old Deus. In a lawless land, humanitys lack of magic and weak bodies have made them easy targets for the other Exceed, leaving the humans on the brink of extinction.",
        "Stubborn, spoiled, and naïve, 10-year-old Chihiro Ogino is less than pleased when she and her parents discover an abandoned amusement park on the way to their new house. Cautiously venturing inside, she realizes that there is more to this place than meets the eye, as strange things begin to happen once dusk falls. Ghostly apparitions and food that turns her parents into pigs are just the start—Chihiro has unwittingly crossed over into the spirit world.",
        "Several years have passed since the end of The Great War. As the radio tower in Leidenschaftlich continues to be built, telephones will soon become more relevant, leading to a decline in demand for Auto Memory Dolls. Even so, Violet Evergarden continues to rise in fame after her constant success with writing letters. However, sometimes the one thing you long for is the one thing that does not appear.",
        "On a mysterious night that seems to last for a year, an ordinary college student continues to chase one of his underclassmen, a girl with black hair—the girl of his dreams. Up until now, he has been relying on a simple plan, which is to calculatingly bump into her every day while making it seem like a meaningful coincidence. However, his efforts remain futile as their relationship is not progressing at all."
    )

    private val tvshow_details = arrayOf(
        "In the crime-ridden city of Ergastulum, there exists a group of humans with super strength and speed dubbed twilights. These twilights define the city with their constant tension with normal humans, and powerful factions of the town—the Corsica Family, the Monroe Family, the Cristiano Family, and the Paulklee Guild—use them as a means to maintain the fragile balance that exists within the city.",
        "Tanjirou swears to avenge his family and stay by his only remaining sibling. Alongside the mysterious group calling themselves the Demon Slayer Corps, Tanjirou will do whatever it takes to slay the demons and protect the remnants of his beloved sisters humanity.",
        "Riko, daughter of the missing White Whistle Lyza the Annihilator, aspires to become like her mother and explore the furthest reaches of the Abyss. However, just a novice Red Whistle herself, she is only permitted to roam its most upper layer. Even so, Riko has a chance encounter with a mysterious robot with the appearance of an ordinary young boy. She comes to name him Reg, and he has no recollection of the events preceding his discovery.",
        "Tatsuya and Miyuki Shiba, who are enrolled in First High School. Upon taking the exam, the prodigious Miyuki is placed in the First Course, while Tatsuya is relegated to the Second Course. Though his practical test scores and status as a Weed show him to be magically inept, he possesses extraordinary technical knowledge, physical combat capabilities, and unique magic techniques",
        "The mysterious god welcomes Sora and Shiro to Disboard, a world where all forms of conflict—from petty squabbles to the fate of whole countries—are settled not through war, but by way of high-stake games. This system works thanks to a fundamental rule wherein each party must wager something they deem to be of equal value to the other partys wager.",
        "Monkey D. Luffy, a 17-year-old boy who defies your standard definition of a pirate. Rather than the popular persona of a wicked, hardened, toothless pirate ransacking villages for fun, Luffys reason for being a pirate is one of pure wonder: the thought of an exciting adventure that leads him to intriguing people and ultimately, the promised treasure",
        "Mirai Kakehashi has lived a life of pain and despair. Prepared to throw it all away, he stands on the edge of a precipice and takes the leap. However, instead of falling to his death, he enters a trance where he meets a winged being who claims to be his guardian angel. Named Nasse, the angel offers him two priceless abilities and convinces him to go on living.",
        "In the early 20th century, the discovery of the substance Cavorite allowed the production of advanced military technology and steered the country toward conflict. London is now divided by a wall, and the Kingdom and the Commonwealth of Albion battle a silent war where espionage is the only weapon that can destabilize the enemy. A group of girls from the prestigious Queens Mayfaire school work as undercover spies for the Commonwealth.",
        "Emilico is just one of many Living Dolls serving in the Shadows House, residents of which are pitch black from head to toe and constantly leak soot that stains the house black. Each Shadow is partnered with a Doll, which strangely resembles the other. As a Living Doll, Emilico must keep the house sparkling clean as well as act as the face for her master, Kate. In turn, Kate supports Emilico and treats her as her confidant.",
        "Several years have passed since the end of The Great War. As the radio tower in Leidenschaftlich continues to be built, telephones will soon become more relevant, leading to a decline in demand for Auto Memory Dolls. Even so, Violet Evergarden continues to rise in fame after her constant success with writing letters. However, sometimes the one thing you long for is the one thing that does not appear.",
    )

    private val movie_aired = arrayOf(
        "Aug 15, 2020",
        "Jan 8, 2021",
        "Oct 16, 2020",
        "Aug 26, 2016",
        "Sep 17, 2016",
        "Oct 26, 2013",
        "Jul 15, 2017",
        "Jul 20, 2001",
        "Sep 18, 2020",
        "Apr 7, 2017"
    )

    private val tvshow_aired = arrayOf(
        "Jan 21, 2011",
        "Apr 6, 2019",
        "Jul 7, 2017",
        "Apr 6, 2014",
        "Apr 9, 2014",
        "Oct 20, 1999",
        "Oct 8, 2021",
        "Jul 9, 2017",
        "Sep 6, 2018",
        "Sep 18, 2020"
    )

    private val movie_studio = arrayOf(
        "ufotable",
        "Bandai Namco Pictures",
        "ufotable",
        "CoMix Wave Films",
        "Kyoto Animation",
        "Shaft",
        "Madhouse",
        "Studio Ghibli",
        "Kyoto Animation",
        "Science SARU"
    )

    private val tvshow_studio = arrayOf(
        "RES Studio",
        "Ufotable",
        "Kinema Citrus",
        "Madhouse",
        "Madhouse",
        "Toei Animation",
        "Signal.MD",
        "Actas, Studio 3Hz",
        "Lisa Studio",
        "Kyoto Animation"
    )

    private val movie_rank = arrayOf(
        "8.74",
        "9.03",
        "8.70",
        "8.88",
        "8.96",
        "8.46",
        "8.24",
        "8.79",
        "8.98",
        "8.21"
    )

    private val tvhow_rank = arrayOf(
        "8.09",
        "8.57",
        "8.69",
        "7.46",
        "8.47",
        "8.62",
        "6.53",
        "7.71",
        "8.38",
        "8.98"
    )

    private val movie_poster = intArrayOf(
        R.drawable.fate,
        R.drawable.gintama,
        R.drawable.kimetsu_no_yaiba_movie,
        R.drawable.kimi_no_nawa,
        R.drawable.koe_no_katachi,
        R.drawable.mahou_shoujo,
        R.drawable.no_game_no_life_zero,
        R.drawable.sen_to_chihiro_no_kamikakushi,
        R.drawable.violet_evergarden_movie,
        R.drawable.yoru_wa_mijikashi
    )

    private val tvshow_poster = intArrayOf(
        R.drawable.gangsta,
        R.drawable.kimetsu_no_yaiba,
        R.drawable.made,
        R.drawable.mahouka,
        R.drawable.no_game,
        R.drawable.one,
        R.drawable.platinum_end,
        R.drawable.princess,
        R.drawable.shadow_house,
        R.drawable.violet
    )


    val listMovie: ArrayList<Animation>
        get() {
            val list = arrayListOf<Animation>()
            for (position in movie.indices) {
                val animation = Animation()
                animation.Name = movie[position]
                animation.aired = movie_aired[position]
                animation.rank = movie_rank[position]
                animation.description = movie_details[position]
                animation.studio = movie_studio[position]
                animation.poster = movie_poster[position]
                list.add(animation)
            }
            return list
        }
    val listTvShow: ArrayList<Animation>
        get() {
            val list = arrayListOf<Animation>()
            for (position in tvhow.indices) {
                val animation = Animation()
                animation.Name = tvhow[position]
                animation.aired = tvshow_aired[position]
                animation.rank = tvhow_rank[position]
                animation.description = tvshow_details[position]
                animation.studio = tvshow_studio[position]
                animation.poster = tvshow_poster[position]
                list.add(animation)
            }
            return list
        }
}