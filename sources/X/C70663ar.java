package X;

import com.whatsapp.calling.service.OutgoingSignalingHandler;
import com.whatsapp.jid.Jid;
import com.whatsapp.notification.DirectReplyService;
import com.whatsapp.protocol.VoipStanzaChildNode;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.3ar  reason: invalid class name and case insensitive filesystem */
public class C70663ar implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public final int A05;

    public C70663ar(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = obj3;
    }

    public final void run() {
        String str;
        AnonymousClass2z0 r6;
        C50182hl r5;
        C30251m9 r4;
        AnonymousClass39W A0Y;
        AnonymousClass39P r0;
        switch (this.A05) {
            case 0:
                C95814uZ r3 = (C95814uZ) this.A00;
                String str2 = this.A03;
                String str3 = this.A04;
                AnonymousClass2z0 A032 = AnonymousClass2z0.A03(r3, str2);
                C50182hl r42 = ((C50292hw) this.A01).A03;
                C18260x0.A1P(AnonymousClass001.A0o(), "BonsaiWelcomeMessageHelperImpl/sendBotFeedbackMsg jid=", r3);
                C56612sH r2 = r42.A04;
                C30251m9 r1 = new C30251m9(AnonymousClass2z0.A05(r3, AnonymousClass35J.A02(r42.A01, r2), true), r2.A0H());
                r1.A02 = (AnonymousClass23M) this.A02;
                r1.A04 = str3;
                r1.A03 = A032;
                r42.A06.A0V(r1);
                return;
            case 1:
                C95814uZ r22 = (C95814uZ) this.A00;
                String str4 = this.A03;
                str = this.A04;
                r6 = AnonymousClass2z0.A03(r22, str4);
                r5 = ((C50292hw) this.A01).A03;
                C18260x0.A1P(AnonymousClass001.A0o(), "BonsaiWelcomeMessageHelperImpl/sendBotFeedbackPositiveMsg jid=", r22);
                C56612sH r32 = r5.A04;
                r4 = new C30251m9(AnonymousClass2z0.A05(r22, AnonymousClass35J.A02(r5.A01, r32), true), r32.A0H());
                Iterator it = ((AbstractCollection) this.A02).iterator();
                long j = 0;
                while (it.hasNext()) {
                    j += (long) ((AnonymousClass22Q) it.next()).value;
                }
                r4.A01 = j;
                break;
            case 2:
                C95814uZ r23 = (C95814uZ) this.A00;
                String str5 = this.A03;
                str = this.A04;
                r6 = AnonymousClass2z0.A03(r23, str5);
                r5 = ((C50292hw) this.A01).A03;
                C18260x0.A1P(AnonymousClass001.A0o(), "BonsaiWelcomeMessageHelperImpl/sendBotFeedbackNegativeMsg jid=", r23);
                C56612sH r33 = r5.A04;
                r4 = new C30251m9(AnonymousClass2z0.A05(r23, AnonymousClass35J.A02(r5.A01, r33), true), r33.A0H());
                Iterator it2 = ((AbstractCollection) this.A02).iterator();
                long j2 = 0;
                while (it2.hasNext()) {
                    j2 += (long) ((AnonymousClass236) it2.next()).value;
                }
                r4.A00 = j2;
                break;
            case 3:
                ((OutgoingSignalingHandler) this.A00).lambda$sendCallStanza$0((Jid) this.A01, this.A03, this.A04, (VoipStanzaChildNode) this.A02);
                return;
            case 4:
                String str6 = this.A03;
                String str7 = this.A04;
                C66543Lv r52 = (C66543Lv) this.A01;
                C624134x A012 = C55832qz.A01(C18310x6.A0S(str7), (C55832qz) this.A02, str6, false);
                if (A012 != null && C40802Hu.A01(A012) != null) {
                    for (C46532bn r02 : C40802Hu.A01(A012).A02) {
                        r02.A00 = true;
                    }
                } else if ((A012 instanceof AnonymousClass4DV) && (A0Y = AnonymousClass0x9.A0Y(A012)) != null && A0Y.A00 == 5 && (r0 = A0Y.A03) != null) {
                    for (AnonymousClass395 r03 : r0.A03) {
                        r03.A00 = true;
                    }
                } else {
                    return;
                }
                r52.A0Y(A012);
                return;
            default:
                C65093Ge r34 = (C65093Ge) this.A01;
                DirectReplyService.A02((AnonymousClass3ZH) this.A02, r34, (DirectReplyService) this.A00, this.A03, this.A04);
                return;
        }
        r4.A04 = str;
        r4.A03 = r6;
        r5.A06.A0V(r4);
    }
}
