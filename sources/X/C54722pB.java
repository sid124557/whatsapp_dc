package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.io.File;

/* renamed from: X.2pB  reason: invalid class name and case insensitive filesystem */
public class C54722pB {
    public Drawable A00;
    public final int A01;
    public final C153117ah A02;
    public final boolean A03;

    public void A00() {
        this.A02.A03(false);
    }

    public void A02(Drawable drawable, Drawable drawable2, ImageView imageView, String str) {
        A01(drawable, drawable2, imageView, (C185158tB) null, str);
    }

    public void A03(ImageView imageView, String str) {
        A01((Drawable) null, (Drawable) null, imageView, (C185158tB) null, str);
    }

    public void A01(Drawable drawable, Drawable drawable2, ImageView imageView, C185158tB r15, String str) {
        int i = this.A01;
        String str2 = str;
        this.A02.A02(new AnonymousClass8EH(drawable, drawable2, imageView, r15, str2, str2, i, i), this.A03);
    }

    public C54722pB(C69263Wi r10, AnonymousClass33K r11, C47432dF r12, int i) {
        C153117ah r0 = r12.A04;
        if (r0 == null) {
            C56492s4 r2 = r12.A07;
            Drawable drawable = r12.A03;
            File file = r12.A09;
            long j = r12.A01;
            String str = r12.A0A;
            r0 = new AnonymousClass1LW(r10, r2, new AnonymousClass8EF(drawable, (Drawable) null), r11, file, str, j);
        }
        this.A02 = r0;
        this.A03 = r12.A05;
        this.A01 = i;
        this.A00 = r12.A02;
    }
}
