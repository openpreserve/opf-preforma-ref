/**
 * 
 */
package org.openpreservation.preforma.api;

import java.net.URI;
import java.util.Set;

import javax.ws.rs.core.MediaType;

/**
 * Interface for a sequence of Bytes identified by it's SHA1 Hash value.
 * 
 * @author <a href="mailto:carl@openpreservation.org">Carl Wilson</a>
 */
public interface ByteSequence {
    /**
     * @return the {@link HexSHA1} id of this ByteSequence
     */
    public HexSHA1 getId();

    /**
     * @return The length of the ByteSequence in bytes, will be >= 0.
     */
    public long getLength();

    /**
     * @return a possible value of the MIME type of the ByteSequence
     */
    public MediaType getMediaType();

    /**
     * @return a {@link Set} of possible, but unverified locations for this
     *         ByteSequence
     */
    public Set<URI> getLocations();
}
