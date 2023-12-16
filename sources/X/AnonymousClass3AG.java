package X;

import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3AG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3AG implements C15630rg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C623734t A01;
    public final /* synthetic */ AnonymousClass227 A02;
    public final /* synthetic */ C25931bJ A03;
    public final /* synthetic */ Collection A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public final Object apply(Object obj) {
        C623734t r7 = this.A01;
        AnonymousClass227 r9 = this.A02;
        int i = this.A00;
        Collection collection = this.A04;
        C25931bJ r5 = this.A03;
        boolean z = this.A05;
        boolean z2 = this.A06;
        String str = (String) obj;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList A0s = AnonymousClass001.A0s();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass3ZH A0R = C18310x6.A0R(it);
                if (!C621733w.A02(A0R.A0H)) {
                    boolean A0E = r7.A0L.A0E();
                    C618832q r11 = new C618832q(A0R);
                    r11.A0L = true;
                    r11.A0J = r7.A0N.A07();
                    r11.A0B = true;
                    r11.A0G = true;
                    r11.A0K = true;
                    r11.A0E = true;
                    r11.A01 = AnonymousClass227.A00(A0R, r9);
                    r11.A0I = A0E;
                    C56952sp.A09(r7, r11, z, z2);
                    AnonymousClass318 r0 = r7.A0I;
                    UserJid userJid = r11.A0P;
                    r11.A02 = AnonymousClass318.A00(r11, r0, userJid);
                    if (A0E) {
                        C618832q.A00(r7, r11, userJid);
                    }
                    C618832q.A01(r7, r11, userJid, r7.A0Q);
                    C618832q.A02(r11, A0s);
                }
            }
        }
        C18260x0.A1A("sync/syncSidelist/request/count ", AnonymousClass001.A0o(), A0s);
        if (C25931bJ.A00(r5, A0s)) {
            return AnonymousClass304.A08;
        }
        if (!r7.A05(r5, str, C59512x2.A01(r9, r7.A02(), "sync_sid_sidelist", A0s, i))) {
            return AnonymousClass304.A03;
        }
        C41402Kc.A00(r7, r5, A0s, elapsedRealtime);
        return AnonymousClass304.A06;
    }

    public /* synthetic */ AnonymousClass3AG(C623734t r1, AnonymousClass227 r2, C25931bJ r3, Collection collection, int i, boolean z, boolean z2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
        this.A04 = collection;
        this.A03 = r3;
        this.A05 = z;
        this.A06 = z2;
    }
}
