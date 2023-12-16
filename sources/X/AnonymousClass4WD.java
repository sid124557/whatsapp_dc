package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.Set;

/* renamed from: X.4WD  reason: invalid class name */
public class AnonymousClass4WD extends AnonymousClass09G {
    public static final AnonymousClass0O4 A0L = new C188798zV(2);
    public AnonymousClass7D4 A00;
    public AnonymousClass5MP A01;
    public AnonymousClass7D5 A02;
    public AnonymousClass5MQ A03;
    public AnonymousClass7D6 A04;
    public AnonymousClass7D7 A05;
    public C105365Uq A06;
    public C105365Uq A07;
    public Runnable A08;
    public Set A09 = AnonymousClass002.A0K();
    public boolean A0A;
    public final AnonymousClass7C7 A0B;
    public final AnonymousClass7C9 A0C;
    public final AnonymousClass7CA A0D;
    public final AnonymousClass7CB A0E;
    public final AnonymousClass7CC A0F;
    public final AnonymousClass7CD A0G;
    public final AnonymousClass7CE A0H;
    public final AnonymousClass7CF A0I;
    public final AnonymousClass7CG A0J;
    public final AnonymousClass1VX A0K;

    public AnonymousClass4WD(AnonymousClass7C7 r2, AnonymousClass7C9 r3, AnonymousClass7CA r4, AnonymousClass7CB r5, AnonymousClass7CC r6, AnonymousClass7CD r7, AnonymousClass7CE r8, AnonymousClass7CF r9, AnonymousClass7CG r10, AnonymousClass1VX r11) {
        super(A0L);
        this.A0K = r11;
        this.A0A = r11.A0X(3675);
        this.A0B = r2;
        this.A0C = r3;
        this.A0E = r5;
        this.A0F = r6;
        this.A0D = r4;
        this.A0G = r7;
        this.A0H = r8;
        this.A0I = r9;
        this.A0J = r10;
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        Context context = viewGroup2.getContext();
        int i2 = i;
        switch (i) {
            case 0:
                View inflate = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, viewGroup2, false);
                inflate.setEnabled(false);
                return new C125556Im(inflate, this.A00);
            case 1:
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, viewGroup2, false);
                AnonymousClass7CA r0 = this.A0D;
                C105365Uq r11 = this.A07;
                C626936e.A07(r11, "single contact photo loader null");
                AnonymousClass5MP r9 = this.A01;
                C64333Db r02 = r0.A00.A04;
                return new C88304Yf(inflate2, C86614Ku.A0N(r02), r9, C64333Db.A26(r02), r11);
            case 2:
                View inflate3 = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, viewGroup2, false);
                AnonymousClass7C9 r03 = this.A0C;
                C105365Uq r12 = this.A07;
                C626936e.A07(r12, "single contact photo loader null");
                C105365Uq r112 = this.A06;
                C626936e.A07(r112, "multi contact photo loader null");
                AnonymousClass5MQ r92 = this.A03;
                C64333Db r04 = r03.A00.A04;
                C187958y5 A0o = C86614Ku.A0o(r04);
                return new C91254jE(inflate3, C86614Ku.A0N(r04), r92, C64333Db.A28(r04), r112, r12, C64333Db.A2p(r04), C64333Db.A2t(r04), C64333Db.A4B(r04), A0o);
            case 3:
                boolean z = this.A0A;
                LayoutInflater from = LayoutInflater.from(context);
                if (z) {
                    View inflate4 = from.inflate(R.layout.f8nameremoved, viewGroup2, false);
                    AnonymousClass7CG r05 = this.A0J;
                    C105365Uq r4 = this.A07;
                    C626936e.A07(r4, "single contact photo loader null");
                    return new C88334Yi(inflate4, C86614Ku.A0N(r05.A00.A04), this.A02, r4);
                }
                View inflate5 = from.inflate(R.layout.f8nameremoved, viewGroup2, false);
                AnonymousClass7CF r06 = this.A0I;
                C105365Uq r10 = this.A07;
                C626936e.A07(r10, "single contact photo loader null");
                C105365Uq r113 = this.A06;
                C626936e.A07(r113, "multi contact photo loader null");
                return new C88424Yr(inflate5, C86614Ku.A0N(r06.A00.A04), this.A02, r10, r113);
            case 4:
                View inflate6 = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, viewGroup2, false);
                C64333Db r07 = this.A0E.A00.A04;
                return new C88094Xh(inflate6, C64333Db.A04(r07), C64333Db.A24(r07), C86614Ku.A0o(r07));
            case 5:
                View inflate7 = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, viewGroup2, false);
                AnonymousClass7CD r1 = this.A0G;
                Runnable runnable = this.A08;
                C626936e.A07(runnable, "callsHistoryAdapter/onCreateViewHolder no E2E runnable");
                C64333Db r08 = r1.A00.A04;
                return new AnonymousClass12B(inflate7, C64333Db.A4B(r08), C18280x3.A0Q(r08.A00), runnable);
            case 6:
                View inflate8 = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, viewGroup2, false);
                C64333Db r09 = this.A0F.A00.A04;
                return new C88104Xi(inflate8, C64333Db.A4B(r09), C86614Ku.A0o(r09), C72343dZ.A00(r09.A00.AAR));
            case 7:
                View inflate9 = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, viewGroup2, false);
                AnonymousClass7CE r010 = this.A0H;
                C105365Uq r2 = this.A07;
                C626936e.A07(r2, "single contact photo loader null");
                C64333Db r011 = r010.A00.A04;
                return new C91244jD(inflate9, C86614Ku.A0N(r011), C64333Db.A26(r011), r2);
            case 8:
                View inflate10 = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, viewGroup2, false);
                AnonymousClass7C7 r012 = this.A0B;
                C105365Uq r122 = this.A07;
                C626936e.A07(r122, "single contact photo loader null");
                AnonymousClass5MP r102 = this.A01;
                C64333Db r013 = r012.A00.A04;
                C64773Ex A26 = C64333Db.A26(r013);
                AnonymousClass1VX A4B = C64333Db.A4B(r013);
                return new C88364Yl(inflate10, C64333Db.A06(r013), C86614Ku.A0N(r013), r102, A26, r122, C64333Db.A3G(r013), A4B);
            default:
                C18260x0.A0x("callsHistoryAdapter/onCreateViewHolder failed to match type to view: ", AnonymousClass001.A0o(), i2);
                throw new RuntimeException("callsHistoryAdapter/onCreateViewHolder type mismatch");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: X.4jE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: X.4jD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: X.4jE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: X.4jE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: X.4jE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: X.4jE} */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0484, code lost:
        r14.A07(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0487, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0153, code lost:
        r0 = "CallsHistoryContactItemViewHolder/setEventListeners event listener empty";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x022e, code lost:
        if (r13.A09.contains(r0.A03()) == false) goto L_0x0230;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0526  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0394  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BNf(X.C05570Ua r14, int r15) {
        /*
            r13 = this;
            int r0 = r13.A0G()
            if (r15 < r0) goto L_0x0014
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "callsHistoryAdapter/onBindViewHolder no item exists at position "
        L_0x000c:
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r15)
        L_0x0010:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0013:
            return
        L_0x0014:
            java.lang.Object r2 = r13.A0K(r15)
            X.8u2 r2 = (X.C185658u2) r2
            if (r2 != 0) goto L_0x0023
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "callsHistoryAdapter/onBindViewHolder null item at position "
            goto L_0x000c
        L_0x0023:
            X.7D7 r7 = r13.A05
            if (r7 == 0) goto L_0x004d
            double r5 = (double) r15
            double r3 = (double) r0
            r0 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r3 = r3 * r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x004d
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r0 = r7.A00
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r0.A0G
            X.5XL r3 = r0.A0L
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x004d
            X.54O r0 = r3.A02
            if (r0 != 0) goto L_0x004d
            X.54O r1 = new X.54O
            r1.<init>(r3)
            r3.A02 = r1
            X.4FS r0 = r3.A0Q
            X.C86614Ku.A1R(r1, r0)
        L_0x004d:
            int r15 = r2.B8k()
            switch(r15) {
                case 0: goto L_0x0157;
                case 1: goto L_0x00fb;
                case 2: goto L_0x02e8;
                case 3: goto L_0x00c7;
                case 4: goto L_0x0013;
                case 5: goto L_0x0013;
                case 6: goto L_0x0013;
                case 7: goto L_0x021d;
                case 8: goto L_0x005b;
                default: goto L_0x0054;
            }
        L_0x0054:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "callsHistoryAdapter/onBindViewHolder failed to match type to bind: "
            goto L_0x000c
        L_0x005b:
            X.8FY r2 = (X.AnonymousClass8FY) r2
            X.4Yl r14 = (X.C88364Yl) r14
            X.3Ex r0 = r14.A06
            com.whatsapp.jid.GroupJid r8 = r2.A01
            X.3ZH r4 = r0.A0A(r8)
            X.5Uq r0 = r14.A07
            com.whatsapp.components.button.ThumbnailButton r3 = r14.A05
            r0.A08(r3, r4)
            X.5YB r5 = r14.A01
            com.whatsapp.TextEmojiLabel r1 = r5.A02
            X.C106905aM.A04(r1)
            java.util.List r0 = r2.A02
            r5.A0A(r4, r0)
            r0 = 1
            r1.setSingleLine(r0)
            com.whatsapp.WaImageView r6 = r14.A03
            android.content.Context r7 = r6.getContext()
            X.1VX r5 = r14.A09
            X.2sr r1 = r14.A00
            X.2sj r0 = r14.A08
            int r0 = X.C86664Kz.A0H(r0, r8)
            boolean r0 = X.C627436k.A0B(r1, r5, r0)
            if (r0 == 0) goto L_0x00bd
            r0 = 2131891407(0x7f1214cf, float:1.9417533E38)
            X.C18300x5.A13(r7, r6, r0)
            r0 = 2131234233(0x7f080db9, float:1.8084626E38)
        L_0x009d:
            r6.setImageResource(r0)
            X.5MP r0 = r14.A04
            if (r0 == 0) goto L_0x0153
            r0 = 20
            X.C109725f5.A00(r6, r14, r2, r4, r0)
            com.whatsapp.WaImageView r1 = r14.A02
            r0 = 21
            X.C109725f5.A00(r1, r14, r2, r4, r0)
            android.view.View r1 = r14.A0H
            r0 = 46
            X.C109705f3.A00(r1, r14, r2, r0)
            r0 = 24
            X.C18320x8.A16(r3, r14, r2, r0)
            return
        L_0x00bd:
            r0 = 2131886482(0x7f120192, float:1.9407544E38)
            X.C18300x5.A13(r7, r6, r0)
            r0 = 2131231718(0x7f0803e6, float:1.8079525E38)
            goto L_0x009d
        L_0x00c7:
            boolean r0 = r14 instanceof X.C88334Yi
            if (r0 == 0) goto L_0x00df
            X.4Yi r14 = (X.C88334Yi) r14
            X.5jk r2 = (X.C112445jk) r2
            X.5rE r0 = r2.A01
            X.5R4 r3 = r2.A02
            java.util.ArrayList r1 = r0.A04
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0535
            java.lang.String r0 = "CallsHistoryLiveOngoingJoinableCallViewHolder/bindCall no calls registered"
            goto L_0x0010
        L_0x00df:
            X.4Yr r14 = (X.C88424Yr) r14
            X.5jk r2 = (X.C112445jk) r2
            r14.A00 = r2
            X.5rE r0 = r2.A01
            X.5R4 r9 = r2.A02
            java.util.ArrayList r1 = r0.A04
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "CallsHistoryOngoingJoinableCallViewHolder/bindCall no calls registered"
            goto L_0x0010
        L_0x00f5:
            if (r9 != 0) goto L_0x05c4
            java.lang.String r0 = "CallsHistoryOngoingJoinableCallViewHolder/bindCall no view state registered"
            goto L_0x0010
        L_0x00fb:
            X.8FX r2 = (X.AnonymousClass8FX) r2
            X.4Yf r14 = (X.C88304Yf) r14
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            X.3Ex r1 = r14.A01
            com.whatsapp.jid.UserJid r0 = r2.A01
            X.3ZH r4 = r1.A0A(r0)
            X.5Uq r1 = r14.A02
            X.66R r3 = r14.A04
            java.lang.Object r0 = r3.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.A08(r0, r4)
            X.66R r0 = r14.A03
            java.lang.Object r1 = r0.getValue()
            X.5YB r1 = (X.AnonymousClass5YB) r1
            java.util.List r0 = r2.A02
            r1.A0A(r4, r0)
            X.C162457s7.A0H(r4)
            X.5MP r0 = r14.A00
            if (r0 == 0) goto L_0x0153
            android.view.View r1 = r14.A0H
            r0 = 45
            X.C109705f3.A00(r1, r14, r2, r0)
            X.66R r0 = r14.A06
            android.view.View r1 = X.C86644Kx.A0H(r0)
            r0 = 17
            X.C109725f5.A00(r1, r14, r2, r4, r0)
            X.66R r0 = r14.A05
            android.view.View r1 = X.C86644Kx.A0H(r0)
            r0 = 18
            X.C109725f5.A00(r1, r14, r2, r4, r0)
            android.view.View r1 = X.C86644Kx.A0H(r3)
            r0 = 23
            X.C18320x8.A16(r1, r14, r2, r0)
            return
        L_0x0153:
            java.lang.String r0 = "CallsHistoryContactItemViewHolder/setEventListeners event listener empty"
            goto L_0x0010
        L_0x0157:
            X.6Im r14 = (X.C125556Im) r14
            X.8FZ r2 = (X.AnonymousClass8FZ) r2
            X.1VX r3 = r13.A0K
            com.whatsapp.WaTextView r7 = r14.A02
            android.content.res.Resources r6 = r7.getResources()
            r0 = 4574(0x11de, float:6.41E-42)
            boolean r0 = r3.A0X(r0)
            if (r0 == 0) goto L_0x01f6
            r0 = 2132083051(0x7f15016b, float:1.9806233E38)
            X.AnonymousClass0Y9.A06(r7, r0)
            int r5 = r7.getPaddingLeft()
            r0 = 2131165603(0x7f0701a3, float:1.7945428E38)
            int r4 = r6.getDimensionPixelSize(r0)
            int r1 = r7.getPaddingRight()
            r0 = 2131165602(0x7f0701a2, float:1.7945426E38)
        L_0x0183:
            int r0 = r6.getDimensionPixelSize(r0)
            r7.setPadding(r5, r4, r1, r0)
            X.C106905aM.A04(r7)
            int r0 = r2.A00
            r7.setText(r0)
            boolean r1 = r2.A02
            android.view.View r0 = r14.A00
            if (r1 == 0) goto L_0x020d
            r1 = 0
            if (r0 != 0) goto L_0x01f2
            X.5UY r0 = r14.A03
            android.view.View r0 = X.AnonymousClass5UY.A00(r0, r1)
            r14.A00 = r0
        L_0x01a3:
            android.view.View r1 = r14.A00
            if (r1 == 0) goto L_0x01ba
            r0 = 2131430840(0x7f0b0db8, float:1.8483392E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r1, r0)
            java.lang.String r0 = r2.A01
            r1.setText(r0)
            android.view.View r1 = r14.A00
            r0 = 38
            X.C18300x5.A18(r1, r14, r0)
        L_0x01ba:
            r0 = 4574(0x11de, float:6.41E-42)
            boolean r0 = r3.A0X(r0)
            android.view.View r5 = r14.A00
            int r4 = r5.getPaddingLeft()
            if (r0 == 0) goto L_0x01e0
            r0 = 2131165603(0x7f0701a3, float:1.7945428E38)
            int r3 = r6.getDimensionPixelSize(r0)
            android.view.View r0 = r14.A00
            int r2 = r0.getPaddingRight()
            r0 = 2131165602(0x7f0701a2, float:1.7945426E38)
            int r0 = r6.getDimensionPixelSize(r0)
        L_0x01dc:
            r5.setPadding(r4, r3, r2, r0)
            return
        L_0x01e0:
            r1 = 2131168105(0x7f070b69, float:1.7950502E38)
            int r3 = r6.getDimensionPixelSize(r1)
            android.view.View r0 = r14.A00
            int r2 = r0.getPaddingRight()
            int r0 = r6.getDimensionPixelSize(r1)
            goto L_0x01dc
        L_0x01f2:
            r0.setVisibility(r1)
            goto L_0x01a3
        L_0x01f6:
            r0 = 2132083052(0x7f15016c, float:1.9806235E38)
            X.AnonymousClass0Y9.A06(r7, r0)
            int r5 = r7.getPaddingLeft()
            r0 = 2131168105(0x7f070b69, float:1.7950502E38)
            int r4 = r6.getDimensionPixelSize(r0)
            int r1 = r7.getPaddingRight()
            goto L_0x0183
        L_0x020d:
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0013
            android.view.View r1 = r14.A00
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x021d:
            X.5rE r0 = r2.B58()
            if (r0 == 0) goto L_0x0230
            java.util.Set r1 = r13.A09
            java.lang.String r0 = r0.A03()
            boolean r0 = r1.contains(r0)
            r5 = 1
            if (r0 != 0) goto L_0x0231
        L_0x0230:
            r5 = 0
        L_0x0231:
            X.4jD r14 = (X.C91244jD) r14
            X.5ji r2 = (X.C112425ji) r2
            X.7D6 r4 = r13.A04
            X.5Qs r3 = r2.A03
            X.3Ex r1 = r14.A0D
            X.4uZ r0 = r2.A04
            X.3ZH r6 = r1.A0A(r0)
            r14.A05 = r6
            boolean r0 = r3.A09
            r14.A06 = r0
            long r0 = r2.A01
            r14.A01 = r0
            int r0 = r3.A01
            r14.A00 = r0
            X.5rE r0 = r2.A02
            r14.A02 = r0
            r14.A03 = r2
            X.5Uq r0 = r14.A0E
            com.whatsapp.components.button.ThumbnailButton r7 = r14.A0C
            r0.A08(r7, r6)
            android.view.View r6 = r14.A0H
            r0 = 2131433238(0x7f0b1716, float:1.8488256E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r6, r0)
            java.lang.String r0 = r3.A07
            r1.setText(r0)
            X.5YB r1 = r14.A08
            X.3ZH r0 = r14.A05
            r1.A08(r0)
            int r2 = r14.A00
            r0 = 1
            com.whatsapp.WaTextView r1 = r14.A0A
            if (r2 != r0) goto L_0x02bc
            r0 = 0
            r1.setVisibility(r0)
            android.widget.LinearLayout r1 = r14.A07
            r0 = 8
            r1.setVisibility(r0)
        L_0x0283:
            com.whatsapp.WaImageView r2 = r14.A09
            android.content.Context r1 = r6.getContext()
            int r0 = r3.A04
            X.C18290x4.A1A(r1, r2, r0)
            android.content.Context r1 = r6.getContext()
            int r0 = r3.A05
            X.C86634Kw.A14(r1, r2, r0)
            android.content.Context r1 = r6.getContext()
            int r0 = r3.A03
            X.C18300x5.A13(r1, r2, r0)
            java.lang.String r0 = r3.A08
            X.AnonymousClass0YZ.A0F(r7, r0)
            if (r4 == 0) goto L_0x0484
            r14.A04 = r4
            r0 = 4
            X.C18320x8.A13(r6, r14, r0)
            r0 = 0
            X.C1237169m.A00(r6, r4, r14, r0)
            r0 = 3
            X.C18320x8.A13(r7, r14, r0)
            r0 = 47
            X.C109705f3.A00(r2, r14, r4, r0)
            goto L_0x0484
        L_0x02bc:
            r0 = 8
            r1.setVisibility(r0)
            android.widget.LinearLayout r1 = r14.A07
            r0 = 0
            r1.setVisibility(r0)
            r0 = 2131428383(0x7f0b041f, float:1.8478409E38)
            android.widget.ImageView r2 = X.AnonymousClass0x9.A0E(r6, r0)
            android.content.Context r1 = r6.getContext()
            int r0 = r3.A00
            X.C86634Kw.A14(r1, r2, r0)
            r0 = 2131433237(0x7f0b1715, float:1.8488254E38)
            android.widget.TextView r2 = X.C18300x5.A0G(r6, r0)
            X.7Qw r1 = r3.A06
            android.content.Context r0 = r6.getContext()
            X.C86614Ku.A12(r0, r2, r1)
            goto L_0x0283
        L_0x02e8:
            X.5jj r2 = (X.C112435jj) r2
            X.4jE r14 = (X.C91254jE) r14
            java.util.Set r1 = r13.A09
            X.5rE r0 = r2.A01
            java.lang.String r0 = r0.A03()
            boolean r5 = r1.contains(r0)
            r14.A00 = r2
            X.5RB r4 = r2.A02
            X.C162457s7.A0D(r4)
            X.66R r8 = r14.A0C
            android.view.View r1 = X.C86644Kx.A0H(r8)
            java.lang.String r0 = r4.A0D
            X.AnonymousClass0YZ.A0F(r1, r0)
            boolean r2 = r4.A0H
            X.66R r6 = r14.A0E
            android.view.View r1 = X.C86644Kx.A0H(r6)
            X.C162457s7.A0D(r1)
            r3 = 0
            int r0 = X.AnonymousClass001.A08(r2)
            r1.setVisibility(r0)
            android.view.View r1 = X.C86644Kx.A0H(r8)
            X.C162457s7.A0D(r1)
            r0 = r2 ^ 1
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
            java.lang.String r7 = "Required value was null."
            if (r2 == 0) goto L_0x04d8
            X.66R r0 = r14.A0B
            java.lang.Object r2 = r0.getValue()
            X.5YB r2 = (X.AnonymousClass5YB) r2
            X.7Qw r1 = r4.A0B
            if (r1 == 0) goto L_0x052b
            android.content.Context r0 = X.C86664Kz.A0T(r14)
            java.lang.CharSequence r1 = r1.A00(r0)
            r0 = 0
            r2.A0B(r0, r1)
            java.lang.Object r6 = r6.getValue()
            com.whatsapp.calling.views.MultiContactThumbnail r6 = (com.whatsapp.calling.views.MultiContactThumbnail) r6
            java.util.List r2 = r4.A0E
            X.5Uq r1 = r14.A03
            X.8rY r0 = X.C106255Yf.A00
            r6.A00(r0, r1, r2)
        L_0x0358:
            X.66R r1 = r14.A0F
            java.lang.Object r0 = r1.getValue()
            X.5UY r0 = (X.AnonymousClass5UY) r0
            android.view.View r0 = r0.A01
            if (r0 == 0) goto L_0x0373
            java.lang.Object r0 = r1.getValue()
            X.5UY r0 = (X.AnonymousClass5UY) r0
            android.view.View r1 = r0.A04()
            r0 = 8
            r1.setVisibility(r0)
        L_0x0373:
            X.66R r11 = r14.A0B
            java.lang.Object r2 = r11.getValue()
            X.5YB r2 = (X.AnonymousClass5YB) r2
            android.view.View r6 = r14.A0H
            android.content.Context r1 = r6.getContext()
            int r0 = r4.A05
            int r0 = X.AnonymousClass0Y8.A04(r1, r0)
            X.AnonymousClass5YB.A03(r2, r0)
            java.lang.Object r2 = r11.getValue()
            X.5YB r2 = (X.AnonymousClass5YB) r2
            X.7Qw r1 = r4.A0B
            if (r1 == 0) goto L_0x0526
            android.content.Context r0 = r6.getContext()
            java.lang.CharSequence r1 = r1.A00(r0)
            r0 = 0
            r2.A0B(r0, r1)
            X.33j r2 = r14.A06
            long r0 = r4.A09
            java.lang.CharSequence r1 = X.C107565bW.A03(r2, r0)
            X.C162457s7.A0D(r1)
            r4.A0C = r1
            X.66R r0 = r14.A0D
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
            int r8 = r4.A00
            int r7 = r4.A01
            int r10 = r4.A05
            r9 = 1
            if (r8 > r9) goto L_0x04a5
            X.66R r0 = r14.A09
            java.lang.Object r0 = r0.getValue()
            X.C86634Kw.A1R(r0)
        L_0x03ca:
            X.66R r7 = r14.A0A
            java.lang.Object r1 = r7.getValue()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r0 = r4.A03
            r1.setImageResource(r0)
            java.lang.Object r2 = r7.getValue()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.Context r1 = r6.getContext()
            int r0 = r4.A04
            int r0 = X.AnonymousClass0Y8.A04(r1, r0)
            X.C107335b8.A0E(r2, r0)
            android.view.View r2 = X.C86644Kx.A0H(r7)
            android.content.Context r1 = r6.getContext()
            int r0 = r4.A02
            X.C18300x5.A13(r1, r2, r0)
            int r9 = r4.A08
            int r8 = r4.A07
            int r7 = r4.A06
            r2 = 8
            if (r9 == 0) goto L_0x049e
            X.66R r1 = r14.A0I
            java.lang.Object r0 = r1.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r9)
            X.C86624Kv.A1T(r1, r3)
        L_0x040f:
            X.66R r1 = r14.A0H
            java.lang.Object r0 = r1.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r8 == 0) goto L_0x049a
            r0.setImageResource(r8)
            X.C86624Kv.A1T(r1, r3)
        L_0x041f:
            android.view.View r1 = X.C86644Kx.A0H(r1)
            if (r7 == 0) goto L_0x0498
            java.lang.String r0 = X.C86624Kv.A0b(r6, r7)
        L_0x0429:
            r1.setContentDescription(r0)
            boolean r2 = r4.A0G
            X.66R r6 = r14.A0L
            android.view.View r0 = X.C86644Kx.A0H(r6)
            X.C107215at.A05(r0, r2)
            X.66R r1 = r14.A0K
            android.view.View r0 = X.C86644Kx.A0H(r1)
            X.C107215at.A05(r0, r2)
            boolean r2 = r4.A0I
            android.view.View r1 = X.C86644Kx.A0H(r1)
            X.C162457s7.A0D(r1)
            int r0 = X.AnonymousClass001.A08(r2)
            r1.setVisibility(r0)
            android.view.View r1 = X.C86644Kx.A0H(r6)
            X.C162457s7.A0D(r1)
            r0 = r2 ^ 1
            if (r0 != 0) goto L_0x045d
            r3 = 8
        L_0x045d:
            r1.setVisibility(r3)
            if (r2 != 0) goto L_0x0484
            android.view.View r0 = X.C86644Kx.A0H(r6)
            android.content.Context r2 = r0.getContext()
            boolean r0 = r4.A0J
            android.view.View r1 = X.C86644Kx.A0H(r6)
            if (r0 == 0) goto L_0x0488
            r0 = 2131891407(0x7f1214cf, float:1.9417533E38)
            X.C18300x5.A13(r2, r1, r0)
            java.lang.Object r1 = r6.getValue()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131234233(0x7f080db9, float:1.8084626E38)
        L_0x0481:
            r1.setImageResource(r0)
        L_0x0484:
            r14.A07(r5)
            return
        L_0x0488:
            r0 = 2131886482(0x7f120192, float:1.9407544E38)
            X.C18300x5.A13(r2, r1, r0)
            java.lang.Object r1 = r6.getValue()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131231718(0x7f0803e6, float:1.8079525E38)
            goto L_0x0481
        L_0x0498:
            r0 = 0
            goto L_0x0429
        L_0x049a:
            r0.setVisibility(r2)
            goto L_0x041f
        L_0x049e:
            X.66R r0 = r14.A0I
            X.C86624Kv.A1T(r0, r2)
            goto L_0x040f
        L_0x04a5:
            X.66R r2 = r14.A09
            X.C86624Kv.A1T(r2, r3)
            java.lang.Object r1 = r2.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r0 = r6.getContext()
            X.AnonymousClass0x2.A0q(r0, r1, r10)
            java.lang.Object r0 = r11.getValue()
            X.5YB r0 = (X.AnonymousClass5YB) r0
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            com.whatsapp.TextEmojiLabel r0 = r0.A02
            r0.setEllipsize(r1)
            java.lang.Object r2 = r2.getValue()
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r1 = r6.getContext()
            java.lang.Object[] r0 = new java.lang.Object[r9]
            X.AnonymousClass000.A1P(r0, r8, r3)
            X.AnonymousClass001.A0y(r1, r2, r0, r7)
            goto L_0x03ca
        L_0x04d8:
            X.3ZH r2 = r4.A0A
            if (r2 == 0) goto L_0x0530
            X.5Uq r1 = r14.A04
            java.lang.Object r0 = r8.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.A08(r0, r2)
            boolean r0 = r2.A0U()
            if (r0 != 0) goto L_0x0358
            X.2k5 r0 = r2.A0F
            if (r0 != 0) goto L_0x0358
            X.1VX r1 = r14.A07
            r0 = 4094(0xffe, float:5.737E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0358
            X.5ZU r0 = r14.A02
            java.lang.String r2 = r0.A0O(r2)
            if (r2 == 0) goto L_0x0358
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0358
            X.66R r1 = r14.A0F
            java.lang.Object r0 = r1.getValue()
            X.5UY r0 = (X.AnonymousClass5UY) r0
            r0.A06(r3)
            java.lang.Object r0 = r1.getValue()
            X.5UY r0 = (X.AnonymousClass5UY) r0
            android.view.View r1 = r0.A04()
            r0 = 2131432765(0x7f0b153d, float:1.8487297E38)
            X.C86624Kv.A17(r1, r2, r0)
            goto L_0x0373
        L_0x0526:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r7)
            throw r0
        L_0x052b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r7)
            throw r0
        L_0x0530:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r7)
            throw r0
        L_0x0535:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            r7 = 0
            java.lang.Object r6 = r0.get(r7)
            X.3ZH r4 = r2.A03
            if (r4 == 0) goto L_0x0549
            X.5Uq r1 = r14.A06
            com.whatsapp.components.button.ThumbnailButton r0 = r14.A05
            r1.A08(r0, r4)
        L_0x0549:
            android.view.View r4 = r14.A0H
            android.content.Context r8 = r4.getContext()
            X.7Qw r0 = r3.A05
            java.lang.String r9 = X.C86634Kw.A0y(r8, r0)
            X.5YB r1 = r14.A01
            java.util.List r0 = r2.A05
            r1.A0B(r0, r9)
            com.whatsapp.wds.components.button.WDSButton r5 = r14.A08
            int r0 = r3.A00
            r5.setIcon((int) r0)
            X.7Qw r0 = r3.A06
            if (r0 == 0) goto L_0x056a
            X.C86614Ku.A12(r8, r5, r0)
        L_0x056a:
            com.whatsapp.WaTextView r1 = r14.A02
            X.7Qw r0 = r3.A07
            X.C86614Ku.A12(r8, r1, r0)
            X.7Qw r0 = r3.A04
            r11 = 8
            X.5UY r12 = r14.A07
            if (r0 == 0) goto L_0x05b9
            android.view.View r10 = X.AnonymousClass5UY.A00(r12, r7)
            com.whatsapp.TextEmojiLabel r10 = (com.whatsapp.TextEmojiLabel) r10
            X.7Qw r0 = r3.A04
            java.lang.CharSequence r1 = r0.A00(r8)
            r0 = 0
            r10.A0K(r0, r1)
            android.view.View r10 = r12.A04()
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 2130971032(0x7f040998, float:1.755079E38)
            r0 = 2131102700(0x7f060bec, float:1.7817845E38)
            X.AnonymousClass5Yj.A0B(r8, r10, r1, r0)
        L_0x0598:
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x05bd
            java.util.List r0 = r3.A0A
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            java.util.Iterator r11 = r0.iterator()
        L_0x05a6:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0682
            X.3ZH r1 = X.C18310x6.A0R(r11)
            X.8FP r0 = new X.8FP
            r0.<init>(r1)
            r10.add(r0)
            goto L_0x05a6
        L_0x05b9:
            r12.A06(r11)
            goto L_0x0598
        L_0x05bd:
            com.whatsapp.calling.PeerAvatarLayout r0 = r14.A03
            r0.setVisibility(r11)
            goto L_0x0696
        L_0x05c4:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            r6 = 0
            java.lang.Object r5 = r0.get(r6)
            boolean r1 = r9.A0D
            com.whatsapp.calling.views.MultiContactThumbnail r4 = r14.A07
            r7 = 8
            int r0 = X.C86614Ku.A01(r1)
            r4.setVisibility(r0)
            com.whatsapp.components.button.ThumbnailButton r3 = r14.A08
            int r0 = X.AnonymousClass001.A08(r1)
            r3.setVisibility(r0)
            if (r1 == 0) goto L_0x0667
            X.5Uq r1 = r14.A0A
            X.3ZH r0 = r2.A03
            X.C626936e.A06(r0)
            r1.A08(r3, r0)
        L_0x05ef:
            android.view.View r4 = r14.A0H
            android.content.Context r8 = r4.getContext()
            X.7Qw r0 = r9.A05
            java.lang.String r1 = X.C86634Kw.A0y(r8, r0)
            X.5YB r10 = r14.A03
            java.util.List r0 = r2.A05
            r10.A0B(r0, r1)
            int r0 = r9.A03
            r1 = 2131102700(0x7f060bec, float:1.7817845E38)
            if (r0 != r1) goto L_0x0610
            r0 = 2130971032(0x7f040998, float:1.755079E38)
            int r0 = X.AnonymousClass5Yj.A02(r8, r0, r1)
        L_0x0610:
            int r3 = X.AnonymousClass0Y8.A04(r8, r0)
            X.7Qw r0 = r9.A04
            if (r0 == 0) goto L_0x0661
            X.5UY r7 = r14.A0B
            android.view.View r1 = X.AnonymousClass5UY.A00(r7, r6)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.7Qw r0 = r9.A04
            X.C86614Ku.A12(r8, r1, r0)
            android.view.View r0 = r7.A04()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextColor(r3)
        L_0x062e:
            com.whatsapp.TextEmojiLabel r0 = r14.A02
            r0.setTextColor(r3)
            com.whatsapp.WaImageView r1 = r14.A04
            int r0 = r9.A00
            r1.setImageResource(r0)
            com.whatsapp.WaTextView r1 = r14.A05
            X.7Qw r0 = r9.A07
            X.C86614Ku.A12(r8, r1, r0)
            int r7 = r9.A02
            int r3 = r9.A01
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            com.whatsapp.TextEmojiLabel r0 = r10.A02
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r1 = X.AnonymousClass002.A0F(r8, r0, r1, r6, r7)
            java.lang.String r0 = r8.getString(r3)
            X.C86654Ky.A1A(r4, r1, r0, r6)
            X.7D5 r0 = r14.A06
            if (r0 != 0) goto L_0x067a
            java.lang.String r0 = "CallsHistoryOngoingJoinableCallViewHolder/setEventListeners event listener empty"
            goto L_0x06ac
        L_0x0661:
            X.5UY r0 = r14.A0B
            r0.A06(r7)
            goto L_0x062e
        L_0x0667:
            java.util.List r0 = r9.A0A
            int r0 = r0.size()
            if (r0 == 0) goto L_0x05ef
            java.util.List r3 = r9.A0A
            X.5Uq r1 = r14.A09
            X.8rY r0 = X.C106255Yf.A00
            r4.A00(r0, r1, r3)
            goto L_0x05ef
        L_0x067a:
            android.view.View r1 = r14.A01
            r0 = 24
            X.C109725f5.A00(r1, r14, r5, r2, r0)
            goto L_0x06af
        L_0x0682:
            X.7Qw r1 = r3.A08
            if (r1 == 0) goto L_0x068e
            X.8FQ r0 = new X.8FQ
            r0.<init>(r1)
            r10.add(r0)
        L_0x068e:
            com.whatsapp.calling.PeerAvatarLayout r0 = r14.A03
            r0.setVisibility(r7)
            r0.A14(r10)
        L_0x0696:
            int r1 = r3.A02
            int r3 = r3.A01
            r0 = 1
            java.lang.String r1 = X.AnonymousClass0x2.A0X(r8, r9, r0, r1)
            java.lang.String r0 = r8.getString(r3)
            X.C86654Ky.A1A(r4, r1, r0, r7)
            X.7D5 r0 = r14.A04
            if (r0 != 0) goto L_0x06b3
            java.lang.String r0 = "CallsHistoryLiveOngoingJoinableCallViewHolder/setEventListeners event listener empty"
        L_0x06ac:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x06af:
            X.C107235av.A02(r4)
            return
        L_0x06b3:
            android.view.View r1 = r14.A00
            r0 = 22
            X.C109725f5.A00(r1, r14, r6, r2, r0)
            r0 = 23
            X.C109725f5.A00(r5, r14, r6, r2, r0)
            goto L_0x06af
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4WD.BNf(X.0Ua, int):void");
    }

    public int getItemViewType(int i) {
        return ((C185658u2) A0K(i)).B8k();
    }
}
