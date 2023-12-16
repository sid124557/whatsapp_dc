package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.1SI  reason: invalid class name */
public class AnonymousClass1SI extends AnonymousClass33W {
    public final boolean A00;

    public AnonymousClass1SI(AnonymousClass33J r10, String str, long j, boolean z) {
        super(C60642yt.A03, r10, str, "regular_low", 7, j, false);
        this.A00 = z;
    }

    public AnonymousClass18L A06() {
        C130546c9 A0G = C21151As.DEFAULT_INSTANCE.A0G();
        boolean z = this.A00;
        C21151As r1 = (C21151As) C18320x8.A0C(A0G);
        r1.bitField0_ |= 1;
        r1.isTwentyFourHourFormatEnabled_ = z;
        AnonymousClass18L A06 = super.A06();
        AnonymousClass1EO A002 = AnonymousClass33W.A00(A06);
        C21151As r0 = (C21151As) A0G.A06();
        r0.getClass();
        A002.timeFormatAction_ = r0;
        A002.bitField0_ |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
        return A06;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass33W.A02(this, "TimeFormatMutation{rowId=", A0o);
        A0o.append(", is24HourFormat=");
        A0o.append(this.A00);
        AnonymousClass33W.A03(this, A0o);
        AnonymousClass33W.A04(this, A0o);
        return AnonymousClass000.A0Q(this.A00, A0o);
    }
}
