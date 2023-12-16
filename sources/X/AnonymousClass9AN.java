package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9AN  reason: invalid class name */
public class AnonymousClass9AN extends AnonymousClass9OC {
    public static final Long A07 = 2L;
    public final Context A00;
    public final C69263Wi A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass31C A03;
    public final AnonymousClass9U1 A04;
    public final C40602Ha A05;
    public final C194259Se A06;

    public AnonymousClass9AN(Context context, C69263Wi r3, AnonymousClass1VX r4, AnonymousClass31C r5, AnonymousClass9U1 r6, C40602Ha r7, AnonymousClass9U5 r8, C194259Se r9) {
        super(r6.A04, r8);
        this.A00 = context;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        this.A06 = r9;
        this.A04 = r6;
        this.A05 = r7;
    }

    public void A00(AnonymousClass39Q r30, C166557yt r31, C202569mE r32, AnonymousClass9AG r33, C197109ca r34, String str, String str2, String str3, String str4, String str5, String str6, String str7, HashMap hashMap) {
        String str8;
        AnonymousClass39V[] A0u;
        Log.i("PAY: acceptCollect called");
        AnonymousClass31C r28 = this.A03;
        String A032 = r28.A03();
        Long l = null;
        HashMap hashMap2 = hashMap;
        if (hashMap != null) {
            str8 = this.A04.A06("MPIN", hashMap2, 5);
        } else {
            str8 = null;
        }
        C626936e.A06(str8);
        if (this.A02.A0X(747)) {
            l = A07;
        }
        String A012 = this.A06.A01();
        String str9 = (String) C1899593h.A0X(r31);
        AnonymousClass39L A002 = this.A01.A00(AnonymousClass1S3.A05, r30);
        String valueOf = String.valueOf(A002.A00());
        String valueOf2 = String.valueOf(A002.A00);
        String str10 = ((AnonymousClass3H6) A002.A01).A04;
        C56052rL A042 = C56052rL.A04("smax:any");
        C56052rL A043 = C56052rL.A04("money");
        if (C626836d.A0M(valueOf, 1, 100, false)) {
            C56052rL.A0D(A043, "value", valueOf);
        }
        if (C626836d.A0M(valueOf2, 1, 100, false)) {
            C56052rL.A0D(A043, "offset", valueOf2);
        }
        if (C626836d.A0M(str10, 1, 100, false)) {
            C56052rL.A0D(A043, "currency", str10);
        }
        C56052rL.A07(A043, A042);
        AnonymousClass36K A0F = A042.A0F();
        C56052rL A044 = C56052rL.A04("amount");
        A044.A0I(A0F);
        AnonymousClass36K A0F2 = A044.A0F();
        AnonymousClass9IP r7 = new AnonymousClass9IP(A032);
        C56052rL A013 = C56052rL.A01();
        C1899593h.A1M(A013);
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "upi-accept-collect");
        if (C1899593h.A1Z(str8, 0, false)) {
            C56052rL.A0D(A0U, "mpin", str8);
        }
        C1899593h.A1O(A0U, A012, false);
        String str11 = str6;
        if (C1899593h.A1b(str11, false)) {
            C56052rL.A0D(A0U, "credential-id", str11);
        }
        String str12 = str;
        if (C1899593h.A1Z(str12, 1, false)) {
            C56052rL.A0D(A0U, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str12);
        }
        String str13 = str2;
        if (str2 != null && C626836d.A0M(str13, 0, 100, true)) {
            C56052rL.A0D(A0U, "sender-vpa", str13);
        }
        String str14 = str3;
        if (str3 != null && C626836d.A0M(str14, 0, 100, true)) {
            C56052rL.A0D(A0U, "sender-vpa-id", str14);
        }
        if (str9 != null && C1899693i.A11(str9, 0, true)) {
            C56052rL.A0D(A0U, "upi-bank-info", str9);
        }
        String str15 = str4;
        if (str4 != null && C626836d.A0M(str15, 0, 100, true)) {
            C56052rL.A0D(A0U, "receiver-vpa", str15);
        }
        String str16 = str5;
        if (str5 != null && C626836d.A0M(str16, 0, 100, true)) {
            C56052rL.A0D(A0U, "receiver-vpa-id", str16);
        }
        String str17 = str7;
        if (str7 != null && C626836d.A0M(str17, 0, 100, true)) {
            C56052rL.A0D(A0U, "mandate-no", str17);
        }
        if (l != null && C626836d.A0J(l, 1, 9007199254740991L, true)) {
            C56052rL.A0A(A0U, l, "version");
        }
        A0U.A0H(A0F2);
        AnonymousClass36K A0S = C1899593h.A0S(A0U, A013, r7);
        C153607bd A022 = AnonymousClass9OC.A02(this, "upi-accept-collect");
        List A0s = AnonymousClass001.A0s();
        AnonymousClass36K A0k = A0S.A0k(0);
        if (!(A0k == null || (A0u = A0k.A0u()) == null)) {
            C626936e.A06(A0u);
            A0s = Arrays.asList(A0u);
        }
        r33.A00("U66", A0s);
        Context context = this.A00;
        C40602Ha r9 = this.A05;
        r28.A0D(new C203929oX(context, this.A01, r9, A022, r32, this, r34), A0S, A032, 204, 0);
    }
}
