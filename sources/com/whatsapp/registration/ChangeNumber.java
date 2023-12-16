package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass1Hf;
import X.AnonymousClass29x;
import X.AnonymousClass317;
import X.AnonymousClass33S;
import X.AnonymousClass33T;
import X.AnonymousClass33X;
import X.AnonymousClass33p;
import X.AnonymousClass36l;
import X.AnonymousClass4DY;
import X.AnonymousClass4FS;
import X.AnonymousClass4MQ;
import X.AnonymousClass4SG;
import X.AnonymousClass5N8;
import X.AnonymousClass5NA;
import X.AnonymousClass5V0;
import X.AnonymousClass698;
import X.AnonymousClass6AE;
import X.C102735Kb;
import X.C105265Uf;
import X.C107195ar;
import X.C107405bG;
import X.C107695bk;
import X.C109665ez;
import X.C115435of;
import X.C1233267z;
import X.C133326h9;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C19340zH;
import X.C53652nR;
import X.C54292oU;
import X.C56142rU;
import X.C56422rx;
import X.C56612sH;
import X.C57612tv;
import X.C621233o;
import X.C621433s;
import X.C626936e;
import X.C627736r;
import X.C64333Db;
import X.C66523Lt;
import X.C66543Lv;
import X.C70033Zp;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86664Kz;
import X.C88834as;
import X.C96204vy;
import X.C97674z3;
import X.C989653x;
import X.C993255h;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.components.PhoneNumberEntry;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONObject;

public class ChangeNumber extends C97674z3 {
    public static String A0N;
    public static String A0O;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public View A06;
    public ScrollView A07;
    public C56422rx A08;
    public AnonymousClass33T A09;
    public C66543Lv A0A;
    public C621233o A0B;
    public C66523Lt A0C;
    public AnonymousClass33S A0D;
    public AnonymousClass33X A0E;
    public C102735Kb A0F;
    public C105265Uf A0G;
    public ArrayList A0H;
    public boolean A0I;
    public final Handler A0J;
    public final AnonymousClass4DY A0K;
    public final C109665ez A0L;
    public final Runnable A0M;

