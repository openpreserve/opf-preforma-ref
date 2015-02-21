/**
 * 
 */
package org.openpreservation.preforma.api;

/**
 * The hex encoded SHA1 digest calculated from the ByteStream, a 40 character
 * hex string, i.e. [0-9a-f]{40}.
 * 
 * Includes useful and pretty self-expanatory constants
 * 
 * @author <a href="mailto:carl@openpreservation.org">Carl Wilson</a>
 * @version 0.0.1
 */
public interface HexSHA1 {
    /** The length of a valid hex encoded SHA1 digest string */
    public static final int HEX_SHA1_LENGTH = 40;
    /** Root string for hex string Java style regexs  */
    public static final String JAVA_HEX_REGEX_ROOT = "^\\s*([0-9a-fA-F]"; //$NON-NLS-1$
    /** RegEx for a SHA1 Hash string */
    public static final String HEX_SHA1_REGEX = JAVA_HEX_REGEX_ROOT + "{" //$NON-NLS-1$
            + HEX_SHA1_LENGTH + "})\\z"; //$NON-NLS-1$
    /** Hex SHA1 for a null stream */
    public static final String NULL_SHA1 = "da39a3ee5e6b4b0d3255bfef95601890afd80709"; //$NON-NLS-1$

    /**
     * @return A string in the Hex SHA1 format above.
     */
    public String getHexSHA1();
}
