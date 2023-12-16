package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.emoji.EmojiContainerView;

/* renamed from: X.4Z4  reason: invalid class name */
public class AnonymousClass4Z4 extends C05570Ua {
    public int A00;
    public C106655Zv A01;
    public final ImageView A02;
    public final EmojiContainerView A03;
    public final AnonymousClass5Y0 A04;
    public final AnonymousClass4A5 A05;
    public final C60152y5 A06;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (r1 != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07() {
        /*
            r5 = this;
            X.5Zv r0 = r5.A01
            r4 = 0
            if (r0 != 0) goto L_0x000b
            com.whatsapp.emoji.EmojiContainerView r0 = r5.A03
            r0.setOnClickListener(r4)
            return
        L_0x000b:
            android.view.View r2 = r5.A0H
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = r1.height
            r1.width = r0
            r2.setLayoutParams(r1)
            com.whatsapp.emoji.EmojiContainerView r2 = r5.A03
            r0 = 16
            X.C633839a.A00(r2, r5, r0)
            X.5Zv r0 = r5.A01
            int[] r0 = r0.A00
            boolean r3 = X.C107425bI.A03(r0)
            boolean r1 = X.C107425bI.A02(r0)
            if (r3 != 0) goto L_0x0030
            r0 = 0
            if (r1 == 0) goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            r2.A04 = r0
            if (r1 == 0) goto L_0x0064
            X.2y5 r1 = r5.A06
            X.5Zv r0 = r5.A01
            int[] r0 = r0.A00
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            int[] r1 = X.C107005aX.A04(r1, r0)
            X.5Zv r0 = new X.5Zv
            r0.<init>((int[]) r1)
            r5.A01 = r0
            r0 = 6
            X.692 r4 = new X.692
            r4.<init>(r5, r0)
        L_0x0052:
            r2.setOnLongClickListener(r4)
        L_0x0055:
            android.widget.ImageView r1 = r5.A02
            X.5Zv r0 = r5.A01
            java.lang.String r0 = r0.toString()
            r1.setContentDescription(r0)
            r5.A08()
            return
        L_0x0064:
            if (r3 == 0) goto L_0x0052
            X.2y5 r1 = r5.A06
            X.5Zv r0 = r5.A01
            int[] r0 = r0.A00
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            int[] r1 = X.C107005aX.A05(r1, r0)
            X.5Zv r0 = new X.5Zv
            r0.<init>((int[]) r1)
            r5.A01 = r0
            r0 = 0
            X.5ZX r1 = new X.5ZX
            r1.<init>(r5, r0)
            r0 = 9
            X.C1237169m.A00(r2, r1, r5, r0)
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Z4.A07():void");
    }

    public final void A08() {
        this.A02.setImageDrawable(this.A04.A04(this.A0H.getResources(), new C94274qr(this.A01.A00), 0.75f, -1));
    }

    public AnonymousClass4Z4(LayoutInflater layoutInflater, ViewGroup viewGroup, AnonymousClass5Y0 r7, AnonymousClass4A5 r8, C60152y5 r9, int i) {
        super(layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false));
        this.A04 = r7;
        this.A05 = r8;
        this.A06 = r9;
        View view = this.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
        EmojiContainerView emojiContainerView = (EmojiContainerView) view.findViewById(R.id.emoji_preview_container);
        this.A03 = emojiContainerView;
        this.A02 = AnonymousClass0x9.A0F(view, R.id.emoji);
        emojiContainerView.setVisibility(0);
    }
}
