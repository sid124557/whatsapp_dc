package X;

import android.content.Context;
import android.view.ViewGroup;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4iP  reason: invalid class name and case insensitive filesystem */
public class C90844iP extends C90254gy implements C181828nP {
    public final C146957Cg A00;
    public final C104975Tb A01;
    public final C181878nU A02;
    public final C184108rG A03;
    public final String A04;
    public final String A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90844iP(X.C111095hX r15, X.C69263Wi r16, X.C56972sr r17, X.AnonymousClass5Y9 r18, X.C146957Cg r19, X.C152967aS r20, X.C104975Tb r21, X.C181878nU r22, X.C184108rG r23, X.C64773Ex r24, X.C56422rx r25, X.AnonymousClass5ZU r26, X.C620733j r27, X.AnonymousClass1VX r28, com.whatsapp.jid.UserJid r29, java.lang.String r30, java.lang.String r31) {
        /*
            r14 = this;
            r2 = r14
            r11 = r27
            r10 = r26
            r9 = r25
            r8 = r24
            r6 = r18
            r5 = r17
            r13 = r29
            r4 = r16
            r12 = r28
            r3 = r15
            r7 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = r23
            r14.A03 = r0
            r0 = r22
            r14.A02 = r0
            r0 = r19
            r14.A00 = r0
            r0 = r31
            r14.A04 = r0
            r0 = r30
            r14.A05 = r0
            r0 = r21
            r14.A01 = r0
            java.util.List r1 = r14.A00
            X.6fE r0 = new X.6fE
            r0.<init>()
            r1.add(r0)
            int r0 = X.AnonymousClass002.A03(r1)
            r14.A07(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90844iP.<init>(X.5hX, X.3Wi, X.2sr, X.5Y9, X.7Cg, X.7aS, X.5Tb, X.8nU, X.8rG, X.3Ex, X.2rx, X.5ZU, X.33j, X.1VX, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String):void");
    }

    public AnonymousClass6J5 A0L(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (i != 5) {
            return super.A0L(viewGroup, i);
        }
        Context context = viewGroup.getContext();
        UserJid userJid = this.A07;
        C56972sr r2 = this.A03;
        C620733j r10 = this.A04;
        C152967aS r4 = this.A05;
        C184108rG r9 = this.A03;
        return AnonymousClass5A3.A00(context, viewGroup2, r2, this.A00, r4, this, this, this.A01, this.A02, r9, r10, userJid);
    }

    public AnonymousClass7KJ B5f(int i) {
        String str;
        if (C18290x4.A0k(this.A00) instanceof AnonymousClass6fG) {
            i--;
        }
        String valueOf = String.valueOf(i);
        String str2 = this.A05;
        if (str2 == null) {
            str = null;
        } else {
            str = this.A04;
        }
        return new AnonymousClass7KJ(str2, valueOf, str);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return A0L(viewGroup, i);
    }
}
