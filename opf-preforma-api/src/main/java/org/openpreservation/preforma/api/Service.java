/**
 * 
 */
package org.openpreservation.preforma.api;

import java.net.URI;

/**
 * @author <a href="mailto:carl@openpreservation.org">Carl Wilson</a>
 *
 */
public interface Service {
    /**
     * @return the {@link URI} unique name for the service
     */
    public URI getName();

    /**
     * @return a {@link Resource} that describes this Service
     */
    public Resource getDescription();

    /**
     * @param toProcess
     * @return a copy of the Resource processed possibly enriched with a new
     *         metadata or resource representation.
     */
    public Resource processResource(final Resource toProcess);
}
