package X;

import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1tP  reason: invalid class name and case insensitive filesystem */
public class C33611tP extends AnonymousClass5ZM {
    public int A00;
    public int A01;
    public C27991fJ A02;
    public final C56612sH A03;
    public final C66503Lr A04;
    public final AnonymousClass2QT A05;
    public final WeakReference A06;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        int i;
        ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A06.get();
        if (viewGroupInviteActivity != null) {
            C27991fJ r1 = this.A02;
            int i2 = this.A00;
            int i3 = this.A01;
            if (r1 == null) {
                if (i2 != 400) {
                    i = R.string.f11nameremoved;
                    if (i2 != 419) {
                        if (i2 != 500) {
                            i = R.string.f11nameremoved;
                            if (i2 != 404) {
                                i = R.string.f11nameremoved;
                                if (i2 != 405) {
                                    i = R.string.f11nameremoved;
                                    if (i2 != 409) {
                                        i = R.string.f11nameremoved;
                                        if (i2 != 410) {
                                            i = R.string.f11nameremoved;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    viewGroupInviteActivity.A74(i);
                }
                i = R.string.f11nameremoved;
                viewGroupInviteActivity.A74(i);
            } else if (i3 == 1) {
                viewGroupInviteActivity.A04.setVisibility(4);
                viewGroupInviteActivity.A03.setVisibility(0);
                AnonymousClass5RG r2 = viewGroupInviteActivity.A0K;
                r2.A0E.setText(R.string.f11nameremoved);
                WDSButton wDSButton = r2.A0O;
                wDSButton.setText(R.string.f11nameremoved);
                wDSButton.setEnabled(false);
                r2.A0P.setVisibility(8);
            } else if (!viewGroupInviteActivity.A0E.A0L(r1) || !viewGroupInviteActivity.A0H.A0C(r1)) {
                Runnable runnable = viewGroupInviteActivity.A0R;
                if (runnable == null) {
                    runnable = C70003Zm.A00(viewGroupInviteActivity, 48);
                    viewGroupInviteActivity.A0R = runnable;
                }
                viewGroupInviteActivity.A05.A0T(runnable, 32000);
            } else {
                Intent A0O = C627736r.A0O(viewGroupInviteActivity, r1);
                AnonymousClass5VI.A00(A0O, "ViewGroupInviteActivity:onGroupJoined");
                viewGroupInviteActivity.A6T(A0O, true);
            }
        }
    }

    public C33611tP(C56612sH r2, C66503Lr r3, ViewGroupInviteActivity viewGroupInviteActivity, AnonymousClass2QT r5) {
        this.A03 = r2;
        this.A04 = r3;
        this.A06 = AnonymousClass0x9.A14(viewGroupInviteActivity);
        this.A05 = r5;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.A04.A05(new AnonymousClass4JK(this, 1), new AnonymousClass4JJ(this, 1), this.A05).get(32000, TimeUnit.MILLISECONDS);
            long A0E = AnonymousClass0x7.A0E(elapsedRealtime);
            if (A0E < 500) {
                SystemClock.sleep(500 - A0E);
                return null;
            }
        } catch (Exception e) {
            Log.w("ViewGroupInviteActivityJoinGroupTask send join timed out", e);
        }
        return null;
    }
}
