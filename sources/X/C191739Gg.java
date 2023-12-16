package X;

import android.app.Activity;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.9Gg  reason: invalid class name and case insensitive filesystem */
public class C191739Gg extends AnonymousClass5ZM {
    public final Activity A00;
    public final C624034w A01;
    public final C202489m6 A02;
    public final /* synthetic */ C196659bX A03;

    public C191739Gg(Activity activity, C624034w r2, C196659bX r3, C202489m6 r4) {
        this.A03 = r3;
        this.A01 = r2;
        this.A02 = r4;
        this.A00 = activity;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List A07 = C166587yw.A07(C161357pU.A0F, AnonymousClass9U4.A08(this.A03.A0A));
        if (A07.size() > 0) {
            return C18290x4.A0k(A07);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C202489m6 r1;
        C166587yw r10 = (C166587yw) obj;
        if (r10 == null && (r1 = this.A02) != null) {
            r1.BZj(C1899693i.A0M());
        }
        C196659bX r3 = this.A03;
        Context context = r3.A01.A00;
        AnonymousClass1VX r7 = r3.A04;
        C69263Wi r6 = r3.A00;
        AnonymousClass31C r5 = r3.A05;
        C194259Se r4 = r3.A0C;
        AnonymousClass9U1 r2 = r3.A07;
        AnonymousClass9U5 r12 = r3.A09;
        AnonymousClass9AN r122 = new AnonymousClass9AN(context, r6, r7, r5, r2, r3.A08, r12, r4);
        C205159qW r0 = new C205159qW(this, 0);
        C624034w r22 = this.A01;
        AnonymousClass99L A0K = C1899693i.A0K(r22);
        C133796hx r02 = r10.A08;
        C626936e.A06(r02);
        AnonymousClass99H r03 = (AnonymousClass99H) r02;
        String str = r22.A0K;
        AnonymousClass39Q r23 = r22.A08;
        if (r23 == null) {
            r23 = null;
        }
        String str2 = A0K.A0Q;
        String str3 = A0K.A0R;
        String str4 = A0K.A0O;
        C166557yt r13 = r03.A06;
        Log.i("PAY: rejectCollect called");
        AnonymousClass31C r29 = r122.A03;
        String A032 = r29.A03();
        String A012 = r122.A06.A01();
        String str5 = (String) C1899593h.A0X(r13);
        AnonymousClass9IJ r62 = null;
        if (r23 != null) {
            AnonymousClass39L A002 = r122.A01.A00(AnonymousClass1S3.A05, r23);
            r62 = new AnonymousClass9IJ(new C35371wl(String.valueOf(A002.A00()), String.valueOf(A002.A00), ((AnonymousClass3H6) A002.A01).A04, 14));
        }
        AnonymousClass9IP r52 = new AnonymousClass9IP(A032);
        C56052rL A013 = C56052rL.A01();
        C1899593h.A1M(A013);
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "upi-reject-collect");
        if (C1899593h.A1Z(str, 1, false)) {
            C56052rL.A0D(A0U, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        C1899593h.A1O(A0U, A012, false);
        if (C626836d.A0M(str2, 1, 100, false)) {
            C56052rL.A0D(A0U, "sender-vpa", str2);
        }
        if (str3 != null && C626836d.A0M(str3, 1, 100, true)) {
            C56052rL.A0D(A0U, "sender-vpa-id", str3);
        }
        if (str5 != null && C626836d.A0N(str5, true)) {
            C56052rL.A0D(A0U, "upi-bank-info", str5);
        }
        if (C626836d.A0M(str4, 1, 100, false)) {
            C56052rL.A0D(A0U, "receiver-vpa", str4);
        }
        if (r62 != null) {
            A0U.A0H(r62.A00);
        }
        AnonymousClass36K A0S = C1899593h.A0S(A0U, A013, r52);
        C153607bd A022 = AnonymousClass9OC.A02(r122, "upi-reject-collect");
        Context context2 = r122.A00;
        r29.A0K(new C203929oX(context2, r122.A01, (C202489m6) r0, r122.A05, A022, r122), A0S, A032, 204, 0);
    }
}
