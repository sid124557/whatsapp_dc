package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass28X;
import X.AnonymousClass2YZ;
import X.AnonymousClass31C;
import X.AnonymousClass33S;
import X.AnonymousClass36P;
import X.AnonymousClass4SG;
import X.AnonymousClass5SZ;
import X.AnonymousClass5V0;
import X.AnonymousClass64S;
import X.AnonymousClass7UQ;
import X.AnonymousClass8EA;
import X.AnonymousClass8nX;
import X.AnonymousClass97S;
import X.AnonymousClass99I;
import X.AnonymousClass99P;
import X.AnonymousClass9Bw;
import X.AnonymousClass9NI;
import X.AnonymousClass9RH;
import X.AnonymousClass9SD;
import X.AnonymousClass9TD;
import X.AnonymousClass9TJ;
import X.AnonymousClass9TR;
import X.AnonymousClass9U5;
import X.AnonymousClass9VB;
import X.AnonymousClass9VP;
import X.AnonymousClass9VU;
import X.AnonymousClass9W1;
import X.AnonymousClass9W3;
import X.AnonymousClass9cL;
import X.C102085Hk;
import X.C105635Vu;
import X.C107695bk;
import X.C133736hr;
import X.C133786hw;
import X.C166587yw;
import X.C18280x3;
import X.C18310x6;
import X.C18320x8;
import X.C1899593h;
import X.C1899693i;
import X.C1906799k;
import X.C1906899l;
import X.C1906999m;
import X.C1907099n;
import X.C191169De;
import X.C192709Lg;
import X.C193119Nf;
import X.C19340zH;
import X.C193719Ps;
import X.C193949Qw;
import X.C193979Rc;
import X.C194019Rg;
import X.C194029Rh;
import X.C194089Rn;
import X.C194139Rs;
import X.C194149Rt;
import X.C194159Ru;
import X.C194179Rw;
import X.C194219Sa;
import X.C194259Se;
import X.C194399Ss;
import X.C194529Tg;
import X.C194649Ty;
import X.C194929Vc;
import X.C195089Vv;
import X.C195169Wk;
import X.C196159aO;
import X.C196709bc;
import X.C196979cG;
import X.C198179eV;
import X.C204009of;
import X.C204019og;
import X.C204049oj;
import X.C204119oq;
import X.C204219p0;
import X.C204879q4;
import X.C40602Ha;
import X.C44122Ut;
import X.C44232Ve;
import X.C47382dA;
import X.C52792m3;
import X.C617332a;
import X.C626936e;
import X.C633138t;
import X.C64333Db;
import X.C67993Rl;
import X.C69263Wi;
import X.C84704Dj;
import X.C86604Kt;
import X.C86614Ku;
import X.C88834as;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.json.JSONArray;

public class BrazilPayBloksActivity extends AnonymousClass9Bw implements C84704Dj {
    public C193979Rc A00;
    public C52792m3 A01;
    public C44232Ve A02;
    public C617332a A03;
    public C166587yw A04;
    public AnonymousClass8EA A05;
    public AnonymousClass31C A06;
    public C195089Vv A07;
    public C1906799k A08;
    public C196709bc A09;
    public C194929Vc A0A;
    public C1907099n A0B;
    public C194019Rg A0C;
    public C194179Rw A0D;
    public AnonymousClass9NI A0E;
    public AnonymousClass9SD A0F;
    public C102085Hk A0G;
    public AnonymousClass2YZ A0H;
    public C194529Tg A0I;
    public AnonymousClass9TJ A0J;
    public C191169De A0K;
    public C194649Ty A0L;
    public C194399Ss A0M;
    public AnonymousClass9W1 A0N;
    public C194219Sa A0O;
    public String A0P;
    public boolean A0Q;

