package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4po  reason: invalid class name and case insensitive filesystem */
public class C94074po extends AnonymousClass4Ry implements C185698u6 {
    public View A00;
    public TextEmojiLabel A01;
    public AnonymousClass5UU A02;
    public C620633i A03;
    public C620733j A04;
    public AnonymousClass1VX A05;
    public WDSButton A06 = C86654Ky.A0f(this.A00, R.id.action_view_1);
    public WDSButton A07 = C86654Ky.A0f(this.A00, R.id.action_view_2);

    public void BFg() {
        this.A00.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BjX(X.AnonymousClass7QG r11) {
        /*
            r10 = this;
            android.view.View r0 = r10.A00
            r4 = 0
            r0.setVisibility(r4)
            int r0 = r11.A0B
            r1 = -1
            if (r0 != 0) goto L_0x012f
            r9 = 2131893093(0x7f121b65, float:1.9420953E38)
            r8 = 2131893095(0x7f121b67, float:1.9420957E38)
            r7 = 2131232756(0x7f0807f4, float:1.808163E38)
            r6 = 0
        L_0x0015:
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A06
            X.6wT r0 = X.C141996wT.DESTRUCTIVE
            r2.setAction(r0)
        L_0x001c:
            com.whatsapp.wds.components.button.WDSButton r5 = r10.A06
            r3 = 8
            if (r5 == 0) goto L_0x0032
            r5.setVisibility(r4)
            android.content.Context r0 = X.C86654Ky.A0B(r10, r5, r9)
            X.C18300x5.A13(r0, r5, r8)
            X.C107295b4.A03(r5, r9)
            r5.setIcon((int) r7)
        L_0x0032:
            X.C109695f2.A00(r5, r10, r6, r3)
        L_0x0035:
            int r0 = r11.A00
            r9 = 5263(0x148f, float:7.375E-42)
            if (r0 != 0) goto L_0x010d
            X.1VX r0 = r10.A05
            boolean r2 = r0.A0X(r9)
            r0 = 2131886335(0x7f1200ff, float:1.9407246E38)
            r8 = 2131886338(0x7f120102, float:1.9407252E38)
            if (r2 == 0) goto L_0x004f
            r0 = 2131886339(0x7f120103, float:1.9407254E38)
            r8 = 2131886339(0x7f120103, float:1.9407254E38)
        L_0x004f:
            r7 = r0
            r6 = 2131232750(0x7f0807ee, float:1.8081618E38)
            r3 = 0
        L_0x0054:
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A07
            if (r2 == 0) goto L_0x006d
            r2.setVisibility(r4)
            r2.setText(r0)
            if (r8 == 0) goto L_0x0067
            android.content.Context r0 = r10.getContext()
            X.C18300x5.A13(r0, r2, r8)
        L_0x0067:
            X.C107295b4.A03(r2, r7)
            r2.setIcon((int) r6)
        L_0x006d:
            r0 = 9
            X.C109695f2.A00(r2, r10, r3, r0)
        L_0x0072:
            X.1VX r0 = r10.A05
            boolean r0 = r0.A0X(r9)
            if (r0 == 0) goto L_0x008a
            X.6vq r0 = X.C141606vq.SMALL
            r5.setSize(r0)
            r2.setSize(r0)
            X.6wU r0 = X.C142006wU.OUTLINE
            r5.setVariant(r0)
            r2.setVariant(r0)
        L_0x008a:
            int r2 = r11.A07
            if (r2 == r1) goto L_0x00ff
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.lang.String r7 = X.C86624Kv.A0b(r10, r2)
            r3.append(r7)
            android.content.res.Resources r6 = X.C18290x4.A0G(r10)
            android.content.Context r5 = r10.getContext()
            r1 = 2130968976(0x7f040190, float:1.754662E38)
            r0 = 2131100086(0x7f0601b6, float:1.7812544E38)
            int r0 = X.AnonymousClass5Yj.A02(r5, r1, r0)
            int r1 = r6.getColor(r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            int r5 = r7.length()
            r1 = 33
            r3.setSpan(r0, r4, r5, r1)
            int r0 = r11.A06
            if (r0 != 0) goto L_0x00f2
            r10.getContext()
            X.4N1 r0 = new X.4N1
            r0.<init>()
            r3.setSpan(r0, r4, r5, r1)
            com.whatsapp.TextEmojiLabel r1 = r10.A01
            X.1VX r0 = r10.A05
            X.AnonymousClass0x2.A14(r0, r1)
            X.33i r0 = r10.A03
            X.AnonymousClass0x2.A12(r1, r0)
            android.content.Context r1 = r10.getContext()
            int r0 = r11.A05
            java.lang.String r1 = r1.getString(r0)
            X.5UU r0 = r10.A02
            android.text.SpannableStringBuilder r1 = r0.A00(r1)
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r0 = r3.append(r0)
            r0.append(r1)
        L_0x00f2:
            com.whatsapp.TextEmojiLabel r1 = r10.A01
            r1.setText(r3)
            android.content.Context r0 = r10.getContext()
            X.C18300x5.A13(r0, r1, r2)
        L_0x00fe:
            return
        L_0x00ff:
            java.lang.String r1 = r11.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00fe
            com.whatsapp.TextEmojiLabel r0 = r10.A01
            r0.setText(r1)
            return
        L_0x010d:
            int r0 = r11.A0A
            if (r0 != 0) goto L_0x0128
            int r0 = r11.A09
            if (r0 != r1) goto L_0x0124
            r0 = 2131891265(0x7f121441, float:1.9417245E38)
            r8 = 2131891267(0x7f121443, float:1.941725E38)
            r7 = 2131887053(0x7f1203cd, float:1.9408702E38)
        L_0x011e:
            r6 = 2131232754(0x7f0807f2, float:1.8081626E38)
            r3 = 1
            goto L_0x0054
        L_0x0124:
            int r8 = r11.A08
            r7 = r0
            goto L_0x011e
        L_0x0128:
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A07
            r2.setVisibility(r3)
            goto L_0x0072
        L_0x012f:
            int r0 = r11.A02
            if (r0 != 0) goto L_0x0143
            int r9 = r11.A01
            if (r9 != r1) goto L_0x013a
            r9 = 2131886799(0x7f1202cf, float:1.9408187E38)
        L_0x013a:
            r8 = 2131886807(0x7f1202d7, float:1.9408203E38)
            r7 = 2131232752(0x7f0807f0, float:1.8081622E38)
            r6 = 1
            goto L_0x0015
        L_0x0143:
            int r0 = r11.A04
            if (r0 != 0) goto L_0x015a
            boolean r0 = r11.A0D
            r8 = 2131889211(0x7f120c3b, float:1.941308E38)
            if (r0 == 0) goto L_0x0151
            r8 = 2131889197(0x7f120c2d, float:1.941305E38)
        L_0x0151:
            r9 = 2131889207(0x7f120c37, float:1.9413071E38)
            r7 = 2131232212(0x7f0805d4, float:1.8080527E38)
            r6 = 2
            goto L_0x0015
        L_0x015a:
            int r0 = r11.A03
            if (r0 != 0) goto L_0x016a
            r9 = 2131888680(0x7f120a28, float:1.9412002E38)
            r8 = 2131888688(0x7f120a30, float:1.9412018E38)
            r7 = 2131232112(0x7f080570, float:1.8080324E38)
            r6 = 3
            goto L_0x001c
        L_0x016a:
            r0 = 8
            com.whatsapp.wds.components.button.WDSButton r5 = r10.A06
            r5.setVisibility(r0)
            r3 = 8
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94074po.BjX(X.7QG):void");
    }

    public int getType() {
        return 1;
    }

    public boolean isVisible() {
        return C86604Kt.A1Y(this.A00);
    }

    public C94074po(Context context) {
        super(context);
        View.inflate(context, R.layout.f8nameremoved, this);
        View findViewById = findViewById(R.id.block_add_footer_floating_content);
        this.A00 = findViewById;
        this.A01 = AnonymousClass0x7.A0K(findViewById, R.id.header);
    }

    public void setup(AnonymousClass5UU r1) {
        this.A02 = r1;
    }
}
