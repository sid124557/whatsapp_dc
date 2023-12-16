package X;

import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4xO  reason: invalid class name and case insensitive filesystem */
public final class C96964xO extends AnonymousClass4XA {
    public final C05460Tk A00;
    public final C620733j A01;
    public final AnonymousClass5UP A02;

    public C96964xO(C15910sA r10, C105365Uq r11, C620733j r12, AnonymousClass5UP r13, C46502bj r14, AnonymousClass4Ut r15, boolean z) {
        super(r10, r11, r14, r15, z);
        this.A01 = r12;
        this.A02 = r13;
        C1231067d r1 = new C1231067d(4);
        this.A00 = new C05460Tk(new C05360Ta(r1).A00(), new C08490eZ(this));
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        boolean A0X = this.A02.A01.A0X(5185);
        int i2 = R.layout.f8nameremoved;
        if (A0X) {
            i2 = R.layout.f8nameremoved;
        }
        if (i == 0) {
            return new C136906nS(C18310x6.A0I(C86604Kt.A0D(viewGroup), viewGroup, i2, false), this);
        }
        int i3 = R.layout.f8nameremoved;
        if (i == 2) {
            i3 = R.layout.f8nameremoved;
        }
        return new AnonymousClass4YY(C18310x6.A0I(C18280x3.A0D(viewGroup), viewGroup, i3, false), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0092, code lost:
        if (r3.isEmpty() != false) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BNf(X.C05570Ua r13, int r14) {
        /*
            r12 = this;
            X.4YY r13 = (X.AnonymousClass4YY) r13
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            X.0Tk r0 = r12.A00
            java.util.List r0 = r0.A02
            java.lang.Object r7 = r0.get(r14)
            X.5Sw r7 = (X.C104925Sw) r7
            X.C162457s7.A0H(r7)
            r6 = 0
            X.C162457s7.A0J(r7, r6)
            X.4xO r5 = r13.A04
            X.33j r0 = r5.A01
            java.text.NumberFormat r1 = r0.A0M()
            int r0 = r7.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = r1.format(r0)
            boolean r9 = r7.A05
            boolean r4 = r13 instanceof X.C136906nS
            android.widget.TextView r10 = r13.A01
            r2 = 0
            r11 = 1
            if (r9 == 0) goto L_0x0040
            android.content.Context r1 = X.C86664Kz.A0T(r13)
            if (r4 == 0) goto L_0x00e2
            r0 = 2131891151(0x7f1213cf, float:1.9417014E38)
            java.lang.String r3 = r1.getString(r0)
        L_0x0040:
            r10.setText(r3)
            android.widget.TextView r0 = r13.A02
            if (r9 != 0) goto L_0x0049
            r2 = 8
        L_0x0049:
            r0.setVisibility(r2)
            com.whatsapp.TextEmojiLabel r8 = r13.A03
            java.lang.String r1 = r7.A03
            r0 = 0
            r8.A0K(r0, r1)
            X.5zA r1 = new X.5zA
            r1.<init>(r5, r7)
            android.view.View r3 = r13.A0H
            r0 = 37
            X.C18300x5.A19(r3, r1, r0)
            android.util.TypedValue r2 = X.AnonymousClass4L0.A0B()
            android.content.res.Resources$Theme r1 = X.C86614Ku.A0C(r3)
            r0 = 16843534(0x101030e, float:2.369575E-38)
            r1.resolveAttribute(r0, r2, r11)
            int r0 = r2.resourceId
            r3.setBackgroundResource(r0)
            java.lang.CharSequence r0 = r10.getText()
            r3.setContentDescription(r0)
            r8.setSelected(r9)
            java.util.List r1 = r7.A04
            if (r1 == 0) goto L_0x00e0
            r0 = 5
            java.util.List r3 = X.C73723fy.A0J(r1, r0)
        L_0x0086:
            com.whatsapp.contact.FacepileView r8 = r13.A00
            r2 = 0
            if (r8 == 0) goto L_0x0099
            if (r3 == 0) goto L_0x0094
            boolean r1 = r3.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0096
        L_0x0094:
            r0 = 8
        L_0x0096:
            r8.setVisibility(r0)
        L_0x0099:
            if (r3 == 0) goto L_0x00eb
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00eb
            if (r8 == 0) goto L_0x00aa
            int r0 = r3.size()
            r8.setContactsSize(r0)
        L_0x00aa:
            java.util.Iterator r9 = r3.iterator()
        L_0x00ae:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r0 = r9.next()
            int r3 = r2 + 1
            if (r2 >= 0) goto L_0x00c1
            java.lang.RuntimeException r0 = X.C18280x3.A0X()
            throw r0
        L_0x00c1:
            X.7YJ r0 = (X.AnonymousClass7YJ) r0
            if (r8 == 0) goto L_0x00d8
            com.whatsapp.WaImageView r2 = r8.A00(r2)
            if (r2 == 0) goto L_0x00d8
            X.3ZH r1 = r0.A00
            if (r1 != 0) goto L_0x00da
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x00d8
            X.2bj r0 = r5.A02
            r0.A00(r2, r1)
        L_0x00d8:
            r2 = r3
            goto L_0x00ae
        L_0x00da:
            X.5Uq r0 = r5.A01
            r0.A08(r2, r1)
            goto L_0x00d8
        L_0x00e0:
            r3 = 0
            goto L_0x0086
        L_0x00e2:
            r0 = 2131891111(0x7f1213a7, float:1.9416933E38)
            java.lang.String r3 = X.AnonymousClass0x2.A0X(r1, r3, r11, r0)
            goto L_0x0040
        L_0x00eb:
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x0118
            if (r4 == 0) goto L_0x0118
            X.6nS r13 = (X.C136906nS) r13
            if (r13 == 0) goto L_0x0118
            X.4Ut r0 = r12.A03
            android.widget.ImageView r4 = r13.A00
            X.34x r2 = r7.A01
            X.C162457s7.A0J(r4, r6)
            X.08M r3 = X.AnonymousClass08M.A01()
            X.1sV r1 = r0.A0A
            X.8Jl r0 = new X.8Jl
            r0.<init>(r4, r3)
            r1.A09(r4, r2, r0)
            X.0sA r2 = r12.A00
            X.628 r1 = new X.628
            r1.<init>(r13)
            r0 = 292(0x124, float:4.09E-43)
            X.C86604Kt.A1N(r2, r3, r1, r0)
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96964xO.BNf(X.0Ua, int):void");
    }

    public int getItemViewType(int i) {
        C141796w9 r0;
        if (!((C104925Sw) this.A00.A02.get(i)).A05) {
            r0 = C141796w9.COUNTER_ITEM;
        } else if (this.A04) {
            r0 = C141796w9.MEDIA_ITEM;
        } else {
            r0 = C141796w9.COUNTER_WITH_MY_REACTION;
        }
        return r0.ordinal();
    }
}
