package net.zffu.lidb.database.table;

import net.zffu.lidb.types.DataType;
import org.jetbrains.annotations.NotNull;

/**
 * <p>A table in an {@link net.zffu.lidb.database.LIDatabase}.</p>
 * @param <P> the primary key type in thr table.
 * @since 1.0.0
 */
public interface LITable<P> {

    /**
     * <p>Gets the primary key data type of the table.</p>
     * @return the data type of the table.
     */
    @NotNull DataType<P> getPrimaryDataType();

    /**
     * <p>Adds an entry inside the database.</p>
     * @param key the primary key.
     * @param objects the objects as a list.
     */
    void addEntry(@NotNull P key, @NotNull Object... objects);

    /**
     * <p>Removes an entry inside the database if it exists.</p>
     * @param key the primary key.
     */
    void removeEntry(@NotNull P key);

}
