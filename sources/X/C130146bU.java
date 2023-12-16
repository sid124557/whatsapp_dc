package X;

/* renamed from: X.6bU  reason: invalid class name and case insensitive filesystem */
public final class C130146bU extends C1447872y {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C1447872y)) {
                return false;
            }
            C130146bU r4 = (C130146bU) ((C1447872y) obj);
            if (!this.A00.equals(r4.A00) || !this.A01.equals(r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public C130146bU(String str, String str2) {
        if (str != null) {
            this.A00 = str;
            if (str2 != null) {
                this.A01 = str2;
                return;
            }
            throw AnonymousClass001.A0g("Null version");
        }
        throw AnonymousClass001.A0g("Null libraryName");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LibraryVersion{libraryName=");
        A0o.append(this.A00);
        A0o.append(", version=");
        A0o.append(this.A01);
        return AnonymousClass000.A0g(A0o);
    }
}
