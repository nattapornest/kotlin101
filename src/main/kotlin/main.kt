fun main(args: Array<String>) {
    //ฮิบโป
    var myhip = Hippo()
    myhip.eat()
    myhip.roam()
    myhip.makeNoise()
    myhip.sleep()

    println("----------------")

    //สร้างแมว
    var mycat = Cat()
    mycat.eat()
    mycat.roam()
    mycat.makeNoise()
    mycat.sleep()
    println("----------------")
    //Dog

    var  mydog = Dog()
    mydog.eat()
    mydog.roam()
    mydog.makeNoise()
    mydog.sleep()
    println("----------------")
}

//คลาสใหญ่ชื่อ animal
open class Animal{
    open val image = ""
    open val food = ""
    open val habitat = "" //ที่อยู่อาศัย
    var hunger = 10  //กินเยอะไหม

    open fun makeNoise () {
        println("The Animal is making a noise")
    }
    open fun eat () {
        println("The Animal is eating")
    }
    open fun roam(){
        println("The Animal is เดิน")
    }
    fun sleep(){
        println("The Animal is sleeping")
    }
}

class Hippo : Animal(){
    override val image: String
        get() = "hippo.jpg"
    override val food: String
        get() = "หญ้า"
    override val habitat: String
        get() = "น้ำ"

    override fun makeNoise() {
        println("ฮิบโป ร้องฮิบ ฮิบ")
    }

    override fun eat() {
        println("Hippo est $food")
    }
}

class Cat : Animal(){
    override val image = "cat.jpg"
    override val food = "rat"
    override val habitat = "Home"

    override fun makeNoise() {
        println("เหมียว เหมียว")
    }

    override fun eat() {
        println("The Cat is eating $food")
    }
}

class Dog : Animal(){
    override val image: String
        get() = "Dog.jpg"
    override val food: String
        get() = "อาหารสุนัข"
    override val habitat: String
        get() = "บ้านสุนัข"
    override fun makeNoise() {
        println("สุขนัขร้อง โฮ่ง โอ่ง")
    }

    override fun eat() {
        println("สุขนัขกิน $food")
    }
}
