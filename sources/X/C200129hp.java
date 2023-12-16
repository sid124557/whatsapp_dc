package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9hp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200129hp implements Runnable {
    public final /* synthetic */ C149897Oi A00;
    public final /* synthetic */ C193719Ps A01;

    public final void run() {
        String str;
        C193719Ps r2 = this.A01;
        String A04 = this.A00.A02.A04();
        if (A04 != null) {
            List list = r2.A04;
            list.add(A04);
            int size = list.size();
            List list2 = r2.A05;
            if (size == list2.size()) {
                BrazilPayBloksActivity brazilPayBloksActivity = r2.A02;
                String str2 = r2.A03;
                C52792m3 r13 = r2.A01;
                C165897xo A042 = brazilPayBloksActivity.A0A.A04();
                if (A042 == null || (str = A042.A00.A01) == null) {
                    brazilPayBloksActivity.A7C(r13);
                    return;
                }
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String A0m = AnonymousClass001.A0m(it);
                    AnonymousClass39V[] r1 = new AnonymousClass39V[2];
                    AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2, r1, 0);
                    AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0m, r1, 1);
                    A0s.add(AnonymousClass36K.A0I("document", r1));
                }
                AnonymousClass39V[] r3 = new AnonymousClass39V[2];
                AnonymousClass39V.A0B("action", "document-upload-step-up-challenge", r3, 0);
                AnonymousClass39V.A0B("challenge_id", str, r3, 1);
                AnonymousClass36K r22 = new AnonymousClass36K("account", r3, C18280x3.A1a(A0s, 0));
                brazilPayBloksActivity.A0C.A0E(new C203899oU(brazilPayBloksActivity, brazilPayBloksActivity.A08, brazilPayBloksActivity.A05, brazilPayBloksActivity, r13, 24), r22, "set");
                return;
            }
            String str3 = r2.A03;
            r2.A02.A7F(r2.A01, str3, list2, list, r2.A00 + 1);
            return;
        }
        r2.A02.A7C(r2.A01);
    }

    public /* synthetic */ C200129hp(C149897Oi r1, C193719Ps r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
