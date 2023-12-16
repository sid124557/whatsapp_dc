package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import org.json.JSONException;

/* renamed from: X.2WU  reason: invalid class name */
public class AnonymousClass2WU {
    public final C44642Wx A00;

    public C624134x A00(C66543Lv r10, AnonymousClass1EU r11, AnonymousClass2z0 r12, long j) {
        String str;
        AnonymousClass39W A0Y;
        AnonymousClass39P r0;
        String str2;
        int i = r11.bitField1_;
        if ((i & 8) != 0) {
            AnonymousClass1ER r02 = r11.interactiveMessage_;
            if (r02 == null) {
                r02 = AnonymousClass1ER.DEFAULT_INSTANCE;
            }
            AnonymousClass1AN r03 = r02.body_;
            if (r03 == null) {
                r03 = AnonymousClass1AN.DEFAULT_INSTANCE;
            }
            str = r03.text_;
        } else if ((i & 1) != 0) {
            C21801Df r04 = r11.buttonsMessage_;
            if (r04 == null) {
                r04 = C21801Df.DEFAULT_INSTANCE;
            }
            str = r04.contentText_;
        } else {
            Log.e("MessageWithLinkStatusFactory/buildMessageWithLinkStatusMessage e2eMessage is not InteractiveMessage or ButtonsMessage");
            str = "";
        }
        C30481mW A002 = C30481mW.A00(r12, str, j);
        C95814uZ A01 = AnonymousClass2z0.A01(r12);
        try {
            String A03 = C626535y.A03(r11);
            if (A03 != null) {
                String optString = AnonymousClass0x9.A1H(A03).optString("reference_id");
                if (!C107575bX.A0F(optString)) {
                    try {
                        Iterator it = r10.A1B.A04(A01).iterator();
                        while (it.hasNext()) {
                            C624134x A0T = C18300x5.A0T(it);
                            if ((A0T instanceof AnonymousClass4DV) && (A0Y = AnonymousClass0x9.A0Y(A0T)) != null && (r0 = A0Y.A03) != null && r0.A03.size() > 0) {
                                AnonymousClass395 r7 = (AnonymousClass395) C18290x4.A0k(A0Y.A03.A03);
                                AnonymousClass398 r1 = r7.A01;
                                if ("open_webview".equals(r1.A00) && (str2 = r1.A01) != null && optString.equals(AnonymousClass0x9.A1H(str2).optString("reference_id"))) {
                                    r7.A00 = true;
                                    this.A00.A00(A002, A0T);
                                    r10.A0Y(A0T);
                                }
                            }
                        }
                    } catch (JSONException unused) {
                        Log.e("MessageWithLinkStatusFactory/updateMessageWithLinkMessageStatus can't parse button's paramsJson correctly");
                        return A002;
                    }
                }
            }
        } catch (JSONException unused2) {
            Log.e("MessageWithLinkStatusFactory/buildMessageWithLinkStatusMessage can't parse json string");
        }
        return A002;
    }

    public AnonymousClass2WU(C44642Wx r1) {
        this.A00 = r1;
    }
}
