package com.example.quickquiz

object Constants{

    const val USER_NAME: String = "user_name"
    const val Total_Questions: String = "total_question"
    const val Correct_Answers: String = "correct_answers"

    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val que1 = Questions(
            1,
            "Ilu sąsiadów ma Polska?",
            "5",
            "6",
            "7",
            "8",
            3
        )

        questionsList.add(que1)

        val que2 = Questions(
            2,
            "Która nazwa kąta nie wystepuje w literaturze?",
            "ostry",
            "rozwartokątny",
            "wklęsły",
            "wymierny",
            4
        )

        questionsList.add(que2)

        val que3 = Questions(
            3,
            "Co w języku polskim oznacz niemieckie 'Guten Morgen'?",
            "Dzień Dobry",
            "Dobrywieczór",
            "Dobranoc",
            "Dobrego nastroju ci życzę",
            1
        )

        questionsList.add(que3)

        val que4 = Questions(
            4,
            "Który z podanych pierwiastków jest gazem szlachetnym?",
            "Potas",
            "Hel",
            "Chlor",
            "Rad",
            2
        )

        questionsList.add(que4)

        val que5 = Questions(
            5,
            "Które z podanych zwierząt nie jest ssakiem?",
            "ryba",
            "Małpa",
            "Delfin",
            "Hipopotam",
            1
        )

        questionsList.add(que5)

        val que6 = Questions(
            6,
            "Jaki język programowania jest obecnie najczęściej używany?",
            "C++",
            "Java",
            "PHP",
            "Python",
            4
        )

        questionsList.add(que6)

        val que7 = Questions(
            7,
            "Która z tych gier jest FPS-em?",
            "CS-GO",
            "League of Legends",
            "World of Warcraft",
            "World of Tanks",
            1
        )

        questionsList.add(que7)

        val que8 = Questions(
            8,
            "Która z tych marek pochodzi z Japonii?",
            "BMW",
            "Mazda",
            "Mercedes",
            "Dodge",
            2
        )

        questionsList.add(que8)

        val que9 = Questions(
            9,
            "Kto jest aktualnym mistrzem F1",
            "Lewis Hamilton",
            "Max Verstappen",
            "Charles Leclerc",
            "Nyck De Vries",
            2
        )

        questionsList.add(que9)

        val que10 = Questions(
            10,
            "Która rzeka z podanych jest najdłuższa?",
            "Ren",
            "Dunaj",
            "Nil",
            "Wisła",
            3
        )

        questionsList.add(que10)

        val que11 = Questions(
            11,
            "Z jakiego kraju pochodzą Anime oraz Mangi?",
            "Chiny",
            "Korea",
            "Tajlandia",
            "Japonia",
            4
        )

        questionsList.add(que11)

        val que12 = Questions(
            12,
            "Który zespół muzyczny nagrał piosenkę 'Take on me'?",
            "A-ha",
            "UB40",
            "Scorpions",
            "ABBA",
            1
        )

        questionsList.add(que12)

        val que13 = Questions(
            13,
            "Jak nazywa się najbardziej popularny koreański BoysBand?",
            "BTS",
            "Enhypen",
            "BigBang",
            "INX",
            1
        )

        questionsList.add(que13)

        val que14 = Questions(
            14,
            "Kto sprowokował USA do udziału w II wojnie światowej?",
            "Niemcy",
            "Meksyk",
            "Japonia",
            "Chiny",
            3
        )

        questionsList.add(que14)

        val que15 = Questions(
            15,
            "Kto jest ulubionym artystą autora tego quizu?",
            "Wolgang Petry",
            "Michael Jackson",
            "Ewelina Lisowska",
            "Doda",
            1
        )

        questionsList.add(que15)

        val que16 = Questions(
            16,
            "Które z podanych wyrażeń jest źle napisane?",
            "z powrotem",
            "Ztąd",
            "Na pewno",
            "Minitygrysek",
            2
        )

        questionsList.add(que16)

        val que17 = Questions(
            17,
            "Jeżeli liczba 78 jest o 50% większa od liczby c, to",
            "c = 60",
            "c = 52",
            "c = 48",
            "c = 39",
            2
        )

        questionsList.add(que17)

        val que18 = Questions(
            18,
            "Kto jest aktualnie prezydentem Polski?",
            "Jarosław Kaczyński",
            "Bronisław Komorowski",
            "Mateusz Morawiecki",
            "Andrzej Duda",
            4
        )

        questionsList.add(que18)

        val que19 = Questions(
            19,
            "Jak nazywa się najstarsza gra planszowa ma świecie?",
            "Szachy",
            "Shogi",
            "Senet",
            "Młynek",
            3
        )

        questionsList.add(que19)

        val que20 = Questions(
            20,
            "Kim jest Magda Gessler?",
            "Piekarzem",
            "Premierem Sportu",
            "Kucharką",
            "Detektywem",
            3
        )

        questionsList.add(que20)

        return questionsList
    }

}