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

    val comment = Comment(
        ownerId = 1,
        postId = 2,
        fromGroup = 3,
        message = "message",
        replyToComment = 0,
        attachments = null,
        stickerId = 1,
        guid = "guid"
    )

    val service = WallService()
    service.add(post1)
    service.add(post2)
    service.update(post2)
    service.createComment(comment)
    service.print()
}
