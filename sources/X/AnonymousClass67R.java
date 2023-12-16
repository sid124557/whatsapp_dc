package X;

import android.os.CountDownTimer;
import com.whatsapp.registration.RegisterPhone;

/* renamed from: X.67R  reason: invalid class name */
public class AnonymousClass67R extends CountDownTimer {
    public Object A00;
    public final int A01 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass67R(RegisterPhone registerPhone) {
        super(200, 200);
        this.A00 = registerPhone;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
        if (r2 == -2) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0181, code lost:
        if (r2 == 30) goto L_0x0162;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFinish() {
        /*
            r18 = this;
            r13 = r18
            int r0 = r13.A01
            if (r0 == 0) goto L_0x0188
            java.lang.Object r12 = r13.A00
            com.whatsapp.registration.RegisterPhone r12 = (com.whatsapp.registration.RegisterPhone) r12
            X.5Kb r0 = r12.A0I
            android.widget.EditText r0 = r0.A02
            android.text.Editable r0 = r0.getText()
            java.lang.String r11 = X.C18270x1.A0T(r0)
            X.5Kb r0 = r12.A0I
            android.widget.EditText r0 = r0.A03
            android.text.Editable r0 = r0.getText()
            java.lang.String r10 = X.C18270x1.A0T(r0)
            if (r11 == 0) goto L_0x00c7
            if (r10 == 0) goto L_0x00c7
            java.lang.String r9 = ""
            boolean r0 = r11.equals(r9)
            if (r0 != 0) goto L_0x00c7
            X.5Xx r1 = r12.A03
            java.lang.String r0 = r12.A0Z
            java.lang.String r8 = X.AnonymousClass36l.A0B(r1, r10, r11, r0)
            if (r8 == 0) goto L_0x00c7
            X.5Xx r0 = r12.A03
            java.lang.String r3 = X.AnonymousClass36l.A0A(r0, r11, r8)
            int r1 = r3.length()
            int r0 = r8.length()
            if (r1 < r0) goto L_0x00c7
            r2 = 2131892914(0x7f121ab2, float:1.942059E38)
            r7 = 1
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.33j r0 = r12.A00
            java.lang.String r0 = r0.A0I(r3)
            r6 = 0
            java.lang.String r17 = X.AnonymousClass002.A0F(r12, r0, r1, r6, r2)
            X.5Xx r0 = r12.A03
            java.lang.String r1 = X.C107195ar.A02(r0, r11, r10)
            java.lang.String r0 = X.C18320x8.A0f(r11, r8)
            java.lang.String r5 = "\\D"
            java.lang.String r4 = r0.replaceAll(r5, r9)
            java.lang.String r16 = r1.replaceAll(r5, r9)
            int r3 = r16.length()
            int r0 = r4.length()
            int r14 = X.AnonymousClass001.A0A(r3, r0)
            if (r14 != r7) goto L_0x0087
            if (r3 <= r0) goto L_0x0087
        L_0x007d:
            r2 = -1
        L_0x007e:
            boolean r0 = r12.A0e
            if (r0 == 0) goto L_0x00cb
            int r0 = r12.A01
            if (r0 != r2) goto L_0x00cb
            return
        L_0x0087:
            r1 = 0
            r2 = 0
        L_0x0089:
            if (r1 < r3) goto L_0x008e
            if (r14 != 0) goto L_0x00ae
            goto L_0x007d
        L_0x008e:
            r0 = r17
            char r15 = r0.charAt(r2)     // Catch:{ StringIndexOutOfBoundsException -> 0x00bd }
            char r0 = r4.charAt(r1)     // Catch:{ StringIndexOutOfBoundsException -> 0x00bd }
            if (r15 == r0) goto L_0x009d
            int r2 = r2 + 1
            goto L_0x008e
        L_0x009d:
            r0 = r16
            char r15 = r0.charAt(r1)     // Catch:{ StringIndexOutOfBoundsException -> 0x00bd }
            char r0 = r4.charAt(r1)     // Catch:{ StringIndexOutOfBoundsException -> 0x00bd }
            if (r15 != r0) goto L_0x00c4
            int r2 = r2 + 1
            int r1 = r1 + 1
            goto L_0x0089
        L_0x00ae:
            r0 = r17
            char r1 = r0.charAt(r2)     // Catch:{ StringIndexOutOfBoundsException -> 0x00bd }
            char r0 = r4.charAt(r3)     // Catch:{ StringIndexOutOfBoundsException -> 0x00bd }
            if (r1 == r0) goto L_0x00c4
            int r2 = r2 + 1
            goto L_0x00ae
        L_0x00bd:
            r1 = move-exception
            java.lang.String r0 = "RegistrationUtils/getIndexOfDifference/skip"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x00c7
        L_0x00c4:
            r0 = -2
            if (r2 != r0) goto L_0x007e
        L_0x00c7:
            r12.A7D()
            return
        L_0x00cb:
            r12.A01 = r2
            int r1 = r17.length()
            int r0 = r1 + -2
            if (r2 != r0) goto L_0x0184
            com.whatsapp.registration.RegisterPhone.A0n = r7
        L_0x00d7:
            android.widget.ScrollView r3 = r12.A08
            android.widget.TextView r0 = r12.A09
            int r0 = r0.getBottom()
            r3.scrollTo(r6, r0)
            android.text.SpannableString r3 = X.AnonymousClass4L0.A0A(r17)
            X.4Ms r0 = new X.4Ms
            r0.<init>(r13, r11, r8)
            r4 = 17
            r3.setSpan(r0, r6, r1, r4)
            android.widget.TextView r0 = r12.A09
            X.C86654Ky.A1E(r0)
            r0 = -1
            if (r2 == r0) goto L_0x0104
            r0 = -65536(0xffffffffffff0000, float:NaN)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            int r0 = r2 + 1
            r3.setSpan(r1, r2, r0, r4)
        L_0x0104:
            java.lang.String r0 = r3.toString()
            java.lang.String r2 = r0.replaceAll(r5, r9)
            java.lang.String r5 = r10.replaceAll(r5, r9)
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RegisterPhone/suggested/cc/"
            r4.append(r0)
            r4.append(r11)
            java.lang.String r0 = " pn="
            r4.append(r0)
            r4.append(r5)
            java.lang.String r0 = " suggest="
            r4.append(r0)
            r4.append(r8)
            java.lang.String r0 = " s="
            r4.append(r0)
            java.lang.String r0 = r12.A0Z
            r4.append(r0)
            java.lang.String r0 = " disp="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = " same="
            r4.append(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            X.5Xx r0 = r12.A03
            java.lang.String r0 = X.C107195ar.A02(r0, r11, r5)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = r2.equals(r0)
            X.C18260x0.A1V(r4, r0)
            r12.A0g = r7
            int r2 = r12.A00
            r1 = 31
            if (r2 != r1) goto L_0x017f
            r1 = 32
        L_0x0162:
            r12.A00 = r1
        L_0x0164:
            android.widget.TextView r0 = r12.A09
            X.C86664Kz.A1T(r0, r3)
            android.view.animation.AlphaAnimation r2 = X.C86604Kt.A0H()
            r0 = 150(0x96, double:7.4E-322)
            r2.setDuration(r0)
            android.widget.TextView r0 = r12.A09
            r0.startAnimation(r2)
            android.widget.TextView r0 = r12.A09
            r0.setVisibility(r6)
            r12.A0e = r7
            return
        L_0x017f:
            r0 = 30
            if (r2 != r0) goto L_0x0164
            goto L_0x0162
        L_0x0184:
            com.whatsapp.registration.RegisterPhone.A0o = r7
            goto L_0x00d7
        L_0x0188:
            java.lang.Object r0 = r13.A00
            X.5R6 r0 = (X.AnonymousClass5R6) r0
            X.3Wi r2 = r0.A0A
            r1 = 0
            X.5sD r0 = new X.5sD
            r0.<init>((java.lang.Object) r13, (int) r1)
            r2.A0S(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass67R.onFinish():void");
    }

    public void onTick(long j) {
        if (this.A01 == 0) {
            ((AnonymousClass5R6) this.A00).A0A.A0S(new C117615sD((Object) this, 1));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass67R(AnonymousClass5R6 r3, long j) {
        super(j, 60000);
        this.A00 = r3;
    }
}
