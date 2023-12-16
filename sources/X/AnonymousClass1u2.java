package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1u2  reason: invalid class name */
public final class AnonymousClass1u2 extends AnonymousClass5ZM {
    public final /* synthetic */ C166587yw A00;
    public final /* synthetic */ AnonymousClass39L A01;
    public final /* synthetic */ AnonymousClass99L A02;
    public final /* synthetic */ AnonymousClass1jH A03;
    public final /* synthetic */ C30481mW A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public AnonymousClass1u2(C166587yw r1, AnonymousClass39L r2, AnonymousClass99L r3, AnonymousClass1jH r4, C30481mW r5, String str, String str2, boolean z) {
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = str;
        this.A07 = z;
        this.A05 = str2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass9U5 r1 = this.A03.A04;
        C30481mW r7 = this.A04;
        AnonymousClass39L r0 = this.A01;
        return r1.A02(r0.A01, r0.A02, this.A00, this.A02, (AnonymousClass39R) null, r7, (String) null, this.A06, this.A07);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        HashMap A0t;
        String str;
        String str2;
        String str3;
        String str4;
        AnonymousClass1S4 r1;
        AbstractCollection abstractCollection;
        C42392Nx r10;
        Jid jid;
        Jid jid2;
        Jid jid3;
        C624034w r14 = (C624034w) obj;
        if (r14 != null) {
            AnonymousClass1jH r0 = this.A03;
            String str5 = this.A05;
            C44532Wk r2 = r0.A05;
            Object obj2 = r0.A08.get();
            C162457s7.A0D(obj2);
            synchronized (r2) {
                r2.A00.put(str5, obj2);
            }
        }
        AnonymousClass1jH r4 = this.A03;
        String str6 = null;
        if (r14 == null) {
            AnonymousClass4DK r02 = r4.A00;
            if (r02 == null) {
                throw C18270x1.A0S("resourceResultCallback");
            }
            r4.A05(r02, "send_payment_failed", "send payment failed");
            return;
        }
        synchronized (r14) {
            A0t = AnonymousClass001.A0t();
            A0t.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r14.A0K);
            A0t.put("msg_key_remote_id", r14.A0C);
            AnonymousClass000.A1C("msg_key_from_me", A0t, r14.A0Q);
            A0t.put("msg_key_id", r14.A0L);
            AnonymousClass0x2.A1I("status", A0t, r14.A02);
            AnonymousClass0x2.A1I(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0t, r14.A03);
            AnonymousClass0x2.A1J("updateTs", A0t, r14.A06);
            A0t.put("error_code", r14.A0J);
            A0t.put("sender", r14.A0E);
            A0t.put("receiver", r14.A0D);
            A0t.put("credential_id", r14.A0H);
            A0t.put("methods", r14.A0N);
            A0t.put("reqMsgKeyId", r14.A0M);
            A0t.put("metadata", r14.A0A);
            A0t.put("country", r14.A0G);
            AnonymousClass0x2.A1I("version", A0t, r14.A04);
            AnonymousClass000.A1C("interop", A0t, r14.A0P);
            A0t.put("background", r14.A0B);
            AnonymousClass0x2.A1I("purchase_initiator", A0t, r14.A00);
        }
        Object obj3 = A0t.get("msg_key_remote_id");
        if (!(obj3 instanceof C95814uZ) || (jid3 = (Jid) obj3) == null) {
            str = null;
        } else {
            str = jid3.getRawString();
        }
        A0t.put("msg_key_remote_id", str);
        Object obj4 = A0t.get("sender");
        if (!(obj4 instanceof UserJid) || (jid2 = (Jid) obj4) == null) {
            str2 = null;
        } else {
            str2 = jid2.getRawString();
        }
        A0t.put("sender", str2);
        Object obj5 = A0t.get("receiver");
        if (!(obj5 instanceof UserJid) || (jid = (Jid) obj5) == null) {
            str3 = null;
        } else {
            str3 = jid.getRawString();
        }
        A0t.put("receiver", str3);
        Object obj6 = A0t.get("methods");
        if (!(obj6 instanceof ArrayList) || (abstractCollection = (AbstractCollection) obj6) == null) {
            str4 = null;
        } else {
            JSONArray A1F = AnonymousClass0x9.A1F();
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if ((next instanceof C42392Nx) && (r10 = (C42392Nx) next) != null) {
                    JSONObject A1G = AnonymousClass0x9.A1G();
                    A1G.put("amount", r10.A02.A01());
                    A1G.put("src_or_dst", r10.A00);
                    A1G.put("credential_id", r10.A01.A0A);
                    A1F.put(A1G);
                }
            }
            str4 = C18290x4.A0o(A1F);
        }
        A0t.put("methods", str4);
        Object obj7 = A0t.get("metadata");
        if ((obj7 instanceof AnonymousClass99L) && (r1 = (AnonymousClass1S4) obj7) != null) {
            str6 = r1.A0N();
        }
        A0t.put("metadata", str6);
        AnonymousClass4DK r42 = r4.A00;
        if (r42 == null) {
            throw C18270x1.A0S("resourceResultCallback");
        }
        LinkedHashMap A0r = C18320x8.A0r();
        Iterator A0u = AnonymousClass001.A0u(A0t);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            if (A0w.getValue() != null) {
                C18270x1.A1N(A0r, A0w);
            }
        }
        r42.BdH(C57692u3.A04("transaction", A0r));
    }
}
