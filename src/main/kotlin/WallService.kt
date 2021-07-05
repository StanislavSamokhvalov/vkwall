class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()


    fun add(post: Post): Post {
        posts += post
        for ((index, post) in posts.withIndex()) {
            posts[index] = post.copy(id = index + 1)
        }
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index) in posts.withIndex()) {
            if (post.id == posts[index].id) {
                posts[index] = post.copy(ownerId = posts[index].ownerId, date = posts[index].date)
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment) {
        for ((index, post) in posts.withIndex()) {
            if (comment.postId == post.id) {
                comments += comment
                return
            }
        }
        throw PostNotFoundException("Поста с id:${comment.postId} не существует")
    }

    fun print() {
        for (post in posts) {
            println(post)
        }
    }


}



