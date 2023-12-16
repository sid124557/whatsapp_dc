package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* renamed from: X.2ra  reason: invalid class name and case insensitive filesystem */
public class C56192ra {
    public long A00;
    public String A01;
    public String A02;
    public Map A03 = AnonymousClass001.A0t();
    public final C55682qk A04;
    public final C56972sr A05;
    public final C40012Ee A06;
    public final AnonymousClass34Q A07;
    public final C40022Ef A08;
    public final C104975Tb A09;
    public final AnonymousClass33p A0A;
    public final C56382rt A0B;
    public final AnonymousClass1VX A0C;
    public final AnonymousClass31C A0D;

    public synchronized String A01(UserJid userJid) {
        String str;
        if (this.A02 == null || (str = this.A01) == null) {
            str = C18280x3.A0Z(AnonymousClass0x2.A0F(this.A0A), AnonymousClass000.A0V("smb_business_direct_connection_enc_string_", userJid.getRawString(), AnonymousClass001.A0o()));
        }
        return str;
    }

    public synchronized void A02(AnonymousClass4CL r5, C108985dt r6, UserJid userJid, boolean z) {
        Map map = this.A03;
        List A0s = C18320x8.A0s(userJid, map);
        if (A0s != null) {
            A0s.add(r5);
        } else {
            map.put(userJid, C18300x5.A0s(r5));
            if (!this.A06.A00.A0Y(C58422vE.A02, 4281) || r6 == null || (!r6.A0Z)) {
                if (z) {
                    String rawString = userJid.getRawString();
                    AnonymousClass33p r0 = this.A0A;
                    r0.A1N(rawString);
                    r0.A1L(rawString);
                    r0.A1M(rawString);
                    C18260x0.A0G(C18270x1.A03(r0), "dc_business_domain_", rawString, AnonymousClass001.A0o());
                } else if (!TextUtils.isEmpty(A00(userJid))) {
                    if (A01(userJid) == null || A06(userJid)) {
                        A03(r6, userJid);
                    }
                }
                new AnonymousClass3TI(userJid, this.A0D).A00(new C64503Dt(this, r6));
            }
            A05(userJid);
        }
    }

    public synchronized void A04(UserJid userJid) {
        Map map = this.A03;
        List<AnonymousClass4CL> A0s = C18320x8.A0s(userJid, map);
        if (A0s == null) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "DirectConnectionManager/onDirectConnectionInfoFailed/No listeners for jid - ", userJid);
        } else {
            for (AnonymousClass4CL BRC : A0s) {
                BRC.BRC(userJid);
            }
            map.remove(userJid);
        }
    }

    public synchronized void A05(UserJid userJid) {
        Map map = this.A03;
        List<AnonymousClass4CL> A0s = C18320x8.A0s(userJid, map);
        if (A0s == null) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "DirectConnectionManager/onDirectConnectionInfoSucceeded/No listeners for jid - ", userJid);
        } else {
            for (AnonymousClass4CL BRD : A0s) {
                BRD.BRD(userJid);
            }
            map.remove(userJid);
        }
    }

    public String A00(UserJid userJid) {
        return C18280x3.A0Z(AnonymousClass0x2.A0F(this.A0A), AnonymousClass000.A0V("smb_business_direct_connection_public_key_", userJid.getRawString(), AnonymousClass001.A0o()));
    }

    public final void A03(C108985dt r12, UserJid userJid) {
        AnonymousClass3TJ r5 = new AnonymousClass3TJ(userJid, this.A0D);
        r5.A00 = new C42142My(this, r12, userJid);
        AnonymousClass31C r4 = r5.A02;
        String A032 = r4.A03();
        AnonymousClass39V[] r2 = new AnonymousClass39V[1];
        boolean A0F = AnonymousClass39V.A0F("biz_jid", r5.A01.getRawString(), r2);
        AnonymousClass36K A0I = AnonymousClass36K.A0I("signed_user_info", r2);
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        AnonymousClass39V.A0E(A1W, A0F ? 1 : 0);
        AnonymousClass39V.A09("xmlns", "w:biz:catalog", A1W);
        r4.A0D(r5, AnonymousClass36K.A0E(A0I, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W), A032, 287, 32000);
    }

    public boolean A06(UserJid userJid) {
        return AnonymousClass001.A1W((new Date().getTime() > AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(this.A0A), AnonymousClass000.A0V("smb_business_direct_connection_enc_string_expired_timestamp_", userJid.getRawString(), AnonymousClass001.A0o())) ? 1 : (new Date().getTime() == AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(this.A0A), AnonymousClass000.A0V("smb_business_direct_connection_enc_string_expired_timestamp_", userJid.getRawString(), AnonymousClass001.A0o())) ? 0 : -1)));
    }

    public C56192ra(C55682qk r2, C56972sr r3, C40012Ee r4, AnonymousClass34Q r5, C40022Ef r6, C104975Tb r7, AnonymousClass33p r8, C56382rt r9, AnonymousClass1VX r10, AnonymousClass31C r11) {
        this.A0D = r11;
        this.A0A = r8;
        this.A04 = r2;
        this.A07 = r5;
        this.A0B = r9;
        this.A08 = r6;
        this.A0C = r10;
        this.A09 = r7;
        this.A05 = r3;
        this.A06 = r4;
    }
}
