package X;

/* renamed from: X.2mI  reason: invalid class name and case insensitive filesystem */
public final class C52942mI {
    public final C105365Uq A00;
    public final AnonymousClass3ZH A01;
    public final AnonymousClass4GQ A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52942mI) {
                C52942mI r5 = (C52942mI) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || this.A03 != r5.A03 || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, AnonymousClass0x2.A01(AnonymousClass000.A08(this.A02, C18300x5.A04(this.A01)), this.A03));
    }

    public C52942mI(C105365Uq r2, AnonymousClass3ZH r3, AnonymousClass4GQ r4, boolean z) {
        C18260x0.A0Q(r3, r4);
        C162457s7.A0J(r2, 4);
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = z;
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UiState(contact=");
        A0o.append(this.A01);
        A0o.append(", onRemoveClick=");
        A0o.append(this.A02);
        A0o.append(", optionalParticipants=");
        A0o.append(this.A03);
        A0o.append(", contactPhotoLoader=");
        return C18260x0.A04(this.A00, A0o);
    }
}
