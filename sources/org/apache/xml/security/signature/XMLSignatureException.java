package org.apache.xml.security.signature;

import org.apache.xml.security.exceptions.XMLSecurityException;

public class XMLSignatureException extends XMLSecurityException {
    public XMLSignatureException(String str, Object[] objArr, Exception exc) {
        super(str, objArr, exc);
    }

    public XMLSignatureException() {
    }

    public XMLSignatureException(String str) {
        super(str);
    }

    public XMLSignatureException(String str, Exception exc) {
        super(str, exc);
    }

    public XMLSignatureException(String str, Object[] objArr) {
        super(str, objArr);
    }
}
