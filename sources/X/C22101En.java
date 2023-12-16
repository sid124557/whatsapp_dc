package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.Objects;

/* renamed from: X.1En  reason: invalid class name and case insensitive filesystem */
public final class C22101En extends C86994Mr {
    public final C56972sr A00;
    public final AnonymousClass67D A01;
    public final AnonymousClass33U A02;
    public final C56982ss A03;
    public final C56892sj A04;
    public final AnonymousClass3ZM A05;
    public final C95814uZ A06;
    public final C183538qC A07;

    public void onClick(View view) {
        C27991fJ A012;
        Integer valueOf;
        C95814uZ r2 = this.A05.A00;
        if (!this.A00.A0a(r2)) {
            C89654ea r6 = (C89654ea) C111095hX.A03(view.getContext(), C89654ea.class);
            if (C155477ey.A00(r2)) {
                AnonymousClass4HX r3 = new AnonymousClass4HX(r6, this, r2, 1);
                C162457s7.A0J(r6, 0);
                ((C112185jK) ((C1229766o) this.A07.get())).A08.A00(r6, r3, C996357k.INVOKE, C18290x4.A0b());
            } else if (r2 instanceof UserJid) {
                r6.startActivity(C627736r.A0l(r6, (UserJid) r2, C18320x8.A0W(), true, true));
            } else if (r2 instanceof C27991fJ) {
                C95814uZ r1 = this.A06;
                if (C627336j.A0K(r1) && (A012 = AnonymousClass34R.A01(r1)) != null) {
                    AnonymousClass33U r9 = this.A02;
                    int B9t = r9.A00.B9t(A012);
                    int A062 = r9.A02.A06(A012);
                    Integer A013 = AnonymousClass33U.A01(B9t);
                    long A002 = (long) C56892sj.A00(r9.A03, A012);
                    int i = 1;
                    if (A062 != 0) {
                        i = 8;
                        if (A062 != 1) {
                            i = 6;
                            if (A062 != 2) {
                                if (A062 == 3) {
                                    i = 7;
                                } else if (A062 != 6) {
                                    valueOf = null;
                                    if (!(A013 == null || valueOf == null)) {
                                        int intValue = valueOf.intValue();
                                        C24961Zk r12 = new C24961Zk();
                                        r12.A05 = r9.A05;
                                        r12.A00 = 14;
                                        r12.A01 = 1;
                                        r12.A03 = A013;
                                        r12.A04 = Long.valueOf(A002);
                                        r12.A02 = Integer.valueOf(intValue);
                                        r9.A04.BhD(r12);
                                    }
                                }
                            }
                        }
                    }
                    valueOf = Integer.valueOf(i);
                    int intValue2 = valueOf.intValue();
                    C24961Zk r122 = new C24961Zk();
                    r122.A05 = r9.A05;
                    r122.A00 = 14;
                    r122.A01 = 1;
                    r122.A03 = A013;
                    r122.A04 = Long.valueOf(A002);
                    r122.A02 = Integer.valueOf(intValue2);
                    r9.A04.BhD(r122);
                }
                GroupJid groupJid = (GroupJid) r2;
                C56982ss r13 = this.A03;
                if (!r13.A0L(groupJid) || !this.A04.A0C(groupJid)) {
                    C27991fJ A014 = AnonymousClass34R.A01(groupJid);
                    if (A014 != null) {
                        AnonymousClass67D r22 = this.A01;
                        Objects.requireNonNull(r6);
                        r22.BgF(A014, new C85694Hg(r6, 0), (String) null, 9);
                    }
                } else if (C57192tF.A00(r13.A06(groupJid))) {
                    this.A01.BgD(r6, groupJid, 9);
                } else {
                    new C627736r();
                    AnonymousClass0RN.A00(r6, C627336j.A01(r6, groupJid, 0), (Bundle) null);
                }
            }
        }
    }

    public C22101En(Context context, C56972sr r2, AnonymousClass67D r3, AnonymousClass33U r4, C56982ss r5, C56892sj r6, AnonymousClass3ZM r7, C95814uZ r8, C183538qC r9, int i) {
        super(context, i);
        this.A00 = r2;
        this.A03 = r5;
        this.A07 = r9;
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = r8;
    }
}
