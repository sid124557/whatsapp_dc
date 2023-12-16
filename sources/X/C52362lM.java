package X;

/* renamed from: X.2lM  reason: invalid class name and case insensitive filesystem */
public class C52362lM {
    public Long A00;
    public final C95814uZ A01;
    public final Long A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C52362lM r4 = (C52362lM) obj;
            if (this.A01.equals(r4.A01)) {
                return this.A02.equals(r4.A02);
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, C18300x5.A04(this.A01));
    }

    public C52362lM(C95814uZ r1, Long l) {
        this.A01 = r1;
        this.A02 = l;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MutedChat{chatJid=");
        A0o.append(this.A01);
        A0o.append(", muteEndTimestampMs=");
        return AnonymousClass000.A0Q(this.A02, A0o);
    }
}
