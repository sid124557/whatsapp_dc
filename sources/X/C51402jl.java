package X;

/* renamed from: X.2jl  reason: invalid class name and case insensitive filesystem */
public final class C51402jl {
    public final C624134x A00;
    public final AnonymousClass4GQ A01;

    public C51402jl(C624134x r2, AnonymousClass4GQ r3) {
        C162457s7.A0J(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51402jl) {
                C51402jl r5 = (C51402jl) obj;
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

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CommunityActivityUiState(lastActivityMessage=");
        A0o.append(this.A00);
        A0o.append(", onActivityClick=");
        return C18260x0.A04(this.A01, A0o);
    }
}
