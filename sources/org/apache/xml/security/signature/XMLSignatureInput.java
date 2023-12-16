package org.apache.xml.security.signature;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass6C7;
import X.AnonymousClass6C9;
import X.AnonymousClass6CA;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.implementations.Canonicalizer11_OmitComments;
import org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments;
import org.apache.xml.security.c14n.implementations.CanonicalizerBase;
import org.apache.xml.security.exceptions.XMLSecurityRuntimeException;
import org.apache.xml.security.utils.IgnoreAllErrorHandler;
import org.apache.xml.security.utils.JavaUtils;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class XMLSignatureInput implements Cloneable {
    public static Log a;
    public static Class l;
    public InputStream b;
    public Set c;
    public Node d;
    public Node e;
    public boolean f;
    public boolean g;
    public byte[] h;
    public List i;
    public boolean j;
    public OutputStream k;
    public String m;
    public String n;

    static {
        Class c2 = c("org.apache.xml.security.signature.XMLSignatureInput");
        l = c2;
        a = LogFactory.getLog(c2.getName());
    }

    public void a(OutputStream outputStream, boolean z) {
        CanonicalizerBase canonicalizer20010315OmitComments;
        if (outputStream != this.k) {
            byte[] bArr = this.h;
            if (bArr != null) {
                outputStream.write(bArr);
                return;
            }
            InputStream inputStream = this.b;
            if (inputStream == null) {
                if (z) {
                    canonicalizer20010315OmitComments = new Canonicalizer11_OmitComments();
                } else {
                    canonicalizer20010315OmitComments = new Canonicalizer20010315OmitComments();
                }
                canonicalizer20010315OmitComments.n = outputStream;
                canonicalizer20010315OmitComments.b(this);
            } else if (inputStream instanceof FileInputStream) {
                byte[] bArr2 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
                while (true) {
                    int read = this.b.read(bArr2);
                    if (read != -1) {
                        outputStream.write(bArr2, 0, read);
                    } else {
                        return;
                    }
                }
            } else {
                InputStream o = o();
                byte[] bArr3 = this.h;
                if (bArr3 != null) {
                    outputStream.write(bArr3, 0, bArr3.length);
                    return;
                }
                o.reset();
                byte[] bArr4 = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                while (true) {
                    int read2 = o.read(bArr4);
                    if (read2 > 0) {
                        outputStream.write(bArr4, 0, read2);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public Set b(boolean z) {
        Node node;
        Set set = this.c;
        if (set != null) {
            return set;
        }
        if (this.b == null && (node = this.d) != null) {
            if (z) {
                XMLUtils.a(XMLUtils.b(node));
            }
            HashSet A0K = AnonymousClass002.A0K();
            this.c = A0K;
            XMLUtils.a(this.d, (Set) A0K, this.e, this.f);
            return this.c;
        } else if (h()) {
            q();
            HashSet A0K2 = AnonymousClass002.A0K();
            XMLUtils.b(this.d, A0K2, (Node) null, false);
            return A0K2;
        } else {
            throw AnonymousClass002.A0E("getNodeSet() called but no input data present");
        }
    }

    public void d(boolean z) {
        this.g = z;
    }

    public byte[] e() {
        byte[] bArr = this.h;
        if (bArr == null) {
            InputStream o = o();
            if (o != null) {
                bArr = this.h;
                if (bArr == null) {
                    o.reset();
                    bArr = JavaUtils.a(o);
                }
            } else {
                bArr = new Canonicalizer20010315OmitComments().b(this);
            }
            this.h = bArr;
        }
        return bArr;
    }

    public boolean f() {
        if ((this.b != null || this.c == null) && !this.g) {
            return false;
        }
        return true;
    }

    public boolean g() {
        if (this.b != null || this.d == null || this.c != null || this.g) {
            return false;
        }
        return true;
    }

    public boolean h() {
        if ((this.b != null || this.h != null) && this.c == null && this.d == null) {
            return true;
        }
        return false;
    }

    public boolean i() {
        return AnonymousClass000.A1W(this.k);
    }

    public boolean j() {
        if (this.h != null && this.c == null && this.d == null) {
            return true;
        }
        return false;
    }

    public String k() {
        return this.n;
    }

    public Node l() {
        return this.e;
    }

    public Node m() {
        return this.d;
    }

    public boolean n() {
        return this.f;
    }

    public InputStream o() {
        InputStream inputStream = this.b;
        if (!(inputStream instanceof ByteArrayInputStream)) {
            byte[] bArr = this.h;
            if (bArr == null) {
                if (inputStream == null) {
                    return null;
                }
                if (inputStream.markSupported()) {
                    a.info("Mark Suported but not used as reset");
                }
                this.h = JavaUtils.a(this.b);
                this.b.close();
                bArr = this.h;
            }
            ByteArrayInputStream A0d = AnonymousClass0x9.A0d(bArr);
            this.b = A0d;
            return A0d;
        } else if (inputStream.markSupported()) {
            return this.b;
        } else {
            StringBuffer A0X = AnonymousClass6CA.A0X();
            A0X.append("Accepted as Markable but not truly been");
            A0X.append(this.b);
            throw AnonymousClass6C7.A0e(A0X);
        }
    }

    public List p() {
        return this.i;
    }

    public String toString() {
        StringBuffer A0X;
        String str;
        if (f()) {
            A0X = AnonymousClass6CA.A0X();
            A0X.append("XMLSignatureInput/NodeSet/");
            A0X.append(this.c.size());
            str = " nodes/";
        } else if (g()) {
            A0X = AnonymousClass6CA.A0X();
            A0X.append("XMLSignatureInput/Element/");
            A0X.append(this.d);
            A0X.append(" exclude ");
            A0X.append(this.e);
            A0X.append(" comments:");
            A0X.append(this.f);
            str = "/";
        } else {
            try {
                StringBuffer A0X2 = AnonymousClass6CA.A0X();
                A0X2.append("XMLSignatureInput/OctetStream/");
                A0X2.append(e().length);
                A0X2.append(" octets/");
                A0X2.append(this.n);
                return A0X2.toString();
            } catch (IOException | CanonicalizationException unused) {
                return AnonymousClass6C9.A0f(this.n, AnonymousClass6C9.A0i("XMLSignatureInput/OctetStream//"));
            }
        }
        A0X.append(str);
        return AnonymousClass6C9.A0f(this.n, A0X);
    }

    public XMLSignatureInput(InputStream inputStream) {
        AnonymousClass6C7.A1S(this);
        this.b = inputStream;
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw AnonymousClass6C7.A0r(e2);
        }
    }

    public void q() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setValidating(false);
        newInstance.setNamespaceAware(true);
        DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
        try {
            newDocumentBuilder.setErrorHandler(new IgnoreAllErrorHandler());
            this.d = newDocumentBuilder.parse(c());
        } catch (SAXException unused) {
            ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
            A0e.write("<container>".getBytes());
            A0e.write(e());
            A0e.write("</container>".getBytes());
            this.d = newDocumentBuilder.parse(AnonymousClass0x9.A0d(A0e.toByteArray())).getDocumentElement().getFirstChild().getFirstChild();
        }
        this.b = null;
        this.h = null;
    }

    public XMLSignatureInput(Node node) {
        AnonymousClass6C7.A1S(this);
        this.d = node;
    }

    public boolean a() {
        return this.j;
    }

    public Set b() {
        return b(false);
    }

    public InputStream c() {
        InputStream inputStream = this.b;
        if (!(inputStream instanceof FileInputStream)) {
            return o();
        }
        return inputStream;
    }

    public InputStream d() {
        return this.b;
    }

    public XMLSignatureInput(byte[] bArr) {
        AnonymousClass6C7.A1S(this);
        this.h = bArr;
    }

    public void a(Node node) {
        this.e = node;
    }

    public void b(OutputStream outputStream) {
        this.k = outputStream;
    }

    public void c(boolean z) {
        this.f = z;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public void b(String str) {
        this.n = str;
    }

    public void a(String str) {
        this.m = str;
    }

    public void a(NodeFilter nodeFilter) {
        if (h()) {
            try {
                q();
            } catch (Exception e2) {
                throw new XMLSecurityRuntimeException("signature.XMLSignatureInput.nodesetReference", e2);
            }
        }
        this.i.add(nodeFilter);
    }

    public void a(OutputStream outputStream) {
        a(outputStream, false);
    }
}
