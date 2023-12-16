package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.11m  reason: invalid class name and case insensitive filesystem */
public final class C195211m extends AnonymousClass09G {
    public int A00;
    public boolean A01;
    public final int A02;
    public final C56352rq A03;
    public final AnonymousClass2SD A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass33O A06;
    public final AnonymousClass4BP A07;
    public final AnonymousClass4GP A08;
    public final AnonymousClass4GP A09;
    public final AnonymousClass4GP A0A;
    public final AnonymousClass4GP A0B;
    public final AnonymousClass4GQ A0C;
    public final AnonymousClass4GQ A0D;
    public final AnonymousClass4GR A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C195211m(C56352rq r3, AnonymousClass2SD r4, AnonymousClass1VX r5, AnonymousClass33O r6, AnonymousClass4BP r7, AnonymousClass4GP r8, AnonymousClass4GP r9, AnonymousClass4GP r10, AnonymousClass4GP r11, AnonymousClass4GQ r12, AnonymousClass4GQ r13, AnonymousClass4GR r14, int i) {
        super((AnonymousClass0O4) new AnonymousClass11X());
        C162457s7.A0J(r5, 1);
        C162457s7.A0J(r14, 6);
        this.A05 = r5;
        this.A06 = r6;
        this.A03 = r3;
        this.A02 = i;
        this.A07 = r7;
        this.A0E = r14;
        this.A04 = r4;
        this.A0C = r12;
        this.A09 = r8;
        this.A08 = r9;
        this.A0B = r10;
        this.A0A = r11;
        this.A0D = r13;
        A0E(r5.A0Y(C58422vE.A02, 6344));
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        switch (i) {
            case 0:
                return new C23591Tv(C18300x5.A0F(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
            case 1:
                return new C23601Tw(C18300x5.A0F(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
            case 2:
                View A0F = C18300x5.A0F(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
                int i2 = this.A02;
                return new AnonymousClass1U0(A0F, this.A03, this.A06, this.A07, this.A0E, i2);
            case 3:
                int dimensionPixelOffset = C18290x4.A0G(viewGroup).getDimensionPixelOffset(R.dimen.f6nameremoved);
                int dimensionPixelOffset2 = C18290x4.A0G(viewGroup).getDimensionPixelOffset(R.dimen.f6nameremoved);
                AnonymousClass4Sv r3 = new AnonymousClass4Sv(C18290x4.A0F(viewGroup));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
                r3.setLayoutParams(layoutParams);
                return new AnonymousClass1Tx(r3, this.A09, this.A08);
            case 4:
                return new C23581Tu(this.A0B, C18300x5.A0F(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
            case 5:
                return new C23611Ty(C18300x5.A0F(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A0B, this.A0A);
            case 6:
                return new C23621Tz(C18300x5.A0F(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A04, new C819341q(this));
            default:
                throw AnonymousClass001.A0c("Unsupported view type for StickerGrid adapter");
        }
    }

    public long A0B(int i) {
        if (this.A05.A0Y(C58422vE.A02, 6344)) {
            return (long) ((C47712dh) A0K(i)).A02().hashCode();
        }
        return -1;
    }

    public /* bridge */ /* synthetic */ void A0J(C05570Ua r3) {
        AnonymousClass12I r32 = (AnonymousClass12I) r3;
        C162457s7.A0J(r32, 0);
        if (r32 instanceof AnonymousClass1U0) {
            AnonymousClass1U0 r33 = (AnonymousClass1U0) r32;
            r33.A07(false);
            if (false != r33.A01) {
                r33.A01 = false;
                StickerView stickerView = r33.A06;
                stickerView.A04 = false;
                stickerView.A08();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.1Tx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.1Ty} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.1Tx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: X.1Tx} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BNf(X.C05570Ua r18, int r19) {
        /*
            r17 = this;
            r2 = r18
            X.12I r2 = (X.AnonymousClass12I) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            boolean r0 = r2 instanceof X.C23601Tw
            r1 = r17
            r4 = r19
            if (r0 == 0) goto L_0x003f
            java.lang.Object r3 = r1.A0K(r4)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.expressionstray.stickergrid.StickerGridViewItem.Title"
            X.C162457s7.A0K(r3, r0)
            X.1Tl r3 = (X.C23491Tl) r3
            X.1Tw r2 = (X.C23601Tw) r2
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            java.lang.Integer r0 = r3.A01
            com.whatsapp.WaTextView r2 = r2.A00
            if (r0 == 0) goto L_0x0039
            int r0 = r0.intValue()
            r2.setText(r0)
        L_0x002f:
            X.4GQ r1 = r1.A0C
            if (r1 == 0) goto L_0x0038
            X.2UW r0 = r3.A00
            r1.invoke(r0)
        L_0x0038:
            return
        L_0x0039:
            java.lang.String r0 = r3.A03
            r2.setText(r0)
            goto L_0x002f
        L_0x003f:
            boolean r0 = r2 instanceof X.AnonymousClass1U0
            if (r0 == 0) goto L_0x0119
            X.1U0 r2 = (X.AnonymousClass1U0) r2
            java.lang.Object r6 = r1.A0K(r4)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.expressionstray.stickergrid.StickerGridViewItem.StickerLocal"
            X.C162457s7.A0K(r6, r0)
            X.1Tk r6 = (X.C23481Tk) r6
            int r12 = r1.A00
            r7 = 0
            X.C162457s7.A0J(r6, r7)
            X.39M r10 = r6.A01
            android.view.View r5 = r2.A0H
            r5.setEnabled(r7)
            java.lang.String r3 = r10.A0D
            if (r3 == 0) goto L_0x00bf
            java.lang.String r0 = "loading-hash"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00bf
            r0 = 0
            r5.setOnClickListener(r0)
            r5.setClickable(r7)
        L_0x0071:
            r0 = 2131233591(0x7f080b37, float:1.8083324E38)
            r5.setBackgroundResource(r0)
            android.content.Context r0 = r5.getContext()
            java.lang.String r0 = X.AnonymousClass320.A00(r0, r10)
            r5.setContentDescription(r0)
            com.whatsapp.stickers.StickerView r9 = r2.A06
            android.content.res.Resources r3 = X.C18290x4.A0G(r9)
            r0 = 2131166489(0x7f070519, float:1.7947225E38)
            int r13 = r3.getDimensionPixelSize(r0)
            r15 = 1
            r9.A03 = r15
            X.33O r8 = r2.A04
            X.3Ue r11 = new X.3Ue
            r11.<init>(r2, r10)
            r14 = r13
            r16 = r15
            r8.A05(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r3 = r1.A01
            boolean r0 = r2.A01
            if (r3 == r0) goto L_0x00af
            r2.A01 = r3
            if (r3 != 0) goto L_0x00b5
            r0 = 0
            r9.A04 = r0
            r9.A08()
        L_0x00af:
            boolean r0 = r1.A01
            r2.A07(r0)
            return
        L_0x00b5:
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x00af
            r9.A04 = r15
            r9.A07()
            goto L_0x00af
        L_0x00bf:
            X.2UW r8 = r6.A00
            boolean r9 = r8 instanceof X.C23551Tr
            if (r9 == 0) goto L_0x00d2
            r0 = r8
            X.1Tr r0 = (X.C23551Tr) r0
            X.2Uc r3 = r0.A00
            X.1lX r0 = X.C29901lX.A00
            boolean r0 = X.C162457s7.A0P(r3, r0)
            if (r0 != 0) goto L_0x00e3
        L_0x00d2:
            boolean r7 = r8 instanceof X.C23571Tt
            if (r7 == 0) goto L_0x00f6
            java.lang.String r3 = r8.A00()
            java.lang.String r0 = "recent"
            boolean r0 = X.C162457s7.A0P(r3, r0)
            if (r0 == 0) goto L_0x00f6
        L_0x00e3:
            r3 = 3
        L_0x00e4:
            X.1sb r0 = new X.1sb
            r0.<init>(r2, r10, r3, r4)
            r5.setOnClickListener(r0)
            X.39x r0 = new X.39x
            r0.<init>(r6, r2, r10)
            r5.setOnLongClickListener(r0)
            goto L_0x0071
        L_0x00f6:
            if (r9 == 0) goto L_0x0105
            r0 = r8
            X.1Tr r0 = (X.C23551Tr) r0
            X.2Uc r3 = r0.A00
            X.1lZ r0 = X.C29921lZ.A00
            boolean r0 = X.C162457s7.A0P(r3, r0)
            if (r0 != 0) goto L_0x0114
        L_0x0105:
            if (r7 == 0) goto L_0x0116
            java.lang.String r3 = r8.A00()
            java.lang.String r0 = "starred"
            boolean r0 = X.C162457s7.A0P(r3, r0)
            if (r0 == 0) goto L_0x0116
        L_0x0114:
            r3 = 4
            goto L_0x00e4
        L_0x0116:
            int r3 = r2.A02
            goto L_0x00e4
        L_0x0119:
            boolean r0 = r2 instanceof X.C23591Tv
            if (r0 != 0) goto L_0x0038
            boolean r0 = r2 instanceof X.C23581Tu
            if (r0 != 0) goto L_0x0038
            boolean r0 = r2 instanceof X.C23611Ty
            if (r0 == 0) goto L_0x0136
            X.1Ty r2 = (X.C23611Ty) r2
            android.view.View r1 = r2.A0H
            r0 = 11
            X.C635339p.A00(r1, r2, r0)
            android.view.View r1 = r2.A00
            r0 = 12
        L_0x0132:
            X.C635339p.A00(r1, r2, r0)
            return
        L_0x0136:
            boolean r0 = r2 instanceof X.AnonymousClass1Tx
            if (r0 == 0) goto L_0x0148
            X.1Tx r2 = (X.AnonymousClass1Tx) r2
            android.view.View r1 = r2.A0H
            r0 = 8
            X.C635339p.A00(r1, r2, r0)
            android.view.View r1 = r2.A00
            r0 = 9
            goto L_0x0132
        L_0x0148:
            boolean r0 = r2 instanceof X.C23621Tz
            if (r0 == 0) goto L_0x0038
            X.1Tz r2 = (X.C23621Tz) r2
            java.lang.Object r1 = r1.A0K(r4)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.expressionstray.stickergrid.StickerGridViewItem.ShapeSticker"
            X.C162457s7.A0K(r1, r0)
            X.1Tj r1 = (X.C23471Tj) r1
            X.2kB r1 = r1.A01
            android.view.View r0 = r2.A0H
            r7 = 3
            X.C18310x6.A19(r0, r2, r1, r7)
            X.2SD r6 = r2.A01
            X.5Uw r9 = r1.A01
            android.widget.ImageView r8 = r2.A00
            X.C162457s7.A0C(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "shape_"
            X.C18280x3.A1G(r1, r0, r9)
            java.lang.String r0 = r1.toString()
            X.2iw r5 = new X.2iw
            r5.<init>(r0)
            java.lang.Object r0 = r8.getTag()
            boolean r0 = X.C162457s7.A0P(r0, r5)
            r4 = 0
            if (r0 != 0) goto L_0x018c
            r8.setImageDrawable(r4)
        L_0x018c:
            r8.setTag(r5)
            java.util.HashMap r3 = r6.A03
            java.lang.Object r0 = r3.remove(r5)
            X.4Gj r0 = (X.C85474Gj) r0
            if (r0 == 0) goto L_0x019c
            r0.AyX(r4)
        L_0x019c:
            X.2lU r2 = new X.2lU
            r2.<init>(r8, r5, r9)
            X.4C6 r1 = r6.A00
            if (r1 != 0) goto L_0x01c4
            X.66R r0 = r6.A04
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            X.C162457s7.A0D(r0)
            X.46P r1 = new X.46P
            r1.<init>(r0)
            X.46U r0 = new X.46U
            r0.<init>(r4)
            X.4Gl r0 = X.C616031m.A00(r1, r0)
            X.4C6 r1 = X.AnonymousClass349.A02(r0)
            r6.A00 = r1
        L_0x01c4:
            com.whatsapp.expressionstray.stickers.mediacomposer.ShapeImageViewLoader$loadShape$job$1 r0 = new com.whatsapp.expressionstray.stickers.mediacomposer.ShapeImageViewLoader$loadShape$job$1
            r0.<init>(r2, r6, r4)
            X.4Gj r0 = X.C616131n.A02(r4, r0, r1, r4, r7)
            r3.put(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195211m.BNf(X.0Ua, int):void");
    }

    public int getItemViewType(int i) {
        if (i >= A0G()) {
            return 0;
        }
        Object A0K = A0K(i);
        if (A0K instanceof C23461Ti) {
            return 0;
        }
        if (A0K instanceof C23491Tl) {
            return 1;
        }
        if (A0K instanceof C23481Tk) {
            return 2;
        }
        if (A0K instanceof C23431Tf) {
            return 3;
        }
        if (A0K instanceof C23441Tg) {
            return 4;
        }
        if (A0K instanceof C23451Th) {
            return 5;
        }
        if (A0K instanceof C23471Tj) {
            return 6;
        }
        throw C73153f1.A00();
    }
}
