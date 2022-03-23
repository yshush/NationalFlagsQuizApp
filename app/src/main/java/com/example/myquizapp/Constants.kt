package com.example.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        // 1
        val que1 = Question(
            1, "이 국기는 어느 나라의 국기입니까?",
            R.drawable.ic_flag_of_argentina,
            "아르헨티나", "호주",
            "아르메니아", "오스트리아", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "이 국기는 어느 나라의 국기입니까?",
            R.drawable.ic_flag_of_australia,
            "앙골라", "오스트리아",
            "호주", "아르메니아", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "이 국기는 어느 나라의 국기입니까?",
            R.drawable.ic_flag_of_brazil,
            "벨라루스", "벨리제",
            "브루나이", "브라질", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "이 국기는 어느 나라의 국기입니까?",
            R.drawable.ic_flag_of_belgium,
            "바하마", "벨기에",
            "바르도스", "벨리즈", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "이 국기는 어느 나라의 국기입니까?",
            R.drawable.ic_flag_of_fiji,
            "가본", "프랑스",
            "피지", "핀란드", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "이 국기는 어느 나라의 국기입니까?",
            R.drawable.ic_flag_of_germany,
            "독일", "조지아",
            "그리스", "러시아", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "이 국기는 어느 나라의 국기입니까?",
            R.drawable.ic_flag_of_denmark,
            "도미니카 공화국", "이집트",
            "덴마크", "에티오피아", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "이 국기는 어느 나라의 국기입니까?",
            R.drawable.ic_flag_of_india,
            "아일랜드", "이란",
            "헝가리", "인도", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "이 국기는 어느 나라의 국기입니까?",
            R.drawable.ic_flag_of_new_zealand,
            "호주", "뉴질랜드",
            "투발루", "미국", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "이 국기는 어느 나라의 국기입니까?",
            R.drawable.ic_flag_of_kuwait,
            "쿠웨이트", "한국",
            "수단", "팔레스타인", 1
        )

        questionsList.add(que10)

        return questionsList
    }
    // END
}
// END