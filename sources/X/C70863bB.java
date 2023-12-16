package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Collections;

/* renamed from: X.3bB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70863bB implements Runnable {
    public final /* synthetic */ C95814uZ A00;
    public final /* synthetic */ Jid A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ C56232re A03;
    public final /* synthetic */ C30471mV A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public final void run() {
        C56232re r9 = this.A03;
        C30471mV r12 = this.A04;
        Jid jid = this.A01;
        C95814uZ r6 = this.A00;
        boolean z = this.A05;
        UserJid userJid = this.A02;
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A0o(C624134x.A08(r12, "app/mediajobmanager/enqueuemediaresendupload enqueuing message: ", A0o), A0o);
        AnonymousClass30M r8 = new AnonymousClass30M(Collections.singletonList(r12));
        C157497iO r10 = new C157497iO(false, r8.A05(), r8.A04());
        C55852r1 r3 = r9.A0I;
        AnonymousClass32J A012 = AnonymousClass32J.A01(r9.A02, r8, r9.A09, r3, r9.A0J, r10, false);
        C620033c r32 = r9.A0D;
        AnonymousClass3QO A042 = r32.A04(A012, false);
        A042.A01 = C622934l.A00(r8);
        A042.A0M.A09(3);
        AnonymousClass5LM r13 = A042.A0L;
        AnonymousClass1VX r11 = r9.A0B;
        if (r11.A0Y(C58422vE.A02, 475)) {
            AnonymousClass2YS r102 = r9.A0G;
            if (AnonymousClass0x9.A05(r13.A05) < 1800000 || !r102.A00(r13)) {
                return;
            }
        }
        if (r12.A00 <= C56952sp.A06(r11, 1098) * 1048576) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("mediajobmanager/reupload/attach/job=");
            A0o2.append(A042);
            A0o2.append("; messages=");
            C18260x0.A1J(A0o2, r8.A01());
            r9.A02(r8, A042);
            A042.A0W = "mms";
            A042.A04(new AnonymousClass3X3(r8, r9, A042, false, false), r9.A0V);
            r32.A0A(A042, new C135416kd(r6, jid, userJid, A042, A042.A00(), z));
        }
    }

    public /* synthetic */ C70863bB(C95814uZ r1, Jid jid, UserJid userJid, C56232re r4, C30471mV r5, boolean z, boolean z2) {
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = jid;
        this.A00 = r1;
        this.A05 = z;
        this.A02 = userJid;
        this.A06 = z2;
    }
}
