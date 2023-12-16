package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.9EM  reason: invalid class name */
public class AnonymousClass9EM extends AnonymousClass95T {
    public final WaImageView A00;
    public final WaTextView A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final WaTextView A04;
    public final C152967aS A05;
    public final C620733j A06;
    public final C33141sV A07;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AnonymousClass9NY r20) {
        /*
            r19 = this;
            r1 = r20
            X.9E1 r1 = (X.AnonymousClass9E1) r1
            X.4DV r8 = r1.A02
            X.39W r0 = r8.B5s()
            X.C626936e.A06(r0)
            X.39W r0 = r8.B5s()
            X.39S r0 = r0.A01
            X.C626936e.A06(r0)
            X.39F r7 = r1.A01
            X.39W r0 = r8.B5s()
            X.39S r6 = r0.A01
            X.5db r15 = r1.A00
            r5 = r19
            com.whatsapp.WaImageView r14 = r5.A00
            android.content.res.Resources r3 = X.C18290x4.A0G(r14)
            com.whatsapp.WaTextView r1 = r5.A04
            java.lang.String r0 = r7.A03
            r1.setText(r0)
            int r13 = r7.A00
            r4 = 1
            r9 = 0
            if (r13 <= 0) goto L_0x0046
            com.whatsapp.WaTextView r2 = r5.A02
            r1 = 2131891499(0x7f12152b, float:1.941772E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            X.AnonymousClass000.A1P(r0, r13, r9)
            java.lang.String r0 = r3.getString(r1, r0)
            r2.setText(r0)
        L_0x0046:
            X.39G r10 = r7.A02
            if (r10 != 0) goto L_0x0093
            com.whatsapp.WaTextView r10 = r5.A01
            X.39G r11 = r7.A01
            if (r11 != 0) goto L_0x007f
            r0 = 0
        L_0x0051:
            r10.setText(r0)
            com.whatsapp.WaTextView r1 = r5.A03
            r0 = 8
            r1.setVisibility(r0)
        L_0x005b:
            java.lang.String r1 = r7.A00()
            java.lang.String r0 = "custom-item"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00e0
            android.view.View r0 = r5.A0H
            android.content.Context r2 = r0.getContext()
            r1 = 2131232797(0x7f08081d, float:1.8081713E38)
            r0 = 2131102019(0x7f060943, float:1.7816464E38)
            X.C107335b8.A0C(r2, r14, r1, r0)
            r0 = 1056964608(0x3f000000, float:0.5)
            r14.setScaleX(r0)
            r14.setScaleY(r0)
            return
        L_0x007f:
            long r2 = r11.A01
            long r0 = (long) r13
            long r2 = r2 * r0
            int r9 = r11.A00
            java.lang.String r0 = r11.A02
            X.39G r1 = new X.39G
            r1.<init>(r2, r9, r0)
            X.33j r0 = r5.A06
            java.lang.String r0 = r6.A06(r0, r1)
            goto L_0x0051
        L_0x0093:
            com.whatsapp.WaTextView r12 = r5.A01
            long r0 = r10.A01
            long r2 = (long) r13
            long r0 = r0 * r2
            int r13 = r10.A00
            java.lang.String r11 = r10.A02
            X.39G r10 = new X.39G
            r10.<init>(r0, r13, r11)
            X.33j r11 = r5.A06
            java.lang.String r0 = r6.A06(r11, r10)
            r12.setText(r0)
            com.whatsapp.WaTextView r10 = r5.A03
            r10.setVisibility(r9)
            X.39G r13 = r7.A01
            if (r13 != 0) goto L_0x00b9
            r0 = 0
        L_0x00b5:
            r10.setText(r0)
            goto L_0x005b
        L_0x00b9:
            long r0 = r13.A01
            long r0 = r0 * r2
            int r12 = r13.A00
            java.lang.String r3 = r13.A02
            X.39G r2 = new X.39G
            r2.<init>(r0, r12, r3)
            java.lang.String r0 = r6.A06(r11, r2)
            if (r0 == 0) goto L_0x00b5
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r0)
            android.text.style.StrikethroughSpan r2 = new android.text.style.StrikethroughSpan
            r2.<init>()
            int r1 = r3.length()
            r0 = 33
            r3.setSpan(r2, r9, r1, r0)
            r0 = r3
            goto L_0x00b5
        L_0x00e0:
            if (r15 != 0) goto L_0x0113
            X.39H r0 = r6.A07
            java.util.List r1 = r0.A09
            int r0 = r6.A02()
            if (r0 != r4) goto L_0x00ff
            int r0 = r1.size()
            if (r0 != r4) goto L_0x00ff
            X.9dy r1 = new X.9dy
            r1.<init>(r5)
            X.1sV r0 = r5.A07
            X.34x r8 = (X.C624134x) r8
            r0.A09(r14, r8, r1)
            return
        L_0x00ff:
            android.content.res.Resources r1 = X.C18290x4.A0G(r14)
            r0 = 2131103001(0x7f060d19, float:1.7818456E38)
            int r1 = r1.getColor(r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r14.setImageDrawable(r0)
            return
        L_0x0113:
            X.7aS r13 = r5.A05
            r18 = 2
            r1 = 0
            X.9Wd r0 = new X.9Wd
            r0.<init>(r1)
            r16 = 0
            r17 = r0
            r13.A02(r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9EM.A07(X.9NY):void");
    }

    public AnonymousClass9EM(View view, C152967aS r3, C620733j r4, C33141sV r5) {
        super(view);
        this.A00 = AnonymousClass0x9.A0L(view, R.id.item_thumbnail);
        this.A04 = AnonymousClass0x7.A0L(view, R.id.item_title);
        this.A02 = AnonymousClass0x7.A0L(view, R.id.item_quantity);
        this.A01 = AnonymousClass0x7.A0L(view, R.id.item_price);
        this.A03 = AnonymousClass0x7.A0L(view, R.id.item_sale_price);
        this.A05 = r3;
        this.A06 = r4;
        this.A07 = r5;
    }
}
