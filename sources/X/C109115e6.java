package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.5e6  reason: invalid class name and case insensitive filesystem */
public class C109115e6 implements InputFilter {
    public final /* synthetic */ AnonymousClass5WL A00;

    public C109115e6(AnonymousClass5WL r1) {
        this.A00 = r1;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        boolean z;
        Spanned spanned2 = spanned;
        boolean z2 = false;
        int i5 = i3;
        int i6 = i4;
        int A03 = C107415bH.A03(spanned2, 0, spanned2.length()) - C107415bH.A03(spanned2, i5, i6);
        int A032 = C107415bH.A03(charSequence, i, i2) + A03;
        AnonymousClass5WL r7 = this.A00;
        int A002 = (AnonymousClass5WL.A00(spanned2, 0, spanned2.length()) - AnonymousClass5WL.A00(spanned2, i5, i6)) + 1;
        int A003 = AnonymousClass5WL.A00(charSequence, i, i2) + A002;
        StringBuilder A0A = C18330xA.A0A(spanned2.toString());
        A0A.replace(i5, i6, charSequence.subSequence(i, i2).toString());
        String A033 = r7.A0F.A03(A0A.toString());
        int A034 = C107415bH.A03(A0A, 0, A0A.length());
        int A004 = AnonymousClass5WL.A00(A0A.toString(), 0, A0A.length()) + 1;
        int i7 = 5;
        int i8 = 350;
        if (A033 == null || r7.A06.getVisibility() == 0 || (A034 <= 350 && A004 <= 5)) {
            z = false;
        } else {
            z = true;
        }
        r7.A05 = z;
        if (A033 != null && !A033.equals(r7.A03) && !z) {
            z2 = true;
        }
        r7.A0L.A01 = z2;
        if (!z2) {
            i8 = 700;
            i7 = 10;
        }
        int i9 = i8 - A03;
        int i10 = i7 - A002;
        if (A032 <= i8 && A003 <= i7) {
            return null;
        }
        if (A03 < i8 && A002 < i7) {
            r7.A0M.A00(i8, i7);
            return C107415bH.A05(charSequence, i, i2, i10, i9);
        } else if (i2 - i <= 0) {
            return "";
        } else {
            r7.A0M.A00(i8, i7);
            return "";
        }
    }
}
