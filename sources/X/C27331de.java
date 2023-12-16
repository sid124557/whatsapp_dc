package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

/* renamed from: X.1de  reason: invalid class name and case insensitive filesystem */
public class C27331de extends C67303Ot {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public void Bh4(AnonymousClass4EN r4) {
        AnonymousClass1VX r2 = this.A04;
        C58422vE r1 = C58422vE.A02;
        if (!r2.A0Y(r1, 5333) || !r2.A0Y(r1, 1319)) {
            super.Bh4(r4);
        } else {
            r4.BSB(AnonymousClass002.A0E("extensions-business-endpoint-response-error"));
        }
    }

    public C27331de(C56492s4 r14, AnonymousClass33p r15, AnonymousClass1VX r16, AnonymousClass28T r17, C183538qC r18, String str, String str2, String str3, String str4, AnonymousClass4C1 r23, AnonymousClass4C1 r24) {
        super(r14, r15, r16, r17, r18, "WA|471011608249857|4b543e9203c0b420cb5617b71ff0b80a", (Map) null, r23, r24, 6295637663798499L);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
        A06(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }
}
