package com.whatsapp.phonematching;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0RP;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass1P6;
import X.C08310eF;
import X.C106175Xx;
import X.C106675Zy;
import X.C107195ar;
import X.C111095hX;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C56972sr;
import X.C57612tv;
import X.C620633i;
import X.C620733j;
import X.C625635p;
import X.C633939b;
import X.C89644eZ;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.components.PhoneNumberEntry;
import com.whatsapp.util.Log;
import java.io.IOException;

public class CountryAndPhoneNumberFragment extends Hilt_CountryAndPhoneNumberFragment {
    public int A00;
    public int A01;
    public EditText A02;
    public EditText A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public C106175Xx A08;
    public C89644eZ A09;
    public PhoneNumberEntry A0A;
    public C620633i A0B;
    public C620733j A0C;
    public MatchPhoneNumberFragment A0D;
    public C106675Zy A0E;
    public String A0F = null;
    public String A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        return X.C08310eF.A09(r6).getString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        return X.AnonymousClass0x7.A0n(r6, r6.A06.getText(), new java.lang.Object[1], 0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A1J(int r7) {
        /*
            r6 = this;
            r5 = 0
            r0 = 1
            switch(r7) {
                case 2: goto L_0x002d;
                case 3: goto L_0x0021;
                case 4: goto L_0x001d;
                case 5: goto L_0x0019;
                case 6: goto L_0x0015;
                default: goto L_0x0005;
            }
        L_0x0005:
            r2 = 2131892890(0x7f121a9a, float:1.9420541E38)
        L_0x0008:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            android.widget.TextView r0 = r6.A06
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = X.AnonymousClass0x7.A0n(r6, r0, r1, r5, r2)
            return r0
        L_0x0015:
            r2 = 2131892891(0x7f121a9b, float:1.9420543E38)
            goto L_0x0008
        L_0x0019:
            r2 = 2131892892(0x7f121a9c, float:1.9420545E38)
            goto L_0x0008
        L_0x001d:
            r1 = 2131892902(0x7f121aa6, float:1.9420565E38)
            goto L_0x0024
        L_0x0021:
            r1 = 2131892887(0x7f121a97, float:1.9420535E38)
        L_0x0024:
            android.content.res.Resources r0 = X.C08310eF.A09(r6)
            java.lang.String r0 = r0.getString(r1)
            return r0
        L_0x002d:
            X.4eZ r4 = r6.A09
            r3 = 2131892886(0x7f121a96, float:1.9420533E38)
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            r1 = 1
            X.AnonymousClass000.A1P(r2, r0, r5)
            r0 = 3
            X.AnonymousClass000.A1P(r2, r0, r1)
            java.lang.String r0 = r4.getString(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.phonematching.CountryAndPhoneNumberFragment.A1J(int):java.lang.String");
    }

    public void A1K() {
        EditText editText;
        String trim = C18290x4.A0m(this.A02).trim();
        String A0m = C18290x4.A0m(this.A03);
        int A002 = C107195ar.A00(this.A08, C18290x4.A0m(this.A02).trim(), C18290x4.A0m(this.A03));
        switch (A002) {
            case 2:
                C89644eZ r4 = this.A09;
                Object[] A0M = AnonymousClass002.A0M();
                AnonymousClass000.A1L(A0M, 1);
                AnonymousClass000.A1P(A0M, 3, 1);
                r4.Bou(r4.getString(R.string.f11nameremoved, A0M));
                break;
            case 3:
                this.A09.Bou(C08310eF.A09(this).getString(R.string.f11nameremoved));
                this.A02.setText("");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                this.A09.Bou(A1J(A002));
                editText = this.A03;
                break;
            default:
                int parseInt = Integer.parseInt(trim);
                String replaceAll = A0m.replaceAll("\\D", "");
                try {
                    replaceAll = this.A08.A02(parseInt, replaceAll);
                } catch (IOException e) {
                    Log.e("CountryAndPhoneNumberFragment/phone failed trimLeadingZero from CountryPhoneInfo", e);
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("CountryAndPhoneNumberFragment/phone/cc=");
                A0o.append(trim);
                C18260x0.A0s("/number=", replaceAll, A0o);
                this.A0F = trim;
                MatchPhoneNumberFragment matchPhoneNumberFragment = this.A0D;
                if (matchPhoneNumberFragment != null) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("MatchPhoneNumberFragment/submit/cc ");
                    A0o2.append(trim);
                    A0o2.append(" ph=");
                    A0o2.append(replaceAll);
                    A0o2.append(" jid=");
                    C18270x1.A17(C56972sr.A04(matchPhoneNumberFragment.A00), A0o2);
                    matchPhoneNumberFragment.A02.A00.Bp6();
                    matchPhoneNumberFragment.A02.sendEmptyMessageDelayed(4, C625635p.A0L);
                    if (!matchPhoneNumberFragment.A02.A00.BlR(trim, replaceAll)) {
                        matchPhoneNumberFragment.A02.removeMessages(4);
                        matchPhoneNumberFragment.A02.A00.B1s();
                        C89644eZ r42 = matchPhoneNumberFragment.A01;
                        r42.Bou(AnonymousClass002.A0F(r42, r42.getString(R.string.f11nameremoved), AnonymousClass002.A0L(), 0, R.string.f11nameremoved));
                        return;
                    }
                    return;
                }
                return;
        }
        editText = this.A02;
        editText.requestFocus();
    }

    public final void A1L(boolean z) {
        TextView textView = this.A05;
        C89644eZ r1 = this.A09;
        int i = R.color.f5nameremoved;
        if (z) {
            i = R.color.f5nameremoved;
        }
        AnonymousClass0x2.A0q(r1, textView, i);
        int i2 = R.color.f5nameremoved;
        if (z) {
            i2 = R.color.f5nameremoved;
        }
        this.A06.getBackground().setColorFilter(AnonymousClass0Y8.A04(this.A09, i2), PorterDuff.Mode.SRC_IN);
        TextView textView2 = this.A04;
        int i3 = 4;
        if (z) {
            i3 = 0;
        }
        textView2.setVisibility(i3);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        this.A0A = (PhoneNumberEntry) A0R.findViewById(R.id.phone_number_entry);
        this.A06 = AnonymousClass002.A09(A0R, R.id.registration_country);
        this.A04 = AnonymousClass002.A09(A0R, R.id.registration_country_error_view);
        this.A07 = AnonymousClass002.A09(A0R, R.id.registration_phone_error_view);
        this.A05 = AnonymousClass002.A09(A0R, R.id.registration_country_label);
        PhoneNumberEntry phoneNumberEntry = this.A0A;
        this.A02 = phoneNumberEntry.A02;
        this.A03 = phoneNumberEntry.A03;
        phoneNumberEntry.A04 = new AnonymousClass1P6(this);
        TelephonyManager A0N = this.A0B.A0N();
        if (A0N == null) {
            Log.w("CountryAndPhoneNumberFragment tm=null");
        } else {
            String simCountryIso = A0N.getSimCountryIso();
            if (simCountryIso != null) {
                try {
                    this.A0F = this.A08.A04(simCountryIso);
                } catch (IOException e) {
                    Log.e("CountryAndPhoneNumberFragment/iso/code failed to get code from CountryPhoneInfo", e);
                }
            }
        }
        this.A06.setBackground(AnonymousClass0RP.A00(this.A09, R.drawable.abc_spinner_textfield_background_material));
        this.A03.setTextDirection(3);
        C633939b.A00(this.A06, this, 9);
        this.A03.requestFocus();
        this.A01 = C57612tv.A00(this.A03);
        this.A00 = C57612tv.A00(this.A02);
        String str = this.A0F;
        if (str != null) {
            this.A02.setText(str);
        }
        if (!TextUtils.isEmpty(this.A0G)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("CountryAndPhoneNumberFragment/country: ");
            C18260x0.A1L(A0o, this.A0G);
            this.A0A.A03(this.A0G);
        }
        return A0R;
    }

    public void A0e() {
        super.A0e();
        this.A01 = C57612tv.A00(this.A03);
        this.A00 = C57612tv.A00(this.A02);
    }

    public void A0f() {
        super.A0f();
        String str = this.A0F;
        if (str != null) {
            this.A02.setText(str);
        }
        String str2 = this.A0G;
        if (str2 != null) {
            this.A06.setText(this.A0E.A02(this.A0C, str2));
        }
        C57612tv.A01(this.A02, this.A00);
        C57612tv.A01(this.A03, this.A01);
        this.A03.clearFocus();
    }

    public void A0k(int i, int i2, Intent intent) {
        super.A0k(i, i2, intent);
        if (i == 0 && i2 == -1 && intent != null) {
            this.A0F = intent.getStringExtra("cc");
            this.A0G = intent.getStringExtra("iso");
            String stringExtra = intent.getStringExtra("country_name");
            this.A02.setText(this.A0F);
            this.A06.setText(stringExtra);
            this.A0A.A03(this.A0G);
            if (this.A01 == -1) {
                this.A01 = Integer.MAX_VALUE;
            }
        }
    }

    public void A1G(Context context) {
        super.A1G(context);
        this.A09 = (C89644eZ) C111095hX.A03(context, C89644eZ.class);
    }
}