    public void Bp8() {
        C621433s.A00(this, 1);
        super.Bp8();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r9, int r10, android.content.Intent r11) {
        /*
            r8 = this;
            r0 = 1
            r2 = -1
            if (r9 != r0) goto L_0x015f
            if (r10 != r2) goto L_0x0176
            if (r11 == 0) goto L_0x0176
            java.lang.String r0 = "selectedJids"
            java.util.ArrayList r0 = r11.getStringArrayListExtra(r0)
            r8.A0H = r0
            X.2nx r2 = r8.A02
            X.2sr r0 = r8.A01
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A05(r0)
            java.lang.String r1 = r0.user
            java.util.ArrayList r0 = r8.A0H
            X.2Lz r3 = new X.2Lz
            r3.<init>(r1, r0)
            java.lang.String r0 = "changenumbermanager/savechangenumbercontacts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2oU r0 = r2.A02     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
            android.content.Context r2 = r0.A00     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
            java.lang.String r1 = "change_number_contacts.json"
            r0 = 0
            java.io.FileOutputStream r2 = r2.openFileOutput(r1, r0)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
            java.lang.String r1 = X.C58152un.A0B     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
            r0.<init>(r2, r1)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
            r2.beginObject()     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "old_jid"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = r3.A00     // Catch:{ all -> 0x0072 }
            r1.value(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "notify_jids"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x0072 }
            r0.beginArray()     // Catch:{ all -> 0x0072 }
            java.util.ArrayList r0 = r3.A01     // Catch:{ all -> 0x0072 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0072 }
        L_0x005a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = X.AnonymousClass001.A0m(r1)     // Catch:{ all -> 0x0072 }
            r2.value(r0)     // Catch:{ all -> 0x0072 }
            goto L_0x005a
        L_0x0068:
            r2.endArray()     // Catch:{ all -> 0x0072 }
            r2.endObject()     // Catch:{ all -> 0x0072 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
            goto L_0x0086
        L_0x0072:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0077 }
            goto L_0x007b
        L_0x0077:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
        L_0x007b:
            throw r1     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
        L_0x007c:
            r1 = move-exception
            java.lang.String r0 = "ChangeNumberManager/saveChangeNumberContacts/ioErrorJson "
            goto L_0x0083
        L_0x0080:
            r1 = move-exception
            java.lang.String r0 = "ChangeNumberManager/saveChangeNumberContacts/notFoundJson "
        L_0x0083:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0086:
            X.5Kb r0 = r8.A0F
            android.widget.EditText r0 = r0.A02
            java.lang.String r7 = X.C86604Kt.A0o(r0)
            X.5Kb r0 = r8.A0F
            android.widget.EditText r0 = r0.A03
            java.lang.String r3 = X.C18290x4.A0m(r0)
            X.5Kb r0 = r8.A0F
            boolean r0 = r8.A7D(r0, r7, r3)
            if (r0 == 0) goto L_0x0176
            X.5Kb r0 = r8.A0I
            android.widget.EditText r0 = r0.A02
            java.lang.String r2 = X.C86604Kt.A0o(r0)
            X.5Kb r0 = r8.A0I
            android.widget.EditText r0 = r0.A03
            java.lang.String r1 = X.C18290x4.A0m(r0)
            X.5Kb r0 = r8.A0I
            boolean r0 = r8.A7D(r0, r2, r1)
            if (r0 == 0) goto L_0x0176
            int r2 = java.lang.Integer.parseInt(r7)
            java.lang.String r1 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r6 = r3.replaceAll(r1, r0)
            X.5Xx r0 = r8.A03     // Catch:{ IOException -> 0x00c9 }
            java.lang.String r6 = r0.A02(r2, r6)     // Catch:{ IOException -> 0x00c9 }
            goto L_0x00cf
        L_0x00c9:
            r1 = move-exception
            java.lang.String r0 = "ChangeNumber/phone failed trimLeadingZero from CountryPhoneInfo"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00cf:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ChangeNumber/phone/cc="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "/number="
            X.C18260x0.A0s(r0, r6, r1)
            A0N = r7
            A0O = r6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ChangeNumber/submit/cc "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " ph="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " jid="
            r1.append(r0)
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass4SG.A2m(r8)
            X.C18270x1.A17(r0, r1)
            X.3Lt r0 = r8.A0C
            X.1im r0 = r0.A0K
            int r1 = r0.A04
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r0 != 0) goto L_0x013d
            java.lang.String r0 = "ChangeNumber/submit/no-connectivity"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = 2131887556(0x7f1205c4, float:1.9409722E38)
            java.lang.String r0 = r8.getString(r0)
            X.AnonymousClass0x2.A1N(r1, r0)
            r0 = 2131888104(0x7f1207e8, float:1.9410834E38)
            X.AnonymousClass0x2.A0s(r8, r1, r0)
            java.lang.String r0 = "\n\n"
            r1.append(r0)
            r0 = 2131888105(0x7f1207e9, float:1.9410836E38)
            X.AnonymousClass0x2.A0s(r8, r1, r0)
            java.lang.String r0 = r1.toString()
        L_0x0139:
            r8.Bou(r0)
            return
        L_0x013d:
            r5 = 1
            X.C621433s.A01(r8, r5)
            android.os.Handler r4 = r8.A0J
            r2 = 30000(0x7530, double:1.4822E-319)
            r1 = 4
            r4.sendEmptyMessageDelayed(r1, r2)
            X.33S r0 = r8.A0D
            boolean r0 = r0.A06(r7, r6)
            if (r0 != 0) goto L_0x0176
            r4.removeMessages(r1)
            X.C621433s.A00(r8, r5)
            r0 = 2131892894(0x7f121a9e, float:1.942055E38)
            java.lang.String r0 = X.C86604Kt.A0l(r8, r0)
            goto L_0x0139
        L_0x015f:
            r0 = 2
            if (r9 != r0) goto L_0x017a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ChangeNumber/register/phone/sms permission "
            r1.append(r0)
            if (r10 != r2) goto L_0x0177
            java.lang.String r0 = "granted"
        L_0x016f:
            X.C18260x0.A1L(r1, r0)
            r0 = 0
            r8.A7C(r0)
        L_0x0176:
            return
        L_0x0177:
            java.lang.String r0 = "denied"
            goto L_0x016f
        L_0x017a:
            super.onActivityResult(r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.ChangeNumber.onActivityResult(int, int, android.content.Intent):void");
    }

    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            return AnonymousClass36l.A06(this, getString(R.string.f11nameremoved));
        }
        if (i != 2) {
            return super.onCreateDialog(i);
        }
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0T(R.string.f11nameremoved);
        C86614Ku.A1O(A002, this, 57, R.string.f11nameremoved);
        return A002.create();
    }

    public void A5r() {
        if (!this.A0I) {
            this.A0I = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r2 = A2X.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            AnonymousClass4SG.A3U(r2, r1, this);
            AnonymousClass4SG.A3V(r2, r1, this);
            this.A0A = C64333Db.A2r(r2);
            AnonymousClass4SG.A3J(A2X, r2, C86614Ku.A0O(r2), this);
            this.A0D = (AnonymousClass33S) r2.AUY.get();
            this.A0C = AnonymousClass4SG.A2n(r2);
            this.A0A = C86614Ku.A0Z(r2);
            this.A0E = (AnonymousClass33X) r2.AZa.get();
            this.A0G = r1.ANk();
            this.A08 = C86614Ku.A0T(r2);
            this.A09 = (AnonymousClass33T) r2.Aaf.get();
            this.A0B = C86664Kz.A1D(r2);
        }
    }

    public final void A7B() {
        if (isFinishing()) {
            Log.i("ChangeNumber/verify/cancel");
            return;
        }
        C97674z3.A0f = 0;
        this.A09.A1U((String) null);
        this.A0B.A0E();
        Log.i("BusinessDirectoryStorageManager/onNumberChanged");
        C96204vy r1 = ((AnonymousClass5N8) ((C64333Db) AnonymousClass29x.A00(C64333Db.class, getApplicationContext())).AcK.A00.A1h.get()).A01;
        Log.i("BusinessDirectorySharedPrefManager/deleteLocation");
        C18270x1.A0g(AnonymousClass5NA.A00(r1), "current_search_location");
        AnonymousClass4FS r0 = this.A04;
        long j = C97674z3.A0f;
        C56612sH r2 = this.A06;
        String str = C97674z3.A0g;
        C626936e.A06(str);
        String str2 = C97674z3.A0h;
        C626936e.A06(str2);
        C54292oU r3 = this.A09;
        C53652nR r7 = this.A0F;
        C56142rU r6 = this.A0D;
        C18270x1.A0w(new C993255h(r2, r3, this.A09, this.A0C, r6, r7, this.A0L, this.A0O, this.A0G, this, str, str2, (String) null, (JSONObject) null, j), r0);
    }

    public final void A7C(boolean z) {
        boolean z2;
        Intent A0A2;
        boolean z3 = z;
        if (this.A0C.A0X(3902)) {
            C18270x1.A0l(AnonymousClass4SG.A2P(this), "registration_use_sms_retriever", z3);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ChangeNumber/startVerifyCode/useSmsRetriever=");
        A0o.append(z3);
        A0o.append("/shouldStartAccountDefenceFlow=");
        C18260x0.A1V(A0o, this.A0Y);
        if (C97674z3.A0i != null) {
            if (this.A0C.A0X(4031)) {
                this.A0M.A0B(12, true);
            }
            String str = C97674z3.A0i;
            int i = C97674z3.A0c;
            long j = this.A03;
            long j2 = this.A04;
            z2 = true;
            long j3 = j2;
            long j4 = this.A05;
            long j5 = j;
            A0A2 = C627736r.A0y(this, str, i, C97674z3.A0e, 0, j5, j3, j4, -1, z3, false, true, false, AnonymousClass000.A1U(this.A00, 3));
        } else if (C97674z3.A0b == 1) {
            this.A0M.A0B(17, true);
            String str2 = C97674z3.A0i;
            int i2 = C97674z3.A0c;
            long j6 = this.A03;
            long j7 = this.A04;
            long j8 = this.A05;
            z2 = true;
            long j9 = j7;
            long j10 = j8;
            long j11 = this.A02;
            long j12 = j6;
            A0A2 = C627736r.A0y(this, str2, i2, C97674z3.A0e, 0, j12, j9, j10, j11, z3, false, true, false, AnonymousClass000.A1U(this.A00, 3));
        } else if (this.A0Y) {
            int i3 = this.A00;
            z2 = true;
            AnonymousClass317 r2 = this.A0M;
            if (i3 == 1) {
                r2.A0B(14, true);
                A0A2 = C627736r.A0E(this, this.A03, this.A04, true, z3);
            } else if (i3 == 3) {
                r2.A0B(16, true);
                A0A2 = C627736r.A1C(this, true);
            } else {
                r2.A0B(13, true);
                A0A2 = C627736r.A0A(this, 0, 1, this.A03, this.A04, 0, true, z3);
            }
        } else {
            z2 = true;
            if (C97674z3.A0e == 4) {
                A0A2 = C627736r.A0B(this, 0, this.A03, this.A04, this.A05, -1, true);
            } else {
                Log.i("ChangeNumber/startVerifyCode/fallback");
                A0A2 = C627736r.A0A(this, C97674z3.A0e, 0, this.A03, this.A04, this.A05, true, z3);
            }
        }
        A6T(A0A2, z2);
    }

    public final boolean A7D(C102735Kb r7, String str, String str2) {
        EditText editText;
        int i;
        switch (C107195ar.A00(this.A03, str, str2)) {
            case 1:
                int parseInt = Integer.parseInt(str);
                String replaceAll = str2.replaceAll("\\D", "");
                try {
                    replaceAll = this.A03.A02(parseInt, replaceAll);
                } catch (IOException e) {
                    Log.e("ChangeNumber/cc failed trimLeadingZero from CountryPhoneInfo", e);
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("ChangeNumber/cc=");
                A0o.append(str);
                C18260x0.A0s("/number=", replaceAll, A0o);
                C97674z3.A0g = str;
                C97674z3.A0h = replaceAll;
                return true;
            case 2:
                Object[] A0M2 = AnonymousClass002.A0M();
                AnonymousClass000.A1P(A0M2, 1, 0);
                AnonymousClass000.A1P(A0M2, 3, 1);
                Bou(getString(R.string.f11nameremoved, A0M2));
                editText = r7.A02;
                break;
            case 3:
                Bot(R.string.f11nameremoved);
                r7.A02.setText("");
                editText = r7.A02;
                break;
            case 4:
                Bot(R.string.f11nameremoved);
                editText = r7.A03;
                break;
            case 5:
                i = R.string.f11nameremoved;
                break;
            case 6:
                i = R.string.f11nameremoved;
                break;
            default:
                i = R.string.f11nameremoved;
                break;
        }
        Bou(AnonymousClass002.A0F(this, this.A0S.A02(this.A00, r7.A06), new Object[1], 0, i));
        editText = r7.A03;
        editText.requestFocus();
        return false;
    }

    public void onDestroy() {
        AnonymousClass317 r0 = this.A0M;
        r0.A12.remove(this.A0K);
        super.onDestroy();
    }

    public ChangeNumber(int i) {
        this.A0I = false;
        C86604Kt.A1K(this, 83);
    }

    public void A79(String str, String str2, String str3) {
        super.A79(str, str2, str3);
        if (this.A0K.A02) {
            AnonymousClass36l.A0I(this, this.A09, this.A0M, false);
        }
        this.A0M.A0E();
        finish();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Log.d("ChangeNumber/[onConfigurationChanged]");
        AnonymousClass6AE.A00(this.A07.getViewTreeObserver(), this, 6);
    }

    public void onCreate(Bundle bundle) {
        String simCountryIso;
        super.onCreate(bundle);
        this.A0D.A02();
        this.A09.A0i();
        C107405bG.A03(this);
        C107405bG.A04(this);
        setTitle(R.string.f11nameremoved);
        AnonymousClass0R8 A0R = C86634Kw.A0R(this);
        A0R.A0N(true);
        A0R.A0O(true);
        setContentView((int) R.layout.f8nameremoved);
        PhoneNumberEntry phoneNumberEntry = (PhoneNumberEntry) findViewById(R.id.registration_fields);
        PhoneNumberEntry phoneNumberEntry2 = (PhoneNumberEntry) findViewById(R.id.registration_new_fields);
        C102735Kb r0 = new C102735Kb();
        this.A0F = r0;
        r0.A05 = phoneNumberEntry;
        C102735Kb r02 = new C102735Kb();
        this.A0I = r02;
        r02.A05 = phoneNumberEntry2;
        this.A07 = (ScrollView) findViewById(R.id.scroll_view);
        this.A06 = findViewById(R.id.bottom_button_container);
        C102735Kb r03 = this.A0F;
        WaEditText waEditText = phoneNumberEntry.A02;
        r03.A02 = waEditText;
        C18300x5.A13(this, waEditText, R.string.f11nameremoved);
        C102735Kb r04 = this.A0I;
        WaEditText waEditText2 = phoneNumberEntry2.A02;
        r04.A02 = waEditText2;
        C18300x5.A13(this, waEditText2, R.string.f11nameremoved);
        this.A0F.A03 = phoneNumberEntry.A03;
        C102735Kb r1 = this.A0I;
        WaEditText waEditText3 = phoneNumberEntry2.A03;
        r1.A03 = waEditText3;
        waEditText3.setTextDirection(3);
        this.A0F.A03.setTextDirection(3);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        TelephonyManager A0N2 = this.A08.A0N();
        if (!(A0N2 == null || (simCountryIso = A0N2.getSimCountryIso()) == null)) {
            try {
                A0N = this.A03.A04(simCountryIso);
            } catch (IOException e) {
                Log.e("ChangeNumber/iso/code failed to get code from CountryPhoneInfo", e);
            }
        }
        phoneNumberEntry.A04 = new C133326h9(this);
        phoneNumberEntry2.A04 = new C1233267z(this, 0);
        AnonymousClass4SG.A3o(this);
        TextView A0L2 = C18310x6.A0L(this, R.id.next_btn);
        A0L2.setText(R.string.f11nameremoved);
        A0L2.setOnClickListener(this.A0L);
        String str = A0N;
        if (str != null) {
            this.A0F.A02.setText(str);
            this.A0I.A02.setText(A0N);
        }
        String str2 = this.A0F.A06;
        if (str2 != null && str2.length() > 0) {
            C18260x0.A0s("ChangeNumber/country: ", str2, AnonymousClass001.A0o());
            this.A0F.A05.A03(str2);
            this.A0I.A05.A03(str2);
        }
        this.A0U = C18280x3.A0Z(AnonymousClass1Hf.A27(this), "change_number_new_number_banned");
        AnonymousClass317 r05 = this.A0M;
        r05.A12.add(this.A0K);
        this.A00 = C18320x8.A00(this, R.dimen.f6nameremoved);
        this.A07.getViewTreeObserver().addOnScrollChangedListener(new AnonymousClass698(this, 2));
        AnonymousClass6AE.A00(this.A07.getViewTreeObserver(), this, 6);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onPause() {
        SharedPreferences.Editor remove;
        super.onPause();
        AnonymousClass4SG.A3o(this);
        String str = this.A0U;
        AnonymousClass33p r0 = this.A09;
        if (str != null) {
            remove = C18270x1.A03(r0).putString("change_number_new_number_banned", AnonymousClass000.A0U("+", C97674z3.A0g, C97674z3.A0h, AnonymousClass001.A0o()));
        } else if (C18280x3.A0Z(AnonymousClass0x2.A0F(r0), "change_number_new_number_banned") != null) {
            remove = AnonymousClass4SG.A2P(this).remove("change_number_new_number_banned");
        } else {
            return;
        }
        remove.apply();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        A0N = bundle.getString("oldCountryCode");
        A0O = bundle.getString("oldPhoneNumber");
        C97674z3.A0g = bundle.getString("countryCode");
        C97674z3.A0h = bundle.getString("phoneNumber");
        this.A0H = bundle.getStringArrayList("notifyJids");
        this.A01 = bundle.getInt("mode");
    }

    public void onResume() {
        super.onResume();
        String str = A0N;
        if (str != null) {
            this.A0F.A02.setText(str);
        }
        C102735Kb r0 = this.A0F;
        C57612tv.A01(r0.A02, r0.A00);
        C102735Kb r02 = this.A0F;
        C57612tv.A01(r02.A03, r02.A01);
        C102735Kb r03 = this.A0I;
        C57612tv.A01(r03.A02, r03.A00);
        C102735Kb r04 = this.A0I;
        C57612tv.A01(r04.A03, r04.A01);
        this.A0F.A03.clearFocus();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("oldCountryCode", A0N);
        bundle.putCharSequence("oldPhoneNumber", A0O);
        bundle.putCharSequence("countryCode", C97674z3.A0g);
        bundle.putCharSequence("phoneNumber", C97674z3.A0h);
        bundle.putStringArrayList("notifyJids", this.A0H);
        bundle.putInt("mode", this.A01);
    }

    public ChangeNumber() {
        this(0);
        this.A03 = 0;
        this.A04 = 0;
        this.A05 = 0;
        this.A02 = 0;
        this.A0M = new C70033Zp(this, 20);
        this.A0K = new C115435of(this);
        this.A0J = new AnonymousClass4MQ(Looper.getMainLooper(), this);
        this.A0L = new C989653x(this, 25);
    }
}
