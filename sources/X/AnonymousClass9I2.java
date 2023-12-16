package X;

import java.util.ArrayList;

/* renamed from: X.9I2  reason: invalid class name */
public final class AnonymousClass9I2 extends C41022Iq {
    public static final ArrayList A01 = AnonymousClass0x2.A0i(new String[]{"CURRENT", "OD_SECURED", "OD_UNSECURED", "SAVINGS"});
    public static final ArrayList A02 = C18260x0.A0C("0", "1");
    public static final ArrayList A03 = C18260x0.A0C("1", "2");
    public final AnonymousClass9I4 A00;

    public AnonymousClass9I2(AnonymousClass36K r27) {
        AnonymousClass36K r3 = r27;
        String[] A0Z = AnonymousClass36K.A0Z(r3, "bank");
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r3, cls, A0R, A0S, "upi", A0Z, false);
        Long A0U = AnonymousClass0x2.A0U();
        AnonymousClass36K r10 = r3;
        Class<String> cls2 = cls;
        C626836d.A05(r10, cls2, A0U, 200L, (Object) null, new String[]{"vpa"}, false);
        C626836d.A06(r10, cls2, A0U, 200L, (Object) null, new String[]{"provider"}, false);
        Long A0i = AnonymousClass0x7.A0i();
        AnonymousClass36K r15 = r3;
        Class<String> cls3 = cls;
        Long l = A0U;
        C626836d.A05(r15, cls3, l, A0i, (Object) null, new String[]{"vpa-id"}, false);
        C626836d.A06(r15, cls3, l, A0i, (Object) null, new String[]{"account-number"}, false);
        Long A0T = AnonymousClass0x2.A0T();
        C626836d.A05(r15, cls3, A0T, A0i, (Object) null, new String[]{"mmid"}, false);
        C626836d.A05(r10, cls2, A0U, 200L, (Object) null, new String[]{"account-name"}, false);
        Class<Long> cls4 = Long.class;
        AnonymousClass36K r152 = r3;
        C626836d.A06(r152, cls4, A0T, A0i, (Object) null, new String[]{"atm-pin-length"}, false);
        C626836d.A06(r152, cls4, A0T, A0i, (Object) null, new String[]{"mpin-length"}, false);
        C626836d.A06(r152, cls4, A0T, A0i, (Object) null, new String[]{"otp-length"}, false);
        AnonymousClass36K r19 = r3;
        Class<String> cls5 = cls;
        Long l2 = A0U;
        C626836d.A05(r19, cls5, l2, 3000L, (Object) null, new String[]{"image"}, false);
        C626836d.A05(r19, cls5, l2, A0i, (Object) null, new String[]{"bank-name"}, false);
        C626836d.A05(r19, cls5, l2, AnonymousClass6C9.A0Y(), (Object) null, new String[]{"bank-phone-number"}, false);
        C626836d.A05(r19, cls5, l2, A0i, (Object) null, new String[]{"code"}, false);
        C626836d.A05(r19, cls5, l2, A0S, (Object) null, new String[]{"upi-bank-info"}, false);
        C626836d.A05(r19, cls5, l2, A0i, (Object) null, new String[]{"transaction-prefix"}, false);
        C626836d.A05(r19, cls4, A0T, A0S, (Object) null, new String[]{"bank-ref-id"}, false);
        C626836d.A05(r10, cls2, A0U, 11L, (Object) null, new String[]{"ifsc-code"}, false);
        C626836d.A05(r10, cls2, A0U, A0i, (Object) null, new String[]{"account-ref-id"}, false);
        AnonymousClass6C8.A13(r3, "is-mpin-set", A02);
        AnonymousClass6C8.A13(r3, "pin-format-version", A03);
        C626836d.A05(r3, cls, A0R, A0S, (Object) null, new String[]{"account-type"}, false);
        this.A00 = (AnonymousClass9I4) C205029qJ.A00(r3, 37);
        this.A00 = r3;
    }
}
