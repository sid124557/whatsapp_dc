package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.1SE  reason: invalid class name */
public class AnonymousClass1SE extends AnonymousClass33W {
    public final String A00;

    public AnonymousClass1SE(AnonymousClass33J r10, String str, String str2, long j) {
        super(C60642yt.A03, r10, str, "critical_block", 3, j, false);
        this.A00 = str2;
    }

    public AnonymousClass18L A06() {
        AnonymousClass18L A06 = super.A06();
        C626936e.A06(A06);
        C130546c9 A0G = C21061Aj.DEFAULT_INSTANCE.A0G();
        String str = this.A00;
        C21061Aj r1 = (C21061Aj) C18320x8.A0C(A0G);
        str.getClass();
        r1.bitField0_ |= 1;
        r1.locale_ = str;
        AnonymousClass1EO r12 = (AnonymousClass1EO) C18320x8.A0C(A06);
        C21061Aj r0 = (C21061Aj) A0G.A06();
        r0.getClass();
        r12.localeSetting_ = r0;
        r12.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        return A06;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass33W.A02(this, "LocaleSyncMutation{rowId=", A0o);
        A0o.append(", locale=");
        A0o.append(this.A00);
        AnonymousClass33W.A03(this, A0o);
        AnonymousClass33W.A04(this, A0o);
        return AnonymousClass000.A0Q(this.A00, A0o);
    }
}
