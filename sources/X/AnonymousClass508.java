package X;

import android.os.Bundle;
import com.whatsapp.R;

/* renamed from: X.508  reason: invalid class name */
public abstract class AnonymousClass508 extends C131856eI {
    public C95814uZ A00 = null;
    public boolean A01 = false;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(A74());
        C107065ad.A04(C86664Kz.A0k(this, R.id.container), new AnonymousClass91U(this, 5));
        C107065ad.A03(this);
        C107405bG.A08(this, AnonymousClass34K.A01(this, R.attr.f3nameremoved));
        this.A01 = AnonymousClass0x9.A1N(getIntent(), "is_using_global_wallpaper");
        this.A00 = C18310x6.A0S(getIntent().getStringExtra("chat_jid"));
        setSupportActionBar(AnonymousClass4SG.A2T(this));
        getSupportActionBar().A0N(true);
        C86604Kt.A1A(findViewById(R.id.separator));
    }

    public int A74() {
        return R.layout.f8nameremoved;
    }
}
