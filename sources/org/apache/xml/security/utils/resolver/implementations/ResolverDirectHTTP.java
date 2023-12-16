package org.apache.xml.security.utils.resolver.implementations;

import X.AnonymousClass6C7;
import X.AnonymousClass6CA;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.utils.resolver.ResourceResolverSpi;
import org.apache.xml.utils.URI;
import org.w3c.dom.Attr;

public class ResolverDirectHTTP extends ResourceResolverSpi {
    public static Log d;
    public static Class e;
    public static final String[] f = {"http.proxy.host", "http.proxy.port", "http.proxy.username", "http.proxy.password", "http.basic.username", "http.basic.password"};

    public boolean b(Attr attr, String str) {
        Log log;
        String str2;
        if (attr == null) {
            log = d;
            str2 = "quick fail, uri == null";
        } else {
            String nodeValue = attr.getNodeValue();
            if (nodeValue.equals("") || nodeValue.charAt(0) == '#') {
                log = d;
                str2 = "quick fail for empty URIs and local ones";
            } else {
                if (d.isDebugEnabled()) {
                    AnonymousClass6C7.A1H("I was asked whether I can resolve ", nodeValue, AnonymousClass6CA.A0X(), d);
                }
                if (!nodeValue.startsWith("http:") && (str == null || !str.startsWith("http:"))) {
                    if (d.isDebugEnabled()) {
                        AnonymousClass6C7.A1H("I state that I can't resolve ", nodeValue, AnonymousClass6CA.A0X(), d);
                        return false;
                    }
                    return false;
                } else if (!d.isDebugEnabled()) {
                    return true;
                } else {
                    AnonymousClass6C7.A1H("I state that I can resolve ", nodeValue, AnonymousClass6CA.A0X(), d);
                    return true;
                }
            }
        }
        log.debug(str2);
        return false;
    }

