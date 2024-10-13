package net.zffu.lidb.types;

/**
 * <p>A data type supported by the database.</p>
 * @param <K> the java data type equivalent.
 */
public interface DataType<K> {

    /**
     * <p>Converts the bits equivalent to the output data type.</p>
     * @param i the bits equivalent of the data type.
     * @return the converted object as K.
     */
    K convert(int i);

    /**
     * <p>Converts the original data into bits.</p>
     * @param k the original data.
     * @return the bits as an int.
     */
    int toBits(K k);

}