    public static int A0d(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!((C198179eV) list.get(i)).A0C) {
                return i;
            }
        }
        return -1;
    }

    public final void A7E(C52792m3 r10, String str) {
        C69263Wi r3 = this.A05;
        new C194159Ru(this, this.A03, r3, this.A03, this.A06, this.A08, new C204049oj(r10, 0, this), str).A00();
    }

    public static void A0e(C198179eV r3, Map map) {
        String str;
        String str2;
        map.put("card_verify_identifier", r3.A03);
        String str3 = r3.A0B;
        map.put("card_verify_type", str3);
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -1302107194:
                    if (!str3.equals("customer-service")) {
                        return;
                    }
                    break;
                case -119226117:
                    if (str3.equals("app-to-app")) {
                        map.put("app_to_app_partner_app_name", r3.A06);
                        map.put("app_to_app_partner_app_package", r3.A07);
                        map.put("app_to_app_partner_intent_action", r3.A08);
                        map.put("app_to_app_request_payload", r3.A09);
                        break;
                    } else {
                        return;
                    }
                case 110379:
                    if (str3.equals("otp")) {
                        map.put("card_verify_otp_type", r3.A05);
                        map.put("card_verify_otp_resend_interval_sec", String.valueOf(r3.A01));
                        map.put("card_verify_otp_receiver_info", r3.A04);
                        int i = r3.A00;
                        map.put("otp_length", String.valueOf(i));
                        map.put("remaining_validates", String.valueOf(1));
                        StringBuilder A0o = AnonymousClass001.A0o();
                        for (int i2 = 0; i2 < i; i2++) {
                            A0o.append("#  ");
                        }
                        str = A0o.toString().trim();
                        str2 = "otp_mask";
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            str2 = "support_phone_number";
            str = r3.A0A;
            map.put(str2, str);
        }
    }

    public void A5r() {
        if (!this.A0Q) {
            this.A0Q = true;
            C88834as A0I2 = C18280x3.A0I(this);
            C64333Db r3 = A0I2.A4Z;
            C1899593h.A15(r3, this);
            C107695bk r1 = r3.A00;
            C1899593h.A0z(r3, r1, this, C1899593h.A0W(r3, r1, this));
            this.A07 = C86604Kt.A0Z(r3);
            this.A01 = (C193949Qw) r3.A2y.get();
            this.A02 = (AnonymousClass9VP) r1.A62.get();
            this.A06 = r3.Ahl();
            this.A00 = (C44122Ut) A0I2.A4Q.get();
            this.A04 = A0I2.ABX();
            this.A08 = A0I2.ADP();
            this.A05 = (AnonymousClass33S) r3.AUY.get();
            this.A0Z = C1899693i.A0V(r3);
            this.A0G = (C194089Rn) r1.A98.get();
            this.A0V = (C193119Nf) r3.AYx.get();
            this.A0X = C86604Kt.A0e(r3);
            this.A0F = C1899593h.A0I(r3);
            this.A0U = C1899593h.A0Q(r3);
            this.A04 = C64333Db.A3D(r3);
            this.A0Q = (AnonymousClass9VB) r1.A8j.get();
            this.A00 = (AnonymousClass99P) r1.A10.get();
            this.A01 = (AnonymousClass8nX) r1.A11.get();
            this.A0O = C1899593h.A0N(r3);
            this.A0L = (AnonymousClass9TD) r3.APi.get();
            this.A0I = (AnonymousClass9RH) r1.A8s.get();
            this.A0A = C1899593h.A0E(r3);
            this.A0W = (AnonymousClass28X) r3.AcF.get();
            this.A07 = (C1906899l) r3.APJ.get();
            this.A03 = C86614Ku.A0V(r3);
            this.A0S = new C192709Lg();
            this.A0C = C1899593h.A0F(r3);
            this.A0R = (AnonymousClass9TR) r1.A8k.get();
            this.A02 = (AnonymousClass36P) r1.AC2.get();
            this.A0N = (C194029Rh) r3.ANN.get();
            this.A0D = C1899593h.A0G(r3);
            this.A0K = C1899693i.A0P(r3);
            this.A0E = C1899693i.A0O(r3);
            this.A0H = C1899593h.A0J(r1);
            this.A08 = (C40602Ha) C1899693i.A0Y(r3);
            this.A0P = (AnonymousClass9W3) r1.A8g.get();
            this.A0J = (AnonymousClass9VU) r3.AQH.get();
            this.A09 = (C1906999m) r3.APr.get();
            this.A0B = (AnonymousClass5SZ) r3.AQ4.get();
            this.A05 = (AnonymousClass8EA) r3.ASG.get();
            this.A06 = C64333Db.A5u(r3);
            this.A02 = (C44232Ve) r3.A2m.get();
            this.A07 = (C195089Vv) r1.A16.get();
            this.A0K = (C191169De) r1.A1C.get();
            this.A00 = (C193979Rc) r3.A2i.get();
            this.A0H = (AnonymousClass2YZ) r1.A8x.get();
            this.A0F = (AnonymousClass9SD) r1.A1E.get();
            this.A0J = (AnonymousClass9TJ) r1.A17.get();
            this.A0B = C1899593h.A0H(r3);
            this.A0C = (C194019Rg) r1.A7l.get();
            this.A03 = C1899593h.A09(r3);
            this.A0O = (C194219Sa) r1.A18.get();
            this.A0A = (C194929Vc) r3.A3V.get();
            this.A09 = A0I2.ACj();
            this.A0I = (C194529Tg) r3.AKK.get();
            this.A0E = (AnonymousClass9NI) r1.A1D.get();
            this.A0N = (AnonymousClass9W1) r1.A15.get();
            this.A0L = (C194649Ty) r1.A1I.get();
            this.A0M = A0I2.ACt();
            this.A0D = (C194179Rw) r1.A8r.get();
            this.A08 = (C1906799k) r1.A1A.get();
            this.A0G = (C102085Hk) r1.A1F.get();
        }
    }

    public AnonymousClass64S A74() {
        return new C196159aO(this);
    }

    public final void A7F(C52792m3 r16, String str, List list, List list2, int i) {
        List list3 = list;
        C52792m3 r3 = r16;
        int i2 = i;
        if (i2 >= list3.size()) {
            r3.A00("on_failure");
            return;
        }
        C194179Rw r11 = this.A0D;
        File file = (File) list3.get(i2);
        C633138t r13 = C633138t.A0Y;
        C193719Ps r2 = new C193719Ps(r3, this, str, list2, list3, i2);
        Context context = r11.A01;
        C69263Wi r5 = r11.A02;
        AnonymousClass9U5 r7 = r11.A05;
        C40602Ha r6 = r11.A04;
        AnonymousClass9VU r8 = r11.A06;
        C194149Rt r32 = new C194149Rt(context, r5, r6, r7, r8, "DOC-UPLOAD");
        C67993Rl A012 = r8.A01("FB", "DOC-UPLOAD");
        if (A012 != null) {
            r11.A00(A012, r2, r13, file);
        } else {
            r32.A00(new C204879q4(file, r11, r2, r13, 1), "FB");
        }
    }

    public final void A7G(C52792m3 r26, Map map, int i) {
        String str;
        String A0e;
        String str2;
        Map map2 = map;
        String A0X = AnonymousClass97S.A0X("full_name", map2);
        String replaceAll = AnonymousClass97S.A0Y("tax_id", map2).replaceAll("[^\\d]", "");
        PhoneUserJid A2m = AnonymousClass4SG.A2m(this);
        if (A2m == null) {
            str = null;
        } else {
            str = A2m.user;
        }
        C626936e.A06(str);
        String replaceAll2 = AnonymousClass36P.A08(str).replaceAll("[^\\d]", "");
        String replaceAll3 = AnonymousClass97S.A0X("address_postal_code", map2).replaceAll("[^\\d]", "");
        String A0o = C18310x6.A0o("address_street_name", map2);
        String A0o2 = C18310x6.A0o("address_city", map2);
        String A0o3 = C18310x6.A0o("address_state", map2);
        String A0o4 = C18310x6.A0o("address_houe_number", map2);
        String A0o5 = C18310x6.A0o("address_extra_line", map2);
        String A0o6 = C18310x6.A0o("address_neighborhood", map2);
        String A0e2 = C18320x8.A0e("fds_manager_id", C1899593h.A0d(this));
        Stack stack = this.A09.A02;
        if (stack.isEmpty()) {
            A0e = null;
        } else {
            A0e = C18320x8.A0e("onboarding_context", (AbstractMap) stack.peek());
        }
        if (!this.A0D.A0X(2928) || !"p2m_context".equals(A0e)) {
            str2 = null;
        } else {
            str2 = "SAVE_KYC_DATA";
        }
        C69263Wi r7 = this.A05;
        C194259Se r11 = this.A0U;
        C194139Rs r5 = new C194139Rs(this, r7, this.A08, this.A0C, this.A0J, r11, A0X, replaceAll, replaceAll2, A0o, A0o4, A0o5, A0o6, A0o2, A0o3, replaceAll3);
        C196979cG r18 = new C196979cG(r26, this, A0e, A0e2, map2, i);
        AnonymousClass9VU r112 = r5.A05;
        C67993Rl A012 = r112.A01("FB", "KYC");
        if (A012 == null || !A012.A05.equalsIgnoreCase("FB")) {
            new C194149Rt(r5.A01, r5.A02, r5.A03, r5.A04, r112, "KYC").A00(new AnonymousClass9cL(r5, r18, str2), "FB");
            return;
        }
        r5.A00(r18, A012, str2);
    }

    public C47382dA BEP() {
        return C1899693i.A09(this, getSupportFragmentManager(), this.A00, this.A08);
    }

    public boolean BEy(int i) {
        if (i != 442) {
            return super.BEy(i);
        }
        BrazilReTosFragment brazilReTosFragment = new BrazilReTosFragment();
        brazilReTosFragment.A1a();
        Boo(brazilReTosFragment);
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0279, code lost:
        return "1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x027a, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String Bgo(java.lang.String r9, java.util.Map r10) {
        /*
            r8 = this;
            java.lang.String r3 = "case"
            java.lang.Object r2 = r10.remove(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x027b
            int r0 = r2.hashCode()
            r7 = -1
            switch(r0) {
                case -1618032200: goto L_0x01b8;
                case -1539179277: goto L_0x01b0;
                case -1333887770: goto L_0x01a8;
                case -1067148390: goto L_0x019d;
                case -450144912: goto L_0x0192;
                case 96330030: goto L_0x0187;
                case 493597816: goto L_0x017c;
                case 595125212: goto L_0x0171;
                case 1867705314: goto L_0x0165;
                case 2027790727: goto L_0x0159;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r5 = "1"
            java.lang.String r4 = "0"
            r6 = 0
            switch(r7) {
                case 0: goto L_0x01d7;
                case 1: goto L_0x0226;
                case 2: goto L_0x01d2;
                case 3: goto L_0x01ca;
                case 4: goto L_0x01c0;
                case 5: goto L_0x0028;
                case 6: goto L_0x0268;
                case 7: goto L_0x023e;
                case 8: goto L_0x0237;
                case 9: goto L_0x011b;
                default: goto L_0x0020;
            }
        L_0x0020:
            r10.put(r3, r2)
            java.lang.String r6 = super.Bgo(r9, r10)
        L_0x0027:
            return r6
        L_0x0028:
            X.9NI r0 = r8.A0E
            java.util.Map r0 = r0.A00
            r0.putAll(r10)
            java.util.Iterator r5 = X.AnonymousClass000.A0q(r10)
        L_0x0033:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0027
            java.util.Map$Entry r4 = X.AnonymousClass001.A0w(r5)
            java.lang.String r2 = X.C18310x6.A0q(r4)
            int r0 = r2.hashCode()
            r3 = -1
            switch(r0) {
                case -1823090409: goto L_0x006a;
                case -1787697648: goto L_0x0071;
                case -1422091778: goto L_0x0078;
                case -1057402635: goto L_0x007f;
                case -554367363: goto L_0x0089;
                case -97971314: goto L_0x0093;
                case -13138338: goto L_0x009d;
                case 17961485: goto L_0x00a7;
                case 17962411: goto L_0x00b1;
                case 82874128: goto L_0x00bc;
                case 180337583: goto L_0x00c7;
                case 552892207: goto L_0x00d3;
                case 629885866: goto L_0x00df;
                case 672839619: goto L_0x00eb;
                case 1287484568: goto L_0x00f7;
                case 1595342407: goto L_0x0103;
                case 2069092435: goto L_0x010f;
                default: goto L_0x0049;
            }
        L_0x0049:
            java.lang.String r2 = "[^\\d]"
            switch(r3) {
                case 0: goto L_0x004f;
                case 1: goto L_0x0059;
                case 2: goto L_0x0059;
                case 3: goto L_0x0059;
                case 4: goto L_0x0059;
                case 5: goto L_0x004f;
                case 6: goto L_0x0059;
                case 7: goto L_0x004f;
                case 8: goto L_0x005d;
                case 9: goto L_0x0059;
                case 10: goto L_0x0059;
                case 11: goto L_0x0059;
                case 12: goto L_0x0059;
                case 13: goto L_0x0059;
                case 14: goto L_0x0059;
                case 15: goto L_0x0059;
                case 16: goto L_0x0059;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x0033
        L_0x004f:
            java.lang.Object r0 = r4.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r0.replaceAll(r2, r1)
            goto L_0x0033
        L_0x0059:
            r4.getValue()
            goto L_0x0033
        L_0x005d:
            java.lang.Object r0 = r4.getValue()
            java.lang.String r0 = (java.lang.String) r0
            X.C626936e.A05(r0)
            X.AnonymousClass9UC.A01(r0)
            goto L_0x0033
        L_0x006a:
            java.lang.String r0 = "business_address_postcode"
            short r3 = X.C1899693i.A0g(r0, r2)
            goto L_0x0049
        L_0x0071:
            java.lang.String r0 = "bank_code"
            short r3 = X.C1899693i.A0h(r0, r2)
            goto L_0x0049
        L_0x0078:
            java.lang.String r0 = "bank_account_number"
            short r3 = X.C1899693i.A0i(r0, r2)
            goto L_0x0049
        L_0x007f:
            java.lang.String r0 = "business_address_city"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 3
            goto L_0x0049
        L_0x0089:
            java.lang.String r0 = "business_address_street_name"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 4
            goto L_0x0049
        L_0x0093:
            java.lang.String r0 = "business_tax_id"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 5
            goto L_0x0049
        L_0x009d:
            java.lang.String r0 = "business_address_street_extra"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 6
            goto L_0x0049
        L_0x00a7:
            java.lang.String r0 = "owner_cpf"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 7
            goto L_0x0049
        L_0x00b1:
            java.lang.String r0 = "owner_dob"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 8
            goto L_0x0049
        L_0x00bc:
            java.lang.String r0 = "owner_email"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 9
            goto L_0x0049
        L_0x00c7:
            java.lang.String r0 = "owner_full_name"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 10
            goto L_0x0049
        L_0x00d3:
            java.lang.String r0 = "bank_account_type"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 11
            goto L_0x0049
        L_0x00df:
            java.lang.String r0 = "business_name"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 12
            goto L_0x0049
        L_0x00eb:
            java.lang.String r0 = "bank_branch_number"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 13
            goto L_0x0049
        L_0x00f7:
            java.lang.String r0 = "business_address_neighborhood"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 14
            goto L_0x0049
        L_0x0103:
            java.lang.String r0 = "business_address_state"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 15
            goto L_0x0049
        L_0x010f:
            java.lang.String r0 = "business_address_number"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 16
            goto L_0x0049
        L_0x011b:
            java.lang.String r0 = "credential_id"
            java.lang.String r2 = X.C18310x6.A0o(r0, r10)
            java.lang.String r0 = "payment_method_field_name"
            java.lang.String r3 = X.C18310x6.A0o(r0, r10)
            X.7yw r1 = r8.A04
            if (r1 == 0) goto L_0x0133
            java.lang.String r0 = r1.A0A
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x013b
        L_0x0133:
            X.8EA r0 = r8.A05
            X.7yw r1 = r0.A08(r2)
            r8.A04 = r1
        L_0x013b:
            X.6hx r2 = r1.A08
            X.6hw r2 = (X.C133786hw) r2
            java.lang.String r0 = "p2p_receive"
            boolean r0 = r3.equals(r0)
            java.lang.String r1 = "DISABLED"
            if (r0 != 0) goto L_0x0156
            java.lang.String r0 = "p2p_send"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.A0N
        L_0x0153:
            if (r0 == 0) goto L_0x027a
            return r0
        L_0x0156:
            java.lang.String r0 = r2.A0M
            goto L_0x0153
        L_0x0159:
            java.lang.String r0 = "get_card_method_field_data"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 9
            goto L_0x0018
        L_0x0165:
            java.lang.String r0 = "is_smb_build"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 8
            goto L_0x0018
        L_0x0171:
            java.lang.String r0 = "is_p2p_eligible_card_available"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 7
            goto L_0x0018
        L_0x017c:
            java.lang.String r0 = "is_purchase_enabled"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 6
            goto L_0x0018
        L_0x0187:
            java.lang.String r0 = "store_merchant_reg_data"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 5
            goto L_0x0018
        L_0x0192:
            java.lang.String r0 = "open_fb_pay_hub"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 4
            goto L_0x0018
        L_0x019d:
            java.lang.String r0 = "clear_merchant_reg_data"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 3
            goto L_0x0018
        L_0x01a8:
            java.lang.String r0 = "get_formatted_phone_number"
            short r7 = X.C1899693i.A0i(r0, r2)
            goto L_0x0018
        L_0x01b0:
            java.lang.String r0 = "smb_business_name"
            short r7 = X.C1899693i.A0h(r0, r2)
            goto L_0x0018
        L_0x01b8:
            java.lang.String r0 = "get_consumer_next_screen"
            short r7 = X.C1899693i.A0g(r0, r2)
            goto L_0x0018
        L_0x01c0:
            java.lang.Class<com.whatsapp.payments.ui.BrazilFbPayHubActivity> r0 = com.whatsapp.payments.ui.BrazilFbPayHubActivity.class
            android.content.Intent r0 = X.AnonymousClass0x9.A08(r8, r0)
            r8.startActivity(r0)
            return r6
        L_0x01ca:
            X.9NI r0 = r8.A0E
            java.util.Map r0 = r0.A00
            r0.clear()
            return r6
        L_0x01d2:
            java.lang.String r6 = X.C192789Lo.A00(r9)
            return r6
        L_0x01d7:
            java.lang.String r0 = "payment_flow"
            java.lang.String r4 = X.C18310x6.A0o(r0, r10)
            X.9Ty r3 = r8.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x01e7
            java.lang.String r4 = "p2p_context"
        L_0x01e7:
            r2 = 0
            java.lang.String r0 = "merchant_account_linking_context"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0221
            java.lang.String r2 = r3.A02()
        L_0x01f4:
            if (r2 == 0) goto L_0x027a
            int r0 = r2.hashCode()
            switch(r0) {
                case -1412891550: goto L_0x0200;
                case 823631114: goto L_0x020b;
                case 1027588136: goto L_0x0216;
                default: goto L_0x01fd;
            }
        L_0x01fd:
            java.lang.String r6 = "p_add_card"
            return r6
        L_0x0200:
            java.lang.String r0 = "brpay_p_tos"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01fd
            java.lang.String r6 = "p_tos"
            return r6
        L_0x020b:
            java.lang.String r0 = "brpay_p_pin_nux_create"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01fd
            java.lang.String r6 = "p_pin_nux_create"
            return r6
        L_0x0216:
            java.lang.String r0 = "brpay_p_compliance_kyc_next_screen_router"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01fd
            java.lang.String r6 = "p_compliance_kyc"
            return r6
        L_0x0221:
            java.lang.String r2 = r3.A03(r4, r2)
            goto L_0x01f4
        L_0x0226:
            X.99n r0 = r8.A0B
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x027b
            X.2sr r0 = r8.A01
            X.2og r0 = r0.A0D
            java.lang.String r1 = r0.A03()
            return r1
        L_0x0237:
            X.99n r0 = r8.A0B
            boolean r0 = r0.A00()
            goto L_0x0276
        L_0x023e:
            X.8EA r0 = r8.A05
            java.util.List r0 = r0.A0B()
            java.util.Iterator r2 = r0.iterator()
        L_0x0248:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0267
            X.7yw r1 = X.C1899693i.A0C(r2)
            boolean r0 = X.C195169Wk.A08(r1)
            if (r0 == 0) goto L_0x0248
            X.6hx r1 = r1.A08
            if (r1 == 0) goto L_0x0248
            boolean r0 = r1 instanceof X.C133786hw
            if (r0 == 0) goto L_0x0248
            X.6hw r1 = (X.C133786hw) r1
            boolean r0 = r1.A0X
            if (r0 == 0) goto L_0x0248
            return r5
        L_0x0267:
            return r4
        L_0x0268:
            X.99n r0 = r8.A0B
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0279
            X.99n r0 = r8.A0B
            boolean r0 = r0.A0C()
        L_0x0276:
            if (r0 != 0) goto L_0x0279
            return r4
        L_0x0279:
            return r5
        L_0x027a:
            return r1
        L_0x027b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPayBloksActivity.Bgo(java.lang.String, java.util.Map):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00db, code lost:
        X.AnonymousClass9Bw.A0c(r14.A01, (java.util.Map) null, -232);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r32, int r33, android.content.Intent r34) {
        /*
            r31 = this;
            r14 = r31
            r1 = r32
            r2 = r33
            r5 = r34
            super.onActivityResult(r1, r2, r5)
            r0 = 100
            if (r1 != r0) goto L_0x0036
            X.2m3 r1 = r14.A01
            if (r1 == 0) goto L_0x0036
            r4 = -232(0xffffffffffffff18, float:NaN)
            r0 = -1
            r3 = 0
            if (r2 != r0) goto L_0x00f2
            java.lang.String r2 = "on_success"
            if (r34 == 0) goto L_0x00ee
            android.os.Bundle r1 = r5.getExtras()
            java.lang.String r0 = "STEP_UP_RESPONSE"
            java.lang.String r0 = r1.getString(r0, r3)
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "issuerMobileAppAuthResponse"
            java.lang.String r0 = r1.getString(r0, r3)
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "PAY: BrazilPayBloksActivity onActivityResult - response is NULL"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0036:
            return
        L_0x0037:
            java.lang.String r1 = X.AnonymousClass0x9.A0z(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1086574198: goto L_0x00d2;
                case 568196142: goto L_0x00c9;
                case 1185244855: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            return
        L_0x0043:
            java.lang.String r0 = "approved"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0036
            java.lang.String r1 = "STEP_UP_AUTH_CODE"
            boolean r0 = r5.hasExtra(r1)
            if (r0 != 0) goto L_0x0055
            java.lang.String r1 = "TAV"
        L_0x0055:
            java.lang.String r13 = r5.getStringExtra(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r29 = X.C1899693i.A0b(r14)
            X.2sH r0 = r14.A06
            r16 = r0
            X.3Wi r15 = r14.A05
            X.2sr r12 = r14.A01
            X.8EA r11 = r14.A05
            X.31C r10 = r14.A06
            X.9U4 r9 = r14.A0F
            X.9SD r8 = r14.A0F
            X.9U5 r7 = r14.A0C
            X.32a r6 = r14.A03
            X.9Vc r5 = r14.A0A
            X.2Ha r4 = r14.A08
            X.9VU r3 = r14.A0J
            java.lang.String r2 = r14.A0P
            X.9R5 r1 = new X.9R5
            r1.<init>(r14, r13)
            X.9A4 r0 = new X.9A4
            r25 = r3
            r26 = r8
            r27 = r1
            r28 = r13
            r30 = r2
            r24 = r9
            r23 = r7
            r22 = r4
            r21 = r5
            r20 = r10
            r19 = r11
            r18 = r6
            r17 = r16
            r16 = r12
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.String r2 = r0.A06
            X.8EA r1 = r0.A04
            X.7yw r1 = r1.A08(r2)
            if (r1 == 0) goto L_0x00e1
            X.6hx r1 = r1.A08
            X.99I r1 = (X.AnonymousClass99I) r1
            if (r1 == 0) goto L_0x00e1
            java.lang.String r2 = "VISA"
            java.lang.String r1 = r1.A03
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00e1
            java.lang.String r1 = "PAY: BrazilVerifyCardSendAuthCodeAction sendRequestCardVerification with encrypted value"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r0.A00()
            return
        L_0x00c9:
            java.lang.String r0 = "declined"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00db
            return
        L_0x00d2:
            java.lang.String r0 = "failure"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00db
            return
        L_0x00db:
            X.2m3 r0 = r14.A01
            X.AnonymousClass9Bw.A0c(r0, r3, r4)
            return
        L_0x00e1:
            java.lang.String r1 = "PAY: BrazilVerifyCardSendAuthCodeAction sendRequestCardVerification without encrypted value"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r1 = r0.A05
            r0.A03(r1)
            return
        L_0x00ec:
            X.2m3 r1 = r14.A01
        L_0x00ee:
            r1.A00(r2)
            return
        L_0x00f2:
            X.AnonymousClass9Bw.A0c(r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPayBloksActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public BrazilPayBloksActivity(int i) {
        this.A0Q = false;
        C204019og.A00(this, 24);
    }

    public final void A7C(C52792m3 r5) {
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0h(getString(R.string.f11nameremoved));
        C19340zH.A01(this, A002, R.string.f11nameremoved);
        String string = getString(R.string.f11nameremoved);
        A002.A00.A0I(new C204219p0(r5, 7), string);
        A002.A0S();
    }

    public final void A7D(C52792m3 r10, C133736hr r11, String str, List list, boolean z) {
        C198179eV r2;
        HashMap A0t = AnonymousClass001.A0t();
        AnonymousClass99I r8 = (AnonymousClass99I) r11.A08;
        A7H(r11, str, A0t);
        if (z) {
            A0t.put("verified_state", "1");
        } else {
            if (list == null || list.isEmpty()) {
                if (r8 != null && r8.A08) {
                    A0t.put("verified_state", "0");
                    A0t.put("card_need_device_binding", "1");
                }
            } else if (!C195089Vv.A01(list)) {
                int A022 = C1899593h.A02(this, list);
                JSONArray A023 = this.A07.A02(list);
                if (A023 != null) {
                    int A0d = A0d(list);
                    if (!(!this.A0D.A0X(A022) || A0d == -1 || (r2 = (C198179eV) list.get(A0d)) == null)) {
                        A0t.put("default_selected_position", String.valueOf(A0d));
                        A0e(r2, A0t);
                    }
                    A0t.put("verify_methods", A023.toString());
                }
                A0t.put("verified_state", "0");
            }
            AnonymousClass9Bw.A0c(r10, (Map) null, -233);
            return;
        }
        r10.A01("on_success", A0t);
    }

    public final void A7H(C133736hr r5, String str, Map map) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            map.put("callback_url", str);
        }
        map.put("credential_id", r5.A0A);
        int i = r5.A00;
        boolean z = true;
        map.put("is_combo_card", String.valueOf(AnonymousClass000.A1U(i, 6)));
        if (i != 4) {
            z = false;
        }
        map.put("is_credit_card", String.valueOf(z));
        map.put("readable_name", C195169Wk.A02(this, r5));
        C133786hw r2 = (C133786hw) r5.A08;
        if (r2 != null && ((str2 = r2.A0N) == null || !(!"DISABLED".equals(str2)))) {
            map.put("p2p_ineligible", "1");
        }
        map.put("network_name", C133736hr.A02(r5.A01));
        if (r2 != null && !TextUtils.isEmpty(r2.A0E)) {
            map.put("card_image_url", r2.A0E);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(R.id.bloks_background_layout).setBackgroundResource(R.drawable.round_rectangle);
        if (getIntent().getIntExtra("extra_setup_mode", 0) != 0) {
            getIntent().putExtra("screen_name", this.A0L.A03("p2p_context", false));
        }
        String stringExtra = getIntent().getStringExtra("screen_name");
        C626936e.A05(stringExtra);
        if ("brpay_p_tos".equalsIgnoreCase(stringExtra) || "brpay_p_compliance_kyc_next_screen_router".equalsIgnoreCase(stringExtra)) {
            C105635Vu r7 = this.A0G.A00;
            Intent intent = getIntent();
            if (intent == null || !intent.hasExtra("perf_origin")) {
                r7.A01.A0F("unknown", -1);
            } else {
                long longExtra = intent.getLongExtra("perf_start_time_ns", -1);
                String stringExtra2 = intent.getStringExtra("perf_origin");
                if (stringExtra2 != null) {
                    r7.A01.A0F(stringExtra2, longExtra);
                }
            }
        }
        this.A00.A00 = this.A0K.A00();
        Log.d("Bloks: BloksPayloadUtil: shouldConnectIgServer = false");
        if (!this.A00.A0G() || !this.A00.A0H()) {
            View findViewById = findViewById(R.id.bloks_progress_bar);
            findViewById.setVisibility(0);
            this.A00.A0F(new C204009of(findViewById, 1, this), "on_demand", false);
        } else {
            this.A0a = true;
        }
        Toolbar A072 = C1899593h.A07(this);
        if (A072 != null) {
            A072.setLogo((Drawable) null);
            A072.setTitle((CharSequence) null);
        }
        this.A0B.A02(new C204119oq(this, 0));
    }

    public Dialog onCreateDialog(int i) {
        if (i == R.string.f11nameremoved) {
            C19340zH A002 = AnonymousClass5V0.A00(this);
            A002.A0U(R.string.f11nameremoved);
            A002.A0T(R.string.f11nameremoved);
            C204219p0.A01(A002, this, 6, R.string.f11nameremoved);
            A002.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
            return A002.create();
        }
        Dialog A003 = this.A0M.A00((Bundle) null, this, i);
        if (A003 == null) {
            return super.onCreateDialog(i);
        }
        return A003;
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass9SD r1 = this.A0F;
        r1.A00 = null;
        r1.A03 = false;
        r1.A02 = false;
    }

    public AnonymousClass7UQ B4k() {
        return this.A06;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: X.9Q7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: X.9Q4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v28, resolved type: X.9Q7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: X.9Q7} */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r10v29, types: [X.9A1] */
    /* JADX WARNING: type inference failed for: r10v30, types: [X.9A0] */
    /* JADX WARNING: type inference failed for: r10v31, types: [X.99z] */
    /* JADX WARNING: type inference failed for: r8v59, types: [X.9A3] */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04b6, code lost:
        X.C621433s.A01(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04d4, code lost:
        if (r5.equals(r4) == false) goto L_0x04d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0771, code lost:
        r14 = X.C625635p.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0773, code lost:
        r0.A0G(r4, r12, r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0778, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x098f, code lost:
        r3.A03(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0992, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0c26, code lost:
        r0 = new java.lang.Void[0];
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0c29, code lost:
        r9.BkL(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0c2c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0270, code lost:
        r8.A0D(new X.C203899oU(r10, r11, r2, r12, r1, r15), r16, r0, r18, X.C625635p.A0L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0281, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x04e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bgl(X.C52792m3 r36, java.lang.String r37, java.util.Map r38) {
        /*
            r35 = this;
            r5 = r37
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r4 = ""
            r2 = r36
            if (r0 == 0) goto L_0x000f
            r2.A00(r4)
        L_0x000f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Requested case:"
            X.C18260x0.A0q(r0, r5, r1)
            int r0 = r5.hashCode()
            r3 = 1
            r8 = -1
            switch(r0) {
                case -1828362259: goto L_0x02ea;
                case -1789788977: goto L_0x02f2;
                case -1579572125: goto L_0x02fa;
                case -1326006358: goto L_0x0302;
                case -1290918873: goto L_0x030d;
                case -1265267765: goto L_0x0318;
                case -1264881022: goto L_0x0323;
                case -1236338706: goto L_0x032e;
                case -1157449815: goto L_0x0339;
                case -1017011091: goto L_0x0345;
                case -981053487: goto L_0x0351;
                case -857462632: goto L_0x035d;
                case -803962306: goto L_0x0369;
                case -641808715: goto L_0x0375;
                case -553110595: goto L_0x0381;
                case -524241064: goto L_0x038d;
                case -491008410: goto L_0x0399;
                case -468036698: goto L_0x03a5;
                case -438460728: goto L_0x03b1;
                case 159220715: goto L_0x03bd;
                case 243254635: goto L_0x03c9;
                case 580608584: goto L_0x03d5;
                case 1043595284: goto L_0x03e1;
                case 1410504463: goto L_0x03ed;
                case 1564995942: goto L_0x03f9;
                case 1684922085: goto L_0x0405;
                case 1760388972: goto L_0x0411;
                case 2069491034: goto L_0x041d;
                case 2124929861: goto L_0x0429;
                case 2146747614: goto L_0x0435;
                default: goto L_0x0021;
            }
        L_0x0021:
            java.lang.String r7 = "referral_screen"
            java.lang.String r6 = "on_success"
            r0 = r35
            r1 = r38
            switch(r8) {
                case 0: goto L_0x0497;
                case 1: goto L_0x04a2;
                case 2: goto L_0x0441;
                case 3: goto L_0x0552;
                case 4: goto L_0x09c1;
                case 5: goto L_0x05f1;
                case 6: goto L_0x05f6;
                case 7: goto L_0x00f5;
                case 8: goto L_0x0449;
                case 9: goto L_0x070d;
                case 10: goto L_0x09f7;
                case 11: goto L_0x0780;
                case 12: goto L_0x046e;
                case 13: goto L_0x07cd;
                case 14: goto L_0x04a5;
                case 15: goto L_0x04b3;
                case 16: goto L_0x0886;
                case 17: goto L_0x04ba;
                case 18: goto L_0x08cc;
                case 19: goto L_0x04ea;
                case 20: goto L_0x0abf;
                case 21: goto L_0x0030;
                case 22: goto L_0x0b71;
                case 23: goto L_0x04f1;
                case 24: goto L_0x0970;
                case 25: goto L_0x0993;
                case 26: goto L_0x0bc9;
                case 27: goto L_0x0500;
                case 28: goto L_0x050c;
                case 29: goto L_0x01a8;
                default: goto L_0x002c;
            }
        L_0x002c:
            super.Bgl(r2, r5, r1)
        L_0x002f:
            return
        L_0x0030:
            java.lang.String r5 = "card_number"
            java.lang.String r5 = X.C18310x6.A0o(r5, r1)
            java.lang.String r1 = "\\s"
            java.lang.String r7 = r5.replaceAll(r1, r4)
            java.util.HashMap r9 = X.AnonymousClass001.A0t()
            int r5 = r7.length()
            r4 = 0
            r1 = 6
            if (r5 >= r1) goto L_0x0053
            java.lang.String r1 = "network_name"
            java.lang.String r0 = "unknown"
            r9.put(r1, r0)
        L_0x004f:
            r2.A01(r6, r9)
            return
        L_0x0053:
            java.lang.String r21 = r7.substring(r4, r1)
            X.9SD r4 = r0.A0F
            boolean r1 = r4.A03
            if (r1 != 0) goto L_0x004f
            r4.A03 = r3
            X.2sH r8 = r0.A06
            X.3Wi r7 = r0.A05
            X.2sr r6 = r0.A01
            X.31C r5 = r0.A06
            X.9Rh r4 = r0.A0N
            X.2Ha r3 = r0.A08
            X.9VU r1 = r0.A0J
            X.9Q4 r12 = new X.9Q4
            r13 = r0
            r14 = r7
            r15 = r6
            r16 = r8
            r17 = r5
            r18 = r3
            r19 = r1
            r20 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.9RN r1 = new X.9RN
            r1.<init>(r2, r0, r9)
            X.9Rh r2 = r12.A07
            r0 = 5
            java.lang.String r6 = r2.A00(r0)
            X.2sH r2 = r12.A03
            X.2sr r0 = r12.A02
            java.lang.String r5 = X.AnonymousClass35J.A02(r0, r2)
            X.31C r8 = r12.A04
            java.lang.String r0 = r8.A03()
            r18 = 204(0xcc, float:2.86E-43)
            java.lang.String r3 = r12.A08
            java.lang.String r2 = "elo"
            X.2rL r4 = X.C56052rL.A04(r2)
            r22 = 255(0xff, double:1.26E-321)
            r20 = 1
            r24 = 0
            r19 = r6
            boolean r2 = X.C626836d.A0M(r19, r20, r22, r24)
            if (r2 == 0) goto L_0x00b6
            java.lang.String r2 = "network_device_id"
            X.C56052rL.A0D(r4, r2, r6)
        L_0x00b6:
            X.C1899593h.A1N(r4, r5)
            X.36K r7 = r4.A0F()
            X.9IL r6 = new X.9IL
            r6.<init>(r0)
            X.2rL r5 = X.C56052rL.A01()
            X.C1899593h.A1M(r5)
            X.2rL r4 = X.C1899593h.A0U()
            java.lang.String r9 = "action"
            java.lang.String r2 = "br-fetch-network-info"
            X.C56052rL.A0D(r4, r9, r2)
            r20 = 6
            r19 = r3
            r22 = r20
            boolean r2 = X.C626836d.A0M(r19, r20, r22, r24)
            if (r2 == 0) goto L_0x00e5
            java.lang.String r2 = "bin"
            X.C56052rL.A0D(r4, r2, r3)
        L_0x00e5:
            r4.A0H(r7)
            X.36K r16 = X.C41032Ir.A03(r4, r5, r6)
            android.content.Context r10 = r12.A00
            X.3Wi r2 = r12.A01
            X.2Ha r11 = r12.A05
            r15 = 7
            goto L_0x0270
        L_0x00f5:
            java.lang.String r4 = "cvv"
            java.lang.String r29 = X.C18310x6.A0o(r4, r1)
            java.lang.String r4 = "expiry_date"
            java.lang.String r4 = X.AnonymousClass97S.A0X(r4, r1)
            int[] r16 = X.AnonymousClass97S.A0Z(r4)
            java.lang.String r4 = "card_number"
            java.lang.String r28 = X.C18310x6.A0o(r4, r1)
            X.1VX r4 = r0.A0D
            r1 = 1482(0x5ca, float:2.077E-42)
            boolean r1 = r4.A0X(r1)
            if (r1 == 0) goto L_0x0190
            X.9Ty r4 = r0.A0L
            java.lang.String r1 = "generic_context"
            boolean r1 = r4.A07(r1)
            r1 = r1 ^ 1
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r1)
        L_0x0123:
            X.2sH r1 = r0.A06
            r34 = r1
            X.3Wi r1 = r0.A05
            r33 = r1
            X.2sr r1 = r0.A01
            r32 = r1
            X.4FS r1 = r0.A04
            r26 = r1
            X.31C r1 = r0.A06
            r17 = r1
            X.9Nf r15 = r0.A0V
            X.9Se r14 = r0.A0U
            X.9U4 r13 = r0.A0F
            X.33l r12 = r0.A0A
            X.28X r11 = r0.A0W
            X.9TJ r10 = r0.A0J
            X.9SD r9 = r0.A0F
            X.32a r8 = r0.A03
            X.9U5 r7 = r0.A0C
            X.1ip r6 = r0.A07
            X.2Ha r5 = r0.A08
            r1 = 0
            r30 = r16[r1]
            r31 = r16[r3]
            X.9R4 r4 = new X.9R4
            r4.<init>(r2, r0)
            X.9A3 r1 = new X.9A3
            r18 = r7
            r19 = r13
            r20 = r9
            r21 = r10
            r22 = r4
            r23 = r14
            r24 = r15
            r25 = r11
            r13 = r34
            r14 = r8
            r15 = r17
            r16 = r5
            r17 = r12
            r8 = r1
            r9 = r0
            r10 = r33
            r11 = r32
            r12 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.9SD r5 = r0.A0F
            X.9OH r4 = new X.9OH
            r4.<init>(r1, r5)
            X.99k r2 = r5.A0B
            r2.A07(r4)
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x0193
            r2.A06(r4)
            return
        L_0x0190:
            r27 = 0
            goto L_0x0123
        L_0x0193:
            X.9Q0 r2 = r5.A00
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x002f
            r5.A02 = r3
            r5.A00 = r2
            X.7oG r2 = r1.A0D
            java.lang.String r0 = "sendAddCard"
            r2.A06(r0)
            X.4FS r9 = r1.A0K
            goto L_0x0c26
        L_0x01a8:
            java.lang.String r3 = "card_verify_type"
            java.lang.String r4 = X.AnonymousClass97S.A0Y(r3, r1)
            java.lang.String r3 = "app-to-app"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0284
            java.lang.String r3 = "otp"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x002f
            java.lang.String r3 = "credential_id"
            java.lang.String r20 = X.AnonymousClass97S.A0Y(r3, r1)
            java.lang.String r3 = "card_verify_identifier"
            java.lang.String r21 = X.AnonymousClass97S.A0Y(r3, r1)
            java.lang.String r19 = X.C1899693i.A0b(r0)
            java.lang.String r3 = "card_verify_otp_resend_interval_sec"
            java.lang.String r7 = X.C18310x6.A0o(r3, r1)
            X.3Wi r6 = r0.A05
            X.31C r5 = r0.A06
            X.9SD r4 = r0.A0F
            X.32a r3 = r0.A03
            X.2Ha r1 = r0.A08
            X.9Q7 r12 = new X.9Q7
            r13 = r0
            r14 = r6
            r15 = r3
            r16 = r5
            r17 = r1
            r18 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.9RL r1 = new X.9RL
            r1.<init>(r2, r0, r7)
            X.31C r8 = r12.A03
            java.lang.String r0 = r8.A03()
            r18 = 204(0xcc, float:2.86E-43)
            java.lang.String r11 = r12.A06
            java.lang.String r9 = r12.A07
            java.lang.String r7 = r12.A08
            X.9SD r4 = r12.A05
            X.8EA r2 = r4.A09
            X.7yw r2 = r2.A08(r11)
            X.6hr r2 = (X.C133736hr) r2
            if (r2 == 0) goto L_0x0282
            int r2 = r2.A01
            r3 = 5
            if (r2 != r3) goto L_0x0282
            X.9Rh r2 = r4.A0H
            java.lang.String r2 = r2.A00(r3)
            X.9IG r6 = new X.9IG
            r6.<init>(r2)
        L_0x021b:
            X.1wj r5 = X.C1899693i.A0W(r0)
            X.2rL r4 = X.C56052rL.A01()
            X.C1899593h.A1M(r4)
            X.2rL r3 = X.C1899593h.A0U()
            java.lang.String r10 = "action"
            java.lang.String r2 = "br-select-otp-verification-method"
            X.C56052rL.A0D(r3, r10, r2)
            r2 = 0
            boolean r10 = X.C1899593h.A1b(r11, r2)
            if (r10 == 0) goto L_0x023d
            java.lang.String r10 = "credential-id"
            X.C56052rL.A0D(r3, r10, r11)
        L_0x023d:
            r22 = 1000(0x3e8, double:4.94E-321)
            r20 = 1
            r19 = r9
            r24 = r2
            boolean r10 = X.C626836d.A0M(r19, r20, r22, r24)
            if (r10 == 0) goto L_0x0250
            java.lang.String r10 = "identifier"
            X.C56052rL.A0D(r3, r10, r9)
        L_0x0250:
            r19 = r7
            boolean r2 = X.C626836d.A0M(r19, r20, r22, r24)
            if (r2 == 0) goto L_0x025d
            java.lang.String r2 = "nonce"
            X.C56052rL.A0D(r3, r2, r7)
        L_0x025d:
            if (r6 == 0) goto L_0x0264
            X.36K r2 = r6.A00
            r3.A0H(r2)
        L_0x0264:
            X.36K r16 = X.C1899593h.A0S(r3, r4, r5)
            android.content.Context r10 = r12.A00
            X.3Wi r2 = r12.A01
            X.2Ha r11 = r12.A04
            r15 = 12
        L_0x0270:
            X.9oU r9 = new X.9oU
            r13 = r12
            r14 = r1
            r12 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r19 = 30000(0x7530, double:1.4822E-319)
            r14 = r8
            r15 = r9
            r17 = r0
            r14.A0D(r15, r16, r17, r18, r19)
            return
        L_0x0282:
            r6 = 0
            goto L_0x021b
        L_0x0284:
            r0.A01 = r2
            java.lang.String r3 = "credential_id"
            java.lang.String r3 = X.AnonymousClass97S.A0Y(r3, r1)
            r0.A0P = r3
            java.lang.String r3 = "app_to_app_partner_app_package"
            java.lang.String r5 = X.C18310x6.A0o(r3, r1)
            java.lang.String r3 = "app_to_app_partner_intent_action"
            java.lang.String r4 = X.C18310x6.A0o(r3, r1)
            java.lang.String r3 = "app_to_app_request_payload"
            java.lang.String r6 = X.C18310x6.A0o(r3, r1)
            X.0PJ r3 = X.AnonymousClass9UN.A00(r5, r4)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x0c2d
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x0c2d
            if (r3 == 0) goto L_0x0c2d
            java.lang.Object r5 = r3.A00
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r3.A01
            java.lang.String r4 = (java.lang.String) r4
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r1 = "android.intent.extra.TEXT"
            r3.putExtra(r1, r6)
            r3.setPackage(r5)
            r3.setAction(r4)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "PAY: BrazilPayBloksActivity appToApp package: "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = " action "
            X.C18260x0.A0s(r1, r4, r2)
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            android.content.ComponentName r1 = r3.resolveActivity(r1)
            if (r1 == 0) goto L_0x002f
            r1 = 100
            r0.startActivityForResult(r3, r1)
            return
        L_0x02ea:
            java.lang.String r0 = "get_compliance_status"
            short r8 = X.C1899693i.A0g(r0, r5)
            goto L_0x0021
        L_0x02f2:
            java.lang.String r0 = "show_account_removal_dialog"
            short r8 = X.C1899693i.A0h(r0, r5)
            goto L_0x0021
        L_0x02fa:
            java.lang.String r0 = "get_merchant_reg_data"
            short r8 = X.C1899693i.A0i(r0, r5)
            goto L_0x0021
        L_0x0302:
            java.lang.String r0 = "get_filtered_card_verification_options"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 3
            goto L_0x0021
        L_0x030d:
            java.lang.String r0 = "get_payout_banks"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 4
            goto L_0x0021
        L_0x0318:
            java.lang.String r0 = "send_kyc_data"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 5
            goto L_0x0021
        L_0x0323:
            java.lang.String r0 = "verify_card_otp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 6
            goto L_0x0021
        L_0x032e:
            java.lang.String r0 = "add_card"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 7
            goto L_0x0021
        L_0x0339:
            java.lang.String r0 = "dial_phone_number"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 8
            goto L_0x0021
        L_0x0345:
            java.lang.String r0 = "link_merchant"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 9
            goto L_0x0021
        L_0x0351:
            java.lang.String r0 = "pre_link_merchant"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 10
            goto L_0x0021
        L_0x035d:
            java.lang.String r0 = "bind_device"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 11
            goto L_0x0021
        L_0x0369:
            java.lang.String r0 = "add_card_phoenix"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 12
            goto L_0x0021
        L_0x0375:
            java.lang.String r0 = "add_credential"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 13
            goto L_0x0021
        L_0x0381:
            java.lang.String r0 = "open_fbpay_pin_bottom_sheet"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 14
            goto L_0x0021
        L_0x038d:
            java.lang.String r0 = "show_confirm_cancel_add_card_alert_dialog"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 15
            goto L_0x0021
        L_0x0399:
            java.lang.String r0 = "refetch_verification_methods"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 16
            goto L_0x0021
        L_0x03a5:
            java.lang.String r0 = "open_setup_payments_warning_dialog"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 17
            goto L_0x0021
        L_0x03b1:
            java.lang.String r0 = "document_upload_submit_document"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 18
            goto L_0x0021
        L_0x03bd:
            java.lang.String r0 = "dismiss_confirm_cancel_add_card_alert_dialog"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 19
            goto L_0x0021
        L_0x03c9:
            java.lang.String r0 = "reset_pin_from_card"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 20
            goto L_0x0021
        L_0x03d5:
            java.lang.String r0 = "get_card_network"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 21
            goto L_0x0021
        L_0x03e1:
            java.lang.String r0 = "tokenize_card"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 22
            goto L_0x0021
        L_0x03ed:
            java.lang.String r0 = "show_contact_picker"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 23
            goto L_0x0021
        L_0x03f9:
            java.lang.String r0 = "verify_card_phoenix"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 24
            goto L_0x0021
        L_0x0405:
            java.lang.String r0 = "handle_error_native"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 25
            goto L_0x0021
        L_0x0411:
            java.lang.String r0 = "update_merchant_account"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 26
            goto L_0x0021
        L_0x041d:
            java.lang.String r0 = "set_onboarding_started"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 27
            goto L_0x0021
        L_0x0429:
            java.lang.String r0 = "get_kyc_status"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 28
            goto L_0x0021
        L_0x0435:
            java.lang.String r0 = "submit_verification_method"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r8 = 29
            goto L_0x0021
        L_0x0441:
            X.9NI r0 = r0.A0E
            java.util.Map r0 = r0.A00
            r2.A01(r6, r0)
            return
        L_0x0449:
            java.lang.String r2 = "phone_number"
            java.lang.Object r1 = r1.get(r2)
            r2 = r4
            if (r1 == 0) goto L_0x0456
            java.lang.String r2 = r1.toString()
        L_0x0456:
            java.lang.String r1 = "[^\\d+]"
            java.lang.String r3 = r2.replaceAll(r1, r4)
            java.lang.String r2 = "tel"
            r1 = 0
            android.net.Uri r3 = android.net.Uri.fromParts(r2, r3, r1)
            java.lang.String r2 = "android.intent.action.DIAL"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L_0x046e:
            java.lang.String r3 = X.C18310x6.A0o(r7, r1)
            X.9Sa r6 = r0.A0O
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x047b
            r4 = r3
        L_0x047b:
            r1 = 1
            X.9pc r5 = new X.9pc
            r5.<init>(r2, r0, r1)
            X.9Vl r3 = new X.9Vl
            r3.<init>(r2, r0, r1)
            X.9dW r1 = new X.9dW
            r1.<init>()
            X.3XA r3 = r6.A00(r3, r1, r5, r4)
            r1 = 5
            X.9qF r2 = new X.9qF
            r2.<init>(r0, r1)
            goto L_0x098f
        L_0x0497:
            X.9Rg r4 = r0.A0C
            X.9cP r1 = new X.9cP
            r1.<init>(r2, r0)
            r4.A00(r1, r3)
            return
        L_0x04a2:
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x04b6
        L_0x04a5:
            X.9W1 r4 = r0.A0N
            X.9Rg r2 = r4.A0G
            X.9cR r1 = new X.9cR
            r1.<init>(r0, r4, r3)
            r0 = 0
            r2.A00(r1, r0)
            return
        L_0x04b3:
            r1 = 2131887035(0x7f1203bb, float:1.9408666E38)
        L_0x04b6:
            X.C621433s.A01(r0, r1)
            return
        L_0x04ba:
            java.lang.String r2 = "onboarding_context"
            java.lang.String r5 = X.C18310x6.A0o(r2, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L_0x04d6
            java.lang.String r4 = "p2m_context"
            boolean r2 = r5.equals(r4)
            if (r2 != 0) goto L_0x04d8
            java.lang.String r4 = "p2p_context"
            boolean r2 = r5.equals(r4)
            if (r2 != 0) goto L_0x04d8
        L_0x04d6:
            java.lang.String r4 = "generic_context"
        L_0x04d8:
            java.lang.String r2 = X.C18310x6.A0o(r7, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L_0x04e4
            java.lang.String r2 = "payment_home"
        L_0x04e4:
            X.9W1 r1 = r0.A0N
            r1.A03(r0, r2, r4, r3)
            return
        L_0x04ea:
            r1 = 2131887035(0x7f1203bb, float:1.9408666E38)
            X.C621433s.A00(r0, r1)
            return
        L_0x04f1:
            java.lang.Class<com.whatsapp.payments.ui.PaymentContactPicker> r1 = com.whatsapp.payments.ui.PaymentContactPicker.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r0, r1)
            java.lang.String r1 = "for_payments"
            r2.putExtra(r1, r3)
            r0.startActivity(r2)
            return
        L_0x0500:
            X.33p r0 = r0.A09
            android.content.SharedPreferences$Editor r1 = r0.A0U()
            java.lang.String r0 = "payments_onboarding_banner_registration_started"
            X.C18270x1.A0l(r1, r0, r3)
            return
        L_0x050c:
            java.lang.String r11 = "FB"
            X.3Wi r7 = r0.A05
            X.9Se r6 = r0.A0U
            X.9U5 r5 = r0.A0C
            X.2Ha r4 = r0.A08
            X.9VU r1 = r0.A0J
            X.9Pz r8 = new X.9Pz
            r12 = r8
            r13 = r0
            r14 = r7
            r15 = r4
            r16 = r5
            r17 = r1
            r18 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.9cF r7 = new X.9cF
            r7.<init>(r2, r0)
            X.9U5 r0 = r8.A03
            java.lang.String r13 = "get"
            r1 = 2
            X.39V[] r2 = new X.AnonymousClass39V[r1]
            java.lang.String r1 = "action"
            java.lang.String r10 = "get-kyc-state"
            X.AnonymousClass39V.A04(r1, r10, r2)
            java.lang.String r1 = "provider"
            X.AnonymousClass39V.A0B(r1, r11, r2, r3)
            X.36K r12 = X.C1899693i.A0U(r2)
            android.content.Context r5 = r8.A00
            X.3Wi r9 = r8.A01
            X.2Ha r6 = r8.A02
            X.99t r4 = new X.99t
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r14 = 0
            goto L_0x0773
        L_0x0552:
            java.lang.String r0 = "verify_methods"
            java.lang.String r3 = X.C18310x6.A0o(r0, r1)
            java.lang.String r0 = "keys"
            java.lang.String r0 = X.C18310x6.A0o(r0, r1)
            if (r3 == 0) goto L_0x05eb
            if (r0 == 0) goto L_0x05eb
            java.util.HashMap r5 = X.AnonymousClass001.A0t()
            java.util.List r8 = X.C18310x6.A0t(r0)
            java.io.StringWriter r7 = new java.io.StringWriter
            r7.<init>()
            android.util.JsonWriter r4 = new android.util.JsonWriter
            r4.<init>(r7)
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x05e6 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x05e6 }
            android.util.JsonReader r3 = new android.util.JsonReader     // Catch:{ IOException -> 0x05e6 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x05e6 }
            r4.beginObject()     // Catch:{ all -> 0x05dc }
            java.lang.String r0 = "verification_options"
            r4.name(r0)     // Catch:{ all -> 0x05dc }
        L_0x0586:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x05dc }
            if (r0 == 0) goto L_0x05c9
            r3.beginArray()     // Catch:{ all -> 0x05dc }
            r4.beginArray()     // Catch:{ all -> 0x05dc }
        L_0x0592:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x05dc }
            if (r0 == 0) goto L_0x05c5
            r3.beginObject()     // Catch:{ all -> 0x05dc }
            r4.beginObject()     // Catch:{ all -> 0x05dc }
        L_0x059e:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x05dc }
            if (r0 == 0) goto L_0x05be
            java.lang.String r1 = r3.nextName()     // Catch:{ all -> 0x05dc }
            boolean r0 = r8.contains(r1)     // Catch:{ all -> 0x05dc }
            if (r0 == 0) goto L_0x05ba
            android.util.JsonWriter r1 = r4.name(r1)     // Catch:{ all -> 0x05dc }
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x05dc }
            r1.value(r0)     // Catch:{ all -> 0x05dc }
            goto L_0x059e
        L_0x05ba:
            r3.skipValue()     // Catch:{ all -> 0x05dc }
            goto L_0x059e
        L_0x05be:
            r3.endObject()     // Catch:{ all -> 0x05dc }
            r4.endObject()     // Catch:{ all -> 0x05dc }
            goto L_0x0592
        L_0x05c5:
            r4.endArray()     // Catch:{ all -> 0x05dc }
            goto L_0x0586
        L_0x05c9:
            r4.endObject()     // Catch:{ all -> 0x05dc }
            r3.close()     // Catch:{ IOException -> 0x05e6 }
            java.lang.String r1 = "payload"
            java.lang.String r0 = r7.toString()
            r5.put(r1, r0)
            r2.A02(r6, r5)
            return
        L_0x05dc:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x05e1 }
            goto L_0x05e5
        L_0x05e1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x05e6 }
        L_0x05e5:
            throw r1     // Catch:{ IOException -> 0x05e6 }
        L_0x05e6:
            java.lang.String r0 = "Error parsing verify_methods"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x05eb:
            java.lang.String r0 = "on_failure"
            r2.A00(r0)
            return
        L_0x05f1:
            r3 = 0
            r0.A7G(r2, r1, r3)
            return
        L_0x05f6:
            java.lang.String r5 = "otp"
            java.lang.String r6 = X.AnonymousClass97S.A0Y(r5, r1)
            java.lang.String r5 = " "
            java.lang.String r27 = r6.replace(r5, r4)
            java.lang.String r4 = "card_verify_type"
            r1.get(r4)
            java.lang.String r4 = "credential_id"
            java.lang.String r29 = X.C18310x6.A0o(r4, r1)
            java.lang.String r4 = "card_verify_identifier"
            java.lang.String r30 = X.C18310x6.A0o(r4, r1)
            java.lang.String r4 = "card_verify_otp_resend_interval_sec"
            java.lang.String r1 = X.C18310x6.A0o(r4, r1)
            java.lang.String r28 = X.C1899693i.A0b(r0)
            X.2sH r4 = r0.A06
            r32 = r4
            X.3Wi r4 = r0.A05
            r31 = r4
            X.2sr r15 = r0.A01
            X.8EA r14 = r0.A05
            X.31C r13 = r0.A06
            X.9U4 r12 = r0.A0F
            X.9SD r11 = r0.A0F
            X.9U5 r10 = r0.A0C
            X.32a r9 = r0.A03
            X.9Rh r8 = r0.A0N
            X.9Vc r7 = r0.A0A
            X.2Ha r6 = r0.A08
            X.9VU r5 = r0.A0J
            X.9RK r4 = new X.9RK
            r4.<init>(r2, r0, r1)
            X.9A5 r1 = new X.9A5
            r21 = r10
            r22 = r12
            r23 = r5
            r24 = r11
            r25 = r8
            r26 = r4
            r16 = r9
            r17 = r14
            r18 = r13
            r19 = r7
            r20 = r6
            r11 = r1
            r12 = r0
            r13 = r31
            r14 = r15
            r15 = r32
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.String r5 = r1.A06
            X.8EA r4 = r1.A04
            X.7yw r0 = r4.A08(r5)
            if (r0 == 0) goto L_0x0685
            X.6hx r0 = r0.A08
            X.99I r0 = (X.AnonymousClass99I) r0
            if (r0 == 0) goto L_0x0685
            java.lang.String r2 = "VISA"
            java.lang.String r0 = r0.A03
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0685
            java.lang.String r0 = "PAY: BrazilVerifyCardOTPSendAction sendRequestCardVerification with encrypted value"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A00()
            return
        L_0x0685:
            X.7yw r0 = r4.A08(r5)
            X.6hr r0 = (X.C133736hr) r0
            if (r0 == 0) goto L_0x0702
            int r2 = r0.A01
            r0 = 5
            if (r2 != r0) goto L_0x0702
            java.lang.String r0 = "PAY: BrazilStepUpVerificationBase getProviderEncryptionKeyAsync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9SD r0 = r1.A09
            X.9Q0 r4 = r0.A00
            r2 = 0
            if (r4 == 0) goto L_0x06a8
            java.lang.String r0 = r4.A02
            r4.A02 = r2
            if (r0 == 0) goto L_0x06a8
            r1.A02(r2, r0)
            return
        L_0x06a8:
            X.2sH r4 = r1.A03
            android.content.Context r9 = r1.A00
            X.3Wi r10 = r1.A01
            X.2sr r11 = r1.A02
            X.9U5 r2 = r1.A06
            X.2Ha r0 = r1.A05
            X.9Pp r8 = new X.9Pp
            r12 = r4
            r13 = r0
            r14 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.9NF r9 = new X.9NF
            r9.<init>(r1)
            java.lang.String r6 = "ADD_CARD"
            java.lang.String r7 = "elo"
            X.2sH r1 = r8.A03
            X.2sr r0 = r8.A02
            java.lang.String r5 = X.AnonymousClass35J.A02(r0, r1)
            X.9U5 r0 = r8.A05
            java.lang.String r13 = "set"
            r1 = 4
            X.39V[] r4 = new X.AnonymousClass39V[r1]
            java.lang.String r2 = "action"
            java.lang.String r1 = "br-request-new-challenge"
            X.AnonymousClass39V.A04(r2, r1, r4)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r2 = r7.toUpperCase(r1)
            java.lang.String r1 = "network_type"
            X.AnonymousClass39V.A0B(r1, r2, r4, r3)
            java.lang.String r1 = "scope"
            X.AnonymousClass39V.A06(r1, r6, r4)
            java.lang.String r1 = "nonce"
            X.AnonymousClass39V.A07(r1, r5, r4)
            X.36K r12 = X.C1899693i.A0U(r4)
            android.content.Context r5 = r8.A00
            X.3Wi r7 = r8.A01
            X.2Ha r6 = r8.A04
            r10 = 11
            X.9oU r4 = new X.9oU
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x0771
        L_0x0702:
            java.lang.String r0 = "PAY: BrazilVerifyCardOTPSendAction sendRequestCardVerification without encrypted value"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r1.A09
            r1.A03(r0)
            return
        L_0x070d:
            java.lang.String r3 = "credential_id"
            java.lang.String r15 = X.AnonymousClass97S.A0Y(r3, r1)
            X.3Wi r9 = r0.A05
            X.9Se r8 = r0.A0U
            X.9U4 r7 = r0.A0F
            X.9U5 r6 = r0.A0C
            X.32a r5 = r0.A03
            X.2Ha r4 = r0.A08
            X.9Qi r1 = new X.9Qi
            r1.<init>(r2)
            X.9Q6 r3 = new X.9Q6
            r11 = r6
            r12 = r7
            r13 = r1
            r14 = r8
            r6 = r3
            r7 = r0
            r8 = r9
            r9 = r5
            r10 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = "PAY: BrazilMerchantLinkAction linkMerchant"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r4 = r3.A08
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.lang.String r1 = "action"
            java.lang.String r0 = "br-link-merchant"
            X.AnonymousClass39V.A03(r1, r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0779
            java.lang.String r0 = "credential-id"
            X.AnonymousClass39V.A03(r0, r4, r2)
            X.9Se r0 = r3.A07
            java.lang.String r1 = r0.A01()
            java.lang.String r0 = "device-id"
            X.AnonymousClass39V.A03(r0, r1, r2)
            X.9U5 r0 = r3.A04
            java.lang.String r13 = "set"
            X.36K r12 = X.C1899593h.A0T(r2)
            android.content.Context r5 = r3.A00
            X.3Wi r2 = r3.A01
            X.2Ha r1 = r3.A03
            r9 = 5
            X.9oT r4 = new X.9oT
            r6 = r1
            r7 = r2
            r8 = r3
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0771:
            r14 = 30000(0x7530, double:1.4822E-319)
        L_0x0773:
            r10 = r0
            r11 = r4
            r10.A0G(r11, r12, r13, r14)
            return
        L_0x0779:
            java.lang.String r0 = "Credential id missing"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0780:
            java.lang.String r3 = "credential_id"
            java.lang.String r3 = X.AnonymousClass97S.A0Y(r3, r1)
            X.9U4 r1 = r0.A0F
            X.7yw r14 = X.AnonymousClass9U4.A02(r1, r3)
            X.C626936e.A06(r14)
            X.6hr r14 = (X.C133736hr) r14
            X.2sH r13 = r0.A06
            X.3Wi r12 = r0.A05
            X.2sr r11 = r0.A01
            X.31C r10 = r0.A06
            X.9U4 r9 = r0.A0F
            X.9U5 r8 = r0.A0C
            X.9Rh r7 = r0.A0N
            X.32a r6 = r0.A03
            X.9Vc r5 = r0.A0A
            X.2Ha r4 = r0.A08
            r1 = 0
            X.9ok r3 = new X.9ok
            r3.<init>(r2, r0, r1)
            X.9So r1 = new X.9So
            r25 = r9
            r26 = r3
            r27 = r7
            r20 = r6
            r21 = r10
            r22 = r5
            r23 = r4
            r24 = r8
            r15 = r1
            r16 = r0
            r17 = r12
            r18 = r11
            r19 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1.A00(r14)
            return
        L_0x07cd:
            java.lang.String r3 = "credential_push_data"
            java.lang.String r26 = X.C18310x6.A0o(r3, r1)
            java.lang.String r3 = "credential_card_network"
            java.lang.String r27 = X.C18310x6.A0o(r3, r1)
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass4SG.A2m(r0)
            if (r1 != 0) goto L_0x0866
            r1 = 0
        L_0x07e0:
            X.C626936e.A06(r1)
            java.lang.String r3 = X.AnonymousClass36P.A08(r1)
            java.lang.String r1 = "[^\\d]"
            java.lang.String r28 = r3.replaceAll(r1, r4)
            X.1VX r3 = r0.A0D
            r1 = 1482(0x5ca, float:2.077E-42)
            boolean r1 = r3.A0X(r1)
            if (r1 == 0) goto L_0x0863
            X.9Ty r3 = r0.A0L
            java.lang.String r1 = "generic_context"
            boolean r1 = r3.A07(r1)
            r1 = r1 ^ 1
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r1)
        L_0x0805:
            X.2sH r12 = r0.A06
            X.3Wi r11 = r0.A05
            X.2sr r10 = r0.A01
            X.31C r9 = r0.A06
            X.9U4 r8 = r0.A0F
            X.9TJ r7 = r0.A0J
            X.9U5 r6 = r0.A0C
            X.32a r5 = r0.A03
            X.2Ha r4 = r0.A08
            X.9VU r3 = r0.A0J
            X.9S6 r1 = new X.9S6
            r23 = r3
            r24 = r7
            r18 = r5
            r19 = r9
            r20 = r4
            r21 = r6
            r22 = r8
            r13 = r1
            r14 = r0
            r15 = r11
            r16 = r10
            r17 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.9Se r3 = r0.A0U
            java.lang.String r29 = r3.A01()
            X.9OJ r4 = new X.9OJ
            r4.<init>(r2, r0)
            X.9VU r8 = r1.A09
            java.lang.String r9 = "KYC"
            java.lang.String r2 = "FB"
            X.3Rl r3 = r8.A01(r2, r9)
            if (r3 == 0) goto L_0x086a
            java.lang.String r0 = r3.A05
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x086a
            r0 = r1
            r1 = r3
            r2 = r4
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r0.A00(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0863:
            r25 = 0
            goto L_0x0805
        L_0x0866:
            java.lang.String r1 = r1.user
            goto L_0x07e0
        L_0x086a:
            X.9cM r0 = new X.9cM
            r23 = r1
            r24 = r4
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            android.content.Context r4 = r1.A00
            X.3Wi r5 = r1.A01
            X.9U5 r7 = r1.A07
            X.2Ha r6 = r1.A06
            X.9Rt r3 = new X.9Rt
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3.A00(r0, r2)
            return
        L_0x0886:
            java.lang.String r3 = "credential_id"
            java.lang.String r13 = X.C18310x6.A0o(r3, r1)
            X.2sH r14 = r0.A06
            X.3Wi r12 = r0.A05
            X.2sr r11 = r0.A01
            X.31C r10 = r0.A06
            X.9Se r9 = r0.A0U
            X.9U4 r8 = r0.A0F
            X.9U5 r7 = r0.A0C
            X.9Rh r6 = r0.A0N
            X.32a r5 = r0.A03
            X.9Vc r3 = r0.A0A
            X.2Ha r1 = r0.A08
            X.9S9 r4 = new X.9S9
            r25 = r8
            r26 = r6
            r27 = r9
            r28 = r13
            r20 = r5
            r21 = r10
            r22 = r3
            r23 = r1
            r24 = r7
            r15 = r4
            r16 = r0
            r17 = r12
            r18 = r11
            r19 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r3 = 1
            X.9qB r1 = new X.9qB
            r1.<init>(r2, r0, r13, r3)
            r4.A00(r1)
            return
        L_0x08cc:
            java.lang.String r4 = "on_failure"
            java.lang.String r3 = "document_type"
            java.lang.String r8 = X.AnonymousClass97S.A0X(r3, r1)
            java.lang.String r3 = "doc_file_name_list"
            java.lang.String r1 = X.AnonymousClass97S.A0X(r3, r1)
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            org.json.JSONObject r6 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ JSONException -> 0x0966 }
            X.2Ve r3 = r0.A02     // Catch:{ JSONException -> 0x0966 }
            java.lang.String r1 = "front"
            java.lang.String r1 = r6.getString(r1)     // Catch:{ JSONException -> 0x0966 }
            java.io.File r7 = r3.A00(r1)     // Catch:{ JSONException -> 0x0966 }
            X.2Ve r3 = r0.A02     // Catch:{ JSONException -> 0x0966 }
            java.lang.String r1 = "back"
            java.lang.String r1 = r6.getString(r1)     // Catch:{ JSONException -> 0x0966 }
            java.io.File r6 = r3.A00(r1)     // Catch:{ JSONException -> 0x0966 }
            if (r7 == 0) goto L_0x0957
            if (r6 == 0) goto L_0x0957
            boolean r1 = r7.exists()     // Catch:{ JSONException -> 0x0966 }
            if (r1 == 0) goto L_0x0957
            boolean r1 = r6.exists()     // Catch:{ JSONException -> 0x0966 }
            if (r1 == 0) goto L_0x0957
            java.lang.String r1 = r7.getPath()     // Catch:{ JSONException -> 0x0966 }
            java.lang.String r3 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r1)     // Catch:{ JSONException -> 0x0966 }
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ JSONException -> 0x0966 }
            java.lang.String r1 = r1.getMimeTypeFromExtension(r3)     // Catch:{ JSONException -> 0x0966 }
            boolean r1 = X.AnonymousClass5b1.A06(r1)     // Catch:{ JSONException -> 0x0966 }
            if (r1 == 0) goto L_0x095d
            java.lang.String r1 = r6.getPath()     // Catch:{ JSONException -> 0x0966 }
            java.lang.String r3 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r1)     // Catch:{ JSONException -> 0x0966 }
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ JSONException -> 0x0966 }
            java.lang.String r1 = r1.getMimeTypeFromExtension(r3)     // Catch:{ JSONException -> 0x0966 }
            boolean r1 = X.AnonymousClass5b1.A06(r1)     // Catch:{ JSONException -> 0x0966 }
            if (r1 == 0) goto L_0x095d
            r5.add(r7)     // Catch:{ JSONException -> 0x0966 }
            r5.add(r6)     // Catch:{ JSONException -> 0x0966 }
            int r1 = r5.size()
            if (r1 != 0) goto L_0x094b
            java.lang.String r0 = "PAY: BrazilPayBloksActivity performDocumentUpload no file to upload"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r2.A00(r4)
            return
        L_0x094b:
            r11 = 0
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            r6 = r0
            r7 = r2
            r9 = r5
            r6.A7F(r7, r8, r9, r10, r11)
            return
        L_0x0957:
            java.lang.String r0 = "PAY: BrazilPayBloksActivity performDocumentUpload file not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x0966 }
            goto L_0x0962
        L_0x095d:
            java.lang.String r0 = "PAY: BrazilPayBloksActivity performDocumentUpload format not allowed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x0966 }
        L_0x0962:
            r2.A00(r4)     // Catch:{ JSONException -> 0x0966 }
            return
        L_0x0966:
            r1 = move-exception
            java.lang.String r0 = "PAY: BrazilPayBloksActivity performDocumentUpload threw exception "
            com.whatsapp.util.Log.e(r0, r1)
            r2.A00(r4)
            return
        L_0x0970:
            java.lang.String r3 = "credential_id"
            java.lang.String r7 = X.AnonymousClass97S.A0Y(r3, r1)
            X.9Sa r3 = r0.A0O
            java.lang.String r8 = "add_card"
            r1 = 0
            X.9pc r6 = new X.9pc
            r6.<init>(r2, r0, r1)
            X.9Vl r4 = new X.9Vl
            r4.<init>(r2, r0, r1)
            r5 = 0
            X.3XA r3 = r3.A01(r4, r5, r6, r7, r8)
            X.9qD r2 = new X.9qD
            r2.<init>(r1, r7, r0)
        L_0x098f:
            r3.A03(r2)
            return
        L_0x0993:
            java.lang.String r2 = "error_code"
            java.lang.String r2 = X.C18310x6.A0o(r2, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x09aa
            int r4 = java.lang.Integer.parseInt(r2)
            boolean r1 = r0.BEy(r4)
            if (r1 == 0) goto L_0x09ab
            return
        L_0x09aa:
            r4 = -1
        L_0x09ab:
            X.9bc r3 = r0.A09
            X.1VX r2 = r0.A0D
            r10 = 2131891948(0x7f1216ec, float:1.941863E38)
            X.9TZ r1 = r0.A0K
            r5 = r3
            r6 = r0
            r7 = r2
            r8 = r1
            r9 = r4
            X.043 r0 = r5.A01(r6, r7, r8, r9, r10)
            r0.show()
            return
        L_0x09c1:
            X.9VU r1 = r0.A0J
            java.lang.String r8 = "KYC"
            java.lang.String r7 = "FB"
            X.3Rl r1 = r1.A01(r7, r8)
            if (r1 == 0) goto L_0x09d9
            java.lang.String r3 = r1.A05
            boolean r1 = r3.equalsIgnoreCase(r7)
            if (r1 == 0) goto L_0x09d9
            r0.A7E(r2, r3)
            return
        L_0x09d9:
            r1 = 1
            X.9q2 r6 = new X.9q2
            r6.<init>(r2, r1, r0)
            X.3Wi r5 = r0.A05
            X.9U5 r4 = r0.A0C
            X.2Ha r3 = r0.A08
            X.9VU r2 = r0.A0J
            X.9Rt r1 = new X.9Rt
            r13 = r2
            r14 = r8
            r8 = r1
            r9 = r0
            r10 = r5
            r11 = r3
            r12 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r1.A00(r6, r7)
            return
        L_0x09f7:
            java.lang.String r3 = "verify_type"
            java.lang.String r8 = X.AnonymousClass97S.A0Y(r3, r1)
            java.lang.String r3 = "verify_id"
            java.lang.String r26 = X.AnonymousClass97S.A0Y(r3, r1)
            java.lang.String r7 = "BANK"
            boolean r3 = r8.equals(r7)
            r4 = 0
            if (r3 == 0) goto L_0x0a8e
            java.lang.String r3 = "bank_code"
            java.lang.String r27 = X.AnonymousClass97S.A0Y(r3, r1)
            java.lang.String r3 = "branch_name"
            java.lang.String r28 = X.AnonymousClass97S.A0Y(r3, r1)
            java.lang.String r3 = "bank_account_type"
            java.lang.String r29 = X.AnonymousClass97S.A0Y(r3, r1)
            java.lang.String r3 = "bank_account_number"
            java.lang.String r30 = X.AnonymousClass97S.A0Y(r3, r1)
            r31 = r4
        L_0x0a26:
            X.2sH r1 = r0.A06
            r16 = r1
            X.3Wi r15 = r0.A05
            X.2sr r14 = r0.A01
            X.4FS r13 = r0.A04
            X.9Nf r12 = r0.A0V
            X.9Se r11 = r0.A0U
            X.33l r10 = r0.A0A
            X.28X r9 = r0.A0W
            X.9U5 r6 = r0.A0C
            X.1ip r5 = r0.A07
            X.2Ha r4 = r0.A08
            X.9Qj r3 = new X.9Qj
            r3.<init>(r2)
            X.9A2 r1 = new X.9A2
            r21 = r11
            r22 = r12
            r23 = r9
            r24 = r13
            r25 = r8
            r17 = r4
            r18 = r10
            r19 = r6
            r20 = r3
            r11 = r1
            r12 = r0
            r13 = r15
            r15 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: BrazilMerchantLinkAction preLinkMerchant: "
            r2.append(r0)
            java.lang.String r4 = r1.A0F
            X.C18260x0.A1L(r2, r4)
            int r3 = r4.hashCode()
            r0 = -1136784465(0xffffffffbc3e0baf, float:-0.011599465)
            r2 = 0
            if (r3 == r0) goto L_0x0ab1
            r0 = 2031164(0x1efe3c, float:2.846267E-39)
            if (r3 == r0) goto L_0x0a82
            r0 = 399611855(0x17d197cf, float:1.354463E-24)
            if (r3 != r0) goto L_0x0ab1
            java.lang.String r7 = "PREPAID"
        L_0x0a82:
            boolean r0 = r4.equals(r7)
            if (r0 == 0) goto L_0x0ab1
            X.4FS r9 = r1.A08
            java.lang.Void[] r0 = new java.lang.Void[r2]
            goto L_0x0c29
        L_0x0a8e:
            java.lang.String r3 = "PREPAID"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0aa5
            java.lang.String r3 = "serial_number"
            java.lang.String r31 = X.AnonymousClass97S.A0Y(r3, r1)
            r27 = r4
            r28 = r4
            r29 = r4
            r30 = r4
            goto L_0x0a26
        L_0x0aa5:
            r27 = r4
            r28 = r4
            r29 = r4
            r30 = r4
            r31 = r4
            goto L_0x0a26
        L_0x0ab1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid Verify Type: "
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r4, r1)
            throw r0
        L_0x0abf:
            java.lang.String r3 = "credential_id"
            java.lang.String r12 = X.AnonymousClass97S.A0X(r3, r1)
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.lang.String r3 = "card_num"
            java.lang.String r5 = X.AnonymousClass97S.A0X(r3, r1)
            java.lang.String r3 = "\\s"
            java.lang.String r4 = r5.replace(r3, r4)
            java.lang.String r3 = "creditCardNumber"
            X.AnonymousClass0x2.A1G(r3, r4, r11)
            X.2sH r13 = r0.A06
            X.3Wi r10 = r0.A05
            X.2sr r9 = r0.A01
            X.9Rn r8 = r0.A0G
            X.9Se r7 = r0.A0U
            X.9TR r6 = r0.A0R
            X.9U5 r5 = r0.A0C
            X.2Ha r4 = r0.A08
            X.9VU r3 = r0.A0J
            java.lang.String r14 = "pin"
            java.lang.String r26 = X.C18310x6.A0o(r14, r1)
            java.lang.String r14 = "provider"
            java.lang.String r27 = X.C18310x6.A0o(r14, r1)
            X.9SB r1 = new X.9SB
            r24 = r7
            r25 = r12
            r28 = r11
            r19 = r4
            r20 = r5
            r21 = r8
            r22 = r3
            r23 = r6
            r14 = r1
            r15 = r0
            r16 = r10
            r17 = r9
            r18 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.9RM r4 = new X.9RM
            r4.<init>(r2, r0, r12)
            java.lang.String r3 = r1.A0B
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0b46
            java.lang.String r5 = r1.A0C
            X.C626936e.A06(r5)
            X.9VU r2 = r1.A06
            java.lang.String r0 = "PIN"
            X.3Rl r2 = r2.A01(r5, r0)
            if (r2 != 0) goto L_0x0b3d
            X.9Rt r3 = r1.A05
            r2 = 0
            X.9q2 r0 = new X.9q2
            r0.<init>(r4, r2, r1)
            r3.A00(r0, r5)
            return
        L_0x0b3d:
            X.9Qh r0 = new X.9Qh
            r0.<init>(r2)
            r1.A00(r0, r4, r3)
            return
        L_0x0b46:
            X.9Rn r8 = r1.A04
            java.util.List r7 = r1.A0D
            r0 = 1
            X.9W8 r6 = new X.9W8
            r6.<init>(r4, r0, r1)
            X.4FS r9 = r8.A05
            X.9Nf r5 = r8.A03
            X.33l r4 = r8.A01
            X.28X r3 = r8.A04
            X.9U5 r2 = r8.A02
            X.1ip r0 = r8.A00
            r19 = -1
            r14 = 0
            X.99z r1 = new X.99z
            r15 = r6
            r16 = r5
            r17 = r3
            r18 = r7
            r10 = r1
            r11 = r0
            r12 = r4
            r13 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0c26
        L_0x0b71:
            java.lang.String r4 = "cvv"
            java.lang.String r24 = X.C18310x6.A0o(r4, r1)
            java.lang.String r4 = "expiry_date"
            java.lang.String r4 = X.AnonymousClass97S.A0X(r4, r1)
            int[] r15 = X.AnonymousClass97S.A0Z(r4)
            java.lang.String r4 = "credential_id"
            java.lang.String r26 = X.C18310x6.A0o(r4, r1)
            java.lang.String r25 = X.C1899693i.A0b(r0)
            X.3Wi r14 = r0.A05
            X.4FS r13 = r0.A04
            X.9Nf r12 = r0.A0V
            X.9U4 r11 = r0.A0F
            X.33l r10 = r0.A0A
            X.28X r9 = r0.A0W
            X.9TJ r8 = r0.A0J
            X.9U5 r7 = r0.A0C
            X.32a r6 = r0.A03
            X.1ip r5 = r0.A07
            X.2Ha r4 = r0.A08
            r27 = r15[r3]
            r1 = 0
            r28 = r15[r1]
            X.9R3 r3 = new X.9R3
            r3.<init>(r2, r0)
            X.9A0 r1 = new X.9A0
            r20 = r3
            r21 = r12
            r22 = r9
            r23 = r13
            r15 = r4
            r16 = r10
            r17 = r7
            r18 = r11
            r19 = r8
            r10 = r1
            r11 = r0
            r12 = r14
            r13 = r5
            r14 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.4FS r9 = r1.A0A
            goto L_0x0c26
        L_0x0bc9:
            java.lang.String r3 = "bank_account_number"
            java.lang.String r24 = X.AnonymousClass97S.A0Y(r3, r1)
            java.lang.String r3 = "bank_code"
            java.lang.String r25 = X.AnonymousClass97S.A0Y(r3, r1)
            java.lang.String r3 = "bank_branch_number"
            java.lang.String r26 = X.AnonymousClass97S.A0Y(r3, r1)
            java.lang.String r3 = "bank_account_type"
            java.lang.String r1 = X.AnonymousClass97S.A0Y(r3, r1)
            java.lang.String r27 = X.C1899693i.A0b(r0)
            X.3Wi r14 = r0.A05
            X.4FS r13 = r0.A04
            X.9Nf r12 = r0.A0V
            X.9Se r11 = r0.A0U
            X.9U4 r10 = r0.A0F
            X.33l r9 = r0.A0A
            X.28X r8 = r0.A0W
            X.9U5 r7 = r0.A0C
            X.32a r6 = r0.A03
            X.1ip r5 = r0.A07
            X.2Ha r4 = r0.A08
            int r28 = java.lang.Integer.parseInt(r1)
            X.9Qk r3 = new X.9Qk
            r3.<init>(r2)
            X.9A1 r1 = new X.9A1
            r20 = r11
            r21 = r12
            r22 = r8
            r23 = r13
            r15 = r4
            r16 = r9
            r17 = r7
            r18 = r10
            r19 = r3
            r10 = r1
            r11 = r0
            r12 = r14
            r13 = r5
            r14 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.String r0 = "PAY: BrazilUpdateMerchantAccountAction updateMerchant"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4FS r9 = r1.A09
        L_0x0c26:
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
        L_0x0c29:
            r9.BkL(r1, r0)
            return
        L_0x0c2d:
            java.util.HashMap r1 = X.AnonymousClass001.A0t()
            java.lang.String r0 = "on_failure"
            r2.A01(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPayBloksActivity.Bgl(X.2m3, java.lang.String, java.util.Map):void");
    }

    public BrazilPayBloksActivity() {
        this(0);
        this.A01 = null;
        this.A0P = null;
        this.A04 = null;
    }
}
