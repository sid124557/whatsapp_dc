package X;

import android.net.SSLSessionCache;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: X.31z  reason: invalid class name and case insensitive filesystem */
public class C617231z {
    public static boolean A00;

    public static void A01(SSLSessionCache sSLSessionCache, SSLContext sSLContext) {
        String A0X;
        if (sSLContext.getClientSessionContext() == null) {
            A0X = "SSLSessionCacheHack/session context is null";
        } else if (!C18310x6.A0n(sSLContext.getClientSessionContext()).equals("ClientSessionContext")) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("SSLSessionCacheHack/session context does not match, class=");
            A0X = AnonymousClass000.A0X(AnonymousClass000.A0O(sSLContext.getClientSessionContext()), A0o);
        } else {
            try {
                Field declaredField = sSLSessionCache.getClass().getDeclaredField("mSessionCache");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(sSLSessionCache);
                Class<?> cls = Class.forName("com.android.org.conscrypt.SSLClientSessionCache");
                sSLContext.getClientSessionContext().getClass().getMethod("setPersistentCache", new Class[]{cls}).invoke(sSLContext.getClientSessionContext(), new Object[]{obj});
                return;
            } catch (ClassNotFoundException e) {
                e.toString();
                return;
            } catch (Exception e2) {
                C18260x0.A1O(AnonymousClass001.A0o(), "SSLSessionCacheHack:", e2);
                return;
            }
        }
        Log.w(A0X);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x00dc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00ff */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.net.SSLSessionCache r13, java.lang.String r14, javax.net.ssl.SSLContext r15, int r16) {
        /*
            java.lang.String r2 = "sslParameters"
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            boolean r0 = A00
            if (r0 != 0) goto L_0x0151
            if (r13 == 0) goto L_0x0151
            r4 = 1
            java.lang.Class r1 = r13.getClass()     // Catch:{ Exception -> 0x007c }
            java.lang.String r0 = "mSessionCache"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x007c }
            r0.setAccessible(r4)     // Catch:{ Exception -> 0x007c }
            java.lang.Object r5 = r0.get(r13)     // Catch:{ Exception -> 0x007c }
            java.lang.Class r3 = r5.getClass()     // Catch:{ Exception -> 0x007c }
            java.lang.String r1 = "getSessionData"
            r8 = 2
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x007c }
            r11 = 0
            r0[r11] = r12     // Catch:{ Exception -> 0x007c }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x007c }
            r0[r4] = r10     // Catch:{ Exception -> 0x007c }
            java.lang.reflect.Method r1 = r3.getMethod(r1, r0)     // Catch:{ Exception -> 0x007c }
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x007c }
            r0[r11] = r14     // Catch:{ Exception -> 0x007c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x007c }
            r0[r4] = r9     // Catch:{ Exception -> 0x007c }
            java.lang.Object r7 = r1.invoke(r5, r0)     // Catch:{ Exception -> 0x007c }
            byte[] r7 = (byte[]) r7     // Catch:{ Exception -> 0x007c }
            if (r7 == 0) goto L_0x008c
            javax.net.ssl.SSLSessionContext r0 = r15.getClientSessionContext()     // Catch:{ Exception -> 0x007c }
            java.lang.Class r0 = r0.getClass()     // Catch:{ Exception -> 0x007c }
            java.lang.Class r6 = r0.getSuperclass()     // Catch:{ Exception -> 0x007c }
            java.lang.String r3 = "toSession"
            r5 = 3
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x007c }
            java.lang.Class<byte[]> r0 = byte[].class
            r1[r11] = r0     // Catch:{ Exception -> 0x007c }
            r1[r4] = r12     // Catch:{ Exception -> 0x007c }
            r1[r8] = r10     // Catch:{ Exception -> 0x007c }
            java.lang.reflect.Method r3 = r6.getDeclaredMethod(r3, r1)     // Catch:{ Exception -> 0x007c }
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x007c }
            javax.net.ssl.SSLSessionContext r1 = r15.getClientSessionContext()     // Catch:{ Exception -> 0x007c }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x007c }
            r0[r11] = r7     // Catch:{ Exception -> 0x007c }
            r0[r4] = r14     // Catch:{ Exception -> 0x007c }
            r0[r8] = r9     // Catch:{ Exception -> 0x007c }
            java.lang.Object r0 = r3.invoke(r1, r0)     // Catch:{ Exception -> 0x007c }
            javax.net.ssl.SSLSession r0 = (javax.net.ssl.SSLSession) r0     // Catch:{ Exception -> 0x007c }
            if (r0 == 0) goto L_0x008c
            A02(r0)     // Catch:{ Exception -> 0x007c }
            goto L_0x008c
        L_0x007c:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SSLSessionCacheHack:"
            java.lang.String r0 = X.C18300x5.A0k(r3, r0, r1)
            X.C18260x0.A1L(r1, r0)
            A00 = r4
        L_0x008c:
            java.lang.Class r1 = r13.getClass()     // Catch:{ Exception -> 0x0141 }
            java.lang.String r0 = "mSessionCache"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x0141 }
            r0.setAccessible(r4)     // Catch:{ Exception -> 0x0141 }
            javax.net.ssl.SSLSessionContext r0 = r15.getClientSessionContext()     // Catch:{ Exception -> 0x0141 }
            java.lang.Class r5 = r0.getClass()     // Catch:{ Exception -> 0x0141 }
            java.lang.String r3 = "getSession"
            r7 = 2
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0141 }
            r9 = 0
            r1[r9] = r12     // Catch:{ Exception -> 0x0141 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0141 }
            r1[r4] = r0     // Catch:{ Exception -> 0x0141 }
            java.lang.reflect.Method r3 = r5.getMethod(r3, r1)     // Catch:{ Exception -> 0x0141 }
            javax.net.ssl.SSLSessionContext r1 = r15.getClientSessionContext()     // Catch:{ Exception -> 0x0141 }
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0141 }
            r0[r9] = r14     // Catch:{ Exception -> 0x0141 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x0141 }
            r0[r4] = r8     // Catch:{ Exception -> 0x0141 }
            java.lang.Object r1 = r3.invoke(r1, r0)     // Catch:{ Exception -> 0x0141 }
            javax.net.ssl.SSLSession r1 = (javax.net.ssl.SSLSession) r1     // Catch:{ Exception -> 0x0141 }
            javax.net.ssl.SSLSessionContext r0 = r15.getClientSessionContext()     // Catch:{ Exception -> 0x0141 }
            r0.getSessionTimeout()     // Catch:{ Exception -> 0x0141 }
            if (r1 == 0) goto L_0x00d1
            A02(r1)     // Catch:{ Exception -> 0x0141 }
        L_0x00d1:
            java.lang.Class r1 = r15.getClass()     // Catch:{ NoSuchFieldException -> 0x00dc }
            java.lang.String r0 = "contextSpi"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x00dc }
            goto L_0x00e7
        L_0x00dc:
            java.lang.Class r1 = r15.getClass()     // Catch:{ Exception -> 0x0141 }
            java.lang.String r0 = "spiImpl"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x0141 }
        L_0x00e7:
            if (r0 == 0) goto L_0x013e
            r0.setAccessible(r4)     // Catch:{ Exception -> 0x0141 }
            java.lang.Object r1 = r0.get(r15)     // Catch:{ Exception -> 0x0141 }
            if (r1 == 0) goto L_0x0151
            java.lang.Class r0 = r1.getClass()     // Catch:{ NoSuchFieldException -> 0x00ff }
            java.lang.Class r0 = r0.getSuperclass()     // Catch:{ NoSuchFieldException -> 0x00ff }
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x00ff }
            goto L_0x0107
        L_0x00ff:
            java.lang.Class r0 = r1.getClass()     // Catch:{ Exception -> 0x0141 }
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0141 }
        L_0x0107:
            r0.setAccessible(r4)     // Catch:{ Exception -> 0x0141 }
            java.lang.Object r6 = r0.get(r1)     // Catch:{ Exception -> 0x0141 }
            java.lang.Class r5 = r6.getClass()     // Catch:{ NoSuchMethodException -> 0x013e }
            java.lang.String r2 = "getCachedClientSession"
            r3 = 3
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x013e }
            javax.net.ssl.SSLSessionContext r0 = r15.getClientSessionContext()     // Catch:{ NoSuchMethodException -> 0x013e }
            java.lang.Class r0 = r0.getClass()     // Catch:{ NoSuchMethodException -> 0x013e }
            r1[r9] = r0     // Catch:{ NoSuchMethodException -> 0x013e }
            r1[r4] = r12     // Catch:{ NoSuchMethodException -> 0x013e }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x013e }
            r1[r7] = r0     // Catch:{ NoSuchMethodException -> 0x013e }
            java.lang.reflect.Method r2 = r5.getDeclaredMethod(r2, r1)     // Catch:{ NoSuchMethodException -> 0x013e }
            r2.setAccessible(r4)     // Catch:{ Exception -> 0x0141 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0141 }
            javax.net.ssl.SSLSessionContext r0 = r15.getClientSessionContext()     // Catch:{ Exception -> 0x0141 }
            r1[r9] = r0     // Catch:{ Exception -> 0x0141 }
            r1[r4] = r14     // Catch:{ Exception -> 0x0141 }
            r1[r7] = r8     // Catch:{ Exception -> 0x0141 }
            r2.invoke(r6, r1)     // Catch:{ Exception -> 0x0141 }
            return
        L_0x013e:
            A00 = r4     // Catch:{ Exception -> 0x0141 }
            return
        L_0x0141:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SSLSessionCacheHack:"
            java.lang.String r0 = X.C18300x5.A0k(r2, r0, r1)
            X.C18260x0.A1M(r1, r0)
            A00 = r4
        L_0x0151:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C617231z.A00(android.net.SSLSessionCache, java.lang.String, javax.net.ssl.SSLContext, int):void");
    }

    public static void A02(SSLSession sSLSession) {
        long j;
        try {
            j = (long) sSLSession.getPeerCertificates().length;
        } catch (SSLPeerUnverifiedException e) {
            Log.e((Throwable) e);
            j = -1;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("age=");
        A0o.append(C18280x3.A08(System.currentTimeMillis(), sSLSession.getCreationTime()));
        A0o.append(", creation=");
        A0o.append(sSLSession.getCreationTime());
        A0o.append(", protocol=");
        A0o.append(sSLSession.getProtocol());
        A0o.append(", valid=");
        A0o.append(sSLSession.isValid());
        A0o.append(", peerCertificateCount=");
        A0o.append(j);
        A0o.toString();
    }
}
