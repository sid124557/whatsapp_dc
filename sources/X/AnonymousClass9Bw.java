package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.bloks.ui.BloksDialogFragment;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.9Bw  reason: invalid class name */
public abstract class AnonymousClass9Bw extends AnonymousClass98r implements AnonymousClass64I {
    public AnonymousClass99P A00;
    public AnonymousClass8nX A01;
    public AnonymousClass36P A02;
    public AnonymousClass5ZR A03;
    public C66543Lv A04;
    public AnonymousClass33S A05;
    public AnonymousClass9LW A06;
    public C1906899l A07;
    public C40602Ha A08;
    public C1906999m A09;
    public C620933l A0A;
    public AnonymousClass5SZ A0B;
    public AnonymousClass9U5 A0C;
    public C153087ae A0D;
    public C197769dq A0E;
    public AnonymousClass9U4 A0F;
    public C194089Rn A0G;
    public C194309Sj A0H;
    public AnonymousClass9RH A0I;
    public AnonymousClass9VU A0J;
    public AnonymousClass9TZ A0K;
    public AnonymousClass9TD A0L;
    public C160757oG A0M = C160757oG.A00("PayBloksActivity", "bloks", "COMMON");
    public C194029Rh A0N;
    public C44522Wj A0O;
    public AnonymousClass9W3 A0P;
    public AnonymousClass9VB A0Q;
    public AnonymousClass9TR A0R;
    public C192709Lg A0S;
    public PaymentIncentiveViewModel A0T;
    public C194259Se A0U;
    public C193119Nf A0V;
    public AnonymousClass28X A0W;
    public C66433Lk A0X;
    public C54522or A0Y;
    public C60482yd A0Z;
    public boolean A0a = false;

