interface Attachment {
    val type: String
}

class Attachments {
    private var attachments = emptyArray<Attachment>()

    fun add(attachment: Attachment): Attachment {
        attachments += attachment
        return attachments.last()
    }
}


class Photo(
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val date: Int,
    val sizes: Array<Sizes>,
    val width: Int,
    val height: Int
) {
    class Sizes(
        val type: String,
        val url: String,
        val width: Int,
        val height: Int

    )

}

class PhotoAttachment(
    override val type: String = "photo",
    val photo: Photo
) : Attachment

class Page(
    val id: Int,
    val groupId: Int,
    val creatorId: Int,
    val title: String,
    val currentUserCanEdit: Boolean,
    val currentUserCanEditAccess: Boolean,
    val whoCanView: Int,
    val whoCanEdit: Int,
    val edited: Int,
    val created: Int,
    val editorId: Int,
    val views: Int,
    val parent: String,
    val parent2: String,
    val source: String,
    val html: String,
    val viewUrl: String
)

class PageAttachment(
    override val type: String = "page",
    val page: Page
) : Attachment

class Document(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val size: Int,
    val ext: String,
    val url: String,
    val date: Int,
    val type: Int
)

class DocumentAttachment(
    override val type: String = "document",
    val document: Document
) : Attachment

class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val lyricsId: String,
    val albumId: Int,
    val genreId: Int,
    val date: Int,
    val noSearch: Int,
    val isHq: Int
)

class AudioAttachment(
    override val type: String = "audio",
    val audio: Audio
) : Attachment

class Note(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val text: String,
    val date: Int,
    val comments: Int,
    val readComments: Int,
    val viewUrl: String,
    val privacyView: String,
    val privacyComment: String,
    val canComment: Int,
    val textWiki: String
)

class NoteAttachment(
    override val type: String = "note",
    val note: Note
) : Attachment