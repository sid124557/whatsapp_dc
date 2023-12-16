package X;

/* renamed from: X.1wS  reason: invalid class name and case insensitive filesystem */
public class C35181wS extends C41022Iq implements C180028k6 {
    public String A00;
    public final int A01;

    public C35181wS(AnonymousClass36K r10, int i) {
        String[] strArr;
        Class<String> cls;
        boolean z;
        Object obj;
        Long A0T;
        long j;
        this.A01 = i;
        AnonymousClass36K r2 = r10;
        if (i != 0) {
            strArr = C41022Iq.A03(r10, "set");
            cls = String.class;
            z = false;
            obj = null;
            A0T = AnonymousClass0x2.A0U();
            j = 256;
        } else {
            AnonymousClass36K.A0N(r10, "set");
            strArr = new String[]{"hash"};
            cls = String.class;
            z = false;
            obj = null;
            A0T = AnonymousClass0x2.A0T();
            j = 64;
        }
        this.A00 = (String) C626836d.A06(r2, cls, A0T, Long.valueOf(j), obj, strArr, z);
        this.A00 = r10;
    }
}
