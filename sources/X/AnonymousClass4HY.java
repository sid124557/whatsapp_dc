package X;

import android.content.Context;
import com.whatsapp.accountlinking.webauthutil.FxWebAuthLauncherActivity;
import com.whatsapp.accountswitching.routing.AccountSwitchingRoutingActivity;
import com.whatsapp.notification.OtpOneTapNotificationHandlerActivity;
import com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity;

/* renamed from: X.4HY  reason: invalid class name */
public class AnonymousClass4HY implements C15520rV {
    public Object A00;
    public final int A01;

    public AnonymousClass4HY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C004805c r1, int i) {
        r1.A5J(new AnonymousClass4HY(r1, i));
    }

    public void BQ0(Context context) {
        switch (this.A01) {
            case 10:
                FxWebAuthLauncherActivity fxWebAuthLauncherActivity = (FxWebAuthLauncherActivity) this.A00;
                if (!fxWebAuthLauncherActivity.A04) {
                    fxWebAuthLauncherActivity.A04 = true;
                    fxWebAuthLauncherActivity.A01 = (C55742qq) ((C88834as) ((AnonymousClass3DZ) fxWebAuthLauncherActivity.generatedComponent())).A4Z.A2W.get();
                    return;
                }
                return;
            case 11:
                AccountSwitchingRoutingActivity accountSwitchingRoutingActivity = (AccountSwitchingRoutingActivity) this.A00;
                if (!accountSwitchingRoutingActivity.A07) {
                    accountSwitchingRoutingActivity.A07 = true;
                    C64333Db r1 = ((C88834as) ((AnonymousClass3DZ) accountSwitchingRoutingActivity.generatedComponent())).A4Z;
                    accountSwitchingRoutingActivity.A01 = C64333Db.A0E(r1);
                    accountSwitchingRoutingActivity.A06 = (C34171uL) r1.AbZ.get();
                    accountSwitchingRoutingActivity.A00 = (C53962nx) r1.A4i.get();
                    accountSwitchingRoutingActivity.A03 = C64333Db.A2s(r1);
                    accountSwitchingRoutingActivity.A02 = (AnonymousClass5XC) r1.A0U.get();
                    accountSwitchingRoutingActivity.A05 = (C51072jE) r1.ATh.get();
                    accountSwitchingRoutingActivity.A04 = (C54412og) r1.Aam.get();
                    return;
                }
                return;
            case 84:
                OtpOneTapNotificationHandlerActivity otpOneTapNotificationHandlerActivity = (OtpOneTapNotificationHandlerActivity) this.A00;
                if (!otpOneTapNotificationHandlerActivity.A05) {
                    otpOneTapNotificationHandlerActivity.A05 = true;
                    C64333Db r12 = ((C88834as) ((AnonymousClass3DZ) otpOneTapNotificationHandlerActivity.generatedComponent())).A4Z;
                    otpOneTapNotificationHandlerActivity.A00 = C64333Db.A04(r12);
                    otpOneTapNotificationHandlerActivity.A04 = C64333Db.A8y(r12);
                    otpOneTapNotificationHandlerActivity.A02 = (C614030o) r12.AOy.get();
                    otpOneTapNotificationHandlerActivity.A03 = C64333Db.A8F(r12);
                    otpOneTapNotificationHandlerActivity.A01 = (C54122oD) r12.A6t.get();
                    return;
                }
                return;
            case 122:
                AddThirdPartyStickerPackActivity addThirdPartyStickerPackActivity = (AddThirdPartyStickerPackActivity) this.A00;
                if (!addThirdPartyStickerPackActivity.A04) {
                    addThirdPartyStickerPackActivity.A04 = true;
                    C88834as r2 = (C88834as) ((AnonymousClass3DZ) addThirdPartyStickerPackActivity.generatedComponent());
                    C64333Db r13 = r2.A4Z;
                    addThirdPartyStickerPackActivity.A03 = C64333Db.A8y(r13);
                    addThirdPartyStickerPackActivity.A00 = C64333Db.A4H(r13);
                    addThirdPartyStickerPackActivity.A02 = r2.ADE();
                    return;
                }
                return;
            default:
                ((AnonymousClass4SG) this.A00).A5r();
                return;
        }
    }
}
