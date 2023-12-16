package X;

import android.content.Context;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9oY  reason: invalid class name and case insensitive filesystem */
public class C203939oY extends C1908099x {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203939oY(Context context, C69263Wi r9, C40602Ha r10, C153607bd r11, AnonymousClass9A8 r12, AnonymousClass9NV r13, AnonymousClass9IX r14) {
        super(context, r9, r10, r11, "get-purpose-limiting-key");
        this.A00 = r12;
        this.A01 = r13;
        this.A02 = r14;
    }

    public void A03(AnonymousClass34V r4) {
        switch (this.A03) {
            case 0:
                ((AnonymousClass9AE) this.A00).A03.BK0(r4, 23);
                super.A03(r4);
                ((C150597Rk) this.A02).A00((C166157yE) this.A01, r4);
                return;
            case 1:
                return;
            case 2:
                super.A03(r4);
                ((C202599mH) this.A01).BXW(r4);
                return;
            default:
                super.A03(r4);
                ((AnonymousClass9AI) this.A00).A07.A05(r4, (Integer) this.A02, "upi-send-to-vpa");
                ((C202609mI) this.A01).BXl(r4);
                return;
        }
    }

    public void A04(AnonymousClass34V r4) {
        switch (this.A03) {
            case 0:
                ((AnonymousClass9AE) this.A00).A03.BK0(r4, 23);
                super.A04(r4);
                ((C150597Rk) this.A02).A00((C166157yE) this.A01, r4);
                return;
            case 1:
                return;
            case 2:
                super.A04(r4);
                ((C202599mH) this.A01).BXW(r4);
                return;
            default:
                super.A04(r4);
                ((AnonymousClass9AI) this.A00).A07.A05(r4, (Integer) this.A02, "upi-send-to-vpa");
                ((C202609mI) this.A01).BXl(r4);
                return;
        }
    }

    public void A05(AnonymousClass36K r23) {
        IllegalStateException illegalStateException;
        AnonymousClass36K A0l;
        AnonymousClass36K r15 = r23;
        switch (this.A03) {
            case 0:
                AnonymousClass9AE r4 = (AnonymousClass9AE) this.A00;
                r4.A03.BK0((AnonymousClass34V) null, 23);
                super.A05(r15);
                AnonymousClass36K A0T = C1899693i.A0T(r15);
                if (A0T != null && (A0l = A0T.A0l("alias")) != null) {
                    C150597Rk r2 = (C150597Rk) this.A02;
                    try {
                        r2.A00(C1908099x.A00(A0l), (AnonymousClass34V) null);
                        return;
                    } catch (AnonymousClass24Y unused) {
                        r4.A04.A05("onDeregisterVpaAlias/onResponseSuccess/corrupt stream exception");
                        r2.A00((C166157yE) null, new AnonymousClass34V(500));
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                try {
                    AnonymousClass36K A022 = C41032Ir.A02(r15, (C41032Ir) this.A02);
                    Class<String> cls = String.class;
                    Long A0R = AnonymousClass0x2.A0R();
                    Long A0S = AnonymousClass0x2.A0S();
                    Class<String> cls2 = cls;
                    Long l = A0R;
                    Long l2 = A0S;
                    C626836d.A06(r15, cls2, l, l2, C626836d.A06(A022, cls, A0R, A0S, (Object) null, new String[]{"account", "action"}, false), new String[]{"account", "action"}, true);
                    Class<Long> cls3 = Long.class;
                    Long A0T2 = AnonymousClass0x2.A0T();
                    C626836d.A06(r15, cls3, A0T2, l2, (Object) null, new String[]{"account", "expiry-ts"}, false);
                    Class<String> cls4 = cls;
                    C626836d.A06(r15, cls4, AnonymousClass0x2.A0U(), 10000L, (Object) null, new String[]{"account", "purpose-enc-certificate"}, false);
                    Long l3 = A0R;
                    Long l4 = A0S;
                    C626836d.A06(r15, cls4, l3, l4, (Object) null, new String[]{"account", PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE}, false);
                    C626836d.A04(r15, new C205019qI(A022, 8), new String[0]);
                    C205029qJ.A02(r15, new String[]{"account"}, 43);
                    C193559Pc r42 = new C193559Pc(Base64.decode((String) C626836d.A06(r15, cls4, l3, l4, (Object) null, new String[]{"account", "data"}, false), 8), ((Number) C626836d.A06(r15, cls3, l, l2, (Object) null, new String[]{"account", "key-version"}, false)).intValue(), ((Number) C626836d.A06(r15, cls3, A0T2, l2, (Object) null, new String[]{"account", "server-ts"}, false)).longValue());
                    IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = ((AnonymousClass9NV) this.A01).A00;
                    C185988uZ r0 = C158317jm.A00().A00;
                    byte[] B3i = r0.B3i();
                    C201629kS r22 = new C201629kS(r0.generatePublicKey(B3i), B3i);
                    AtomicBoolean atomicBoolean = r22.A00;
                    if (!atomicBoolean.get()) {
                        r42.A01 = r22.A02;
                        if (!atomicBoolean.get()) {
                            r42.A00 = r22.A01;
                            indiaUpiSendPaymentActivity.A0F = r42;
                            return;
                        }
                        illegalStateException = AnonymousClass001.A0e("key has been destroyed");
                    } else {
                        illegalStateException = AnonymousClass001.A0e("key has been destroyed");
                    }
                    throw illegalStateException;
                } catch (AnonymousClass24Y unused2) {
                    Log.e("CorruptStreamException when parsing UPIGetPurposeLimitingKeyResponseSuccess");
                    return;
                }
            case 2:
                super.A05(r15);
                try {
                    C139716sV r6 = new C139716sV(r15, (C192189In) this.A02);
                    C191129Co r5 = (C191129Co) ((C202599mH) this.A01);
                    r5.A0S.A07(r5.A00, (AnonymousClass34V) null, 16);
                    r5.A02 = AnonymousClass97T.A0c(r5);
                    r5.A05.A02("upi-get-credential");
                    r5.BjL();
                    r5.A7m(r6, r5.A02);
                    return;
                } catch (AnonymousClass24Y unused3) {
                    Log.e("PAY: IndiaUpiOtpAction: could not parse generate-otp response");
                    ((C202599mH) this.A01).BXW(C1899693i.A0M());
                    return;
                }
            default:
                super.A05(r15);
                ((AnonymousClass9AI) this.A00).A07.A07((Integer) this.A02, "upi-send-to-vpa");
                ((C202609mI) this.A01).BXl((AnonymousClass34V) null);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203939oY(Context context, C69263Wi r9, C40602Ha r10, C153607bd r11, C202599mH r12, AnonymousClass9AH r13, C192189In r14) {
        super(context, r9, r10, r11, "upi-generate-otp");
        this.A00 = r13;
        this.A01 = r12;
        this.A02 = r14;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203939oY(Context context, C69263Wi r9, C40602Ha r10, C153607bd r11, C202609mI r12, AnonymousClass9AI r13, Integer num) {
        super(context, r9, r10, r11, "upi-send-to-vpa");
        this.A00 = r13;
        this.A01 = r12;
        this.A02 = num;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203939oY(Context context, C69263Wi r9, C166157yE r10, C40602Ha r11, C153607bd r12, AnonymousClass9AE r13, C150597Rk r14) {
        super(context, r9, r11, r12, "deregister-alias");
        this.A00 = r13;
        this.A02 = r14;
        this.A01 = r10;
    }
}
