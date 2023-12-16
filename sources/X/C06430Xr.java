package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Xr  reason: invalid class name and case insensitive filesystem */
public class C06430Xr {
    public final int A00;
    public final int A01;
    public final C48602fA A02;
    public final List A03;

    public static final int A01(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("backup_version")) {
            try {
                return jSONObject.getInt("backup_version");
            } catch (JSONException e) {
                Log.w("BackupExpiryManager/getBackupVersion/failed to parse version from json", e);
            }
        }
        return 0;
    }

    public static final boolean A04(C130766cV r3, String str) {
        if (r3 != null) {
            switch (str.hashCode()) {
                case -1879012827:
                    if (str.equals("payment_transaction")) {
                        return r3.A0o();
                    }
                    break;
                case -1696390154:
                    if (str.equals("migration_jid_store")) {
                        return r3.A0l();
                    }
                    break;
                case -1617991306:
                    if (str.equals("media_migration_fixer")) {
                        return true;
                    }
                    break;
                case -1372203662:
                    if (str.equals("receipt_user")) {
                        return r3.A0t();
                    }
                    break;
                case -1286318798:
                    if (str.equals("message_link")) {
                        return r3.A0X();
                    }
                    break;
                case -1286296847:
                    if (str.equals("message_main")) {
                        return r3.A0Z();
                    }
                    break;
                case -1286083995:
                    if (str.equals("message_text")) {
                        return r3.A0h();
                    }
                    break;
                case -1220382292:
                    if (str.equals("message_media")) {
                        return r3.A0b();
                    }
                    break;
                case -1212132786:
                    if (str.equals("message_vcard")) {
                        return r3.A0j();
                    }
                    break;
                case -1003755283:
                    if (str.equals("message_location")) {
                        return r3.A0Y();
                    }
                    break;
                case -872783571:
                    if (str.equals("message_fts")) {
                        return r3.A0V();
                    }
                    break;
                case -738045655:
                    if (str.equals("blank_me_jid")) {
                        return r3.A0Q();
                    }
                    break;
                case -631883203:
                    if (str.equals("receipt_device")) {
                        return r3.A0s();
                    }
                    break;
                case -537381604:
                    if (str.equals("broadcast_me_jid")) {
                        return r3.A0R();
                    }
                    break;
                case -266421354:
                    if (str.equals("alter_message_ephemeral_setting_to_message_ephemeral_setting_remove_column")) {
                        return r3.A0O();
                    }
                    break;
                case -251736654:
                    if (str.equals("message_mention")) {
                        return r3.A0c();
                    }
                    break;
                case -228245188:
                    if (str.equals("quoted_order_message_v2")) {
                        return r3.A0q();
                    }
                    break;
                case -172298781:
                    if (str.equals("call_log")) {
                        return r3.A0S();
                    }
                    break;
                case -136111098:
                    if (str.equals("message_frequent")) {
                        return r3.A0U();
                    }
                    break;
                case -101944730:
                    if (str.equals("message_revoked")) {
                        return r3.A0e();
                    }
                    break;
                case -38832335:
                    if (str.equals("missed_calls")) {
                        return r3.A0m();
                    }
                    break;
                case 320355671:
                    if (str.equals("participant_user")) {
                        return r3.A0n();
                    }
                    break;
                case 491179391:
                    if (str.equals("quoted_order_message")) {
                        return r3.A0p();
                    }
                    break;
                case 562095961:
                    if (str.equals("labeled_jid")) {
                        return r3.A0T();
                    }
                    break;
                case 637715707:
                    if (str.equals("message_future")) {
                        return r3.A0W();
                    }
                    break;
                case 952486048:
                    if (str.equals("message_quoted")) {
                        return r3.A0d();
                    }
                    break;
                case 1013557607:
                    if (str.equals("message_system")) {
                        return r3.A0g();
                    }
                    break;
                case 1029740752:
                    if (str.equals("message_send_count")) {
                        return r3.A0f();
                    }
                    break;
                case 1395058782:
                    if (str.equals("quoted_ui_elements_reply_message")) {
                        return r3.A0r();
                    }
                    break;
                case 1476079284:
                    if (str.equals("message_thumbnail")) {
                        return r3.A0i();
                    }
                    break;
                case 1580832246:
                    if (str.equals("alter_message_ephemeral_to_message_ephemeral_remove_column")) {
                        return r3.A0P();
                    }
                    break;
                case 1761584297:
                    if (str.equals("message_main_verification")) {
                        return r3.A0a();
                    }
                    break;
                case 2085446219:
                    if (str.equals("migration_chat_store")) {
                        return r3.A0k();
                    }
                    break;
            }
        }
        return false;
    }

    public static final int A00(C130766cV r1) {
        if (r1 == null || !r1.A0u()) {
            return 0;
        }
        return r1.A0M();
    }

    public static C06430Xr A02(C48602fA r2, AnonymousClass1VX r3) {
        boolean A0X = r3.A0X(2668);
        return new C06430Xr(r2, A0X ? 1 : 0, A0X);
    }

    public JSONObject A06() {
        boolean z;
        int i;
        JSONObject jSONObject = new JSONObject();
        Map A05 = A05();
        try {
            Iterator A0v = AnonymousClass001.A0v(A05);
            loop0:
            while (true) {
                z = true;
                while (A0v.hasNext()) {
                    Boolean bool = (Boolean) A0v.next();
                    if (!z || !bool.booleanValue()) {
                        z = false;
                    }
                }
                break loop0;
            }
            if (z) {
                i = 1;
            } else {
                i = this.A00;
            }
            jSONObject.put("backup_version", i);
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                Object obj = A05.get(A0m);
                C626936e.A06(obj);
                jSONObject.put(A0m, AnonymousClass001.A1Z(obj));
            }
        } catch (JSONException e) {
            Log.e("BackupExpiryManager/getGoogleBackupJsonMetadata failed to create json", e);
        }
        return jSONObject;
    }

    public final boolean A0A(int i) {
        if (i >= this.A01) {
            return true;
        }
        Log.w("BackupExpiryManager/backup expired based on version");
        return false;
    }

    public C06430Xr(C48602fA r3, int i, int i2) {
        this.A02 = r3;
        this.A01 = i;
        this.A00 = i2;
        ArrayList A0s = AnonymousClass001.A0s();
        this.A03 = A0s;
        A0s.add("call_log");
        A0s.add("labeled_jid");
        A0s.add("message_fts");
        A0s.add("blank_me_jid");
        A0s.add("message_link");
        A0s.add("message_main");
        A0s.add("message_text");
        A0s.add("missed_calls");
        A0s.add("receipt_user");
        A0s.add("message_media");
        A0s.add("message_vcard");
        A0s.add("message_future");
        A0s.add("message_quoted");
        A0s.add("message_system");
        A0s.add("receipt_device");
        A0s.add("message_mention");
        A0s.add("message_revoked");
        A0s.add("broadcast_me_jid");
        A0s.add("message_frequent");
        A0s.add("message_location");
        A0s.add("participant_user");
        A0s.add("message_thumbnail");
        A0s.add("message_send_count");
        A0s.add("migration_jid_store");
        A0s.add("payment_transaction");
        A0s.add("migration_chat_store");
        A0s.add("quoted_order_message");
        A0s.add("quoted_order_message_v2");
        A0s.add("message_main_verification");
        A0s.add("quoted_ui_elements_reply_message");
        A0s.add("alter_message_ephemeral_to_message_ephemeral_remove_column");
        A0s.add("alter_message_ephemeral_setting_to_message_ephemeral_setting_remove_column");
    }

    public static final boolean A03(C48602fA r0, String str) {
        AnonymousClass31D A022 = r0.A02(str);
        if (A022 == null || A022.A0A() != 1) {
            return false;
        }
        return true;
    }

    public final Map A05() {
        HashMap A0t = AnonymousClass001.A0t();
        C48602fA r4 = this.A02;
        AnonymousClass000.A1C("call_log", A0t, A03(r4, "call_log"));
        AnonymousClass000.A1C("labeled_jid", A0t, A03(r4, "labeled_jid"));
        AnonymousClass000.A1C("message_fts", A0t, A03(r4, "message_fts"));
        AnonymousClass000.A1C("blank_me_jid", A0t, A03(r4, "blank_me_jid"));
        AnonymousClass000.A1C("message_link", A0t, A03(r4, "message_link"));
        AnonymousClass000.A1C("message_main", A0t, A03(r4, "message_main"));
        AnonymousClass000.A1C("message_text", A0t, A03(r4, "message_text"));
        AnonymousClass000.A1C("missed_calls", A0t, A03(r4, "missed_calls"));
        AnonymousClass000.A1C("receipt_user", A0t, A03(r4, "receipt_user"));
        AnonymousClass000.A1C("message_media", A0t, A03(r4, "message_media"));
        AnonymousClass000.A1C("message_vcard", A0t, A03(r4, "message_vcard"));
        AnonymousClass000.A1C("message_future", A0t, A03(r4, "message_future"));
        AnonymousClass000.A1C("message_quoted", A0t, A03(r4, "message_quoted"));
        AnonymousClass000.A1C("message_system", A0t, A03(r4, "message_system"));
        AnonymousClass000.A1C("receipt_device", A0t, A03(r4, "receipt_device"));
        AnonymousClass000.A1C("message_mention", A0t, A03(r4, "message_mention"));
        AnonymousClass000.A1C("message_revoked", A0t, A03(r4, "message_revoked"));
        AnonymousClass000.A1C("broadcast_me_jid", A0t, A03(r4, "broadcast_me_jid"));
        AnonymousClass000.A1C("message_frequent", A0t, A03(r4, "message_frequent"));
        AnonymousClass000.A1C("message_location", A0t, A03(r4, "message_location"));
        AnonymousClass000.A1C("participant_user", A0t, A03(r4, "participant_user"));
        Boolean bool = Boolean.TRUE;
        A0t.put("message_thumbnail", bool);
        AnonymousClass000.A1C("message_send_count", A0t, A03(r4, "message_send_count"));
        AnonymousClass000.A1C("migration_jid_store", A0t, A03(r4, "migration_jid_store"));
        AnonymousClass000.A1C("payment_transaction", A0t, A03(r4, "payment_transaction"));
        AnonymousClass000.A1C("migration_chat_store", A0t, A03(r4, "migration_chat_store"));
        A0t.put("quoted_order_message", bool);
        AnonymousClass000.A1C("quoted_order_message_v2", A0t, A03(r4, "quoted_order_message_v2"));
        A0t.put("message_main_verification", bool);
        AnonymousClass000.A1C("quoted_ui_elements_reply_message", A0t, A03(r4, "quoted_ui_elements_reply_message"));
        A0t.put("alter_message_ephemeral_to_message_ephemeral_remove_column", bool);
        A0t.put("alter_message_ephemeral_setting_to_message_ephemeral_setting_remove_column", bool);
        return A0t;
    }

    public void A07(C130536c8 r5) {
        boolean z;
        int i;
        Map A05 = A05();
        Iterator A0v = AnonymousClass001.A0v(A05);
        loop0:
        while (true) {
            z = true;
            while (true) {
                if (!A0v.hasNext()) {
                    break loop0;
                }
                Boolean bool = (Boolean) A0v.next();
                if (!z || !bool.booleanValue()) {
                    z = false;
                }
            }
        }
        if (z) {
            i = 1;
        } else {
            i = this.A00;
        }
        r5.A0E(i);
        Object obj = A05.get("call_log");
        C626936e.A06(obj);
        r5.A0I(AnonymousClass001.A1Z(obj));
        Object obj2 = A05.get("labeled_jid");
        C626936e.A06(obj2);
        r5.A0K(AnonymousClass001.A1Z(obj2));
        Object obj3 = A05.get("message_fts");
        C626936e.A06(obj3);
        r5.A0M(AnonymousClass001.A1Z(obj3));
        Object obj4 = A05.get("blank_me_jid");
        C626936e.A06(obj4);
        r5.A0G(AnonymousClass001.A1Z(obj4));
        Object obj5 = A05.get("message_link");
        C626936e.A06(obj5);
        r5.A0O(AnonymousClass001.A1Z(obj5));
        Object obj6 = A05.get("message_main");
        C626936e.A06(obj6);
        r5.A0Q(AnonymousClass001.A1Z(obj6));
        Object obj7 = A05.get("message_text");
        C626936e.A06(obj7);
        r5.A0X(AnonymousClass001.A1Z(obj7));
        Object obj8 = A05.get("missed_calls");
        C626936e.A06(obj8);
        r5.A0c(AnonymousClass001.A1Z(obj8));
        Object obj9 = A05.get("receipt_user");
        C626936e.A06(obj9);
        r5.A0j(AnonymousClass001.A1Z(obj9));
        Object obj10 = A05.get("message_media");
        C626936e.A06(obj10);
        r5.A0R(AnonymousClass001.A1Z(obj10));
        Object obj11 = A05.get("message_vcard");
        C626936e.A06(obj11);
        r5.A0Z(AnonymousClass001.A1Z(obj11));
        Object obj12 = A05.get("message_future");
        C626936e.A06(obj12);
        r5.A0N(AnonymousClass001.A1Z(obj12));
        Object obj13 = A05.get("message_quoted");
        C626936e.A06(obj13);
        r5.A0T(AnonymousClass001.A1Z(obj13));
        Object obj14 = A05.get("message_system");
        C626936e.A06(obj14);
        r5.A0W(AnonymousClass001.A1Z(obj14));
        Object obj15 = A05.get("receipt_device");
        C626936e.A06(obj15);
        r5.A0i(AnonymousClass001.A1Z(obj15));
        Object obj16 = A05.get("message_mention");
        C626936e.A06(obj16);
        r5.A0S(AnonymousClass001.A1Z(obj16));
        Object obj17 = A05.get("message_revoked");
        C626936e.A06(obj17);
        r5.A0U(AnonymousClass001.A1Z(obj17));
        Object obj18 = A05.get("broadcast_me_jid");
        C626936e.A06(obj18);
        r5.A0H(AnonymousClass001.A1Z(obj18));
        Object obj19 = A05.get("message_frequent");
        C626936e.A06(obj19);
        r5.A0L(AnonymousClass001.A1Z(obj19));
        Object obj20 = A05.get("message_location");
        C626936e.A06(obj20);
        r5.A0P(AnonymousClass001.A1Z(obj20));
        Object obj21 = A05.get("participant_user");
        C626936e.A06(obj21);
        r5.A0d(AnonymousClass001.A1Z(obj21));
        Object obj22 = A05.get("message_thumbnail");
        C626936e.A06(obj22);
        r5.A0Y(AnonymousClass001.A1Z(obj22));
        Object obj23 = A05.get("message_send_count");
        C626936e.A06(obj23);
        r5.A0V(AnonymousClass001.A1Z(obj23));
        Object obj24 = A05.get("migration_jid_store");
        C626936e.A06(obj24);
        r5.A0b(AnonymousClass001.A1Z(obj24));
        Object obj25 = A05.get("payment_transaction");
        C626936e.A06(obj25);
        r5.A0e(AnonymousClass001.A1Z(obj25));
        Object obj26 = A05.get("migration_chat_store");
        C626936e.A06(obj26);
        r5.A0a(AnonymousClass001.A1Z(obj26));
        Object obj27 = A05.get("quoted_order_message");
        C626936e.A06(obj27);
        r5.A0f(AnonymousClass001.A1Z(obj27));
        r5.A0C();
        Object obj28 = A05.get("quoted_order_message_v2");
        C626936e.A06(obj28);
        r5.A0g(AnonymousClass001.A1Z(obj28));
        r5.A0D();
        Object obj29 = A05.get("quoted_ui_elements_reply_message");
        C626936e.A06(obj29);
        r5.A0h(AnonymousClass001.A1Z(obj29));
        r5.A0A();
        r5.A09();
    }

    public final void A08(C130766cV r4) {
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            A09(r4, AnonymousClass001.A0m(it), A0t);
        }
    }

    public final void A09(C130766cV r2, String str, Map map) {
        map.put(str, Boolean.valueOf(A04(r2, str)));
    }

    public boolean A0B(C130766cV r2) {
        int A002 = A00(r2);
        A08(r2);
        return A0A(A002);
    }

    public boolean A0C(File file) {
        return A0B(C06550Ye.A06(file));
    }

    public boolean A0D(JSONObject jSONObject) {
        boolean z;
        int A012 = A01(jSONObject);
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (jSONObject != null) {
                try {
                    if (jSONObject.has(A0m)) {
                        z = true;
                        if (jSONObject.getBoolean(A0m)) {
                            AnonymousClass000.A1C(A0m, A0t, z);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            z = false;
            AnonymousClass000.A1C(A0m, A0t, z);
        }
        return A0A(A012);
    }
}
