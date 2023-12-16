package X;

/* renamed from: X.2jb  reason: invalid class name and case insensitive filesystem */
public final class C51302jb {
    public final AnonymousClass3ZH A00;
    public final String A01;

    public C51302jb(AnonymousClass3ZH r2, String str) {
        C162457s7.A0J(r2, 2);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51302jb) {
                C51302jb r5 = (C51302jb) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C18310x6.A09(this.A01));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GroupChatUiState(groupName=");
        A0o.append(this.A01);
        A0o.append(", contact=");
        return C18260x0.A04(this.A00, A0o);
    }
}
