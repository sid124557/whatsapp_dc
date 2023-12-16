package X;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.0Pv  reason: invalid class name and case insensitive filesystem */
public final class C04610Pv {
    public int A00;
    public AnonymousClass0Xq A01;
    public AnonymousClass0Xq A02;
    public AnonymousClass0GD A03;
    public Set A04;
    public UUID A05;
    public final int A06;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C04610Pv.class == obj.getClass()) {
            C04610Pv r4 = (C04610Pv) obj;
            if (this.A00 == r4.A00 && this.A06 == r4.A06 && this.A05.equals(r4.A05) && this.A03 == r4.A03 && this.A01.equals(r4.A01) && this.A04.equals(r4.A04)) {
                return this.A02.equals(r4.A02);
            }
        }
        return false;
    }

    public int hashCode() {
        int A08 = AnonymousClass000.A08(this.A03, this.A05.hashCode() * 31);
        return ((AnonymousClass000.A08(this.A02, (AnonymousClass000.A08(this.A01, A08) + this.A04.hashCode()) * 31) + this.A00) * 31) + this.A06;
    }

    public C04610Pv(AnonymousClass0Xq r2, AnonymousClass0Xq r3, AnonymousClass0GD r4, List list, UUID uuid, int i, int i2) {
        this.A05 = uuid;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = new HashSet(list);
        this.A02 = r3;
        this.A00 = i;
        this.A06 = i2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WorkInfo{mId='");
        A0o.append(this.A05);
        A0o.append('\'');
        A0o.append(", mState=");
        A0o.append(this.A03);
        A0o.append(", mOutputData=");
        A0o.append(this.A01);
        A0o.append(", mTags=");
        A0o.append(this.A04);
        A0o.append(", mProgress=");
        return AnonymousClass000.A0Q(this.A02, A0o);
    }
}
