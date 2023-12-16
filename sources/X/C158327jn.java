package X;

import java.util.Arrays;

/* renamed from: X.7jn  reason: invalid class name and case insensitive filesystem */
public final class C158327jn {
    public static final C158327jn A01;
    public static final C158327jn A02 = new C158327jn(new int[]{2, 5, 6});
    public static final AnonymousClass8OQ A03;
    public final int[] A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C158327jn) && Arrays.equals(this.A00, ((C158327jn) obj).A00);
        }
        return true;
    }

    public int hashCode() {
        return 8 + (Arrays.hashCode(this.A00) * 31);
    }

    static {
        int[] A0E = C18330xA.A0E();
        A0E[0] = 2;
        A01 = new C158327jn(A0E);
        C160667o6 r2 = new C160667o6();
        Integer A0c = C18290x4.A0c();
        Integer A0d = C18290x4.A0d();
        r2.put(A0c, A0d);
        r2.put(17, A0d);
        r2.put(AnonymousClass0x7.A0g(), A0d);
        r2.put(18, A0d);
        r2.put(A0d, 8);
        r2.put(8, 8);
        r2.put(14, 8);
        A03 = r2.build();
    }

    public C158327jn(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.A00 = copyOf;
        Arrays.sort(copyOf);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AudioCapabilities[maxChannelCount=");
        A0o.append(8);
        A0o.append(", supportedEncodings=");
        return AnonymousClass000.A0W(Arrays.toString(this.A00), A0o);
    }
}
