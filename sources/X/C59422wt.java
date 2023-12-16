package X;

/* renamed from: X.2wt  reason: invalid class name and case insensitive filesystem */
public class C59422wt {
    public final AnonymousClass220 A00;
    public final String A01;
    public final String A02;

    @Deprecated
    public C59422wt(AnonymousClass220 r1, String str, String str2) {
        this.A02 = str;
        this.A00 = r1;
        this.A01 = str2;
    }

    public C59422wt(C54912pU r3) {
        String str = r3.A02;
        C626936e.A06(str);
        this.A02 = str;
        AnonymousClass220 r0 = r3.A00;
        C626936e.A06(r0);
        this.A00 = r0;
        String str2 = "";
        str2 = r3.A05 ? AnonymousClass000.A0X(" PRIMARY KEY", AnonymousClass000.A0l(str2)) : str2;
        str2 = r3.A03 ? AnonymousClass000.A0X(" AUTOINCREMENT", AnonymousClass000.A0l(str2)) : str2;
        str2 = r3.A04 ? AnonymousClass000.A0X(" NOT NULL", AnonymousClass000.A0l(str2)) : str2;
        str2 = r3.A06 ? AnonymousClass000.A0X(" UNIQUE", AnonymousClass000.A0l(str2)) : str2;
        if (!C107575bX.A0F(r3.A01)) {
            StringBuilder A0l = AnonymousClass000.A0l(str2);
            A0l.append(" DEFAULT ");
            str2 = AnonymousClass000.A0X(r3.A01, A0l);
        }
        this.A01 = str2;
    }
}
