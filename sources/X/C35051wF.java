package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.1wF  reason: invalid class name and case insensitive filesystem */
public final class C35051wF extends C41022Iq {
    public static final ArrayList A06 = C18260x0.A0C("614665046147756", "994766073959253");
    public static final ArrayList A07 = C18260x0.A0C("fbns", "gcm");
    public static final ArrayList A08 = AnonymousClass0x2.A0i(new String[]{"0", "1", "2"});
    public final Long A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C35051wF(AnonymousClass36K r18) {
        AnonymousClass36K r3 = r18;
        AnonymousClass36K.A0N(r3, "config");
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Class<String> cls = String.class;
        Long A0U = AnonymousClass0x2.A0U();
        this.A02 = (String) C626836d.A06(r3, cls, A0U, 1024L, (Object) null, strArr, false);
        Class<Long> cls2 = Long.class;
        Long A0T = AnonymousClass0x2.A0T();
        AnonymousClass36K r10 = r3;
        this.A00 = (Long) C626836d.A05(r10, cls2, A0T, AnonymousClass0x2.A0S(), (Object) null, new String[]{"app_mute"}, false);
        this.A03 = (String) C626836d.A05(r3, cls, A0U, 64L, (Object) null, new String[]{"pkey"}, false);
        this.A01 = (Long) C626836d.A05(r10, cls2, A0T, 5L, (Object) null, new String[]{"num_acc"}, false);
        this.A04 = C626836d.A0A(r3, A07, new String[]{"platform"});
        C41022Iq.A01(r3, PublicKeyCredentialControllerUtility.JSON_KEY_APPID, A06);
        this.A05 = C626836d.A09(r3, A08, new String[]{"voip_payload_type"});
        this.A00 = r3;
    }
}
