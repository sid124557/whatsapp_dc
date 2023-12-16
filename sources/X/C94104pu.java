package X;

import android.os.SystemClock;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4pu  reason: invalid class name and case insensitive filesystem */
public class C94104pu extends C94234qR {
    public long A00 = -1;
    public ViewGroup A01;
    public C003203q A02;
    public ArrayList A03;
    public ArrayList A04;
    public final C69263Wi A05;
    public final C56612sH A06;
    public final AnonymousClass1VX A07;
    public final C49552gi A08;
    public final AnonymousClass7IQ A09;
    public final AnonymousClass4FS A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C94104pu(X.C69263Wi r13, X.C56962sq r14, X.C64773Ex r15, X.AnonymousClass5ZU r16, X.C56332ro r17, X.C105365Uq r18, com.whatsapp.conversationslist.ConversationsFragment r19, X.C56612sH r20, X.C620733j r21, X.AnonymousClass1VX r22, X.AnonymousClass4FV r23, X.C49552gi r24, X.AnonymousClass7IQ r25, X.AnonymousClass4FS r26) {
        /*
            r12 = this;
            r11 = r26
            r2 = r12
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r21
            r10 = r23
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -1
            r12.A00 = r0
            r0 = r22
            r12.A07 = r0
            r12.A05 = r13
            r12.A0A = r11
            r0 = r20
            r12.A06 = r0
            r0 = r24
            r12.A08 = r0
            r0 = r25
            r12.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94104pu.<init>(X.3Wi, X.2sq, X.3Ex, X.5ZU, X.2ro, X.5Uq, com.whatsapp.conversationslist.ConversationsFragment, X.2sH, X.33j, X.1VX, X.4FV, X.2gi, X.7IQ, X.4FS):void");
    }

    public void A01() {
        long j = this.A00;
        if (j == -1 || SystemClock.uptimeMillis() > j + C86654Ky.A09(TimeUnit.HOURS)) {
            boolean z = this.A02;
            super.A01();
            if (z) {
                this.A00 = SystemClock.uptimeMillis();
            }
        }
    }

    public void A04(ViewGroup viewGroup, C003203q r14, ArrayList arrayList, int i) {
        String str;
        super.A04(viewGroup, r14, arrayList, i);
        StringBuilder A0o = AnonymousClass001.A0o();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        StringBuilder A0o3 = AnonymousClass001.A0o();
        StringBuilder A0o4 = AnonymousClass001.A0o();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            String str2 = "0";
            if (A0R.A0p) {
                str = "1";
            } else {
                str = "\\";
            }
            String str3 = str2;
            if (A0R.A0m) {
                str3 = "1";
            }
            String str4 = str2;
            if (A0R.A0n) {
                str4 = "1";
            }
            if (A0R.A0h) {
                str2 = "1";
            }
            A0o.append(str);
            A0o2.append(str3);
            A0o3.append(str2);
            A0o4.append(str4);
        }
        C94564rY r1 = new C94564rY();
        r1.A02 = A0o.toString();
        r1.A00 = A0o2.toString();
        r1.A03 = A0o3.toString();
        r1.A01 = A0o4.toString();
        this.A07.BhD(r1);
    }

    public AnonymousClass4s5 A03(AnonymousClass3ZH r3, Long l, int i) {
        AnonymousClass4s5 A032 = super.A03(r3, l, i);
        if (r3 != null) {
            A032.A01 = Boolean.valueOf(r3.A0n);
            A032.A00 = Boolean.valueOf(r3.A0m);
            A032.A02 = Boolean.valueOf(r3.A0p);
            A032.A03 = Boolean.valueOf(r3.A0h);
        }
        return A032;
    }
}
