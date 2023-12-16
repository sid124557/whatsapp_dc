package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.3Sh  reason: invalid class name and case insensitive filesystem */
public final class C68213Sh implements AnonymousClass4EZ {
    public final C48402eq A00;
    public final C56612sH A01;
    public final AnonymousClass31C A02;

    public void BSN(AnonymousClass36K r8, String str) {
        long A0B;
        TimeUnit timeUnit;
        long j;
        C162457s7.A0J(r8, 1);
        int A012 = C57492tj.A01(r8);
        C48402eq r6 = this.A00;
        if (A012 == 404) {
            r6.A01(-1);
            return;
        }
        int A022 = C18280x3.A02(r6.A00(), "biz_block_reasons_api_back_off_days");
        if (A022 == 0) {
            r6.A01(1);
            A0B = this.A01.A0H();
            timeUnit = TimeUnit.DAYS;
            j = 1;
        } else if (1 <= A022 && A022 < 16) {
            r6.A01(A022 * 2);
            A0B = AnonymousClass0x2.A0B(r6.A00(), "biz_block_reasons_api_cooling_timestamp");
            timeUnit = TimeUnit.DAYS;
            j = (long) A022;
        } else {
            return;
        }
        C18270x1.A0i(r6.A00().edit(), "biz_block_reasons_api_cooling_timestamp", A0B + timeUnit.toMillis(j));
    }

    public void BdM(AnonymousClass36K r12, String str) {
        String A0n;
        C162457s7.A0J(r12, 1);
        AnonymousClass36K A0l = r12.A0l("mobile_config");
        if (A0l != null) {
            AnonymousClass36K A0l2 = A0l.A0l("list");
            if (!(A0l2 == null || A0l2.A03 == null || !"biz_block_reasons".equals(A0l2.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null)))) {
                int A012 = C615531h.A01(A0l2.A0r("v", (String) null), 0);
                String A0r = A0l2.A0r("language", (String) null);
                if (A012 > 0 && A0r != null) {
                    List A0s = A0l2.A0s("item");
                    ArrayList A0t = C18300x5.A0t(A0s);
                    Iterator it = A0s.iterator();
                    while (it.hasNext()) {
                        AnonymousClass36K A0Y = C18310x6.A0Y(it);
                        String A0r2 = A0Y.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
                        if (!(A0r2 == null || (A0n = A0Y.A0n()) == null)) {
                            AnonymousClass3Z6.A03(A0r2, A0n, A0t);
                        }
                    }
                    Map A0B = C73813g7.A0B(A0t);
                    if (!A0B.isEmpty()) {
                        String A0r3 = A0l2.A0r("country", (String) null);
                        C48402eq r2 = this.A00;
                        C18270x1.A0h(r2.A00().edit(), "biz_block_reasons_version", A012);
                        C18270x1.A0j(r2.A00().edit(), "biz_block_reasons_language", A0r);
                        C18270x1.A0j(r2.A00().edit(), "biz_block_reasons_country", A0r3);
                        C18270x1.A0e(r2.A00().edit(), new JSONObject(A0B), "biz_block_reasons");
                    }
                }
            }
            C48402eq r0 = this.A00;
            r0.A01(0);
            C18270x1.A0i(r0.A00().edit(), "biz_block_reasons_api_cooling_timestamp", 0);
        }
    }

    public void BQs(String str) {
    }

    public C68213Sh(C48402eq r1, C56612sH r2, AnonymousClass31C r3) {
        C18260x0.A0V(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
