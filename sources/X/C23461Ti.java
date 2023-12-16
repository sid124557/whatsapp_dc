package X;

import java.util.AbstractCollection;

/* renamed from: X.1Ti  reason: invalid class name and case insensitive filesystem */
public final class C23461Ti extends C47712dh {
    public final AnonymousClass2UW A00;
    public final String A01;

    public C23461Ti(AnonymousClass2UW r2, String str) {
        C162457s7.A0J(str, 1);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23461Ti) {
                C23461Ti r5 = (C23461Ti) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(AnonymousClass2UW r1, String str, AbstractCollection abstractCollection) {
        abstractCollection.add(new C23461Ti(r1, str));
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C18310x6.A09(this.A01));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StickerLoading(id=");
        A0o.append(this.A01);
        A0o.append(", section=");
        return C18260x0.A04(this.A00, A0o);
    }
}
