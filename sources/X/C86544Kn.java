package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker;
import com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker;
import com.whatsapp.privacy.protocol.xmpp.DisclosureResetOnServerWorker;
import com.whatsapp.privacy.protocol.xmpp.DisclosureResultSendWorker;
import com.whatsapp.privacy.usernotice.UserNoticeStageUpdateWorker;

/* renamed from: X.4Kn  reason: invalid class name and case insensitive filesystem */
public class C86544Kn implements C15670rk {
    public Object A00;
    public final int A01;

    public C86544Kn(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object AxQ(AnonymousClass0Pc r24) {
        int i;
        int length;
        int i2;
        AnonymousClass0Pc r13 = r24;
        switch (this.A01) {
            case 0:
                DisclosureGetStageByIdsWorker disclosureGetStageByIdsWorker = (DisclosureGetStageByIdsWorker) this.A00;
                int[] A04 = disclosureGetStageByIdsWorker.A01.A01.A04("disclosure_ids");
                C18260x0.A1P(AnonymousClass001.A0o(), "disclosurergetstagebyidsworker/startwork disclosureid = ", A04);
                if (!(A04 == null || (length = A04.length) == 0)) {
                    AnonymousClass31C r14 = disclosureGetStageByIdsWorker.A01;
                    String A03 = r14.A03();
                    long A002 = C56612sH.A00(disclosureGetStageByIdsWorker.A00);
                    if (A002 > 2147483647L || A002 <= 0) {
                        i2 = 100;
                    } else {
                        i2 = (int) A002;
                    }
                    AnonymousClass36K[] r8 = new AnonymousClass36K[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        AnonymousClass39V[] r7 = new AnonymousClass39V[2];
                        r7[0] = new AnonymousClass39V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A04[i3]);
                        AnonymousClass39V.A0B("t", Integer.toString(i2), r7, 1);
                        AnonymousClass36K.A0U("get_disclosure_stage_by_id", r7, r8, i3);
                    }
                    AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
                    AnonymousClass39V.A0C("to", "s.whatsapp.net", A1W, 0, 1);
                    AnonymousClass39V.A0B("xmlns", "tos", A1W, 2);
                    AnonymousClass39V.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A03, A1W);
                    r14.A0K(new AnonymousClass4KX(r13, disclosureGetStageByIdsWorker, A04, 12), AnonymousClass36K.A0J("iq", A1W, r8), A03, 254, 32000);
                    return "Get Disclosure Stage by Ids";
                }
                break;
            case 1:
                DisclosureMetadataGetWorker disclosureMetadataGetWorker = (DisclosureMetadataGetWorker) this.A00;
                int A02 = disclosureMetadataGetWorker.A01.A01.A02("disclosure_id", -1);
                C18260x0.A0w("disclosuremetadatagetworker/startwork disclosureid = ", AnonymousClass001.A0o(), A02);
                AnonymousClass31C r10 = disclosureMetadataGetWorker.A02;
                String A032 = r10.A03();
                long A003 = C56612sH.A00(disclosureMetadataGetWorker.A01);
                if (A003 > 2147483647L || A003 <= 0) {
                    i = 100;
                } else {
                    i = (int) A003;
                }
                AnonymousClass39V[] r2 = new AnonymousClass39V[1];
                boolean A0F = AnonymousClass39V.A0F("t", Integer.toString(i), r2);
                AnonymousClass36K A0I = AnonymousClass36K.A0I("get_user_disclosures", r2);
                AnonymousClass39V[] A1W2 = AnonymousClass0x9.A1W();
                AnonymousClass39V.A0C("to", "s.whatsapp.net", A1W2, A0F ? 1 : 0, 1);
                AnonymousClass39V.A06("xmlns", "tos", A1W2);
                r10.A0K(new AnonymousClass4KW(r13, disclosureMetadataGetWorker, A02, A0F), AnonymousClass36K.A0E(A0I, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W2), A032, 254, 32000);
                return "Get Disclosure Metadata";
            case 2:
                DisclosureResetOnServerWorker disclosureResetOnServerWorker = (DisclosureResetOnServerWorker) this.A00;
                int A022 = disclosureResetOnServerWorker.A01.A01.A02("disclosure_id", -1);
                if (A022 != -1) {
                    C18260x0.A0y("DisclosureResetOnServertWorker/startwork/disclosureId: ", AnonymousClass001.A0o(), A022);
                    AnonymousClass31C r102 = disclosureResetOnServerWorker.A00;
                    String A033 = r102.A03();
                    AnonymousClass39V[] r1 = new AnonymousClass39V[1];
                    boolean A0F2 = AnonymousClass39V.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Integer.toString(A022), r1);
                    AnonymousClass36K A0I2 = AnonymousClass36K.A0I("delete", r1);
                    AnonymousClass39V[] A1W3 = AnonymousClass0x9.A1W();
                    AnonymousClass39V.A0D("to", "s.whatsapp.net", A1W3, A0F2 ? 1 : 0, 1);
                    AnonymousClass39V.A06("xmlns", "tos", A1W3);
                    r102.A0K(new AnonymousClass4KW(r13, disclosureResetOnServerWorker, A022, 1), AnonymousClass36K.A0E(A0I2, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A033, A1W3), A033, 254, 32000);
                    return "Stage on server reset";
                }
                break;
            case 3:
                DisclosureResultSendWorker disclosureResultSendWorker = (DisclosureResultSendWorker) this.A00;
                AnonymousClass0Xq r22 = disclosureResultSendWorker.A01.A01;
                int A023 = r22.A02("disclosure_id", -1);
                int A024 = r22.A02("result", -1);
                if (!(A023 == -1 || A024 == -1)) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("disclosuresendworker/startwork/disclosureId: ");
                    A0o.append(A023);
                    C18260x0.A0y(" result: ", A0o, A024);
                    AnonymousClass31C r103 = disclosureResultSendWorker.A00;
                    String A034 = r103.A03();
                    AnonymousClass39V[] r12 = new AnonymousClass39V[2];
                    boolean A0F3 = AnonymousClass39V.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Integer.toString(A023), r12);
                    boolean A0G = AnonymousClass39V.A0G("result", Integer.toString(A024), r12);
                    AnonymousClass36K A0I3 = AnonymousClass36K.A0I("trackable", r12);
                    AnonymousClass39V[] A1W4 = AnonymousClass0x9.A1W();
                    AnonymousClass39V.A0D("to", "s.whatsapp.net", A1W4, A0F3 ? 1 : 0, A0G ? 1 : 0);
                    AnonymousClass39V.A0B("xmlns", "tos", A1W4, 2);
                    r103.A0K(new AnonymousClass4KT(r13, 14, disclosureResultSendWorker), AnonymousClass36K.A0E(A0I3, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A034, A1W4), A034, 254, 32000);
                    return "Send Stage Update";
                }
            default:
                UserNoticeStageUpdateWorker userNoticeStageUpdateWorker = (UserNoticeStageUpdateWorker) this.A00;
                AnonymousClass0Xq r3 = userNoticeStageUpdateWorker.A01.A01;
                int A025 = r3.A02("notice_id", -1);
                int A026 = r3.A02("stage", -1);
                int A027 = r3.A02("version", -1);
                if (!(A025 == -1 || A026 == -1 || A027 == -1)) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("UserNoticeStageUpdateWorker/startWork/noticeId: ");
                    A0o2.append(A025);
                    C18260x0.A0y(" stage: ", A0o2, A026);
                    AnonymousClass31C r5 = userNoticeStageUpdateWorker.A00;
                    String A035 = r5.A03();
                    AnonymousClass39V[] r15 = new AnonymousClass39V[2];
                    boolean A0F4 = AnonymousClass39V.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Integer.toString(A025), r15);
                    boolean A0G2 = AnonymousClass39V.A0G("stage", Integer.toString(A026), r15);
                    AnonymousClass36K A0I4 = AnonymousClass36K.A0I("notice", r15);
                    AnonymousClass39V[] A1W5 = AnonymousClass0x9.A1W();
                    AnonymousClass39V.A0D("to", "s.whatsapp.net", A1W5, A0F4 ? 1 : 0, A0G2 ? 1 : 0);
                    AnonymousClass39V.A0B("xmlns", "tos", A1W5, 2);
                    AnonymousClass36K A0E = AnonymousClass36K.A0E(A0I4, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A035, A1W5);
                    r5.A0K(new AnonymousClass3T3(r13, userNoticeStageUpdateWorker, A025, A027, A026), A0E, A035, 254, 32000);
                    return "Send Stage Update";
                }
        }
        return new C01400Ao();
    }
}
