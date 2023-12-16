package X;

/* renamed from: X.7Ye  reason: invalid class name and case insensitive filesystem */
public final class C152257Ye {
    public final C142356x4 A00;
    public final AnonymousClass7Zt A01;
    public final C152747a3 A02;

    public C152257Ye(C142356x4 r2, AnonymousClass7Zt r3, C152747a3 r4) {
        C162457s7.A0J(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152257Ye) {
                C152257Ye r5 = (C152257Ye) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00 || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass000.A08(this.A00, C18300x5.A04(this.A01)));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VideoQueuedInfo(video=");
        A0o.append(this.A01);
        A0o.append(", appendMode=");
        A0o.append(this.A00);
        A0o.append(", videoQueuedContext=");
        return C18260x0.A04(this.A02, A0o);
    }
}
