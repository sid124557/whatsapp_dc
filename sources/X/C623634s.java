package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* renamed from: X.34s  reason: invalid class name and case insensitive filesystem */
public class C623634s {
    public AnonymousClass1E1 A00;

    public C59892xf A04() {
        try {
            AnonymousClass1E1 r1 = this.A00;
            if ((r1.bitField0_ & 4) != 0) {
                return new C59892xf(r1.remoteIdentityPublic_.A07());
            }
            return null;
        } catch (AnonymousClass24R e) {
            A02(e);
            return null;
        }
    }

    public static C130546c9 A00(C623634s r0) {
        C130546c9 A0H = r0.A00.A0H();
        A0H.A07();
        return A0H;
    }

    public static void A02(Throwable th) {
        String str = "";
        Throwable th2 = th;
        while (true) {
            if (!(th2 instanceof UnknownHostException)) {
                th2 = th2.getCause();
                if (th2 == null) {
                    StringWriter stringWriter = new StringWriter();
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    th.printStackTrace(printWriter);
                    printWriter.flush();
                    str = stringWriter.toString();
                    break;
                }
            } else {
                break;
            }
        }
        if (C379124n.A00 != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("SignalProtocolLogger (");
            A0o.append("SessionRecordV2");
            C18260x0.A0t("): ", str, A0o);
        }
    }

    public C59892xf A03() {
        try {
            return new C59892xf(this.A00.localIdentityPublic_.A07());
        } catch (AnonymousClass24R e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public C60112y1 A05() {
        AnonymousClass1E1 r2 = this.A00;
        C21741Cz r0 = r2.senderChain_;
        if (r0 == null) {
            r0 = C21741Cz.DEFAULT_INSTANCE;
        }
        C21391Bq r1 = r0.chainKey_;
        if (r1 == null) {
            r1 = C21391Bq.DEFAULT_INSTANCE;
        }
        int i = r2.sessionVersion_;
        if (i == 0) {
            i = 2;
        }
        return new C60112y1(C60352yQ.A00(i), r1.key_.A07(), r1.index_);
    }

    public final C48832fY A06(AnonymousClass3ZK r6) {
        int i = 0;
        for (C21741Cz r2 : this.A00.receiverChains_) {
            try {
                if (C616431q.A00(r2.senderRatchetKey_).equals(r6)) {
                    return new C48832fY(r2, Integer.valueOf(i));
                }
                i++;
            } catch (AnonymousClass24R e) {
                A02(e);
            }
        }
        return null;
    }

    public void A07(C59892xf r5) {
        C130546c9 A0H = this.A00.A0H();
        C172548Lq A09 = C18270x1.A09(A0H, r5.A00.A00());
        AnonymousClass1E1 r1 = (AnonymousClass1E1) A0H.A00;
        r1.bitField0_ |= 2;
        r1.localIdentityPublic_ = A09;
        A01(A0H, this);
    }

    public void A08(C59892xf r5) {
        C130546c9 A0H = this.A00.A0H();
        C172548Lq A09 = C18270x1.A09(A0H, r5.A00.A00());
        AnonymousClass1E1 r1 = (AnonymousClass1E1) A0H.A00;
        r1.bitField0_ |= 4;
        r1.remoteIdentityPublic_ = A09;
        A01(A0H, this);
    }

    public void A09(AnonymousClass3ZK r7, C60112y1 r8) {
        byte[] bArr = r8.A02;
        C21391Bq A002 = C208919s.A00(r8, (C208919s) C21391Bq.DEFAULT_INSTANCE.A0G(), bArr, bArr.length);
        C208219l r3 = (C208219l) C21741Cz.DEFAULT_INSTANCE.A0G();
        r3.A09(A002);
        C172548Lq A0H = C18280x3.A0H(r3, r7.A00());
        C21741Cz r1 = (C21741Cz) r3.A00;
        r1.bitField0_ |= 1;
        r1.senderRatchetKey_ = A0H;
        C130786cX A06 = r3.A06();
        C130546c9 A003 = A00(this);
        AnonymousClass1E1 r2 = (AnonymousClass1E1) A003.A00;
        A06.getClass();
        C188248ya r12 = r2.receiverChains_;
        if (!((AnonymousClass8T6) r12).A00) {
            r12 = C130786cX.A07(r12);
            r2.receiverChains_ = r12;
        }
        r12.add(A06);
        AnonymousClass1E1 r0 = (AnonymousClass1E1) A003.A06();
        this.A00 = r0;
        if (r0.receiverChains_.size() > 5) {
            C130546c9 A004 = A00(this);
            AnonymousClass1E1 r22 = (AnonymousClass1E1) A004.A00;
            C188248ya r13 = r22.receiverChains_;
            if (!((AnonymousClass8T6) r13).A00) {
                r13 = C130786cX.A07(r13);
                r22.receiverChains_ = r13;
            }
            r13.remove(0);
            A01(A004, this);
        }
    }

    public void A0A(C42012Ml r6, C60112y1 r7) {
        byte[] bArr = r7.A02;
        C21391Bq A002 = C208919s.A00(r7, (C208919s) C21391Bq.DEFAULT_INSTANCE.A0G(), bArr, bArr.length);
        C208219l r3 = (C208219l) C21741Cz.DEFAULT_INSTANCE.A0G();
        C172548Lq A0H = C18280x3.A0H(r3, r6.A01.A00());
        C21741Cz r1 = (C21741Cz) r3.A00;
        r1.bitField0_ |= 1;
        r1.senderRatchetKey_ = A0H;
        C172548Lq A0H2 = C18280x3.A0H(r3, r6.A00.A00);
        C21741Cz r12 = (C21741Cz) r3.A00;
        r12.bitField0_ |= 2;
        r12.senderRatchetKeyPrivate_ = A0H2;
        r3.A09(A002);
        C21741Cz r0 = (C21741Cz) r3.A06();
        C130546c9 A003 = A00(this);
        AnonymousClass1E1 r13 = (AnonymousClass1E1) A003.A00;
        r0.getClass();
        r13.senderChain_ = r0;
        r13.bitField0_ |= 32;
        A01(A003, this);
    }

    public void A0B(AnonymousClass2ZD r5) {
        C130546c9 A0H = this.A00.A0H();
        C172548Lq A09 = C18270x1.A09(A0H, r5.A01);
        AnonymousClass1E1 r1 = (AnonymousClass1E1) A0H.A00;
        r1.bitField0_ |= 8;
        r1.rootKey_ = A09;
        A01(A0H, this);
    }

    public void A0C(byte[] bArr) {
        C130546c9 A0H = this.A00.A0H();
        C172548Lq A09 = C18270x1.A09(A0H, bArr);
        AnonymousClass1E1 r1 = (AnonymousClass1E1) A0H.A00;
        r1.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        r1.aliceBaseKey_ = A09;
        A01(A0H, this);
    }

    public C623634s(C623634s r2) {
        A01(r2.A00.A0H(), this);
    }

    public static void A01(C130546c9 r0, C623634s r1) {
        r1.A00 = (AnonymousClass1E1) r0.A06();
    }

    public C623634s(AnonymousClass1E1 r1) {
        this.A00 = r1;
    }

    public C623634s() {
        A01(AnonymousClass1E1.DEFAULT_INSTANCE.A0G(), this);
    }
}
