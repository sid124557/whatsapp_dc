package org.apache.xml.security.transforms.implementations;

import java.io.OutputStream;
import org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.transforms.TransformSpi;

public class TransformC14N extends TransformSpi {
    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream, Transform transform) {
        Canonicalizer20010315OmitComments canonicalizer20010315OmitComments = new Canonicalizer20010315OmitComments();
        if (outputStream != null) {
            canonicalizer20010315OmitComments.n = outputStream;
        }
        XMLSignatureInput xMLSignatureInput2 = new XMLSignatureInput(canonicalizer20010315OmitComments.b(xMLSignatureInput));
        if (outputStream != null) {
            xMLSignatureInput2.k = outputStream;
        }
        return xMLSignatureInput2;
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform) {
        return a(xMLSignatureInput, (OutputStream) null, transform);
    }
}
