package X;

import java.util.List;

/* renamed from: X.2kk  reason: invalid class name and case insensitive filesystem */
public final class C52012kk {
    public C50612iT A00;
    public List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52012kk) {
                C52012kk r5 = (C52012kk) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18300x5.A04(this.A00) + AnonymousClass000.A07(this.A01);
    }

    public C52012kk(C50612iT r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StickerPreviewState(stickerPack=");
        A0o.append(this.A00);
        A0o.append(", stickerPreviewItems=");
        return C18260x0.A04(this.A01, A0o);
    }
}
