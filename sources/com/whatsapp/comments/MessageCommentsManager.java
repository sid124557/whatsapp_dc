package com.whatsapp.comments;

import X.AnonymousClass001;
import X.AnonymousClass1A4;
import X.AnonymousClass1ES;
import X.AnonymousClass1EU;
import X.AnonymousClass1VX;
import X.AnonymousClass218;
import X.AnonymousClass24A;
import X.AnonymousClass2z0;
import X.AnonymousClass4F4;
import X.AnonymousClass4FS;
import X.C130546c9;
import X.C162457s7;
import X.C172548Lq;
import X.C18260x0;
import X.C18280x3;
import X.C18290x4;
import X.C18320x8;
import X.C21851Dk;
import X.C29431io;
import X.C30211m5;
import X.C30221m6;
import X.C30351mJ;
import X.C370920x;
import X.C49092fy;
import X.C49822h9;
import X.C52042kn;
import X.C53612nN;
import X.C53912ns;
import X.C54602oz;
import X.C55162pu;
import X.C55682qk;
import X.C55832qz;
import X.C56972sr;
import X.C58422vE;
import X.C59022wD;
import X.C61142zm;
import X.C616131n;
import X.C624134x;
import X.C66543Lv;
import X.C73723fy;
import X.C73853gB;
import X.C84814Du;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Set;

public final class MessageCommentsManager implements AnonymousClass4F4 {
    public static final Set A0D;
    public final C55682qk A00;
    public final C56972sr A01;
    public final C66543Lv A02;
    public final C53612nN A03;
    public final C61142zm A04;
    public final C29431io A05;
    public final C49822h9 A06;
    public final AnonymousClass1VX A07;
    public final C54602oz A08;
    public final C49092fy A09;
    public final C55832qz A0A;
    public final AnonymousClass4FS A0B;
    public final C73853gB A0C;

    public void Bh1(C624134x r8, byte[] bArr) {
        C52042kn A022;
        if (C624134x.A0g(r8)) {
            boolean A0Y = this.A07.A0Y(C58422vE.A02, 5141);
            C55162pu A0t = r8.A0t();
            if (A0t == null || (A022 = A0t.A02()) == null) {
                throw new AnonymousClass24A(0, (String) null);
            }
            C624134x A052 = this.A0A.A05(A022.A01);
            if (A052 == null) {
                BEv(r8, bArr);
                return;
            }
            if (!A052.A1r(16)) {
                A052.A1P |= (long) 16;
                this.A02.A0Y(A052);
            }
            if (!(r8 instanceof C30351mJ) || A0Y) {
                C30211m5.A00(r8, C52042kn.A00(A052), A052.A1L);
            } else {
                r8.A1N((C55162pu) null);
            }
        }
    }

