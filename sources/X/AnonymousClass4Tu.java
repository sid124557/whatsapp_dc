package X;

import android.app.Application;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.4Tu  reason: invalid class name */
public class AnonymousClass4Tu extends AnonymousClass08N {
    public final AnonymousClass08J A00;
    public final AnonymousClass08J A01;
    public final AnonymousClass08M A02;
    public final C154197cm A03;
    public final C104205Qb A04;
    public final C60852zH A05;
    public final C104325Qn A06;
    public final C48922fh A07;
    public final C29441ip A08;
    public final UserJid A09;
    public final C103115Lp A0A;

    public void A0D() {
        this.A07.A01(this.A09, AnonymousClass74S.A00(), new C124366Bz(this, 0));
    }

    public AnonymousClass4Tu(Application application, C154197cm r12, C104205Qb r13, C104325Qn r14, C48922fh r15, C29441ip r16, UserJid userJid, C103115Lp r18, AnonymousClass39E r19) {
        super(application);
        AnonymousClass08J A0E = AnonymousClass4L0.A0E();
        this.A01 = A0E;
        AnonymousClass08J A0E2 = AnonymousClass4L0.A0E();
        this.A00 = A0E2;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A02 = A012;
        UserJid userJid2 = userJid;
        this.A09 = userJid2;
        this.A04 = r13;
        this.A06 = r14;
        this.A08 = r16;
        this.A0A = r18;
        this.A03 = r12;
        this.A07 = r15;
        String valueOf = String.valueOf(AnonymousClass4L0.A01(this.A00.getResources(), R.dimen.f6nameremoved));
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39E r6 = r19;
        for (AnonymousClass396 r0 : r6.A02) {
            for (AnonymousClass392 r02 : r0.A01) {
                A0s.add(r02.A00);
            }
        }
        C60852zH r2 = new C60852zH(userJid2, valueOf, valueOf, A0s);
        this.A05 = r2;
        C86604Kt.A1O(A012, A0E2, this, 32);
        A0E.A0J(A012, new C100485Bc(r6, r13, this, 0));
        r13.A00(A012, r2);
    }
}
