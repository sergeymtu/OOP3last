package ru.netology


fun main() {

    val post1 = Post(id = 1, text = "Первый пост")
    val post2 = Post(id = 2, text = "Второй пост")
    val post3 = Post(id = 1, text = "Третий пост") //id совпадает
    val post4 = Post(id = 3, text = "Четвертый пост")

    val wall = WallService()

    wall.add(post1)
    wall.add(post2)
    wall.add(post3)
    wall.add(post4)
    wall.update(post3)

    wall.printPosts()

}

