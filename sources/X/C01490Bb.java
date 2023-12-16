package X;

import java.util.List;

/* renamed from: X.0Bb  reason: invalid class name and case insensitive filesystem */
public class C01490Bb extends AnonymousClass0BW {
    public final AnonymousClass0LJ A00;

    public /* bridge */ /* synthetic */ Object A0B(C06230Wt r11, float f) {
        AnonymousClass0LJ r8 = this.A00;
        AnonymousClass0LJ r7 = (AnonymousClass0LJ) r11.A0F;
        AnonymousClass0LJ r9 = (AnonymousClass0LJ) r11.A09;
        int[] iArr = r7.A01;
        int length = iArr.length;
        int[] iArr2 = r9.A01;
        int length2 = iArr2.length;
        if (length == length2) {
            for (int i = 0; i < length; i++) {
                r8.A00[i] = AnonymousClass001.A00(r9.A00[i], r7.A00[i], f);
                r8.A01[i] = AnonymousClass0VB.A02(f, iArr[i], iArr2[i]);
            }
            return r8;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Cannot interpolate between gradients. Lengths vary (");
        A0o.append(length);
        A0o.append(" vs ");
        A0o.append(length2);
        throw AnonymousClass000.A0F(")", A0o);
    }

    public C01490Bb(List list) {
        super(list);
        int i = 0;
        AnonymousClass0LJ r1 = (AnonymousClass0LJ) AnonymousClass001.A0b(list, 0).A0F;
        i = r1 != null ? r1.A01.length : i;
        this.A00 = new AnonymousClass0LJ(new float[i], new int[i]);
    }
}
