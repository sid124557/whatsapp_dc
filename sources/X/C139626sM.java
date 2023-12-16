package X;

/* renamed from: X.6sM  reason: invalid class name and case insensitive filesystem */
public class C139626sM extends C41022Iq implements C84794Ds {
    public String A00;
    public final int A01;

    public C139626sM(AnonymousClass36K r12, int i) {
        long j;
        this.A01 = i;
        AnonymousClass36K r4 = r12;
        AnonymousClass36K.A0N(r12, "error");
        String[] A1a = AnonymousClass6C9.A1a();
        Class<Long> cls = Long.class;
        if (i != 0) {
            j = 40602;
        } else {
            j = 40601;
        }
        C626836d.A0F(r12, cls, Long.valueOf(j), A1a);
        this.A00 = (String) C626836d.A06(r4, String.class, AnonymousClass0x2.A0U(), 40L, (Object) null, new String[]{"text"}, false);
        this.A00 = r12;
    }

    public Long B5b() {
        long j;
        if (this.A01 != 0) {
            j = 40602;
        } else {
            j = 40601;
        }
        return Long.valueOf(j);
    }

    public String BDZ() {
        return this.A00;
    }
}
