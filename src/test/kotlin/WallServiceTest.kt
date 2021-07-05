import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

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
        comments = Comments(
            count = 1,
            canPost = true,
            groupsCanPost = true,
            canClose = true,
            canOpen = true
        ),
        copyright = Copyright(
            id = 1,
            link = "link",
            name = "name",
            type = "type"
        ),
        likes = Likes(
            count = 1,
            canLike = true,
            userLikes = true,
            canPublish = true
        ),
        reposts = Reposts(
            count = 1,
            userReposted = true
        ),
        views = Views(
            count = 10
        ),
        postSource = PostSource(
            type = "type",
            platform = "platform",
            data = "data",
            url = "url"
        ),
        geo = Geo(
            type = "type",
            coordinates = "coordinates",
            place = Place(
                count = 10,
                title = "title",
                latitude = 10,
                longitude = 7,
                created = 8,
                icon = "icon",
                checkins = 5,
                updated = 9,
                type = 8,
                country = 9,
                city = 99,
                address = "address"
            )
        ),
        donut = Donut(
            isDonut = true,
            paid_duration = 10,
            placeHolder = PlaceHolder(),
            canPublishFreeCopy = true,
            editMode = "edit"
        ),
        attachments = null
    )

    val post2 = Post(
        id = 1,
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
        comments = Comments(
            count = 1,
            canPost = true,
            groupsCanPost = true,
            canClose = true,
            canOpen = true
        ),
        copyright = Copyright(
            id = 1,
            link = "link",
            name = "name",
            type = "type"
        ),
        likes = Likes(
            count = 1,
            canLike = true,
            userLikes = true,
            canPublish = true
        ),
        reposts = Reposts(
            count = 1,
            userReposted = true
        ),
        views = Views(
            count = 10
        ),
        postSource = PostSource(
            type = "type",
            platform = "platform",
            data = "data",
            url = "url"
        ),
        geo = Geo(
            type = "type",
            coordinates = "coordinates",
            place = Place(
                count = 10,
                title = "title",
                latitude = 10,
                longitude = 7,
                created = 8,
                icon = "icon",
                checkins = 5,
                updated = 9,
                type = 8,
                country = 9,
                city = 99,
                address = "address"
            )
        ),
        donut = Donut(
            isDonut = true,
            paid_duration = 10,
            placeHolder = PlaceHolder(),
            canPublishFreeCopy = true,
            editMode = "edit"
        ),
        attachments = null
    )

    val post3 = Post(
        id = 3,
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
        comments = Comments(
            count = 1,
            canPost = true,
            groupsCanPost = true,
            canClose = true,
            canOpen = true
        ),
        copyright = Copyright(
            id = 1,
            link = "link",
            name = "name",
            type = "type"
        ),
        likes = Likes(
            count = 1,
            canLike = true,
            userLikes = true,
            canPublish = true
        ),
        reposts = Reposts(
            count = 1,
            userReposted = true
        ),
        views = Views(
            count = 10
        ),
        postSource = PostSource(
            type = "type",
            platform = "platform",
            data = "data",
            url = "url"
        ),
        geo = Geo(
            type = "type",
            coordinates = "coordinates",
            place = Place(
                count = 10,
                title = "title",
                latitude = 10,
                longitude = 7,
                created = 8,
                icon = "icon",
                checkins = 5,
                updated = 9,
                type = 8,
                country = 9,
                city = 99,
                address = "address"
            )
        ),
        donut = Donut(
            isDonut = true,
            paid_duration = 10,
            placeHolder = PlaceHolder(),
            canPublishFreeCopy = true,
            editMode = "edit"
        ),
        attachments = null
    )

    @Test
    fun add() {
        val service = WallService()
        val original = service.add(post1)
        val result = post1.copy(id = 1)

        assertEquals(result, original)
    }

    @Test
    fun updateTrue() {
        val service = WallService()
        service.add(post1)
        val result = service.update(post2)
        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        val service = WallService()
        service.add(post1)
        val result = service.update(post3)
        assertFalse(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val service = WallService()
        val comment1 = Comment(
            ownerId = 1,
            postId = 2,
            fromGroup = 3,
            message = "message",
            replyToComment = 0,
            attachments = null,
            stickerId = 1,
            guid = "guid"
        )
        service.add(post1)
        service.createComment(comment1)
    }

    @Test
    fun createComment() {
        val service = WallService()
        val comment = Comment(
            ownerId = 1,
            postId = 1,
            fromGroup = 3,
            message = "message",
            replyToComment = 0,
            attachments = null,
            stickerId = 1,
            guid = "guid"
        )
        service.add(post1)
        val result = try {
            service.createComment(comment)
            true
        } catch (e: PostNotFoundException) {
            false
        }
        assertEquals(true, result)
    }
}