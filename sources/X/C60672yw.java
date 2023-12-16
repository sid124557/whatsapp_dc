package X;

/* renamed from: X.2yw  reason: invalid class name and case insensitive filesystem */
public final class C60672yw {
    public final long A00;
    public final Boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60672yw) {
                C60672yw r8 = (C60672yw) obj;
                if (!(C162457s7.A0P(this.A01, r8.A01) && this.A00 == r8.A00 && this.A02 == r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass000.A00(AnonymousClass000.A07(this.A01) * 31, this.A00), this.A02);
    }

    public C60672yw(Boolean bool, long j, boolean z) {
        this.A01 = bool;
        this.A00 = j;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LidChatState(isPhoneNumberShared=");
        A0o.append(this.A01);
        A0o.append(", phoneRequestedTimeMs=");
        A0o.append(this.A00);
        A0o.append(", isDuplicateThread=");
        return C18260x0.A0A(A0o, this.A02);
    }

    public C60672yw() {
        this((Boolean) null, 0, false);
    }
}
