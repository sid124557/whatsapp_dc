package org.apache.xml.security.transforms.implementations;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass6C7;
import X.AnonymousClass6C8;
import X.AnonymousClass6C9;
import X.AnonymousClass6CA;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.transforms.TransformSpi;
import org.apache.xml.security.transforms.TransformationException;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Element;

public class TransformXSLT extends TransformSpi {
    public static Log b;
    public static Class c;
    public static Class d;
    public static Class e;

    static {
        try {
            e = Class.forName("javax.xml.XMLConstants");
        } catch (Exception unused) {
        }
        Class a = a("org.apache.xml.security.transforms.implementations.TransformXSLT");
        c = a;
        b = LogFactory.getLog(a.getName());
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream, Transform transform) {
        if (e != null) {
            try {
                Element a = XMLUtils.a(transform.k.getFirstChild(), "http://www.w3.org/1999/XSL/Transform", "stylesheet", 0);
                if (a != null) {
                    TransformerFactory newInstance = TransformerFactory.newInstance();
                    Class<?> cls = newInstance.getClass();
                    Class[] clsArr = new Class[2];
                    Class cls2 = d;
                    if (cls2 == null) {
                        cls2 = a("java.lang.String");
                        d = cls2;
                    }
                    clsArr[0] = cls2;
                    AnonymousClass001.A0r(cls, Boolean.TYPE, "setFeature", clsArr, 1).invoke(newInstance, new Object[]{"http://javax.xml.XMLConstants/feature/secure-processing", Boolean.TRUE});
                    StreamSource streamSource = new StreamSource(AnonymousClass0x9.A0d(xMLSignatureInput.e()));
                    ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
                    newInstance.newTransformer().transform(new DOMSource(a), new StreamResult(A0e));
                    Transformer newTransformer = newInstance.newTransformer(new StreamSource(AnonymousClass0x9.A0d(A0e.toByteArray())));
                    try {
                        newTransformer.setOutputProperty("{http://xml.apache.org/xalan}line-separator", "\n");
                    } catch (Exception e2) {
                        Log log = b;
                        StringBuffer A0X = AnonymousClass6CA.A0X();
                        A0X.append("Unable to set Xalan line-separator property: ");
                        log.warn(AnonymousClass6C9.A0f(e2.getMessage(), A0X));
                    }
                    if (outputStream == null) {
                        ByteArrayOutputStream A0e2 = AnonymousClass0x9.A0e();
                        newTransformer.transform(streamSource, new StreamResult(A0e2));
                        return new XMLSignatureInput(A0e2.toByteArray());
                    }
                    newTransformer.transform(streamSource, new StreamResult(outputStream));
                    XMLSignatureInput xMLSignatureInput2 = new XMLSignatureInput((byte[]) null);
                    xMLSignatureInput2.k = outputStream;
                    return xMLSignatureInput2;
                }
                throw new TransformationException("xml.WrongContent", new Object[]{"xslt:stylesheet", "Transform"});
            } catch (XMLSecurityException e3) {
                throw AnonymousClass6C8.A0q(e3);
            } catch (TransformerConfigurationException e4) {
                throw AnonymousClass6C8.A0q(e4);
            } catch (TransformerException e5) {
                throw AnonymousClass6C8.A0q(e5);
            } catch (NoSuchMethodException e6) {
                throw AnonymousClass6C8.A0q(e6);
            } catch (IllegalAccessException e7) {
                throw AnonymousClass6C8.A0q(e7);
            } catch (InvocationTargetException e8) {
                throw AnonymousClass6C8.A0q(e8);
            }
        } else {
            throw new TransformationException("generic.EmptyMessage", new Object[]{"SECURE_PROCESSING_FEATURE not supported"});
        }
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform) {
        return a(xMLSignatureInput, (OutputStream) null, transform);
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw AnonymousClass6C7.A0r(e2);
        }
    }
}
