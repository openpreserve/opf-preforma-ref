/**
 * 
 */
package org.openpreservation.preforma.api;

import java.util.Set;

import javax.ws.rs.NotFoundException;

/**
 * @author <a href="mailto:carl@openpreservation.org">Carl Wilson</a>
 *
 */
public interface Resource {
    /**
     * @return the {@link HexSHA1} id of this Resource, guaranteed to be found
     *         by id in the {@link Set} of {@link ByteSequence}s returned by
     *         {@link Resource#getRepresentations()}
     */
    public HexSHA1 getId();

    /**
     * @return the {@link HexSHA1} id of the Metadata item considered to be the
     *         root for this Resource, or {@link HexSHA1#NULL_SHA1} if no
     *         metadata resources are present.
     */
    public HexSHA1 getRootMetadataId();

    /**
     * @return The {@link Set} of {@link ByteSequence} representations of this
     *         Resource.
     */
    public Set<ByteSequence> getRepresentations();

    /**
     * @param requestedId
     *            the {@link HexSHA1} of the representation to return.
     * @return the {@link ByteSequence} matching the HexSHA1 value if found.
     * @throws NotFoundException
     *             if this resource doesn't hold a representation matching the
     *             requestedId.
     */
    public ByteSequence retrieveRepresentation(final HexSHA1 requestedId)
            throws NotFoundException;

    /**
     * @return The {@link Set} of {@link ByteSequence} metadata representations
     *         of this Resource.
     */
    public Set<ByteSequence> getMetadataRepresentations();

    /**
     * @param requestedId
     *            the {@link HexSHA1} of the metadata representation to return.
     * @return the {@link ByteSequence} matching the HexSHA1 value if found.
     * @throws NotFoundException
     *             if this resource doesn't hold a metadata representation
     *             matching the requestedId.
     */
    public ByteSequence retrieveMetadataRepresentation(final HexSHA1 requestedId)
            throws NotFoundException;
}
