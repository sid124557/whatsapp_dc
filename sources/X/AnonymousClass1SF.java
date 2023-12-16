package X;

import java.util.List;

/* renamed from: X.1SF  reason: invalid class name */
public class AnonymousClass1SF extends AnonymousClass33W {
    public final List A00;

    public AnonymousClass1SF(AnonymousClass33J r10, String str, List list, long j) {
        super(C60642yt.A03, r10, str, "regular", 7, j, false);
        this.A00 = list;
    }

    public AnonymousClass18L A06() {
        AnonymousClass18L A06 = super.A06();
        C626936e.A06(A06);
        C130546c9 A0G = AnonymousClass1AC.DEFAULT_INSTANCE.A0G();
        List list = this.A00;
        AnonymousClass1AC r2 = (AnonymousClass1AC) C18320x8.A0C(A0G);
        C188248ya r1 = r2.flags_;
        if (!((AnonymousClass8T6) r1).A00) {
            r1 = C130786cX.A07(r1);
            r2.flags_ = r1;
        }
        C170208Ch.A05(list, r1);
        AnonymousClass1EO r22 = (AnonymousClass1EO) C18320x8.A0C(A06);
        AnonymousClass1AC r0 = (AnonymousClass1AC) A0G.A06();
        r0.getClass();
        r22.primaryFeature_ = r0;
        r22.bitField0_ |= 524288;
        return A06;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PrimaryFeatureMutation{");
        A0o.append("featureFlags=");
        A0o.append(this.A00);
        AnonymousClass33W.A02(this, ", rowId='", A0o);
        AnonymousClass33W.A03(this, A0o);
        A0o.append(", collectionName='");
        A0o.append(this.A06);
        A0o.append(", version=");
        A0o.append(this.A03);
        A0o.append(", keyId=");
        return AnonymousClass000.A0Q(this.A00, A0o);
    }
}
