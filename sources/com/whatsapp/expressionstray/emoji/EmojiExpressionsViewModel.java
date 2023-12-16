package com.whatsapp.expressionstray.emoji;

import X.AnonymousClass0IV;
import X.AnonymousClass0x2;
import X.AnonymousClass20D;
import X.AnonymousClass2GI;
import X.AnonymousClass33p;
import X.AnonymousClass4r5;
import X.AnonymousClass5Y0;
import X.AnonymousClass8PR;
import X.C05550Ty;
import X.C102725Ka;
import X.C104185Pz;
import X.C162457s7;
import X.C18260x0;
import X.C27821ej;
import X.C45952aq;
import X.C58062ue;
import X.C60152y5;
import X.C616131n;
import X.C73853gB;
import X.C832246p;
import X.C84814Du;
import X.C85474Gj;
import X.C85504Gn;
import X.C85524Gp;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class EmojiExpressionsViewModel extends C05550Ty {
    public C85474Gj A00;
    public C85504Gn A01 = new AnonymousClass8PR(C58062ue.A00);
    public final AnonymousClass33p A02;
    public final C27821ej A03;
    public final AnonymousClass5Y0 A04;
    public final AnonymousClass2GI A05;
    public final C102725Ka A06;
    public final C45952aq A07;
    public final C104185Pz A08;
    public final C60152y5 A09;
    public final AtomicBoolean A0A = new AtomicBoolean(true);
    public final C73853gB A0B;
    public final C85524Gp A0C = new C832246p(AnonymousClass4r5.A00);

    public EmojiExpressionsViewModel(AnonymousClass33p r4, C27821ej r5, AnonymousClass5Y0 r6, AnonymousClass2GI r7, C102725Ka r8, C45952aq r9, C104185Pz r10, C60152y5 r11, C73853gB r12) {
        C162457s7.A0J(r6, 1);
        C18260x0.A0e(r5, r4, r9, r11);
        AnonymousClass0x2.A1B(r7, r10);
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A07 = r9;
        this.A09 = r11;
        this.A06 = r8;
        this.A05 = r7;
        this.A08 = r10;
        this.A0B = r12;
    }

    public final void A0D(int i) {
        Integer num;
        if (this.A0A.getAndSet(false)) {
            C104185Pz r3 = this.A08;
            int andIncrement = r3.A02.getAndIncrement();
            r3.A01.markerStart(694884634, andIncrement);
            num = Integer.valueOf(andIncrement);
            r3.A00(andIncrement, "emoji_data_loading_start", (String) null);
        } else {
            num = null;
        }
        C85474Gj r0 = this.A00;
        if (r0 != null) {
            r0.AyX((CancellationException) null);
        }
        this.A00 = C616131n.A02(this.A0B, new EmojiExpressionsViewModel$refreshEmoji$1(this, num, (C84814Du) null, i), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 2);
    }

    public final void A0E(int[] iArr, int i) {
        C616131n.A02(this.A0B, new EmojiExpressionsViewModel$onEmojiSelected$1(this, (C84814Du) null, iArr, i), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 2);
    }
}
