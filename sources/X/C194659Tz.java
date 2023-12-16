package X;

import android.content.Context;
import android.content.DialogInterface;
import com.whatsapp.R;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Tz  reason: invalid class name and case insensitive filesystem */
public abstract class C194659Tz {
    public final int A00;
    public final C111095hX A01;
    public final C50382i5 A02;
    public final C64773Ex A03;
    public final AnonymousClass5ZU A04;
    public final C56612sH A05;
    public final C620733j A06;
    public final AnonymousClass1VX A07;
    public final C195219Wq A08;

    public boolean A02(C194869Uu r8, C194839Ur r9) {
        if (r8 == null) {
            return false;
        }
        if (r9 != null && r8.A08.A01 == r9.A03) {
            int A0N = this.A07.A0N(988);
            long abs = Math.abs(this.A05.A0H() - r9.A02);
            if (A0N < 1 || abs < TimeUnit.HOURS.toMillis((long) A0N)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (android.text.TextUtils.equals(r2, (java.lang.String) X.AnonymousClass001.A0i(r0.A00, r1)) != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(X.C133676hl r7, com.whatsapp.jid.UserJid r8, X.C194869Uu r9) {
        /*
            r6 = this;
            X.3Ex r0 = r6.A03
            X.3ZH r0 = r0.A0A(r8)
            boolean r0 = r0.A0Q()
            if (r0 == 0) goto L_0x0060
            X.9Ui r3 = r9.A0A
            boolean r0 = r3.A01
            r4 = 1
            if (r0 == 0) goto L_0x0039
            r5 = 3
            if (r7 == 0) goto L_0x003a
            X.2xk r0 = r9.A08
            long r0 = r0.A01
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r1 = r6.A00
            X.7g2 r0 = r7.A03
            if (r0 != 0) goto L_0x002b
            X.7g2 r0 = new X.7g2
            r0.<init>()
            r7.A03 = r0
        L_0x002b:
            java.util.Map r0 = r0.A00
            java.lang.Object r0 = X.AnonymousClass001.A0i(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            r5 = 1
        L_0x003a:
            int r3 = r3.A00
            if (r5 != r4) goto L_0x0061
            if (r3 <= 0) goto L_0x0061
            if (r7 == 0) goto L_0x0061
            X.7yL r2 = r7.A04
            if (r2 == 0) goto L_0x0061
            X.2xk r0 = r9.A08
            long r0 = r0.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.util.HashMap r0 = r2.A00
            java.lang.Object r0 = r0.get(r1)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 == 0) goto L_0x0061
            int r0 = r0.size()
            if (r0 < r3) goto L_0x005f
            r4 = 2
        L_0x005f:
            return r4
        L_0x0060:
            r5 = 0
        L_0x0061:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194659Tz.A00(X.6hl, com.whatsapp.jid.UserJid, X.9Uu):int");
    }

    public C194659Tz(C111095hX r1, C50382i5 r2, C64773Ex r3, AnonymousClass5ZU r4, C56612sH r5, C620733j r6, AnonymousClass1VX r7, C195219Wq r8, int i) {
        this.A05 = r5;
        this.A07 = r7;
        this.A02 = r2;
        this.A01 = r1;
        this.A08 = r8;
        this.A04 = r4;
        this.A06 = r6;
        this.A03 = r3;
        this.A00 = i;
    }

    public AnonymousClass043 A01(Context context) {
        C19340zH A002 = AnonymousClass5V0.A00(context);
        A002.A0U(R.string.f11nameremoved);
        A002.A0T(R.string.f11nameremoved);
        A002.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
        A002.A0Y(new C204379pG(context, 6, this), R.string.f11nameremoved);
        return A002.create();
    }
}
