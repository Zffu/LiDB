package net.zffu.lidb.server.database;

import net.zffu.lidb.database.LIDatabase;
import net.zffu.lidb.database.table.LITable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The server implementation of the {@link net.zffu.lidb.database.LIDatabase}.
 * @since 1.0.0
 */
public class LiDB implements LIDatabase {

    private final LITable<?>[] tables;

    /**
     * <p>Creates a {@link LiDB} with the provided tables.</p>
     * @param tables the tables.
     */
    public LiDB(LITable<?>[] tables) {
        this.tables = tables;
    }

    /**
     * <p>Creates a {@link LiDB} with the provided table amount.</p>
     * @param tables the table amount.
     */
    public LiDB(int tables) {
        this.tables = new LITable<?>[tables];
    }

    @Override
    public @NotNull LITable<?>[] getTables() {
        return this.tables;
    }

    @Override
    public @Nullable <T> LITable<T> getTable(int index, @NotNull Class<T> clazz) {
        return (LITable<T>) this.tables[index];
    }
}
