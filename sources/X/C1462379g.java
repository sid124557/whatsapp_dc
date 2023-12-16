package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.79g  reason: invalid class name and case insensitive filesystem */
public class C1462379g {
    public static C175798Zt A00;
    public static C175798Zt A01;
    public static C175798Zt A02;
    public static C175798Zt A03;
    public static C175798Zt A04;
    public static C175798Zt A05;
    public static C175798Zt A06;
    public static C175798Zt A07;
    public static C175798Zt A08;
    public static final List A09;
    public static final List A0A;
    public static final List A0B;

    static {
        AnonymousClass7WQ r10 = new AnonymousClass7WQ("user_values", "name='active_session_info'", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value"});
        C142766xj r11 = C142766xj.A01;
        AnonymousClass8L9 r7 = C155697fL.A04;
        A04 = new C175798Zt(r7, "content://com.facebook.katana.provider.FirstPartyUserValuesProvider/user_values", "com.facebook.katana", r10, r11);
        AnonymousClass7WQ r1 = new AnonymousClass7WQ("user_values", "name='active_session_info'", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value"});
        AnonymousClass8L9 r13 = C155697fL.A01;
        C142766xj r17 = r11;
        A01 = new C175798Zt(r13, "content://com.facebook.wakizashi.provider.FirstPartyUserValuesProvider/user_values", "com.facebook.wakizashi", r1, r17);
        A05 = new C175798Zt(r7, "content://com.facebook.katana.liteprovider.FirstPartyUserValuesLiteProvider/user_values", "com.facebook.katana", new AnonymousClass7WQ("user_values", "name='active_session_info'", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value"}), r11);
        A02 = new C175798Zt(r13, "content://com.facebook.wakizashi.liteprovider.FirstPartyUserValuesLiteProvider/user_values", "com.facebook.wakizashi", new AnonymousClass7WQ("user_values", "name='active_session_info'", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value"}), r17);
        AnonymousClass7WQ r5 = new AnonymousClass7WQ((String) null, (String) null, new String[0]);
        C142766xj r21 = C142766xj.A04;
        AnonymousClass8L9 r172 = C155697fL.A07;
        A08 = new C175798Zt(r172, "content://com.instagram.contentprovider.FamilyAppsUserValuesProvider", "com.instagram.android", r5, r21);
        A06 = new C175798Zt(r172, "content://com.instagram.liteprovider.FirstPartyUserValuesLiteProvider", "com.instagram.android", new AnonymousClass7WQ((String) null, (String) null, new String[0]), r21);
        A03 = new C175798Zt(r7, "content://com.facebook.katana.provider.UserValuesProvider/user_values", "com.facebook.katana", new AnonymousClass7WQ("user_values", "name='all_session_info'", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value"}), r11);
        A00 = new C175798Zt(r7, "content://com.facebook.wakizashi.provider.UserValuesProvider/user_values", "com.facebook.wakizashi", new AnonymousClass7WQ("user_values", "name='all_session_info'", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value"}), r11);
        A07 = new C175798Zt(r172, "content://com.instagram.contentprovider.FamilyAppsUserValuesProvider", "com.instagram.android", new AnonymousClass7WQ((String) null, "all_session_info", new String[0]), r21);
        C151917Wu[] r2 = new C151917Wu[2];
        r2[0] = A04;
        A0B = AnonymousClass0x9.A1A(A08, r2, 1);
        C151917Wu[] r22 = new C151917Wu[2];
        r22[0] = A05;
        A0A = AnonymousClass0x9.A1A(A06, r22, 1);
        C151917Wu[] r23 = new C151917Wu[2];
        r23[0] = A03;
        A09 = AnonymousClass0x9.A1A(A07, r23, 1);
    }
}
