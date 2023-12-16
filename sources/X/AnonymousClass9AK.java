package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.ArrayList;

/* renamed from: X.9AK  reason: invalid class name */
public class AnonymousClass9AK extends AnonymousClass9OC {
    public AnonymousClass9U1 A00;
    public final Context A01;
    public final C69263Wi A02;
    public final C617332a A03;
    public final AnonymousClass31C A04;
    public final C40602Ha A05;
    public final AnonymousClass9U5 A06;
    public final C194389Sr A07;
    public final String A08;

    public AnonymousClass9AK(Context context, C69263Wi r3, C617332a r4, AnonymousClass31C r5, AnonymousClass9U1 r6, C40602Ha r7, AnonymousClass9U5 r8, C194389Sr r9, C194259Se r10) {
        super(r6.A04, r8);
        this.A01 = context;
        this.A02 = r3;
        this.A04 = r5;
        this.A08 = r10.A01();
        this.A00 = r6;
        this.A06 = r8;
        this.A07 = r9;
        this.A03 = r4;
        this.A05 = r7;
    }

    public final void A00(C166557yt r4, C166557yt r5, AnonymousClass4EY r6, String str, String str2) {
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A03("action", "upi-remove-credential", A0s);
        AnonymousClass39V.A03("vpa", C1899693i.A0e(r4), A0s);
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass39V.A03("vpa-id", str, A0s);
        }
        AnonymousClass39V.A03("upi-bank-info", (String) C1899593h.A0X(r5), A0s);
        AnonymousClass39V.A03("device-id", this.A08, A0s);
        AnonymousClass39V.A03("credential-id", str2, A0s);
        this.A06.A0A(r6, C1899593h.A0T(A0s));
    }

    public void A01(C166557yt r4, C166557yt r5, AnonymousClass4EY r6, String str, String str2, boolean z, boolean z2) {
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A03("action", "upi-edit-default-credential", A0s);
        AnonymousClass39V.A03("vpa", C1899693i.A0e(r4), A0s);
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass39V.A03("vpa-id", str, A0s);
        }
        AnonymousClass39V.A03("upi-bank-info", (String) C1899593h.A0X(r5), A0s);
        AnonymousClass39V.A03("device-id", this.A08, A0s);
        AnonymousClass39V.A03("credential-id", str2, A0s);
        AnonymousClass39V.A03(CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, Integer.toString(z ? 1 : 0), A0s);
        AnonymousClass39V.A03("default-debit-p2m", Integer.toString(z2 ? 1 : 0), A0s);
        this.A06.A0B(r6, C1899593h.A0T(A0s));
    }
}
