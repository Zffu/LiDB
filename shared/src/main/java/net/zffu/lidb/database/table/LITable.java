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

}
