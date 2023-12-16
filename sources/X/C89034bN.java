package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName;
import com.whatsapp.util.Log;

/* renamed from: X.4bN  reason: invalid class name and case insensitive filesystem */
public class C89034bN extends AnonymousClass4LB {
    public int A00 = 0;
    public final /* synthetic */ ProfileCheckpointRegisterName A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89034bN(C620633i r8, C56612sH r9, C620733j r10, ProfileCheckpointRegisterName profileCheckpointRegisterName) {
        super(profileCheckpointRegisterName, r8, r9, r10, R.layout.f8nameremoved);
        this.A01 = profileCheckpointRegisterName;
    }

    public void A00(int i) {
        C18260x0.A0y("ProfileCheckpointRegisterName/updateState/state ", AnonymousClass001.A0o(), i);
        this.A00 = i;
        if (i != 1) {
            ProfileCheckpointRegisterName profileCheckpointRegisterName = this.A01;
            if (!profileCheckpointRegisterName.A09.A02()) {
                profileCheckpointRegisterName.A0z.A02();
                AnonymousClass4LB.A01(this, AnonymousClass0HG.A00(this, R.id.initial_sync_progress), 0);
                return;
            }
        }
        AnonymousClass4LB.A01(this, AnonymousClass0HG.A00(this, R.id.initial_sync_progress), 4);
        ProfileCheckpointRegisterName profileCheckpointRegisterName2 = this.A01;
        C18270x1.A0g(AnonymousClass4SG.A2P(profileCheckpointRegisterName2), "com.whatsapp.registername.initializer_start_time");
        View view = profileCheckpointRegisterName2.A01;
        if (view != null) {
            view.setVisibility(4);
        }
        profileCheckpointRegisterName2.A1I.removeMessages(0);
        Log.i("ProfileCheckpointRegisterName/sync/finished");
        profileCheckpointRegisterName2.A0c.A02();
        profileCheckpointRegisterName2.A09.A0i();
        C18270x1.A0l(AnonymousClass4SG.A2P(profileCheckpointRegisterName2), "check_new_reg_from_referral", true);
        AnonymousClass33p r4 = profileCheckpointRegisterName2.A09;
        C18270x1.A0i(C18270x1.A03(r4), "registration_success_time_ms", this.A03.A0H());
        C102305Ii r42 = profileCheckpointRegisterName2.A17;
        Log.i("ProfileCheckpointUtils/clearing-profile-data");
        C86644Kx.A1Q(r42.A02, r42, 46);
        Intent A03 = C627736r.A03(profileCheckpointRegisterName2);
        A03.putExtra("show_payment_account_recovery", true);
        profileCheckpointRegisterName2.startActivity(A03);
        profileCheckpointRegisterName2.finish();
        ProfileCheckpointRegisterName.A1K = null;
        C621433s.A00(profileCheckpointRegisterName2, 0);
        if (AnonymousClass1Hf.A27(profileCheckpointRegisterName2).getLong("eula_accepted_time", 0) > 0) {
            C103275Mg r2 = profileCheckpointRegisterName2.A0q;
            Context context = getContext();
            AnonymousClass33p r43 = profileCheckpointRegisterName2.A09;
            Integer A0S = C18280x3.A0S();
            C95114se A002 = r2.A00(context, r43, profileCheckpointRegisterName2.A0X, A0S, A0S, profileCheckpointRegisterName2.A1D, (Integer) null, false, false);
            C103275Mg r5 = profileCheckpointRegisterName2.A0q;
            C183538qC r6 = profileCheckpointRegisterName2.A1B;
            AnonymousClass4FV r3 = profileCheckpointRegisterName2.A0e;
            AnonymousClass4FS r22 = profileCheckpointRegisterName2.A04;
            C56972sr r7 = profileCheckpointRegisterName2.A01;
            AnonymousClass4AF r8 = profileCheckpointRegisterName2.A0d;
            r3.BhA(A002);
            r3.BKX();
            r22.BkM(new C70513ac(r5, r6, r7, r8, 15));
        }
        if (C18280x3.A1W(AnonymousClass1Hf.A27(profileCheckpointRegisterName2), "is_latam_tos_shown_during_reg")) {
            AnonymousClass1WO r23 = new AnonymousClass1WO();
            r23.A00 = true;
            profileCheckpointRegisterName2.A0e.BhA(r23);
        }
        profileCheckpointRegisterName2.A09.A0q();
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        AnonymousClass4LB.A00(this);
        if (bundle == null) {
            i = 0;
        } else {
            i = bundle.getInt("state");
        }
        A00(i);
        ProfileCheckpointRegisterName profileCheckpointRegisterName = this.A01;
        View findViewById = findViewById(R.id.pay_ed_contact_support);
        profileCheckpointRegisterName.A01 = findViewById;
        if (findViewById != null) {
            AnonymousClass0x2.A10(findViewById, this, 23);
        }
        if (profileCheckpointRegisterName.A0D.A0B(false)) {
            ((TextView) AnonymousClass0HG.A00(this, R.id.splash_screen_title)).setText(R.string.f11nameremoved);
        }
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.putInt("state", this.A00);
        return onSaveInstanceState;
    }
}
