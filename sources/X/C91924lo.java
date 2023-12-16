package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.List;

/* renamed from: X.4lo  reason: invalid class name and case insensitive filesystem */
public class C91924lo extends AnonymousClass4OS {
    public AnonymousClass0WH A00;
    public AnonymousClass0WH A01;
    public List A02 = AnonymousClass001.A0s();
    public boolean A03 = false;
    public final WfalManager A04;
    public final ContactPickerFragment A05;
    public final C56612sH A06;
    public final AnonymousClass1VX A07;
    public final C49882hF A08;
    public final C50282hv A09;
    public final C56072rN A0A;
    public final C104745Se A0B;
    public final C183538qC A0C;
    public final C183538qC A0D;

    public static void A00(Context context, AnonymousClass5LP r3) {
        TextEmojiLabel textEmojiLabel = r3.A0D;
        textEmojiLabel.setVisibility(0);
        textEmojiLabel.A0A();
        AnonymousClass0x2.A0q(context, textEmojiLabel, R.color.f5nameremoved);
        r3.A07.setVisibility(8);
        r3.A02.setVisibility(8);
        r3.A0B.setVisibility(8);
        r3.A0C.setVisibility(8);
        r3.A0A.setVisibility(8);
        r3.A09.setVisibility(8);
    }

    public static /* synthetic */ void A01(ImageView imageView, C91924lo r5, AnonymousClass3ZH r6) {
        C95814uZ r3 = r6.A0H;
        String A032 = C18260x0.A03(r3, ContactPicker.class.getName(), C18290x4.A0u(r3));
        AnonymousClass0YZ.A0F(imageView, A032);
        AnonymousClass5XB r1 = new AnonymousClass5XB((View) imageView, r3, (Integer) null);
        r1.A04 = A032;
        r1.A02(r5.A05.A0Q());
    }

