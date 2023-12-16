package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.05s  reason: invalid class name and case insensitive filesystem */
public class C005705s extends AnonymousClass0Q5 {
    public static Class A00;
    public static Constructor A01;
    public static Method A02;
    public static Method A03;
    public static boolean A04;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041 A[SYNTHETIC, Splitter:B:13:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b A[SYNTHETIC, Splitter:B:21:0x005b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A03(android.content.Context r6, android.os.CancellationSignal r7, X.AnonymousClass0MK[] r8, int r9) {
        /*
            r5 = this;
            r3 = 0
            int r1 = r8.length
            r0 = 1
            r4 = 0
            if (r1 < r0) goto L_0x0098
            X.0MK r0 = r5.A04(r8, r9)
            android.content.ContentResolver r2 = r6.getContentResolver()
            android.net.Uri r1 = r0.A03     // Catch:{ IOException -> 0x0097 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r3 = r2.openFileDescriptor(r1, r0, r3)     // Catch:{ IOException -> 0x0097 }
            if (r3 == 0) goto L_0x0098
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ ErrnoException -> 0x003e }
            java.lang.String r0 = "/proc/self/fd/"
            r1.append(r0)     // Catch:{ ErrnoException -> 0x003e }
            int r0 = r3.getFd()     // Catch:{ ErrnoException -> 0x003e }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ ErrnoException -> 0x003e }
            java.lang.String r1 = android.system.Os.readlink(r0)     // Catch:{ ErrnoException -> 0x003e }
            android.system.StructStat r0 = android.system.Os.stat(r1)     // Catch:{ ErrnoException -> 0x003e }
            int r0 = r0.st_mode     // Catch:{ ErrnoException -> 0x003e }
            boolean r0 = android.system.OsConstants.S_ISREG(r0)     // Catch:{ ErrnoException -> 0x003e }
            if (r0 == 0) goto L_0x003e
            java.io.File r1 = X.AnonymousClass002.A0B(r1)     // Catch:{ ErrnoException -> 0x003e }
            goto L_0x003f
        L_0x003e:
            r1 = r4
        L_0x003f:
            if (r1 == 0) goto L_0x004c
            boolean r0 = r1.canRead()     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x004c
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromFile(r1)     // Catch:{ all -> 0x008d }
            goto L_0x007f
        L_0x004c:
            java.io.FileDescriptor r0 = r3.getFileDescriptor()     // Catch:{ all -> 0x008d }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x008d }
            r2.<init>(r0)     // Catch:{ all -> 0x008d }
            java.io.File r1 = X.AnonymousClass0WX.A00(r6)     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x007b
            boolean r0 = X.AnonymousClass0WX.A03(r1, r2)     // Catch:{ RuntimeException -> 0x0076, all -> 0x0071 }
            if (r0 != 0) goto L_0x0065
            r1.delete()     // Catch:{ all -> 0x0083 }
            goto L_0x007b
        L_0x0065:
            java.lang.String r0 = r1.getPath()     // Catch:{ RuntimeException -> 0x0076, all -> 0x0071 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromFile(r0)     // Catch:{ RuntimeException -> 0x0076, all -> 0x0071 }
            r1.delete()     // Catch:{ all -> 0x0083 }
            goto L_0x007c
        L_0x0071:
            r0 = move-exception
            r1.delete()     // Catch:{ all -> 0x0083 }
            throw r0     // Catch:{ all -> 0x0083 }
        L_0x0076:
            r1.delete()     // Catch:{ all -> 0x0083 }
            r0 = r4
            goto L_0x007c
        L_0x007b:
            r0 = r4
        L_0x007c:
            r2.close()     // Catch:{ all -> 0x008d }
        L_0x007f:
            r3.close()     // Catch:{ IOException -> 0x0097 }
            return r0
        L_0x0083:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x008d }
        L_0x008c:
            throw r1     // Catch:{ all -> 0x008d }
        L_0x008d:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0092 }
            goto L_0x0096
        L_0x0092:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0097 }
        L_0x0096:
            throw r1     // Catch:{ IOException -> 0x0097 }
        L_0x0097:
            return r4
        L_0x0098:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C005705s.A03(android.content.Context, android.os.CancellationSignal, X.0MK[], int):android.graphics.Typeface");
    }

    public static void A00() {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        if (!A04) {
            A04 = true;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                constructor = cls.getConstructor(new Class[0]);
                Class[] clsArr = new Class[3];
                clsArr[0] = String.class;
                clsArr[1] = Integer.TYPE;
                method = AnonymousClass001.A0r(cls, Boolean.TYPE, "addFontWeightStyle", clsArr, 2);
                method2 = AnonymousClass001.A0r(Typeface.class, Array.newInstance(cls, 1).getClass(), "createFromFamiliesWithDefault", new Class[1], 0);
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", AnonymousClass000.A0O(e), e);
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
    }

    public Typeface A01(Context context, Resources resources, AnonymousClass0KK r15, int i) {
        A00();
        try {
            Object newInstance = A01.newInstance(new Object[0]);
            C03920Mb[] r10 = r15.A00;
            int length = r10.length;
            int i2 = 0;
            while (i2 < length) {
                C03920Mb r1 = r10[i2];
                File A002 = AnonymousClass0WX.A00(context);
                if (A002 == null) {
                    return null;
                }
                try {
                    if (AnonymousClass0WX.A02(resources, A002, r1.A00)) {
                        String path = A002.getPath();
                        int i3 = r1.A02;
                        boolean z = r1.A05;
                        A00();
                        Method method = A02;
                        Object[] objArr = new Object[3];
                        objArr[0] = path;
                        AnonymousClass000.A1M(objArr, i3);
                        AnonymousClass001.A1S(objArr, z);
                        if (AnonymousClass000.A1Z(newInstance, method, objArr)) {
                            A002.delete();
                            i2++;
                        }
                    }
                    A002.delete();
                    return null;
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                } catch (RuntimeException unused) {
                    A002.delete();
                    return null;
                } catch (Throwable th) {
                    A002.delete();
                    throw th;
                }
            }
            A00();
            try {
                Object newInstance2 = Array.newInstance(A00, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) A03.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
