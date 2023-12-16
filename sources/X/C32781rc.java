package X;

import java.util.List;

/* renamed from: X.1rc  reason: invalid class name and case insensitive filesystem */
public final class C32781rc extends AnonymousClass292 {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C32781rc) && C162457s7.A0P(this.A00, ((C32781rc) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C32781rc(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StickerList(stickers=");
        return C18260x0.A04(this.A00, A0o);
    }
}
