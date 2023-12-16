package X;

import android.app.Activity;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1u1  reason: invalid class name */
public abstract class AnonymousClass1u1 extends AnonymousClass5ZM {
    public int A00;
    public AnonymousClass8OQ A01;
    public C129526aS A02;
    public C27991fJ A03;
    public UserJid A04;
    public final C56612sH A05;
    public final C66503Lr A06;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C69263Wi r2;
        int i;
        if (this.A02 == null || this.A01 == null) {
            if (this instanceof AnonymousClass1fG) {
                ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) ((AnonymousClass1fG) this).A01.get();
                if (viewGroupInviteActivity != null) {
                    viewGroupInviteActivity.A74(R.string.f11nameremoved);
                    return;
                }
                return;
            }
            AnonymousClass1fF r1 = (AnonymousClass1fF) this;
            C89654ea A0F = C18320x8.A0F(r1.A01);
            if (A0F != null) {
                A0F.BjL();
                r2 = r1.A00;
                i = R.string.f11nameremoved;
            } else {
                return;
            }
        } else {
            if (this instanceof AnonymousClass1fG) {
                AnonymousClass1fG r12 = (AnonymousClass1fG) this;
                Activity activity = (Activity) r12.A01.get();
                if (activity != null) {
                    r12.A00.A0H(R.string.f11nameremoved, 0);
                    activity.finish();
                    return;
                }
                return;
            }
            AnonymousClass1fF r13 = (AnonymousClass1fF) this;
            C89654ea A0F2 = C18320x8.A0F(r13.A01);
            if (A0F2 != null) {
                A0F2.BjL();
                r2 = r13.A00;
                i = R.string.f11nameremoved;
            } else {
                return;
            }
        }
        r2.A0H(i, 0);
    }

    public AnonymousClass1u1(C56612sH r1, C66503Lr r2, C27991fJ r3, UserJid userJid) {
        this.A05 = r1;
        this.A06 = r2;
        this.A03 = r3;
        this.A04 = userJid;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.A06.A04(new C40582Gy(this), this.A03, Collections.singletonList(this.A04)).get(32000, TimeUnit.MILLISECONDS);
            long A0E = AnonymousClass0x7.A0E(elapsedRealtime);
            if (A0E < 500) {
                SystemClock.sleep(500 - A0E);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
