package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.util.Log;

/* renamed from: X.4bM  reason: invalid class name and case insensitive filesystem */
public class C89024bM extends AnonymousClass4LB {
    public int A00 = 0;
    public final /* synthetic */ RegisterName A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89024bM(C620633i r8, C56612sH r9, C620733j r10, RegisterName registerName) {
        super(registerName, r8, r9, r10, R.layout.f8nameremoved);
        this.A01 = registerName;
    }

    public void A00(int i) {
        C18260x0.A0y("RegisterName/updatestate/state ", AnonymousClass001.A0o(), i);
        this.A00 = i;
        if (i != 1) {
            RegisterName registerName = this.A01;
            if (!registerName.A09.A02()) {
                registerName.A1N.A02();
                AnonymousClass4LB.A01(this, AnonymousClass0HG.A00(this, R.id.initial_sync_progress), 0);
                return;
            }
        }
        AnonymousClass4LB.A01(this, AnonymousClass0HG.A00(this, R.id.initial_sync_progress), 4);
        RegisterName registerName2 = this.A01;
        C18270x1.A0g(AnonymousClass4SG.A2P(registerName2), "com.whatsapp.registername.initializer_start_time");
        View view = registerName2.A03;
        if (view != null) {
            view.setVisibility(4);
        }
        registerName2.A1i.removeMessages(0);
        Log.i("RegisterName/sync/finished");
        registerName2.A0w.A02();
        registerName2.A09.A0i();
        C18270x1.A0l(AnonymousClass4SG.A2P(registerName2), "check_new_reg_from_referral", true);
        AnonymousClass33p r5 = registerName2.A09;
        C18270x1.A0i(C18270x1.A03(r5), "registration_success_time_ms", this.A03.A0H());
        Intent A03 = C627736r.A03(registerName2);
        A03.putExtra("show_payment_account_recovery", true);
        registerName2.startActivity(A03);
        registerName2.finish();
        RegisterName.A1m = null;
        C621433s.A00(registerName2, 0);
        registerName2.A1K.A01(2);
        if (AnonymousClass1Hf.A27(registerName2).getLong("eula_accepted_time", 0) > 0) {
            if (registerName2.A0d.A0E() && registerName2.A1c.intValue() == 1) {
                registerName2.A1c = 2;
            }
            C95114se A002 = registerName2.A1C.A00(getContext(), registerName2.A09, registerName2.A0m, registerName2.A1c, registerName2.A1b, registerName2.A1Z, registerName2.A1a, registerName2.A1d, registerName2.A1f);
            C103275Mg r52 = registerName2.A1C;
            C183538qC r6 = registerName2.A1X;
            AnonymousClass4FV r3 = registerName2.A0y;
            AnonymousClass4FS r2 = registerName2.A04;
            C56972sr r7 = registerName2.A01;
            AnonymousClass4AF r8 = registerName2.A0x;
            r3.BhA(A002);
            r3.BKX();
            r2.BkM(new C70513ac(r52, r6, r7, r8, 15));
        }
        if (C18280x3.A1W(AnonymousClass1Hf.A27(registerName2), "is_latam_tos_shown_during_reg")) {
            AnonymousClass1WO r22 = new AnonymousClass1WO();
            r22.A00 = true;
            registerName2.A0y.BhA(r22);
        }
        registerName2.A09.A0q();
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
        RegisterName registerName = this.A01;
        View findViewById = findViewById(R.id.pay_ed_contact_support);
        registerName.A03 = findViewById;
        if (findViewById != null) {
            AnonymousClass0x2.A0y(findViewById, this, 28);
        }
        if (registerName.A0N.A0B(false)) {
            ((TextView) AnonymousClass0HG.A00(this, R.id.splash_screen_title)).setText(R.string.f11nameremoved);
        }
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.putInt("state", this.A00);
        return onSaveInstanceState;
    }
}
