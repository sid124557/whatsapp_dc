package X;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.05u  reason: invalid class name and case insensitive filesystem */
public class C005905u extends AnonymousClass0Q5 {
    public static final Class A00;
    public static final Constructor A01;
    public static final Method A02;
    public static final Method A03;

    public Typeface A03(Context context, CancellationSignal cancellationSignal, AnonymousClass0MK[] r17, int i) {
        Object obj;
        Typeface typeface;
        boolean z;
        try {
            obj = A01.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            C06290Wz r9 = new C06290Wz();
            int length = r17.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    AnonymousClass0MK r1 = r17[i2];
                    Uri uri = r1.A03;
                    ByteBuffer byteBuffer = (ByteBuffer) r9.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = AnonymousClass0WX.A01(context, uri);
                        r9.put(uri, byteBuffer);
                        if (byteBuffer == null) {
                            break;
                        }
                    }
                    int i3 = r1.A01;
                    int i4 = r1.A02;
                    boolean z2 = r1.A04;
                    try {
                        Method method = A02;
                        Object[] objArr = new Object[5];
                        objArr[0] = byteBuffer;
                        AnonymousClass000.A1M(objArr, i3);
                        objArr[2] = null;
                        AnonymousClass000.A1O(objArr, i4);
                        objArr[4] = Boolean.valueOf(z2);
                        z = AnonymousClass000.A1Z(obj, method, objArr);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z = false;
                    }
                    if (!z) {
                        break;
                    }
                    i2++;
                } else {
                    try {
                        Object newInstance = Array.newInstance(A00, 1);
                        Array.set(newInstance, 0, obj);
                        typeface = (Typeface) A03.invoke((Object) null, new Object[]{newInstance});
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        typeface = null;
                    }
                    if (typeface != null) {
                        return Typeface.create(typeface, i);
                    }
                }
            }
        }
        return null;
    }

    static {
        Constructor<?> constructor;
        Class<?> cls;
        Method method;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class[] clsArr = new Class[5];
            clsArr[0] = ByteBuffer.class;
            Class cls2 = Integer.TYPE;
            clsArr[1] = cls2;
            AnonymousClass001.A1H(List.class, cls2, clsArr);
            method = AnonymousClass001.A0r(cls, Boolean.TYPE, "addFontWeightStyle", clsArr, 4);
            method2 = AnonymousClass001.A0r(Typeface.class, Array.newInstance(cls, 1).getClass(), "createFromFamiliesWithDefault", new Class[1], 0);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", AnonymousClass000.A0O(e), e);
            cls = null;
            method2 = null;
            constructor = null;
            method = null;
        }
        A01 = constructor;
        A00 = cls;
        A02 = method;
        A03 = method2;
    }

    public static boolean A00() {
        if (A02 != null) {
            return true;
        }
        Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A01(android.content.Context r16, android.content.res.Resources r17, X.AnonymousClass0KK r18, int r19) {
        /*
            r15 = this;
            java.lang.reflect.Constructor r1 = A01     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000a }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000a }
            java.lang.Object r5 = r1.newInstance(r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000a }
            goto L_0x000b
        L_0x000a:
            r5 = 0
        L_0x000b:
            r4 = 0
            if (r5 == 0) goto L_0x009e
            r0 = r18
            X.0Mb[] r8 = r0.A00
            int r7 = r8.length
            r6 = 0
        L_0x0014:
            if (r6 >= r7) goto L_0x0085
            r3 = r8[r6]
            int r0 = r3.A00
            java.io.File r2 = X.AnonymousClass0WX.A00(r16)
            if (r2 == 0) goto L_0x0054
            r1 = r17
            boolean r0 = X.AnonymousClass0WX.A02(r1, r2, r0)     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x0029
            goto L_0x0051
        L_0x0029:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004c }
            r0.<init>(r2)     // Catch:{ IOException -> 0x004c }
            java.nio.channels.FileChannel r9 = r0.getChannel()     // Catch:{ all -> 0x0042 }
            long r13 = r9.size()     // Catch:{ all -> 0x0042 }
            java.nio.channels.FileChannel$MapMode r10 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0042 }
            r11 = 0
            java.nio.MappedByteBuffer r12 = r9.map(r10, r11, r13)     // Catch:{ all -> 0x0042 }
            r0.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x004d
        L_0x0042:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0047 }
            goto L_0x004b
        L_0x0047:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x004c }
        L_0x004b:
            throw r1     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            r12 = 0
        L_0x004d:
            r2.delete()
            goto L_0x0055
        L_0x0051:
            r2.delete()
        L_0x0054:
            r12 = r4
        L_0x0055:
            if (r12 == 0) goto L_0x009e
            int r11 = r3.A01
            int r10 = r3.A02
            boolean r9 = r3.A05
            r1 = 0
            java.lang.reflect.Method r3 = A02     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x007a }
            r0 = 5
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x007a }
            r2[r1] = r12     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x007a }
            X.AnonymousClass000.A1M(r2, r11)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x007a }
            r0 = 2
            r2[r0] = r4     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x007a }
            X.AnonymousClass000.A1O(r2, r10)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x007a }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x007a }
            r0 = 4
            r2[r0] = r1     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x007a }
            boolean r0 = X.AnonymousClass000.A1Z(r5, r3, r2)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x007a }
            goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            if (r0 == 0) goto L_0x009e
            int r6 = r6 + 1
            goto L_0x0014
        L_0x0080:
            r0 = move-exception
            r2.delete()
            throw r0
        L_0x0085:
            java.lang.Class r1 = A00     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009d }
            r0 = 1
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r1, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009d }
            r2 = 0
            java.lang.reflect.Array.set(r3, r2, r5)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009d }
            java.lang.reflect.Method r1 = A03     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009d }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009d }
            r0[r2] = r3     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009d }
            java.lang.Object r0 = r1.invoke(r4, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009d }
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009d }
            return r0
        L_0x009d:
            return r4
        L_0x009e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C005905u.A01(android.content.Context, android.content.res.Resources, X.0KK, int):android.graphics.Typeface");
    }
}
