package com.techmania.quizapp

object Constants {

    const val USER_NAME :String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions() : ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,"What country does this flag belong to?",
            R.drawable.a1,
            "Argentina","Australia", "Brazil", "Nigeria",
            3
        )
        questionsList.add(que1)

//2
        val que2 = Question(
            1, "What country does this flag belong to?",
            R.drawable.a2,
            "Austria", "Algeria", "Bhutan", "Nepal",
            2
        )

        questionsList.add(que2)


        //3
        val que3 = Question(
            1, "What country does this flag belong to?",
            R.drawable.a3,
            "Pakistan", "Afghanistan", "Iran", "Nigeria",
            4
        )

        questionsList.add(que3)

        //4
        val que4 = Question(
            1, "What country does this flag belong to?",
            R.drawable.a4,
            "Australia", "USA", "Liberia", "Iraq",
            4
        )

        questionsList.add(que4)

        //5
        val que5 = Question(
            1, "What country does this flag belong to?",
            R.drawable.a5,
            "Australia", "USA", "Ireland", "Iraq",
            3
        )

        questionsList.add(que5)

        //6
        val que6 = Question(
            1, "What country does this flag belong to?",
            R.drawable.a6,
            "Iran", "Ghana", "Liberia", "Iraq",
            2
        )

        questionsList.add(que6)

        //7
        val que7 = Question(
            1, "What country does this flag belong to?",
            R.drawable.a7,
            "Germany", "USA", "Liberia", "Iraq",
            1
        )

        questionsList.add(que7)

        //8
        val que8 = Question(
            1, "What country does this flag belong to?",
            R.drawable.a8,
            "Australia", "Pakistan", "Bhutan", "Iraq",
            3
        )

        questionsList.add(que8)

        //9
        val que9 = Question(
            1, "What country does this flag belong to?",
            R.drawable.a9,
            "Iran", "Argentina", "Sweden", "Iran",
            2
        )

        questionsList.add(que9)



        return questionsList
    }
}