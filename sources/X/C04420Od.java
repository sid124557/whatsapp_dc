package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: X.0Od  reason: invalid class name and case insensitive filesystem */
public class C04420Od {
    public ColorStateList A00 = null;
    public PorterDuff.Mode A01 = null;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04;
    public final CompoundButton A05;

    public void A00() {
        CompoundButton compoundButton = this.A05;
        Drawable A002 = C03360Jv.A00(compoundButton);
        if (A002 == null) {
            return;
        }
        if (this.A02 || this.A03) {
            Drawable mutate = C06130Wj.A01(A002).mutate();
            if (this.A02) {
                AnonymousClass0YG.A01(this.A00, mutate);
            }
            if (this.A03) {
                AnonymousClass0YG.A04(this.A01, mutate);
            }
            AnonymousClass000.A0t(mutate, compoundButton);
            compoundButton.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:1|2|(2:6|7)|8|9|(1:13)|14|(1:16)|17|(1:19)|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r6 = r9.A05
            android.content.Context r0 = r6.getContext()
            int[] r7 = X.AnonymousClass0KC.A0B
            r1 = 0
            r5 = r10
            r8 = r11
            X.0UD r2 = X.AnonymousClass0UD.A00(r0, r10, r7, r11, r1)
            android.content.Context r3 = r6.getContext()
            android.content.res.TypedArray r4 = r2.A02
            X.C06560Yg.A0B(r3, r4, r5, r6, r7, r8)
            r0 = 1
            boolean r0 = r4.hasValue(r0)     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x002e
            r0 = 1
            int r0 = r4.getResourceId(r0, r1)     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0XW.A02(r6, r0)     // Catch:{ NotFoundException -> 0x002e }
            r6.setButtonDrawable(r0)     // Catch:{ NotFoundException -> 0x002e }
            goto L_0x0041
        L_0x002e:
            boolean r0 = r4.hasValue(r1)     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0041
            int r0 = r4.getResourceId(r1, r1)     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0041
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0XW.A02(r6, r0)     // Catch:{ all -> 0x0068 }
            r6.setButtonDrawable(r0)     // Catch:{ all -> 0x0068 }
        L_0x0041:
            r1 = 2
            boolean r0 = r4.hasValue(r1)     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x004f
            android.content.res.ColorStateList r0 = r2.A01(r1)     // Catch:{ all -> 0x0068 }
            X.C06070Wc.A02(r0, r6)     // Catch:{ all -> 0x0068 }
        L_0x004f:
            r0 = 3
            boolean r0 = r4.hasValue(r0)     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0064
            r1 = 3
            r0 = -1
            int r1 = r4.getInt(r1, r0)     // Catch:{ all -> 0x0068 }
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.AnonymousClass0XA.A00(r0, r1)     // Catch:{ all -> 0x0068 }
            X.C06070Wc.A03(r0, r6)     // Catch:{ all -> 0x0068 }
        L_0x0064:
            r4.recycle()
            return
        L_0x0068:
            r0 = move-exception
            r4.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04420Od.A01(android.util.AttributeSet, int):void");
    }

    public C04420Od(CompoundButton compoundButton) {
        this.A05 = compoundButton;
    }
}
