package X;

/* renamed from: X.3WG  reason: invalid class name */
public class AnonymousClass3WG implements C84944Ei {
    public final AnonymousClass33p A00;

    public /* synthetic */ void BK1(String str) {
    }

    public /* synthetic */ void BK5(AnonymousClass2P4 r1) {
    }

    public AnonymousClass3WG(AnonymousClass33p r1) {
        this.A00 = r1;
    }

    public void BKL(String str) {
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append("/priv/last=");
        AnonymousClass33p r3 = this.A00;
        C183538qC r5 = r3.A01;
        C18260x0.A1L(A0l, AnonymousClass35B.A03("last", C18300x5.A0B(r5).getInt("privacy_last_seen", 0)));
        StringBuilder A0l2 = AnonymousClass000.A0l(str);
        A0l2.append("/priv/pic=");
        C18260x0.A1L(A0l2, AnonymousClass35B.A03("profile", C18280x3.A02(AnonymousClass0x2.A0F(r3), "privacy_profile_photo")));
        StringBuilder A0l3 = AnonymousClass000.A0l(str);
        A0l3.append("/priv/status=");
        C18260x0.A1L(A0l3, AnonymousClass35B.A03("status", C18300x5.A0B(r5).getInt("privacy_status", 0)));
        StringBuilder A0l4 = AnonymousClass000.A0l(str);
        A0l4.append("/priv/readreceipts=");
        C18260x0.A1V(A0l4, r3.A2G());
    }
}
