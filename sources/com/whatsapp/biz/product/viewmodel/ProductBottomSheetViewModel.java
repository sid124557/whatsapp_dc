package com.whatsapp.biz.product.viewmodel;

import X.AnonymousClass08M;
import X.AnonymousClass08N;
import X.AnonymousClass2UT;
import X.AnonymousClass43W;
import X.AnonymousClass4L0;
import X.AnonymousClass5A2;
import X.AnonymousClass5MK;
import X.AnonymousClass5T7;
import X.AnonymousClass5X1;
import X.AnonymousClass5Y9;
import X.AnonymousClass63A;
import X.AnonymousClass74S;
import X.AnonymousClass7OY;
import X.C06270Wx;
import X.C103115Lp;
import X.C104095Pq;
import X.C104325Qn;
import X.C105145Tt;
import X.C105405Uu;
import X.C106945aQ;
import X.C108665dM;
import X.C108755dV;
import X.C109015dw;
import X.C15930sC;
import X.C181728nE;
import X.C181798nL;
import X.C18280x3;
import X.C184048rA;
import X.C29201iR;
import X.C48922fh;
import X.C49732h0;
import X.C56972sr;
import X.C620733j;
import X.C72023d3;
import X.C72063d7;
import X.C87604Ty;
import android.app.Application;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ProductBottomSheetViewModel extends AnonymousClass08N {
    public C87604Ty A00;
    public C109015dw A01;
    public C109015dw A02;
    public C104325Qn A03;
    public UserJid A04;
    public String A05;
    public List A06 = C72023d3.A00;
    public AtomicBoolean A07 = C18280x3.A0l();
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B = true;
    public final Application A0C;
    public final C06270Wx A0D;
    public final C06270Wx A0E;
    public final C06270Wx A0F;
    public final AnonymousClass08M A0G;
    public final AnonymousClass08M A0H;
    public final AnonymousClass08M A0I;
    public final C15930sC A0J;
    public final C15930sC A0K = AnonymousClass4L0.A0G(this, 48);
    public final C56972sr A0L;
    public final AnonymousClass5T7 A0M;
    public final AnonymousClass2UT A0N;
    public final C29201iR A0O;
    public final C104095Pq A0P;
    public final C181728nE A0Q;
    public final C105405Uu A0R;
    public final C105145Tt A0S;
    public final C184048rA A0T;
    public final AnonymousClass5Y9 A0U;
    public final C181798nL A0V;
    public final AnonymousClass5MK A0W;
    public final C49732h0 A0X;
    public final AnonymousClass7OY A0Y;
    public final C106945aQ A0Z;
    public final AnonymousClass5X1 A0a;
    public final C48922fh A0b;
    public final C620733j A0c;
    public final C103115Lp A0d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProductBottomSheetViewModel(android.app.Application r17, X.C56972sr r18, X.AnonymousClass5T7 r19, X.C29201iR r20, X.C104095Pq r21, X.C181728nE r22, X.C105405Uu r23, X.C105145Tt r24, X.AnonymousClass5Y9 r25, X.C181798nL r26, X.AnonymousClass5MK r27, X.C49732h0 r28, X.AnonymousClass7OY r29, X.C106945aQ r30, X.AnonymousClass5X1 r31, X.C48922fh r32, X.C620733j r33, X.C103115Lp r34) {
        /*
            r16 = this;
            r4 = 1
            r15 = r17
            X.C162457s7.A0J(r15, r4)
            r2 = r31
            r10 = r23
            r13 = r19
            r14 = r18
            X.C18260x0.A0e(r10, r14, r13, r2)
            r5 = r30
            r1 = r33
            r0 = r34
            r9 = r24
            r12 = r22
            X.C18260x0.A0g(r1, r12, r9, r0, r5)
            r3 = 11
            r8 = r25
            X.C162457s7.A0J(r8, r3)
            r3 = 15
            r11 = r20
            X.C162457s7.A0J(r11, r3)
            r3 = 16
            r6 = r28
            X.C162457s7.A0J(r6, r3)
            r3 = 18
            r7 = r26
            X.C162457s7.A0J(r7, r3)
            r3 = r16
            r3.<init>(r15)
            r3.A0C = r15
            r3.A0R = r10
            r3.A0L = r14
            r3.A0M = r13
            r3.A0a = r2
            r3.A0c = r1
            r3.A0Q = r12
            r3.A0S = r9
            r3.A0d = r0
            r3.A0Z = r5
            r3.A0U = r8
            r0 = r32
            r3.A0b = r0
            r0 = r29
            r3.A0Y = r0
            r0 = r27
            r3.A0W = r0
            r3.A0O = r11
            r3.A0X = r6
            r0 = r21
            r3.A0P = r0
            r3.A0V = r7
            X.5ik r2 = new X.5ik
            r2.<init>(r3)
            r3.A0T = r2
            r0 = 3
            X.8zs r1 = new X.8zs
            r1.<init>(r3, r0)
            r3.A0N = r1
            java.util.List r0 = r8.A0P
            r0.add(r2)
            r11.A06(r1)
            r0 = 48
            X.92m r0 = X.AnonymousClass4L0.A0G(r3, r0)
            r3.A0K = r0
            X.3d3 r0 = X.C72023d3.A00
            r3.A06 = r0
            r3.A0B = r4
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C18280x3.A0l()
            r3.A07 = r0
            X.08M r0 = X.AnonymousClass08M.A01()
            r3.A0H = r0
            X.0Wx r0 = X.C05110Rz.A01(r0)
            r3.A0E = r0
            X.08M r0 = X.AnonymousClass08M.A01()
            r3.A0G = r0
            r3.A0D = r0
            X.08M r0 = X.AnonymousClass08M.A01()
            r3.A0I = r0
            r3.A0F = r0
            r0 = 49
            X.92m r0 = X.AnonymousClass4L0.A0G(r3, r0)
            r3.A0J = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel.<init>(android.app.Application, X.2sr, X.5T7, X.1iR, X.5Pq, X.8nE, X.5Uu, X.5Tt, X.5Y9, X.8nL, X.5MK, X.2h0, X.7OY, X.5aQ, X.5X1, X.2fh, X.33j, X.5Lp):void");
    }

    public final void A0F(UserJid userJid, String str) {
        Set A002;
        C108755dV r0;
        C108665dM r02;
        List list;
        this.A0A = false;
        this.A0Y.A00 = userJid;
        this.A05 = str;
        this.A04 = userJid;
        C109015dw A082 = this.A0R.A08(userJid, str);
        if (this.A02 != null || !this.A0B) {
            this.A0B = false;
        } else {
            this.A01 = A082;
        }
        this.A02 = A082;
        if (this.A00 == null) {
            C87604Ty Azu = this.A0Q.Azu(userJid);
            this.A00 = Azu;
            Azu.A00.A0E(this.A0J);
            C87604Ty r03 = this.A00;
            if (r03 != null) {
                r03.A0E();
            }
        }
        if (this.A03 == null) {
            C104325Qn Azv = this.A0V.Azv(userJid);
            this.A03 = Azv;
            Azv.A03.A0E(this.A0K);
            C104325Qn r04 = this.A03;
            if (r04 != null) {
                r04.A00();
            }
        }
        C109015dw r05 = this.A02;
        if (!(r05 == null || (r0 = r05.A0B) == null || (r02 = r0.A00) == null || (list = r02.A00) == null || list.isEmpty())) {
            C49732h0 r1 = this.A0X;
            r1.A01(new AnonymousClass43W(r1, true));
        }
        A0D();
        if (this.A0B || !this.A09) {
            A002 = AnonymousClass74S.A00();
        } else {
            A002 = C72063d7.A00;
        }
        this.A0b.A01(userJid, A002, new AnonymousClass63A(this, userJid, str));
    }

    public void A0C() {
        C87604Ty r0 = this.A00;
        if (r0 != null) {
            r0.A00.A0F(this.A0J);
        }
        C104325Qn r02 = this.A03;
        if (r02 != null) {
            r02.A03.A0F(this.A0K);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        if (r0.A0A != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r1.A01() == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D() {
        /*
            r20 = this;
            r0 = r20
            X.5dw r1 = r0.A02
            if (r1 == 0) goto L_0x0092
            boolean r2 = r0.A08
            if (r2 == 0) goto L_0x0011
            boolean r2 = r1.A01()
            r13 = 1
            if (r2 != 0) goto L_0x0012
        L_0x0011:
            r13 = 0
        L_0x0012:
            X.4Ty r4 = r0.A00
            if (r4 == 0) goto L_0x0020
            X.33j r3 = r0.A0c
            java.util.List r2 = r0.A06
            java.lang.String r7 = r4.A0D(r3, r2)
            if (r7 != 0) goto L_0x0022
        L_0x0020:
            java.lang.String r7 = ""
        L_0x0022:
            X.C162457s7.A0H(r7)
            X.5dw r2 = r0.A02
            if (r2 == 0) goto L_0x008f
            long r8 = r2.A09
        L_0x002b:
            X.4Ty r2 = r0.A00
            if (r2 == 0) goto L_0x008c
            java.util.List r3 = r0.A06
            java.lang.String r2 = r1.A0F
            long r10 = X.C87604Ty.A00(r2, r3)
        L_0x0037:
            X.5Pq r3 = r0.A0P
            com.whatsapp.jid.UserJid r2 = r0.A04
            boolean r12 = r3.A00(r2)
            X.08M r2 = r0.A0H
            java.lang.String r6 = r1.A05
            X.C162457s7.A0C(r6)
            java.math.BigDecimal r5 = r1.A06
            X.7ny r4 = r1.A04
            X.5dU r15 = r1.A02
            X.33j r3 = r0.A0c
            java.util.Date r19 = new java.util.Date
            r19.<init>()
            android.app.Application r14 = r0.A0C
            r16 = r4
            r17 = r3
            r18 = r5
            android.text.SpannableString r4 = X.C106945aQ.A01(r14, r15, r16, r17, r18, r19)
            X.5dw r5 = r0.A02
            int r3 = r1.A00
            boolean r14 = X.AnonymousClass000.A1T(r3)
            boolean r15 = r0.A0B
            X.5dV r1 = r1.A0B
            if (r1 == 0) goto L_0x007b
            X.5dM r1 = r1.A00
            if (r1 == 0) goto L_0x007b
            java.util.List r1 = r1.A00
            if (r1 == 0) goto L_0x007b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0081
        L_0x007b:
            boolean r0 = r0.A0A
            r16 = 0
            if (r0 == 0) goto L_0x0083
        L_0x0081:
            r16 = 1
        L_0x0083:
            X.5j5 r3 = new X.5j5
            r3.<init>(r4, r5, r6, r7, r8, r10, r12, r13, r14, r15, r16)
            r2.A0G(r3)
            return
        L_0x008c:
            r10 = 0
            goto L_0x0037
        L_0x008f:
            r8 = 99
            goto L_0x002b
        L_0x0092:
            X.08M r2 = r0.A0H
            boolean r1 = r0.A0B
            X.8Es r0 = new X.8Es
            r0.<init>(r1)
            r2.A0G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel.A0D():void");
    }

    public final void A0E(long j) {
        UserJid userJid;
        C104325Qn r0;
        C109015dw A002 = AnonymousClass5A2.A00(this.A02, this.A01);
        if (A002 != null && (userJid = this.A04) != null && (r0 = this.A03) != null) {
            r0.A01(A002, userJid, (String) null, (String) null, (String) null, j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r1 != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0G(boolean r6) {
        /*
            r5 = this;
            X.5dw r0 = r5.A02
            r2 = 0
            if (r0 == 0) goto L_0x0027
            X.5dV r0 = r0.A0B
            if (r0 == 0) goto L_0x0027
            X.5dM r0 = r0.A00
            if (r0 == 0) goto L_0x0027
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0027
            int r0 = r0.size()
        L_0x0015:
            r4 = 1
            boolean r1 = X.AnonymousClass001.A1W(r0)
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0021
            r3 = 1
            if (r1 == 0) goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            if (r6 != 0) goto L_0x0029
            if (r3 != 0) goto L_0x0029
            return r2
        L_0x0027:
            r0 = 0
            goto L_0x0015
        L_0x0029:
            X.08M r2 = r5.A0G
            android.app.Application r1 = r5.A0C
            r0 = 2131887535(0x7f1205af, float:1.940968E38)
            java.lang.String r1 = X.C18290x4.A0l(r1, r0)
            X.7Y1 r0 = new X.7Y1
            r0.<init>(r1, r3)
            r2.A0G(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel.A0G(boolean):boolean");
    }
}
