package X;

import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.expressions.BaseExpressionsBottomSheet;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;
import com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$createStickerShape$1;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.5aY  reason: invalid class name and case insensitive filesystem */
public class C107015aY implements AnonymousClass4BP {
    public Object A00;
    public final int A01;

    public C107015aY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bci(AnonymousClass39M r15, Integer num, int i) {
        AnonymousClass10k r1;
        AnonymousClass39M r6 = r15;
        Integer num2 = num;
        int i2 = i;
        switch (this.A01) {
            case 0:
                C113245l7 r3 = (C113245l7) this.A00;
                if (!r3.A2z.getWaPermissionsHelper().A0C()) {
                    RequestPermissionActivity.A0i(C113245l7.A09(r3), r3.A41, 812);
                    return;
                } else if (C86604Kt.A1a(r3.A27, r3.A3n)) {
                    C621433s.A01(C113245l7.A09(r3), 106);
                    return;
                } else {
                    r3.A4o.A04(false);
                    C94264qq r0 = r3.A45;
                    if (r0 != null && !r0.isShowing()) {
                        C86644Kx.A1J(r3.A4P);
                    }
                    C621033m A08 = C113245l7.A08(r3);
                    C95814uZ r9 = r3.A4J;
                    C626936e.A06(r9);
                    A08.A0G(r9, r3.A3B.A0G, r15, num2, r3.A6P);
                    if (r3.A5B.A01() && num != null && 7 == num2.intValue() && 1 == C113245l7.A00(r3)) {
                        MentionableEntry mentionableEntry = r3.A4P;
                        if (mentionableEntry != null) {
                            mentionableEntry.selectAll();
                        }
                        C94264qq r12 = r3.A45;
                        if (r12 != null) {
                            r12.A06(r12.A0K);
                        }
                    }
                    r3.A0u();
                    BaseExpressionsBottomSheet baseExpressionsBottomSheet = r3.A3y;
                    if (baseExpressionsBottomSheet != null && baseExpressionsBottomSheet.A04 >= 7) {
                        baseExpressionsBottomSheet.A1K();
                        BaseExpressionsBottomSheet baseExpressionsBottomSheet2 = r3.A3y;
                        if (baseExpressionsBottomSheet2 != null) {
                            ((ExpressionsKeyboardSearchBottomSheet) baseExpressionsBottomSheet2).A0C = null;
                            r3.A3y = null;
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                C104445Qz r2 = (C104445Qz) this.A00;
                AnonymousClass4BP r02 = r2.A03;
                if (r02 != null) {
                    r02.Bci(r15, num2, i2);
                    if (r2.A09.A01() && (r1 = r2.A0A) != null) {
                        AnonymousClass08M r32 = r1.A03;
                        if (r32.A07() != null && !C86634Kw.A1Y(r32)) {
                            C53072mV r22 = r2.A0B;
                            C626936e.A06(r22);
                            r22.A00();
                            C626936e.A06(r1);
                            C626936e.A06(r32.A07());
                            r22.A02(num2.intValue(), i2, C86614Ku.A06(r32));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                AnonymousClass5RA r13 = (AnonymousClass5RA) this.A00;
                AnonymousClass4BP r03 = r13.A04;
                if (r03 != null) {
                    r03.Bci(r15, num2, i2);
                    if (r13.A01()) {
                        C53072mV r33 = r13.A0G;
                        C626936e.A06(r33);
                        r33.A00();
                        AnonymousClass10k r04 = r13.A0F;
                        C626936e.A06(r04);
                        AnonymousClass08M r23 = r04.A03;
                        C626936e.A06(r23.A07());
                        r33.A02(num2.intValue(), i2, C86614Ku.A06(r23));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                C114825nf r24 = (C114825nf) this.A00;
                AnonymousClass2RP r5 = (AnonymousClass2RP) r24.A0Z.get();
                C003203q r4 = r24.A04;
                AnonymousClass08A r14 = r4.A06;
                C1896692e r8 = new C1896692e(r24, 1);
                int A05 = C18300x5.A05(r14, r15, 0);
                C616131n.A02(r5.A03, new ExpressionsShapeCreator$createStickerShape$1(r4, r5, r6, (C84814Du) null, r8), AnonymousClass0IS.A00(r14), (AnonymousClass20D) null, A05);
                return;
            default:
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                if (C86614Ku.A1X(messageReplyActivity.A0O, messageReplyActivity.A0p)) {
                    C621433s.A01(messageReplyActivity, 106);
                    return;
                }
                C621033m r34 = messageReplyActivity.A0I;
                C95814uZ r42 = messageReplyActivity.A0p;
                C626936e.A06(r42);
                r34.A0G(r42, messageReplyActivity.A11, r6, num2, false);
                messageReplyActivity.A79(7);
                return;
        }
    }
}
