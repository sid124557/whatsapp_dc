package com.whatsapp.contact.contactform;

import X.AnonymousClass000;
import X.AnonymousClass0x2;
import X.AnonymousClass31C;
import X.AnonymousClass481;
import X.AnonymousClass49Z;
import X.AnonymousClass4E4;
import X.AnonymousClass4SG;
import X.AnonymousClass5K9;
import X.AnonymousClass5O6;
import X.AnonymousClass5ZR;
import X.AnonymousClass7DW;
import X.C103165Lu;
import X.C104195Qa;
import X.C105055Tk;
import X.C105245Ud;
import X.C106175Xx;
import X.C106675Zy;
import X.C106785aA;
import X.C107695bk;
import X.C112815kQ;
import X.C1225364t;
import X.C1225464u;
import X.C18290x4;
import X.C1891190b;
import X.C43732Tg;
import X.C44102Ur;
import X.C44772Xk;
import X.C44792Xm;
import X.C53802nh;
import X.C55652qh;
import X.C56962sq;
import X.C59752xQ;
import X.C627736r;
import X.C64223Cq;
import X.C64333Db;
import X.C64773Ex;
import X.C65203Gp;
import X.C66413Li;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86654Ky;
import X.C88834as;
import X.C89644eZ;
import X.C95814uZ;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;

public class ContactFormActivity extends C89644eZ implements AnonymousClass4E4, C1225364t, AnonymousClass49Z, C1225464u, AnonymousClass481 {
    public int A00;
    public C106175Xx A01;
    public C103165Lu A02;
    public C44102Ur A03;
    public C56962sq A04;
    public C65203Gp A05;
    public C44772Xk A06;
    public C64773Ex A07;
    public AnonymousClass5O6 A08;
    public C112815kQ A09;
    public AnonymousClass5K9 A0A;
    public C104195Qa A0B;
    public C43732Tg A0C;
    public C105245Ud A0D;
    public C44792Xm A0E;
    public C55652qh A0F;
    public C59752xQ A0G;
    public AnonymousClass7DW A0H;
    public C53802nh A0I;
    public C66413Li A0J;
    public C64223Cq A0K;
    public AnonymousClass5ZR A0L;
    public C95814uZ A0M;
    public AnonymousClass31C A0N;
    public C105055Tk A0O;
    public C106675Zy A0P;
    public Long A0Q;
    public Long A0R;
    public boolean A0S;

    public void BQK(String str) {
        startActivityForResult(C627736r.A10(this, str, (String) null), 0);
    }

    public void Bai() {
        if (!isFinishing()) {
            C106785aA.A01(this, new C1891190b(this, 25), new C1891190b(this, 26), R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
        }
    }

    public void A5r() {
        if (!this.A0S) {
            this.A0S = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r3 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r3, this, AnonymousClass4SG.A2t(r2, r3, this));
            this.A05 = (C65203Gp) r2.AXm.get();
            this.A0P = C86624Kv.A0W(r2);
            this.A0N = C64333Db.A5u(r2);
            this.A07 = C64333Db.A26(r2);
            this.A0K = C86604Kt.A0T(r2);
            this.A04 = C86654Ky.A0T(r2);
            this.A0J = (C66413Li) r2.A6U.get();
            this.A01 = C86604Kt.A0N(r2);
            this.A0O = C86614Ku.A0k(r2);
            this.A0I = (C53802nh) r3.A6e.get();
            this.A06 = C86614Ku.A0P(r2);
            this.A0L = C64333Db.A2r(r2);
            this.A02 = (C103165Lu) A2W.A0M.get();
            this.A03 = (C44102Ur) A2W.A0N.get();
        }
    }

    public void BM7() {
        this.A0O.A02((Boolean) null, 5);
    }

