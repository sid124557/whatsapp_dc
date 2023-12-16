package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3XX  reason: invalid class name */
public final class AnonymousClass3XX implements C84184Bj {
    public final C39882Dr A00;
    public final C69263Wi A01;
    public final C56492s4 A02;
    public final AnonymousClass2XW A03;
    public final C29441ip A04;
    public final AnonymousClass33p A05;
    public final C66543Lv A06;
    public final AnonymousClass1VX A07;
    public final C105915Wx A08;
    public final AnonymousClass31C A09;
    public final AnonymousClass4FS A0A;

    public final void A00(Activity activity, C41182Jg r11, String str, Map map, boolean z) {
        C73793g5.A06(map);
        Activity activity2 = activity;
        this.A01.A0S(new C70793b4(activity2, this, r11, map, str, 2, z));
    }

    public void Bgk(Activity activity, C41182Jg r19, Map map) {
        Intent intent;
        Bundle extras;
        Object obj;
        boolean z;
        Activity activity2 = activity;
        if (activity != null && (intent = activity2.getIntent()) != null && (extras = intent.getExtras()) != null) {
            UserJid A082 = AnonymousClass32Y.A08(extras.getString("chat_id"));
            C41182Jg r13 = r19;
            if (A082 != null) {
                Map map2 = map;
                if (map != null && map2.containsKey("catalog_id") && map2.containsKey("retailer_ids")) {
                    Object obj2 = map2.get("retailer_ids");
                    C162457s7.A0K(obj2, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
                    List A012 = AnonymousClass360.A01(obj2);
                    String A0d = AnonymousClass0x2.A0d("catalog_id", map2);
                    Object obj3 = "360";
                    if (map2.containsKey("height")) {
                        obj = map2.get("height");
                    } else {
                        obj = obj3;
                    }
                    if (map2.containsKey("width")) {
                        obj3 = map2.get("width");
                    }
                    if (map2.containsKey("show_full_screen_error")) {
                        z = AnonymousClass0x2.A1Z(map2, "show_full_screen_error");
                    } else {
                        z = false;
                    }
                    C162457s7.A0H(A082);
                    C60852zH r11 = new C60852zH(A082, String.valueOf(obj3), String.valueOf(obj), A012);
                    if (this.A07.A0Y(C58422vE.A02, 2411)) {
                        this.A0A.BkM(new C70793b4(this, r11, activity2, r13, A0d, 1, z));
                        return;
                    }
                    C46212bG r6 = new C46212bG(activity2, r13, this, z);
                    AnonymousClass31C r5 = this.A09;
                    AnonymousClass3TO r7 = new AnonymousClass3TO(r11, this.A04, this.A08, r5, r6);
                    C162457s7.A0J(A0d, 0);
                    if (!r7.A01.A0F()) {
                        r7.A04.A00();
                        return;
                    }
                    String A032 = r7.A03.A03();
                    C105915Wx r62 = r7.A02;
                    C60852zH r4 = r7.A00;
                    ArrayList A0s = AnonymousClass001.A0s();
                    Iterator it = r4.A04.iterator();
                    while (it.hasNext()) {
                        AnonymousClass36K.A0O(new AnonymousClass36K("retailer_id", AnonymousClass001.A0m(it), (AnonymousClass39V[]) null), "product", A0s, (AnonymousClass39V[]) null);
                    }
                    AnonymousClass36K.A0P("width", r4.A03, A0s);
                    AnonymousClass36K.A0P("height", r4.A02, A0s);
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    AnonymousClass36K.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0d, A0s2);
                    AnonymousClass36K.A0S("catalog", A0s, (AnonymousClass39V[]) null, C18280x3.A1a(A0s2, 0));
                    AnonymousClass39V[] r2 = new AnonymousClass39V[1];
                    AnonymousClass39V.A02(r4.A01, "jid", r2, 0);
                    AnonymousClass36K A0J = AnonymousClass36K.A0J("product_list", r2, C18280x3.A1a(A0s, 0));
                    AnonymousClass39V[] r3 = new AnonymousClass39V[5];
                    AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, r3, 0);
                    AnonymousClass39V.A0C("xmlns", "w:biz:catalog", r3, 1, 2);
                    r3[3] = new AnonymousClass39V("smax_id", 24);
                    r3[4] = AnonymousClass39V.A00();
                    r62.A02(r7, AnonymousClass36K.A0G(A0J, r3), A032, 196);
                    return;
                }
            }
            A00(activity2, r13, "error", C72043d5.A00(), true);
        }
    }

    public AnonymousClass3XX(C39882Dr r2, C69263Wi r3, C56492s4 r4, AnonymousClass2XW r5, C29441ip r6, AnonymousClass33p r7, C66543Lv r8, AnonymousClass1VX r9, C105915Wx r10, AnonymousClass31C r11, AnonymousClass4FS r12) {
        C18260x0.A0f(r5, r12, r8, r3, r11);
        C18260x0.A0g(r6, r9, r4, r2, r10);
        C162457s7.A0J(r7, 11);
        this.A03 = r5;
        this.A0A = r12;
        this.A06 = r8;
        this.A01 = r3;
        this.A09 = r11;
        this.A04 = r6;
        this.A07 = r9;
        this.A02 = r4;
        this.A00 = r2;
        this.A08 = r10;
        this.A05 = r7;
    }
}
