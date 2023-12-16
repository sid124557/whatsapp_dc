package com.whatsapp.authentication;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass0QU;
import X.AnonymousClass5YL;
import X.AnonymousClass67Q;
import X.C08310eF;
import X.C107205as;
import X.C107295b4;
import X.C1229066h;
import X.C1232167o;
import X.C18280x3;
import X.C56612sH;
import X.C620633i;
import X.C620733j;
import X.C626936e;
import X.C86634Kw;
import X.C86644Kx;
import X.C90024fh;
import X.C90034fi;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.security.Signature;

public class FingerprintBottomSheet extends Hilt_FingerprintBottomSheet implements C1229066h {
    public long A00 = 0;
    public CountDownTimer A01;
    public TextView A02;
    public TextView A03;
    public AnonymousClass0QU A04;
    public C90034fi A05;
    public FingerprintView A06;
    public C56612sH A07;
    public C620733j A08;
    public boolean A09 = false;

    public void A1U(long j) {
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A01 = null;
        }
        long j2 = j;
        if (j > this.A07.A0H()) {
            this.A00 = j;
            A1T();
            this.A01 = new AnonymousClass67Q(this, 0, j - this.A07.A0H(), j2).start();
        }
    }

    public static /* synthetic */ void A01(DialogInterface dialogInterface, Bundle bundle, FingerprintBottomSheet fingerprintBottomSheet) {
        View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
        C626936e.A04(findViewById);
        BottomSheetBehavior A012 = BottomSheetBehavior.A01(findViewById);
        if (bundle.getBoolean("full_screen")) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = C86634Kw.A0J().heightPixels - AnonymousClass5YL.A01(fingerprintBottomSheet.A1D(), C620633i.A01(fingerprintBottomSheet.A1D()));
            findViewById.setLayoutParams(layoutParams);
        }
        A012.A0S(3);
        C1232167o.A00(A012, fingerprintBottomSheet, 0);
    }

    public void A1S() {
        AnonymousClass0QU r1 = new AnonymousClass0QU();
        this.A04 = r1;
        C90034fi r0 = this.A05;
        if (r0 != null) {
            r0.A02(r1, this);
        }
    }

    public final void A1T() {
        AnonymousClass0QU r0 = this.A04;
        if (r0 != null) {
            r0.A01();
            this.A04 = null;
        }
    }

    public void BMx(int i, CharSequence charSequence) {
        C90034fi r1 = this.A05;
        if (r1 != null && (r1 instanceof C90024fh)) {
            Log.i("AppAuthSettingsActivity/fingerprint-error");
            ((C90024fh) r1).A00.A74();
        }
        if (this.A06 != null) {
            if (i == 7) {
                Object[] A0L = AnonymousClass002.A0L();
                AnonymousClass000.A1L(A0L, 30);
                charSequence = C08310eF.A09(this).getString(R.string.f11nameremoved, A0L);
            }
            this.A06.A02(charSequence);
        }
        A1T();
    }

    public void BMy() {
        FingerprintView fingerprintView = this.A06;
        if (fingerprintView != null) {
            fingerprintView.A03(fingerprintView.getContext().getString(R.string.f11nameremoved));
        }
    }

    public void BN0(int i, CharSequence charSequence) {
        FingerprintView fingerprintView = this.A06;
        if (fingerprintView != null) {
            fingerprintView.A03(charSequence.toString());
        }
    }

    public void BN1(byte[] bArr) {
        C90034fi r0 = this.A05;
        if (r0 != null) {
            r0.A03(bArr);
        }
        FingerprintView fingerprintView = this.A06;
        if (fingerprintView != null) {
            fingerprintView.A00();
        }
    }

    public void BN2(Signature signature) {
        FingerprintView fingerprintView = this.A06;
        if (fingerprintView != null) {
            fingerprintView.A00();
        }
    }

    public static FingerprintBottomSheet A00(int i, int i2, int i3, int i4) {
        FingerprintBottomSheet fingerprintBottomSheet = new FingerprintBottomSheet();
        Bundle A082 = AnonymousClass002.A08();
        A082.putInt("title", i);
        A082.putInt("negative_button_text", i2);
        A082.putInt("positive_button_text", i3);
        if (i4 != 0) {
            A082.putInt("header_layout_id", i4);
        }
        A082.putInt("fingerprint_view_style_id", R.style.f12nameremoved);
        A082.putBoolean("full_screen", false);
        fingerprintBottomSheet.A0u(A082);
        return fingerprintBottomSheet;
    }

    public static /* synthetic */ void A02(FingerprintBottomSheet fingerprintBottomSheet) {
        fingerprintBottomSheet.A1L();
        C90034fi r0 = fingerprintBottomSheet.A05;
        if (r0 != null) {
            r0.A01();
        }
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Bundle A0H = A0H();
        int i = A0H.getInt("custom_layout_id");
        if (i == 0) {
            i = R.layout.f8nameremoved;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        int i2 = A0H.getInt("header_layout_id");
        if (i2 != 0) {
            ViewGroup A0J = C86644Kx.A0J(inflate, R.id.header_container);
            layoutInflater.inflate(i2, A0J);
            A0J.setVisibility(0);
        }
        ViewGroup A0J2 = C86644Kx.A0J(inflate, R.id.fingerprint_view_wrapper);
        if (A0J2 != null) {
            FingerprintView fingerprintView = new FingerprintView(inflate.getContext(), (AttributeSet) null, 0, A0H.getInt("fingerprint_view_style_id"));
            this.A06 = fingerprintView;
            A0J2.addView(fingerprintView);
        } else {
            this.A06 = (FingerprintView) inflate.findViewById(R.id.fingerprint_view);
        }
        AnonymousClass002.A09(inflate, R.id.fingerprint_bottomsheet_title).setText(A0H.getInt("title", R.string.f11nameremoved));
        if (A0H.getInt("positive_button_text") != 0) {
            TextView A092 = AnonymousClass002.A09(inflate, R.id.fingerprint_bottomsheet_positive_button);
            this.A03 = A092;
            A092.setText(A0H.getInt("positive_button_text"));
            C18280x3.A0p(this.A03, this, 41);
        }
        if (A0H.getInt("negative_button_text") != 0) {
            TextView A093 = AnonymousClass002.A09(inflate, R.id.fingerprint_bottomsheet_negative_button);
            this.A02 = A093;
            C107295b4.A02(A093);
            this.A02.setText(A0H.getInt("negative_button_text"));
            C18280x3.A0p(this.A02, this, 42);
        }
        this.A06.A00 = this.A05;
        Window window = this.A03.getWindow();
        C626936e.A06(window);
        window.getDecorView().setSystemUiVisibility(1280);
        window.setStatusBarColor(0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 48;
        window.setAttributes(attributes);
        this.A03.setOnShowListener(new C107205as(A0H, 0, this));
        return inflate;
    }

    public void A0c() {
        super.A0c();
        FingerprintView fingerprintView = this.A06;
        if (fingerprintView != null) {
            fingerprintView.A00 = null;
            this.A06 = null;
        }
    }

    public void A0d() {
        super.A0d();
        this.A05 = null;
    }

    public void A0e() {
        super.A0e();
        A1T();
    }

    public void A0f() {
        super.A0f();
        if (this.A00 <= this.A07.A0H() && !this.A09) {
            FingerprintView fingerprintView = this.A06;
            if (fingerprintView != null) {
                fingerprintView.A01(fingerprintView.A06);
            }
            A1S();
        }
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        A1M(0, R.style.f12nameremoved);
    }

    public void A1K() {
        A1T();
        super.A1K();
    }

    public void onCancel(DialogInterface dialogInterface) {
        A1T();
        super.onCancel(dialogInterface);
    }
}