    public void Bak(Intent intent) {
        this.A0O.A02(Boolean.valueOf(AnonymousClass000.A1W(this.A0B.A00)), 4);
        AnonymousClass0x2.A0m(this, intent);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0) {
            this.A0D.A04(i2, intent);
        } else if (i == 1) {
            C18290x4.A18(this.A0A.A00);
        } else if (i == 150) {
            this.A0F.A01();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        if (!this.A08.A00()) {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
        if (r1 == false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r45) {
        /*
            r44 = this;
            r7 = r44
            r0 = r45
            super.onCreate(r0)
            r0 = 2131624431(0x7f0e01ef, float:1.8876042E38)
            r7.setContentView((int) r0)
            android.content.Intent r6 = r7.getIntent()
            java.lang.String r8 = "contact_id"
            r29 = 0
            r0 = 0
            if (r6 == 0) goto L_0x014c
            boolean r2 = r6.hasExtra(r8)
            if (r2 == 0) goto L_0x014c
            long r0 = r6.getLongExtra(r8, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0027:
            r7.A0Q = r0
            java.lang.String r0 = "is_whatsapp_contact"
            r3 = 0
            r6.getBooleanExtra(r0, r3)
            java.lang.String r2 = "wa_contact_table_column_id"
            boolean r0 = r6.hasExtra(r2)
            if (r0 == 0) goto L_0x0148
            r0 = -1
            long r0 = r6.getLongExtra(r2, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0041:
            r7.A0R = r0
            java.lang.String r1 = "contact_sync_policy"
            boolean r0 = r6.hasExtra(r1)
            if (r0 == 0) goto L_0x0145
            int r0 = r6.getIntExtra(r1, r3)
        L_0x004f:
            r7.A00 = r0
            r0 = 2131888111(0x7f1207ef, float:1.9410848E38)
            r7.setTitle(r0)
            androidx.appcompat.widget.Toolbar r3 = X.AnonymousClass4SG.A2T(r7)
            X.0R8 r2 = X.AnonymousClass4SG.A2S(r7, r3)
            java.lang.Long r0 = r7.A0Q
            if (r0 == 0) goto L_0x0071
            boolean r0 = X.AnonymousClass4SG.A44(r7)
            if (r0 == 0) goto L_0x0071
            r1 = 2
            X.69E r0 = new X.69E
            r0.<init>(r7, r1)
            r3.A0R = r0
        L_0x0071:
            android.content.Intent r1 = r7.getIntent()
            if (r1 == 0) goto L_0x0082
            java.lang.String r0 = "contact_data_phone"
            boolean r1 = r1.hasExtra(r0)
            r0 = 2131888125(0x7f1207fd, float:1.9410876E38)
            if (r1 != 0) goto L_0x0085
        L_0x0082:
            r0 = 2131890689(0x7f121201, float:1.9416077E38)
        L_0x0085:
            r2.A0B(r0)
            r0 = 1
            r2.A0N(r0)
            android.os.Bundle r1 = r6.getExtras()
            java.lang.String r43 = ""
            r27 = r43
            if (r1 == 0) goto L_0x00a0
            java.lang.String r0 = "contact_data_phone"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x00a0
            r43 = r0
        L_0x00a0:
            android.view.View r9 = r7.A00
            r1 = 1
            X.C162457s7.A0J(r9, r1)
            X.2Xm r0 = new X.2Xm
            r0.<init>(r7, r9)
            r7.A0E = r0
            X.5NP r13 = new X.5NP
            r13.<init>(r7, r9, r0)
            X.5Y0 r0 = r7.A0C
            X.C162457s7.A0J(r0, r1)
            r12 = 2
            X.5XZ r5 = new X.5XZ
            r5.<init>(r7, r9, r13, r0)
            X.2nh r1 = r7.A0I
            X.C162457s7.A0J(r1, r12)
            X.5Qa r0 = new X.5Qa
            r0.<init>(r7, r9, r1)
            r7.A0B = r0
            X.7DW r0 = new X.7DW
            r0.<init>(r9)
            r7.A0H = r0
            r11 = 4
            X.693 r1 = new X.693
            r1.<init>(r7, r11)
            androidx.appcompat.widget.SwitchCompat r0 = r0.A00
            r0.setOnCheckedChangeListener(r1)
            X.4FS r0 = r7.A04
            r24 = r0
            X.31C r4 = r7.A0N
            X.3Ex r3 = r7.A07
            X.2sq r2 = r7.A04
            X.3Li r1 = r7.A0J
            X.1ip r0 = r7.A07
            X.5Qa r15 = r7.A0B
            X.5kQ r10 = new X.5kQ
            r16 = r10
            r17 = r7
            r18 = r2
            r19 = r0
            r20 = r3
            r21 = r15
            r22 = r1
            r23 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r7.A09 = r10
            X.3Wi r14 = r7.A05
            X.5Zy r4 = r7.A0P
            X.33i r3 = r7.A08
            X.33j r2 = r7.A00
            X.5Xx r1 = r7.A01
            X.5Ud r0 = new X.5Ud
            r37 = r7
            r30 = r0
            r31 = r7
            r32 = r9
            r33 = r1
            r34 = r14
            r35 = r10
            r36 = r15
            r38 = r13
            r39 = r3
            r40 = r2
            r41 = r4
            r42 = r24
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r7.A0D = r0
            java.lang.Long r0 = r7.A0Q
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r10 = 1
            java.lang.String r4 = "native_contact_sync_to_device"
            if (r0 == 0) goto L_0x01be
            boolean r0 = X.AnonymousClass4SG.A44(r7)
            if (r0 == 0) goto L_0x01be
            java.lang.String r0 = "contact_chat_jid"
            java.lang.String r0 = r6.getStringExtra(r0)
            goto L_0x0150
        L_0x0145:
            r0 = -1
            goto L_0x004f
        L_0x0148:
            r0 = r29
            goto L_0x0041
        L_0x014c:
            r0 = r29
            goto L_0x0027
        L_0x0150:
            X.4uZ r0 = X.C106405Yw.A04(r0)     // Catch:{ 24P -> 0x0157 }
            r7.A0M = r0     // Catch:{ 24P -> 0x0157 }
            goto L_0x015e
        L_0x0157:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x015e:
            boolean r0 = r6.hasExtra(r4)
            r2 = 0
            if (r0 == 0) goto L_0x0311
            long r0 = r6.getLongExtra(r4, r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x016e:
            long r17 = r0.longValue()
            int r0 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0181
            r0 = 2131434138(0x7f0b1a9a, float:1.8490081E38)
            android.view.View r1 = X.C06560Yg.A02(r9, r0)
            r0 = 0
            r1.setVisibility(r0)
        L_0x0181:
            X.4FS r15 = r7.A04
            X.3Gp r14 = r7.A05
            X.3Ex r13 = r7.A07
            X.3Cq r1 = r7.A0K
            X.4uZ r0 = r7.A0M
            int r16 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            boolean r26 = X.AnonymousClass000.A1T(r16)
            java.lang.Long r2 = r7.A0Q
            r25 = r2
            X.5Ud r3 = r7.A0D
            X.3Wi r2 = r7.A05
            X.C86624Kv.A1O(r15, r10, r14)
            X.C86614Ku.A1S(r13, r12, r1)
            X.C162457s7.A0J(r0, r11)
            X.AnonymousClass0x2.A1B(r3, r2)
            X.2Tg r12 = new X.2Tg
            r16 = r12
            r17 = r2
            r18 = r14
            r19 = r13
            r20 = r7
            r21 = r3
            r22 = r1
            r23 = r0
            r24 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r7.A0C = r12
        L_0x01be:
            X.5Ud r2 = r7.A0D
            X.3Wi r1 = r7.A05
            r0 = 3
            X.C162457s7.A0J(r2, r0)
            X.C162457s7.A0J(r1, r11)
            X.5K9 r0 = new X.5K9
            r12 = r7
            r11 = r0
            r13 = r9
            r14 = r1
            r15 = r7
            r16 = r5
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r7.A0A = r0
            X.1VX r11 = r7.A0D
            X.3Wi r3 = r7.A05
            X.4FS r2 = r7.A04
            X.2Xk r1 = r7.A06
            X.5ZR r0 = r7.A0L
            X.2Ts r18 = new X.2Ts
            r23 = r7
            r19 = r7
            r20 = r9
            r21 = r3
            r22 = r1
            r24 = r0
            r25 = r11
            r26 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            android.os.Bundle r1 = r6.getExtras()
            if (r1 == 0) goto L_0x0208
            java.lang.String r0 = "contact_data_phone"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0208
            r27 = r0
        L_0x0208:
            android.os.Bundle r1 = r6.getExtras()
            if (r1 == 0) goto L_0x0271
            java.lang.String r0 = "contact_data_lid"
            java.lang.String r0 = r1.getString(r0)
            X.1fH r2 = X.C27981fH.A00(r0)
            if (r2 == 0) goto L_0x0271
            r0 = 2131432394(0x7f0b13ca, float:1.8486544E38)
            android.view.View r8 = X.C06560Yg.A02(r9, r0)
            r0 = 2131429191(0x7f0b0747, float:1.8480048E38)
            android.view.View r4 = X.C06560Yg.A02(r9, r0)
            r0 = 2131432397(0x7f0b13cd, float:1.848655E38)
            android.view.View r3 = X.C06560Yg.A02(r9, r0)
            r0 = 2131427567(0x7f0b00ef, float:1.8476754E38)
            android.view.View r1 = X.C06560Yg.A02(r9, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r27)
            if (r0 != 0) goto L_0x0268
            r0 = 0
            r8.setEnabled(r0)
            r4.setEnabled(r0)
            r3.setEnabled(r0)
        L_0x0246:
            X.5Lu r1 = r7.A02
            X.2Xm r0 = r7.A0E
            X.2ch r15 = r1.A00(r5, r0, r7, r2)
            X.5Ud r1 = r7.A0D
            X.2qh r11 = r7.A0F
        L_0x0252:
            X.5O6 r0 = new X.5O6
            r12 = r5
            r13 = r1
            r14 = r11
            r10 = r0
            r11 = r7
            r10.<init>(r11, r12, r13, r14, r15)
            r7.A08 = r0
            android.os.Bundle r1 = r6.getExtras()
            X.5Ud r0 = r7.A0D
            X.C106785aA.A02(r1, r5, r0)
            return
        L_0x0268:
            r0 = 8
            X.C86624Kv.A14(r8, r4, r3, r0)
            r1.setVisibility(r0)
            goto L_0x0246
        L_0x0271:
            boolean r2 = r6.hasExtra(r4)
            r0 = 0
            if (r2 == 0) goto L_0x030d
            long r2 = r6.getLongExtra(r4, r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
        L_0x0281:
            boolean r2 = X.AnonymousClass4SG.A44(r7)
            if (r2 == 0) goto L_0x0290
            java.lang.Long r2 = r7.A0Q
            boolean r2 = X.AnonymousClass000.A1W(r2)
            X.C106785aA.A03(r9, r2)
        L_0x0290:
            X.7DW r9 = r7.A0H
            if (r3 == 0) goto L_0x030b
            long r3 = r3.longValue()
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x030b
        L_0x029c:
            androidx.appcompat.widget.SwitchCompat r2 = r9.A00
            r2.setChecked(r10)
            java.lang.String r2 = "extra_contact_phone_number"
            java.lang.String r31 = r6.getStringExtra(r2)
            X.2Ur r9 = r7.A03
            X.7DW r4 = r7.A0H
            X.5Qa r3 = r7.A0B
            X.5Ud r2 = r7.A0D
            r10 = r3
            r11 = r5
            r12 = r2
            r13 = r7
            r14 = r4
            X.2xQ r2 = r9.A00(r10, r11, r12, r13, r14)
            r7.A0G = r2
            X.1VX r2 = r7.A0D
            r16 = r2
            X.3Wi r15 = r7.A05
            X.2qk r14 = r7.A03
            X.4FS r13 = r7.A04
            boolean r2 = r6.hasExtra(r8)
            if (r2 == 0) goto L_0x02d2
            long r0 = r6.getLongExtra(r8, r0)
            java.lang.Long r29 = java.lang.Long.valueOf(r0)
        L_0x02d2:
            X.33i r12 = r7.A08
            X.2Xk r10 = r7.A06
            X.5ZR r9 = r7.A0L
            X.5Ud r8 = r7.A0D
            X.2Xm r4 = r7.A0E
            X.7DW r3 = r7.A0H
            X.2xQ r2 = r7.A0G
            X.5Qa r1 = r7.A0B
            java.lang.Long r0 = r7.A0R
            X.2qh r11 = new X.2qh
            r23 = r2
            r24 = r3
            r25 = r12
            r26 = r9
            r27 = r16
            r28 = r13
            r30 = r0
            r19 = r5
            r20 = r8
            r21 = r4
            r22 = r7
            r17 = r1
            r16 = r10
            r13 = r11
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r7.A0F = r11
            X.5Ud r1 = r7.A0D
            r15 = 0
            goto L_0x0252
        L_0x030b:
            r10 = 0
            goto L_0x029c
        L_0x030d:
            r3 = r29
            goto L_0x0281
        L_0x0311:
            r0 = r29
            goto L_0x016e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.contactform.ContactFormActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!(this.A0Q == null || !this.A0D.A0X(5868) || menu == null)) {
            getMenuInflater().inflate(R.menu.f10nameremoved, menu);
            if (!this.A0D.A0X(5868) || this.A00 != 1) {
                menu.findItem(R.id.save_to_phone).setVisible(false);
            } else {
                MenuItem findItem = menu.findItem(R.id.save_to_phone);
                findItem.setVisible(true);
                findItem.setTitle(getString(R.string.f11nameremoved));
            }
            menu.findItem(R.id.delete_contact).setTitle(getString(R.string.f11nameremoved));
        }
        return super.onCreateOptionsMenu(menu);
    }

    public ContactFormActivity(int i) {
        this.A0S = false;
        C86604Kt.A1K(this, 33);
    }

    public boolean BHC() {
        return isFinishing();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0E.A00(configuration);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A09.A00();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || !this.A08.A00()) {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    public void requestPermission() {
        RequestPermissionActivity.A0d(this, R.string.f11nameremoved, R.string.f11nameremoved, false);
    }

    public ContactFormActivity() {
        this(0);
        this.A00 = -1;
    }
}
