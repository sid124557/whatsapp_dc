package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.122  reason: invalid class name */
public class AnonymousClass122 extends AnonymousClass0R6 implements AnonymousClass49W {
    public List A00 = AnonymousClass001.A0s();
    public List A01 = AnonymousClass001.A0s();
    public List A02;
    public Map A03 = Collections.emptyMap();
    public boolean A04 = false;
    public final C111095hX A05;
    public final C69263Wi A06;
    public final AnonymousClass2FN A07;
    public final C613730l A08;
    public final C620633i A09;
    public final C56612sH A0A;
    public final C620733j A0B;
    public final C29041iB A0C;
    public final AnonymousClass33Z A0D;
    public final AnonymousClass1VX A0E;
    public final C66653Mg A0F;
    public final C66433Lk A0G;

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        int i2;
        String str;
        C66433Lk r8;
        AnonymousClass1VX r7;
        C620633i r6;
        C69263Wi r5;
        C111095hX r4;
        View view;
        C109335eS r2;
        boolean z;
        int i3;
        String str2;
        C66433Lk r52;
        C111095hX r42;
        View view2;
        C109335eS r22;
        if (i == 1) {
            r7 = this.A0E;
            if (C106545Zk.A02(r7)) {
                r42 = this.A05;
                r52 = this.A0G;
                r22 = new C109335eS(this, 6);
                z = C1001059l.A03;
                view2 = AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
                i3 = R.string.device_linking_wds_adv_warning_message;
                str2 = "seeing-devices-out-of-sync";
            } else {
                r5 = this.A06;
                r4 = this.A05;
                r8 = this.A0G;
                r6 = this.A09;
                r2 = new C109335eS(this, 6);
                view = AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
                i2 = R.string.device_linking_adv_warning_message;
                str = "seeing-devices-out-of-sync";
                return new C197712m(r2, view, r4, r5, r6, r7, r8, str, i2);
            }
        } else if (i == 2) {
            r7 = this.A0E;
            if (C106545Zk.A02(r7)) {
                r42 = this.A05;
                r52 = this.A0G;
                r22 = new C109335eS(this, 7);
                z = C1001059l.A03;
                view2 = AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
                i3 = R.string.device_linking_wds_fatal_error_warning_message;
                str2 = "seeing-devices-logged-out-unexpected-issue";
            } else {
                r5 = this.A06;
                r4 = this.A05;
                r8 = this.A0G;
                r6 = this.A09;
                r2 = new C109335eS(this, 7);
                view = AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
                i2 = R.string.device_linking_fatal_error_warning_message;
                str = "seeing-devices-logged-out-unexpected-issue";
                return new C197712m(r2, view, r4, r5, r6, r7, r8, str, i2);
            }
        } else if (i == 4) {
            AnonymousClass1VX r72 = this.A0E;
            C69263Wi r43 = this.A06;
            C111095hX r3 = this.A05;
            C620633i r62 = this.A09;
            C66433Lk r82 = this.A0G;
            return new AnonymousClass12G(AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), r3, r43, this.A07, r62, r72, r82);
        } else if (i == 5) {
            return new AnonymousClass12S(AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.device_section_layout), this.A0E);
        } else if (i == 6) {
            C56612sH r44 = this.A0A;
            AnonymousClass1VX r63 = this.A0E;
            C620733j r53 = this.A0B;
            return new C197112g(AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A07, r44, r53, r63);
        } else if (i == 8) {
            C56612sH r45 = this.A0A;
            AnonymousClass1VX r64 = this.A0E;
            C620733j r54 = this.A0B;
            return new AnonymousClass1OO(AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A07, r45, r54, r64);
        } else if (i == 9) {
            return new AnonymousClass12T(AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A07);
        } else {
            throw AnonymousClass002.A0G(AnonymousClass000.A0Y("Invalid viewType: ", AnonymousClass001.A0o(), i));
        }
        return new C197712m(r22, view2, r42, r52, str2, i3, z);
    }

    public static void A00(Object obj, List list, int i) {
        list.add(new C41362Jy(obj, i));
    }

    public int A0G() {
        return this.A02.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.1RU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.2QC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.1RU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.1RU} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BNf(X.C05570Ua r11, int r12) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.AnonymousClass12S
            if (r0 == 0) goto L_0x001e
            X.12S r11 = (X.AnonymousClass12S) r11
            X.1VX r2 = r11.A01
            r1 = 4757(0x1295, float:6.666E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r2 = r2.A0Y(r0, r1)
            com.whatsapp.WaTextView r1 = r11.A00
            r0 = 2131890444(0x7f12110c, float:1.941558E38)
            if (r2 == 0) goto L_0x001a
            r0 = 2131890458(0x7f12111a, float:1.9415608E38)
        L_0x001a:
            r1.setText(r0)
        L_0x001d:
            return
        L_0x001e:
            boolean r0 = r11 instanceof X.AnonymousClass1OO
            if (r0 == 0) goto L_0x006d
            X.12g r11 = (X.C197112g) r11
            java.util.List r0 = r10.A02
            java.lang.Object r0 = r0.get(r12)
            X.2Jy r0 = (X.C41362Jy) r0
            java.lang.Object r4 = r0.A01
            X.2QC r4 = (X.AnonymousClass2QC) r4
            android.widget.ImageView r1 = r11.A01
            int r0 = r4.A00
            r1.setImageResource(r0)
            android.widget.TextView r9 = r11.A04
            X.33j r3 = r11.A07
            long r1 = r4.A02
            long r7 = X.AnonymousClass0x9.A05(r1)
            r5 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0068
            r0 = 2131890428(0x7f1210fc, float:1.9415548E38)
            java.lang.String r0 = r3.A0B(r0)
        L_0x004e:
            r9.setText(r0)
            android.widget.TextView r3 = r11.A03
            android.view.View r2 = r11.A0H
            android.content.Context r1 = r2.getContext()
            int r0 = r4.A01
            java.lang.CharSequence r0 = r1.getText(r0)
            r3.setText(r0)
            r0 = 28
        L_0x0064:
            X.C18290x4.A1I(r2, r11, r4, r0)
            return
        L_0x0068:
            java.lang.CharSequence r0 = X.C107565bW.A02(r3, r1)
            goto L_0x004e
        L_0x006d:
            boolean r0 = r11 instanceof X.C197112g
            if (r0 == 0) goto L_0x0140
            java.util.List r0 = r10.A02
            java.lang.Object r0 = r0.get(r12)
            X.2Jy r0 = (X.C41362Jy) r0
            java.lang.Object r4 = r0.A01
            X.1RU r4 = (X.AnonymousClass1RU) r4
            X.12g r11 = (X.C197112g) r11
            X.1iB r0 = r10.A0C
            com.whatsapp.jid.DeviceJid r1 = r4.A07
            java.util.Set r0 = r0.A0R
            boolean r5 = r0.contains(r1)
            android.widget.ImageView r1 = r11.A01
            int r0 = X.C57112t6.A00(r4)
            r1.setImageResource(r0)
            android.widget.TextView r2 = r11.A03
            android.content.Context r1 = r2.getContext()
            X.1VX r0 = r11.A08
            java.lang.String r0 = X.AnonymousClass33G.A01(r1, r4, r0)
            r2.setText(r0)
            boolean r8 = r4.A02()
            if (r8 == 0) goto L_0x011d
            android.widget.TextView r1 = r11.A04
            r0 = 2131890440(0x7f121108, float:1.9415572E38)
        L_0x00ac:
            r1.setText(r0)
        L_0x00af:
            boolean r7 = r4.A00
            android.widget.ImageView r5 = r11.A02
            android.widget.ImageView r9 = r11.A00
            X.2sH r0 = r11.A06
            r6 = 8
            if (r8 == 0) goto L_0x00d7
            long r7 = r0.A0H()
            long r0 = r4.A01
            long r7 = r7 - r0
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r0 = 8
            if (r1 <= 0) goto L_0x00cc
            r0 = 0
        L_0x00cc:
            r9.setVisibility(r0)
            r5.setVisibility(r6)
        L_0x00d2:
            android.view.View r2 = r11.A0H
            r0 = 29
            goto L_0x0064
        L_0x00d7:
            r9.setVisibility(r6)
            r1 = 500(0x1f4, double:2.47E-321)
            r3 = 0
            int r0 = r5.getVisibility()
            if (r7 == 0) goto L_0x0101
            if (r0 != r6) goto L_0x00d2
            r5.clearAnimation()
            r5.setAlpha(r3)
            r0 = 0
            r5.setVisibility(r0)
            android.view.ViewPropertyAnimator r3 = r5.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r3.alpha(r0)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
        L_0x00fd:
            r0.start()
            goto L_0x00d2
        L_0x0101:
            if (r0 != 0) goto L_0x00d2
            r5.clearAnimation()
            android.view.ViewPropertyAnimator r0 = r5.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r3)
            android.view.ViewPropertyAnimator r2 = r0.setDuration(r1)
            r1 = 0
            X.4Gv r0 = new X.4Gv
            r0.<init>(r5, r1)
            android.view.ViewPropertyAnimator r0 = r2.setListener(r0)
            goto L_0x00fd
        L_0x011d:
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0127
            android.widget.TextView r1 = r11.A04
            r0 = 2131890460(0x7f12111c, float:1.9415612E38)
            goto L_0x00ac
        L_0x0127:
            android.widget.TextView r3 = r11.A04
            X.33j r2 = r11.A07
            long r0 = r4.A00
            if (r5 == 0) goto L_0x013b
            r0 = 2131890428(0x7f1210fc, float:1.9415548E38)
            java.lang.String r0 = r2.A0B(r0)
        L_0x0136:
            r3.setText(r0)
            goto L_0x00af
        L_0x013b:
            java.lang.CharSequence r0 = X.C107565bW.A02(r2, r0)
            goto L_0x0136
        L_0x0140:
            boolean r0 = r11 instanceof X.AnonymousClass12T
            if (r0 == 0) goto L_0x001d
            X.12T r11 = (X.AnonymousClass12T) r11
            X.2FN r0 = r11.A01
            com.whatsapp.TextEmojiLabel r4 = r11.A00
            com.whatsapp.companiondevice.LinkedDevicesActivity r3 = r0.A00
            X.5Tj r2 = r3.A0D
            X.33i r1 = r3.A08
            r0 = 2131892529(0x7f121931, float:1.9419809E38)
            r2.A03(r3, r4, r1, r0)
            X.5WX r2 = r3.A0I
            r1 = 9
            r0 = 0
            r2.A00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass122.BNf(X.0Ua, int):void");
    }

    public void Bre(Map map) {
        boolean booleanValue;
        this.A03 = map;
        for (AnonymousClass1RU r1 : this.A00) {
            if (!r1.A02()) {
                Boolean bool = (Boolean) map.get(r1.A07);
                if (bool == null) {
                    booleanValue = false;
                } else {
                    booleanValue = bool.booleanValue();
                }
                r1.A00 = booleanValue;
            }
        }
        A05();
    }

    public int getItemViewType(int i) {
        return ((C41362Jy) this.A02.get(i)).A00;
    }

    public AnonymousClass122(C111095hX r2, C69263Wi r3, AnonymousClass2FN r4, C613730l r5, C620633i r6, C56612sH r7, C620733j r8, C29041iB r9, AnonymousClass33Z r10, AnonymousClass1VX r11, C66653Mg r12, C66433Lk r13) {
        this.A07 = r4;
        this.A0A = r7;
        this.A0E = r11;
        this.A06 = r3;
        this.A05 = r2;
        this.A0G = r13;
        this.A09 = r6;
        this.A0B = r8;
        this.A0F = r12;
        this.A0D = r10;
        this.A0C = r9;
        this.A08 = r5;
        A0K();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007c A[LOOP:0: B:16:0x0076->B:18:0x007c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d5 A[LOOP:1: B:31:0x00cf->B:33:0x00d5, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0K() {
        /*
            r14 = this;
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r14.A02 = r0
            java.util.List r7 = r14.A00
            boolean r0 = r7.isEmpty()
            r9 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0089
            X.2sH r3 = r14.A0A
            long r0 = r3.A02
            r5 = 0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0021
            long r5 = r3.A02
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 + r0
        L_0x0021:
            long r2 = r3.A0D()
            long r0 = r5 - r2
            long r12 = java.lang.Math.abs(r0)
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0089
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LinkedDevicesAdapter/shouldShowAdvWarningBanner ntpTs="
            r8.append(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            X.AnonymousClass0x9.A1M(r8, r5, r0)
            java.lang.String r5 = "; waServerTs="
            r8.append(r5)
            X.AnonymousClass0x9.A1M(r8, r2, r0)
            X.AnonymousClass0x2.A19(r8)
            boolean r0 = r14.A04
            if (r0 != 0) goto L_0x0089
            java.util.List r0 = r14.A02
            A00(r4, r0, r9)
        L_0x0054:
            java.util.List r2 = r14.A02
            java.lang.Object r1 = X.AnonymousClass002.A0D()
            r0 = 4
            A00(r1, r2, r0)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x006c
            java.util.List r0 = r14.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0072
        L_0x006c:
            java.util.List r1 = r14.A02
            r0 = 5
            A00(r4, r1, r0)
        L_0x0072:
            java.util.Iterator r3 = r7.iterator()
        L_0x0076:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r2 = r3.next()
            X.33G r2 = (X.AnonymousClass33G) r2
            java.util.List r1 = r14.A02
            r0 = 6
            A00(r2, r1, r0)
            goto L_0x0076
        L_0x0089:
            X.3Mg r0 = r14.A0F
            boolean r0 = X.C66653Mg.A00(r0)
            if (r0 == 0) goto L_0x0054
            X.1VX r2 = r14.A0E
            r1 = 1037(0x40d, float:1.453E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0054
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0054
            boolean r0 = r14.A04
            if (r0 != 0) goto L_0x0054
            X.2sH r0 = r14.A0A
            long r5 = r0.A0H()
            X.30l r0 = r14.A08
            android.content.SharedPreferences r1 = r0.A02()
            java.lang.String r0 = "syncd_last_fatal_error_time"
            long r0 = X.AnonymousClass0x2.A0B(r1, r0)
            long r5 = r5 - r0
            r1 = 259200000(0xf731400, double:1.280618154E-315)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0054
            java.util.List r1 = r14.A02
            r0 = 2
            A00(r4, r1, r0)
            goto L_0x0054
        L_0x00c9:
            java.util.List r0 = r14.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x00cf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r2 = r3.next()
            java.util.List r1 = r14.A02
            r0 = 8
            A00(r2, r1, r0)
            goto L_0x00cf
        L_0x00e1:
            java.util.List r1 = r14.A02
            r0 = 9
            A00(r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass122.A0K():void");
    }
}
