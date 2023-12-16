package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.2o6  reason: invalid class name and case insensitive filesystem */
public final class C54052o6 {
    public String A00 = null;
    public final long A01;
    public final UserJid A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final Map A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C54052o6(UserJid userJid, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, long j, boolean z, boolean z2) {
        C162457s7.A0J(str3, 5);
        this.A02 = userJid;
        this.A06 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A01 = j;
        this.A09 = str5;
        this.A0C = z;
        this.A0B = z2;
        this.A03 = str6;
        this.A04 = str7;
        this.A0A = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54052o6) {
                C54052o6 r8 = (C54052o6) obj;
                if (!C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A06, r8.A06) || !C162457s7.A0P(this.A05, r8.A05) || !"galaxy_message".equals("galaxy_message") || !C162457s7.A0P(this.A07, r8.A07) || !C162457s7.A0P(this.A08, r8.A08) || this.A01 != r8.A01 || !C162457s7.A0P(this.A09, r8.A09) || !C162457s7.A0P(this.A00, r8.A00) || this.A0C != r8.A0C || this.A0B != r8.A0B || !C162457s7.A0P(this.A03, r8.A03) || !C162457s7.A0P(this.A04, r8.A04) || !C162457s7.A0P(this.A0A, r8.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(C54052o6 r3, Jid jid, Object obj, Object obj2, Object[] objArr) {
        objArr[5] = new AnonymousClass3Z6("flow_token", r3.A07);
        objArr[6] = new AnonymousClass3Z6("flow_message_version", obj);
        objArr[7] = new AnonymousClass3Z6("extension_id", obj2);
        objArr[8] = new AnonymousClass3Z6("business_jid", jid.getRawString());
        objArr[9] = new AnonymousClass3Z6("version", r3.A00);
        objArr[10] = new AnonymousClass3Z6("is_draft", Boolean.valueOf(r3.A0B));
    }

    public int hashCode() {
        int A072 = AnonymousClass0x2.A07(this.A06, C18300x5.A04(this.A02));
        int A073 = AnonymousClass0x2.A07(this.A07, (AnonymousClass0x2.A07(this.A05, A072) + 1169897944) * 31);
        return ((AnonymousClass0x2.A07(this.A03, AnonymousClass0x2.A01(AnonymousClass0x2.A01((AnonymousClass0x2.A07(this.A09, (AnonymousClass000.A00(AnonymousClass0x2.A07(this.A08, A073), this.A01) - 1809421292) * 31) + C18270x1.A00(this.A00)) * 31, this.A0C), this.A0B)) + C18270x1.A00(this.A04)) * 31) + C18310x6.A07(this.A0A);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionsContextParams(bizJid=");
        A0o.append(this.A02);
        A0o.append(", flowMessageVersion=");
        A0o.append(this.A06);
        A0o.append(", flowId=");
        A0o.append(this.A05);
        A0o.append(", actionName=");
        A0o.append("galaxy_message");
        A0o.append(", flowToken=");
        A0o.append(this.A07);
        A0o.append(", messageId=");
        A0o.append(this.A08);
        A0o.append(", messageRowId=");
        A0o.append(this.A01);
        A0o.append(", referral=");
        A0o.append(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
        A0o.append(", sessionId=");
        A0o.append(this.A09);
        A0o.append(", dataApiVersion=");
        A0o.append(this.A00);
        A0o.append(", isResumableFlow=");
        A0o.append(this.A0C);
        A0o.append(", isDraft=");
        A0o.append(this.A0B);
        A0o.append(", externalObserverId=");
        A0o.append(this.A03);
        A0o.append(", flowAction=");
        A0o.append(this.A04);
        A0o.append(", flowActionPayload=");
        return C18260x0.A04(this.A0A, A0o);
    }
}
