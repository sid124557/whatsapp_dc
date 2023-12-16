package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.CopyableTextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import java.util.LinkedList;

/* renamed from: X.9By  reason: invalid class name and case insensitive filesystem */
public abstract class C191109By extends AnonymousClass9DN {
    public FrameLayout A00;
    public C66543Lv A01;
    public C40602Ha A02;
    public C194489Tb A03;
    public C620933l A04;
    public AnonymousClass9U5 A05;
    public AnonymousClass9WM A06;
    public C197769dq A07;
    public AnonymousClass9TZ A08;
    public C194029Rh A09;
    public AnonymousClass94N A0A;
    public AnonymousClass94D A0B;
    public C194259Se A0C;
    public final C160757oG A0D = C160757oG.A00("PaymentCardDetailsActivity", "payment-settings", "COMMON");

    public void A78() {
        int i;
        A79(1);
        if (this.A0A != null) {
            boolean A0X = this.A0D.A0X(1927);
            AnonymousClass94N r3 = this.A0A;
            String str = this.A08.A0A;
            if (A0X) {
                i = 2;
            } else {
                i = 1;
            }
            r3.setAlertButtonClickListener(new C204439pM(i, str, this));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            this.A0D.A06("onActivityResult 1");
            this.A0I.BkM(new C199509gh(this));
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void A79(int i) {
        this.A0A = new AnonymousClass94N(this);
        this.A00.removeAllViews();
        this.A00.addView(this.A0A);
        AnonymousClass94D r0 = this.A0B;
        if (r0 != null) {
            r0.setBottomDividerSpaceVisibility(8);
            this.A0A.setTopDividerVisibility(8);
        }
        this.A0A.setAlertType(i);
    }

    public void A7A(AnonymousClass4EY r5, String str, String str2) {
        AnonymousClass9U5 r3 = this.A05;
        LinkedList A18 = AnonymousClass0x9.A18();
        AnonymousClass39V.A03("action", "edit-default-credential", A18);
        AnonymousClass39V.A03("credential-id", str, A18);
        AnonymousClass39V.A03("version", "2", A18);
        if (!TextUtils.isEmpty(str2)) {
            AnonymousClass39V.A03("payment-type", C86664Kz.A1L(str2), A18);
        }
        r3.A0B(r5, C1899593h.A0T(A18));
    }

    public void A76(C166587yw r4, boolean z) {
        super.A76(r4, z);
        C133736hr r2 = (C133736hr) r4;
        C626936e.A06(r2);
        this.A02.setText(C195169Wk.A02(this, r2));
        C133796hx r0 = r2.A08;
        if (r0 != null) {
            boolean A0B2 = r0.A0B();
            CopyableTextView copyableTextView = this.A03;
            if (!A0B2) {
                copyableTextView.setText(R.string.f11nameremoved);
                this.A03.A03 = null;
                A78();
            } else {
                copyableTextView.setVisibility(8);
            }
        }
        C133796hx r02 = r4.A08;
        C626936e.A06(r02);
        if (r02.A0B()) {
            AnonymousClass94N r03 = this.A0A;
            if (r03 != null) {
                r03.setVisibility(8);
                AnonymousClass94D r1 = this.A0B;
                if (r1 != null) {
                    r1.setBottomDividerSpaceVisibility(0);
                }
            }
            this.A03.setVisibility(8);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0B(R.string.f11nameremoved);
            boolean z = this instanceof BrazilPaymentCardDetailsActivity;
            AnonymousClass0R8 supportActionBar2 = getSupportActionBar();
            if (z) {
                if (supportActionBar2 != null) {
                    supportActionBar2.A0N(true);
                    int currentContentInsetRight = this.A0H.getCurrentContentInsetRight();
                    this.A0H.A0C(A74(R.style.f12nameremoved), currentContentInsetRight);
                }
                i = A74(R.style.f12nameremoved);
            } else {
                if (supportActionBar2 != null) {
                    supportActionBar2.A0N(true);
                    int currentContentInsetRight2 = this.A0H.getCurrentContentInsetRight();
                    this.A0H.A0C(A74(R.style.f12nameremoved), currentContentInsetRight2);
                }
                i = 0;
            }
            this.A0H.A0C(this.A0H.getCurrentContentInsetLeft(), i);
        }
        this.A00 = (FrameLayout) findViewById(R.id.method_details_alert_container);
    }

    /* renamed from: $r8$lambda$rJ2o3D1V-bcWlEow1OVbGiYlgCs  reason: not valid java name */
    public static /* synthetic */ void m30$r8$lambda$rJ2o3D1VbcWlEow1OVbGiYlgCs(View view) {
    }

    public static /* synthetic */ void lambda$verifyCardPhoenixFlowOnClickListener$0(View view) {
    }
}
