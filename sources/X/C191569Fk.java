package X;

import android.text.TextUtils;

/* renamed from: X.9Fk  reason: invalid class name and case insensitive filesystem */
public class C191569Fk extends AnonymousClass94s {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();

    public C191569Fk(C66663Mh r2, C56612sH r3, C66543Lv r4, AnonymousClass1VX r5, C203499no r6, C45022Yj r7) {
        super(r2, r3, r4, r5, r6, r7);
    }

    public void A0I(String str) {
        AnonymousClass08M r2;
        AnonymousClass9OV r1;
        super.A0I(str);
        String A06 = this.A02.A06(C66663Mh.A27);
        if (TextUtils.isEmpty(A06) || !AnonymousClass36S.A07(str)) {
            boolean isEmpty = TextUtils.isEmpty(A06);
            r2 = this.A00;
            if (!isEmpty) {
                r1 = new AnonymousClass9OV(A06, (String) null);
            } else {
                r2.A0H((Object) null);
                return;
            }
        } else {
            r2 = this.A00;
            r1 = new AnonymousClass9OV(A06, str);
        }
        r2.A0H(r1);
    }
}
