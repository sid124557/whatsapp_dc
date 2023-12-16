package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1wQ  reason: invalid class name and case insensitive filesystem */
public final class C35161wQ extends C41022Iq implements C84304Bv {
    public static final ArrayList A01 = C18260x0.A0C("0", "1");
    public static final ArrayList A02 = C18260x0.A0C("0", "1");
    public static final ArrayList A03 = C18260x0.A0C("0", "1");
    public static final ArrayList A04 = C18260x0.A0C("0", "1");
    public static final ArrayList A05 = AnonymousClass0x2.A0i(new String[]{"0", "1", "2"});
    public static final ArrayList A06 = AnonymousClass0x2.A0i(new String[]{"apple", "apple_dev", "smbi", "smbi_dev"});
    public static final ArrayList A07 = C18260x0.A0C("0", "1");
    public static final ArrayList A08 = AnonymousClass0x2.A0i(new String[]{"false", "true", "0", "1"});
    public static final ArrayList A09 = AnonymousClass0x2.A0i(new String[]{"0", "1", "2"});
    public final List A00;

    public C35161wQ(AnonymousClass36K r18) {
        AnonymousClass36K r3 = r18;
        AnonymousClass36K.A0N(r3, "config");
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A05(r3, cls, A0R, A0S, "2", new String[]{"version"}, false);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Long A0U = AnonymousClass0x2.A0U();
        AnonymousClass36K r10 = r3;
        Class<String> cls2 = cls;
        C626836d.A05(r10, cls2, A0U, 1024L, (Object) null, strArr, false);
        C626836d.A05(r10, cls2, A0U, 1024L, (Object) null, new String[]{"voip"}, false);
        C626836d.A06(r10, cls2, A0U, 20L, (Object) null, new String[]{CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID}, false);
        C626836d.A06(r10, cls2, A0U, 20L, (Object) null, new String[]{"groups"}, false);
        C626836d.A06(r10, cls2, A0U, 20L, (Object) null, new String[]{"call"}, false);
        C626836d.A06(r10, cls2, A0U, 10L, (Object) null, new String[]{"lg"}, false);
        C626836d.A06(r10, cls2, A0U, 10L, (Object) null, new String[]{"lc"}, false);
        C626836d.A05(r10, cls2, A0U, 64L, (Object) null, new String[]{"pkey"}, false);
        C626836d.A05(r3, Long.class, AnonymousClass0x2.A0T(), A0S, (Object) null, new String[]{"app_mute"}, false);
        C626836d.A0A(r3, A06, new String[]{"platform"});
        C626836d.A0A(r3, A07, new String[]{"preview"});
        C41022Iq.A01(r3, "background_location", A01);
        C41022Iq.A01(r3, "nse_ver", A05);
        C41022Iq.A01(r3, "nse_call", A02);
        C41022Iq.A01(r3, "nse_read", A03);
        C41022Iq.A01(r3, "nse_retry", A04);
        C41022Iq.A01(r3, "reg_push", A08);
        C626836d.A0A(r3, A09, new String[]{"voip_payload_type"});
        this.A00 = C626836d.A0B(r3, C86304Jp.A00(85), new String[]{"item"}, 0, Long.MAX_VALUE);
        this.A00 = r3;
    }

    public void AwE(C58892vz r1) {
    }
}
