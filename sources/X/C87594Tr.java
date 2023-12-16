package X;

import android.app.Application;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Tr  reason: invalid class name and case insensitive filesystem */
public class C87594Tr extends AnonymousClass08N {
    public final int A00;
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final C154197cm A02;
    public final C104095Pq A03;
    public final AnonymousClass5Y9 A04;
    public final C104325Qn A05;
    public final UserJid A06;
    public final C103115Lp A07;
    public final AnonymousClass4FS A08;

    public C87594Tr(Application application, C154197cm r4, C104095Pq r5, AnonymousClass5Y9 r6, C104325Qn r7, UserJid userJid, C103115Lp r9, AnonymousClass4FS r10) {
        super(application);
        this.A06 = userJid;
        this.A05 = r7;
        this.A04 = r6;
        this.A07 = r9;
        this.A02 = r4;
        this.A03 = r5;
        this.A08 = r10;
        this.A00 = application.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }
}
