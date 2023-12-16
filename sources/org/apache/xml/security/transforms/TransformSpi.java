package org.apache.xml.security.transforms;

import X.C18320x8;
import java.io.OutputStream;
import org.apache.xml.security.signature.XMLSignatureInput;

public abstract class TransformSpi {
    public Transform a = null;

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream, Transform transform) {
        return a(xMLSignatureInput, transform);
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform) {
        try {
            ((TransformSpi) getClass().newInstance()).a = transform;
            throw C18320x8.A0m();
        } catch (InstantiationException e) {
            throw new TransformationException("", (Exception) e);
        } catch (IllegalAccessException e2) {
            throw new TransformationException("", (Exception) e2);
        }
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput) {
        throw C18320x8.A0m();
    }

    public void a(Transform transform) {
        this.a = transform;
    }
}
