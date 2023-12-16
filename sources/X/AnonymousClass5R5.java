package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.ui.media.MediaCard;
import java.util.HashSet;

/* renamed from: X.5R5  reason: invalid class name */
public final class AnonymousClass5R5 {
    public C30471mV A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final C89644eZ A03;
    public final AnonymousClass5T7 A04;
    public final C105405Uu A05;
    public final C105145Tt A06;
    public final AnonymousClass5X1 A07;
    public final AnonymousClass5ZR A08;
    public final C620733j A09;
    public final AnonymousClass1VX A0A;
    public final C95814uZ A0B;
    public final MediaCard A0C;
    public final C183208pf A0D;
    public final C33141sV A0E;
    public final HashSet A0F = AnonymousClass002.A0K();

    public final void A00(View view) {
        Intent intent;
        C30471mV r0 = this.A00;
        if (r0 != null) {
            AnonymousClass2z0 r2 = r0.A1J;
            if (r2 != null) {
                AnonymousClass5P1 r1 = new AnonymousClass5P1(this.A03);
                C95814uZ r02 = this.A0B;
                C626936e.A06(r02);
                r1.A05 = r02;
                r1.A06 = r2;
                r1.A00 = 34;
                intent = r1.A01();
            } else {
                intent = null;
            }
            if (view != null) {
                if (intent != null) {
                    C89644eZ r22 = this.A03;
                    C107275b2.A09(r22, intent, view, new AnonymousClass5MG(r22), C107315b6.A05(this.A00.A1J));
                }
            } else if (intent != null) {
                this.A03.startActivity(intent);
            }
        }
    }

    public AnonymousClass5R5(C69263Wi r3, C56972sr r4, C89644eZ r5, AnonymousClass5T7 r6, C105405Uu r7, C105145Tt r8, AnonymousClass5X1 r9, AnonymousClass5ZR r10, C620733j r11, AnonymousClass1VX r12, C95814uZ r13, MediaCard mediaCard, C33141sV r15) {
        C18260x0.A0f(r12, r3, r11, r8, r4);
        C18260x0.A0g(r7, r15, r6, r9, r10);
        C18260x0.A0Y(r13, mediaCard, r5);
        this.A0A = r12;
        this.A01 = r3;
        this.A09 = r11;
        this.A06 = r8;
        this.A02 = r4;
        this.A05 = r7;
        this.A0E = r15;
        this.A04 = r6;
        this.A07 = r9;
        this.A08 = r10;
        this.A0B = r13;
        this.A0C = mediaCard;
        this.A03 = r5;
        AnonymousClass69U r0 = new AnonymousClass69U(this, 1);
        this.A0D = r0;
        mediaCard.setSeeMoreClickListener(r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0086, code lost:
        if (r9 != 13) goto L_0x00af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.util.List r21) {
        /*
            r20 = this;
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            r4 = 1
            r3 = r20
            if (r21 == 0) goto L_0x00da
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x00da
            java.util.Iterator r12 = r21.iterator()
        L_0x0013:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00da
            X.1mV r6 = X.C18320x8.A0S(r12)
            X.2z0 r0 = r6.A1J
            java.lang.String r19 = X.C107315b6.A05(r0)
            X.C162457s7.A0D(r19)
            byte r9 = r6.A1I
            r2 = 23
            r1 = 9
            r11 = 28
            java.lang.String r17 = " "
            r10 = 2
            r0 = 29
            r8 = 3
            r18 = 0
            r7 = 13
            if (r9 == r8) goto L_0x0078
            if (r9 == r10) goto L_0x0078
            if (r9 == r7) goto L_0x0090
            if (r9 == r11) goto L_0x0078
            if (r9 == r0) goto L_0x0090
            if (r9 == r1) goto L_0x00a0
            r0 = 26
            if (r9 == r0) goto L_0x00a0
            if (r9 != r2) goto L_0x00b7
            X.4eZ r0 = r3.A03
            android.content.Context r2 = r0.getBaseContext()
            r1 = 2131233202(0x7f0809b2, float:1.8082535E38)
            r0 = 2131103185(0x7f060dd1, float:1.781883E38)
            android.graphics.drawable.Drawable r14 = X.C107335b8.A04(r2, r1, r0)
        L_0x005a:
            r1 = 2131888310(0x7f1208b6, float:1.9411252E38)
        L_0x005d:
            X.4eZ r0 = r3.A03
            java.lang.String r18 = r0.getString(r1)
        L_0x0063:
            X.5pt r15 = new X.5pt
            r15.<init>(r3, r6)
            X.6Ac r0 = new X.6Ac
            r0.<init>(r3, r4, r6)
            X.7On r13 = new X.7On
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r5.add(r13)
            goto L_0x0013
        L_0x0078:
            int r0 = r6.A0B
            X.33j r2 = r3.A09
            if (r0 == 0) goto L_0x0089
            java.lang.String r17 = X.C107565bW.A0G(r2, r6)
        L_0x0082:
            if (r9 == r8) goto L_0x0096
            if (r9 == r11) goto L_0x0096
            if (r9 == r7) goto L_0x0090
            goto L_0x00af
        L_0x0089:
            long r0 = r6.A00
            java.lang.String r17 = X.AnonymousClass35V.A03(r2, r0)
            goto L_0x0082
        L_0x0090:
            X.4eZ r1 = r3.A03
            r0 = 2131233077(0x7f080935, float:1.8082281E38)
            goto L_0x009b
        L_0x0096:
            X.4eZ r1 = r3.A03
            r0 = 2131233079(0x7f080937, float:1.8082285E38)
        L_0x009b:
            android.graphics.drawable.Drawable r14 = X.AnonymousClass0RP.A00(r1, r0)
            goto L_0x00b1
        L_0x00a0:
            r0 = r6
            X.1nF r0 = (X.AnonymousClass1nF) r0
            int r2 = r0.A00
            if (r2 == 0) goto L_0x00b7
            X.33j r1 = r3.A09
            java.lang.String r0 = r0.A05
            java.lang.String r17 = X.AnonymousClass5b1.A03(r1, r0, r2)
        L_0x00af:
            r14 = r18
        L_0x00b1:
            if (r9 != r8) goto L_0x00c1
            r1 = 2131888315(0x7f1208bb, float:1.9411262E38)
            goto L_0x005d
        L_0x00b7:
            r14 = r18
            r17 = r14
            if (r9 != r4) goto L_0x00b1
            r1 = 2131888305(0x7f1208b1, float:1.9411242E38)
            goto L_0x005d
        L_0x00c1:
            if (r9 != r7) goto L_0x00c7
            r1 = 2131888301(0x7f1208ad, float:1.9411233E38)
            goto L_0x005d
        L_0x00c7:
            if (r9 != r10) goto L_0x00cd
            r1 = 2131888295(0x7f1208a7, float:1.9411221E38)
            goto L_0x005d
        L_0x00cd:
            r0 = 9
            if (r9 != r0) goto L_0x00d5
            r1 = 2131888300(0x7f1208ac, float:1.9411231E38)
            goto L_0x005d
        L_0x00d5:
            r0 = 23
            if (r9 != r0) goto L_0x0063
            goto L_0x005a
        L_0x00da:
            com.whatsapp.ui.media.MediaCard r1 = r3.A0C
            X.8pf r0 = r3.A0D
            r1.setSeeMoreClickListener(r0)
            r0 = 12
            r1.A09(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5R5.A01(java.util.List):void");
    }
}
