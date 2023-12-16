package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Xk  reason: invalid class name */
public final class AnonymousClass0Xk {
    public static int A00(int i, int i2) {
        if (i == 1 || i2 == 0) {
            return C159577m7.A00;
        }
        return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
    }

    public static int A01(int i, int i2) {
        if (i != 1 || i2 == 0) {
            return C159577m7.A00;
        }
        return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
    }

    public static final C152007Xe A05(AnonymousClass84O r6) {
        int A00 = AnonymousClass0JD.A00(r6);
        boolean z = false;
        boolean A0W = r6.A0W(73, false);
        List A0Q = r6.A0Q();
        C162457s7.A0D(A0Q);
        Iterator it = A0Q.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            AnonymousClass84O r0 = (AnonymousClass84O) next;
            C162457s7.A0B(r0);
            if (AnonymousClass0JE.A00(r0)) {
                if (next != null) {
                    z = true;
                }
            }
        }
        return new C01930Ct(A00, A0W, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (r3 != 0) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081 A[Catch:{ 6u2 -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[Catch:{ 6u2 -> 0x008e }, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C04580Ov A04(X.AnonymousClass84O r11) {
        /*
            r0 = 55
            java.lang.String r0 = r11.A0O(r0)     // Catch:{ 6u2 -> 0x008e }
            r2 = 0
            float r10 = X.C162407s0.A03(r0, r2)     // Catch:{ 6u2 -> 0x008e }
            r0 = 56
            java.lang.String r0 = r11.A0O(r0)     // Catch:{ 6u2 -> 0x008e }
            float r8 = X.C162407s0.A03(r0, r2)     // Catch:{ 6u2 -> 0x008e }
            r0 = 44
            java.lang.String r0 = r11.A0O(r0)     // Catch:{ 6u2 -> 0x008e }
            float r9 = X.C162407s0.A03(r0, r2)     // Catch:{ 6u2 -> 0x008e }
            r0 = 100
            java.lang.String r0 = r11.A0O(r0)     // Catch:{ 6u2 -> 0x008e }
            X.6wJ r5 = X.C141896wJ.STRETCH     // Catch:{ 6u2 -> 0x008e }
            X.6wJ r7 = X.AnonymousClass0VE.A00(r5, r0)     // Catch:{ 6u2 -> 0x008e }
            r6 = 0
            if (r7 != r5) goto L_0x0072
            java.util.List r1 = r11.A0Q()     // Catch:{ 6u2 -> 0x008e }
            X.C162457s7.A0D(r1)     // Catch:{ 6u2 -> 0x008e }
            boolean r0 = r1 instanceof java.util.Collection     // Catch:{ 6u2 -> 0x008e }
            if (r0 == 0) goto L_0x0040
            boolean r0 = r1.isEmpty()     // Catch:{ 6u2 -> 0x008e }
            if (r0 == 0) goto L_0x0040
            goto L_0x0082
        L_0x0040:
            java.util.Iterator r4 = r1.iterator()     // Catch:{ 6u2 -> 0x008e }
            r3 = 0
        L_0x0045:
            boolean r0 = r4.hasNext()     // Catch:{ 6u2 -> 0x008e }
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r4.next()     // Catch:{ 6u2 -> 0x008e }
            X.84O r0 = (X.AnonymousClass84O) r0     // Catch:{ 6u2 -> 0x008e }
            X.84O r1 = r0.A0I()     // Catch:{ 6u2 -> 0x008e }
            r0 = r6
            if (r1 == 0) goto L_0x005e
            r0 = 42
            java.lang.String r0 = r1.A0O(r0)     // Catch:{ 6u2 -> 0x008e }
        L_0x005e:
            X.6wJ r0 = X.AnonymousClass0VE.A00(r7, r0)     // Catch:{ 6u2 -> 0x008e }
            if (r0 == r5) goto L_0x0045
            int r3 = r3 + 1
            if (r3 >= 0) goto L_0x0045
            X.AnonymousClass8UF.A0q()     // Catch:{ 6u2 -> 0x008e }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0L()     // Catch:{ 6u2 -> 0x008e }
            throw r0     // Catch:{ 6u2 -> 0x008e }
        L_0x0070:
            if (r3 == 0) goto L_0x0082
        L_0x0072:
            r1 = 1
        L_0x0073:
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0084
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0084
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0084
            if (r1 == 0) goto L_0x008d
            goto L_0x0084
        L_0x0082:
            r1 = 0
            goto L_0x0073
        L_0x0084:
            int r11 = X.AnonymousClass0JD.A00(r11)     // Catch:{ 6u2 -> 0x008e }
            X.09R r6 = new X.09R     // Catch:{ 6u2 -> 0x008e }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ 6u2 -> 0x008e }
        L_0x008d:
            return r6
        L_0x008e:
            java.lang.String r0 = "Invalid pixel format for Collection spacing"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Xk.A04(X.84O):X.0Ov");
    }

    public static final int A02(AnonymousClass84O r7, int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int A00 = A00(i, size);
        AnonymousClass84O A0I = r7.A0I();
        if (A0I != null && A0I.A0D() == 13366) {
            String A0O = A0I.A0O(35);
            if (i == 1 && A0O != null) {
                try {
                    C157397iE A0D = C162407s0.A0D(A0O);
                    float f = A0D.A00;
                    int ordinal = A0D.A01.ordinal();
                    if (ordinal == 0) {
                        return View.MeasureSpec.makeMeasureSpec((int) f, 1073741824);
                    }
                    if (ordinal == 1) {
                        return View.MeasureSpec.makeMeasureSpec((int) (((double) (f * ((float) size))) / 100.0d), 1073741824);
                    }
                } catch (AnonymousClass6u2 unused) {
                    C159737mN.A01("ListCollectionMeasureHelper", AnonymousClass000.A0V("Error parsing style height: ", A0O, AnonymousClass001.A0o()));
                }
            }
        }
        return A00;
    }

    public static final int A03(AnonymousClass84O r6, int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int A01 = A01(i, size);
        AnonymousClass84O A0I = r6.A0I();
        if (A0I != null && A0I.A0D() == 13366) {
            String A0O = A0I.A0O(41);
            if (i == 0 && A0O != null) {
                try {
                    C157397iE A0D = C162407s0.A0D(A0O);
                    float f = A0D.A00;
                    int ordinal = A0D.A01.ordinal();
                    if (ordinal == 0) {
                        return View.MeasureSpec.makeMeasureSpec((int) f, 1073741824);
                    }
                    if (ordinal == 1) {
                        return View.MeasureSpec.makeMeasureSpec((int) (((double) (f * ((float) size))) / 100.0d), 1073741824);
                    }
                } catch (AnonymousClass6u2 unused) {
                    C159737mN.A01("ListCollectionMeasureHelper", AnonymousClass000.A0V("Error parsing style width: ", A0O, AnonymousClass001.A0o()));
                }
            }
        }
        return A01;
    }
}
