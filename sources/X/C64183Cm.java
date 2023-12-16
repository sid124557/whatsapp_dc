package X;

import com.whatsapp.bridge.wfal.WfalManager;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Cm  reason: invalid class name and case insensitive filesystem */
public final class C64183Cm implements AnonymousClass4F2 {
    public static final long A09 = TimeUnit.SECONDS.toMillis(3);
    public C33291sl A00;
    public Runnable A01;
    public final WfalManager A02;
    public final C56612sH A03;
    public final C55202py A04;
    public final C48612fB A05;
    public final C55832qz A06;
    public final AnonymousClass4FS A07;
    public final C55542qW A08;

    public void BUB() {
        AnonymousClass356.A01("[WAFFLE]CrosspostUnsentStatusManager/registerXmppListener network connected");
        WfalManager wfalManager = this.A02;
        if (!wfalManager.A02()) {
            return;
        }
        if (wfalManager.A01(AnonymousClass223.FACEBOOK) != null || wfalManager.A01(AnonymousClass223.INSTAGRAM) != null) {
            AnonymousClass356.A01("[WAFFLE]CrosspostUnsentStatusManager/scheduleSendUnsentCrosspostSession started scheduling unsent crosspost sessions");
            Runnable runnable = this.A01;
            if (runnable != null) {
                this.A07.BjN(runnable);
            }
            this.A01 = this.A07.Bkn(new C117105rO(this, 42), "[WAFFLE]CrosspostUnsentStatusManager/scheduleSendUnsentCrosspostSessionsRunnable", A09);
        }
    }

    public void BUD() {
        AnonymousClass356.A01("[WAFFLE]CrosspostUnsentStatusManager/registerXmppListener network disconnected");
        Runnable runnable = this.A01;
        if (runnable != null) {
            AnonymousClass356.A01("[WAFFLE]CrosspostUnsentStatusManager/registerXmppListener cancelled");
            this.A07.BjN(runnable);
        }
    }

    public C64183Cm(WfalManager wfalManager, C56612sH r2, C55202py r3, C48612fB r4, C55832qz r5, AnonymousClass4FS r6, C55542qW r7) {
        C18260x0.A0f(r2, r6, r5, r3, r7);
        C18260x0.A0U(r4, wfalManager);
        this.A03 = r2;
        this.A07 = r6;
        this.A06 = r5;
        this.A04 = r3;
        this.A08 = r7;
        this.A05 = r4;
        this.A02 = wfalManager;
    }

    public /* synthetic */ void BUC() {
    }

    public /* synthetic */ void BUE() {
    }

    public /* synthetic */ void BUF() {
    }
}
