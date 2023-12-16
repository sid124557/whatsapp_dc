package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import java.util.Map;
import javax.crypto.SecretKey;
import org.json.JSONObject;

/* renamed from: X.3XW  reason: invalid class name */
public final class AnonymousClass3XW implements C84184Bj {
    public final C59062wH A00;
    public final C69263Wi A01;
    public final AnonymousClass2XW A02;
    public final C60032xt A03;
    public final C56612sH A04;
    public final C66543Lv A05;
    public final C57262tM A06;
    public final C59652xG A07;
    public final AnonymousClass1VX A08;
    public final AnonymousClass4FS A09;
    public final C49702gx A0A;

    public void Bgk(Activity activity, C41182Jg r44, Map map) {
        Intent intent;
        Bundle extras;
        String str;
        byte[] bArr;
        boolean z;
        boolean z2;
        Activity activity2 = activity;
        if (activity != null && (intent = activity2.getIntent()) != null && (extras = intent.getExtras()) != null) {
            String string = extras.getString("chat_id");
            UserJid A082 = AnonymousClass32Y.A08(string);
            String string2 = extras.getString("flow_token");
            String string3 = extras.getString("flow_message_version");
            String string4 = extras.getString("flow_id");
            String string5 = extras.getString("flow_data_endpoint");
            SecretKey A15 = C18290x4.A15();
            byte[] A012 = AnonymousClass29O.A01(16);
            C162457s7.A0H(A15);
            C162457s7.A0J(A15, 1);
            String string6 = extras.getString("user_locale");
            if (string3 != null && string != null && A082 != null && string2 != null && string4 != null && string6 != null) {
                Map map2 = map;
                if (map != null && map2.containsKey("business_payload") && map2.containsKey("client_params")) {
                    Object obj = map2.get("business_payload");
                    C162457s7.A0K(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Any, kotlin.Any>");
                    Map A022 = AnonymousClass360.A02(obj);
                    A022.put("flow_token", string2);
                    Map A023 = AnonymousClass360.A02(AnonymousClass0x9.A0s("client_params", "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Any, kotlin.Any>", map2));
                    Object obj2 = A022.get("version");
                    if (obj2 instanceof String) {
                        str = (String) obj2;
                    } else {
                        str = null;
                    }
                    AnonymousClass1VX r2 = this.A08;
                    if (!r2.A0Y(C58422vE.A02, 5374) || "100".equalsIgnoreCase(str)) {
                        A022.put("user_locale", string6);
                    }
                    if (str == null || "100".equalsIgnoreCase(str)) {
                        bArr = A012;
                    } else {
                        bArr = new byte[16];
                        int i = 0;
                        do {
                            bArr[i] = (byte) (~A012[i]);
                            i++;
                        } while (i < 16);
                    }
                    if (A023.containsKey("show_loading")) {
                        z = C18280x3.A1Y(A023, "show_loading");
                    } else {
                        z = false;
                    }
                    if (A023.containsKey("show_full_screen_error")) {
                        z2 = C18280x3.A1Y(A023, "show_full_screen_error");
                    } else {
                        z2 = false;
                    }
                    ((C84734Dm) activity2).Bnc(z);
                    JSONObject jSONObject = new JSONObject(A022);
                    AnonymousClass2XW r8 = this.A02;
                    String A0o = C18290x4.A0o(jSONObject);
                    C49702gx r9 = this.A0A;
                    C59062wH r14 = this.A00;
                    C69263Wi r15 = this.A01;
                    AnonymousClass4FS r7 = this.A09;
                    C66543Lv r6 = this.A05;
                    C59652xG r5 = this.A07;
                    C56612sH r4 = this.A04;
                    r9.A01(new AnonymousClass3MF(activity2, r14, r15, r8, r44, this.A03, r4, r6, r5, r2, r7, r9, string3, string5, string4, A0o, A15, bArr, true, z2), A082, C18290x4.A0o(jSONObject), string3, "UNKNOWN", A15, A012, false, false, false);
                }
            }
        }
    }

    public AnonymousClass3XW(C59062wH r2, C69263Wi r3, AnonymousClass2XW r4, C60032xt r5, C56612sH r6, C66543Lv r7, C57262tM r8, C59652xG r9, AnonymousClass1VX r10, AnonymousClass4FS r11, C49702gx r12) {
        C18260x0.A0f(r4, r11, r7, r3, r2);
        AnonymousClass0x2.A1B(r10, r9);
        C162457s7.A0J(r6, 9);
        C162457s7.A0J(r8, 11);
        this.A02 = r4;
        this.A09 = r11;
        this.A05 = r7;
        this.A01 = r3;
        this.A00 = r2;
        this.A0A = r12;
        this.A08 = r10;
        this.A07 = r9;
        this.A04 = r6;
        this.A03 = r5;
        this.A06 = r8;
    }
}
