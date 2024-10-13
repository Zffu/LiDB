package net.zffu.lidb.server.database.table;

import net.zffu.lidb.database.table.LITable;
import net.zffu.lidb.types.DataType;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

/**
 * <p>The server implementation of a {@link LITable}</p>
 * @param <K> the primary key data type.
 */
public class LiTable<K> implements LITable<K> {

    private DataType<K> primaryKey;

    private HashMap<K, Object[]> entries;

    /**
     * <p>Creates a {@link LiTable} with the provided primary key data type.</p>
     * @param primaryKey the primary key data type.
     */
    public LiTable(DataType<K> primaryKey) {
        this.primaryKey = primaryKey;
        this.entries = new HashMap<>();
    }

    /**
     * <p>Creates {@link LiTable} with the provided primary key data type and entries.</p>
     * @param primaryKey the primary key data type.
     * @param entries the entries
     */
    public LiTable(DataType<K> primaryKey, HashMap<K, Object[]> entries) {
        this.primaryKey = primaryKey;
        this.entries = entries;
    }

    public @NotNull DataType<K> getPrimaryDataType() {
        return this.primaryKey;
    }

    public void addEntry(@NotNull K key, @NotNull Object... objects) {
        this.entries.put(key, objects);
    }

    public void removeEntry(@NotNull K key) {
        this.entries.remove(key);
    }
}
