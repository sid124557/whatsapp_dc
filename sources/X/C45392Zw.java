package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2Zw  reason: invalid class name and case insensitive filesystem */
public final class C45392Zw {
    public final C621033m A00;
    public final C64773Ex A01;
    public final C613330g A02;

    public final void A00(Context context, C95804uY r20, String str, String str2, HashMap hashMap) {
        byte[] bArr;
        C95804uY r8 = r20;
        String str3 = str2;
        C18270x1.A11(r8, 1, str3);
        Bitmap A03 = this.A02.A03(context, this.A01.A0A(r8), 0.0f, 96, false);
        if (A03 != null) {
            bArr = C18320x8.A1Y(A03, AnonymousClass0x9.A0e());
        } else {
            bArr = null;
        }
        C621033m r3 = this.A00;
        Log.d("UserActions/userActionSendNewsletterAdminInviteMessages");
        Iterator A0u = AnonymousClass001.A0u(hashMap);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            String str4 = str;
            C30381mM r7 = new C30381mM(r8, r3.A1X.A04(C18320x8.A0N(A0w), true), str4, str3, r3.A0V.A0H(), ((Number) A0w.getValue()).longValue());
            r7.A02 = 1;
            if (bArr != null) {
                C614630w A0y = r7.A0y();
                C626936e.A06(A0y);
                A0y.A03(bArr);
            }
            r3.A0O(r7);
            r3.A0l.A0V(r7);
        }
    }

    public C45392Zw(C621033m r1, C64773Ex r2, C613330g r3) {
        C18260x0.A0V(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
