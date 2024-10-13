package net.zffu.lidb.database;

import net.zffu.lidb.database.table.LITable;

/**
 * <p>A database instance represented in the LiDB library.</p>
 * @since 1.0.0
 */
public class LIDatabase {

    private LITable[] tables;

    /**
     * <p>Creates a new {@link LIDatabase} with predefined tables.</p>
     * @param tables the tables.
     */
    public LIDatabase(LITable[] tables) {
        this.tables = tables;
    }

}
