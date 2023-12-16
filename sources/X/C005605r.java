package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: X.05r  reason: invalid class name and case insensitive filesystem */
public class C005605r extends C005705s {
    public final Class A00;
    public final Constructor A01;
    public final Method A02;
    public final Method A03;
    public final Method A04;
    public final Method A05;
    public final Method A06;

    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r15.A02.invoke(r2, new java.lang.Object[0]);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A03(android.content.Context r16, android.os.CancellationSignal r17, X.AnonymousClass0MK[] r18, int r19) {
        /*
            r15 = this;
            r2 = 0
            r10 = r18
            int r9 = r10.length
            r14 = 0
            r0 = 1
            if (r9 < r0) goto L_0x00df
            java.lang.reflect.Method r3 = r15.A03
            if (r3 != 0) goto L_0x0013
            java.lang.String r1 = "TypefaceCompatApi26Impl"
            java.lang.String r0 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r1, r0)
        L_0x0013:
            boolean r0 = X.AnonymousClass000.A1W(r3)
            r5 = r19
            r6 = r16
            if (r0 != 0) goto L_0x0057
            X.0MK r4 = r15.A04(r10, r5)
            android.content.ContentResolver r3 = r6.getContentResolver()
            android.net.Uri r1 = r4.A03     // Catch:{ IOException -> 0x0056 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r3 = r3.openFileDescriptor(r1, r0, r2)     // Catch:{ IOException -> 0x0056 }
            if (r3 == 0) goto L_0x00df
            java.io.FileDescriptor r0 = r3.getFileDescriptor()     // Catch:{ all -> 0x004c }
            android.graphics.Typeface$Builder r1 = new android.graphics.Typeface$Builder     // Catch:{ all -> 0x004c }
            r1.<init>(r0)     // Catch:{ all -> 0x004c }
            int r0 = r4.A02     // Catch:{ all -> 0x004c }
            android.graphics.Typeface$Builder r1 = r1.setWeight(r0)     // Catch:{ all -> 0x004c }
            boolean r0 = r4.A04     // Catch:{ all -> 0x004c }
            android.graphics.Typeface$Builder r0 = r1.setItalic(r0)     // Catch:{ all -> 0x004c }
            android.graphics.Typeface r0 = r0.build()     // Catch:{ all -> 0x004c }
            r3.close()     // Catch:{ IOException -> 0x0056 }
            return r0
        L_0x004c:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0056 }
        L_0x0055:
            throw r1     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            return r2
        L_0x0057:
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            r3 = 0
        L_0x005c:
            if (r3 >= r9) goto L_0x0076
            r1 = r18[r3]
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0073
            android.net.Uri r1 = r1.A03
            boolean r0 = r4.containsKey(r1)
            if (r0 != 0) goto L_0x0073
            java.nio.ByteBuffer r0 = X.AnonymousClass0WX.A01(r6, r1)
            r4.put(r1, r0)
        L_0x0073:
            int r3 = r3 + 1
            goto L_0x005c
        L_0x0076:
            java.util.Map r8 = java.util.Collections.unmodifiableMap(r4)
            java.lang.reflect.Constructor r1 = r15.A01     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0083 }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0083 }
            java.lang.Object r2 = r1.newInstance(r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0083 }
        L_0x0083:
            if (r2 == 0) goto L_0x00df
            r3 = 0
            r7 = 0
        L_0x0087:
            if (r7 >= r9) goto L_0x00bd
            r1 = r18[r7]
            android.net.Uri r0 = r1.A03
            java.lang.Object r13 = r8.get(r0)
            if (r13 == 0) goto L_0x00ba
            int r12 = r1.A01
            int r11 = r1.A02
            boolean r6 = r1.A04
            r1 = 0
            java.lang.reflect.Method r4 = r15.A04     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b6 }
            r0 = 5
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b6 }
            r3[r1] = r13     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b6 }
            X.AnonymousClass000.A1M(r3, r12)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b6 }
            r0 = 2
            r3[r0] = r14     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b6 }
            X.AnonymousClass000.A1O(r3, r11)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b6 }
            r0 = 4
            r3[r0] = r1     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b6 }
            boolean r0 = X.AnonymousClass000.A1Z(r2, r4, r3)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b6 }
            goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            if (r0 == 0) goto L_0x00d7
            r3 = 1
        L_0x00ba:
            int r7 = r7 + 1
            goto L_0x0087
        L_0x00bd:
            if (r3 == 0) goto L_0x00d7
            r0 = 0
            java.lang.reflect.Method r1 = r15.A06     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            boolean r0 = X.AnonymousClass000.A1Z(r2, r1, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            goto L_0x00ca
        L_0x00c9:
            r0 = 0
        L_0x00ca:
            if (r0 == 0) goto L_0x00df
            android.graphics.Typeface r0 = r15.A05(r2)
            if (r0 == 0) goto L_0x00df
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r5)
            return r0
        L_0x00d7:
            java.lang.reflect.Method r1 = r15.A02     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00df }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00df }
            r1.invoke(r2, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00df }
        L_0x00df:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C005605r.A03(android.content.Context, android.os.CancellationSignal, X.0MK[], int):android.graphics.Typeface");
    }

    public Typeface A05(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.A00, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.A05.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method A06(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Typeface A01(Context context, Resources resources, AnonymousClass0KK r17, int i) {
        Object obj;
        boolean z;
        boolean z2;
        Method method = this.A03;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        AnonymousClass0KK r3 = r17;
        if (!AnonymousClass000.A1W(method)) {
            return super.A01(context, resources, r3, i);
        }
        try {
            obj = this.A01.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            C03920Mb[] r6 = r3.A00;
            int length = r6.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    C03920Mb r0 = r6[i2];
                    Object obj2 = r0.A03;
                    int i3 = r0.A01;
                    int i4 = r0.A02;
                    boolean z3 = r0.A05;
                    Object fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(r0.A04);
                    try {
                        Object[] objArr = new Object[8];
                        objArr[0] = context.getAssets();
                        objArr[1] = obj2;
                        AnonymousClass000.A1N(objArr, 0);
                        objArr[3] = Boolean.FALSE;
                        objArr[4] = Integer.valueOf(i3);
                        objArr[5] = Integer.valueOf(i4);
                        objArr[6] = Integer.valueOf(z3 ? 1 : 0);
                        objArr[7] = fromFontVariationSettings;
                        z2 = AnonymousClass000.A1Z(obj, method, objArr);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z2 = false;
                    }
                    if (!z2) {
                        try {
                            this.A02.invoke(obj, new Object[0]);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused3) {
                        }
                    } else {
                        i2++;
                    }
                } else {
                    try {
                        z = AnonymousClass000.A1Z(obj, this.A06, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException unused4) {
                        z = false;
                    }
                    if (z) {
                        return A05(obj);
                    }
                }
            }
        }
        return null;
    }

    public Typeface A02(Context context, Resources resources, String str, int i, int i2) {
        Object obj;
        boolean z;
        boolean z2;
        Method method = this.A03;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (!AnonymousClass000.A1W(method)) {
            return super.A02(context, resources, str, i, i2);
        }
        try {
            obj = this.A01.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        try {
            Object[] objArr = new Object[8];
            objArr[0] = context.getAssets();
            objArr[1] = str;
            AnonymousClass000.A1N(objArr, 0);
            objArr[3] = Boolean.FALSE;
            objArr[4] = 0;
            objArr[5] = -1;
            objArr[6] = -1;
            objArr[7] = null;
            z = AnonymousClass000.A1Z(obj, method, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            z = false;
        }
        if (!z) {
            try {
                this.A02.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused3) {
            }
            return null;
        }
        try {
            z2 = AnonymousClass000.A1Z(obj, this.A06, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused4) {
            z2 = false;
        }
        if (!z2) {
            return null;
        }
        return A05(obj);
    }

    public C005605r() {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            Class<FontVariationAxis[]> cls3 = FontVariationAxis[].class;
            method = cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, cls3});
            Class[] clsArr = new Class[5];
            clsArr[0] = ByteBuffer.class;
            Class cls4 = Integer.TYPE;
            clsArr[1] = cls4;
            AnonymousClass001.A1H(cls3, cls4, clsArr);
            clsArr[4] = cls4;
            method2 = cls.getMethod("addFontFromBuffer", clsArr);
            method3 = cls.getMethod("freeze", new Class[0]);
            method4 = cls.getMethod("abortCreation", new Class[0]);
            method5 = A06(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Unable to collect necessary methods for class ");
            Log.e("TypefaceCompatApi26Impl", AnonymousClass000.A0X(AnonymousClass000.A0O(e), A0o), e);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.A00 = cls;
        this.A01 = constructor;
        this.A03 = method;
        this.A04 = method2;
        this.A06 = method3;
        this.A02 = method4;
        this.A05 = method5;
    }
}