    public int getCount() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A02.get(i);
    }

    public C91924lo(WfalManager wfalManager, ContactPickerFragment contactPickerFragment, C56612sH r4, AnonymousClass1VX r5, C49882hF r6, C50282hv r7, C56072rN r8, C104745Se r9, C183538qC r10, C183538qC r11) {
        this.A05 = contactPickerFragment;
        this.A06 = r4;
        this.A07 = r5;
        this.A0B = r9;
        this.A0A = r8;
        this.A08 = r6;
        this.A04 = wfalManager;
        this.A0C = r10;
        this.A09 = r7;
        this.A0D = r11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:182:0x056d, code lost:
        if (X.C86644Kx.A1Z(r0.A1x) == false) goto L_0x056f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0577, code lost:
        if (r13.A09 == false) goto L_0x0579;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x078a, code lost:
        if (r4 != false) goto L_0x05db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c5, code lost:
        if (r0.A1x.A0X(691) == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x08a3, code lost:
        if (r0.A3P != false) goto L_0x08a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x08ca, code lost:
        if (X.C107575bX.A0F(r4) == false) goto L_0x08cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0900, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x0902;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x092a, code lost:
        if (X.C107575bX.A0F(r4) == false) goto L_0x08cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x099a, code lost:
        if (r4 == null) goto L_0x0902;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x099e, code lost:
        r16 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0acb, code lost:
        if (r0.A3d != false) goto L_0x0acd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02a7, code lost:
        if (r0.A3d != false) goto L_0x02a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0502  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r36, android.view.View r37, android.view.ViewGroup r38) {
        /*
            r35 = this;
            r8 = r37
            r9 = r35
            java.util.List r0 = r9.A02
            r1 = r36
            java.lang.Object r17 = r0.get(r1)
            r0 = r17
            X.8nu r0 = (X.C182128nu) r0
            r17 = r0
            boolean r0 = r0 instanceof X.C171088Fs
            r1 = 0
            r5 = r38
            if (r0 == 0) goto L_0x0046
            if (r37 != 0) goto L_0x002c
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r9.A05
            android.view.LayoutInflater r2 = r0.A0I()
            r0 = 2131625307(0x7f0e055b, float:1.8877818E38)
            android.view.View r8 = r2.inflate(r0, r5, r1)
            r0 = 2
            X.AnonymousClass0YY.A06(r8, r0)
        L_0x002c:
            android.widget.TextView r2 = X.C86614Ku.A0I(r8)
            X.C106905aM.A04(r2)
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r9.A05
            boolean r0 = r0.A3X
            if (r0 == 0) goto L_0x003c
            r2.setSingleLine(r1)
        L_0x003c:
            r0 = r17
            X.8Fs r0 = (X.C171088Fs) r0
            java.lang.String r0 = r0.A00
            r2.setText(r0)
            return r8
        L_0x0046:
            r0 = r17
            boolean r0 = r0 instanceof X.C171098Ft
            if (r0 == 0) goto L_0x006f
            if (r37 != 0) goto L_0x0062
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r9.A05
            android.view.LayoutInflater r2 = r0.A0I()
            r0 = 2131625303(0x7f0e0557, float:1.887781E38)
            android.view.View r8 = r2.inflate(r0, r5, r1)
            android.widget.TextView r0 = X.C86614Ku.A0I(r8)
            X.C106905aM.A04(r0)
        L_0x0062:
            r2 = 33
            X.5ef r1 = new X.5ef
            r0 = r17
            r1.<init>(r9, r2, r0)
        L_0x006b:
            r8.setOnClickListener(r1)
            return r8
        L_0x006f:
            r0 = r17
            boolean r0 = r0 instanceof X.C171068Fp
            if (r0 == 0) goto L_0x00b5
            if (r37 != 0) goto L_0x0088
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r9.A05
            android.view.LayoutInflater r2 = r0.A0I()
            r0 = 2131625302(0x7f0e0556, float:1.8877808E38)
            android.view.View r8 = r2.inflate(r0, r5, r1)
            r0 = 2
            X.AnonymousClass0YY.A06(r8, r0)
        L_0x0088:
            com.whatsapp.contact.picker.ContactPickerFragment r4 = r9.A05
            X.2YA r0 = r4.A1v
            android.content.SharedPreferences r2 = r0.A00()
            java.lang.String r0 = "disappearing_mode_duration_for_chat_picker_int"
            int r3 = r2.getInt(r0, r1)
            r0 = 2131429850(0x7f0b09da, float:1.8481384E38)
            android.view.View r2 = r8.findViewById(r0)
            com.whatsapp.settings.SettingsRowIconText r2 = (com.whatsapp.settings.SettingsRowIconText) r2
            X.03q r0 = r4.A0Q()
            if (r0 == 0) goto L_0x00ae
            if (r2 == 0) goto L_0x00ae
            java.lang.String r0 = X.AnonymousClass352.A01(r0, r3, r1, r1)
            r2.setSubText(r0)
        L_0x00ae:
            r0 = 5
            X.5f2 r1 = new X.5f2
            r1.<init>(r9, r3, r0)
            goto L_0x006b
        L_0x00b5:
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r9.A05
            boolean r2 = r0.A3Y
            r3 = 1
            if (r2 == 0) goto L_0x00c7
            X.1VX r4 = r0.A1x
            r2 = 691(0x2b3, float:9.68E-43)
            boolean r2 = r4.A0X(r2)
            r14 = 1
            if (r2 != 0) goto L_0x00c8
        L_0x00c7:
            r14 = 0
        L_0x00c8:
            if (r37 == 0) goto L_0x0aa9
            java.lang.Object r2 = r8.getTag()
            boolean r2 = r2 instanceof X.AnonymousClass5LP
            if (r2 == 0) goto L_0x0aa9
            java.lang.Object r2 = r8.getTag()
            X.5LP r2 = (X.AnonymousClass5LP) r2
        L_0x00d8:
            r8.setClickable(r1)
            r8.setLongClickable(r1)
            android.widget.ImageView r4 = r2.A04
            r30 = r4
            r7 = 8
            r4.setVisibility(r7)
            android.view.View r5 = r2.A00
            r5.setVisibility(r7)
            android.widget.TextView r4 = r2.A0A
            r29 = r4
            r4.setVisibility(r7)
            r4 = r17
            boolean r4 = r4 instanceof X.AnonymousClass8Fr
            r10 = 0
            if (r4 == 0) goto L_0x0188
            r4 = r17
            X.8Fr r4 = (X.AnonymousClass8Fr) r4
            r3 = 2
            X.AnonymousClass0YY.A06(r8, r3)
            r8.setBackgroundResource(r1)
            r3 = r29
            r3.setVisibility(r7)
            android.widget.TextView r3 = r2.A0C
            r3.setVisibility(r7)
            com.whatsapp.TextEmojiLabel r3 = r2.A0D
            r3.setVisibility(r7)
            android.widget.ImageView r5 = r2.A06
            r3 = 4
            r5.setVisibility(r3)
            X.5YB r3 = r2.A0E
            com.whatsapp.TextEmojiLabel r6 = r3.A02
            r6.A0A()
            java.lang.String r3 = r4.A00
            r6.setText(r3)
            android.content.Context r4 = r0.A1D()
            r3 = 2131102351(0x7f060a8f, float:1.7817137E38)
            X.AnonymousClass0x2.A0q(r4, r6, r3)
            com.whatsapp.components.SelectionCheckView r6 = r2.A0F
            android.widget.FrameLayout r4 = r6.A0B
            r3 = 4
            X.C86654Ky.A18(r4, r6, r3)
            android.widget.ImageView r3 = r2.A07
            r3.setVisibility(r7)
            android.widget.TextView r3 = r2.A09
            r3.setVisibility(r7)
            android.widget.ImageView r3 = r2.A02
            r3.setVisibility(r7)
            android.widget.TextView r3 = r2.A0B
            r3.setVisibility(r7)
            android.view.View r3 = r2.A01
            r3.setOnClickListener(r10)
            r5.setOnClickListener(r10)
            r3.setClickable(r1)
            r5.setClickable(r1)
        L_0x015a:
            boolean r0 = r0.A2A()
            if (r0 == 0) goto L_0x017e
            X.3ZH r0 = r17.getContact()
            if (r0 == 0) goto L_0x0182
            X.3ZH r0 = r17.getContact()
            boolean r0 = r0.A0V()
            if (r0 == 0) goto L_0x0182
            X.1VX r0 = r9.A07
            int r3 = X.AnonymousClass29N.A00(r0)
            android.widget.ImageView r0 = r2.A05
            r0.setImageResource(r3)
            r0.setVisibility(r1)
        L_0x017e:
            X.C06560Yg.A0O(r8, r10)
            return r8
        L_0x0182:
            android.widget.ImageView r0 = r2.A05
            r0.setVisibility(r7)
            goto L_0x017e
        L_0x0188:
            r4 = r17
            boolean r4 = r4 instanceof X.C171118Fv
            X.AnonymousClass0YY.A06(r8, r3)
            if (r4 == 0) goto L_0x0230
            X.03q r12 = r0.A0Q()
            X.5YB r4 = r2.A0E
            com.whatsapp.TextEmojiLabel r5 = r4.A02
            X.C106905aM.A04(r5)
            r6 = 2130969995(0x7f04058b, float:1.7548688E38)
            r4 = 2131101335(0x7f060697, float:1.7815077E38)
            X.AnonymousClass5Yj.A0B(r12, r5, r6, r4)
            com.whatsapp.TextEmojiLabel r6 = r2.A0D
            r6.A0A()
            r4 = 2131101333(0x7f060695, float:1.7815073E38)
            X.AnonymousClass0x2.A0q(r12, r6, r4)
            android.widget.ImageView r4 = r2.A02
            r4.setVisibility(r7)
            android.widget.TextView r4 = r2.A0B
            r4.setVisibility(r7)
            r4 = r29
            r4.setVisibility(r7)
            android.widget.TextView r4 = r2.A09
            r4.setVisibility(r7)
            r4 = 2131886319(0x7f1200ef, float:1.9407213E38)
            r5.setText(r4)
            r5.A0E()
            android.widget.TextView r4 = r2.A0C
            r4.setVisibility(r1)
            X.C86634Kw.A1I(r4)
            r4 = 2131231713(0x7f0803e1, float:1.8079515E38)
            android.graphics.drawable.Drawable r4 = X.AnonymousClass0RP.A00(r12, r4)
            android.graphics.drawable.Drawable r11 = X.C06130Wj.A01(r4)
            r5 = 2130970369(0x7f040701, float:1.7549446E38)
            r4 = 2131102218(0x7f060a0a, float:1.7816868E38)
            int r4 = X.C18300x5.A03(r12, r5, r4)
            X.AnonymousClass0YG.A06(r11, r4)
            android.widget.ImageView r4 = r2.A07
            r4.setVisibility(r1)
            r4.setImageDrawable(r11)
            r4.setFocusable(r1)
            r4.setClickable(r1)
            r4.setBackground(r10)
            r4.setBackground(r10)
            android.widget.ImageView r5 = r2.A06
            r4 = 2131231282(0x7f080232, float:1.807864E38)
            r5.setImageResource(r4)
            r4 = 2131886318(0x7f1200ee, float:1.9407211E38)
            r6.setText(r4)
            boolean r4 = r0.A2C()
            if (r4 != 0) goto L_0x0218
            r8.setPadding(r1, r1, r1, r1)
        L_0x0218:
            boolean r4 = r9.A03
            if (r4 != 0) goto L_0x015a
            r9.A03 = r3
            X.5rC r4 = r0.A0S
            boolean r3 = r4.A07()
            if (r3 == 0) goto L_0x015a
            r4.A04()
            java.lang.String r0 = "logEntrypointImpression"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0230:
            X.03q r11 = r0.A0Q()
            X.3ZH r6 = r17.getContact()
            X.C626936e.A06(r6)
            android.widget.ImageView r12 = r2.A06
            r12.setVisibility(r1)
            r12.setEnabled(r3)
            boolean r3 = r0.A2C()
            if (r3 != 0) goto L_0x0251
            android.widget.ImageView r4 = r2.A07
            r3 = 2131233591(0x7f080b37, float:1.8083324E38)
            X.C86614Ku.A11(r11, r4, r3)
        L_0x0251:
            X.5YB r3 = r2.A0E
            r22 = r3
            r4 = 2130969995(0x7f04058b, float:1.7548688E38)
            r3 = 2131101335(0x7f060697, float:1.7815077E38)
            int r4 = X.C18300x5.A03(r11, r4, r3)
            r3 = r22
            com.whatsapp.TextEmojiLabel r3 = r3.A02
            r28 = r3
            r3.setTextColor(r4)
            X.0R2 r3 = r0.A0O
            if (r3 != 0) goto L_0x0a99
            X.4uZ r3 = r6.A0H
            boolean r3 = r3 instanceof X.C135166kE
            if (r3 != 0) goto L_0x0a99
            boolean r3 = r0.A3Y
            if (r3 != 0) goto L_0x027a
            boolean r3 = r0.A3Q
            if (r3 == 0) goto L_0x0a99
        L_0x027a:
            r4 = 12
            X.547 r3 = new X.547
            r3.<init>(r12, r9, r6, r4)
            android.view.View r4 = r2.A01
            r4.setOnClickListener(r3)
            r12.setOnClickListener(r3)
            X.5ZU r3 = r0.A12
            java.lang.String r3 = r3.A0H(r6)
            r12.setContentDescription(r3)
        L_0x0292:
            r3 = r17
            boolean r3 = r3 instanceof X.C133346hC
            r21 = r3
            if (r3 == 0) goto L_0x09bc
            r3 = r17
            X.6hC r3 = (X.C133346hC) r3
            r18 = r3
            boolean r3 = r0.A3V
            if (r3 != 0) goto L_0x02a9
            boolean r3 = r0.A3d
            r13 = 0
            if (r3 == 0) goto L_0x02aa
        L_0x02a9:
            r13 = 1
        L_0x02aa:
            r3 = r18
            java.util.List r3 = r3.A00
            r16 = r3
            int r5 = r16.size()
            r3 = 1
            if (r5 <= r3) goto L_0x09b5
            android.content.Context r5 = r0.A1D()
            X.33j r3 = r0.A1V
            java.lang.CharSequence r5 = X.AnonymousClass5ZU.A00(r5, r3, r6)
            r3 = r29
            r3.setText(r5)
            r5 = 2131100160(0x7f060200, float:1.7812694E38)
            X.AnonymousClass0x2.A0q(r11, r3, r5)
            r3.setVisibility(r1)
        L_0x02cf:
            android.widget.LinearLayout r3 = r2.A08
            r3.setVisibility(r1)
            android.widget.TextView r3 = r2.A0B
            r15 = r3
            r3.setVisibility(r1)
            r3.setClickable(r1)
            r3.setFocusable(r1)
            android.widget.ImageView r3 = r2.A07
            r3.setVisibility(r7)
            android.widget.ImageView r3 = r2.A02
            r3.setVisibility(r7)
            if (r14 != 0) goto L_0x02f9
            if (r13 == 0) goto L_0x09a7
            X.1VX r3 = r9.A07
            r5 = 6741(0x1a55, float:9.446E-42)
            int r3 = r3.A0N(r5)
            r5 = 1
            if (r3 != r5) goto L_0x09a7
        L_0x02f9:
            com.whatsapp.TextEmojiLabel r3 = r2.A0D
            r3.setVisibility(r7)
            r3 = r29
            r3.setVisibility(r7)
            int r3 = r16.size()
            r13 = 1
            r5 = 34
            if (r3 <= r13) goto L_0x09ae
            r3 = 26
            X.5f5 r13 = new X.5f5
            r5 = r18
            r13.<init>((java.lang.Object) r9, (java.lang.Object) r6, (java.lang.Object) r5, (int) r3)
        L_0x0315:
            r15.setOnClickListener(r13)
            android.widget.TextView r3 = r2.A0C
            r3.setVisibility(r7)
            X.C106905aM.A04(r15)
        L_0x0320:
            r3 = r17
            boolean r3 = r3 instanceof X.C171108Fu
            r20 = r3
            if (r3 == 0) goto L_0x0340
            X.3ZH r3 = r17.getContact()
            X.C626936e.A06(r3)
            boolean r3 = r3.A0R()
            if (r3 == 0) goto L_0x0340
            r3 = r29
            r3.setVisibility(r1)
            r5 = 2131890382(0x7f1210ce, float:1.9415454E38)
            r3.setText(r5)
        L_0x0340:
            X.C106905aM.A04(r28)
            X.5Uq r3 = r0.A14
            if (r3 == 0) goto L_0x034a
            r3.A0A(r12, r6, r1)
        L_0x034a:
            com.whatsapp.TextEmojiLabel r5 = r2.A0D
            X.4uZ r3 = r6.A0H
            r5.setTag(r3)
            X.4uZ r3 = r6.A0H
            boolean r3 = r3 instanceof X.C135166kE
            if (r3 == 0) goto L_0x0541
            r4 = 2131890906(0x7f1212da, float:1.9416517E38)
            r3 = r28
            r3.setText(r4)
            r28.A0E()
            android.widget.TextView r3 = r2.A0C
            X.C86634Kw.A1I(r3)
            android.widget.ImageView r13 = r2.A07
            r13.setVisibility(r1)
            r3 = 2131232445(0x7f0806bd, float:1.8081E38)
            android.graphics.drawable.Drawable r3 = X.AnonymousClass0RP.A00(r11, r3)
            android.graphics.drawable.Drawable r14 = X.C06130Wj.A01(r3)
            r4 = 2130970369(0x7f040701, float:1.7549446E38)
            r3 = 2131102218(0x7f060a0a, float:1.7816868E38)
            int r3 = X.C18300x5.A03(r11, r4, r3)
            X.AnonymousClass0YG.A06(r14, r3)
            r13.setImageDrawable(r14)
            r3 = 2131896062(0x7f1226fe, float:1.9426975E38)
            X.C86634Kw.A1D(r13, r0, r3)
            r3 = 28
            X.C18310x6.A17(r13, r9, r3)
            r13.setFocusable(r1)
            X.5de r13 = r0.A1o
            int r4 = r13.A00
            if (r4 == 0) goto L_0x0520
            r3 = 1
            if (r4 == r3) goto L_0x0524
            r3 = 2
            if (r4 != r3) goto L_0x0bd9
            java.util.List r3 = r13.A02
            int r13 = r3.size()
            if (r13 == 0) goto L_0x0520
            X.33j r3 = r0.A1V
            r15 = r3
            r16 = 2131755303(0x7f100127, float:1.9141481E38)
        L_0x03af:
            long r3 = (long) r13
            r18 = r3
            java.lang.Object[] r14 = X.AnonymousClass002.A0L()
            X.AnonymousClass000.A1P(r14, r13, r1)
            r3 = r18
            r13 = r16
            java.lang.String r4 = r15.A0L(r14, r13, r3)
        L_0x03c1:
            X.5de r13 = r0.A1o
            com.whatsapp.bridge.wfal.WfalManager r3 = r9.A04
            boolean r3 = r3.A02()
            if (r3 == 0) goto L_0x0502
            boolean r3 = r13.A03
            if (r3 != 0) goto L_0x03d3
            boolean r3 = r13.A04
            if (r3 == 0) goto L_0x0502
        L_0x03d3:
            X.5de r3 = r0.A1o
            android.content.Context r18 = r0.A0G()
            r20 = 2131167323(0x7f07085b, float:1.7948916E38)
            r21 = 2131101333(0x7f060695, float:1.7815073E38)
            boolean r13 = r3.A03
            boolean r3 = r3.A04
            r22 = r13
            r23 = r3
            r19 = r4
            android.text.SpannableStringBuilder r4 = X.C626736a.A00(r18, r19, r20, r21, r22, r23)
        L_0x03ed:
            r5.setText(r4)
            boolean r3 = r0.A2C()
            if (r3 != 0) goto L_0x03f9
            r8.setPadding(r1, r1, r1, r1)
        L_0x03f9:
            r0.A0H = r8
        L_0x03fb:
            java.util.Map r3 = r0.A3n
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r3)
            java.lang.Class<X.4uZ> r15 = X.C95814uZ.class
            com.whatsapp.jid.Jid r3 = r6.A0I(r15)
            boolean r13 = r4.containsKey(r3)
            boolean r3 = r0 instanceof com.whatsapp.contact.picker.VoipContactPickerFragment
            if (r3 == 0) goto L_0x041c
            r3 = r0
            com.whatsapp.contact.picker.VoipContactPickerFragment r3 = (com.whatsapp.contact.picker.VoipContactPickerFragment) r3
            X.66R r3 = r3.A06
            boolean r3 = X.C18270x1.A1V(r3)
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x0425
        L_0x041c:
            if (r13 == 0) goto L_0x04ff
            int r3 = X.AnonymousClass5Yj.A05(r8)
        L_0x0422:
            r8.setBackgroundResource(r3)
        L_0x0425:
            java.util.Set r3 = r0.A3p
            r14 = r3
            com.whatsapp.jid.Jid r4 = r6.A0I(r15)
            boolean r3 = r14.remove(r4)
            com.whatsapp.components.SelectionCheckView r4 = r2.A0F
            if (r3 == 0) goto L_0x04fa
            android.view.ViewTreeObserver r14 = r4.getViewTreeObserver()
            X.5fg r3 = new X.5fg
            r3.<init>(r9, r2, r13)
            r14.addOnPreDrawListener(r3)
        L_0x0440:
            boolean r3 = r0.A3U
            if (r3 == 0) goto L_0x048a
            java.util.Set r3 = r0.A3o
            java.util.Set r13 = java.util.Collections.unmodifiableSet(r3)
            boolean r3 = X.C86644Kx.A1Y(r6, r15, r13)
            if (r3 == 0) goto L_0x048a
            android.widget.LinearLayout r3 = r2.A08
            r3.setVisibility(r7)
            r3 = r29
            r3.setVisibility(r7)
            boolean r3 = r0.A29()
            if (r3 != 0) goto L_0x0469
            r5.setVisibility(r1)
            r3 = 2131888113(0x7f1207f1, float:1.9410852E38)
            r5.setText(r3)
        L_0x0469:
            r3 = 2131101327(0x7f06068f, float:1.781506E38)
            int r13 = X.AnonymousClass0Y8.A04(r11, r3)
            r5.A09()
            r5.setTextColor(r13)
            r3 = r28
            r3.setTextColor(r13)
            android.widget.TextView r3 = r2.A0C
            r3.setTextColor(r13)
            r12.setEnabled(r1)
            r3 = 1
            r8.setClickable(r3)
            r8.setLongClickable(r3)
        L_0x048a:
            boolean r3 = r0.A3V
            if (r3 != 0) goto L_0x0496
            boolean r3 = r0.A3b
            if (r3 != 0) goto L_0x0496
            boolean r3 = r0.A3d
            if (r3 == 0) goto L_0x04bf
        L_0x0496:
            android.widget.ImageView r12 = r2.A03
            if (r12 == 0) goto L_0x04bf
            X.2ss r14 = r0.A1f
            X.3Ex r13 = r0.A0w
            com.whatsapp.jid.Jid r3 = r6.A0I(r15)
            X.4uZ r3 = (X.C95814uZ) r3
            int r6 = X.AnonymousClass352.A00(r13, r14, r3)
            r3 = 8
            if (r6 <= 0) goto L_0x04ad
            r3 = 0
        L_0x04ad:
            r12.setVisibility(r3)
            X.33j r3 = r0.A1V
            java.lang.String r3 = X.AnonymousClass352.A02(r3, r6)
            r12.setContentDescription(r3)
            r3 = 2131232095(0x7f08055f, float:1.808029E38)
            r12.setImageResource(r3)
        L_0x04bf:
            boolean r3 = r0.A3e
            if (r3 == 0) goto L_0x015a
            X.3ZH r3 = r17.getContact()
            if (r3 == 0) goto L_0x015a
            X.3ZH r3 = r17.getContact()
            X.4uZ r6 = r3.A0H
            android.widget.TextView r3 = r2.A0C
            r3.setVisibility(r7)
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass32Y.A03(r6)
            r6 = 1
            if (r3 == 0) goto L_0x04f5
            X.3ZH r3 = r0.A1P(r3)
            if (r3 == 0) goto L_0x04f5
            r12 = 2131888158(0x7f12081e, float:1.9410943E38)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r3 = r3.A0J()
            r6[r1] = r3
            X.AnonymousClass001.A0y(r11, r5, r6, r12)
            android.widget.FrameLayout r3 = r4.A0B
            X.C86654Ky.A18(r3, r4, r1)
            r6 = 0
        L_0x04f5:
            r4.setEnabled(r6)
            goto L_0x015a
        L_0x04fa:
            r4.A06(r13, r1)
            goto L_0x0440
        L_0x04ff:
            r3 = 0
            goto L_0x0422
        L_0x0502:
            X.5de r3 = r0.A1o
            boolean r3 = r3.A03
            if (r3 == 0) goto L_0x03ed
            X.5Se r3 = r9.A0B
            boolean r3 = r3.A00()
            if (r3 == 0) goto L_0x03ed
            android.content.Context r3 = r0.A0G()
            r14 = 2131101333(0x7f060695, float:1.7815073E38)
            r13 = 2131167323(0x7f07085b, float:1.7948916E38)
            android.text.SpannableStringBuilder r4 = X.AnonymousClass36X.A00(r3, r4, r13, r14)
            goto L_0x03ed
        L_0x0520:
            r4 = 2131893531(0x7f121d1b, float:1.9421841E38)
            goto L_0x052f
        L_0x0524:
            java.util.List r3 = r13.A01
            int r13 = r3.size()
            if (r13 != 0) goto L_0x0539
            r4 = 2131891190(0x7f1213f6, float:1.9417093E38)
        L_0x052f:
            android.content.res.Resources r3 = X.C08310eF.A09(r0)
            java.lang.String r4 = r3.getString(r4)
            goto L_0x03c1
        L_0x0539:
            X.33j r3 = r0.A1V
            r15 = r3
            r16 = 2131755304(0x7f100128, float:1.9141483E38)
            goto L_0x03af
        L_0x0541:
            android.content.res.Resources r3 = X.C08310eF.A09(r0)
            r13 = 2131166912(0x7f0706c0, float:1.7948083E38)
            int r3 = r3.getDimensionPixelSize(r13)
            r8.setPadding(r1, r1, r3, r1)
            X.2qS r13 = r6.A0E
            X.2sr r3 = r0.A0b
            boolean r3 = X.C56972sr.A08(r3, r6)
            if (r3 == 0) goto L_0x056f
            boolean r3 = r0.A3Y
            if (r3 != 0) goto L_0x0565
            boolean r3 = r0.A3V
            if (r3 != 0) goto L_0x0565
            boolean r3 = r0.A3d
            if (r3 == 0) goto L_0x056f
        L_0x0565:
            X.1VX r3 = r0.A1x
            boolean r3 = X.C86644Kx.A1Z(r3)
            r19 = 1
            if (r3 != 0) goto L_0x0571
        L_0x056f:
            r19 = 0
        L_0x0571:
            if (r13 == 0) goto L_0x0579
            boolean r3 = r13.A09
            r18 = 1
            if (r3 != 0) goto L_0x057b
        L_0x0579:
            r18 = 0
        L_0x057b:
            if (r19 == 0) goto L_0x0794
            java.util.ArrayList r3 = r0.A2y
            if (r3 != 0) goto L_0x078e
            r16 = 0
        L_0x0583:
            r13 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r15 = r13
            r14 = r3
            r13 = r22
            r3 = r16
            r13.A09(r6, r15, r3, r14)
        L_0x058f:
            boolean r3 = r6.A0U()
            if (r3 != 0) goto L_0x05b7
            X.4uZ r3 = r6.A0H
            boolean r3 = r3 instanceof X.AnonymousClass1fS
            if (r3 != 0) goto L_0x05b7
            boolean r3 = r0.A3X
            if (r3 == 0) goto L_0x07c6
            boolean r3 = r6.A0U()
            if (r3 != 0) goto L_0x07c6
            X.4uZ r3 = r6.A0H
            com.whatsapp.jid.UserJid r13 = X.AnonymousClass32Y.A03(r3)
            if (r13 == 0) goto L_0x05b7
            X.2hv r3 = r9.A09
            boolean r3 = r3.A01(r13)
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x07c6
        L_0x05b7:
            boolean r3 = r0.A3X
            r19 = 0
            if (r3 == 0) goto L_0x05dd
            X.4uZ r3 = r6.A0H
            boolean r3 = r3 instanceof X.AnonymousClass1fS
            if (r3 != 0) goto L_0x05db
            boolean r3 = r6.A0U()
            if (r3 != 0) goto L_0x0717
            X.4uZ r3 = r6.A0H
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass32Y.A03(r3)
            if (r4 == 0) goto L_0x05db
            X.2hv r3 = r9.A09
            boolean r3 = r3.A01(r4)
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x0717
        L_0x05db:
            r19 = 1
        L_0x05dd:
            java.lang.String r14 = ""
            if (r19 == 0) goto L_0x063a
            r4 = 2131888426(0x7f12092a, float:1.9411487E38)
            r12.setEnabled(r1)
            r3 = 1
            r8.setClickable(r3)
            r8.setLongClickable(r3)
            r5.setText(r4)
            r5.setSingleLine(r1)
            r5.A09()
            android.widget.FrameLayout$LayoutParams r10 = X.C86664Kz.A0r(r12)
            r3 = 49
            r10.gravity = r3
            android.content.res.Resources r3 = r11.getResources()
            r4 = 2131166274(0x7f070442, float:1.7946789E38)
            int r3 = r3.getDimensionPixelSize(r4)
            r10.topMargin = r3
            r12.setLayoutParams(r10)
            int r4 = X.C18320x8.A00(r11, r4)
            r3 = r28
            r3.setPadding(r1, r4, r1, r1)
            r3 = 2131101327(0x7f06068f, float:1.781506E38)
        L_0x061b:
            int r4 = X.AnonymousClass0Y8.A04(r11, r3)
            r3 = r28
            r3.setTextColor(r4)
            X.0WH r10 = r9.A00
            if (r10 != 0) goto L_0x0630
            r3 = 6
            X.67a r10 = new X.67a
            r10.<init>(r9, r3)
            r9.A00 = r10
        L_0x0630:
            android.widget.TextView r4 = r2.A0C
            r4.setText(r14)
            r8.setLongClickable(r1)
            goto L_0x03fb
        L_0x063a:
            boolean r3 = r0.A3d
            if (r3 != 0) goto L_0x064a
            boolean r3 = r0.A3V
            if (r3 != 0) goto L_0x064a
            boolean r3 = r0.A3b
            if (r3 != 0) goto L_0x064a
            boolean r3 = r0.A3c
            if (r3 == 0) goto L_0x06d6
        L_0x064a:
            boolean r3 = r6.A0U()
            if (r3 == 0) goto L_0x06d6
            X.2sj r3 = r0.A1i
            java.lang.Class<com.whatsapp.jid.GroupJid> r4 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r13 = r6.A0I(r4)
            com.whatsapp.jid.GroupJid r13 = (com.whatsapp.jid.GroupJid) r13
            boolean r3 = r3.A0C(r13)
            if (r3 == 0) goto L_0x0681
            X.2rN r3 = r9.A0A
            r15 = r3
            java.lang.Class<X.1fJ> r3 = X.C27991fJ.class
            X.4uZ r13 = X.AnonymousClass3ZH.A02(r6, r3)
            boolean r3 = r15.A04(r6, r13)
            if (r3 != 0) goto L_0x0681
            X.3Mh r3 = r0.A0d
            X.1Ei r13 = X.C66663Mh.A0N
            boolean r3 = r3.A08(r13)
            if (r3 == 0) goto L_0x06d6
            boolean r3 = r0.A3C
            if (r3 == 0) goto L_0x06d6
            boolean r3 = r6.A12
            if (r3 == 0) goto L_0x06d6
        L_0x0681:
            X.2sj r10 = r0.A1i
            com.whatsapp.jid.Jid r3 = r6.A0I(r4)
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            boolean r3 = r10.A0C(r3)
            if (r3 != 0) goto L_0x06b1
            boolean r3 = r6.A0j
            r4 = 2131891251(0x7f121433, float:1.9417217E38)
            if (r3 == 0) goto L_0x0699
            r4 = 2131887445(0x7f120555, float:1.9409497E38)
        L_0x0699:
            r12.setEnabled(r1)
            r3 = 1
            r8.setClickable(r3)
            r8.setLongClickable(r3)
            r5.setText(r4)
            r5.A09()
            r3 = 2131101327(0x7f06068f, float:1.781506E38)
            X.AnonymousClass0x2.A0q(r11, r5, r3)
            goto L_0x061b
        L_0x06b1:
            boolean r3 = r0.A3C
            if (r3 == 0) goto L_0x06c7
            boolean r3 = r6.A12
            if (r3 == 0) goto L_0x06c7
            X.3Mh r4 = r0.A0d
            X.1Ei r3 = X.C66663Mh.A0N
            boolean r3 = r4.A08(r3)
            if (r3 == 0) goto L_0x06c7
            r4 = 2131891197(0x7f1213fd, float:1.9417107E38)
            goto L_0x0699
        L_0x06c7:
            X.2lX r3 = r0.A25
            boolean r3 = r3.A01(r6)
            r4 = 2131891403(0x7f1214cb, float:1.9417525E38)
            if (r3 == 0) goto L_0x0699
            r4 = 2131894180(0x7f121fa4, float:1.9423157E38)
            goto L_0x0699
        L_0x06d6:
            X.5ZU r13 = r0.A12
            java.lang.Class<X.1fL> r3 = X.C28011fL.class
            com.whatsapp.jid.Jid r4 = r6.A0I(r3)
            java.util.concurrent.ConcurrentHashMap r3 = r13.A0D
            java.lang.String r4 = X.C18320x8.A0e(r4, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L_0x0705
            X.4uZ r3 = r6.A0H
            boolean r3 = r3 instanceof X.AnonymousClass1fS
            if (r3 == 0) goto L_0x0703
            boolean r3 = X.AnonymousClass3ZH.A0E(r6)
            if (r3 == 0) goto L_0x0703
            java.util.ArrayList r3 = r0.A2y
            if (r3 == 0) goto L_0x0703
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
        L_0x06fe:
            r5.A0K(r3, r4)
            goto L_0x0630
        L_0x0703:
            r3 = 0
            goto L_0x06fe
        L_0x0705:
            r5.setText(r14)
            X.4FS r3 = r0.A2c
            r13 = r3
            X.5ZU r3 = r0.A12
            X.54g r4 = new X.54g
            r4.<init>(r5, r3, r6)
            X.AnonymousClass0x7.A1B(r4, r13)
            goto L_0x0630
        L_0x0717:
            X.2hF r3 = r9.A08
            r20 = r3
            java.lang.Class<X.1fJ> r18 = X.C27991fJ.class
            r3 = r18
            com.whatsapp.jid.Jid r16 = X.AnonymousClass3ZH.A05(r6, r3)
            r3 = r16
            X.1fJ r3 = (X.C27991fJ) r3
            r16 = r3
            r3 = r20
            X.2sj r4 = r3.A02
            r3 = r16
            X.33k r3 = X.C56892sj.A01(r4, r3)
            X.6aS r3 = r3.A04()
            X.8Nf r15 = r3.iterator()
            r14 = 0
        L_0x073c:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x075e
            java.lang.Object r13 = r15.next()
            X.2zG r13 = (X.C60842zG) r13
            r3 = r20
            X.2rx r3 = r3.A00
            r4 = r3
            com.whatsapp.jid.UserJid r3 = r13.A03
            boolean r3 = r4.A03(r3)
            if (r3 == 0) goto L_0x075b
            int r13 = r13.A01
            r4 = 2
            r3 = 1
            if (r13 == r4) goto L_0x075c
        L_0x075b:
            r3 = 0
        L_0x075c:
            r14 = r14 | r3
            goto L_0x073c
        L_0x075e:
            r13 = r20
            r3 = r16
            boolean r3 = r13.A01(r6, r3, r14)
            r14 = r3 ^ 1
            X.2sj r4 = r0.A1i
            com.whatsapp.jid.GroupJid r3 = X.C86664Kz.A1C(r6)
            boolean r3 = r4.A0C(r3)
            r13 = r3 ^ 1
            X.2rN r4 = r9.A0A
            r3 = r18
            X.4uZ r3 = X.AnonymousClass3ZH.A02(r6, r3)
            boolean r4 = r4.A04(r6, r3)
            boolean r3 = r6.A0U()
            if (r3 == 0) goto L_0x05dd
            if (r14 != 0) goto L_0x05db
            if (r13 != 0) goto L_0x05db
            if (r4 == 0) goto L_0x05dd
            goto L_0x05db
        L_0x078e:
            java.util.List r16 = java.util.Collections.unmodifiableList(r3)
            goto L_0x0583
        L_0x0794:
            boolean r13 = X.C86654Ky.A1Y(r6)
            java.util.ArrayList r3 = r0.A2y
            if (r3 != 0) goto L_0x07ba
            r14 = 0
        L_0x079d:
            if (r13 == 0) goto L_0x07bf
            r3 = r22
            X.5ZU r3 = r3.A03
            r13 = r3
            r3 = 6
            X.7HU r23 = r13.A0B(r6, r3)
            r3 = r22
            boolean r27 = r3.A0C(r6)
            r26 = 6
            r24 = r6
            r25 = r14
            r22.A07(r23, r24, r25, r26, r27)
            goto L_0x058f
        L_0x07ba:
            java.util.List r14 = java.util.Collections.unmodifiableList(r3)
            goto L_0x079d
        L_0x07bf:
            r13 = r22
            r13.A0A(r6, r14)
            goto L_0x058f
        L_0x07c6:
            if (r21 == 0) goto L_0x07d7
            java.lang.String r3 = X.AnonymousClass36P.A02(r6)
            r5.setText(r3)
            r8.setLongClickable(r1)
            r8.setClickable(r1)
            goto L_0x03fb
        L_0x07d7:
            X.2sq r3 = r0.A0k
            boolean r3 = X.C86604Kt.A1a(r3, r6)
            if (r3 == 0) goto L_0x0844
            r5.setVisibility(r1)
            r3 = 2131101327(0x7f06068f, float:1.781506E38)
            int r10 = X.AnonymousClass0Y8.A04(r11, r3)
            r3 = 2131894311(0x7f122027, float:1.9423423E38)
            r5.setText(r3)
            r5.setTextColor(r10)
            r5.A09()
            r3 = r28
            r3.setTextColor(r10)
            r3 = 1056964608(0x3f000000, float:0.5)
            r12.setAlpha(r3)
            r3 = 0
            r4.setOnClickListener(r3)
            r12.setOnClickListener(r3)
            r4.setClickable(r1)
            r12.setClickable(r1)
            X.0WH r10 = r9.A01
            if (r10 != 0) goto L_0x0818
            r3 = 5
            X.67a r10 = new X.67a
            r10.<init>(r9, r3)
            r9.A01 = r10
        L_0x0818:
            boolean r3 = r0.A27()
            if (r3 != 0) goto L_0x03fb
            boolean r3 = r0.A3V
            if (r3 != 0) goto L_0x0826
            boolean r3 = r0.A3d
            if (r3 == 0) goto L_0x0831
        L_0x0826:
            X.1VX r4 = r9.A07
            r3 = 6741(0x1a55, float:9.446E-42)
            int r4 = r4.A0N(r3)
            r3 = 1
            if (r4 == r3) goto L_0x03fb
        L_0x0831:
            android.content.Context r4 = r0.A1D()
            X.33j r3 = r0.A1V
            java.lang.CharSequence r4 = X.AnonymousClass5ZU.A00(r4, r3, r6)
            if (r4 == 0) goto L_0x03fb
            android.widget.TextView r3 = r2.A0C
            r3.setText(r4)
            goto L_0x03fb
        L_0x0844:
            java.lang.String r3 = r0.A1Q(r6)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0875
            java.lang.String r3 = r0.A1Q(r6)
            r5.setText(r3)
            r5.setVisibility(r1)
            r4 = 2131101327(0x7f06068f, float:1.781506E38)
            r3 = r28
            X.AnonymousClass0x2.A0q(r11, r3, r4)
            r3 = 1065353216(0x3f800000, float:1.0)
            r12.setAlpha(r3)
            r8.setLongClickable(r1)
            X.0WH r10 = r9.A00
            if (r10 != 0) goto L_0x0818
            r3 = 6
            X.67a r10 = new X.67a
            r10.<init>(r9, r3)
            r9.A00 = r10
            goto L_0x0818
        L_0x0875:
            r3 = 1065353216(0x3f800000, float:1.0)
            r12.setAlpha(r3)
            if (r19 == 0) goto L_0x088e
            r3 = 2131890783(0x7f12125f, float:1.9416268E38)
        L_0x087f:
            java.lang.String r4 = r11.getString(r3)
            r3 = 0
            r5.A0K(r3, r4)
            r5.setVisibility(r1)
        L_0x088a:
            r8.setLongClickable(r1)
            goto L_0x0818
        L_0x088e:
            if (r18 == 0) goto L_0x0894
            r3 = 2131886925(0x7f12034d, float:1.9408443E38)
            goto L_0x087f
        L_0x0894:
            boolean r3 = r0.A22()
            if (r3 != 0) goto L_0x08a5
            boolean r3 = r0.A23()
            if (r3 != 0) goto L_0x08a5
            boolean r4 = r0.A3P
            r3 = 0
            if (r4 == 0) goto L_0x08a6
        L_0x08a5:
            r3 = 1
        L_0x08a6:
            r16 = 8
            if (r3 == 0) goto L_0x08db
            java.lang.String r3 = r6.A0X
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x08db
            X.1VX r4 = r9.A07
            r3 = 5839(0x16cf, float:8.182E-42)
            boolean r3 = r4.A0X(r3)
            if (r3 == 0) goto L_0x09a2
            X.2sH r4 = r9.A06
            android.content.Context r3 = r5.getContext()
            java.lang.String r4 = X.AnonymousClass31U.A01(r3, r4, r6)
            boolean r3 = X.C107575bX.A0F(r4)
            if (r3 != 0) goto L_0x09a2
        L_0x08cc:
            r3 = 0
            r5.A0K(r3, r4)
            r5.setVisibility(r1)
            r3 = 1
            r5.setMaxLines(r3)
            X.C86664Kz.A1S(r5)
            goto L_0x088a
        L_0x08db:
            boolean r3 = r0.A2G(r6)
            if (r3 == 0) goto L_0x08ef
            r5.setVisibility(r7)
            android.widget.TextView r3 = r2.A0C
            r3.setVisibility(r7)
            r3 = r30
            r3.setVisibility(r1)
            goto L_0x088a
        L_0x08ef:
            boolean r3 = r0.A29()
            if (r3 == 0) goto L_0x0908
            java.lang.String r3 = r0.A1R(r6)
            r5.setText(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x099e
        L_0x0902:
            r3 = r16
            r5.setVisibility(r3)
            goto L_0x088a
        L_0x0908:
            if (r20 == 0) goto L_0x093f
            boolean r3 = r6.A0R()
            if (r3 == 0) goto L_0x093f
            java.lang.String r3 = r6.A0L()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x092d
            java.lang.String r4 = ""
        L_0x091c:
            X.1VX r13 = r9.A07
            r3 = 5839(0x16cf, float:8.182E-42)
            boolean r3 = r13.A0X(r3)
            if (r3 == 0) goto L_0x0996
            boolean r3 = X.C107575bX.A0F(r4)
            if (r3 != 0) goto L_0x0902
            goto L_0x08cc
        L_0x092d:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "~ "
            r4.append(r3)
            java.lang.String r3 = r6.A0L()
            java.lang.String r4 = X.AnonymousClass000.A0X(r3, r4)
            goto L_0x091c
        L_0x093f:
            X.4uZ r4 = r6.A0H
            boolean r3 = r4 instanceof X.C95804uY
            if (r3 == 0) goto L_0x0976
            X.2ss r3 = r0.A1f
            X.31A r4 = r3.A0A(r4, r1)
            X.1RL r4 = (X.AnonymousClass1RL) r4
            if (r4 == 0) goto L_0x0976
            boolean r3 = r4.A0K()
            if (r3 == 0) goto L_0x0976
            long r3 = r4.A05
            int r13 = (int) r3
            X.5QQ r3 = r0.A2F
            int r14 = r3.A00(r13)
            java.lang.String r15 = r3.A01(r14)
            r3 = 1
            X.C162457s7.A0J(r15, r3)
            android.content.res.Resources r4 = X.C08310eF.A09(r0)
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r1] = r15
            r3 = 2131755230(0x7f1000de, float:1.9141333E38)
            java.lang.String r4 = r4.getQuantityString(r3, r14, r13)
            goto L_0x091c
        L_0x0976:
            X.1VX r4 = r0.A1x
            r3 = 5839(0x16cf, float:8.182E-42)
            boolean r3 = r4.A0X(r3)
            if (r3 == 0) goto L_0x098b
            X.2sH r4 = r0.A1S
            android.content.Context r3 = r0.A1D()
            java.lang.String r4 = X.AnonymousClass31U.A01(r3, r4, r6)
            goto L_0x091c
        L_0x098b:
            java.lang.String r3 = r6.A0X
            java.lang.String r4 = "  "
            if (r3 == 0) goto L_0x091c
            java.lang.String r4 = X.AnonymousClass000.A0T(r3, r4)
            goto L_0x091c
        L_0x0996:
            r3 = 0
            r5.A0K(r3, r4)
            if (r4 != 0) goto L_0x099e
            goto L_0x0902
        L_0x099e:
            r16 = 0
            goto L_0x0902
        L_0x09a2:
            r5.setVisibility(r7)
            goto L_0x088a
        L_0x09a7:
            com.whatsapp.TextEmojiLabel r3 = r2.A0D
            r3.setVisibility(r1)
            r5 = 35
        L_0x09ae:
            X.5ef r13 = new X.5ef
            r13.<init>(r9, r5, r6)
            goto L_0x0315
        L_0x09b5:
            r3 = r29
            r3.setVisibility(r7)
            goto L_0x02cf
        L_0x09bc:
            boolean r3 = r0.A3Q
            if (r3 == 0) goto L_0x0a21
            android.widget.TextView r3 = r2.A0C
            r3.setVisibility(r7)
            android.widget.TextView r3 = r2.A0B
            r3.setVisibility(r7)
            com.whatsapp.TextEmojiLabel r13 = r2.A0D
            r13.A0A()
            r3 = 2131101333(0x7f060695, float:1.7815073E38)
            X.AnonymousClass0x2.A0q(r11, r13, r3)
            X.0WH r5 = r9.A00
            if (r5 != 0) goto L_0x09e1
            r3 = 6
            X.67a r5 = new X.67a
            r5.<init>(r9, r3)
            r9.A00 = r5
        L_0x09e1:
            X.2sq r3 = r0.A0k
            boolean r3 = X.C86604Kt.A1a(r3, r6)
            if (r3 == 0) goto L_0x0a04
            r3 = r29
            r3.setVisibility(r7)
            r13.setVisibility(r1)
            android.widget.ImageView r3 = r2.A07
            r3.setVisibility(r7)
            r3.setOnClickListener(r10)
            android.widget.ImageView r3 = r2.A02
            r3.setVisibility(r7)
            r3.setOnClickListener(r10)
        L_0x0a01:
            r10 = r5
            goto L_0x0320
        L_0x0a04:
            android.widget.ImageView r10 = r2.A07
            r10.setVisibility(r1)
            r3 = 31
            X.C18290x4.A1I(r10, r9, r6, r3)
            android.widget.ImageView r10 = r2.A02
            r10.setVisibility(r1)
            r3 = 32
            X.C18290x4.A1I(r10, r9, r6, r3)
            r13.setVisibility(r7)
            r3 = r29
            r3.setVisibility(r7)
            goto L_0x0a01
        L_0x0a21:
            boolean r3 = r0.A3U
            if (r3 == 0) goto L_0x0a4a
            android.widget.TextView r3 = r2.A0C
            r3.setVisibility(r7)
            android.widget.LinearLayout r3 = r2.A08
            r3.setVisibility(r1)
            android.widget.TextView r3 = r2.A0B
            r3.setVisibility(r7)
            android.widget.ImageView r3 = r2.A02
            r3.setVisibility(r7)
            android.widget.ImageView r3 = r2.A07
            r3.setVisibility(r7)
            com.whatsapp.TextEmojiLabel r3 = r2.A0D
            r3.setVisibility(r7)
            r3 = r29
            r3.setVisibility(r7)
            goto L_0x0320
        L_0x0a4a:
            boolean r3 = r0.A3Y
            if (r3 == 0) goto L_0x0a5c
            A00(r11, r2)
            r3 = r17
            boolean r3 = r3 instanceof X.C171108Fu
            if (r3 == 0) goto L_0x0320
            r5.setVisibility(r1)
            goto L_0x0320
        L_0x0a5c:
            boolean r3 = r0.A3R
            if (r3 == 0) goto L_0x0a65
            A00(r11, r2)
            goto L_0x0320
        L_0x0a65:
            com.whatsapp.TextEmojiLabel r5 = r2.A0D
            r5.setVisibility(r1)
            r5.A0A()
            r3 = 2131101333(0x7f060695, float:1.7815073E38)
            X.AnonymousClass0x2.A0q(r11, r5, r3)
            android.widget.ImageView r3 = r2.A07
            r3.setVisibility(r7)
            android.widget.ImageView r3 = r2.A02
            r3.setVisibility(r7)
            android.widget.TextView r3 = r2.A0B
            r3.setVisibility(r7)
            android.widget.TextView r5 = r2.A0C
            r5.setVisibility(r1)
            r3 = 2131100160(0x7f060200, float:1.7812694E38)
            X.AnonymousClass0x2.A0q(r11, r5, r3)
            r3 = r29
            r3.setVisibility(r7)
            android.widget.TextView r3 = r2.A09
            r3.setVisibility(r7)
            goto L_0x0320
        L_0x0a99:
            android.view.View r4 = r2.A01
            r4.setOnClickListener(r10)
            r12.setOnClickListener(r10)
            r4.setClickable(r1)
            r12.setClickable(r1)
            goto L_0x0292
        L_0x0aa9:
            android.view.LayoutInflater r6 = r0.A0I()
            boolean r2 = r0 instanceof com.whatsapp.contact.picker.AudienceSelectionContactPickerFragment
            if (r2 == 0) goto L_0x0bcb
            r2 = r0
            com.whatsapp.contact.picker.AudienceSelectionContactPickerFragment r2 = (com.whatsapp.contact.picker.AudienceSelectionContactPickerFragment) r2
            int r4 = r2.A00
            r2 = 2
            boolean r2 = X.AnonymousClass000.A1U(r4, r2)
            if (r2 == 0) goto L_0x0bcb
            r4 = 2131624452(0x7f0e0204, float:1.8876084E38)
        L_0x0ac0:
            android.view.View r8 = r6.inflate(r4, r5, r1)
            boolean r2 = r0.A3V
            if (r2 != 0) goto L_0x0acd
            boolean r2 = r0.A3d
            r4 = 0
            if (r2 == 0) goto L_0x0ace
        L_0x0acd:
            r4 = 1
        L_0x0ace:
            r2 = 2131429039(0x7f0b06af, float:1.847974E38)
            com.whatsapp.TextEmojiLabel r6 = X.AnonymousClass0x7.A0K(r8, r2)
            if (r4 == 0) goto L_0x0ada
            r6.setMaxLines(r3)
        L_0x0ada:
            if (r14 != 0) goto L_0x0ae8
            if (r4 == 0) goto L_0x0bc6
            X.1VX r4 = r9.A07
            r2 = 6741(0x1a55, float:9.446E-42)
            int r2 = r4.A0N(r2)
            if (r2 != r3) goto L_0x0bc6
        L_0x0ae8:
            r2 = 2131430801(0x7f0b0d91, float:1.8483313E38)
        L_0x0aeb:
            android.widget.TextView r4 = X.C18300x5.A0G(r8, r2)
            boolean r2 = r4 instanceof com.whatsapp.wds.components.button.WDSButton
            if (r2 == 0) goto L_0x0b0e
            X.1VX r5 = r9.A07
            r2 = 6739(0x1a53, float:9.443E-42)
            int r2 = r5.A0N(r2)
            if (r2 != r3) goto L_0x0b0e
            r5 = r4
            com.whatsapp.wds.components.button.WDSButton r5 = (com.whatsapp.wds.components.button.WDSButton) r5
            X.6wU r2 = X.C142006wU.OUTLINE
            r5.setVariant(r2)
            X.6vq r2 = X.C141606vq.SMALL
            r5.setSize(r2)
            r2 = 0
            r4.setLetterSpacing(r2)
        L_0x0b0e:
            r2 = 2131429038(0x7f0b06ae, float:1.8479737E38)
            android.widget.ImageView r21 = X.AnonymousClass0x9.A0E(r8, r2)
            r2 = 2131429034(0x7f0b06aa, float:1.847973E38)
            android.widget.ImageView r22 = X.AnonymousClass0x9.A0E(r8, r2)
            r2 = 2131429016(0x7f0b0698, float:1.8479693E38)
            android.view.View r19 = X.C06560Yg.A02(r8, r2)
            X.64J r5 = r0.A0h
            r2 = 2131429036(0x7f0b06ac, float:1.8479733E38)
            X.5YB r33 = X.AnonymousClass5YB.A00(r8, r5, r2)
            r2 = 2131429037(0x7f0b06ad, float:1.8479735E38)
            android.widget.TextView r28 = X.C18300x5.A0G(r8, r2)
            r2 = 2131429032(0x7f0b06a8, float:1.8479725E38)
            android.widget.ImageView r23 = X.AnonymousClass0x9.A0E(r8, r2)
            r2 = 2131429033(0x7f0b06a9, float:1.8479727E38)
            android.widget.ImageView r24 = X.AnonymousClass0x9.A0E(r8, r2)
            r2 = 2131427644(0x7f0b013c, float:1.847691E38)
            android.widget.TextView r29 = X.C18300x5.A0G(r8, r2)
            r2 = 2131433485(0x7f0b180d, float:1.8488757E38)
            android.view.View r5 = X.C06560Yg.A02(r8, r2)
            com.whatsapp.components.SelectionCheckView r5 = (com.whatsapp.components.SelectionCheckView) r5
            r2 = 2131429035(0x7f0b06ab, float:1.8479731E38)
            android.widget.ImageView r25 = X.AnonymousClass0x9.A0E(r8, r2)
            r2 = 2131428481(0x7f0b0481, float:1.8478608E38)
            android.widget.TextView r30 = X.C18300x5.A0G(r8, r2)
            r2 = 2131428365(0x7f0b040d, float:1.8478372E38)
            android.widget.LinearLayout r27 = X.C86654Ky.A0N(r8, r2)
            r2 = 2131430697(0x7f0b0d29, float:1.8483102E38)
            android.widget.ImageView r26 = X.AnonymousClass0x9.A0E(r8, r2)
            r2 = 2131428707(0x7f0b0563, float:1.8479066E38)
            android.view.View r20 = X.C06560Yg.A02(r8, r2)
            X.5LP r2 = new X.5LP
            r18 = r2
            r31 = r4
            r32 = r6
            r34 = r5
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r8.setTag(r2)
            boolean r4 = r0.A3Q
            if (r4 == 0) goto L_0x0bbc
            X.33j r7 = r0.A1V
            r4 = 2131428365(0x7f0b040d, float:1.8478372E38)
            android.view.View r6 = r8.findViewById(r4)
            android.content.res.Resources r5 = X.C08310eF.A09(r0)
            r4 = 2131165884(0x7f0702bc, float:1.7945998E38)
            int r4 = r5.getDimensionPixelSize(r4)
            X.C107555bV.A05(r6, r7, r1, r4)
            android.widget.ImageView r6 = r2.A07
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            android.content.res.Resources r4 = X.C08310eF.A09(r0)
            r7 = 2131165893(0x7f0702c5, float:1.7946016E38)
            X.C86654Ky.A0y(r4, r6, r5, r7)
            android.widget.ImageView r6 = r2.A02
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            android.content.res.Resources r4 = X.C08310eF.A09(r0)
            X.C86654Ky.A0y(r4, r6, r5, r7)
        L_0x0bbc:
            android.widget.ImageView r5 = r2.A06
            r4 = 2131886122(0x7f12002a, float:1.9406814E38)
            X.C107295b4.A03(r5, r4)
            goto L_0x00d8
        L_0x0bc6:
            r2 = 2131430800(0x7f0b0d90, float:1.8483311E38)
            goto L_0x0aeb
        L_0x0bcb:
            boolean r2 = r0.A2C()
            r4 = 2131624451(0x7f0e0203, float:1.8876082E38)
            if (r2 == 0) goto L_0x0ac0
            r4 = 2131624453(0x7f0e0205, float:1.8876086E38)
            goto L_0x0ac0
        L_0x0bd9:
            java.lang.String r0 = "unknown status distribution mode"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91924lo.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
