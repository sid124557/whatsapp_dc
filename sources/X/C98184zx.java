package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4zx  reason: invalid class name and case insensitive filesystem */
public abstract class C98184zx extends AnonymousClass4Qv {
    public C116985rC A00;
    public C56972sr A01;
    public C64773Ex A02;
    public AnonymousClass5ZU A03;
    public C620633i A04;
    public C56612sH A05;
    public C620733j A06;
    public AnonymousClass5Y0 A07;
    public AnonymousClass1VX A08;
    public C60152y5 A09;
    public final ViewGroup A0A = C86644Kx.A0J(this, R.id.search_message_container_attachment);
    public final ViewGroup A0B = C86644Kx.A0J(this, R.id.search_message_container_content);
    public final ViewGroup A0C = C86644Kx.A0J(this, R.id.search_message_container_header);
    public final ViewGroup A0D = C86644Kx.A0J(this, R.id.search_message_container_media);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.4za} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: X.4zY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.4zb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: X.4zW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: X.4RT} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r13 = this;
            r3 = r13
            X.4zw r3 = (X.C98174zw) r3
            android.content.Context r0 = r3.getContext()
            com.whatsapp.components.ConversationListRowHeaderView r7 = new com.whatsapp.components.ConversationListRowHeaderView
            r7.<init>(r0)
            X.C18310x6.A15(r7)
            com.whatsapp.TextEmojiLabel r0 = r7.A00
            r1 = 0
            r0.setIncludeFontPadding(r1)
            com.whatsapp.WaTextView r0 = r7.A01
            r0.setIncludeFontPadding(r1)
            X.1VX r10 = r3.A08
            android.content.Context r5 = r3.getContext()
            X.33j r9 = r3.A06
            X.5ZU r8 = r3.A03
            X.5rC r6 = r3.A00
            X.5Tm r4 = new X.5Tm
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3.A02 = r4
            X.4cu r0 = r4.A05
            com.whatsapp.TextEmojiLabel r0 = r0.A02
            X.C106905aM.A04(r0)
            X.5Tm r0 = r3.A02
            int r4 = r3.A06
            com.whatsapp.components.ConversationListRowHeaderView r0 = r0.A03
            com.whatsapp.WaTextView r0 = r0.A01
            r0.setTextColor(r4)
            android.view.ViewGroup r0 = r13.A0C
            r0.addView(r7)
            android.content.Context r1 = r3.getContext()
            com.whatsapp.TextEmojiLabel r0 = new com.whatsapp.TextEmojiLabel
            r0.<init>(r1)
            r3.A01 = r0
            android.widget.LinearLayout$LayoutParams r2 = X.C86624Kv.A0C()
            r1 = 3
            r2.gravity = r1
            com.whatsapp.TextEmojiLabel r0 = r3.A01
            r0.setLayoutParams(r2)
            com.whatsapp.TextEmojiLabel r0 = r3.A01
            r0.setMaxLines(r1)
            com.whatsapp.TextEmojiLabel r0 = r3.A01
            X.C86664Kz.A1S(r0)
            com.whatsapp.TextEmojiLabel r0 = r3.A01
            r0.setTextColor(r4)
            com.whatsapp.TextEmojiLabel r2 = r3.A01
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168092(0x7f070b5c, float:1.7950476E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setLineHeight(r0)
            com.whatsapp.TextEmojiLabel r0 = r3.A01
            r0.A0A()
            com.whatsapp.TextEmojiLabel r0 = r3.A01
            X.C86634Kw.A1I(r0)
            com.whatsapp.TextEmojiLabel r1 = r3.A01
            r0 = 80
            r1.setPlaceholder(r0)
            com.whatsapp.TextEmojiLabel r2 = r3.A01
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168093(0x7f070b5d, float:1.7950478E38)
            float r1 = X.C86664Kz.A01(r1, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setLineSpacing(r1, r0)
            com.whatsapp.TextEmojiLabel r1 = r3.A01
            r0 = 2131433329(0x7f0b1771, float:1.848844E38)
            r1.setId(r0)
            com.whatsapp.TextEmojiLabel r1 = r3.A01
            if (r1 == 0) goto L_0x00ae
            android.view.ViewGroup r0 = r13.A0B
            r0.addView(r1)
        L_0x00ae:
            r0 = r13
            boolean r1 = r13 instanceof X.C98114zq
            if (r1 == 0) goto L_0x010a
            X.4zq r0 = (X.C98114zq) r0
            android.content.Context r2 = r0.getContext()
            X.5Mz r1 = r0.A08
            X.4RT r3 = new X.4RT
            r3.<init>(r2, r1)
            r0.A00 = r3
        L_0x00c2:
            android.view.ViewGroup r1 = r13.A0A
            r1.addView(r3)
            r0 = 0
            r1.setVisibility(r0)
        L_0x00cb:
            r2 = r13
            boolean r0 = r13 instanceof X.C98144zt
            if (r0 == 0) goto L_0x00ea
            X.4zv r2 = (X.C98164zv) r2
            android.content.Context r0 = r2.getContext()
            X.500 r1 = new X.500
            r1.<init>(r0)
        L_0x00db:
            r2.A00 = r1
            r2.setUpThumbView(r1)
            X.6ex r1 = r2.A00
            if (r1 == 0) goto L_0x00e9
            android.view.ViewGroup r0 = r13.A0D
            r0.addView(r1)
        L_0x00e9:
            return
        L_0x00ea:
            boolean r0 = r13 instanceof X.C98134zs
            if (r0 == 0) goto L_0x00fa
            X.4zv r2 = (X.C98164zv) r2
            android.content.Context r0 = r2.getContext()
            X.4zh r1 = new X.4zh
            r1.<init>(r0)
            goto L_0x00db
        L_0x00fa:
            boolean r0 = r13 instanceof X.C98154zu
            if (r0 == 0) goto L_0x00e9
            X.4zv r2 = (X.C98164zv) r2
            android.content.Context r0 = r2.getContext()
            X.4zy r1 = new X.4zy
            r1.<init>(r0)
            goto L_0x00db
        L_0x010a:
            boolean r1 = r13 instanceof X.C98074zm
            if (r1 == 0) goto L_0x011c
            X.4zm r0 = (X.C98074zm) r0
            android.content.Context r1 = r0.getContext()
            X.4zb r3 = new X.4zb
            r3.<init>(r1)
            r0.A00 = r3
            goto L_0x00c2
        L_0x011c:
            boolean r1 = r13 instanceof X.C98124zr
            if (r1 == 0) goto L_0x0130
            X.4zr r0 = (X.C98124zr) r0
            android.content.Context r2 = r0.getContext()
            X.33j r1 = r0.A06
            X.4zY r3 = new X.4zY
            r3.<init>(r2, r1)
            r0.A00 = r3
            goto L_0x00c2
        L_0x0130:
            boolean r1 = r13 instanceof X.C98004zf
            if (r1 == 0) goto L_0x0142
            X.4zf r0 = (X.C98004zf) r0
            android.content.Context r1 = r0.getContext()
            X.4zW r3 = new X.4zW
            r3.<init>(r1)
            r0.A00 = r3
            goto L_0x00c2
        L_0x0142:
            boolean r1 = r13 instanceof X.C97974zc
            if (r1 == 0) goto L_0x0151
            android.content.Context r0 = X.C18290x4.A0F(r13)
            X.4zX r3 = new X.4zX
            r3.<init>(r0)
            goto L_0x00c2
        L_0x0151:
            boolean r1 = r13 instanceof X.C98014zg
            if (r1 == 0) goto L_0x0174
            X.4zg r0 = (X.C98014zg) r0
            android.content.Context r4 = r0.getContext()
            X.2sH r8 = r0.A05
            X.2sr r5 = r0.A01
            X.1fd r12 = r0.A06
            X.5UX r6 = r0.A02
            X.33j r9 = r0.A06
            X.5Uq r7 = r0.A03
            X.33o r11 = r0.A05
            X.3Lo r10 = r0.A04
            X.4za r3 = new X.4za
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.A00 = r3
            goto L_0x00c2
        L_0x0174:
            boolean r1 = r13 instanceof X.C97994ze
            if (r1 == 0) goto L_0x0191
            X.4ze r0 = (X.C97994ze) r0
            android.content.Context r4 = r0.getContext()
            X.3Wi r5 = r0.A02
            X.5UX r6 = r0.A03
            X.33j r8 = r0.A06
            X.4up r9 = r0.A05
            X.5Uq r7 = r0.A04
            X.4zZ r3 = new X.4zZ
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.A00 = r3
            goto L_0x00c2
        L_0x0191:
            boolean r1 = r13 instanceof X.C97984zd
            if (r1 == 0) goto L_0x00cb
            X.4zd r0 = (X.C97984zd) r0
            android.content.Context r1 = r0.getContext()
            X.4zV r3 = new X.4zV
            r3.<init>(r1)
            r0.A00 = r3
            goto L_0x00c2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98184zx.A03():void");
    }

    public C98184zx(Context context) {
        super(context);
        setOrientation(0);
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        C86614Ku.A1C(AnonymousClass4L0.A0B(), this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
    }
}
