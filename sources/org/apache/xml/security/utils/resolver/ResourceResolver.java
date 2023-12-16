package org.apache.xml.security.utils.resolver;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass6C7;
import X.AnonymousClass6C9;
import X.AnonymousClass6CA;
import X.C86614Ku;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.w3c.dom.Attr;

public class ResourceResolver {
    public static Log a = null;
    public static boolean b = false;
    public static List c = null;
    public static boolean d = true;
    public static Class f;
    public ResourceResolverSpi e;

    static {
        Class b2 = b("org.apache.xml.security.utils.resolver.ResourceResolver");
        f = b2;
        a = LogFactory.getLog(b2.getName());
    }

    public static final ResourceResolver a(Attr attr, String str, List list) {
        int size;
        int i = 0;
        if (a.isDebugEnabled()) {
            Log log = a;
            StringBuffer A0X = AnonymousClass6CA.A0X();
            A0X.append("I was asked to create a ResourceResolver and got ");
            A0X.append(C86614Ku.A08(list));
            log.debug(A0X.toString());
            Log log2 = a;
            StringBuffer A0X2 = AnonymousClass6CA.A0X();
            A0X2.append(" extra resolvers to my existing ");
            A0X2.append(c.size());
            AnonymousClass6C7.A1K(" system-wide resolvers", A0X2, log2);
        }
        if (list == null || (size = list.size()) <= 0) {
            return a(attr, str);
        }
        do {
            ResourceResolver resourceResolver = (ResourceResolver) list.get(i);
            if (resourceResolver != null) {
                String A0O = AnonymousClass000.A0O(resourceResolver.e);
                if (a.isDebugEnabled()) {
                    AnonymousClass6C7.A1H("check resolvability by class ", A0O, AnonymousClass6CA.A0X(), a);
                }
                if (resourceResolver.e.b(attr, str)) {
                    return resourceResolver;
                }
            }
            i++;
        } while (i < size);
        return a(attr, str);
    }

    private boolean c(Attr attr, String str) {
        return this.e.b(attr, str);
    }

    public XMLSignatureInput b(Attr attr, String str) {
        return this.e.a(attr, str);
    }

    public ResourceResolver(String str) {
        this.e = null;
        this.e = (ResourceResolverSpi) Class.forName(str).newInstance();
    }

    public ResourceResolver(ResourceResolverSpi resourceResolverSpi) {
        this.e = resourceResolverSpi;
    }

