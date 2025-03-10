package hk.edu.hkbu.comp.comp4107.playground

import hk.edu.hkbu.comp.comp4107.playground.kennycheng.SelfIntro

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class SelfIntroduction {
    // Define the selfIntroduction method
    fun selfIntroduction(name: String) {
        println("Hello, $name!")
    }
}
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    val introduction = SelfIntroduction()

    // Call the selfIntroduction method
    introduction.selfIntroduction(name)

    SelfIntro().introduce()


    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}