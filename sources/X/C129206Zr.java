package X;

/* renamed from: X.6Zr  reason: invalid class name and case insensitive filesystem */
public final class C129206Zr extends AnonymousClass6Zt {
    public final char A00;

    public String toString() {
        char c = this.A00;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder A0Y = AnonymousClass6CA.A0Y(AnonymousClass6C7.A06(copyValueOf) + 18);
        A0Y.append("CharMatcher.is('");
        A0Y.append(copyValueOf);
        return AnonymousClass000.A0X("')", A0Y);
    }

    public C129206Zr(char c) {
        this.A00 = c;
    }
}
