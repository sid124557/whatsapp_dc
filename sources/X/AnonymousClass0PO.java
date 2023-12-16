package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: X.0PO  reason: invalid class name */
public class AnonymousClass0PO {
    public C03900Lz A00;
    public C03900Lz A01;
    public final ImageView A02;

    public void A00() {
        ImageView imageView = this.A02;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AnonymousClass0XA.A02(drawable);
            if (Build.VERSION.SDK_INT <= 21) {
                C03900Lz r2 = this.A01;
                if (r2 == null) {
                    r2 = new C03900Lz();
                    this.A01 = r2;
                }
                r2.A00 = null;
                r2.A02 = false;
                r2.A01 = null;
                r2.A03 = false;
                ColorStateList A002 = AnonymousClass0Wd.A00(imageView);
                if (A002 != null) {
                    r2.A02 = true;
                    r2.A00 = A002;
                }
                PorterDuff.Mode A012 = AnonymousClass0Wd.A01(imageView);
                if (A012 != null) {
                    r2.A03 = true;
                    r2.A01 = A012;
                }
                if (r2.A02 || r2.A03) {
                    AnonymousClass0XW.A04(drawable, r2, imageView.getDrawableState());
                    return;
                }
            }
            C03900Lz r1 = this.A00;
            if (r1 != null) {
                AnonymousClass0XW.A04(drawable, r1, imageView.getDrawableState());
            }
        }
    }

    public void A01(int i) {
        Drawable drawable;
        ImageView imageView = this.A02;
        if (i != 0) {
            drawable = AnonymousClass0XW.A02(imageView, i);
            if (drawable != null) {
                AnonymousClass0XA.A02(drawable);
            }
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        A00();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039 A[Catch:{ all -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047 A[Catch:{ all -> 0x0058 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.ImageView r7 = r10.A02
            android.content.Context r1 = r7.getContext()
            int[] r8 = X.AnonymousClass0KC.A05
            r0 = 0
            r6 = r11
            r9 = r12
            X.0UD r3 = X.AnonymousClass0UD.A00(r1, r11, r8, r12, r0)
            android.content.Context r4 = r7.getContext()
            android.content.res.TypedArray r5 = r3.A02
            X.C06560Yg.A0B(r4, r5, r6, r7, r8, r9)
            android.graphics.drawable.Drawable r0 = r7.getDrawable()     // Catch:{ all -> 0x0058 }
            r2 = -1
            if (r0 != 0) goto L_0x002f
            r0 = 1
            int r0 = r5.getResourceId(r0, r2)     // Catch:{ all -> 0x0058 }
            if (r0 == r2) goto L_0x0032
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0XW.A02(r7, r0)     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0032
            r7.setImageDrawable(r0)     // Catch:{ all -> 0x0058 }
        L_0x002f:
            X.AnonymousClass0XA.A02(r0)     // Catch:{ all -> 0x0058 }
        L_0x0032:
            r1 = 2
            boolean r0 = r5.hasValue(r1)     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0040
            android.content.res.ColorStateList r0 = r3.A01(r1)     // Catch:{ all -> 0x0058 }
            X.C05040Rr.A00(r0, r7)     // Catch:{ all -> 0x0058 }
        L_0x0040:
            r0 = 3
            boolean r0 = r5.hasValue(r0)     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0054
            r0 = 3
            int r1 = r5.getInt(r0, r2)     // Catch:{ all -> 0x0058 }
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.AnonymousClass0XA.A00(r0, r1)     // Catch:{ all -> 0x0058 }
            X.C05040Rr.A01(r0, r7)     // Catch:{ all -> 0x0058 }
        L_0x0054:
            r5.recycle()
            return
        L_0x0058:
            r0 = move-exception
            r5.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PO.A02(android.util.AttributeSet, int):void");
    }

    public AnonymousClass0PO(ImageView imageView) {
        this.A02 = imageView;
    }
}
