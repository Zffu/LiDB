package net.zffu.lidb.server.database;

import net.zffu.lidb.database.LIDatabase;
import net.zffu.lidb.database.table.LITable;
import org.jetbrains.annotations.Nullable;

/**
 * The server implementation of the {@link net.zffu.lidb.database.LIDatabase}.
 * @since 1.0.0
 */
public class LiDB extends LIDatabase {

    /**
     * <p>Creates a new {@link LiDB} with the provided tables.</p>
     * @param tables the tables.
     */
    public LiDB(@Nullable LITable<?>[] tables) {
        this.tables = tables;
    }

    /**
     * <p>Creates a new {@link LiDB} with the provided table amount.</p>
     * @param tables the table amount.
     */
    public LiDB(int tables) {
        this.tables = new LITable[tables];
    }

}
