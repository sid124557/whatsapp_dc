package X;

/* renamed from: X.6Wc  reason: invalid class name and case insensitive filesystem */
public class C128446Wc extends C157117hl {
    public final C152537Zg A00;
    public final Character A01;

    public final boolean equals(Object obj) {
        if (obj instanceof C128446Wc) {
            C128446Wc r4 = (C128446Wc) obj;
            if (this.A00.equals(r4.A00)) {
                Character ch = this.A01;
                Character ch2 = r4.A01;
                if (ch == ch2) {
                    return true;
                }
                if (ch == null || !ch.equals(ch2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ AnonymousClass000.A07(this.A01);
    }

    public final String toString() {
        String str;
        StringBuilder A0A = C18330xA.A0A("BaseEncoding.");
        C152537Zg r0 = this.A00;
        A0A.append(r0);
        if (8 % r0.A00 != 0) {
            Character ch = this.A01;
            if (ch == null) {
                str = ".omitPadding()";
            } else {
                A0A.append(".withPadChar('");
                A0A.append(ch);
                str = "')";
            }
            A0A.append(str);
        }
        return A0A.toString();
    }

    public C128446Wc(C152537Zg r5, Character ch) {
        this.A00 = r5;
        if (ch == null || r5.A04[61] == -1) {
            this.A01 = ch;
        } else {
            throw AnonymousClass001.A0c(AnonymousClass72W.A00("Padding character %s was already in alphabet", ch));
        }
    }
}
