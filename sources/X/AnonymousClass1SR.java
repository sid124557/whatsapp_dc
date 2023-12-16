package X;

import java.util.Set;

/* renamed from: X.1SR  reason: invalid class name */
public class AnonymousClass1SR extends AnonymousClass33W {
    public static final Set A02 = new C73383fP();
    public final String A00;
    public final boolean A01;

    public AnonymousClass1SR(AnonymousClass33J r10, String str, String str2, long j, boolean z) {
        super(C60642yt.A03, r10, str, "regular_low", 7, j, false);
        this.A00 = str2;
        this.A01 = z;
    }

    public AnonymousClass18L A06() {
        C130546c9 A0G = C21071Ak.DEFAULT_INSTANCE.A0G();
        boolean z = this.A01;
        C21071Ak r1 = (C21071Ak) C18320x8.A0C(A0G);
        r1.bitField0_ |= 1;
        r1.acknowledged_ = z;
        AnonymousClass18L A06 = super.A06();
        AnonymousClass1EO A002 = AnonymousClass33W.A00(A06);
        C21071Ak r0 = (C21071Ak) A0G.A06();
        r0.getClass();
        A002.nuxAction_ = r0;
        A002.bitField0_ |= 33554432;
        return A06;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NuxSyncMutation{");
        A0o.append("nuxKey=");
        A0o.append(this.A00);
        A0o.append("acknowledged=");
        A0o.append(this.A01);
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
