package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import com.whatsapp.R;

/* renamed from: X.2iI  reason: invalid class name and case insensitive filesystem */
public class C50512iI {
    public String A00;
    public final C111665iU A01;
    public final AnonymousClass5TW A02;
    public final C113895mA A03;
    public final C620733j A04;
    public final AnonymousClass2WH A05;
    public final C66553Lw A06;
    public final C624134x A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final String A01(C56802sa r4, C56802sa r5, boolean z, boolean z2, boolean z3) {
        boolean z4;
        C116095pj r0;
        if (this.A09) {
            return ((C32501qy) r4).A0B();
        }
        if (!z2 || (Build.VERSION.SDK_INT >= 28 && (!this.A01.A04().A08.isEmpty()))) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean equalsIgnoreCase = "Silent".equalsIgnoreCase(r4.A07());
        if (this.A08 || z || this.A0A || equalsIgnoreCase || !z3 || z4 || (((r0 = this.A03.A00) != null && r0.A11) || this.A05.A00)) {
            return ((C32501qy) r4).A0D();
        }
        if (r5 != null) {
            return ((C32501qy) r5).A0C();
        }
        return ((C32501qy) r4).A0C();
    }

    public C50512iI(C111665iU r1, AnonymousClass5TW r2, C113895mA r3, C620733j r4, AnonymousClass2WH r5, C66553Lw r6, C624134x r7, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = r2;
        this.A04 = r4;
        this.A06 = r6;
        this.A05 = r5;
        this.A03 = r3;
        this.A01 = r1;
        this.A0B = z;
        this.A08 = z2;
        this.A0A = z3;
        this.A07 = r7;
        this.A09 = z4;
    }

    public C05610Ue A00(PendingIntent pendingIntent, PendingIntent pendingIntent2, Context context, AnonymousClass3ZH r25, C56682sO r26, C56802sa r27, C56802sa r28, CharSequence charSequence, CharSequence charSequence2, StringBuilder sb, int i, int i2, boolean z, boolean z2) {
        boolean z3;
        long j;
        String A0X;
        String A0X2;
        String str;
        int i3 = i;
        CharSequence charSequence3 = charSequence;
        boolean A012 = this.A02.A01();
        C56682sO r14 = r26;
        if (this.A07 != null) {
            z3 = true;
            j = System.currentTimeMillis();
        } else {
            z3 = false;
            j = r14.A00.A0K;
        }
        C05610Ue A013 = C66553Lw.A01(context);
        A013.A0B(charSequence2);
        A013.A0A(charSequence3);
        A013.A09 = pendingIntent;
        A013.A07.deleteIntent = pendingIntent2;
        A013.A0J = "msg";
        A013.A05(j);
        C05610Ue A014 = C66553Lw.A01(context);
        A014.A0J = "msg";
        C66553Lw r8 = this.A06;
        Context context2 = r8.A0B.A00;
        C18300x5.A14(context2, A014, R.string.f11nameremoved);
        if (i3 == 1) {
            Object[] objArr = new Object[1];
            C18270x1.A1Q(objArr, i3);
            charSequence3 = this.A04.A0L(objArr, R.plurals.f9nameremoved, (long) i3);
        }
        A014.A0A(charSequence3);
        AnonymousClass33T.A02(A014, R.drawable.notifybar);
        A013.A08 = A014.A01();
        if (this.A0B) {
            if (this.A09) {
                str = "newsletter_key_messages";
            } else {
                str = "group_key_messages";
            }
            A013.A0L = str;
            A013.A0T = true;
        }
        AnonymousClass33T.A02(A013, R.drawable.notifybar);
        boolean z4 = this.A08;
        if (!z4) {
            C624134x r0 = r14.A00;
            AnonymousClass5ZU r9 = r8.A08;
            C95814uZ r12 = r0.A1J.A00;
            AnonymousClass3ZH r10 = r25;
            int A072 = r9.A07(r10, r12);
            if (!r10.A0U()) {
                A0X2 = AnonymousClass002.A0F(context2, r9.A0R(r10, A072, false), new Object[1], 0, R.string.f11nameremoved);
            } else if (r0 instanceof C30341mI) {
                A0X2 = r8.A04.A0O((C30341mI) r0, false);
            } else {
                C95814uZ A0n = r0.A0n();
                if (A0n != null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append(r8.A0K(A0n, r12));
                    A0o.append(" @ ");
                    A0X = AnonymousClass000.A0X(r9.A0R(r10, A072, false), A0o);
                } else {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("getNotificationTicker/missing_rmt_src:");
                    C18260x0.A1K(A0o2, C627636p.A0E(r0));
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    AnonymousClass0x2.A0s(context2, A0o3, R.string.f11nameremoved);
                    A0o3.append(" @ ");
                    A0X = AnonymousClass000.A0X(r9.A0R(r10, A072, false), A0o3);
                }
                A0X2 = AnonymousClass0x2.A0X(context2, A0X, 1, R.string.f11nameremoved);
            }
            A013.A0C(C106815aD.A02(A0X2));
        }
        String A052 = r14.A05();
        if (A052 != null) {
            A013.A0D(A052);
        }
        C56802sa r16 = r27;
        boolean z5 = z;
        if (!z2 && !z4 && !z && !this.A0A && z3) {
            int i4 = 1;
            if (r16.A0A()) {
                i4 = 0;
            }
            A013.A03 = i4;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String A015 = A01(r16, r28, z5, A012, z3);
            this.A00 = A015;
            C626936e.A06(A015);
            String str2 = this.A00;
            A013.A0K = str2;
            A013.A01 = 1;
            A013.A02 = i + i2;
            StringBuilder sb2 = sb;
            sb2.append(" channelId=");
            sb2.append(str2);
        }
        return A013;
    }
}
