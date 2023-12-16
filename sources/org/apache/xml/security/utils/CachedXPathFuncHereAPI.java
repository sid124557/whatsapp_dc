package org.apache.xml.security.utils;

import X.AnonymousClass6C7;
import X.AnonymousClass6CA;
import javax.xml.transform.ErrorListener;
import javax.xml.transform.SourceLocator;
import javax.xml.transform.TransformerException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.dtm.DTMManager;
import org.apache.xml.security.transforms.implementations.FuncHereContext;
import org.apache.xml.utils.PrefixResolver;
import org.apache.xml.utils.PrefixResolverDefault;
import org.apache.xpath.CachedXPathAPI;
import org.apache.xpath.XPath;
import org.apache.xpath.XPathContext;
import org.apache.xpath.compiler.FunctionTable;
import org.apache.xpath.objects.XObject;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class CachedXPathFuncHereAPI {
    public static Log a;
    public static FunctionTable g = null;
    public static Class h;
    public static Class i;
    public static Class j;
    public static Class k;
    public static Class l;
    public static Class m;
    public static Class n;
    public static Class o;
    public static Class p;
    public static Class q;
    public FuncHereContext b = null;
    public DTMManager c = null;
    public XPathContext d = null;
    public String e = null;
    public XPath f = null;

    private XPath a(String str, PrefixResolver prefixResolver) {
        Class[] clsArr = new Class[6];
        Class cls = i;
        if (cls == null) {
            cls = a("java.lang.String");
            i = cls;
        }
        clsArr[0] = cls;
        Class cls2 = j;
        if (cls2 == null) {
            cls2 = a("javax.xml.transform.SourceLocator");
            j = cls2;
        }
        clsArr[1] = cls2;
        Class cls3 = k;
        if (cls3 == null) {
            cls3 = a("org.apache.xml.utils.PrefixResolver");
            k = cls3;
        }
        clsArr[2] = cls3;
        clsArr[3] = Integer.TYPE;
        Class cls4 = l;
        if (cls4 == null) {
            cls4 = a("javax.xml.transform.ErrorListener");
            l = cls4;
        }
        clsArr[4] = cls4;
        Class cls5 = m;
        if (cls5 == null) {
            cls5 = a("org.apache.xpath.compiler.FunctionTable");
            m = cls5;
        }
        clsArr[5] = cls5;
        String str2 = str;
        XPath xPath = null;
        PrefixResolver prefixResolver2 = prefixResolver;
        Object[] objArr = {str, null, prefixResolver, new Integer(0), null, g};
        try {
            Class cls6 = n;
            if (cls6 == null) {
                cls6 = a("org.apache.xpath.XPath");
                n = cls6;
            }
            xPath = (XPath) cls6.getConstructor(clsArr).newInstance(objArr);
        } catch (Throwable unused) {
        }
        if (xPath == null) {
            return new XPath(str2, (SourceLocator) null, prefixResolver2, 0, (ErrorListener) null);
        }
        return xPath;
    }

    static {
        Class a2 = a("org.apache.xml.security.utils.CachedXPathFuncHereAPI");
        h = a2;
        a = LogFactory.getLog(a2.getName());
        a();
    }

    public XObject b(Node node, Node node2, String str, Node node3) {
        if (this.b == null) {
            this.b = new FuncHereContext(node2, this.c);
        }
        if (node3.getNodeType() == 9) {
            node3 = ((Document) node3).getDocumentElement();
        }
        PrefixResolverDefault prefixResolverDefault = new PrefixResolverDefault(node3);
        if (str != this.e) {
            if (str.indexOf("here()") > 0) {
                this.d.reset();
                this.c = this.d.getDTMManager();
            }
            this.f = a(str, prefixResolverDefault);
            this.e = str;
        }
        return this.f.execute(this.b, this.b.getDTMHandleFromNode(node), prefixResolverDefault);
    }

    public CachedXPathFuncHereAPI(CachedXPathAPI cachedXPathAPI) {
        this.c = cachedXPathAPI.getXPathContext().getDTMManager();
        this.d = cachedXPathAPI.getXPathContext();
    }

    public CachedXPathFuncHereAPI() {
    }

    public XObject a(Node node, Node node2, String str, PrefixResolver prefixResolver) {
        if (str != this.e) {
            if (str.indexOf("here()") > 0) {
                this.d.reset();
                this.c = this.d.getDTMManager();
            }
            try {
                this.f = a(str, prefixResolver);
                this.e = str;
            } catch (TransformerException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof ClassNotFoundException) || cause.getMessage().indexOf("FuncHere") <= 0) {
                    throw e2;
                }
                StringBuffer A0X = AnonymousClass6CA.A0X();
                A0X.append(I18n.b("endorsed.jdk1.4.0"));
                A0X.append(e2);
                throw AnonymousClass6C7.A0e(A0X);
            }
        }
        FuncHereContext funcHereContext = this.b;
        if (funcHereContext == null) {
            funcHereContext = new FuncHereContext(node2, this.c);
            this.b = funcHereContext;
        }
        return this.f.execute(this.b, funcHereContext.getDTMHandleFromNode(node), prefixResolver);
    }

    public static String a(Node node) {
        if (node.getNodeType() == 3) {
            StringBuffer A0X = AnonymousClass6CA.A0X();
            for (Node firstChild = node.getParentNode().getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                if (firstChild.getNodeType() == 3) {
                    A0X.append(((CharacterData) firstChild).getData());
                }
            }
            return A0X.toString();
        } else if (node.getNodeType() == 2 || node.getNodeType() == 7) {
            return node.getNodeValue();
        } else {
            return null;
        }
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw AnonymousClass6C7.A0r(e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062 A[SYNTHETIC, Splitter:B:19:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a() {
        /*
            java.lang.String r11 = "here"
            java.lang.String r2 = "installFunction"
            java.lang.String r10 = "org.apache.xpath.compiler.FunctionTable"
            java.lang.String r9 = "java.lang.String"
            java.lang.String r5 = "Error installing function using the static installFunction method"
            org.apache.commons.logging.Log r1 = a
            java.lang.String r0 = "Registering Here function"
            r1.info(r0)
            r6 = 2
            r8 = 1
            r7 = 0
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x0057 }
            java.lang.Class r0 = i     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x0020
            java.lang.Class r0 = a((java.lang.String) r9)     // Catch:{ all -> 0x0057 }
            i = r0     // Catch:{ all -> 0x0057 }
        L_0x0020:
            r1[r7] = r0     // Catch:{ all -> 0x0057 }
            java.lang.Class r0 = o     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "org.apache.xpath.Expression"
            java.lang.Class r0 = a((java.lang.String) r0)     // Catch:{ all -> 0x0057 }
            o = r0     // Catch:{ all -> 0x0057 }
        L_0x002e:
            r1[r8] = r0     // Catch:{ all -> 0x0057 }
            java.lang.Class r0 = m     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x003a
            java.lang.Class r0 = a((java.lang.String) r10)     // Catch:{ all -> 0x0057 }
            m = r0     // Catch:{ all -> 0x0057 }
        L_0x003a:
            java.lang.reflect.Method r3 = r0.getMethod(r2, r1)     // Catch:{ all -> 0x0057 }
            int r0 = r3.getModifiers()     // Catch:{ all -> 0x0057 }
            r0 = r0 & 8
            if (r0 == 0) goto L_0x005d
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x0057 }
            r1[r7] = r11     // Catch:{ all -> 0x0057 }
            org.apache.xml.security.transforms.implementations.FuncHere r0 = new org.apache.xml.security.transforms.implementations.FuncHere     // Catch:{ all -> 0x0057 }
            r0.<init>()     // Catch:{ all -> 0x0057 }
            r1[r8] = r0     // Catch:{ all -> 0x0057 }
            r0 = 0
            r3.invoke(r0, r1)     // Catch:{ all -> 0x0057 }
            r3 = 1
            goto L_0x005e
        L_0x0057:
            r1 = move-exception
            org.apache.commons.logging.Log r0 = a
            r0.debug(r5, r1)
        L_0x005d:
            r3 = 0
        L_0x005e:
            java.lang.String r4 = "org.apache.xml.security.transforms.implementations.FuncHere"
            if (r3 != 0) goto L_0x00af
            org.apache.xpath.compiler.FunctionTable r0 = new org.apache.xpath.compiler.FunctionTable     // Catch:{ all -> 0x00a9 }
            r0.<init>()     // Catch:{ all -> 0x00a9 }
            g = r0     // Catch:{ all -> 0x00a9 }
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x00a9 }
            java.lang.Class r0 = i     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x0075
            java.lang.Class r0 = a((java.lang.String) r9)     // Catch:{ all -> 0x00a9 }
            i = r0     // Catch:{ all -> 0x00a9 }
        L_0x0075:
            r1[r7] = r0     // Catch:{ all -> 0x00a9 }
            java.lang.Class r0 = p     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = "java.lang.Class"
            java.lang.Class r0 = a((java.lang.String) r0)     // Catch:{ all -> 0x00a9 }
            p = r0     // Catch:{ all -> 0x00a9 }
        L_0x0083:
            r1[r8] = r0     // Catch:{ all -> 0x00a9 }
            java.lang.Class r0 = m     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x008f
            java.lang.Class r0 = a((java.lang.String) r10)     // Catch:{ all -> 0x00a9 }
            m = r0     // Catch:{ all -> 0x00a9 }
        L_0x008f:
            java.lang.reflect.Method r2 = r0.getMethod(r2, r1)     // Catch:{ all -> 0x00a9 }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x00a9 }
            r1[r7] = r11     // Catch:{ all -> 0x00a9 }
            java.lang.Class r0 = q     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x00a1
            java.lang.Class r0 = a((java.lang.String) r4)     // Catch:{ all -> 0x00a9 }
            q = r0     // Catch:{ all -> 0x00a9 }
        L_0x00a1:
            r1[r8] = r0     // Catch:{ all -> 0x00a9 }
            org.apache.xpath.compiler.FunctionTable r0 = g     // Catch:{ all -> 0x00a9 }
            r2.invoke(r0, r1)     // Catch:{ all -> 0x00a9 }
            goto L_0x00b0
        L_0x00a9:
            r1 = move-exception
            org.apache.commons.logging.Log r0 = a
            r0.debug(r5, r1)
        L_0x00af:
            r8 = r3
        L_0x00b0:
            org.apache.commons.logging.Log r0 = a
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto L_0x00d8
            java.lang.String r3 = " for XPath function 'here()' function in internal table"
            org.apache.commons.logging.Log r2 = a
            java.lang.StringBuffer r1 = X.AnonymousClass6CA.A0X()
            if (r8 == 0) goto L_0x00d9
            java.lang.String r0 = "Registered class "
        L_0x00c4:
            r1.append(r0)
            java.lang.Class r0 = q
            if (r0 != 0) goto L_0x00d1
            java.lang.Class r0 = a((java.lang.String) r4)
            q = r0
        L_0x00d1:
            java.lang.String r0 = r0.getName()
            X.AnonymousClass6C7.A1H(r0, r3, r1, r2)
        L_0x00d8:
            return
        L_0x00d9:
            java.lang.String r0 = "Unable to register class "
            goto L_0x00c4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.utils.CachedXPathFuncHereAPI.a():void");
    }

    public NodeList a(Node node, Node node2, String str, Node node3) {
        return b(node, node2, str, node3).nodelist();
    }
}
