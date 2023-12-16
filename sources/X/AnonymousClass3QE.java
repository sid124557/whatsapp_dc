package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.3QE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3QE implements C182538oa {
    public final /* synthetic */ C102275If A00;
    public final /* synthetic */ C32441qP A01;
    public final /* synthetic */ String A02;

    public final C161997qy BkH(AnonymousClass7US r14) {
        C102275If r4 = this.A00;
        String str = this.A02;
        C32441qP r5 = this.A01;
        C102665Ju r0 = new C102665Ju();
        if (str != null) {
            boolean z = r5.A06;
            C626936e.A0D(z, "Should only set final hash for streaming uploads");
            r5.A00 = C107575bX.A0A(str);
            C626936e.A0D(z, "Should only finalize for streaming uploads");
            C626936e.A0D(AnonymousClass000.A1W(r5.A00), "Must set final hash before finalizing streaming upload");
            Uri.Builder A022 = r5.A02(r14);
            A022.appendQueryParameter("final_hash", r5.A00);
            String A0f = C18300x5.A0f(A022);
            C614230q A002 = r4.A01.A00(new AnonymousClass4JV(r0, 3, r4), A0f, (String) null, 0, AnonymousClass000.A1T(r14.A00));
            try {
                int A03 = A002.A03(r14);
                String str2 = A002.A03;
                long j = A002.A00;
                long j2 = A002.A01;
                r0.A01 = new C102655Jt(A002.A02, str2, j, j2, (long) A03);
                C18260x0.A0w("mediaupload/finalizeupload/got responseCode=", AnonymousClass001.A0o(), A03);
                r0.A00 = A03;
                if (A03 == 200) {
                    r0.A04 = true;
                }
            } catch (IOException e) {
                Log.e("Error while finalizing upload", e);
            }
        }
        if (r0.A04) {
            return C161997qy.A02(r0);
        }
        return C161997qy.A03(r0, r0.A00);
    }

    public /* synthetic */ AnonymousClass3QE(C102275If r1, C32441qP r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }
}
