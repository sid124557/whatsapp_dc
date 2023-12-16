package X;

import java.util.List;

/* renamed from: X.3Dy  reason: invalid class name and case insensitive filesystem */
public class C64553Dy implements AnonymousClass49A {
    public C631238a A00;
    public final List A01;

    public void BmG(C631238a r1) {
        this.A00 = r1;
    }

    public C64553Dy(List list) {
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        for (Object A1H : this.A01) {
            C18270x1.A1H(A0o, System.getProperty("line.separator"), A1H);
        }
        return String.format("GetCategoriesResponse{categoryResponses=%s}", AnonymousClass000.A1b(A0o));
    }
}
