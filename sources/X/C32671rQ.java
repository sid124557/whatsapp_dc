package X;

import java.util.List;

/* renamed from: X.1rQ  reason: invalid class name and case insensitive filesystem */
public final class C32671rQ extends AnonymousClass290 {
    public final List A00;

    public C32671rQ(List list) {
        C162457s7.A0J(list, 1);
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C32671rQ) && C162457s7.A0P(this.A00, ((C32671rQ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StickerPacks(packs=");
        return C18260x0.A04(this.A00, A0o);
    }
}
