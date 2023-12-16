package X;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.9HW  reason: invalid class name */
public abstract class AnonymousClass9HW extends AnonymousClass9HX implements C202209lY {
    public C54522or A00;
    public C60482yd A01;
    public C69483Xe A02;
    public String A03;
    public String A04;
    public boolean A05 = true;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        C60482yd r2 = this.A01;
        if (r2 != null) {
            Intent intent = getIntent();
            C162457s7.A0H(intent);
            String stringExtra = intent.getStringExtra("fds_observer_id");
            C162457s7.A0H(stringExtra);
            C54522or A022 = r2.A02(stringExtra);
            this.A00 = A022;
            A022.A00(new C204149ot(this, 6), C197919e5.class, this);
            C54522or r22 = this.A00;
            if (r22 != null) {
                r22.A00(new C204149ot(this, 7), C197929e6.class, this);
            }
            C54522or r23 = this.A00;
            if (r23 != null) {
                r23.A00(new C204149ot(this, 8), C172108Jq.class, this);
            }
            Intent intent2 = getIntent();
            C162457s7.A0H(intent2);
            String stringExtra2 = intent2.getStringExtra("fds_state_name");
            C162457s7.A0H(stringExtra2);
            this.A04 = stringExtra2;
            return;
        }
        throw C18270x1.A0S("uiObserversFactory");
    }

    public void onDestroy() {
        super.onDestroy();
        C54522or r0 = this.A00;
        if (r0 != null) {
            r0.A03(this);
        }
        this.A00 = null;
    }
}
