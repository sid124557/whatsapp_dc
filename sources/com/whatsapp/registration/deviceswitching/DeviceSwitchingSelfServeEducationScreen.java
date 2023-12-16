package com.whatsapp.registration.deviceswitching;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1VW;
import X.AnonymousClass317;
import X.AnonymousClass4SG;
import X.C107695bk;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C18320x8;
import X.C184578sA;
import X.C50152hi;
import X.C54292oU;
import X.C55092pm;
import X.C56502s5;
import X.C627736r;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C88834as;
import X.C89644eZ;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

public final class DeviceSwitchingSelfServeEducationScreen extends C89644eZ implements C184578sA {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public WaTextView A05;
    public WaTextView A06;
    public C54292oU A07;
    public AnonymousClass1VW A08;
    public C50152hi A09;
    public AnonymousClass317 A0A;
    public C55092pm A0B;
    public C56502s5 A0C;
    public WDSButton A0D;
    public WDSButton A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;

    public void BhU() {
        this.A0L = false;
        if (this.A0K) {
            A75();
        } else {
            A74();
        }
    }

    public void Bpy() {
        this.A0L = true;
        if (this.A0K) {
            A75();
        } else {
            A74();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00dd, code lost:
        if (r2.length() == 0) goto L_0x00df;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r9 = r15
            r0 = r16
            super.onCreate(r0)
            X.C107405bG.A05(r15)
            r0 = 2131624756(0x7f0e0334, float:1.88767E38)
            r15.setContentView((int) r0)
            android.os.Bundle r0 = X.C86614Ku.A0D(r15)
            r12 = 0
            if (r0 == 0) goto L_0x0069
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "change_number"
            boolean r2 = r1.getBooleanExtra(r0, r12)
            r15.A0H = r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DeviceSwitchingSelfServeEducationScreen/onCreate/changeNumber: "
            X.C18260x0.A1D(r0, r1, r2)
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "flash_type"
            int r0 = X.C86664Kz.A07(r1, r0)
            r15.A00 = r0
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "sms_retry_time"
            r2 = 0
            long r0 = r1.getLongExtra(r0, r2)
            r15.A02 = r0
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "voice_retry_time"
            long r0 = r1.getLongExtra(r0, r2)
            r15.A03 = r0
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "wa_old_retry_time"
            long r0 = r1.getLongExtra(r0, r2)
            r15.A04 = r0
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "email_otp_retry_time"
            long r0 = r1.getLongExtra(r0, r2)
            r15.A01 = r0
        L_0x0069:
            X.2s5 r1 = r15.A0C
            if (r1 == 0) goto L_0x018a
            java.lang.String r0 = "wa_old_self_serve"
            r1.A01(r0)
            X.1VW r1 = r15.A08
            if (r1 == 0) goto L_0x0183
            r0 = 3902(0xf3e, float:5.468E-42)
            boolean r0 = r1.A0X(r0)
            r15.A0J = r0
            X.33j r10 = r15.A00
            android.view.View r8 = r15.A00
            r11 = 2131434319(0x7f0b1b4f, float:1.8490449E38)
            r13 = 1
            r14 = r12
            X.AnonymousClass36l.A0K(r8, r9, r10, r11, r12, r13, r14)
            android.view.View r1 = r15.A00
            r0 = 2131434082(0x7f0b1a62, float:1.8489968E38)
            com.whatsapp.WaTextView r0 = X.C86604Kt.A0O(r1, r0)
            r15.A06 = r0
            android.view.View r0 = r15.A00
            r7 = 2131434320(0x7f0b1b50, float:1.849045E38)
            com.whatsapp.WaTextView r0 = X.C86604Kt.A0O(r0, r7)
            r15.A05 = r0
            android.view.View r1 = r15.A00
            r0 = 2131429080(0x7f0b06d8, float:1.8479823E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.C86614Ku.A0p(r1, r0)
            r15.A0D = r0
            android.view.View r1 = r15.A00
            r0 = 2131434627(0x7f0b1c83, float:1.8491073E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.C86614Ku.A0p(r1, r0)
            r15.A0E = r0
            X.33p r0 = r15.A09
            java.lang.String r0 = r0.A0Z()
            r15.A0F = r0
            X.33p r0 = r15.A09
            java.lang.String r2 = r0.A0b()
            r15.A0G = r2
            com.whatsapp.WaTextView r8 = r15.A05
            if (r8 != 0) goto L_0x00d1
            java.lang.String r0 = "activityTitle"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00d1:
            r6 = 2131895002(0x7f1222da, float:1.9424825E38)
            java.lang.Object[] r5 = new java.lang.Object[r13]
            if (r2 == 0) goto L_0x00df
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x00e0
        L_0x00df:
            r0 = 1
        L_0x00e0:
            r4 = 0
            if (r0 != 0) goto L_0x0104
            java.lang.String r1 = r15.A0F
            if (r1 == 0) goto L_0x0104
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0104
            X.33j r3 = r15.A00
            java.lang.String r2 = X.AnonymousClass36l.A0C(r1, r2)
            if (r2 == 0) goto L_0x0100
            r1 = 32
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r4 = r2.replace(r1, r0)
            X.C162457s7.A0D(r4)
        L_0x0100:
            java.lang.String r4 = r3.A0I(r4)
        L_0x0104:
            r5[r12] = r4
            X.AnonymousClass001.A0y(r15, r8, r5, r6)
            X.1VW r0 = r15.A08
            if (r0 == 0) goto L_0x017c
            X.AnonymousClass36l.A0M(r15, r0, r7)
            com.whatsapp.WaTextView r4 = r15.A06
            if (r4 != 0) goto L_0x011b
            java.lang.String r0 = "description"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x011b:
            r3 = 2131895003(0x7f1222db, float:1.9424827E38)
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r1 = 2130970371(0x7f040703, float:1.754945E38)
            r0 = 2131102225(0x7f060a11, float:1.7816882E38)
            int r0 = X.AnonymousClass5Yj.A02(r15, r1, r0)
            java.lang.String r0 = X.C107575bX.A04(r15, r0)
            java.lang.String r0 = X.AnonymousClass002.A0F(r15, r0, r2, r12, r3)
            android.text.Spanned r0 = X.C02890Hz.A00(r0)
            r4.setText(r0)
            X.1VW r1 = r15.A08
            if (r1 == 0) goto L_0x0175
            r0 = 6608(0x19d0, float:9.26E-42)
            boolean r0 = r1.A0X(r0)
            java.lang.String r2 = "continueButton"
            if (r0 == 0) goto L_0x0156
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A0D
            if (r1 != 0) goto L_0x0150
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0150:
            r0 = 2131893481(0x7f121ce9, float:1.942174E38)
            r1.setText(r0)
        L_0x0156:
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A0D
            if (r1 != 0) goto L_0x015f
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x015f:
            r0 = 11
            X.AnonymousClass0x2.A10(r1, r15, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A0E
            if (r1 != 0) goto L_0x016f
            java.lang.String r0 = "verifyAnotherWayButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x016f:
            r0 = 12
            X.AnonymousClass0x2.A10(r1, r15, r0)
            return
        L_0x0175:
            java.lang.String r0 = "abPreChatdProps"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x017c:
            java.lang.String r0 = "abPreChatdProps"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0183:
            java.lang.String r0 = "abPreChatdProps"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x018a:
            java.lang.String r0 = "funnelLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.deviceswitching.DeviceSwitchingSelfServeEducationScreen.onCreate(android.os.Bundle):void");
    }

    public void A5r() {
        if (!this.A0I) {
            this.A0I = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A07 = C64333Db.A2q(r2);
            this.A0C = AnonymousClass4SG.A2q(r1);
            this.A08 = C86624Kv.A0S(r2);
            this.A09 = A2W.AD3();
            this.A0A = C86614Ku.A0i(r2);
            this.A0B = AnonymousClass4SG.A2o(r2);
        }
    }

    public final void A75() {
        Log.i("DeviceSwitchingSelfServeEducationScreen/startVerifyVoice");
        AnonymousClass317 r2 = this.A0A;
        if (r2 != null) {
            r2.A0B(5, true);
            this.A00.A0A(this, C627736r.A0F(this, this.A02, this.A03, this.A0L, this.A0H));
            finish();
            return;
        }
        throw C18270x1.A0S("registrationManager");
    }

    public void onBackPressed() {
        Intent A042;
        C56502s5 r2 = this.A0C;
        if (r2 != null) {
            r2.A04("wa_old_self_serve", "back");
            if (this.A0H) {
                Log.i("DeviceSwitchingSelfServeEducationScreen/returnToEnterPhoneNumber/change number flow");
                AnonymousClass317 r22 = this.A0A;
                if (r22 != null) {
                    r22.A0B(3, true);
                    AnonymousClass317 r0 = this.A0A;
                    if (r0 != null) {
                        if (!r0.A0F()) {
                            finish();
                        }
                        A042 = C18320x8.A07();
                        A042.setClassName(getPackageName(), "com.whatsapp.registration.ChangeNumber");
                    } else {
                        throw C18270x1.A0S("registrationManager");
                    }
                } else {
                    throw C18270x1.A0S("registrationManager");
                }
            } else {
                Log.i("DeviceSwitchingSelfServeEducationScreen/returnToEnterPhoneNumber/reg flow");
                AnonymousClass317 r02 = this.A0A;
                if (r02 != null) {
                    r02.A0B(1, true);
                    A042 = C627736r.A04(this);
                    C162457s7.A0D(A042);
                    A042.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", true);
                } else {
                    throw C18270x1.A0S("registrationManager");
                }
            }
            this.A00.A0A(this, A042);
            finish();
            return;
        }
        throw C18270x1.A0S("funnelLogger");
    }

    public DeviceSwitchingSelfServeEducationScreen(int i) {
        this.A0I = false;
        C86604Kt.A1K(this, 89);
    }

    public final void A74() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DeviceSwitchingSelfServeEducationScreen/startVerifySms/useSmsRetriever : ");
        C18260x0.A1V(A0o, this.A0L);
        AnonymousClass317 r1 = this.A0A;
        if (r1 != null) {
            r1.A0B(4, true);
            this.A00.A0A(this, C627736r.A0y(this, (String) null, -1, 0, 0, this.A02, this.A03, 0, 0, this.A0L, true, this.A0H, false, false));
            finish();
            return;
        }
        throw C18270x1.A0S("registrationManager");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass4SG.A39(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A042 = C18290x4.A04(menuItem);
        if (A042 == 1) {
            C50152hi r3 = this.A09;
            if (r3 != null) {
                C55092pm r2 = this.A0B;
                if (r2 != null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("device-switching-self-serve-education-screen +");
                    A0o.append(this.A0F);
                    r3.A01(this, r2, AnonymousClass000.A0X(this.A0G, A0o));
                } else {
                    throw C18270x1.A0S("verificationFlowState");
                }
            } else {
                throw C18270x1.A0S("registrationHelper");
            }
        } else if (A042 == 2) {
            AnonymousClass4SG.A35(this);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public DeviceSwitchingSelfServeEducationScreen() {
        this(0);
    }
}
