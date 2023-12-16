package X;

/* renamed from: X.4Km  reason: invalid class name and case insensitive filesystem */
public class C86534Km implements AnonymousClass4AN {
    public Object A00;
    public final int A01;

    public C86534Km(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final C84594Cy B00(String str) {
        int i = this.A01;
        Object obj = this.A00;
        String str2 = str;
        if (i != 0) {
            C162457s7.A0J(str, 1);
            C39922Dv r1 = ((C43312Rq) obj).A00;
            if (r1 != null) {
                AnonymousClass1VX A4B = C64333Db.A4B(r1.A00.A01);
                C64333Db r0 = r1.A00.A01;
                AnonymousClass3FI A8x = C64333Db.A8x(r0);
                return new C34631vT(C64333Db.A07(r0), C64333Db.A2s(r0), A4B, C64333Db.A7R(r0), A8x, C64333Db.A9V(r0), str2, r0.Aav, r0.Aaz);
            }
            throw C18270x1.A0S("graphqlRequestFactory");
        }
        C162457s7.A0J(str, 1);
        return ((C67293Os) obj).A02.B00(str);
    }
}
