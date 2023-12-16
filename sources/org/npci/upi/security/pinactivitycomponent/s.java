package org.npci.upi.security.pinactivitycomponent;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0Y8;
import X.C003203q;
import X.C08310eF;
import X.C109495ei;
import X.C124616Df;
import X.C125126Fq;
import X.C180068kR;
import X.C48812fW;
import X.C70163a3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Timer;
import org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText;

public abstract class s extends C08310eF implements C180068kR {
    public int A00 = -1;
    public int A01 = 2;
    public Context A02;
    public CountDownTimer A03 = null;
    public Handler A04;
    public Runnable A05;
    public ArrayList A06 = AnonymousClass001.A0s();
    public Timer A07 = null;
    public Timer A08;
    public C48812fW A09;
    public boolean A0A = false;
    public boolean A0B = false;

    public C125126Fq A1H(Boolean bool, String str, String str2, String str3, int i, int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C125126Fq r2 = new C125126Fq(A0Q(), this.A02);
        r2.setActionBarPositionTop(true);
        layoutParams.width = -2;
        FormItemEditText formItemEditText = r2.A0G;
        formItemEditText.setCharSize(0.0f);
        formItemEditText.setSpace((float) ((int) (15.0f * ((float) (AnonymousClass000.A0B(A0G()).densityDpi / 160)))));
        formItemEditText.setFontSize((float) ((int) (24.0f * ((float) (AnonymousClass000.A0B(A0G()).densityDpi / 160)))));
        formItemEditText.setMargin(new int[]{80, (int) (25.0f * ((float) (AnonymousClass000.A0B(A0G()).densityDpi / 160))), 80, 0});
        formItemEditText.setLineStrokeCentered(true);
        formItemEditText.setLineStrokeSelected((float) ((int) (2.0f * ((float) (AnonymousClass000.A0B(A0G()).densityDpi / 160)))));
        formItemEditText.setColorStates(AnonymousClass0Y8.A07(A0Q(), R.color.f5nameremoved));
        r2.setLayoutParams(layoutParams);
        r2.setInputLength(i2);
        r2.A0H = this;
        r2.setTitle(str);
        r2.A01 = i;
        r2.setEducationalText(str2);
        r2.A0F = str3;
        if (((GetCredential) this.A02).A0G.A0K) {
            r2.setForgotUpi(bool);
            return r2;
        }
        r2.setForgotUpi(Boolean.FALSE);
        return r2;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x007c=Splitter:B:39:0x007c, B:26:0x004d=Splitter:B:26:0x004d, B:48:0x008f=Splitter:B:48:0x008f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1J(X.AnonymousClass7TF r9) {
        /*
            r8 = this;
            java.lang.String r6 = "otp_type_aadhaar"
            java.lang.String r3 = "AADHAAR"
            int r1 = r8.A00     // Catch:{ Exception -> 0x00b9 }
            r0 = -1
            if (r1 == r0) goto L_0x00b9
            java.util.ArrayList r7 = r8.A06     // Catch:{ Exception -> 0x00b9 }
            boolean r0 = r8.A0A     // Catch:{ Exception -> 0x00b9 }
            if (r0 == 0) goto L_0x0011
            int r1 = r1 + -1
        L_0x0011:
            X.6Fq r0 = X.AnonymousClass6C9.A0p(r7, r1)     // Catch:{ Exception -> 0x00b9 }
            boolean r0 = r0.isShown()     // Catch:{ Exception -> 0x00b9 }
            if (r0 == 0) goto L_0x0024
            boolean r1 = r8.A0A     // Catch:{ Exception -> 0x00b9 }
            int r0 = r8.A00     // Catch:{ Exception -> 0x00b9 }
            if (r1 == 0) goto L_0x0026
            int r0 = r0 + -1
            goto L_0x0026
        L_0x0024:
            int r0 = r8.A00     // Catch:{ Exception -> 0x00b9 }
        L_0x0026:
            X.6Fq r5 = X.AnonymousClass6C9.A0p(r7, r0)     // Catch:{ Exception -> 0x00b9 }
            boolean r0 = r8.A0A     // Catch:{ Exception -> 0x00b9 }
            r1 = 1
            java.lang.String r4 = "otp_type_bank"
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = r5.A0F     // Catch:{ Exception -> 0x00b9 }
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x00b9 }
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = r9.A00     // Catch:{ Exception -> 0x00b9 }
            boolean r0 = r0.contains(r3)     // Catch:{ Exception -> 0x00b9 }
            if (r0 == 0) goto L_0x0064
            X.2fW r0 = r8.A09     // Catch:{ Exception -> 0x00b9 }
            android.content.SharedPreferences r0 = r0.A01     // Catch:{ Exception -> 0x004c }
            java.lang.String r3 = r0.getString(r6, r2)     // Catch:{ Exception -> 0x004c }
            goto L_0x004d
        L_0x004c:
            r3 = 0
        L_0x004d:
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x00b9 }
            if (r0 != 0) goto L_0x00b9
            r8.A0B = r1     // Catch:{ Exception -> 0x00b9 }
            r5.setText(r3)     // Catch:{ Exception -> 0x00b9 }
            X.2fW r0 = r8.A09     // Catch:{ Exception -> 0x00b9 }
            android.content.SharedPreferences r0 = r0.A01     // Catch:{ Exception -> 0x00b9 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x00b9 }
            r0.putString(r6, r2)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x00b6
        L_0x0064:
            java.lang.String r3 = r5.A0F     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "SMS"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x00b9 }
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r8.A0B     // Catch:{ Exception -> 0x00b9 }
            if (r0 != 0) goto L_0x00b9
            X.2fW r0 = r8.A09     // Catch:{ Exception -> 0x00b9 }
            android.content.SharedPreferences r0 = r0.A01     // Catch:{ Exception -> 0x007b }
            java.lang.String r3 = r0.getString(r4, r2)     // Catch:{ Exception -> 0x007b }
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x00b9 }
            if (r0 != 0) goto L_0x00b9
            r8.A0B = r1     // Catch:{ Exception -> 0x00b9 }
            goto L_0x00a8
        L_0x0085:
            X.2fW r0 = r8.A09     // Catch:{ Exception -> 0x00b9 }
            android.content.SharedPreferences r0 = r0.A01     // Catch:{ Exception -> 0x008e }
            java.lang.String r3 = r0.getString(r4, r2)     // Catch:{ Exception -> 0x008e }
            goto L_0x008f
        L_0x008e:
            r3 = 0
        L_0x008f:
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x00b9 }
            if (r0 != 0) goto L_0x00b9
            r8.A0B = r1     // Catch:{ Exception -> 0x00b9 }
            boolean r1 = r8.A0A     // Catch:{ Exception -> 0x00b9 }
            int r0 = r8.A00     // Catch:{ Exception -> 0x00b9 }
            if (r1 == 0) goto L_0x009f
            int r0 = r0 + -1
        L_0x009f:
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x00b9 }
            X.66w r0 = (X.C1230466w) r0     // Catch:{ Exception -> 0x00b9 }
            r0.setText(r3)     // Catch:{ Exception -> 0x00b9 }
        L_0x00a8:
            r5.setText(r3)     // Catch:{ Exception -> 0x00b9 }
            X.2fW r0 = r8.A09     // Catch:{ Exception -> 0x00b9 }
            android.content.SharedPreferences r0 = r0.A01     // Catch:{ Exception -> 0x00b9 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x00b9 }
            r0.putString(r4, r2)     // Catch:{ Exception -> 0x00b9 }
        L_0x00b6:
            r0.commit()     // Catch:{ Exception -> 0x00b9 }
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.upi.security.pinactivitycomponent.s.A1J(X.7TF):void");
    }

    public void A1K(C125126Fq r3) {
        boolean equals = r3.A0F.equals("AADHAAR");
        int i = R.string.f11nameremoved;
        if (equals) {
            i = R.string.f11nameremoved;
        }
        r3.A02(C08310eF.A09(this).getString(i), true);
    }

    public void A1L(C125126Fq r9) {
        r9.Avx((Drawable) null, (View.OnClickListener) null, "", 0, false, false);
        r9.A00(r9.A05, false);
        this.A03 = new C124616Df(this, r9).start();
        r9.A01();
    }

    public void A0a() {
        Runnable runnable;
        super.A0a();
        Timer timer = this.A07;
        if (timer != null) {
            try {
                timer.cancel();
            } catch (Exception unused) {
            }
        }
        CountDownTimer countDownTimer = this.A03;
        if (countDownTimer != null) {
            try {
                countDownTimer.cancel();
            } catch (Exception unused2) {
            }
        }
        Timer timer2 = this.A08;
        if (timer2 != null) {
            try {
                timer2.cancel();
            } catch (Exception unused3) {
            }
        }
        Handler handler = this.A04;
        if (handler != null && (runnable = this.A05) != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public void A0w(Bundle bundle, View view) {
        C003203q A0Q = A0Q();
        if (A0Q instanceof GetCredential) {
            GetCredential getCredential = (GetCredential) A0Q;
            getCredential.A0I = this;
            this.A01 = getCredential.A0G.A00;
        }
    }

    public void A1G(Context context) {
        super.A1G(context);
        this.A02 = context;
        this.A09 = new C48812fW(context);
    }

    public void A1I(String str) {
        View findViewById = A0Q().findViewById(R.id.popupView);
        findViewById.setVisibility(0);
        findViewById.setAnimation(AnimationUtils.loadAnimation(A1D(), R.anim.f0nameremoved));
        AnonymousClass002.A09(findViewById, R.id.popup_text).setText(str);
        C109495ei.A00(findViewById.findViewById(R.id.popup_button), findViewById, this, 36);
        this.A08 = new Timer();
        Handler A0A2 = AnonymousClass000.A0A();
        this.A04 = A0A2;
        C70163a3 r2 = new C70163a3(this, 15, findViewById);
        this.A05 = r2;
        A0A2.postDelayed(r2, 3000);
    }
}
