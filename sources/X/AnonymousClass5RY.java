package X;

/* renamed from: X.5RY  reason: invalid class name */
public final class AnonymousClass5RY {
    public final int A00;
    public final String A01;

    public AnonymousClass5RY(int i, String str) {
        C162457s7.A0J(str, 2);
        this.A00 = i;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5RY) {
                AnonymousClass5RY r5 = (AnonymousClass5RY) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ARDGetScriptingMetadataEntity(revision=");
        A0o.append(this.A00);
        A0o.append(", cdnUri=");
        return C18260x0.A07(this.A01, A0o);
    }
}
