package X;

import android.app.Application;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5gt  reason: invalid class name and case insensitive filesystem */
public class C110705gt implements C17190ui {
    public final Application A00;
    public final C154197cm A01;
    public final C104095Pq A02;
    public final AnonymousClass5Y9 A03;
    public final C104325Qn A04;
    public final UserJid A05;
    public final C103115Lp A06;
    public final AnonymousClass4FS A07;

    public C05550Ty Azr(Class cls) {
        UserJid userJid = this.A05;
        Application application = this.A00;
        AnonymousClass5Y9 r4 = this.A03;
        C104325Qn r5 = this.A04;
        C103115Lp r7 = this.A06;
        return new C87594Tr(application, this.A01, this.A02, r4, r5, userJid, r7, this.A07);
    }

    public C110705gt(Application application, C154197cm r2, C104095Pq r3, AnonymousClass5Y9 r4, C104325Qn r5, UserJid userJid, C103115Lp r7, AnonymousClass4FS r8) {
        this.A05 = userJid;
        this.A04 = r5;
        this.A00 = application;
        this.A03 = r4;
        this.A06 = r7;
        this.A01 = r2;
        this.A02 = r3;
        this.A07 = r8;
    }

    public /* synthetic */ C05550Ty B09(AnonymousClass0N3 r2, Class cls) {
        return C86604Kt.A0K(this, cls);
    }
}
