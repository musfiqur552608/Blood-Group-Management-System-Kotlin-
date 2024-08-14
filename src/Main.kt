//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val system = BloodGroupManagementSystem()

    println("Welcome to Blood Group Management System")

    if(system.login()){
        println("Login successfull")
        system.mainMenu()
    }else{
        println("Login failed. Please try again")
    }
}