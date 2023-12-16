package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

/* renamed from: X.1tQ  reason: invalid class name and case insensitive filesystem */
public class C33621tQ extends AnonymousClass5ZM {
    public final C48352el A00;
    public final C64773Ex A01;
    public final C66413Li A02;
    public final UserJid A03;
    public final String A04;
    public final String A05;
    public final WeakReference A06;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass304 r0;
        UserJid userJid = this.A03;
        if (userJid == null) {
            String str = this.A04;
            if (str != null) {
                return this.A02.A00(AnonymousClass227.A01, str);
            }
            r0 = AnonymousClass304.A03;
        } else {
            AnonymousClass3ZH A0A = this.A01.A0A(userJid);
            String str2 = this.A05;
            if (str2 != null && !str2.isEmpty() && !str2.equals(A0A.A0b)) {
                A0A.A0b = str2;
                this.A00.A01(C70133a0.A00(this, A0A, 45));
            }
            if (A0A.A0F != null) {
                r0 = AnonymousClass304.A08;
            } else {
                r0 = this.A02.A02(AnonymousClass227.A01, userJid);
            }
        }
        return Pair.create(r0, (Object) null);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        AnonymousClass3U5 r2 = (AnonymousClass3U5) this.A06.get();
        if (r2 != null && !r2.A03) {
            r2.A00((AnonymousClass304) pair.first, (AnonymousClass2UJ) pair.second);
        }
    }

    public C33621tQ(C48352el r2, C64773Ex r3, C66413Li r4, UserJid userJid, AnonymousClass3U5 r6, String str, String str2) {
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A06 = AnonymousClass0x9.A14(r6);
        this.A03 = userJid;
        this.A05 = str;
        this.A04 = str2;
    }
}
