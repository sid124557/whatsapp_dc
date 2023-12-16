package X;

/* renamed from: X.2XM  reason: invalid class name */
public final class AnonymousClass2XM {
    public final String A00;
    public final boolean A01;

    public String toString() {
        String str = this.A00;
        boolean z = this.A01;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("{");
        sb.append(str);
        return AnonymousClass000.A0b("}", sb, z);
    }

    public AnonymousClass2XM(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