    static {
        Class c = c("org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP");
        e = c;
        d = LogFactory.getLog(c.getName());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r11 == null) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010b A[Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }, LOOP:0: B:34:0x0105->B:36:0x010b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0111 A[EDGE_INSN: B:48:0x0111->B:37:0x0111 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.xml.security.signature.XMLSignatureInput a(org.w3c.dom.Attr r21, java.lang.String r22) {
        /*
            r20 = this;
            java.lang.String r4 = "generic.EmptyMessage"
            r19 = r21
            r5 = r22
            java.lang.String[] r18 = f     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            r0 = 0
            r0 = r18[r0]     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            r1 = r20
            java.lang.String r12 = r1.a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            r0 = 1
            r0 = r18[r0]     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r11 = r1.a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            if (r12 == 0) goto L_0x001e
            r17 = 1
            if (r11 != 0) goto L_0x0020
        L_0x001e:
            r17 = 0
        L_0x0020:
            java.lang.String r13 = ":"
            java.lang.String r10 = "http.proxyPort"
            java.lang.String r9 = "http.proxyHost"
            java.lang.String r8 = "http.proxySet"
            if (r17 == 0) goto L_0x0063
            org.apache.commons.logging.Log r0 = d     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            if (r0 == 0) goto L_0x0043
            org.apache.commons.logging.Log r3 = d     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.StringBuffer r2 = X.AnonymousClass6CA.A0X()     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r0 = "Use of HTTP proxy enabled: "
            r2.append(r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            r2.append(r12)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            X.AnonymousClass6C7.A1H(r13, r11, r2, r3)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
        L_0x0043:
            java.lang.String r7 = java.lang.System.getProperty(r8)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r6 = java.lang.System.getProperty(r9)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r3 = java.lang.System.getProperty(r10)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r0 = "true"
            java.lang.System.setProperty(r8, r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.System.setProperty(r9, r12)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.System.setProperty(r10, r11)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            if (r7 == 0) goto L_0x0066
            if (r6 == 0) goto L_0x0066
            r16 = 1
            if (r3 != 0) goto L_0x0068
            goto L_0x0066
        L_0x0063:
            r7 = 0
            r6 = 0
            r3 = 0
        L_0x0066:
            r16 = 0
        L_0x0068:
            java.lang.String r0 = r19.getNodeValue()     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            org.apache.xml.utils.URI r11 = r1.a((java.lang.String) r0, (java.lang.String) r5)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            org.apache.xml.utils.URI r2 = new org.apache.xml.utils.URI     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            r2.<init>(r11)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            r0 = 0
            r2.setFragment(r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r0 = r2.toString()     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.net.URL r14 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            r14.<init>(r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.net.URLConnection r12 = r14.openConnection()     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            r0 = 2
            r0 = r18[r0]     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r15 = r1.a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            r0 = 3
            r0 = r18[r0]     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r2 = r1.a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            if (r15 == 0) goto L_0x00ad
            if (r2 == 0) goto L_0x00ad
            java.lang.StringBuffer r0 = X.AnonymousClass6C9.A0i(r15)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r0 = X.AnonymousClass6C7.A0l(r13, r2, r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            byte[] r0 = r0.getBytes()     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r2 = org.apache.xml.security.utils.Base64.b((byte[]) r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r0 = "Proxy-Authorization"
            r12.setRequestProperty(r0, r2)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
        L_0x00ad:
            java.lang.String r0 = "WWW-Authenticate"
            java.lang.String r2 = r12.getHeaderField(r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            if (r2 == 0) goto L_0x00f2
            java.lang.String r0 = "Basic"
            boolean r0 = r2.startsWith(r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            if (r0 == 0) goto L_0x00f2
            r0 = 4
            r0 = r18[r0]     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r2 = r1.a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            r0 = 5
            r0 = r18[r0]     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r1 = r1.a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            if (r2 == 0) goto L_0x00f2
            if (r1 == 0) goto L_0x00f2
            java.net.URLConnection r12 = r14.openConnection()     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.StringBuffer r0 = X.AnonymousClass6C9.A0i(r2)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r0 = X.AnonymousClass6C7.A0l(r13, r1, r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            byte[] r0 = r0.getBytes()     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r13 = org.apache.xml.security.utils.Base64.b((byte[]) r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r2 = "Authorization"
            java.lang.StringBuffer r1 = X.AnonymousClass6CA.A0X()     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r0 = "Basic "
            java.lang.String r0 = X.AnonymousClass6C7.A0l(r0, r13, r1)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            r12.setRequestProperty(r2, r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
        L_0x00f2:
            java.lang.String r0 = "Content-Type"
            java.lang.String r2 = r12.getHeaderField(r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.io.InputStream r15 = r12.getInputStream()     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.io.ByteArrayOutputStream r13 = X.AnonymousClass0x9.A0e()     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r12 = new byte[r0]     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            r14 = 0
        L_0x0105:
            int r1 = r15.read(r12)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            if (r1 < 0) goto L_0x0111
            r0 = 0
            r13.write(r12, r0, r1)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            int r14 = r14 + r1
            goto L_0x0105
        L_0x0111:
            org.apache.commons.logging.Log r12 = d     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.StringBuffer r1 = X.AnonymousClass6CA.A0X()     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r0 = "Fetched "
            r1.append(r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            r1.append(r14)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r0 = " bytes from URI "
            r1.append(r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r0 = r11.toString()     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            X.AnonymousClass6C7.A1K(r0, r1, r12)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            byte[] r0 = r13.toByteArray()     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            org.apache.xml.security.signature.XMLSignatureInput r1 = new org.apache.xml.security.signature.XMLSignatureInput     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            r1.<init>((byte[]) r0)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.String r0 = r11.toString()     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            r1.n = r0     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            r1.m = r2     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            if (r17 == 0) goto L_0x0149
            if (r16 == 0) goto L_0x0149
            java.lang.System.setProperty(r8, r7)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.System.setProperty(r9, r6)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
            java.lang.System.setProperty(r10, r3)     // Catch:{ MalformedURLException -> 0x0153, IOException -> 0x014a }
        L_0x0149:
            return r1
        L_0x014a:
            r1 = move-exception
            org.apache.xml.security.utils.resolver.ResourceResolverException r2 = new org.apache.xml.security.utils.resolver.ResourceResolverException
            r0 = r19
            r2.<init>((java.lang.String) r4, (java.lang.Exception) r1, (org.w3c.dom.Attr) r0, (java.lang.String) r5)
            throw r2
        L_0x0153:
            r1 = move-exception
            org.apache.xml.security.utils.resolver.ResourceResolverException r2 = new org.apache.xml.security.utils.resolver.ResourceResolverException
            r0 = r19
            r2.<init>((java.lang.String) r4, (java.lang.Exception) r1, (org.w3c.dom.Attr) r0, (java.lang.String) r5)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP.a(org.w3c.dom.Attr, java.lang.String):org.apache.xml.security.signature.XMLSignatureInput");
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw AnonymousClass6C7.A0r(e2);
        }
    }

    public boolean a() {
        return true;
    }

    private URI a(String str, String str2) {
        if (str2 == null || "".equals(str2)) {
            return new URI(str);
        }
        return new URI(new URI(str2), str);
    }
}
