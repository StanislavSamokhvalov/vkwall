import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService()
        val post1 = Post(
            id = 0,
            ownerId = 2,
            fromId = 2,
            createdBy = 3,
            date = 420,
            text = "text",
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
        val original = service.add(post1)
        val result = post1.copy(id = 1)

        assertEquals(result, original)
    }

    @Test
    fun updateTrue() {
        val service = WallService()
        val post1 = Post(
            id = 0,
            ownerId = 2,
            fromId = 2,
            createdBy = 3,
            date = 420,
            text = "text",
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
        val post2 = Post(id = 1,
            ownerId = 2,
            fromId = 2,
            createdBy = 3,
            date = 420,
            text = "text",
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
            postponedId = 4,)

        service.add(post1)
        val result = service.update(post2)
        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        val service = WallService()
        val post1 = Post(
            id = 0,
            ownerId = 2,
            fromId = 2,
            createdBy = 3,
            date = 420,
            text = "text",
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
        val post2 = Post(id = 3,
            ownerId = 2,
            fromId = 2,
            createdBy = 3,
            date = 420,
            text = "text",
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
            postponedId = 4,)

        service.add(post1)
        val result = service.update(post2)
        assertFalse(result)
    }
}