    public void Bh2(AnonymousClass1ES r6, C624134x r7) {
        C162457s7.A0J(r6, 1);
        AnonymousClass1EU r0 = r6.message_;
        if (r0 == null) {
            r0 = AnonymousClass1EU.DEFAULT_INSTANCE;
        }
        AnonymousClass1A4 r4 = (AnonymousClass1A4) r0.A0H();
        C130546c9 A0G = C21851Dk.DEFAULT_INSTANCE.A0G();
        C172548Lq r2 = r6.messageSecret_;
        C21851Dk r1 = (C21851Dk) C18320x8.A0C(A0G);
        r2.getClass();
        r1.bitField0_ |= 4;
        r1.messageSecret_ = r2;
        AnonymousClass1A4.A04(A0G, r4);
        Bh1(r7, C18290x4.A1Z(r4));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A00(X.C624134x r10, X.C84814Du r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C74383h2
            if (r0 == 0) goto L_0x0084
            r6 = r11
            X.3h2 r6 = (X.C74383h2) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0084
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r7 = 1
            r4 = 0
            if (r0 == 0) goto L_0x003a
            if (r0 != r7) goto L_0x008a
            java.lang.Object r3 = r6.L$1
            X.2pu r3 = (X.C55162pu) r3
            java.lang.Object r0 = r6.L$0
            com.whatsapp.comments.MessageCommentsManager r0 = (com.whatsapp.comments.MessageCommentsManager) r0
            X.C57682u2.A01(r1)
        L_0x0029:
            X.2qz r1 = r0.A0A
            if (r3 == 0) goto L_0x0035
            X.2kn r0 = r3.A02()
            if (r0 == 0) goto L_0x0035
            X.2z0 r4 = r0.A01
        L_0x0035:
            X.34x r0 = r1.A05(r4)
            return r0
        L_0x003a:
            X.C57682u2.A01(r1)
            X.2pu r8 = r10.A0t()
            X.2oz r3 = r9.A08
            java.util.Set r2 = A0D
            r1 = 0
            X.C162457s7.A0J(r2, r1)
            X.2kE r0 = new X.2kE
            r0.<init>(r2, r1)
            r3.A00(r0, r10)
            X.2pu r3 = r10.A0t()
            if (r8 != 0) goto L_0x0077
            if (r3 == 0) goto L_0x0077
            r0 = 40
        L_0x005b:
            java.lang.Integer r0 = X.AnonymousClass0x9.A0k(r0)
            int r2 = r0.intValue()
            X.3gB r1 = r9.A0C
            com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForComment$2$1 r0 = new com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForComment$2$1
            r0.<init>(r9, r10, r4, r2)
            r6.L$0 = r9
            r6.L$1 = r3
            r6.label = r7
            java.lang.Object r0 = X.C616131n.A00(r6, r1, r0)
            if (r0 != r5) goto L_0x0080
            return r5
        L_0x0077:
            boolean r0 = X.C162457s7.A0P(r8, r3)
            if (r0 != 0) goto L_0x0082
            r0 = 39
            goto L_0x005b
        L_0x0080:
            r0 = r9
            goto L_0x0029
        L_0x0082:
            r0 = r9
            goto L_0x0029
        L_0x0084:
            X.3h2 r6 = new X.3h2
            r6.<init>(r9, r11)
            goto L_0x0012
        L_0x008a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.comments.MessageCommentsManager.A00(X.34x, X.4Du):java.lang.Object");
    }

    static {
        C370920x[] values = C370920x.values();
        ArrayList A0s = AnonymousClass001.A0s();
        for (C370920x r1 : values) {
            if (r1 != C370920x.SKIP_COMMENT_INFO) {
                A0s.add(r1);
            }
        }
        A0D = C73723fy.A0P(A0s);
    }

    public MessageCommentsManager(C55682qk r1, C56972sr r2, C66543Lv r3, C53612nN r4, C61142zm r5, C29431io r6, C49822h9 r7, AnonymousClass1VX r8, C54602oz r9, C49092fy r10, C55832qz r11, AnonymousClass4FS r12, C73853gB r13) {
        C18260x0.A0f(r8, r1, r2, r12, r11);
        C18260x0.A0U(r6, r7);
        C18280x3.A15(r5, r3);
        C18260x0.A0Y(r9, r4, r13);
        this.A07 = r8;
        this.A00 = r1;
        this.A01 = r2;
        this.A0B = r12;
        this.A0A = r11;
        this.A05 = r6;
        this.A06 = r7;
        this.A09 = r10;
        this.A04 = r5;
        this.A02 = r3;
        this.A08 = r9;
        this.A03 = r4;
        this.A0C = r13;
    }

    public Object B2Z(C624134x r4, C84814Du r5) {
        int A002;
        if (r4.A0t() == null) {
            this.A03.A01(r4);
        }
        C55162pu A0t = r4.A0t();
        if (A0t != null) {
            A002 = A0t.A01();
        } else {
            A002 = this.A04.A00(r4);
        }
        if (A002 > 0 && r4.A0t() == null) {
            r4.A1N(new C30221m6((Long) null, (Long) null, A002));
            Object A003 = C616131n.A00(r5, this.A0C, new MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessage$2(this, r4, (C84814Du) null));
            if (A003 == AnonymousClass218.COROUTINE_SUSPENDED) {
                return A003;
            }
        }
        return C59022wD.A00;
    }

    public void BEv(C624134x r15, byte[] bArr) {
        C55162pu A0t = r15.A0t();
        if (!C624134x.A0g(r15) || A0t == null) {
            Log.e("MessageCommentsManager/handleCommentOrphan/comment message info is null");
            this.A00.A0A("MessageCommentsManager/handleCommentOrphan/comment message info is null", true, (String) null);
            return;
        }
        C52042kn A022 = A0t.A02();
        if (A022 != null) {
            AnonymousClass2z0 r6 = r15.A1J;
            C162457s7.A0C(r6);
            if (this.A06.A00(new C53912ns(r15.A0n(), A022.A00, r6, A022.A01, (Long) null, bArr, (byte[]) null, 3, r15.A0K)) != 4) {
                Log.e("MessageCommentsManager/handleCommentOrphan/Failed to store orphan message");
                this.A00.A0A("MessageCommentsManager/handleCommentOrphan/Failed to store orphan message", true, (String) null);
                return;
            }
            return;
        }
        Log.e("MessageCommentsManager/handleCommentOrphan/comment message info's parent key is null");
        this.A00.A0A("MessageCommentsManager/handleCommentOrphan/comment message info's parent key is null", true, (String) null);
    }
}
