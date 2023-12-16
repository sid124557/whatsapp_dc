package X;

import java.io.File;

/* renamed from: X.2zK  reason: invalid class name and case insensitive filesystem */
public final class C60882zK {
    public final long A00;
    public final File A01;
    public final Long A02;
    public final String A03;
    public final boolean A04;

    public C60882zK(File file, Long l, String str, long j, boolean z) {
        C162457s7.A0J(str, 1);
        this.A03 = str;
        this.A04 = z;
        this.A00 = j;
        this.A02 = l;
        this.A01 = file;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60882zK) {
                C60882zK r8 = (C60882zK) obj;
                if (!C162457s7.A0P(this.A03, r8.A03) || this.A04 != r8.A04 || this.A00 != r8.A00 || !C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A00(AnonymousClass0x2.A01(C18310x6.A09(this.A03), this.A04), this.A00) + AnonymousClass000.A07(this.A02)) * 31) + C18310x6.A07(this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BackupProducerResult(name=");
        A0o.append(this.A03);
        A0o.append(", success=");
        A0o.append(this.A04);
        A0o.append(", totalSizeInBytes=");
        A0o.append(this.A00);
        A0o.append(", mediaSizeInBytes=");
        A0o.append(this.A02);
        A0o.append(", file=");
        return C18260x0.A04(this.A01, A0o);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C60882zK(String str) {
        this((File) null, (Long) null, str, 0, false);
        C162457s7.A0J(str, 1);
    }
}
