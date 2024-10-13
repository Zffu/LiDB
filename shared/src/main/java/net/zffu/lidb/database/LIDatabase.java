package net.zffu.lidb.database;

import net.zffu.lidb.database.table.LITable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * <p>A database instance represented in the LiDB library.</p>
 * @since 1.0.0
 */
public interface LIDatabase {

    /**
     * <p>Gets all of the tables contained in the database.</p>
     * @return the tables as an array.
     */
    @NotNull LITable<?>[] getTables();

    /**
     * <p>Gets the table located at the provided index.</p>
     * @param index the index.
     * @param <T> the data type of the primary key of said table.
     * @return the table.
     */
    @Nullable <T> LITable<T> getTable(int index, @NotNull Class<T> clazz);

}