    public static String A0b(String str, Map map) {
        String replaceAll = str.replaceAll("\\s", "");
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            if (Pattern.compile((String) A0w.getValue()).matcher(replaceAll).find()) {
                return C18310x6.A0q(A0w);
            }
        }
        return "";
    }

    public static void A0c(C52792m3 r2, Map map, int i) {
        if (map == null) {
            map = AnonymousClass001.A0t();
        }
        map.put("error_code", String.valueOf(i));
        r2.A01("on_failure", map);
    }

    public final void A78() {
        if (!(!this.A0E)) {
            Bundle A0D2 = C86614Ku.A0D(this);
            C626936e.A06(A0D2);
            String string = A0D2.getString("screen_name");
            HashMap hashMap = (HashMap) A0D2.getSerializable("screen_params");
            C08270df supportFragmentManager = getSupportFragmentManager();
            this.A05 = BloksDialogFragment.A00(string, hashMap);
            if (hashMap != null) {
                this.A09.A02(hashMap);
            }
            if (supportFragmentManager.A07() == 0) {
                C08240dc A0L2 = AnonymousClass97S.A0L(supportFragmentManager, this);
                A0L2.A0I(string);
                A0L2.A02();
                return;
            }
            A75();
            return;
        }
        this.A0a = true;
    }

    public void A7A(C52792m3 r14) {
        C194309Sj r2 = this.A0H;
        AnonymousClass9OM r1 = new AnonymousClass9OM(r14, this);
        r2.A00 = "PENDING";
        Context context = r2.A02.A00;
        C69263Wi r6 = r2.A01;
        AnonymousClass9RH r9 = r2.A05;
        C193699Pq r4 = new C193699Pq(context, r6, r2.A03, r2.A04, r9);
        AnonymousClass9Qy r5 = new AnonymousClass9Qy(r2, r1);
        AnonymousClass39V[] r22 = new AnonymousClass39V[1];
        AnonymousClass39V.A04("action", "get-account-eligibility-state", r22);
        AnonymousClass36K A0U2 = C1899693i.A0U(r22);
        r4.A03.A0G(new C203899oU(r4.A00, r4.A02, r4.A01, r4, r5, 17), A0U2, "get", 0);
    }

    public void A7B(String str, String str2, HashMap hashMap) {
        String str3;
        if (str2 == null) {
            str3 = "PayBloksActivity/fdsPostProcessing invalid fdsManagerId";
        } else {
            C161447pg A002 = this.A0O.A00(str2);
            if (A002 == null) {
                str3 = "PayBloksActivity/fdsPostProcessing invalid phoenixManager";
            } else {
                C159127lA r0 = A002.A00;
                if (r0 == null) {
                    str3 = "PayBloksActivity/fdsPostProcessing statemachine is null";
                } else {
                    AnonymousClass4G9 r02 = (AnonymousClass4G9) r0.A00(str);
                    if (r02 != null) {
                        r02.B3J(hashMap);
                        return;
                    }
                    return;
                }
            }
        }
        Log.e(str3);
    }

    public boolean BEy(int i) {
        if (i != 404 && i != 440 && i != 449) {
            return false;
        }
        C160757oG r2 = this.A0M;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("handleError/error=");
        C1899593h.A1K(r2, A0o, i);
        this.A0E.A01(true, false);
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0T(R.string.f11nameremoved);
        A002.A0i(false);
        C204219p0.A01(A002, this, 80, R.string.f11nameremoved);
        A002.A0S();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02ed, code lost:
        if (r0 == false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02ef, code lost:
        return "1";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String Bgo(java.lang.String r22, java.util.Map r23) {
        /*
            r21 = this;
            java.lang.String r0 = "case"
            r4 = r23
            java.lang.Object r1 = r4.remove(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r15 = ""
            if (r0 != 0) goto L_0x0032
            int r0 = r1.hashCode()
            r9 = 8
            r8 = 2
            r17 = 0
            r7 = 1
            r14 = -1
            switch(r0) {
                case -2090067461: goto L_0x0157;
                case -1486928264: goto L_0x014f;
                case -1347269146: goto L_0x0147;
                case -1344002586: goto L_0x013c;
                case -1145142119: goto L_0x0131;
                case -1060255204: goto L_0x0126;
                case -1003060006: goto L_0x011b;
                case -985374640: goto L_0x0110;
                case -975395056: goto L_0x0104;
                case -919584206: goto L_0x00f8;
                case -848949171: goto L_0x00ec;
                case -840371252: goto L_0x00e0;
                case -594428356: goto L_0x00d4;
                case -314691285: goto L_0x00c8;
                case 1809539: goto L_0x00bc;
                case 329749850: goto L_0x00b0;
                case 425265908: goto L_0x00a4;
                case 540049915: goto L_0x0098;
                case 580608584: goto L_0x008d;
                case 674867313: goto L_0x0082;
                case 1518694893: goto L_0x0077;
                case 1785060649: goto L_0x006c;
                case 1976375430: goto L_0x0061;
                case 1999013019: goto L_0x0056;
                default: goto L_0x0020;
            }
        L_0x0020:
            java.lang.String r13 = "on_success"
            java.lang.String r12 = "is_hide"
            java.lang.String r11 = "on_failure"
            java.lang.String r10 = "0"
            r5 = 0
            java.lang.String r6 = "1"
            r2 = r21
            r3 = r22
            switch(r14) {
                case 0: goto L_0x0309;
                case 1: goto L_0x0175;
                case 2: goto L_0x015f;
                case 3: goto L_0x02a7;
                case 4: goto L_0x0273;
                case 5: goto L_0x02e5;
                case 6: goto L_0x0254;
                case 7: goto L_0x003e;
                case 8: goto L_0x0238;
                case 9: goto L_0x0033;
                case 10: goto L_0x021c;
                case 11: goto L_0x0204;
                case 12: goto L_0x01f3;
                case 13: goto L_0x02f1;
                case 14: goto L_0x01e8;
                case 15: goto L_0x01d2;
                case 16: goto L_0x01c7;
                case 17: goto L_0x01c0;
                case 18: goto L_0x01bb;
                case 19: goto L_0x0316;
                case 20: goto L_0x02ec;
                case 21: goto L_0x01b0;
                case 22: goto L_0x0195;
                case 23: goto L_0x017f;
                default: goto L_0x0032;
            }
        L_0x0032:
            return r15
        L_0x0033:
            java.lang.String r1 = X.C18310x6.A0o(r3, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0032
            return r1
        L_0x003e:
            androidx.appcompat.widget.Toolbar r1 = X.C1899593h.A07(r2)
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.widget.PayToolbar
            if (r0 == 0) goto L_0x0032
            com.whatsapp.payments.ui.widget.PayToolbar r1 = (com.whatsapp.payments.ui.widget.PayToolbar) r1
            java.lang.Object r0 = r4.get(r12)
            boolean r0 = r6.equals(r0)
            r0 = r0 ^ 1
            r1.setLockIconVisibility(r0)
            return r15
        L_0x0056:
            java.lang.String r0 = "get_merchant_fees"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 23
            goto L_0x0020
        L_0x0061:
            java.lang.String r0 = "string_replace"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 22
            goto L_0x0020
        L_0x006c:
            java.lang.String r0 = "get_pin_retry_ts"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 21
            goto L_0x0020
        L_0x0077:
            java.lang.String r0 = "is_debug_build"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 20
            goto L_0x0020
        L_0x0082:
            java.lang.String r0 = "get_error_string"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 19
            goto L_0x0020
        L_0x008d:
            java.lang.String r0 = "get_card_network"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 18
            goto L_0x0020
        L_0x0098:
            java.lang.String r0 = "get_device_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 17
            goto L_0x0020
        L_0x00a4:
            java.lang.String r0 = "string_upper"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 16
            goto L_0x0020
        L_0x00b0:
            java.lang.String r0 = "get_formatted_date"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 15
            goto L_0x0020
        L_0x00bc:
            java.lang.String r0 = "current_server_time"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 14
            goto L_0x0020
        L_0x00c8:
            java.lang.String r0 = "get_screen_density_bucket"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 13
            goto L_0x0020
        L_0x00d4:
            java.lang.String r0 = "can_set_bio"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 12
            goto L_0x0020
        L_0x00e0:
            java.lang.String r0 = "show_action_bar_icon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 11
            goto L_0x0020
        L_0x00ec:
            java.lang.String r0 = "is_step_completed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 10
            goto L_0x0020
        L_0x00f8:
            java.lang.String r0 = "get_button_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 9
            goto L_0x0020
        L_0x0104:
            java.lang.String r0 = "regex_check"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 8
            goto L_0x0020
        L_0x0110:
            java.lang.String r0 = "hide_lock_icon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 7
            goto L_0x0020
        L_0x011b:
            java.lang.String r0 = "get_faq_uri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 6
            goto L_0x0020
        L_0x0126:
            java.lang.String r0 = "get_tos_uri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 5
            goto L_0x0020
        L_0x0131:
            java.lang.String r0 = "exp_date_check"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 4
            goto L_0x0020
        L_0x013c:
            java.lang.String r0 = "get_phone_last_n_digits"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 3
            goto L_0x0020
        L_0x0147:
            java.lang.String r0 = "hide_toolbar_bottom_divider"
            short r14 = X.C1899693i.A0i(r0, r1)
            goto L_0x0020
        L_0x014f:
            java.lang.String r0 = "enable_secure_flag"
            short r14 = X.C1899693i.A0h(r0, r1)
            goto L_0x0020
        L_0x0157:
            java.lang.String r0 = "hide_toolbar_title_and_logo"
            short r14 = X.C1899693i.A0g(r0, r1)
            goto L_0x0020
        L_0x015f:
            r0 = 2131434335(0x7f0b1b5f, float:1.8490481E38)
            android.view.View r1 = r2.findViewById(r0)
            java.lang.Object r0 = r4.get(r12)
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0171
            r9 = 0
        L_0x0171:
            r1.setVisibility(r9)
            return r15
        L_0x0175:
            android.view.Window r1 = r2.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.setFlags(r0, r0)
            return r15
        L_0x017f:
            X.7ae r0 = r2.A0D
            r0.A01()
            X.9LW r0 = r2.A06
            if (r0 != 0) goto L_0x018f
            X.9LW r0 = new X.9LW
            r0.<init>()
            r2.A06 = r0
        L_0x018f:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0195:
            if (r22 == 0) goto L_0x033c
            java.lang.String r0 = "string_to_replace"
            java.lang.String r2 = X.C18310x6.A0o(r0, r4)
            java.lang.String r0 = "string_replacement"
            java.lang.String r1 = X.C18310x6.A0o(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x02e4
            if (r1 == 0) goto L_0x02e4
            java.lang.String r5 = r3.replaceAll(r2, r1)
            return r5
        L_0x01b0:
            X.9TR r0 = r2.A0R
            long r0 = r0.A00()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            return r5
        L_0x01bb:
            java.lang.String r5 = A0b(r3, r4)
            return r5
        L_0x01c0:
            X.9Se r0 = r2.A0U
            java.lang.String r5 = r0.A01()
            return r5
        L_0x01c7:
            X.33j r0 = r2.A00
            java.util.Locale r0 = r0.A0O()
            java.lang.String r5 = r3.toUpperCase(r0)
            return r5
        L_0x01d2:
            java.lang.String r0 = "date"
            java.lang.String r0 = X.AnonymousClass97S.A0X(r0, r4)
            java.util.Date r1 = X.AnonymousClass9UC.A00(r0)
            if (r1 == 0) goto L_0x01e7
            java.text.DateFormat r0 = java.text.DateFormat.getDateInstance(r7)
            java.lang.String r5 = r0.format(r1)
            return r5
        L_0x01e7:
            return r15
        L_0x01e8:
            X.2sH r0 = r2.A06
            long r0 = r0.A0H()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            return r5
        L_0x01f3:
            X.9W3 r0 = r2.A0P
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x02f0
            X.9W3 r0 = r2.A0P
            int r0 = r0.A01()
            if (r0 == r7) goto L_0x02f0
            return r6
        L_0x0204:
            X.0R8 r1 = r2.getSupportActionBar()
            if (r1 == 0) goto L_0x033c
            com.whatsapp.bloks.ui.BloksDialogFragment r0 = r2.A05
            if (r0 == 0) goto L_0x033c
            java.lang.Boolean r0 = r0.A09
            if (r0 == 0) goto L_0x033c
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x033c
            r1.A0F(r5)
            return r5
        L_0x021c:
            java.lang.String r0 = "completed_step"
            java.lang.String r3 = X.C18310x6.A0o(r0, r4)
            java.lang.String r0 = "is_merchant"
            java.lang.Object r0 = r4.get(r0)
            boolean r1 = r6.equals(r0)
            X.99l r0 = r2.A07
            if (r1 == 0) goto L_0x0232
            X.99m r0 = r2.A09
        L_0x0232:
            boolean r0 = r0.A0G(r3)
            goto L_0x02ed
        L_0x0238:
            java.lang.String r0 = "regex"
            java.lang.String r0 = X.C18310x6.A0o(r0, r4)
            X.C626936e.A06(r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r8)     // Catch:{ PatternSyntaxException -> 0x0251 }
            java.util.regex.Matcher r0 = r0.matcher(r3)     // Catch:{ PatternSyntaxException -> 0x0251 }
            boolean r0 = r0.find()     // Catch:{ PatternSyntaxException -> 0x0251 }
            if (r0 != 0) goto L_0x0250
            return r11
        L_0x0250:
            return r13
        L_0x0251:
            java.lang.String r0 = "on_exception"
            return r0
        L_0x0254:
            java.lang.String r0 = "platform"
            java.lang.String r3 = X.C18310x6.A0o(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0262
            java.lang.String r3 = "payments"
        L_0x0262:
            X.3Lk r1 = r2.A0X
            java.lang.String r0 = "article_id"
            java.lang.String r0 = X.C18310x6.A0o(r0, r4)
            android.net.Uri r0 = r1.A02(r5, r3, r0, r5)
            java.lang.String r5 = r0.toString()
            return r5
        L_0x0273:
            java.lang.String r2 = "MM/yy"
            java.util.Locale r1 = java.util.Locale.US
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r2, r1)
            java.util.Calendar r14 = java.util.Calendar.getInstance()
            int r15 = r14.get(r7)
            int r16 = r14.get(r8)
            r18 = 23
            r19 = 59
            r20 = r19
            r14.set(r15, r16, r17, r18, r19, r20)
            java.util.Date r1 = r0.parse(r3)     // Catch:{ ParseException -> 0x02a6 }
            if (r1 == 0) goto L_0x02a3
            java.util.Date r0 = r14.getTime()     // Catch:{ ParseException -> 0x02a6 }
            boolean r0 = r1.before(r0)     // Catch:{ ParseException -> 0x02a6 }
            if (r0 != 0) goto L_0x02a3
            r17 = 1
        L_0x02a3:
            if (r17 == 0) goto L_0x02a6
            return r13
        L_0x02a6:
            return r11
        L_0x02a7:
            java.lang.String r0 = "num_of_digits"
            java.lang.String r1 = X.C18310x6.A0o(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x02e4
            int r4 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x02dc }
            X.2sr r0 = r2.A01     // Catch:{ NumberFormatException -> 0x02dc }
            r0.A0P()     // Catch:{ NumberFormatException -> 0x02dc }
            X.1RR r1 = r0.A01     // Catch:{ NumberFormatException -> 0x02dc }
            java.lang.Class<X.4uZ> r0 = X.C95814uZ.class
            com.whatsapp.jid.Jid r0 = r1.A0I(r0)     // Catch:{ NumberFormatException -> 0x02dc }
            X.4uZ r0 = (X.C95814uZ) r0     // Catch:{ NumberFormatException -> 0x02dc }
            java.lang.String r5 = X.AnonymousClass36P.A04(r0)     // Catch:{ NumberFormatException -> 0x02dc }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ NumberFormatException -> 0x02dc }
            if (r0 != 0) goto L_0x033c
            int r0 = r5.length()     // Catch:{ NumberFormatException -> 0x02dc }
            if (r0 <= r4) goto L_0x033c
            int r0 = r0 - r4
            java.lang.String r5 = r5.substring(r0)     // Catch:{ NumberFormatException -> 0x02dc }
            return r5
        L_0x02dc:
            r4 = move-exception
            X.7oG r1 = r2.A0M
            java.lang.String r0 = "performDataProcessingAction: REQUESTED_CASE_GET_PHONE_LAST_N_DIGITS: illegal num_of_digits"
            r1.A0A(r0, r4)
        L_0x02e4:
            return r22
        L_0x02e5:
            X.5X8 r0 = r2.A03
            java.lang.String r5 = X.C1899693i.A0c(r0, r3)
            return r5
        L_0x02ec:
            r0 = 0
        L_0x02ed:
            if (r0 == 0) goto L_0x02f0
            return r6
        L_0x02f0:
            return r10
        L_0x02f1:
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.Display r0 = X.C86664Kz.A0f(r2)
            r0.getMetrics(r1)
            int r1 = r1.densityDpi
            r0 = 240(0xf0, float:3.36E-43)
            if (r1 > r0) goto L_0x0306
            java.lang.String r5 = "hdpi_or_smaller"
            return r5
        L_0x0306:
            java.lang.String r5 = "larger_than_hdpi"
            return r5
        L_0x0309:
            androidx.appcompat.widget.Toolbar r0 = X.C1899593h.A07(r2)
            if (r0 == 0) goto L_0x033c
            r0.setLogo((android.graphics.drawable.Drawable) r5)
            r0.setTitle((java.lang.CharSequence) r5)
            return r5
        L_0x0316:
            X.1VX r1 = r2.A0D
            r0 = 698(0x2ba, float:9.78E-43)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0326
            X.9TZ r0 = r2.A0K
            java.lang.String r5 = r0.A02(r3)
        L_0x0326:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x033c
            java.lang.String r5 = X.C18310x6.A0o(r3, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x033c
            java.lang.String r0 = "100"
            java.lang.String r5 = X.C18310x6.A0o(r0, r4)
        L_0x033c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Bw.Bgo(java.lang.String, java.util.Map):java.lang.String");
    }

    public void onDestroy() {
        C54522or r0 = this.A0Y;
        if (r0 != null) {
            r0.A03(this);
            this.A0Y = null;
        }
        super.onDestroy();
    }

    public C835348u A76() {
        return super.A74().B3s();
    }

    public final void A77() {
        String str;
        AbstractMap A0d = C1899593h.A0d(this);
        if (A0d != null) {
            str = C18320x8.A0e("fds_resource_id", A0d);
        } else {
            str = null;
        }
        AbstractMap A0d2 = C1899593h.A0d(this);
        if (A0d2 != null) {
            String A0e = C18320x8.A0e("fds_manager_id", A0d2);
            if (str != null && A0e != null) {
                HashMap A0t = AnonymousClass001.A0t();
                A0t.put("action", "on_back_pressed");
                A7B(str, A0e, A0t);
            }
        }
    }

    public void A79(C52792m3 r4) {
        String A0e;
        AbstractMap A0d = C1899593h.A0d(this);
        if (A0d != null && (A0e = C18320x8.A0e("fds_observer_id", A0d)) != null) {
            C54522or A022 = this.A0Z.A02(A0e);
            this.A0Y = A022;
            A022.A00(new C197869e0(r4, this), C198009eE.class, this);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 30) {
            return;
        }
        if (i2 == -1) {
            A75();
        } else {
            finish();
        }
    }

    public void onBackPressed() {
        A77();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0T = C1899593h.A0P(this);
        getWindow().setSoftInputMode(16);
    }

    public void onResume() {
        super.onResume();
        if (this.A0a) {
            A78();
            this.A0a = false;
        }
    }

    public void Bbh(int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x028d, code lost:
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0290, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0395, code lost:
        r7.A01(new X.C204889q5(r4, r7, r5, r2), r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x039d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03ee, code lost:
        r1.A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03f1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bgl(X.C52792m3 r24, java.lang.String r25, java.util.Map r26) {
        /*
            r23 = this;
            r5 = r25
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = r24
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = ""
            r1.A00(r0)
        L_0x000f:
            int r0 = r5.hashCode()
            r2 = 2
            r4 = 0
            r3 = 1
            r12 = -1
            switch(r0) {
                case -2131583866: goto L_0x012d;
                case -1828362259: goto L_0x0125;
                case -1432382994: goto L_0x011d;
                case -1371677349: goto L_0x0112;
                case -1032682289: goto L_0x0107;
                case -457979232: goto L_0x00fc;
                case -214858504: goto L_0x00f1;
                case 20864489: goto L_0x00e6;
                case 205988285: goto L_0x00da;
                case 254954716: goto L_0x00ce;
                case 391773106: goto L_0x00c2;
                case 641482247: goto L_0x00b6;
                case 711972942: goto L_0x00aa;
                case 761629426: goto L_0x009e;
                case 927713295: goto L_0x0092;
                case 928063522: goto L_0x0087;
                case 1032047561: goto L_0x007c;
                case 1369547730: goto L_0x0071;
                case 1853333482: goto L_0x0066;
                case 1877943783: goto L_0x005b;
                case 1985308587: goto L_0x0050;
                default: goto L_0x001a;
            }
        L_0x001a:
            java.lang.String r6 = "on_success"
            java.lang.String r11 = "is_merchant"
            java.lang.String r10 = "completed_step"
            java.lang.String r8 = "compliance_reason"
            java.lang.String r9 = "pin"
            java.lang.String r0 = "provider"
            java.lang.String r7 = "1"
            r13 = r23
            r5 = r26
            switch(r12) {
                case 0: goto L_0x03bd;
                case 1: goto L_0x03b9;
                case 2: goto L_0x03f2;
                case 3: goto L_0x039e;
                case 4: goto L_0x0385;
                case 5: goto L_0x0030;
                case 6: goto L_0x0370;
                case 7: goto L_0x0360;
                case 8: goto L_0x0330;
                case 9: goto L_0x02ee;
                case 10: goto L_0x03df;
                case 11: goto L_0x0291;
                case 12: goto L_0x028a;
                case 13: goto L_0x0242;
                case 14: goto L_0x01dd;
                case 15: goto L_0x01be;
                case 16: goto L_0x01b2;
                case 17: goto L_0x01a0;
                case 18: goto L_0x018a;
                case 19: goto L_0x0147;
                case 20: goto L_0x0135;
                default: goto L_0x002f;
            }
        L_0x002f:
            return
        L_0x0030:
            X.0R8 r1 = r13.getSupportActionBar()
            if (r1 == 0) goto L_0x002f
            com.whatsapp.bloks.ui.BloksDialogFragment r0 = r13.A05
            if (r0 == 0) goto L_0x002f
            java.lang.Boolean r0 = r0.A09
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "action_bar_title"
            java.lang.Object r0 = r5.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.A0J(r0)
            return
        L_0x0050:
            java.lang.String r0 = "set_bio"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 20
            goto L_0x001a
        L_0x005b:
            java.lang.String r0 = "set_navigation_icon"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 19
            goto L_0x001a
        L_0x0066:
            java.lang.String r0 = "set_sandbox"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 18
            goto L_0x001a
        L_0x0071:
            java.lang.String r0 = "create_pin"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 17
            goto L_0x001a
        L_0x007c:
            java.lang.String r0 = "get_methods"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 16
            goto L_0x001a
        L_0x0087:
            java.lang.String r0 = "sync_incentive_data"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 15
            goto L_0x001a
        L_0x0092:
            java.lang.String r0 = "forward_to_payment_screen"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 14
            goto L_0x001a
        L_0x009e:
            java.lang.String r0 = "remove_credential"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 13
            goto L_0x001a
        L_0x00aa:
            java.lang.String r0 = "fcs_navigate_back_and_finish"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 12
            goto L_0x001a
        L_0x00b6:
            java.lang.String r0 = "get_incentive_data"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 11
            goto L_0x001a
        L_0x00c2:
            java.lang.String r0 = "check_camera_permission"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 10
            goto L_0x001a
        L_0x00ce:
            java.lang.String r0 = "compliance_dob_check"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 9
            goto L_0x001a
        L_0x00da:
            java.lang.String r0 = "set_completed_step"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 8
            goto L_0x001a
        L_0x00e6:
            java.lang.String r0 = "reinitialize_payments"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 7
            goto L_0x001a
        L_0x00f1:
            java.lang.String r0 = "compliance_name_check"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 6
            goto L_0x001a
        L_0x00fc:
            java.lang.String r0 = "set_action_bar_title"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 5
            goto L_0x001a
        L_0x0107:
            java.lang.String r0 = "verify_pin"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 4
            goto L_0x001a
        L_0x0112:
            java.lang.String r0 = "remove_completed_step"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 3
            goto L_0x001a
        L_0x011d:
            java.lang.String r0 = "get_oldest_credential"
            short r12 = X.C1899693i.A0i(r0, r5)
            goto L_0x001a
        L_0x0125:
            java.lang.String r0 = "get_compliance_status"
            short r12 = X.C1899693i.A0h(r0, r5)
            goto L_0x001a
        L_0x012d:
            java.lang.String r0 = "change_pin"
            short r12 = X.C1899693i.A0g(r0, r5)
            goto L_0x001a
        L_0x0135:
            X.9VB r7 = r13.A0Q
            java.lang.String r6 = X.AnonymousClass97S.A0X(r0, r5)
            java.lang.String r5 = X.AnonymousClass97S.A0X(r9, r5)
            X.9qN r4 = new X.9qN
            r4.<init>(r1, r3, r13)
            r2 = 3
            goto L_0x0395
        L_0x0147:
            java.lang.String r0 = "navigation_icon"
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r0 = "close"
            boolean r2 = r0.equals(r1)
            java.lang.String r0 = "icon_color_filter"
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r0 = "white"
            boolean r3 = r0.equals(r1)
            X.33j r1 = r13.A00
            r0 = 2131231896(0x7f080498, float:1.8079886E38)
            if (r2 == 0) goto L_0x0169
            r0 = 2131232112(0x7f080570, float:1.8080324E38)
        L_0x0169:
            X.6dx r2 = X.AnonymousClass0x7.A0J(r13, r1, r0)
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131100243(0x7f060253, float:1.7812862E38)
            if (r3 == 0) goto L_0x0179
            r0 = 2131103185(0x7f060dd1, float:1.781883E38)
        L_0x0179:
            int r1 = r1.getColor(r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r2.setColorFilter(r1, r0)
            androidx.appcompat.widget.Toolbar r0 = X.C1899593h.A07(r13)
            r0.setNavigationIcon((android.graphics.drawable.Drawable) r2)
            return
        L_0x018a:
            java.lang.String r0 = "is_sandbox"
            java.lang.Object r0 = r5.get(r0)
            boolean r2 = r7.equals(r0)
            X.33l r0 = r13.A0A
            android.content.SharedPreferences$Editor r1 = X.C620933l.A00(r0)
            java.lang.String r0 = "payments_sandbox"
            X.C18270x1.A0l(r1, r0, r2)
            return
        L_0x01a0:
            X.9VB r7 = r13.A0Q
            java.lang.String r6 = X.AnonymousClass97S.A0X(r0, r5)
            java.lang.String r5 = X.AnonymousClass97S.A0X(r9, r5)
            r2 = 0
            X.9qN r4 = new X.9qN
            r4.<init>(r1, r2, r13)
            goto L_0x0395
        L_0x01b2:
            r0 = 4
            X.9pU r2 = new X.9pU
            r2.<init>(r1, r0, r13)
            X.9U5 r0 = r13.A0C
            r0.A08(r2)
            return
        L_0x01be:
            java.lang.String r0 = "param_force_incentive_claim_info_sync"
            java.lang.Object r0 = r5.get(r0)
            boolean r0 = r7.equals(r0)
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r2 = r13.A0T
            X.4FS r1 = r2.A07
            if (r0 == 0) goto L_0x01d7
            X.9h5 r0 = new X.9h5
            r0.<init>(r2)
        L_0x01d3:
            r1.BkM(r0)
            return
        L_0x01d7:
            X.9if r0 = new X.9if
            r0.<init>(r2, r3)
            goto L_0x01d3
        L_0x01dd:
            android.content.Context r1 = r13.getApplicationContext()
            X.9U4 r0 = r13.A0F
            X.9oC r0 = r0.A0G()
            java.lang.Class r0 = r0.BCl()
            android.content.Intent r3 = X.AnonymousClass0x9.A08(r1, r0)
            android.content.Intent r2 = r13.getIntent()
            java.lang.String r1 = "extra_conversation_message_type"
            int r0 = r2.getIntExtra(r1, r4)
            r3.putExtra(r1, r0)
            java.lang.String r0 = "extra_jid"
            X.C1899693i.A0j(r2, r3, r0)
            java.lang.String r0 = "extra_receiver_jid"
            X.C1899693i.A0j(r2, r3, r0)
            r0 = 0
            java.lang.String r5 = "extra_quoted_msg_row_id"
            long r0 = r2.getLongExtra(r5, r0)
            r3.putExtra(r5, r0)
            java.lang.String r0 = "extra_payment_preset_amount"
            X.C1899693i.A0j(r2, r3, r0)
            java.lang.String r0 = "extra_transaction_id"
            X.C1899693i.A0j(r2, r3, r0)
            java.lang.String r0 = "extra_payment_preset_min_amount"
            X.C1899693i.A0j(r2, r3, r0)
            java.lang.String r0 = "extra_request_message_key"
            X.C1899693i.A0j(r2, r3, r0)
            r0 = 1
            java.lang.String r1 = "extra_is_pay_money_only"
            boolean r0 = r2.getBooleanExtra(r1, r0)
            r3.putExtra(r1, r0)
            java.lang.String r0 = "extra_payment_note"
            X.C1899693i.A0j(r2, r3, r0)
            java.lang.String r0 = "extra_mentioned_jids"
            X.C1899693i.A0j(r2, r3, r0)
            java.lang.String r0 = "extra_inviter_jid"
            X.C1899693i.A0j(r2, r3, r0)
            r13.A6T(r3, r4)
            goto L_0x028d
        L_0x0242:
            r0 = 3
            X.9pU r6 = new X.9pU
            r6.<init>(r1, r0, r13)
            java.lang.String r0 = "remaining_cards"
            java.lang.String r0 = X.C18310x6.A0o(r0, r5)
            int r0 = X.C615531h.A01(r0, r4)
            if (r0 > r3) goto L_0x027d
            X.3Wi r14 = r13.A05
            X.4FS r7 = r13.A04
            X.9Se r5 = r13.A0U
            X.9U4 r4 = r13.A0F
            X.3Lv r15 = r13.A04
            X.33l r3 = r13.A0A
            X.9U5 r2 = r13.A0C
            X.9dq r1 = r13.A0E
            X.2Ha r0 = r13.A08
            X.9Sl r12 = new X.9Sl
            r18 = r2
            r19 = r1
            r20 = r4
            r21 = r5
            r22 = r7
            r16 = r0
            r17 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r12.A00(r6)
            return
        L_0x027d:
            X.9U5 r2 = r13.A0C
            java.lang.String r0 = "credential_id"
            java.lang.String r1 = X.C18310x6.A0o(r0, r5)
            r0 = 0
            r2.A0C(r6, r0, r1, r0)
            return
        L_0x028a:
            r13.A77()
        L_0x028d:
            r13.finish()
            return
        L_0x0291:
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r0 = r13.A0T
            X.08M r0 = r0.A01
            java.lang.Object r2 = r0.A07()
            X.9WE r2 = (X.AnonymousClass9WE) r2
            if (r2 == 0) goto L_0x02e5
            int r0 = r2.A00
            if (r0 == r3) goto L_0x02e5
            java.lang.Object r5 = r2.A01
            X.9VG r5 = (X.AnonymousClass9VG) r5
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            if (r5 == 0) goto L_0x02e1
            X.9Uu r0 = r5.A01
            if (r0 == 0) goto L_0x02bc
            X.2xk r0 = r0.A08
            long r2 = r0.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "param_incentive_offer_id"
            r4.put(r0, r2)
        L_0x02bc:
            X.9Ur r3 = r5.A02
            if (r3 == 0) goto L_0x02e1
            boolean r0 = r3.A04
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "param_incentive_claim_info_is_eligible"
            r4.put(r0, r2)
            int r0 = r3.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "param_incentive_claim_info_pending_count"
            r4.put(r0, r2)
            int r0 = r3.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "param_incentive_claim_info_redeemed_count"
            r4.put(r0, r2)
        L_0x02e1:
            r1.A02(r6, r4)
            return
        L_0x02e5:
            java.lang.String r0 = "PAY: PayBloksActivity/performAsyncRequest/get incentive data returned an error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r6 = "on_failure"
            goto L_0x03ee
        L_0x02ee:
            java.lang.String r0 = "dob"
            java.lang.String r0 = X.AnonymousClass97S.A0X(r0, r5)
            int[] r0 = X.AnonymousClass9UC.A01(r0)
            r11 = r0[r4]
            r10 = r0[r3]
            r9 = r0[r2]
            java.lang.String r7 = X.AnonymousClass97S.A0Y(r8, r5)
            java.util.AbstractMap r2 = X.C1899593h.A0d(r13)
            java.lang.String r0 = "fds_manager_id"
            java.lang.String r4 = X.C18320x8.A0e(r0, r2)
            X.9VZ r0 = r13.A09
            java.lang.String r3 = "onboarding_context"
            java.util.Stack r2 = r0.A02
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0325
            r0 = 0
        L_0x0319:
            X.9Sj r5 = r13.A0H
            r8 = 0
            X.9cW r6 = new X.9cW
            r6.<init>(r1, r13, r0, r4)
            r5.A00(r6, r7, r8, r9, r10, r11)
            return
        L_0x0325:
            java.lang.Object r0 = r2.peek()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.String r0 = X.C18320x8.A0e(r3, r0)
            goto L_0x0319
        L_0x0330:
            java.lang.String r3 = X.C18310x6.A0o(r10, r5)
            java.lang.Object r0 = r5.get(r11)
            boolean r2 = r7.equals(r0)
            java.lang.String r0 = "payment_flow"
            java.lang.String r1 = X.C18310x6.A0o(r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x034c
            if (r2 == 0) goto L_0x035d
            java.lang.String r1 = "merchant_account_linking_context"
        L_0x034c:
            X.9U4 r0 = r13.A0F
            X.9Vj r1 = r0.A0C(r1)
            X.C626936e.A06(r1)
            X.7Tb r0 = r1.A01(r3)
            r1.A08(r0)
            return
        L_0x035d:
            java.lang.String r1 = "p2p_context"
            goto L_0x034c
        L_0x0360:
            java.lang.String r0 = "remove_tos"
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r7.equals(r0)
            X.9dq r0 = r13.A0E
            r0.A01(r1, r4)
            return
        L_0x0370:
            java.lang.String r0 = "full_name"
            java.lang.String r4 = X.AnonymousClass97S.A0Y(r0, r5)
            java.lang.String r3 = X.AnonymousClass97S.A0Y(r8, r5)
            X.9Sj r2 = r13.A0H
            X.9cY r0 = new X.9cY
            r0.<init>(r1, r13)
            r2.A01(r0, r4, r3)
            return
        L_0x0385:
            X.9VB r7 = r13.A0Q
            java.lang.String r6 = X.AnonymousClass97S.A0X(r0, r5)
            java.lang.String r5 = X.AnonymousClass97S.A0X(r9, r5)
            X.9qN r4 = new X.9qN
            r4.<init>(r1, r2, r13)
            r2 = 1
        L_0x0395:
            X.9q5 r0 = new X.9q5
            r0.<init>(r4, r7, r5, r2)
            r7.A01(r0, r4, r6)
            return
        L_0x039e:
            java.lang.String r2 = X.C18310x6.A0o(r10, r5)
            java.lang.Object r0 = r5.get(r11)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x03b6
            X.99m r1 = r13.A09
        L_0x03ae:
            X.7Tb r0 = r1.A01(r2)
            r1.A07(r0)
            return
        L_0x03b6:
            X.99l r1 = r13.A07
            goto L_0x03ae
        L_0x03b9:
            r13.A7A(r1)
            return
        L_0x03bd:
            X.9VB r6 = r13.A0Q
            java.lang.String r2 = X.AnonymousClass97S.A0X(r0, r5)
            java.lang.String r0 = "old_pin"
            java.lang.String r7 = X.AnonymousClass97S.A0X(r0, r5)
            java.lang.String r0 = "new_pin"
            java.lang.String r8 = X.AnonymousClass97S.A0X(r0, r5)
            r0 = 3
            X.9qN r5 = new X.9qN
            r5.<init>(r1, r0, r13)
            r9 = 0
            X.9q1 r4 = new X.9q1
            r4.<init>(r5, r6, r7, r8, r9)
            r6.A01(r4, r5, r2)
            return
        L_0x03df:
            X.1VX r3 = r13.A0D
            X.5ZR r0 = r13.A03
            r2 = 30
            android.content.Intent r0 = com.whatsapp.RequestPermissionActivity.A0L(r13, r0, r3, r2)
            if (r0 == 0) goto L_0x03ee
            r13.startActivityForResult(r0, r2)
        L_0x03ee:
            r1.A00(r6)
            return
        L_0x03f2:
            X.4FS r3 = r13.A04
            X.9U4 r2 = r13.A0F
            X.9GV r0 = new X.9GV
            r0.<init>(r1, r2)
            X.AnonymousClass0x7.A1B(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Bw.Bgl(X.2m3, java.lang.String, java.util.Map):void");
    }
}
