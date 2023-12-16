package X;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1eS  reason: invalid class name and case insensitive filesystem */
public final class C27731eS extends AnonymousClass3PA {
    public final C57082t3 A00;
    public final AnonymousClass32U A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27731eS(C57082t3 r2, C66383Le r3, AnonymousClass32U r4) {
        super(r3);
        C162457s7.A0J(r3, 3);
        this.A00 = r2;
        this.A01 = r4;
    }

    public static final void A00(AnonymousClass1A3 r4, C30451mT r5) {
        C162457s7.A0J(r5, 0);
        if (r5.A00 != 0) {
            C130546c9 A0K = C18300x5.A0K(C21211Ay.DEFAULT_INSTANCE);
            C21211Ay r2 = (C21211Ay) A0K.A00;
            r2.bitField0_ |= 1;
            r2.pollInvalidated_ = true;
            AnonymousClass1ES A0X = C18310x6.A0X(r4);
            C21211Ay r0 = (C21211Ay) A0K.A06();
            r0.getClass();
            A0X.pollAdditionalMetadata_ = r0;
            A0X.bitField0_ |= Integer.MIN_VALUE;
        }
    }

    public C624134x A01(C50972j4 r3, AnonymousClass1ES r4, C624134x r5) {
        C30451mT r52;
        if (!(r5 instanceof C30451mT) || (r52 = (C30451mT) r5) == null) {
            throw AnonymousClass24W.A00(0);
        }
        A03(r4, r52);
        return r52;
    }

    public final void A02(C52952mJ r9, AnonymousClass1A3 r10, C624134x r11) {
        List<C30331mH> list;
        boolean z = r9.A03;
        C18260x0.A1D("FMessagePollHistorySync/maybeAddPollVotes=", AnonymousClass001.A0o(), z);
        if ((r11 instanceof C30451mT) && AnonymousClass000.A1U(r11.A08 & 2, 2) && z && (list = ((C30451mT) r11).A04) != null) {
            for (C30331mH r2 : list) {
                C162457s7.A0K(r2, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessagePollVote");
                C30591mh r5 = (C30591mh) r2;
                C130546c9 A0G = AnonymousClass1DO.DEFAULT_INSTANCE.A0G();
                C207619f r3 = (C207619f) AnonymousClass1A9.DEFAULT_INSTANCE.A0G();
                List list2 = r5.A01;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        r3.A09(AnonymousClass0x9.A0J(Base64.decode(AnonymousClass001.A0m(it), 2)));
                    }
                    AnonymousClass1A1 A002 = C57082t3.A00(r2);
                    AnonymousClass1DO r1 = (AnonymousClass1DO) C18320x8.A0C(A0G);
                    AnonymousClass1A9 r0 = (AnonymousClass1A9) r3.A06();
                    r0.getClass();
                    r1.vote_ = r0;
                    r1.bitField0_ |= 2;
                    AnonymousClass1DO r12 = (AnonymousClass1DO) C18320x8.A0C(A0G);
                    r12.pollUpdateMessageKey_ = C18290x4.A0V(A002);
                    r12.bitField0_ |= 1;
                    long j = r5.A00;
                    AnonymousClass1DO r13 = (AnonymousClass1DO) C18320x8.A0C(A0G);
                    r13.bitField0_ |= 4;
                    r13.senderTimestampMs_ = j;
                    if (r5.A0D != 17) {
                        AnonymousClass1DO r22 = (AnonymousClass1DO) C18320x8.A0C(A0G);
                        r22.bitField0_ |= 16;
                        r22.unread_ = true;
                    }
                    AnonymousClass1ES A0X = C18310x6.A0X(r10);
                    C130786cX A06 = A0G.A06();
                    A06.getClass();
                    C188248ya r14 = A0X.pollUpdates_;
                    if (!((AnonymousClass8T6) r14).A00) {
                        r14 = C130786cX.A07(r14);
                        A0X.pollUpdates_ = r14;
                    }
                    r14.add(A06);
                }
            }
        }
    }

    public final void A03(AnonymousClass1ES r18, C30451mT r19) {
        C30451mT r2 = r19;
        C162457s7.A0J(r2, 1);
        AnonymousClass1ES r4 = r18;
        if (r4.pollUpdates_.size() > 0) {
            ArrayList A0s = AnonymousClass001.A0s();
            C52042kn r11 = new C52042kn(r2.A0o(), r2.A1J);
            long j = r2.A1L;
            long A002 = AnonymousClass32U.A00(r4);
            for (AnonymousClass1DO r3 : r4.pollUpdates_) {
                ArrayList A0s2 = AnonymousClass001.A0s();
                AnonymousClass1A9 r0 = r3.vote_;
                if (r0 == null) {
                    r0 = AnonymousClass1A9.DEFAULT_INSTANCE;
                }
                for (C172548Lq A0d : r0.selectedOptions_) {
                    String A0d2 = C18320x8.A0d(A0d, 2);
                    C162457s7.A0H(A0d2);
                    A0s2.add(A0d2);
                }
                AnonymousClass1ET r02 = r3.pollUpdateMessageKey_;
                if (r02 == null) {
                    r02 = AnonymousClass1ET.DEFAULT_INSTANCE;
                }
                C162457s7.A0D(r02);
                C30591mh r7 = new C30591mh(A002, AnonymousClass32U.A01(r02), r11, (List) A0s2, j, r3.senderTimestampMs_);
                C106405Yw r42 = C95814uZ.A00;
                AnonymousClass1ET r03 = r3.pollUpdateMessageKey_;
                if (r03 == null) {
                    r03 = AnonymousClass1ET.DEFAULT_INSTANCE;
                }
                r7.A1J(r42.A05(r03.participant_));
                if (!r3.unread_) {
                    r7.A1G(17);
                }
                A0s.add(r7);
            }
            r2.A1v(A0s);
            C624134x.A0K(r2, 2);
        }
    }

    public void AyB(C52952mJ r5, AnonymousClass1A3 r6, C624134x r7) {
        C30451mT r1;
        C18270x1.A14(r7, r6);
        C162457s7.A0J(r5, 2);
        if (!(r7 instanceof C30451mT) || (r1 = (C30451mT) r7) == null) {
            throw AnonymousClass24A.A00(0);
        }
        super.AyB(r5, r6, r7);
        if (AnonymousClass000.A1U(r1.A08 & 2, 2)) {
            A02(r5, r6, r1);
        }
        A00(r6, r1);
    }
}
