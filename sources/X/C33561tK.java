package X;

import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1tK  reason: invalid class name and case insensitive filesystem */
public class C33561tK extends AnonymousClass5ZM {
    public int A00;
    public C27991fJ A01;
    public final int A02;
    public final C56612sH A03;
    public final C66503Lr A04;
    public final String A05;
    public final WeakReference A06;

    public C33561tK(AcceptInviteLinkActivity acceptInviteLinkActivity, C56612sH r3, C66503Lr r4, String str, int i) {
        super(acceptInviteLinkActivity, true);
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = AnonymousClass0x9.A14(acceptInviteLinkActivity);
        this.A05 = str;
        this.A02 = i;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        int i;
        AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A06.get();
        if (acceptInviteLinkActivity != null) {
            C27991fJ r8 = this.A01;
            int i2 = this.A00;
            int i3 = this.A02;
            if (r8 == null) {
                C18260x0.A0x("acceptlink/sendjoin/failed/", AnonymousClass001.A0o(), i2);
                boolean A032 = acceptInviteLinkActivity.A0J.A03(i3);
                if (i2 == 401) {
                    i = R.string.f11nameremoved;
                    if (A032) {
                        i = R.string.f11nameremoved;
                    }
                } else if (i2 == 404) {
                    i = R.string.f11nameremoved;
                    if (A032) {
                        i = R.string.f11nameremoved;
                    }
                } else if (i2 != 419) {
                    i = R.string.f11nameremoved;
                    if (i2 != 429) {
                        if (i2 == 436) {
                            acceptInviteLinkActivity.A75(R.string.f11nameremoved);
                            acceptInviteLinkActivity.findViewById(R.id.learn_more).setVisibility(0);
                            acceptInviteLinkActivity.findViewById(R.id.learn_more).setOnClickListener(new AnonymousClass54G(acceptInviteLinkActivity));
                            return;
                        } else if (i2 == 409) {
                            C27991fJ r2 = (C27991fJ) acceptInviteLinkActivity.A0N.get();
                            Intent A1O = new C627736r().A1O(acceptInviteLinkActivity, r2, 0);
                            AnonymousClass5VI.A00(A1O, "AcceptInviteLinkActivity");
                            acceptInviteLinkActivity.A6T(A1O, true);
                            if (r2 != null) {
                                acceptInviteLinkActivity.A0G.A0E(r2, (String) null, 0);
                                return;
                            }
                            return;
                        } else if (i2 != 410) {
                            i = R.string.f11nameremoved;
                        } else {
                            i = R.string.f11nameremoved;
                            if (A032) {
                                i = R.string.f11nameremoved;
                            }
                        }
                    }
                } else {
                    i = R.string.f11nameremoved;
                    if (A032) {
                        i = R.string.f11nameremoved;
                    }
                }
                acceptInviteLinkActivity.A75(i);
            } else if (!acceptInviteLinkActivity.A08.A0L(r8) || !acceptInviteLinkActivity.A0A.A0C(r8)) {
                C18260x0.A1R(AnonymousClass001.A0o(), "acceptlink/sendjoin/willwait/", r8);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("acceptlink/wait/");
                C18260x0.A0o(acceptInviteLinkActivity.A0N.get(), A0o);
                Runnable runnable = acceptInviteLinkActivity.A0K;
                if (runnable == null) {
                    runnable = new C70043Zq(acceptInviteLinkActivity, 22);
                    acceptInviteLinkActivity.A0K = runnable;
                }
                acceptInviteLinkActivity.A05.A0T(runnable, 32000);
            } else {
                C18260x0.A1R(AnonymousClass001.A0o(), "acceptlink/processcode/exists/", r8);
                Intent A0O = C627736r.A0O(acceptInviteLinkActivity, r8);
                AnonymousClass5VI.A00(A0O, "AcceptInviteLinkActivity");
                acceptInviteLinkActivity.A6T(A0O, true);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.A04.A06(new AnonymousClass4JK(this, 0), new AnonymousClass4JJ(this, 0), this.A05).get(32000, TimeUnit.MILLISECONDS);
            long A0E = AnonymousClass0x7.A0E(elapsedRealtime);
            if (A0E < 500) {
                SystemClock.sleep(500 - A0E);
                return null;
            }
        } catch (Exception e) {
            Log.w("acceptlink/sendjoin/failed/timeout", e);
        }
        return null;
    }
}
