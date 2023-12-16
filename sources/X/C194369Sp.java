package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9Sp  reason: invalid class name and case insensitive filesystem */
public class C194369Sp {
    public String A00;
    public final Context A01;
    public final AnonymousClass4FU A02;
    public final C69263Wi A03;
    public final C56972sr A04;
    public final C195909Zz A05;
    public final C1907099n A06;
    public final AnonymousClass9U4 A07;
    public final C1901794j A08;
    public final Runnable A09;
    public final Runnable A0A;
    public final boolean A0B;

    public void A00(C95814uZ r20, C624134x r21, String str, String str2, int i, boolean z) {
        C69263Wi r2;
        Context context;
        int i2;
        int i3 = i;
        if (i3 == 5) {
            r2 = this.A03;
            context = this.A01;
            i2 = R.string.f11nameremoved;
        } else if (i3 == 3) {
            r2 = this.A03;
            context = this.A01;
            i2 = R.string.f11nameremoved;
        } else if (i3 == 1) {
            r2 = this.A03;
            context = this.A01;
            i2 = R.string.f11nameremoved;
        } else {
            C69263Wi r7 = this.A03;
            AnonymousClass9U4 r8 = this.A07;
            C95814uZ r13 = r20;
            C624134x r15 = r21;
            String str3 = str;
            String str4 = str2;
            boolean z2 = z;
            AnonymousClass9TK r4 = new AnonymousClass9TK(this.A01, this.A02, r7, r8, this.A08, new C201409k1(r13, this, r15, str3, str4, z2), new C199749hB(this), this.A0B);
            UserJid A032 = AnonymousClass32Y.A03(r13);
            if (A032 == null || !r4.A02()) {
                A01(r13, r15, str3, str4, z2);
                return;
            } else {
                r4.A00(A032, new C204829pz(this, 2), str4);
                return;
            }
        }
        r2.A0P(context.getString(i2), 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r11.A04.A0a(r13.A0P.A0E) == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C95814uZ r12, X.C624134x r13, java.lang.String r14, java.lang.String r15, boolean r16) {
        /*
            r11 = this;
            if (r13 == 0) goto L_0x0019
            X.34w r0 = r13.A0P
            if (r0 == 0) goto L_0x0019
            boolean r0 = r0.A0K()
            if (r0 == 0) goto L_0x0019
            X.2sr r1 = r11.A04
            X.34w r0 = r13.A0P
            com.whatsapp.jid.UserJid r0 = r0.A0E
            boolean r0 = r1.A0a(r0)
            r6 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r6 = 0
        L_0x001a:
            X.99n r10 = r11.A06
            X.9Zz r0 = r11.A05
            android.content.Context r3 = r11.A01
            java.lang.String r1 = r11.A00
            r4 = 0
            android.content.Intent r2 = r0.A01(r3, r6, r4)
            java.lang.String r0 = "referral_screen"
            r2.putExtra(r0, r15)
            java.lang.String r0 = "extra_payment_note"
            r2.putExtra(r0, r14)
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.String r7 = "upiHandle"
            java.lang.String r5 = "extra_payment_handle"
            if (r13 == 0) goto L_0x00b2
            java.lang.String r0 = "extra_conversation_message_type"
            r1 = 2
            r2.putExtra(r0, r1)
            X.4uZ r0 = r13.A0n()
            com.whatsapp.jid.UserJid r9 = X.AnonymousClass32Y.A03(r0)
            int r0 = r10.A05(r9)
            if (r0 != r1) goto L_0x006d
            java.lang.String r1 = "extra_receiver_jid"
            java.lang.String r0 = X.C627336j.A07(r9)
            r2.putExtra(r1, r0)
            X.34w r0 = r13.A0P
            if (r0 == 0) goto L_0x006d
            X.1S4 r0 = r0.A0A
            if (r0 == 0) goto L_0x006d
            X.3QD r1 = X.AnonymousClass3QD.A00()
            java.lang.String r0 = r0.A0L()
            X.7yt r0 = X.C1899693i.A0F(r1, r8, r0, r7)
            r2.putExtra(r5, r0)
        L_0x006d:
            long r0 = r13.A1L
            java.lang.String r5 = "extra_quoted_msg_row_id"
            r2.putExtra(r5, r0)
            if (r6 == 0) goto L_0x009b
            X.2z0 r0 = r13.A1J
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "extra_request_message_key"
            r2.putExtra(r0, r1)
            X.34w r0 = r13.A0P
            X.C626936e.A06(r0)
            X.34w r0 = r13.A0P
            X.39Q r0 = r0.A08
            X.C626936e.A06(r0)
            X.34w r0 = r13.A0P
            X.39Q r0 = r0.A08
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "extra_payment_preset_amount"
            r2.putExtra(r0, r1)
            r2.putExtra(r5, r4)
        L_0x009b:
            java.lang.String r0 = "extra_should_open_transaction_detail_after_send_override"
            r1 = r16
            r2.putExtra(r0, r1)
            java.lang.String r0 = "extra_jid"
            X.AnonymousClass0x2.A0u(r2, r12, r0)
            r3.startActivity(r2)
            java.lang.Runnable r0 = r11.A0A
            if (r0 == 0) goto L_0x00b1
            r0.run()
        L_0x00b1:
            return
        L_0x00b2:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x009b
            X.7yt r0 = X.C1899593h.A0C(r1, r7)
            r2.putExtra(r5, r0)
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194369Sp.A01(X.4uZ, X.34x, java.lang.String, java.lang.String, boolean):void");
    }

    public C194369Sp(Context context, AnonymousClass4FU r2, C69263Wi r3, C56972sr r4, C195909Zz r5, C1907099n r6, AnonymousClass9U4 r7, C1901794j r8, Runnable runnable, Runnable runnable2, boolean z) {
        this.A01 = context;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
        this.A07 = r7;
        this.A06 = r6;
        this.A08 = r8;
        this.A05 = r5;
        this.A0B = z;
        this.A0A = runnable;
        this.A09 = runnable2;
    }
}