    public static void a() {
        if (!b) {
            c = AnonymousClass002.A0I(10);
            b = true;
        }
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw AnonymousClass6C7.A0r(e2);
        }
    }

    public void a(Map map) {
        this.e.a(map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0055 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final org.apache.xml.security.utils.resolver.ResourceResolver a(org.w3c.dom.Attr r9, java.lang.String r10) {
        /*
            java.lang.String r5 = ""
            java.util.List r0 = c
            int r8 = r0.size()
            r7 = 0
            r6 = 0
        L_0x000a:
            if (r6 >= r8) goto L_0x007e
            java.util.List r0 = c
            java.lang.Object r4 = r0.get(r6)
            org.apache.xml.security.utils.resolver.ResourceResolver r4 = (org.apache.xml.security.utils.resolver.ResourceResolver) r4
            boolean r0 = d     // Catch:{ InstantiationException -> 0x0077, IllegalAccessException -> 0x0070 }
            if (r0 != 0) goto L_0x0030
            org.apache.xml.security.utils.resolver.ResourceResolverSpi r1 = r4.e     // Catch:{ InstantiationException -> 0x0077, IllegalAccessException -> 0x0070 }
            boolean r0 = r1.a()     // Catch:{ InstantiationException -> 0x0077, IllegalAccessException -> 0x0070 }
            if (r0 != 0) goto L_0x0030
            java.lang.Class r0 = r1.getClass()     // Catch:{ InstantiationException -> 0x0077, IllegalAccessException -> 0x0070 }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ InstantiationException -> 0x0077, IllegalAccessException -> 0x0070 }
            org.apache.xml.security.utils.resolver.ResourceResolverSpi r0 = (org.apache.xml.security.utils.resolver.ResourceResolverSpi) r0     // Catch:{ InstantiationException -> 0x0077, IllegalAccessException -> 0x0070 }
            org.apache.xml.security.utils.resolver.ResourceResolver r3 = new org.apache.xml.security.utils.resolver.ResourceResolver     // Catch:{ InstantiationException -> 0x0077, IllegalAccessException -> 0x0070 }
            r3.<init>((org.apache.xml.security.utils.resolver.ResourceResolverSpi) r0)     // Catch:{ InstantiationException -> 0x0077, IllegalAccessException -> 0x0070 }
            goto L_0x0031
        L_0x0030:
            r3 = r4
        L_0x0031:
            org.apache.commons.logging.Log r0 = a
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto L_0x006a
            org.apache.commons.logging.Log r2 = a
            java.lang.StringBuffer r1 = X.AnonymousClass6CA.A0X()
            java.lang.String r0 = "check resolvability by class "
            r1.append(r0)
            org.apache.xml.security.utils.resolver.ResourceResolverSpi r0 = r4.e
            java.lang.String r0 = X.AnonymousClass000.A0O(r0)
            X.AnonymousClass6C7.A1K(r0, r1, r2)
        L_0x004d:
            org.apache.xml.security.utils.resolver.ResourceResolverSpi r0 = r3.e
            boolean r0 = r0.b(r9, r10)
            if (r0 == 0) goto L_0x006d
            if (r6 == 0) goto L_0x0069
            java.util.List r0 = c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.clone()
            java.util.List r0 = (java.util.List) r0
            r0.remove(r6)
            r0.add(r7, r4)
            c = r0
        L_0x0069:
            return r3
        L_0x006a:
            if (r4 == 0) goto L_0x006d
            goto L_0x004d
        L_0x006d:
            int r6 = r6 + 1
            goto L_0x000a
        L_0x0070:
            r1 = move-exception
            org.apache.xml.security.utils.resolver.ResourceResolverException r0 = new org.apache.xml.security.utils.resolver.ResourceResolverException
            r0.<init>((java.lang.String) r5, (java.lang.Exception) r1, (org.w3c.dom.Attr) r9, (java.lang.String) r10)
            throw r0
        L_0x0077:
            r1 = move-exception
            org.apache.xml.security.utils.resolver.ResourceResolverException r0 = new org.apache.xml.security.utils.resolver.ResourceResolverException
            r0.<init>((java.lang.String) r5, (java.lang.Exception) r1, (org.w3c.dom.Attr) r9, (java.lang.String) r10)
            throw r0
        L_0x007e:
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            if (r9 == 0) goto L_0x0093
            java.lang.String r0 = r9.getNodeValue()
        L_0x0088:
            X.C18280x3.A19(r0, r10, r2)
            java.lang.String r1 = "utils.resolver.noClass"
            org.apache.xml.security.utils.resolver.ResourceResolverException r0 = new org.apache.xml.security.utils.resolver.ResourceResolverException
            r0.<init>((java.lang.String) r1, (java.lang.Object[]) r2, (org.w3c.dom.Attr) r9, (java.lang.String) r10)
            throw r0
        L_0x0093:
            java.lang.String r0 = "null"
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.utils.resolver.ResourceResolver.a(org.w3c.dom.Attr, java.lang.String):org.apache.xml.security.utils.resolver.ResourceResolver");
    }

    public static void a(String str) {
        a(str, false);
    }

    public static void a(String str, boolean z) {
        try {
            ResourceResolver resourceResolver = new ResourceResolver(str);
            if (z) {
                c.add(0, resourceResolver);
                a.debug("registered resolver");
            } else {
                c.add(resourceResolver);
            }
            if (!resourceResolver.e.a()) {
                d = false;
            }
        } catch (Exception | NoClassDefFoundError unused) {
            a.warn(AnonymousClass6C7.A0l(str, " disabling it", AnonymousClass6C9.A0i("Error loading resolver ")));
        }
    }
}
