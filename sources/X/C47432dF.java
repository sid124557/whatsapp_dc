package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.io.File;

/* renamed from: X.2dF  reason: invalid class name and case insensitive filesystem */
public final class C47432dF {
    public int A00 = Integer.MAX_VALUE;
    public long A01 = 1048576;
    public Drawable A02;
    public Drawable A03;
    public C153117ah A04;
    public boolean A05 = false;
    public final C69263Wi A06;
    public final C56492s4 A07;
    public final AnonymousClass33K A08;
    public final File A09;
    public final String A0A;

    public C54722pB A01() {
        return new C54722pB(this.A06, this.A08, this, this.A00);
    }

    public C47432dF(C69263Wi r3, C56492s4 r4, AnonymousClass33K r5, File file, String str) {
        this.A06 = r3;
        this.A07 = r4;
        this.A08 = r5;
        this.A09 = file;
        this.A0A = str;
    }

    public static void A00(Context context, C47432dF r2) {
        r2.A00 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        r2.A01 = 16777216;
    }
}
