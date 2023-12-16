package X;

/* renamed from: X.5Sg  reason: invalid class name and case insensitive filesystem */
public final class C104765Sg {
    public final C623134n A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104765Sg) {
                C104765Sg r5 = (C104765Sg) obj;
                if (!(C162457s7.A0P(this.A00, r5.A00) && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(C18300x5.A04(this.A00), this.A03), this.A02), this.A01), this.A04);
    }

    public C104765Sg(C623134n r1, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = r1;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = z3;
        this.A04 = z4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EncryptionInfoViewState(businessState=");
        A0o.append(this.A00);
        A0o.append(", isInAppSupportChatOrInAppSurvey=");
        A0o.append(this.A03);
        A0o.append(", isChatPSAJid=");
        A0o.append(this.A02);
        A0o.append(", isBusinessE2EE=");
        A0o.append(this.A01);
        A0o.append(", isMe=");
        return C18260x0.A0A(A0o, this.A04);
    }
}
