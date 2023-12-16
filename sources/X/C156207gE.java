package X;

import android.text.Layout;
import java.util.Comparator;

/* renamed from: X.7gE  reason: invalid class name and case insensitive filesystem */
public final class C156207gE {
    public static final Comparator A02 = new AnonymousClass91S(8);
    public final int A00;
    public final C157037hc A01;

    public C156207gE(Layout.Alignment alignment, CharSequence charSequence, float f, float f2, int i, int i2, int i3, int i4, boolean z) {
        C157757ip r1 = new C157757ip();
        r1.A0E = charSequence;
        r1.A0D = alignment;
        r1.A01 = f;
        r1.A07 = 0;
        r1.A06 = i;
        r1.A02 = f2;
        r1.A08 = i2;
        r1.A04 = -3.4028235E38f;
        if (z) {
            r1.A0B = i3;
            r1.A0F = true;
        }
        this.A01 = r1.A00();
        this.A00 = i4;
    }
}
