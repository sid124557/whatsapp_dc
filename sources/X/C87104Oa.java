package X;

import android.widget.BaseAdapter;
import com.whatsapp.calling.callhistory.CallLogActivity;
import java.util.List;

/* renamed from: X.4Oa  reason: invalid class name and case insensitive filesystem */
public class C87104Oa extends BaseAdapter {
    public C50392i6 A00;
    public List A01 = AnonymousClass001.A0s();
    public final /* synthetic */ CallLogActivity A02;

    public C87104Oa(CallLogActivity callLogActivity) {
        this.A02 = callLogActivity;
    }

    public int getCount() {
        return C86614Ku.A08(this.A01);
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A01.get(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0265, code lost:
        if (r1 == false) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x022c, code lost:
        if (r5.A0O() != false) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0205  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
            r12 = this;
            if (r14 != 0) goto L_0x02b5
            com.whatsapp.calling.callhistory.CallLogActivity r2 = r12.A02
            android.view.LayoutInflater r1 = r2.getLayoutInflater()
            r0 = 2131624293(0x7f0e0165, float:1.8875762E38)
            android.view.View r14 = X.AnonymousClass001.A0R(r1, r15, r0)
            X.5LF r0 = new X.5LF
            r0.<init>(r14, r2)
            r14.setTag(r0)
            r1 = 2
            X.AnonymousClass0YY.A06(r14, r1)
            r1 = 2131433190(0x7f0b16e6, float:1.8488159E38)
            android.view.View r2 = r14.findViewById(r1)
            r1 = 1
            X.AnonymousClass0YY.A06(r2, r1)
        L_0x0026:
            java.util.List r1 = r12.A01
            java.lang.Object r5 = r1.get(r13)
            X.3ZF r5 = (X.AnonymousClass3ZF) r5
            X.2i6 r4 = r12.A00
            com.whatsapp.calling.callhistory.CallLogActivity r3 = r0.A0B
            X.1VX r1 = r3.A0D
            if (r4 == 0) goto L_0x026c
            r7 = 2131233922(0x7f080c82, float:1.8083995E38)
        L_0x0039:
            int r1 = X.C107215at.A01(r5)
            android.widget.ImageView r2 = r0.A03
            r2.setImageResource(r7)
            int r1 = X.C86624Kv.A02(r2, r1)
            X.C107335b8.A0E(r2, r1)
            android.widget.TextView r2 = r0.A08
            X.1VX r8 = r3.A0D
            boolean r1 = X.C627436k.A0F(r8)
            r7 = 1972(0x7b4, float:2.763E-42)
            r6 = 0
            if (r1 == 0) goto L_0x0230
            boolean r1 = r5.A0N()
            if (r1 == 0) goto L_0x0219
            boolean r1 = r8.A0X(r7)
            if (r1 == 0) goto L_0x0219
        L_0x0062:
            r7 = 2131893852(0x7f121e5c, float:1.9422492E38)
        L_0x0065:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            X.6pW r7 = X.AnonymousClass4L0.A0N(r1, r7)
        L_0x006b:
            android.content.Context r1 = r2.getContext()
            X.C86614Ku.A12(r1, r2, r7)
            X.1VX r1 = r3.A0D
            boolean r1 = X.C627436k.A0F(r1)
            r7 = 8
            if (r1 == 0) goto L_0x0205
            int r8 = r5.A00
            r1 = 5
            if (r8 == r1) goto L_0x008b
            X.39J r1 = r5.A0E
            boolean r1 = r1.A03
            if (r1 == 0) goto L_0x0200
            X.2l8 r1 = r5.A0I
            if (r1 != 0) goto L_0x0200
        L_0x008b:
            r8 = 2131101335(0x7f060697, float:1.7815077E38)
        L_0x008e:
            android.content.Context r1 = r2.getContext()
            X.AnonymousClass0x2.A0q(r1, r2, r8)
            android.widget.ImageView r1 = r0.A02
            r1.setVisibility(r7)
        L_0x009a:
            android.widget.TextView r9 = r0.A06
            android.content.Context r10 = r9.getContext()
            X.2sH r8 = r3.A06
            long r1 = r5.A0B
            long r1 = r8.A0I(r1)
            r8 = 1
            java.lang.String r1 = android.text.format.DateUtils.formatDateTime(r10, r1, r8)
            r9.setText(r1)
            int r9 = r5.A00
            r1 = 5
            if (r9 != r1) goto L_0x01cc
            android.widget.TextView r10 = r0.A07
            X.33j r9 = r3.A00
            int r1 = r5.A01
            long r1 = (long) r1
            X.C107565bW.A0I(r10, r9, r1)
            r10.setVisibility(r6)
            long r1 = r5.A03
            r10 = 0
            int r9 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x01eb
            android.widget.TextView r9 = r0.A05
            X.33j r7 = r3.A00
            java.lang.String r1 = X.AnonymousClass35V.A05(r7, r1)
            r9.setText(r1)
            r9.setVisibility(r6)
        L_0x00d8:
            if (r4 == 0) goto L_0x01a5
            com.whatsapp.jid.UserJid r4 = r4.A05
            X.5ZU r2 = r3.A0L
            X.3Lo r1 = r3.A0R
            X.3ZH r1 = r1.A01(r4)
            java.lang.String r2 = X.C18300x5.A0h(r2, r1)
            boolean r1 = X.AnonymousClass4SG.A46(r3, r4)
            if (r1 == 0) goto L_0x01c3
            r1 = 2131893319(0x7f121c47, float:1.9421411E38)
            java.lang.String r6 = r3.getString(r1)
        L_0x00f5:
            if (r6 == 0) goto L_0x0107
            android.widget.TextView r4 = r0.A09
            X.33j r2 = r3.A00
            java.lang.String r1 = ""
            java.lang.String r1 = X.C107575bX.A05(r2, r1, r6)
            r4.setText(r1)
            r4.setContentDescription(r6)
        L_0x0107:
            X.1VX r1 = r3.A0D
            boolean r1 = X.C627436k.A0F(r1)
            if (r1 == 0) goto L_0x013d
            boolean r1 = r5.A0N()
            if (r1 == 0) goto L_0x0177
            X.1VX r2 = r3.A0D
            r1 = 1972(0x7b4, float:2.763E-42)
            boolean r1 = r2.A0X(r1)
            if (r1 == 0) goto L_0x0177
            r6 = 2131887389(0x7f12051d, float:1.9409384E38)
        L_0x0122:
            r1 = 2131234098(0x7f080d32, float:1.8084352E38)
        L_0x0125:
            android.widget.ImageView r4 = r0.A04
            r4.setImageResource(r1)
            android.content.Context r1 = r4.getContext()
            X.C18300x5.A13(r1, r4, r6)
            android.widget.TextView r2 = r0.A0A
            r2.setText(r6)
            r1 = 0
            r4.setVisibility(r1)
            r2.setVisibility(r1)
        L_0x013d:
            X.1VX r2 = r3.A0D
            r1 = 4004(0xfa4, float:5.611E-42)
            boolean r1 = r2.A0X(r1)
            if (r1 == 0) goto L_0x0161
            r1 = 20
            X.543 r6 = new X.543
            r6.<init>(r5, r1, r0)
            android.view.View r4 = r0.A00
            r2 = 2
            X.919 r1 = new X.919
            r1.<init>(r0, r2, r5)
            r4.setOnLongClickListener(r1)
            r4.setOnClickListener(r6)
            android.widget.CheckBox r1 = r0.A01
            r1.setOnClickListener(r6)
        L_0x0161:
            java.util.HashSet r3 = r3.A0n
            int r2 = r3.size()
            android.widget.CheckBox r1 = r0.A01
            if (r2 <= 0) goto L_0x02bd
            r0 = 0
            r1.setVisibility(r0)
            boolean r0 = r3.contains(r5)
            r1.setChecked(r0)
            return r14
        L_0x0177:
            boolean r1 = r5.A0P()
            if (r1 == 0) goto L_0x018b
            X.1VX r2 = r3.A0D
            r1 = 6307(0x18a3, float:8.838E-42)
            boolean r1 = r2.A0X(r1)
            if (r1 == 0) goto L_0x018b
            r6 = 2131887385(0x7f120519, float:1.9409376E38)
            goto L_0x0122
        L_0x018b:
            boolean r1 = r5.A0O()
            if (r1 == 0) goto L_0x0198
            r6 = 2131887387(0x7f12051b, float:1.940938E38)
            r1 = 2131233998(0x7f080cce, float:1.808415E38)
            goto L_0x0125
        L_0x0198:
            android.widget.ImageView r1 = r0.A04
            r2 = 8
            r1.setVisibility(r2)
            android.widget.TextView r1 = r0.A0A
            r1.setVisibility(r2)
            goto L_0x013d
        L_0x01a5:
            boolean r1 = r5.A0L()
            if (r1 == 0) goto L_0x0107
            X.39J r6 = r5.A0E
            boolean r1 = r6.A03
            if (r1 != 0) goto L_0x0107
            X.5ZU r4 = r3.A0L
            X.3Lo r2 = r3.A0R
            com.whatsapp.jid.UserJid r1 = r6.A01
            X.3ZH r1 = r2.A01(r1)
            java.lang.String r2 = X.C18300x5.A0h(r4, r1)
            r1 = 2131890467(0x7f121123, float:1.9415627E38)
            goto L_0x01c6
        L_0x01c3:
            r1 = 2131893318(0x7f121c46, float:1.942141E38)
        L_0x01c6:
            java.lang.String r6 = X.AnonymousClass0x2.A0X(r3, r2, r8, r1)
            goto L_0x00f5
        L_0x01cc:
            X.39J r1 = r5.A0E
            boolean r1 = r1.A03
            if (r1 == 0) goto L_0x01fa
            if (r4 != 0) goto L_0x01fa
            r1 = 2
            if (r9 == r1) goto L_0x01f6
            r1 = 3
            if (r9 == r1) goto L_0x01f2
            r1 = 4
            r2 = 2131895262(0x7f1223de, float:1.9425352E38)
            if (r9 == r1) goto L_0x01e3
            r2 = 2131887233(0x7f120481, float:1.9409067E38)
        L_0x01e3:
            android.widget.TextView r1 = r0.A07
            r1.setText(r2)
            r1.setVisibility(r6)
        L_0x01eb:
            android.widget.TextView r1 = r0.A05
            r1.setVisibility(r7)
            goto L_0x00d8
        L_0x01f2:
            r2 = 2131895419(0x7f12247b, float:1.942567E38)
            goto L_0x01e3
        L_0x01f6:
            r2 = 2131895384(0x7f122458, float:1.94256E38)
            goto L_0x01e3
        L_0x01fa:
            android.widget.TextView r1 = r0.A07
            r1.setVisibility(r7)
            goto L_0x01eb
        L_0x0200:
            r8 = 2131102686(0x7f060bde, float:1.7817817E38)
            goto L_0x008e
        L_0x0205:
            android.widget.ImageView r8 = r0.A02
            r8.setVisibility(r6)
            boolean r2 = r5.A0L
            r1 = 2131231718(0x7f0803e6, float:1.8079525E38)
            if (r2 == 0) goto L_0x0214
            r1 = 2131231803(0x7f08043b, float:1.8079697E38)
        L_0x0214:
            r8.setImageResource(r1)
            goto L_0x009a
        L_0x0219:
            boolean r1 = r5.A0P()
            if (r1 == 0) goto L_0x0228
            r1 = 6307(0x18a3, float:8.838E-42)
            boolean r1 = r8.A0X(r1)
            if (r1 == 0) goto L_0x0228
            goto L_0x0267
        L_0x0228:
            boolean r1 = r5.A0O()
            if (r1 == 0) goto L_0x0230
            goto L_0x0062
        L_0x0230:
            if (r4 == 0) goto L_0x023b
            java.lang.String r1 = r4.A06
            X.6pU r7 = new X.6pU
            r7.<init>(r1)
            goto L_0x006b
        L_0x023b:
            X.39J r1 = r5.A0E
            boolean r1 = r1.A03
            if (r1 == 0) goto L_0x0246
            r7 = 2131891562(0x7f12156a, float:1.9417848E38)
            goto L_0x0065
        L_0x0246:
            int r9 = r5.A00
            r1 = 5
            if (r9 != r1) goto L_0x0250
            r7 = 2131890159(0x7f120fef, float:1.9415002E38)
            goto L_0x0065
        L_0x0250:
            r1 = 6
            if (r9 != r1) goto L_0x0258
            r7 = 2131886108(0x7f12001c, float:1.9406786E38)
            goto L_0x0065
        L_0x0258:
            boolean r1 = r5.A0N()
            if (r1 == 0) goto L_0x0267
            boolean r1 = r8.A0X(r7)
            r7 = 2131887388(0x7f12051c, float:1.9409382E38)
            if (r1 != 0) goto L_0x0065
        L_0x0267:
            r7 = 2131890802(0x7f121272, float:1.9416306E38)
            goto L_0x0065
        L_0x026c:
            boolean r1 = X.C627436k.A0F(r1)
            if (r1 == 0) goto L_0x02a7
            r1 = 0
            X.C162457s7.A0J(r5, r1)
            boolean r6 = X.C1001059l.A04
            X.39J r1 = r5.A0E
            boolean r2 = r1.A03
            boolean r1 = r5.A0L
            if (r2 == 0) goto L_0x0291
            if (r1 == 0) goto L_0x028c
            r7 = 2131231214(0x7f0801ee, float:1.8078503E38)
            if (r6 == 0) goto L_0x0039
            r7 = 2131231215(0x7f0801ef, float:1.8078505E38)
            goto L_0x0039
        L_0x028c:
            r7 = 2131231220(0x7f0801f4, float:1.8078515E38)
            goto L_0x0039
        L_0x0291:
            if (r1 == 0) goto L_0x029d
            r7 = 2131231211(0x7f0801eb, float:1.8078497E38)
            if (r6 == 0) goto L_0x0039
            r7 = 2131231212(0x7f0801ec, float:1.8078499E38)
            goto L_0x0039
        L_0x029d:
            r7 = 2131231217(0x7f0801f1, float:1.8078509E38)
            if (r6 == 0) goto L_0x0039
            r7 = 2131231218(0x7f0801f2, float:1.807851E38)
            goto L_0x0039
        L_0x02a7:
            X.39J r1 = r5.A0E
            boolean r1 = r1.A03
            r7 = 2131233926(0x7f080c86, float:1.8084003E38)
            if (r1 == 0) goto L_0x0039
            r7 = 2131233930(0x7f080c8a, float:1.8084011E38)
            goto L_0x0039
        L_0x02b5:
            java.lang.Object r0 = r14.getTag()
            X.5LF r0 = (X.AnonymousClass5LF) r0
            goto L_0x0026
        L_0x02bd:
            r0 = 8
            r1.setVisibility(r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87104Oa.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
