package X;

import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1tt  reason: invalid class name and case insensitive filesystem */
public class C33911tt extends AnonymousClass5ZM {
    public int A00;
    public AnonymousClass5L8 A01;
    public final C56972sr A02;
    public final C64773Ex A03;
    public final AnonymousClass5ZU A04;
    public final C56612sH A05;
    public final C54292oU A06;
    public final C56982ss A07;
    public final C56892sj A08;
    public final AnonymousClass1VX A09;
    public final C66503Lr A0A;
    public final AnonymousClass31C A0B;
    public final AnonymousClass2QT A0C;
    public final C30391mN A0D;
    public final WeakReference A0E;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass3ZH A072;
        if (this.A0D.A1J.A02) {
            C27991fJ A022 = AnonymousClass34R.A02(this.A0C.A01);
            C64773Ex r0 = this.A03;
            AnonymousClass3ZH A0A2 = r0.A0A(A022);
            UserJid userJid = null;
            if (!(A022 == null || (A072 = r0.A07(A022)) == null)) {
                userJid = A072.A0I;
            }
            C129526aS A042 = C56892sj.A01(this.A08, A022).A04();
            HashSet A0r = C18310x6.A0r(A042);
            C172878Nf it = A042.iterator();
            while (it.hasNext()) {
                A0r.add(C18320x8.A0G(it).A03);
            }
            long A043 = C615531h.A04(A0A2.A0V, Long.MIN_VALUE);
            A0G(A022, userJid, A0A2.A0K, this.A04.A0H(A0A2), (String) null, A0r, A0r.size(), this.A07.A06(A022), 0, A043);
            return null;
        }
        try {
            this.A0B.A08(32000);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                this.A0A.A02(new AnonymousClass4JI(this, 1), this.A0C).get(32000, TimeUnit.MILLISECONDS);
                long A0E2 = AnonymousClass0x7.A0E(elapsedRealtime);
                if (A0E2 < 500) {
                    SystemClock.sleep(500 - A0E2);
                }
            } catch (Exception e) {
                Log.w("ViewGroupInviteActivity/failed/timeout", e);
                return null;
            }
        } catch (C376223j unused) {
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass3ZH A072;
        ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A0E.get();
        if (viewGroupInviteActivity != null) {
            AnonymousClass5L8 r6 = this.A01;
            int i = this.A00;
            if (r6 != null) {
                viewGroupInviteActivity.A03.setVisibility(0);
                AnonymousClass5RG r5 = viewGroupInviteActivity.A0K;
                AnonymousClass2QT r0 = viewGroupInviteActivity.A0N;
                C626936e.A06(r0);
                r5.A01(r6, r0.A00 * 1000);
                viewGroupInviteActivity.A04.setVisibility(8);
                AnonymousClass2QT r3 = viewGroupInviteActivity.A0N;
                if (r3 == null) {
                    return;
                }
                if (!viewGroupInviteActivity.A0S || (A072 = viewGroupInviteActivity.A08.A07(r3.A01)) == null) {
                    viewGroupInviteActivity.A0J.A0C(new AnonymousClass3P3(viewGroupInviteActivity), viewGroupInviteActivity.A0N);
                    return;
                }
                viewGroupInviteActivity.A0A.A08(viewGroupInviteActivity.A05, A072);
                return;
            }
            viewGroupInviteActivity.A03.setVisibility(4);
            viewGroupInviteActivity.A04.setVisibility(4);
            int i2 = R.string.f11nameremoved;
            if (i != 403) {
                if (i == 404 || i == 406) {
                    boolean A032 = viewGroupInviteActivity.A0Q.A03(viewGroupInviteActivity.A00);
                    i2 = R.string.f11nameremoved;
                    if (A032) {
                        i2 = R.string.f11nameremoved;
                    }
                } else {
                    boolean A033 = viewGroupInviteActivity.A0Q.A03(viewGroupInviteActivity.A00);
                    i2 = R.string.f11nameremoved;
                    if (A033) {
                        i2 = R.string.f11nameremoved;
                    }
                }
            }
            viewGroupInviteActivity.A74(i2);
        }
    }

    public final void A0G(C27991fJ r19, UserJid userJid, C60912zN r21, String str, String str2, Collection collection, int i, int i2, int i3, long j) {
        String str3 = str;
        ArrayList A0u = C18300x5.A0u(collection);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass3ZH A072 = this.A03.A07(C18300x5.A0P(it));
            if (!(A072 == null || A072.A0F == null)) {
                A0u.add(A072);
                A0s.add(A072.A0J());
            }
        }
        Collections.sort(A0u, new AnonymousClass4HH(this.A02, this.A04, this, 1));
        C27991fJ r7 = r19;
        if (AnonymousClass5YT.A00(this.A03.A0A(r7), this.A09)) {
            str3 = AnonymousClass33v.A03(this.A06, A0s, collection.size());
        }
        this.A01 = new AnonymousClass5L8(r7, userJid, r21, str3, str2, A0u, i, i2, i3, j);
    }

    public C33911tt(C56972sr r2, C64773Ex r3, AnonymousClass5ZU r4, C56612sH r5, C54292oU r6, C56982ss r7, C56892sj r8, AnonymousClass1VX r9, C66503Lr r10, ViewGroupInviteActivity viewGroupInviteActivity, AnonymousClass31C r12, AnonymousClass2QT r13, C30391mN r14) {
        this.A05 = r5;
        this.A09 = r9;
        this.A02 = r2;
        this.A06 = r6;
        this.A07 = r7;
        this.A0B = r12;
        this.A03 = r3;
        this.A04 = r4;
        this.A0A = r10;
        this.A08 = r8;
        this.A0E = AnonymousClass0x9.A14(viewGroupInviteActivity);
        this.A0D = r14;
        this.A0C = r13;
    }
}
