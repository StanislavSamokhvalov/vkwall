data class Post(
    var id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val isFavorite: Boolean,
    val postponedId: Int,
)


fun main() {
    val post1 = Post(
        id = 0,
        ownerId = 2,
        fromId = 2,
        createdBy = 3,
        date = 420,
        text = "text y",
        replyOwnerId = 3,
        replyPostId = 5,
        friendsOnly = true,
        postType = "",
        signerId = 4,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        isFavorite = true,
        postponedId = 4,
    )
    val post2 = Post(
        id = 0,
        ownerId = 2,
        fromId = 2,
        createdBy = 3,
        date = 420,
        text = "text x",
        replyOwnerId = 3,
        replyPostId = 5,
        friendsOnly = true,
        postType = "",
        signerId = 4,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        isFavorite = true,
        postponedId = 4,
    )

    val service = WallService()
    service.add(post1)
    service.add(post2)
    service.update(post2)
    service.print()
}