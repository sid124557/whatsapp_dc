package X;

/* renamed from: X.4zI  reason: invalid class name and case insensitive filesystem */
public final class C97814zI extends C156137g5 {
    public final C108875dh A00;
    public final AnonymousClass4GQ A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C97814zI) {
                C97814zI r5 = (C97814zI) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18300x5.A04(this.A00));
    }

    public C97814zI(C108875dh r3, AnonymousClass4GQ r4) {
        super(C18290x4.A0Z(), 33);
        this.A00 = r3;
        this.A01 = r4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GlobalSearchBusinessPlaceholderItem(businessFilter=");
        A0o.append(this.A00);
        A0o.append(", onChipClickListener=");
        return C18260x0.A04(this.A01, A0o);
    }
}
