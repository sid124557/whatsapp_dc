package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* renamed from: X.0Qq  reason: invalid class name and case insensitive filesystem */
public class C04780Qq {
    public int A00 = -1;
    public C03900Lz A01;
    public C03900Lz A02;
    public C03900Lz A03;
    public final View A04;
    public final AnonymousClass0XJ A05;

    public void A03() {
        this.A00 = -1;
        this.A02 = null;
        A02();
        A02();
    }

    public static ColorStateList A00(C04780Qq r0) {
        C03900Lz r02 = r0.A01;
        if (r02 != null) {
            return r02.A00;
        }
        return null;
    }

    public static PorterDuff.Mode A01(C04780Qq r0) {
        C03900Lz r02 = r0.A01;
        if (r02 != null) {
            return r02.A01;
        }
        return null;
    }

    public void A02() {
        View view = this.A04;
        Drawable background = view.getBackground();
        if (background != null) {
            if (Build.VERSION.SDK_INT <= 21 || this.A02 != null) {
                C03900Lz r2 = this.A03;
                if (r2 == null) {
                    r2 = new C03900Lz();
                    this.A03 = r2;
                }
                r2.A00 = null;
                r2.A02 = false;
                r2.A01 = null;
                r2.A03 = false;
                ColorStateList A032 = AnonymousClass0YZ.A03(view);
                if (A032 != null) {
                    r2.A02 = true;
                    r2.A00 = A032;
                }
                PorterDuff.Mode A042 = AnonymousClass0YZ.A04(view);
                if (A042 != null) {
                    r2.A03 = true;
                    r2.A01 = A042;
                }
                if (r2.A02 || r2.A03) {
                    AnonymousClass0XW.A04(background, r2, view.getDrawableState());
                    return;
                }
            }
            C03900Lz r1 = this.A01;
            if (r1 != null || (r1 = this.A02) != null) {
                AnonymousClass0XW.A04(background, r1, view.getDrawableState());
            }
        }
    }

    public void A04(int i) {
        ColorStateList A052;
        this.A00 = i;
        AnonymousClass0XJ r2 = this.A05;
        if (r2 != null) {
            Context context = this.A04.getContext();
            synchronized (r2) {
                A052 = r2.A00.A05(context, i);
            }
            if (A052 != null) {
                C03900Lz r1 = this.A02;
                if (r1 == null) {
                    r1 = new C03900Lz();
                    this.A02 = r1;
                }
                r1.A00 = A052;
                r1.A02 = true;
                A02();
                A02();
            }
        }
        this.A02 = null;
        A02();
        A02();
    }

    public void A05(ColorStateList colorStateList) {
        C03900Lz r1 = this.A01;
        if (r1 == null) {
            r1 = new C03900Lz();
            this.A01 = r1;
        }
        r1.A00 = colorStateList;
        r1.A02 = true;
        A02();
    }

    public void A06(PorterDuff.Mode mode) {
        C03900Lz r1 = this.A01;
        if (r1 == null) {
            r1 = new C03900Lz();
            this.A01 = r1;
        }
        r1.A01 = mode;
        r1.A03 = true;
        A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        r5.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.view.View r7 = r10.A04
            android.content.Context r0 = r7.getContext()
            int[] r8 = X.AnonymousClass0KC.A0P
            r1 = 0
            r6 = r11
            r9 = r12
            X.0UD r3 = X.AnonymousClass0UD.A00(r0, r11, r8, r12, r1)
            android.content.Context r4 = r7.getContext()
            android.content.res.TypedArray r5 = r3.A02
            X.C06560Yg.A0B(r4, r5, r6, r7, r8, r9)
            boolean r0 = r5.hasValue(r1)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x004e
            r0 = -1
            int r0 = r5.getResourceId(r1, r0)     // Catch:{ all -> 0x0075 }
            r10.A00 = r0     // Catch:{ all -> 0x0075 }
            X.0XJ r4 = r10.A05     // Catch:{ all -> 0x0075 }
            android.content.Context r2 = r7.getContext()     // Catch:{ all -> 0x0075 }
            int r1 = r10.A00     // Catch:{ all -> 0x0075 }
            monitor-enter(r4)     // Catch:{ all -> 0x0075 }
            X.0XW r0 = r4.A00     // Catch:{ all -> 0x0038 }
            android.content.res.ColorStateList r0 = r0.A05(r2, r1)     // Catch:{ all -> 0x0038 }
            monitor-exit(r4)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x004e
            goto L_0x003b
        L_0x0038:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0075 }
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x003b:
            X.0Lz r1 = r10.A02     // Catch:{ all -> 0x0075 }
            if (r1 != 0) goto L_0x0046
            X.0Lz r1 = new X.0Lz     // Catch:{ all -> 0x0075 }
            r1.<init>()     // Catch:{ all -> 0x0075 }
            r10.A02 = r1     // Catch:{ all -> 0x0075 }
        L_0x0046:
            r1.A00 = r0     // Catch:{ all -> 0x0075 }
            r0 = 1
            r1.A02 = r0     // Catch:{ all -> 0x0075 }
            r10.A02()     // Catch:{ all -> 0x0075 }
        L_0x004e:
            r1 = 1
            boolean r0 = r5.hasValue(r1)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x005c
            android.content.res.ColorStateList r0 = r3.A01(r1)     // Catch:{ all -> 0x0075 }
            X.C06560Yg.A0C(r0, r7)     // Catch:{ all -> 0x0075 }
        L_0x005c:
            r0 = 2
            boolean r0 = r5.hasValue(r0)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0071
            r1 = 2
            r0 = -1
            int r1 = r5.getInt(r1, r0)     // Catch:{ all -> 0x0075 }
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.AnonymousClass0XA.A00(r0, r1)     // Catch:{ all -> 0x0075 }
            X.C06560Yg.A0D(r0, r7)     // Catch:{ all -> 0x0075 }
        L_0x0071:
            r5.recycle()
            return
        L_0x0075:
            r0 = move-exception
            r5.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04780Qq.A07(android.util.AttributeSet, int):void");
    }

    public C04780Qq(View view) {
        this.A04 = view;
        this.A05 = AnonymousClass0XJ.A01();
    }
}
