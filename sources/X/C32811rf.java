package X;

import java.util.List;

/* renamed from: X.1rf  reason: invalid class name and case insensitive filesystem */
public final class C32811rf extends AnonymousClass293 {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C32811rf) && C162457s7.A0P(this.A00, ((C32811rf) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C32811rf(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StarredAvatarStickerAdded(newStarredStickers=");
        return C18260x0.A04(this.A00, A0o);
    }
}
