package net.zffu.lidb.database.table;


import net.zffu.lidb.types.DataType;

import java.util.HashMap;
/**
 * <p>A table in an {@link net.zffu.lidb.database.LIDatabase}.</p>
 * @param <P> the primary key type in thr table.
 * @since 1.0.0
 */
public class LITable<P> {

    /**
     * <p>The primary key data type.</p>
     */
    private DataType<P> primaryKey;

    /**
     * <p>The entries contained in the table.</p>
     */
    private HashMap<P, Object[]> entries = new HashMap<>();

    /**
     * <p>Constructs a new {@link LITable}.</p>
     * @param primaryKey the primary key data type, is used for conversion.
     */
    public LITable(DataType<P> primaryKey) {
        this.primaryKey = primaryKey;
    }

}
