package X;

import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.1Uc  reason: invalid class name */
public final class AnonymousClass1Uc extends C56672sN {
    public final AnonymousClass2O2 A00;
    public final List A01 = AnonymousClass001.A0s();
    public final List A02 = AnonymousClass001.A0s();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1Uc(X.C56612sH r15, X.C54292oU r16, X.AnonymousClass33p r17, X.AnonymousClass2O2 r18, X.AnonymousClass1VX r19, X.AnonymousClass4FV r20, X.AnonymousClass2WM r21, X.C84084Ay r22, X.AnonymousClass8JP r23, X.C186568vZ r24, X.AnonymousClass4FS r25) {
        /*
            r14 = this;
            r3 = r15
            r4 = r16
            r5 = r17
            r7 = r20
            r12 = r25
            X.C18260x0.A0f(r15, r4, r12, r7, r5)
            r9 = r22
            r10 = r23
            r11 = r24
            X.C18260x0.A0W(r11, r9, r10)
            r0 = 10
            r6 = r19
            X.C162457s7.A0J(r6, r0)
            r0 = 11
            r1 = r18
            X.C162457s7.A0J(r1, r0)
            r13 = 200750681(0xbf73659, float:9.522271E-32)
            r2 = r14
            r8 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.A00 = r1
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r14.A02 = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r14.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Uc.<init>(X.2sH, X.2oU, X.33p, X.2O2, X.1VX, X.4FV, X.2WM, X.4Ay, X.8JP, X.8vZ, X.4FS):void");
    }

    public final void A0C(int i, String str, String str2) {
        C162457s7.A0J(str, 1);
        A04(i, "error_type", str);
        if (str2 != null) {
            A04(i, "error_message", str2);
        }
    }

    public final void A0D(int i, short s) {
        A05(i, "bloks_cache_hit", true);
        A06(i, s);
    }

    public final void A0E(Jid jid, String str, String str2, String str3, String str4, String str5) {
        String obj;
        String str6 = str;
        int hashCode = str.hashCode();
        if (!((AnonymousClass316) this.A06.getValue()).A0D.isMarkerOn(this.A00, hashCode)) {
            A02(hashCode, str4);
            A07(jid, str2, str3, str6, hashCode);
            if (!(!this.A03.A0Y(C58422vE.A02, 6551) || this.A00.A01.get(str2) == null || (obj = C18290x4.A0Z().toString()) == null)) {
                A04(hashCode, "flow_entry_point", obj);
            }
            if (str5 != null && str5.length() != 0) {
                A04(hashCode, "rendering_stack", str5);
            }
        }
    }
}
