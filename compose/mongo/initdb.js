db.createUser(
    {
        user : "doodle",
        pwd : "12345",
        roles : [
            {
                role : "readWrite",
                db : "doodle_db"
            }
        ]
    }
)