package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2nU  reason: invalid class name and case insensitive filesystem */
public final class C53682nU {
    public final int A00;
    public final int A01;
    public final int A02;
    public final UserJid A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53682nU) {
                C53682nU r5 = (C53682nU) obj;
                if (!(C162457s7.A0P(this.A03, r5.A03) && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A06 == r5.A06 && this.A05 == r5.A05 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01((((((((C18300x5.A04(this.A03) + 12) * 31) + this.A01) * 31) + this.A02) * 31) + this.A00) * 31, this.A06), this.A05), this.A04);
    }

    public C53682nU(UserJid userJid, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.A03 = userJid;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = z3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LinkedAccountMediaRequest(businessJid=");
        A0o.append(this.A03);
        A0o.append(", limit=");
        A0o.append(12);
        A0o.append(", imageHeight=");
        A0o.append(this.A01);
        A0o.append(", imageWidth=");
        A0o.append(this.A02);
        A0o.append(", accountType=");
        A0o.append(this.A00);
        A0o.append(", shouldFilterSensitiveContent=");
        A0o.append(this.A06);
        A0o.append(", shouldFilterIneligiblePosts=");
        A0o.append(this.A05);
        A0o.append(", isTrustCard=");
        return C18260x0.A0A(A0o, this.A04);
    }
}
