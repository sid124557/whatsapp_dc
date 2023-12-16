package X;

/* renamed from: X.2mz  reason: invalid class name and case insensitive filesystem */
public final class C53372mz {
    public final Object A00;
    public final Object A01;
    public final Throwable A02;
    public final AnonymousClass4GQ A03;
    public final AnonymousClass467 A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53372mz) {
                C53372mz r5 = (C53372mz) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((AnonymousClass000.A07(this.A01) * 31) + AnonymousClass000.A07(this.A04)) * 31) + AnonymousClass000.A07(this.A03)) * 31) + AnonymousClass000.A07(this.A00)) * 31) + C18310x6.A07(this.A02);
    }

    public C53372mz(Object obj, Object obj2, Throwable th, AnonymousClass4GQ r4, AnonymousClass467 r5) {
        this.A01 = obj;
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = obj2;
        this.A02 = th;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CompletedContinuation(result=");
        A0o.append(this.A01);
        A0o.append(", cancelHandler=");
        A0o.append(this.A04);
        A0o.append(", onCancellation=");
        A0o.append(this.A03);
        A0o.append(", idempotentResume=");
        A0o.append(this.A00);
        A0o.append(", cancelCause=");
        return C18260x0.A04(this.A02, A0o);
    }
}
