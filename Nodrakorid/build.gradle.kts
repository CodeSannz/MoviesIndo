// use an integer for version numbers
version = 3

cloudstream {
    // All of these properties are optional, you can safely remove them

    description = "Nodrakorid"
    language = "id"
    authors = listOf("CodeSannz")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "AsianDrama",
        "TvSeries",
        "Movie",
    )

    iconUrl = "https://github.com/CodeSannz/IndoMovie/raw/refs/heads/master/Nodrakorid/icon.png"
}
