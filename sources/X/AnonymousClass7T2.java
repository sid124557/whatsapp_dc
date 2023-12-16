package X;

/* renamed from: X.7T2  reason: invalid class name */
public class AnonymousClass7T2 {
    public final C149447Mm A00;
    public final C149447Mm A01;
    public final boolean A02;

    public String A00() {
        String str = this.A01.A00;
        String str2 = this.A00.A00;
        if (str.equals(str2)) {
            return str;
        }
        return AnonymousClass000.A0V(";", str2, AnonymousClass000.A0l(str));
    }

    public AnonymousClass7T2(String str, boolean z) {
        this.A02 = z;
        int indexOf = str.indexOf(59);
        if (indexOf == -1) {
            C149447Mm r0 = new C149447Mm(str, z);
            this.A00 = r0;
            this.A01 = r0;
            return;
        }
        this.A01 = new C149447Mm(AnonymousClass0x7.A0r(str, indexOf), z);
        this.A00 = new C149447Mm(AnonymousClass6C9.A0c(indexOf, str), z);
    }
}
