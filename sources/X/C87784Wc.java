package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4Wc  reason: invalid class name and case insensitive filesystem */
public class C87784Wc extends AnonymousClass0R6 {
    public final Activity A00;
    public final AnonymousClass0QY A01 = new AnonymousClass0QY(new AnonymousClass4ZL(this), C52882mC.class);
    public final C56972sr A02;
    public final AnonymousClass64J A03;
    public final AnonymousClass2FJ A04;
    public final AnonymousClass5UX A05;
    public final C64773Ex A06;
    public final AnonymousClass5ZU A07;
    public final C105365Uq A08;
    public final C56982ss A09;
    public final C56892sj A0A;
    public final AnonymousClass1VX A0B;
    public final boolean A0C;

    public int A0G() {
        return this.A01.A03;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BNf(X.C05570Ua r11, int r12) {
        /*
            r10 = this;
            X.4Yq r11 = (X.C88414Yq) r11
            X.0QY r0 = r10.A01
            java.lang.Object r5 = r0.A01(r12)
            X.2mC r5 = (X.C52882mC) r5
            X.5Uq r7 = r10.A08
            X.2FJ r4 = r10.A04
            X.3Ex r0 = r11.A06
            com.whatsapp.jid.GroupJid r3 = r5.A02
            X.3ZH r6 = r0.A0A(r3)
            X.2ss r2 = r11.A08
            int r1 = r2.A06(r3)
            r0 = 3
            if (r1 != r0) goto L_0x00e6
            X.5UX r8 = r11.A05
            com.whatsapp.components.button.ThumbnailButton r7 = r11.A04
            boolean r0 = X.C1001059l.A03
            r6 = 2131231003(0x7f08011b, float:1.8078075E38)
            if (r0 == 0) goto L_0x002d
            r6 = 2131231004(0x7f08011c, float:1.8078077E38)
        L_0x002d:
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131168243(0x7f070bf3, float:1.7950782E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
        L_0x003a:
            r8.A05(r7, r0, r6, r1)
        L_0x003d:
            int r6 = r2.A06(r3)
            r1 = 3
            X.5YB r0 = r11.A02
            if (r6 != r1) goto L_0x00dd
            r1 = 2131887935(0x7f12073f, float:1.9410491E38)
            com.whatsapp.TextEmojiLabel r0 = r0.A02
            r0.setText(r1)
        L_0x004e:
            int r1 = r2.A06(r3)
            r0 = 3
            if (r1 == r0) goto L_0x00d5
            X.2sj r0 = r11.A09
            X.33k r1 = X.C56892sj.A01(r0, r3)
            X.2sr r0 = r11.A00
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x00c7
            X.5ZU r1 = r11.A07
            r0 = 1
            java.lang.String r6 = r1.A0U(r3, r0, r0)
        L_0x006a:
            if (r6 == 0) goto L_0x00d5
            com.whatsapp.TextEmojiLabel r1 = r11.A01
            r0 = 0
            r1.setVisibility(r0)
            r0 = 0
            r1.A0K(r0, r6)
        L_0x0076:
            com.whatsapp.WaImageButton r6 = r11.A03
            android.content.Context r1 = r6.getContext()
            r0 = 2131893004(0x7f121b0c, float:1.9420772E38)
            X.C18300x5.A13(r1, r6, r0)
            android.content.Context r9 = r6.getContext()
            r7 = 2131886183(0x7f120067, float:1.9406938E38)
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            r8 = 0
            java.lang.String r0 = r5.A03
            java.lang.String r7 = X.AnonymousClass002.A0F(r9, r0, r1, r8, r7)
            r0 = 1
            X.7Go[] r1 = new X.C148007Go[r0]
            X.6eS r0 = new X.6eS
            r0.<init>(r7)
            r1[r8] = r0
            r0 = 1
            X.C86614Ku.A1H(r6, r1, r0)
            int r1 = r2.A06(r3)
            r0 = 3
            if (r1 == r0) goto L_0x00be
            r0 = 17
            X.C18290x4.A1I(r6, r4, r5, r0)
            r6.setVisibility(r8)
        L_0x00b1:
            boolean r0 = r10.A0C
            if (r0 != 0) goto L_0x00bd
            r0 = 0
            r6.setOnClickListener(r0)
            r0 = 4
            r6.setVisibility(r0)
        L_0x00bd:
            return
        L_0x00be:
            r0 = 0
            r6.setOnClickListener(r0)
            r0 = 4
            r6.setVisibility(r0)
            goto L_0x00b1
        L_0x00c7:
            com.whatsapp.TextEmojiLabel r0 = r11.A01
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131888015(0x7f12078f, float:1.9410653E38)
            java.lang.String r6 = r1.getString(r0)
            goto L_0x006a
        L_0x00d5:
            com.whatsapp.TextEmojiLabel r1 = r11.A01
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0076
        L_0x00dd:
            java.lang.String r1 = r5.A03
            com.whatsapp.TextEmojiLabel r0 = r0.A02
            r0.setText(r1)
            goto L_0x004e
        L_0x00e6:
            int r1 = r5.A00
            r0 = 6
            if (r1 != r0) goto L_0x010f
            boolean r0 = r6.A0g
            if (r0 != 0) goto L_0x010f
            X.1VX r1 = r11.A0A
            r0 = 5021(0x139d, float:7.036E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x010f
            X.5UX r8 = r11.A05
            com.whatsapp.components.button.ThumbnailButton r7 = r11.A04
            r6 = 2131231017(0x7f080129, float:1.8078103E38)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131168243(0x7f070bf3, float:1.7950782E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x003a
        L_0x010f:
            com.whatsapp.components.button.ThumbnailButton r0 = r11.A04
            r7.A08(r0, r6)
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87784Wc.BNf(X.0Ua, int):void");
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        AnonymousClass1VX r9 = this.A0B;
        C56972sr r2 = this.A02;
        C56982ss r7 = this.A09;
        AnonymousClass5UX r4 = this.A05;
        C64773Ex r5 = this.A06;
        AnonymousClass5ZU r6 = this.A07;
        C56892sj r8 = this.A0A;
        return new C88414Yq(AnonymousClass001.A0R(LayoutInflater.from(this.A00), viewGroup, R.layout.f8nameremoved), r2, this.A03, r4, r5, r6, r7, r8, r9);
    }

    public C87784Wc(Activity activity, C56972sr r5, AnonymousClass64J r6, AnonymousClass2FJ r7, AnonymousClass5UX r8, C64773Ex r9, AnonymousClass5ZU r10, C105365Uq r11, C56982ss r12, C56892sj r13, AnonymousClass1VX r14, boolean z) {
        this.A0B = r14;
        this.A02 = r5;
        this.A09 = r12;
        this.A05 = r8;
        this.A06 = r9;
        this.A07 = r10;
        this.A08 = r11;
        this.A0A = r13;
        this.A03 = r6;
        this.A00 = activity;
        this.A0C = z;
        this.A04 = r7;
    }
}
