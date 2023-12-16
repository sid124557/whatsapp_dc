package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.UserJid;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1Ud  reason: invalid class name and case insensitive filesystem */
public final class C23651Ud extends C56672sN {
    public static final AtomicInteger A00 = new AtomicInteger(SearchActionVerificationClientService.NOTIFICATION_ID);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23651Ud(X.C56612sH r13, X.C54292oU r14, X.AnonymousClass33p r15, X.AnonymousClass1VX r16, X.AnonymousClass4FV r17, X.AnonymousClass2WM r18, X.C84084Ay r19, X.AnonymousClass8JP r20, X.C186568vZ r21, X.AnonymousClass4FS r22) {
        /*
            r12 = this;
            r1 = r13
            r2 = r14
            r3 = r15
            r5 = r17
            r10 = r22
            X.C18260x0.A0f(r13, r14, r10, r5, r15)
            r7 = r19
            r8 = r20
            r9 = r21
            X.C18260x0.A0W(r9, r7, r8)
            r0 = 10
            r4 = r16
            X.C162457s7.A0J(r4, r0)
            r11 = 200743350(0xbf719b6, float:9.5179625E-32)
            r0 = r12
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23651Ud.<init>(X.2sH, X.2oU, X.33p, X.1VX, X.4FV, X.2WM, X.4Ay, X.8JP, X.8vZ, X.4FS):void");
    }

    public final int A0C(UserJid userJid, String str) {
        int andIncrement = A00.getAndIncrement();
        A02(andIncrement, "extensionMetadataPerfTracker");
        String A002 = this.A04.A00(userJid);
        C162457s7.A0D(A002);
        A04(andIncrement, "biz_jid", A002);
        A04(andIncrement, "fetch_context", str);
        A09(Integer.valueOf(andIncrement), "fetch_start");
        return andIncrement;
    }

    public final void A0D(int i, String str) {
        if (str != null && str.length() != 0) {
            A04(i, "metadata_network_fetch_reason", str);
        }
    }

    public final void A0E(Integer num, Short sh) {
        short s;
        if (num != null) {
            A09(num, "fetch_end");
            int intValue = num.intValue();
            if (sh != null) {
                s = sh.shortValue();
            } else {
                s = 51;
            }
            A06(intValue, s);
        }
    }

    public final void A0F(Integer num, String str, String str2) {
        if (num != null) {
            if (!(str == null || str.length() == 0)) {
                A04(num.intValue(), "metadata_error_key", str);
            }
            if (str2 != null && str2.length() != 0) {
                A04(num.intValue(), "metadata_error_message", str2);
            }
        }
    }
}
