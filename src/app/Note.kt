package app

class Note(title : String) {
    var title : String = title
        get() = field
        set(value) {
            if (field.isNotBlank()) {
                field = value
            }
        }
}