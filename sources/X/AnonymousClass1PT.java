package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel;
import com.whatsapp.group.GroupChangedParticipantsBottomSheet;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1PT  reason: invalid class name */
public class AnonymousClass1PT extends AnonymousClass1PU implements AnonymousClass482 {
    public C116985rC A00;
    public C116985rC A01;
    public C625735q A02;
    public C33391sv A03;
    public C1230066r A04;
    public AnonymousClass5IP A05;
    public C44272Vj A06;
    public C56942so A07;
    public C84384Cd A08;
    public AnonymousClass67D A09;
    public AnonymousClass33U A0A;
    public C613330g A0B;
    public SharePhoneNumberRowViewModel A0C;
    public C56762sW A0D;
    public C56322rn A0E;
    public C55422qK A0F;
    public AnonymousClass2W8 A0G;
    public AnonymousClass2R8 A0H;
    public C49522gf A0I;
    public C196439aq A0J;
    public C43202Re A0K;
    public C56072rN A0L;
    public C183538qC A0M;
    public final View.OnClickListener A0N = new C109345eT(this, 19);
    public final TextView A0O;

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0168, code lost:
        if (r7 == 11) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x016c, code lost:
        if (r7 == 20) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0170, code lost:
        if (r7 == 93) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0174, code lost:
        if (r7 == 94) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0178, code lost:
        if (r7 == 97) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x017c, code lost:
        if (r7 == 99) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0180, code lost:
        if (r7 == 79) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0184, code lost:
        if (r7 == 134) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0188, code lost:
        if (r7 == 138) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x018c, code lost:
        if (r7 == 137) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0190, code lost:
        if (r7 == 101) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0194, code lost:
        if (r7 == 125) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0198, code lost:
        if (r7 == 102) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x019c, code lost:
        if (r7 == 103) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01a0, code lost:
        if (r7 == 104) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01a4, code lost:
        if (r7 == 107) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01a8, code lost:
        if (r7 == 108) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01ac, code lost:
        if (r7 == 109) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01b0, code lost:
        if (r7 == 112) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01b4, code lost:
        if (r7 == 128) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01b8, code lost:
        if (r7 == 115) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01bc, code lost:
        if (r7 == 114) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x01c0, code lost:
        if (r7 == 113) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01c4, code lost:
        if (r7 == 140) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01c8, code lost:
        if (r7 == 141) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01cc, code lost:
        if (r7 == 146) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x01d0, code lost:
        if (r7 == 145) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01d4, code lost:
        if (r7 == 150) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x01d8, code lost:
        if (r7 == 151) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x01dc, code lost:
        if (r7 == 147) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x01e0, code lost:
        if (r7 == 156) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x01e4, code lost:
        if (r7 == 155) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x01e8, code lost:
        if (r7 == 157) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x01ec, code lost:
        if (r7 == 158) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x01f0, code lost:
        if (r7 == 162) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x01f4, code lost:
        if (r7 == 164) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x01f6, code lost:
        r8.setOnClickListener((android.view.View.OnClickListener) null);
        r8.setClickable(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x01fe, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x022a, code lost:
        if (X.AnonymousClass000.A1T(r1.A00) == ((X.C61012zY) r15.A27.get()).A03(r2)) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        if ((r10 instanceof X.C31271o1) != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0298, code lost:
        if (r7 != 86) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x03b9, code lost:
        if (r7 == 158) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0101, code lost:
        if (r0 == false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0136, code lost:
        if (r1 != false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x013b, code lost:
        if (r0 != false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x014a, code lost:
        if (r7 == 59) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0159, code lost:
        if (r2.A0D(X.AnonymousClass34R.A02(r10.A1J.A00)) != false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x015d, code lost:
        if ((r10 instanceof X.C31581oW) == false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0161, code lost:
        if (r7 == 77) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0165, code lost:
        if (r7 != 78) goto L_0x0168;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r15 = this;
            X.34x r10 = r15.A0S
            X.1mI r10 = (X.C30341mI) r10
            r0 = 0
            r15.setClickable(r0)
            android.widget.TextView r8 = r15.A0O
            float r0 = r15.getDividerFontSize()
            r8.setTextSize(r0)
            int r0 = r10.A0D
            r1 = -1
            if (r0 != r1) goto L_0x0021
            byte r0 = r10.A1I
            if (r0 != r1) goto L_0x0021
        L_0x001a:
            r0 = 2131889320(0x7f120ca8, float:1.94133E38)
            r8.setText(r0)
            return
        L_0x0021:
            int r0 = r15.getBackgroundResource()
            if (r0 == 0) goto L_0x002a
            r8.setBackgroundResource(r0)
        L_0x002a:
            android.content.Context r1 = r15.getContext()
            int r0 = r15.getTextColor()
            X.AnonymousClass0x2.A0q(r1, r8, r0)
            X.35q r0 = r15.A02     // Catch:{ all -> 0x041a }
            r9 = 1
            java.lang.String r4 = r0.A0O(r10, r9)     // Catch:{ all -> 0x041a }
            android.content.Context r3 = r15.getContext()
            android.text.TextPaint r2 = r8.getPaint()
            r1 = 1067869798(0x3fa66666, float:1.3)
            X.5Y0 r0 = r15.A1R
            java.lang.CharSequence r11 = X.C107345b9.A04(r3, r2, r0, r4, r1)
            int r7 = r10.A00
            r1 = 164(0xa4, float:2.3E-43)
            r6 = 68
            r5 = 56
            r13 = 156(0x9c, float:2.19E-43)
            r12 = 146(0x92, float:2.05E-43)
            r4 = 67
            r3 = 11
            r2 = 96
            if (r7 == r9) goto L_0x0414
            if (r7 == r3) goto L_0x0414
            if (r7 == r4) goto L_0x006d
            r0 = 69
            if (r7 != r0) goto L_0x02aa
            boolean r0 = r10 instanceof X.C31271o1
            if (r0 == 0) goto L_0x03ab
        L_0x006d:
            android.util.Pair r0 = r15.A22(r10)
            int r1 = X.C18280x3.A03(r0)
            int r12 = X.C18290x4.A03(r0)
        L_0x0079:
            android.content.Context r0 = r15.getContext()
            android.graphics.drawable.Drawable r1 = X.AnonymousClass0VX.A01(r0, r1)
            X.C626936e.A06(r1)
            android.content.Context r0 = r15.getContext()
            int r0 = X.AnonymousClass0Y8.A04(r0, r12)
            android.graphics.drawable.Drawable r1 = X.C107335b8.A0B(r1, r0)
        L_0x0090:
            android.text.TextPaint r0 = r8.getPaint()
            java.lang.CharSequence r11 = X.C87044Mw.A01(r0, r1, r11)
        L_0x0098:
            r8.setText(r11)
            r0 = 18
            if (r7 == r0) goto L_0x013d
            if (r7 == r2) goto L_0x013d
            r0 = 57
            if (r7 == r0) goto L_0x013d
            r0 = 71
            if (r7 == r0) goto L_0x013d
            r0 = 28
            if (r7 != r0) goto L_0x029c
            X.2sr r0 = r15.A0Z
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x013d
            boolean r0 = r10 instanceof X.C31341o8
            if (r0 == 0) goto L_0x013d
            r0 = r10
            X.1o8 r0 = (X.C31341o8) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            boolean r0 = X.AnonymousClass2z0.A0E(r10, r0)
            if (r0 == 0) goto L_0x013d
        L_0x00c4:
            boolean r0 = X.C627636p.A0q(r10)
            if (r0 != 0) goto L_0x013d
            r0 = 61
            if (r7 == r0) goto L_0x013d
            r0 = 69
            if (r7 == r0) goto L_0x013d
            r0 = 62
            if (r7 == r0) goto L_0x013d
            r0 = 37
            if (r7 == r0) goto L_0x013d
            r0 = 39
            if (r7 == r0) goto L_0x013d
            r0 = 40
            if (r7 == r0) goto L_0x013d
            r0 = 41
            if (r7 == r0) goto L_0x013d
            r0 = 44
            if (r7 == r0) goto L_0x013d
            r0 = 70
            if (r7 == r0) goto L_0x013d
            r0 = 117(0x75, float:1.64E-43)
            if (r7 == r0) goto L_0x013d
            if (r7 == r6) goto L_0x013d
            r0 = 58
            if (r7 != r0) goto L_0x01ff
            boolean r0 = r10 instanceof X.C31241ny
            if (r0 == 0) goto L_0x0103
            r0 = r10
            X.1ny r0 = (X.C31241ny) r0
            boolean r0 = r0.A00
        L_0x0101:
            if (r0 != 0) goto L_0x013d
        L_0x0103:
            boolean r0 = r10.A1v()
            if (r0 == 0) goto L_0x0127
            X.4uZ r1 = r10.A0n()
            if (r1 == 0) goto L_0x0127
            X.2sr r0 = r15.A0Z
            boolean r0 = r0.A0a(r1)
            if (r0 != 0) goto L_0x0127
            boolean r0 = X.AnonymousClass2z0.A0D(r10)
            if (r0 == 0) goto L_0x0127
            r0 = 15
            if (r7 == r0) goto L_0x0127
            r0 = 16
            if (r7 == r0) goto L_0x0127
            if (r7 != r5) goto L_0x013d
        L_0x0127:
            X.2sr r1 = r15.A0Z
            X.2sj r2 = r15.A1L
            X.4uZ r0 = r10.A0n()
            if (r0 == 0) goto L_0x0138
            boolean r1 = r1.A0a(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0139
        L_0x0138:
            r0 = 0
        L_0x0139:
            if (r7 != r5) goto L_0x0146
            if (r0 == 0) goto L_0x014d
        L_0x013d:
            android.view.View$OnClickListener r0 = r15.A0N
            r8.setOnClickListener(r0)
            X.C107295b4.A02(r8)
            return
        L_0x0146:
            if (r7 == r5) goto L_0x014d
            r0 = 59
            if (r7 != r0) goto L_0x015b
            goto L_0x013d
        L_0x014d:
            X.2z0 r0 = r10.A1J
            X.4uZ r0 = r0.A00
            X.1fJ r0 = X.AnonymousClass34R.A02(r0)
            boolean r0 = r2.A0D(r0)
            if (r0 != 0) goto L_0x013d
        L_0x015b:
            boolean r0 = r10 instanceof X.C31581oW
            if (r0 == 0) goto L_0x0168
            r0 = 77
            if (r7 == r0) goto L_0x013d
            r0 = 78
            if (r7 != r0) goto L_0x0168
            goto L_0x013d
        L_0x0168:
            if (r7 == r3) goto L_0x013d
            r0 = 20
            if (r7 == r0) goto L_0x013d
            r0 = 93
            if (r7 == r0) goto L_0x013d
            r0 = 94
            if (r7 == r0) goto L_0x013d
            r0 = 97
            if (r7 == r0) goto L_0x013d
            r0 = 99
            if (r7 == r0) goto L_0x013d
            r0 = 79
            if (r7 == r0) goto L_0x013d
            r0 = 134(0x86, float:1.88E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 138(0x8a, float:1.93E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 137(0x89, float:1.92E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 101(0x65, float:1.42E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 125(0x7d, float:1.75E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 102(0x66, float:1.43E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 103(0x67, float:1.44E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 104(0x68, float:1.46E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 107(0x6b, float:1.5E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 108(0x6c, float:1.51E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 109(0x6d, float:1.53E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 112(0x70, float:1.57E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 128(0x80, float:1.794E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 115(0x73, float:1.61E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 114(0x72, float:1.6E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 113(0x71, float:1.58E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 140(0x8c, float:1.96E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 141(0x8d, float:1.98E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 146(0x92, float:2.05E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 145(0x91, float:2.03E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 150(0x96, float:2.1E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 151(0x97, float:2.12E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 147(0x93, float:2.06E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 156(0x9c, float:2.19E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 155(0x9b, float:2.17E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 157(0x9d, float:2.2E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 158(0x9e, float:2.21E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 162(0xa2, float:2.27E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 164(0xa4, float:2.3E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 0
            r8.setOnClickListener(r0)
            r0 = 0
            r8.setClickable(r0)
            return
        L_0x01ff:
            r0 = 153(0x99, float:2.14E-43)
            if (r7 != r0) goto L_0x022e
            boolean r0 = r10 instanceof X.C31261o0
            if (r0 == 0) goto L_0x0103
            r1 = r10
            X.1o0 r1 = (X.C31261o0) r1
            X.2z0 r0 = r1.A1J
            X.4uZ r0 = r0.A00
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A03(r0)
            if (r2 == 0) goto L_0x0103
            int r0 = r1.A01
            if (r0 != 0) goto L_0x0103
            int r0 = r1.A00
            boolean r1 = X.AnonymousClass000.A1T(r0)
            X.8qC r0 = r15.A27
            java.lang.Object r0 = r0.get()
            X.2zY r0 = (X.C61012zY) r0
            boolean r0 = r0.A03(r2)
            if (r1 != r0) goto L_0x0103
            goto L_0x013d
        L_0x022e:
            r0 = 27
            if (r7 == r0) goto L_0x013d
            r0 = 131(0x83, float:1.84E-43)
            if (r7 == r0) goto L_0x013d
            r0 = 73
            if (r7 == r0) goto L_0x013d
            r0 = 74
            if (r7 == r0) goto L_0x013d
            r0 = 83
            if (r7 == r0) goto L_0x013d
            r0 = 84
            if (r7 == r0) goto L_0x013d
            r0 = 85
            if (r7 == r0) goto L_0x013d
            r0 = 14
            if (r7 != r0) goto L_0x025f
            X.1VX r1 = r15.A0O
            r0 = r10
            X.1p1 r0 = (X.C31891p1) r0
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            boolean r0 = X.C625735q.A07(r1, r0)
            goto L_0x0101
        L_0x025f:
            r0 = 12
            if (r7 != r0) goto L_0x0286
            X.1VX r1 = r15.A0O
            r0 = r10
            X.1p1 r0 = (X.C31891p1) r0
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            boolean r0 = X.C625735q.A07(r1, r0)
            if (r0 != 0) goto L_0x013d
            X.35q r0 = r15.A02
            boolean r0 = r0.A0U(r10, r9)
            if (r0 != 0) goto L_0x013d
            X.2ss r1 = r15.A0N
            X.2sj r0 = r15.A1L
            boolean r0 = X.AnonymousClass31Y.A00(r1, r0, r10)
            goto L_0x0101
        L_0x0286:
            r0 = 75
            if (r7 == r0) goto L_0x013d
            r0 = 100
            if (r7 == r0) goto L_0x013d
            r0 = 95
            if (r7 == r0) goto L_0x013d
            r0 = 76
            if (r7 == r0) goto L_0x013d
            r0 = 86
            if (r7 == r0) goto L_0x013d
            goto L_0x0103
        L_0x029c:
            r0 = 10
            if (r7 == r0) goto L_0x013d
            if (r7 == r4) goto L_0x013d
            if (r7 == r2) goto L_0x013d
            r0 = 21
            if (r7 == r0) goto L_0x013d
            goto L_0x00c4
        L_0x02aa:
            if (r7 == r12) goto L_0x006d
            if (r7 == r13) goto L_0x006d
            r0 = 32
            if (r7 == r0) goto L_0x0326
            r0 = 31
            if (r7 == r0) goto L_0x0326
            if (r7 == r5) goto L_0x0344
            r0 = 59
            if (r7 == r0) goto L_0x0344
            if (r7 == r6) goto L_0x0344
            r0 = 70
            if (r7 != r0) goto L_0x02f5
            boolean r0 = r10 instanceof X.C31321o6
            if (r0 == 0) goto L_0x001a
            X.1sv r0 = r15.A03
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r13 = r10
            X.1o6 r13 = (X.C31321o6) r13
            android.content.Context r12 = r15.getContext()
            if (r0 == 0) goto L_0x02e1
            r1 = 2131232334(0x7f08064e, float:1.8080774E38)
        L_0x02d8:
            r0 = 2131100180(0x7f060214, float:1.7812734E38)
            android.graphics.drawable.Drawable r1 = X.C107335b8.A04(r12, r1, r0)
            goto L_0x0090
        L_0x02e1:
            int r1 = r13.A00
            r0 = 2
            if (r1 != r0) goto L_0x02ea
            r1 = 2131234233(0x7f080db9, float:1.8084626E38)
            goto L_0x02d8
        L_0x02ea:
            boolean r0 = r13.A02
            r1 = 2131232293(0x7f080625, float:1.8080691E38)
            if (r0 == 0) goto L_0x02d8
            r1 = 2131232291(0x7f080623, float:1.8080687E38)
            goto L_0x02d8
        L_0x02f5:
            if (r7 != r1) goto L_0x035b
            android.text.TextPaint r12 = r8.getPaint()
            r0 = r10
            X.1nw r0 = (X.C31221nw) r0
            java.lang.String r11 = r0.A01
            if (r11 == 0) goto L_0x0323
            r1 = 1152647168(0x44b40000, float:1440.0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r0 = android.text.TextUtils.ellipsize(r11, r12, r1, r0)
        L_0x030a:
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>()
            android.text.SpannableStringBuilder r12 = r11.append(r0)
            android.content.Context r1 = r15.getContext()
            r0 = 2131896148(0x7f122754, float:1.942715E38)
            java.lang.String r0 = r1.getString(r0)
            r12.append(r0)
            goto L_0x0098
        L_0x0323:
            java.lang.String r0 = ""
            goto L_0x030a
        L_0x0326:
            android.content.Context r1 = r15.getContext()
            r0 = 2131232434(0x7f0806b2, float:1.8080977E38)
            android.graphics.drawable.Drawable r12 = X.C18310x6.A0G(r1, r0)
            android.content.Context r13 = r15.getContext()
            android.content.Context r14 = r15.getContext()
            r1 = 2130969107(0x7f040213, float:1.7546887E38)
            r0 = 2131100218(0x7f06023a, float:1.7812811E38)
            int r0 = X.AnonymousClass5Yj.A02(r14, r1, r0)
            goto L_0x0356
        L_0x0344:
            android.content.Context r1 = r15.getContext()
            r0 = 2131232205(0x7f0805cd, float:1.8080513E38)
            android.graphics.drawable.Drawable r12 = X.C18310x6.A0G(r1, r0)
            android.content.Context r13 = r15.getContext()
            r0 = 2131100171(0x7f06020b, float:1.7812716E38)
        L_0x0356:
            int r0 = X.AnonymousClass0Y8.A04(r13, r0)
            goto L_0x0377
        L_0x035b:
            if (r7 != r2) goto L_0x037d
            boolean r0 = r10 instanceof X.C31091nj
        L_0x035f:
            if (r0 == 0) goto L_0x0098
            android.content.Context r1 = r15.getContext()
            r0 = 2131232532(0x7f080714, float:1.8081176E38)
            android.graphics.drawable.Drawable r12 = X.C18310x6.A0G(r1, r0)
            android.content.Context r1 = r15.getContext()
            r0 = 2131100180(0x7f060214, float:1.7812734E38)
            int r0 = X.AnonymousClass0Y8.A04(r1, r0)
        L_0x0377:
            android.graphics.drawable.Drawable r1 = X.C107335b8.A0B(r12, r0)
            goto L_0x0090
        L_0x037d:
            r0 = 97
            if (r7 != r0) goto L_0x0390
            r15.getContext()
            X.5rC r0 = r15.A01
            r0.A04()
            java.lang.String r0 = "getSmbChatAssignmentIconId"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0390:
            r0 = 99
            if (r7 != r0) goto L_0x0397
            boolean r0 = r10 instanceof X.C31511oP
            goto L_0x035f
        L_0x0397:
            r0 = 117(0x75, float:1.64E-43)
            if (r7 == r0) goto L_0x0407
            r0 = 121(0x79, float:1.7E-43)
            if (r7 == r0) goto L_0x0407
            r0 = 134(0x86, float:1.88E-43)
            if (r7 != r0) goto L_0x03ab
            r12 = 2131100171(0x7f06020b, float:1.7812716E38)
            r1 = 2131234096(0x7f080d30, float:1.8084348E38)
            goto L_0x0079
        L_0x03ab:
            r0 = 147(0x93, float:2.06E-43)
            if (r7 == r0) goto L_0x03c3
            r0 = 155(0x9b, float:2.17E-43)
            if (r7 == r0) goto L_0x03c3
            r0 = 157(0x9d, float:2.2E-43)
            if (r7 == r0) goto L_0x03bb
            r0 = 158(0x9e, float:2.21E-43)
            if (r7 != r0) goto L_0x0098
        L_0x03bb:
            r12 = 2131100220(0x7f06023c, float:1.7812815E38)
            r1 = 2131233991(0x7f080cc7, float:1.8084135E38)
            goto L_0x0079
        L_0x03c3:
            X.8wH r1 = r15.A26
            android.text.TextPaint r12 = r8.getPaint()
            r0 = 155(0x9b, float:2.17E-43)
            boolean r13 = X.AnonymousClass000.A1U(r7, r0)
            X.3XK r1 = (X.AnonymousClass3XK) r1
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            X.C162457s7.A0J(r12, r9)
            if (r13 != 0) goto L_0x0098
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "i "
            java.lang.String r0 = X.AnonymousClass000.A0P(r11, r0, r13)
            android.text.Spanned r11 = X.AnonymousClass0x9.A0B(r0)
            X.2oU r0 = r1.A00
            android.content.Context r13 = r0.A00
            r0 = 2131234048(0x7f080d00, float:1.808425E38)
            android.graphics.drawable.Drawable r1 = X.C18310x6.A0G(r13, r0)
            r0 = 2131100180(0x7f060214, float:1.7812734E38)
            int r0 = X.AnonymousClass0Y8.A04(r13, r0)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A0B(r1, r0)
            java.lang.CharSequence r11 = X.C87044Mw.A01(r12, r0, r11)
            X.C162457s7.A0H(r11)
            goto L_0x0098
        L_0x0407:
            android.content.Context r1 = r15.getContext()
            r0 = 2131233922(0x7f080c82, float:1.8083995E38)
            android.graphics.drawable.Drawable r1 = X.C18310x6.A0G(r1, r0)
            goto L_0x0090
        L_0x0414:
            java.lang.CharSequence r11 = r15.A1E(r11)
            goto L_0x0098
        L_0x041a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PT.A00():void");
    }

    public static /* synthetic */ void A01(C009707r r3, AnonymousClass1PT r4, C380225d r5) {
        DialogFragment A002;
        String str;
        if (r3 instanceof C89654ea) {
            if (r5 instanceof AnonymousClass1QS) {
                r4.getPhoneNumberSharedBridge();
                AnonymousClass1QS r52 = (AnonymousClass1QS) r5;
                A002 = AnonymousClass25J.A00(r52.A00, r52.A01);
                str = "PhoneNumberSharedBottomSheet";
            } else {
                A002 = r4.getSharePhoneNumberBridge().A00(((AnonymousClass1QR) r5).A00, 6);
                str = "SharePhoneNumberBottomSheet";
            }
            ((C89654ea) r3).Bon(A002, str);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0288, code lost:
        if (r4.A0v.A0d(r4.A0t.A07(r7)) != false) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x029c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02a1, code lost:
        if (android.text.TextUtils.isEmpty(r2) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02a3, code lost:
        r15 = (X.C89654ea) r15;
        r4 = new com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment();
        r1 = X.AnonymousClass002.A08();
        r1.putString("message", r2);
        r1.putInt("transitionId", r6);
        r1.putInt("systemAction", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02bf, code lost:
        if (r7 == null) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02c1, code lost:
        X.AnonymousClass0x2.A0v(r1, r7, "jid");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02c6, code lost:
        r4.A0u(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02fd, code lost:
        r0 = new java.lang.Object[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02ff, code lost:
        r2 = X.C18320x8.A0b(r2, r8, r0, 0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0422, code lost:
        r15.Bon(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0425, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04df, code lost:
        r15 = (X.C89654ea) r15;
        r4 = com.whatsapp.growthlock.InviteLinkUnavailableDialogFragment.A00(false, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x050c, code lost:
        if (r2 != null) goto L_0x051b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x050e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x051b, code lost:
        r4.A09.Bg5(r15, X.C005205m.A00(r15, com.whatsapp.R.id.footer), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0527, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x054f, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0557, code lost:
        if (r4.A0L.A01() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x055b, code lost:
        if ((r6 instanceof X.C31831ov) == false) goto L_0x05b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x055d, code lost:
        r8 = ((X.C31881p0) r6).A1x(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0564, code lost:
        if (r8 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0570, code lost:
        if (r4.A0O.A0Y(X.C58422vE.A02, 4345) == false) goto L_0x097b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0574, code lost:
        if (r10 != 108) goto L_0x05a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0576, code lost:
        r6 = (X.C31831ov) r6;
        r7 = r6.A20(3);
        r0 = r6.A1z(2).size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0585, code lost:
        if (r0 != 1) goto L_0x097b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0587, code lost:
        r6 = ((X.C52882mC) r7.get(0)).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0597, code lost:
        if (r4.A0N.A0L(r6) == false) goto L_0x096a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x059f, code lost:
        if (r4.A1L.A0C(r6) == false) goto L_0x096a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05a1, code lost:
        r4.A09.BgD(r15, r6, 9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c9, code lost:
        X.AnonymousClass27C.A00(r14, r15, r3, r17, r18, r6, r4, 1, r22, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05a6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05a9, code lost:
        if (r10 != 77) goto L_0x097b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05ab, code lost:
        r6 = (X.C31581oW) r6;
        r7 = X.AnonymousClass002.A0J(r6.A03);
        r0 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05b6, code lost:
        r8 = ((X.C31581oW) r6).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x065f, code lost:
        r2 = X.C627736r.A0V(r4.getContext(), r3, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e9, code lost:
        if (r4.A24(r6, r15.getString(com.whatsapp.R.string.f11nameremoved)) == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x06fa, code lost:
        r0 = r4.getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00eb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0736, code lost:
        r2 = X.C627736r.A0V(r4.getContext(), r2, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x073e, code lost:
        r4.A0V.A0A(r4.getContext(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0747, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ec, code lost:
        r0 = r4.A23();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f0, code lost:
        if (r0 == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x07e1, code lost:
        r15.Bon(r4, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x07e4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0863, code lost:
        r4 = r15.getString(r0);
        r2 = new com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment();
        r1 = X.AnonymousClass002.A08();
        r1.putString("message", r4);
        r2.A0u(r1);
        r5.Bon(r2, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x087b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x092b, code lost:
        r4 = X.C31201nu.A01(r15, r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x092f, code lost:
        r2 = new com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment();
        r1 = X.AnonymousClass002.A08();
        r1.putString("message", r4);
        r2.A0u(r1);
        r8.Bon(r2, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0943, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0961, code lost:
        r4.A0X.A0H(com.whatsapp.R.string.f11nameremoved, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0969, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x096a, code lost:
        r2 = r4.A09;
        r15 = (X.C89654ea) r15;
        java.util.Objects.requireNonNull(r15);
        r2.BgF(r6, new X.C85694Hg(r15, 1), (java.lang.String) null, 9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x097a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x097b, code lost:
        r4.A09.Bg5(r15, X.C005205m.A00(r15, com.whatsapp.R.id.footer), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0987, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x09da, code lost:
        r0.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x09dd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d8, code lost:
        r15.startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01db, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0209, code lost:
        if (X.C56972sr.A0A(r4.A0Z, r6) != false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A02(X.AnonymousClass1PT r23) {
        /*
            r4 = r23
            X.34x r6 = r4.A0S
            X.1mI r6 = (X.C30341mI) r6
            X.4uZ r7 = X.AnonymousClass2z0.A00(r6)
            android.content.Context r1 = r4.getContext()
            java.lang.Class<X.07r> r0 = X.C009707r.class
            android.app.Activity r15 = X.C111095hX.A03(r1, r0)
            X.07r r15 = (X.C009707r) r15
            int r10 = r6.A00
            r1 = 2
            r5 = 1
            r2 = 0
            r3 = 0
            switch(r10) {
                case 4: goto L_0x00ec;
                case 5: goto L_0x00ec;
                case 6: goto L_0x001f;
                case 7: goto L_0x00ec;
                case 8: goto L_0x001f;
                case 9: goto L_0x001f;
                case 10: goto L_0x001f;
                case 11: goto L_0x005f;
                case 12: goto L_0x008a;
                case 13: goto L_0x00ec;
                case 14: goto L_0x00de;
                case 15: goto L_0x001f;
                case 16: goto L_0x001f;
                case 17: goto L_0x001f;
                case 18: goto L_0x0101;
                case 19: goto L_0x001f;
                case 20: goto L_0x0033;
                case 21: goto L_0x0148;
                case 22: goto L_0x081d;
                case 23: goto L_0x0825;
                case 24: goto L_0x083f;
                case 25: goto L_0x0846;
                case 26: goto L_0x084e;
                case 27: goto L_0x0172;
                case 28: goto L_0x0185;
                case 29: goto L_0x001f;
                case 30: goto L_0x001f;
                case 31: goto L_0x001f;
                case 32: goto L_0x001f;
                case 33: goto L_0x001f;
                case 34: goto L_0x0855;
                case 35: goto L_0x085d;
                case 36: goto L_0x087c;
                case 37: goto L_0x0884;
                case 38: goto L_0x001f;
                case 39: goto L_0x0884;
                case 40: goto L_0x001f;
                case 41: goto L_0x001f;
                case 42: goto L_0x001f;
                case 43: goto L_0x001f;
                case 44: goto L_0x0884;
                case 45: goto L_0x001f;
                case 46: goto L_0x0890;
                case 47: goto L_0x08c7;
                case 48: goto L_0x0913;
                case 49: goto L_0x0925;
                case 50: goto L_0x0838;
                case 51: goto L_0x001f;
                case 52: goto L_0x001f;
                case 53: goto L_0x001f;
                case 54: goto L_0x001f;
                case 55: goto L_0x0815;
                case 56: goto L_0x01dc;
                case 57: goto L_0x020d;
                case 58: goto L_0x0215;
                case 59: goto L_0x0231;
                case 60: goto L_0x001f;
                case 61: goto L_0x0271;
                case 62: goto L_0x0318;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x037a;
                case 68: goto L_0x015e;
                case 69: goto L_0x024d;
                case 70: goto L_0x0474;
                case 71: goto L_0x020d;
                case 72: goto L_0x001f;
                case 73: goto L_0x04c3;
                case 74: goto L_0x049c;
                case 75: goto L_0x04fc;
                case 76: goto L_0x0528;
                case 77: goto L_0x054d;
                case 78: goto L_0x054a;
                case 79: goto L_0x0023;
                case 80: goto L_0x001f;
                case 81: goto L_0x00ec;
                case 82: goto L_0x00ec;
                case 83: goto L_0x05bc;
                case 84: goto L_0x072a;
                case 85: goto L_0x072a;
                case 86: goto L_0x05e0;
                case 87: goto L_0x001f;
                case 88: goto L_0x001f;
                case 89: goto L_0x001f;
                case 90: goto L_0x001f;
                case 91: goto L_0x061b;
                case 92: goto L_0x061b;
                case 93: goto L_0x05e0;
                case 94: goto L_0x05e0;
                case 95: goto L_0x0647;
                case 96: goto L_0x0669;
                case 97: goto L_0x0022;
                case 98: goto L_0x001f;
                case 99: goto L_0x033e;
                case 100: goto L_0x054a;
                case 101: goto L_0x050f;
                case 102: goto L_0x072a;
                case 103: goto L_0x0022;
                case 104: goto L_0x072a;
                case 105: goto L_0x001f;
                case 106: goto L_0x001f;
                case 107: goto L_0x068c;
                case 108: goto L_0x054d;
                case 109: goto L_0x054d;
                case 110: goto L_0x001f;
                case 111: goto L_0x001f;
                case 112: goto L_0x04e9;
                case 113: goto L_0x04e9;
                case 114: goto L_0x04e9;
                case 115: goto L_0x001f;
                case 116: goto L_0x001f;
                case 117: goto L_0x06a5;
                case 118: goto L_0x001f;
                case 119: goto L_0x001f;
                case 120: goto L_0x05bc;
                case 121: goto L_0x001f;
                case 122: goto L_0x001f;
                case 123: goto L_0x001f;
                case 124: goto L_0x001f;
                case 125: goto L_0x050f;
                case 126: goto L_0x001f;
                case 127: goto L_0x001f;
                case 128: goto L_0x04e9;
                case 129: goto L_0x001f;
                case 130: goto L_0x001f;
                case 131: goto L_0x0944;
                case 132: goto L_0x001f;
                case 133: goto L_0x001f;
                case 134: goto L_0x06ba;
                case 135: goto L_0x001f;
                case 136: goto L_0x001f;
                case 137: goto L_0x06dc;
                case 138: goto L_0x06dc;
                case 139: goto L_0x001f;
                case 140: goto L_0x0700;
                case 141: goto L_0x0700;
                case 142: goto L_0x001f;
                case 143: goto L_0x001f;
                case 144: goto L_0x001f;
                case 145: goto L_0x0122;
                case 146: goto L_0x0953;
                case 147: goto L_0x0748;
                case 148: goto L_0x001f;
                case 149: goto L_0x001f;
                case 150: goto L_0x0988;
                case 151: goto L_0x0988;
                case 152: goto L_0x001f;
                case 153: goto L_0x075d;
                case 154: goto L_0x001f;
                case 155: goto L_0x078a;
                case 156: goto L_0x07a2;
                case 157: goto L_0x07bb;
                case 158: goto L_0x00f3;
                case 159: goto L_0x001f;
                case 160: goto L_0x001f;
                case 161: goto L_0x001f;
                case 162: goto L_0x07e5;
                case 163: goto L_0x001f;
                case 164: goto L_0x07e5;
                default: goto L_0x001f;
            }
        L_0x001f:
            r4.A1K()
        L_0x0022:
            return
        L_0x0023:
            boolean r0 = r6 instanceof X.C31891p1
            if (r0 == 0) goto L_0x0022
            X.2sr r1 = r4.A0Z
            com.whatsapp.jid.UserJid r0 = X.C66493Lq.A00(r6)
            boolean r0 = r1.A0a(r0)
            goto L_0x00f0
        L_0x0033:
            X.35q r0 = r4.A02
            X.2Mr r0 = r0.A09(r6, r3, r5)
            X.1fJ r3 = X.AnonymousClass34R.A01(r7)
            if (r3 == 0) goto L_0x0022
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0022
            X.0df r14 = r15.getSupportFragmentManager()
            X.2so r0 = r4.A07
            X.1fJ r17 = r0.A01(r3)
            java.util.List r18 = java.util.Collections.emptyList()
            r0 = 3
            X.4Jz r6 = new X.4Jz
            r6.<init>(r0)
            X.4K0 r4 = new X.4K0
            r4.<init>(r0)
            r22 = 5
            goto L_0x00c9
        L_0x005f:
            X.35q r0 = r4.A02
            X.2Mr r0 = r0.A08(r6, r3, r5)
            X.1fJ r3 = X.AnonymousClass34R.A01(r7)
            if (r3 == 0) goto L_0x0022
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0022
            X.0df r14 = r15.getSupportFragmentManager()
            X.2so r0 = r4.A07
            X.1fJ r17 = r0.A01(r3)
            java.util.List r18 = java.util.Collections.emptyList()
            X.4Jz r6 = new X.4Jz
            r6.<init>(r1)
            X.4K0 r4 = new X.4K0
            r4.<init>(r1)
            r22 = 3
            goto L_0x00c9
        L_0x008a:
            r0 = 2131889770(0x7f120e6a, float:1.9414213E38)
            java.lang.String r0 = r15.getString(r0)
            boolean r0 = r4.A24(r6, r0)
            if (r0 != 0) goto L_0x0022
            X.1fJ r3 = X.AnonymousClass34R.A01(r7)
            if (r3 == 0) goto L_0x00d7
            X.2ss r7 = r4.A0N
            X.2sj r0 = r4.A1L
            boolean r0 = X.AnonymousClass31Y.A00(r7, r0, r6)
            if (r0 != 0) goto L_0x065f
            X.35q r0 = r4.A02
            boolean r0 = r0.A0U(r6, r5)
            if (r0 == 0) goto L_0x00d7
            X.0df r14 = r15.getSupportFragmentManager()
            X.2so r0 = r4.A07
            X.1fJ r17 = r0.A01(r3)
            java.util.List r18 = java.util.Collections.emptyList()
            X.4Jz r6 = new X.4Jz
            r6.<init>(r5)
            X.4K0 r4 = new X.4K0
            r4.<init>(r5)
            r22 = 4
        L_0x00c9:
            r19 = r6
            r20 = r4
            r21 = r5
            r23 = r2
            r16 = r3
            X.AnonymousClass27C.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        L_0x00d7:
            boolean r0 = r4.A23()
            if (r0 == 0) goto L_0x00de
            return
        L_0x00de:
            r0 = 2131890012(0x7f120f5c, float:1.9414704E38)
            java.lang.String r0 = r15.getString(r0)
            boolean r0 = r4.A24(r6, r0)
            if (r0 == 0) goto L_0x00ec
            return
        L_0x00ec:
            boolean r0 = r4.A23()
        L_0x00f0:
            if (r0 == 0) goto L_0x001f
            return
        L_0x00f3:
            boolean r0 = r15 instanceof X.C89654ea
            if (r0 == 0) goto L_0x0022
            X.4ea r15 = (X.C89654ea) r15
            X.214 r0 = X.AnonymousClass214.INFO
            com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureFragment r4 = X.AnonymousClass26H.A00(r3, r0, r3)
            goto L_0x07e1
        L_0x0101:
            X.4ea r15 = (X.C89654ea) r15
            com.whatsapp.conversation.conversationrow.IdentityChangeDialogFragment r4 = new com.whatsapp.conversation.conversationrow.IdentityChangeDialogFragment
            r4.<init>()
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            X.4uZ r1 = X.AnonymousClass2z0.A00(r6)
            X.4uZ r0 = r6.A0n()
            if (r0 == 0) goto L_0x0117
            r1 = r0
        L_0x0117:
            java.lang.String r0 = "participant_jid"
            X.AnonymousClass0x2.A0v(r2, r1, r0)
            r4.A0u(r2)
            goto L_0x07e1
        L_0x0122:
            X.1fJ r1 = X.AnonymousClass34R.A01(r7)
            X.2ss r0 = r4.A0N
            boolean r0 = r0.A0N(r1)
            if (r0 == 0) goto L_0x0022
            X.2sj r0 = r4.A1L
            boolean r0 = r0.A0D(r1)
            if (r0 == 0) goto L_0x0022
            X.2so r0 = r4.A07
            X.1fJ r1 = r0.A01(r1)
            if (r1 == 0) goto L_0x0022
            android.content.Context r0 = r4.getContext()
            android.content.Intent r1 = X.C627736r.A0i(r0, r1)
            goto L_0x06fa
        L_0x0148:
            X.2sj r1 = r4.A1L
            X.1fJ r0 = X.AnonymousClass34R.A02(r7)
            boolean r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x0961
            android.content.Context r0 = r4.getContext()
            android.content.Intent r1 = X.C627736r.A0P(r0, r7)
            goto L_0x06fa
        L_0x015e:
            boolean r0 = r15 instanceof X.C89654ea
            if (r0 == 0) goto L_0x0022
            X.2gf r0 = r4.A0I
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0022
            android.content.Intent r0 = X.C18320x8.A07()
            X.C627736r.A1G(r15, r0, r1)
            goto L_0x01d8
        L_0x0172:
            boolean r0 = X.C624134x.A0a(r6)
            if (r0 != 0) goto L_0x0203
            X.3Ex r0 = r4.A0t
            X.3ZH r0 = r0.A0A(r7)
            X.4uZ r0 = r0.A0H
            android.content.Intent r0 = X.C627736r.A0g(r15, r0, r2, r5, r5)
            goto L_0x01d8
        L_0x0185:
            X.1o8 r6 = (X.C31341o8) r6
            X.3Ex r1 = r4.A0t
            com.whatsapp.jid.UserJid r0 = r6.A01
            X.3ZH r1 = X.C64773Ex.A00(r1, r0)
            X.5ZU r0 = r4.A0v
            java.lang.String r5 = r0.A0H(r1)
            X.2sr r0 = r4.A0Z
            boolean r0 = r0.A0Y()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01b0
            X.4ea r15 = (X.C89654ea) r15
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A04(r7)
            com.whatsapp.jid.UserJid r0 = r6.A00
            X.C626936e.A06(r0)
            com.whatsapp.conversation.ChangeNumberNotificationDialogFragment r4 = com.whatsapp.conversation.ChangeNumberNotificationDialogFragment.A00(r1, r0, r5)
            goto L_0x07e1
        L_0x01b0:
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r7)
            com.whatsapp.jid.UserJid r0 = r6.A00
            if (r0 == 0) goto L_0x0022
            if (r1 == 0) goto L_0x0022
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0022
            X.3Ex r1 = r4.A0t
            com.whatsapp.jid.UserJid r0 = r6.A00
            X.3ZH r1 = r1.A0A(r0)
            java.lang.Class<X.4uZ> r0 = X.C95814uZ.class
            com.whatsapp.jid.Jid r0 = r1.A0I(r0)
            android.content.Intent r1 = X.C627336j.A01(r15, r0, r2)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            android.content.Intent r0 = r1.addFlags(r0)
        L_0x01d8:
            r15.startActivity(r0)
            return
        L_0x01dc:
            X.1fJ r5 = X.AnonymousClass34R.A02(r7)
            X.2sj r0 = r4.A1L
            boolean r0 = r0.A0D(r5)
            if (r0 == 0) goto L_0x0203
            android.content.Context r3 = r4.getContext()
            android.content.Context r2 = r4.getContext()
            X.3Ex r0 = r4.A0t
            X.3ZH r0 = r0.A07(r5)
            X.C626936e.A06(r0)
            int r0 = r0.A02
            android.content.Intent r0 = X.C627736r.A0R(r2, r5, r0, r1)
            r3.startActivity(r0)
            return
        L_0x0203:
            X.2sr r0 = r4.A0Z
            boolean r0 = X.C56972sr.A0A(r0, r6)
            if (r0 != 0) goto L_0x0022
            goto L_0x001f
        L_0x020d:
            X.4ea r15 = (X.C89654ea) r15
            com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment r4 = com.whatsapp.conversation.conversationrow.DeviceUpdateDialogFragment.A00(r6)
            goto L_0x07e1
        L_0x0215:
            boolean r0 = r6 instanceof X.C31241ny
            if (r0 == 0) goto L_0x0022
            X.1ny r6 = (X.C31241ny) r6
            boolean r2 = r6.A00
            X.2sq r1 = r4.A0q
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r7)
            boolean r0 = r1.A0P(r0)
            if (r2 == 0) goto L_0x0022
            if (r0 == 0) goto L_0x0022
            r0 = 106(0x6a, float:1.49E-43)
            X.C621433s.A01(r15, r0)
            return
        L_0x0231:
            boolean r0 = r15 instanceof X.C89654ea
            if (r0 == 0) goto L_0x0022
            X.34x r0 = r4.A0S
            X.2z0 r0 = r0.A1J
            X.4uZ r0 = r0.A00
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass32Y.A04(r0)
            X.2gf r2 = r4.A0I
            X.4ea r15 = (X.C89654ea) r15
            X.2ss r0 = r4.A0N
            int r0 = r0.A04(r3)
            r2.A00(r15, r3, r0, r1)
            return
        L_0x024d:
            X.1o1 r6 = (X.C31271o1) r6
            int r6 = r6.A00
            android.content.res.Resources r4 = X.C18290x4.A0G(r4)
            if (r6 == r5) goto L_0x026d
            r2 = 2131892743(0x7f121a07, float:1.9420243E38)
            if (r6 == r1) goto L_0x0268
            r0 = 3
            r2 = 2131892740(0x7f121a04, float:1.9420237E38)
            if (r6 == r0) goto L_0x0268
            r0 = 4
            if (r6 != r0) goto L_0x029c
            r2 = 2131896246(0x7f1227b6, float:1.9427348E38)
        L_0x0268:
            java.lang.String r2 = r4.getString(r2)
            goto L_0x029d
        L_0x026d:
            r2 = 2131892742(0x7f121a06, float:1.942024E38)
            goto L_0x0268
        L_0x0271:
            X.3Ex r0 = r4.A0t
            X.3ZH r0 = r0.A07(r7)
            X.2k5 r0 = r0.A0F
            if (r0 == 0) goto L_0x028a
            X.5ZU r1 = r4.A0v
            X.3Ex r0 = r4.A0t
            X.3ZH r0 = r0.A07(r7)
            boolean r0 = r1.A0d(r0)
            r9 = 1
            if (r0 == 0) goto L_0x028b
        L_0x028a:
            r9 = 0
        L_0x028b:
            X.1o1 r6 = (X.C31271o1) r6
            java.lang.String r8 = r6.A01
            int r6 = r6.A00
            X.3LP r0 = r4.A1T
            android.content.Context r1 = r4.getContext()
            r5 = 0
            r4 = 1
            switch(r6) {
                case 1: goto L_0x02d3;
                case 2: goto L_0x02e0;
                case 3: goto L_0x02d3;
                case 4: goto L_0x02e0;
                case 5: goto L_0x02d3;
                case 6: goto L_0x02e0;
                case 7: goto L_0x02e0;
                case 8: goto L_0x02ee;
                case 9: goto L_0x02ee;
                case 10: goto L_0x02cb;
                case 11: goto L_0x02cb;
                case 12: goto L_0x02cb;
                case 13: goto L_0x02ee;
                case 14: goto L_0x02ee;
                case 15: goto L_0x02d3;
                case 16: goto L_0x02ee;
                case 17: goto L_0x02ee;
                case 18: goto L_0x02cb;
                case 19: goto L_0x02cb;
                case 20: goto L_0x02cb;
                case 21: goto L_0x029c;
                case 22: goto L_0x02cb;
                case 23: goto L_0x02ee;
                case 24: goto L_0x029c;
                case 25: goto L_0x02cb;
                case 26: goto L_0x02cb;
                case 27: goto L_0x029c;
                case 28: goto L_0x02ee;
                case 29: goto L_0x02ee;
                case 30: goto L_0x030c;
                case 31: goto L_0x02ee;
                case 32: goto L_0x02cb;
                case 33: goto L_0x02ee;
                default: goto L_0x029c;
            }
        L_0x029c:
            r2 = 0
        L_0x029d:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0022
            X.4ea r15 = (X.C89654ea) r15
            com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment r4 = new com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment
            r4.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "message"
            r1.putString(r0, r2)
            java.lang.String r0 = "transitionId"
            r1.putInt(r0, r6)
            java.lang.String r0 = "systemAction"
            r1.putInt(r0, r10)
            if (r7 == 0) goto L_0x02c6
            java.lang.String r0 = "jid"
            X.AnonymousClass0x2.A0v(r1, r7, r0)
        L_0x02c6:
            r4.A0u(r1)
            goto L_0x07e1
        L_0x02cb:
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131886841(0x7f1202f9, float:1.9408272E38)
            goto L_0x02fd
        L_0x02d3:
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131886847(0x7f1202ff, float:1.9408284E38)
            if (r9 == 0) goto L_0x02fd
            r1 = 2131886848(0x7f120300, float:1.9408286E38)
            goto L_0x02fd
        L_0x02e0:
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131886849(0x7f120301, float:1.9408288E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r8 = X.C107555bV.A02(r8)
            goto L_0x02ff
        L_0x02ee:
            if (r7 == 0) goto L_0x0304
            boolean r0 = X.C615031a.A01(r0, r7)
            if (r0 == 0) goto L_0x0304
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131888149(0x7f120815, float:1.9410925E38)
        L_0x02fd:
            java.lang.Object[] r0 = new java.lang.Object[r4]
        L_0x02ff:
            java.lang.String r2 = X.C18320x8.A0b(r2, r8, r0, r5, r1)
            goto L_0x029d
        L_0x0304:
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131886843(0x7f1202fb, float:1.9408276E38)
            goto L_0x02fd
        L_0x030c:
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131886842(0x7f1202fa, float:1.9408274E38)
            java.lang.String r2 = r1.getString(r0)
            goto L_0x029d
        L_0x0318:
            boolean r0 = r15 instanceof X.C89654ea
            if (r0 == 0) goto L_0x0022
            X.4ea r15 = (X.C89654ea) r15
            X.1VX r1 = r4.A0O
            r0 = 1071(0x42f, float:1.501E-42)
            r1.A0X(r0)
            com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment r4 = new com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment
            r4.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "jid"
            X.AnonymousClass0x2.A0v(r1, r7, r0)
            java.lang.String r0 = "provider_category"
            r1.putInt(r0, r2)
            r4.A0u(r1)
            goto L_0x07e1
        L_0x033e:
            boolean r0 = r15 instanceof X.C89654ea
            if (r0 == 0) goto L_0x0022
            X.1fJ r3 = X.AnonymousClass34R.A02(r7)
            X.2sj r0 = r4.A1L
            boolean r2 = r0.A0D(r3)
            X.4FS r1 = r4.A25
            r0 = 15
            X.C71333bw.A00(r1, r4, r3, r0)
            X.8qC r0 = r4.A2B
            java.lang.Object r1 = r0.get()
            X.2eH r1 = (X.C48062eH) r1
            if (r2 == 0) goto L_0x036d
            java.lang.Class<X.8y8> r0 = X.C187988y8.class
            r1.A02(r0)
            com.whatsapp.chatinfo.view.custom.PhoneNumberSharedInCAGBottomSheet r1 = new com.whatsapp.chatinfo.view.custom.PhoneNumberSharedInCAGBottomSheet
            r1.<init>()
            java.lang.String r0 = "PhoneNumberSharedInCAGBottomSheet"
        L_0x0369:
            X.4ea r15 = (X.C89654ea) r15
            goto L_0x0422
        L_0x036d:
            java.lang.Class<X.8y7> r0 = X.C187978y7.class
            r1.A02(r0)
            com.whatsapp.chatinfo.view.custom.PhoneNumberHiddenInCAGBottomSheet r1 = new com.whatsapp.chatinfo.view.custom.PhoneNumberHiddenInCAGBottomSheet
            r1.<init>()
            java.lang.String r0 = "PhoneNumberHiddenInCAGBottomSheet"
            goto L_0x0369
        L_0x037a:
            boolean r0 = r15 instanceof X.C89654ea
            if (r0 == 0) goto L_0x0022
            X.4ea r15 = (X.C89654ea) r15
            X.8qC r0 = r4.A28
            java.lang.Object r1 = r0.get()
            X.66o r1 = (X.C1229766o) r1
            X.5jK r1 = (X.C112185jK) r1
            X.2z0 r0 = r6.A1J
            X.4uZ r2 = r0.A00
            boolean r0 = r1.BH2(r2)
            if (r0 == 0) goto L_0x03ad
            boolean r0 = r6 instanceof X.C31211nv
            if (r0 == 0) goto L_0x03ad
            r0 = r6
            X.1nv r0 = (X.C31211nv) r0
            int r1 = r0.A00
            r0 = 15
            if (r1 != r0) goto L_0x03ad
            X.8qC r0 = r4.A28
            java.lang.Object r0 = r0.get()
            X.66o r0 = (X.C1229766o) r0
            r0.BpI(r15, r5)
            return
        L_0x03ad:
            X.1VX r1 = r4.A0O
            r0 = 1071(0x42f, float:1.501E-42)
            X.2vE r8 = X.C58422vE.A02
            boolean r0 = r1.A0Y(r8, r0)
            if (r0 == 0) goto L_0x0437
            if (r2 == 0) goto L_0x0437
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.PhoneUserJid.WHATSAPP_CAPS_SURVEY
            boolean r14 = r0.equals(r2)
            X.1VX r0 = r4.A0O
            boolean r13 = X.C616831v.A00(r0, r2)
            X.2mi r0 = r4.A1X
            boolean r12 = r0.A02(r2)
            X.3LP r0 = r4.A1T
            boolean r11 = X.C615031a.A01(r0, r2)
            X.3Ex r0 = r4.A0t
            X.3ZH r10 = r0.A07(r2)
            X.2sr r0 = r4.A0Z
            X.1RR r9 = X.C56972sr.A01(r0)
            boolean r0 = X.C627336j.A0K(r2)
            if (r0 == 0) goto L_0x0428
            boolean r0 = r2 instanceof X.C28011fL
            if (r0 == 0) goto L_0x0428
            X.2sj r1 = r4.A1L
            r0 = r2
            X.1fL r0 = (X.C28011fL) r0
            boolean r0 = r1.A0F(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0437
        L_0x03f6:
            int r1 = r2.getType()
            r0 = 3
            r2 = 2
            if (r1 == r0) goto L_0x0402
            r2 = 1
            if (r1 == r5) goto L_0x0402
            r2 = 0
        L_0x0402:
            X.2sr r0 = r4.A0Z
            boolean r0 = r0.A0a(r7)
            if (r0 == 0) goto L_0x0426
            X.1VX r1 = r4.A0O
            r0 = 1967(0x7af, float:2.756E-42)
            boolean r0 = r1.A0Y(r8, r0)
            if (r0 == 0) goto L_0x0426
        L_0x0414:
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A04 = r5
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r1 = com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A00(r2)
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getCanonicalName()
        L_0x0422:
            r15.Bon(r1, r0)
            return
        L_0x0426:
            r5 = 0
            goto L_0x0414
        L_0x0428:
            boolean r0 = r2 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x045b
            X.2rx r1 = r4.A0u
            r0 = r2
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x045b
        L_0x0437:
            X.1VX r0 = r4.A0O
            boolean r0 = X.C616831v.A01(r0, r6)
            if (r0 != 0) goto L_0x0022
            X.1nv r6 = (X.C31211nv) r6
            int r2 = r6.A00
            com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment r4 = new com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment
            r4.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "jid"
            X.AnonymousClass0x2.A0v(r1, r7, r0)
            java.lang.String r0 = "business_state_id"
            r1.putInt(r0, r2)
            r4.A0u(r1)
            goto L_0x07e1
        L_0x045b:
            if (r10 == 0) goto L_0x0437
            boolean r0 = r10.A0R()
            if (r0 != 0) goto L_0x0437
            if (r9 == 0) goto L_0x0437
            boolean r0 = r9.A0R()
            if (r0 != 0) goto L_0x0437
            if (r14 != 0) goto L_0x0437
            if (r13 != 0) goto L_0x0437
            if (r11 != 0) goto L_0x0437
            if (r12 != 0) goto L_0x0437
            goto L_0x03f6
        L_0x0474:
            boolean r0 = r6 instanceof X.C31321o6
            if (r0 == 0) goto L_0x0022
            r0 = r6
            X.1o6 r0 = (X.C31321o6) r0
            java.lang.String r8 = r0.A01
            if (r8 == 0) goto L_0x0022
            X.3EW r7 = new X.3EW
            r7.<init>(r4, r6)
            X.2sW r1 = r4.A0D
            X.5IP r0 = r4.A05
            X.1sv r3 = new X.1sv
            r3.<init>(r7, r0, r1)
            r4.A03 = r3
            X.4FS r1 = r4.A25
            java.lang.String[] r0 = new java.lang.String[r5]
            r0[r2] = r8
            r1.BkO(r3, r0)
            r4.A1H()
            return
        L_0x049c:
            X.1fJ r1 = X.AnonymousClass34R.A02(r7)
            X.2sj r0 = r4.A1L
            boolean r0 = r0.A0D(r1)
            if (r0 == 0) goto L_0x0961
            X.2ss r0 = r4.A0N
            X.31A r0 = r0.A0A(r1, r2)
            if (r0 == 0) goto L_0x04b9
            X.2fO r0 = r0.A0e
            if (r0 == 0) goto L_0x04b9
            int r0 = r0.A00
            if (r0 != r5) goto L_0x04b9
            goto L_0x04df
        L_0x04b9:
            android.content.Context r0 = r4.getContext()
            android.content.Intent r1 = X.C627736r.A0P(r0, r1)
            goto L_0x06fa
        L_0x04c3:
            X.1fJ r1 = X.AnonymousClass34R.A02(r7)
            X.2sj r0 = r4.A1L
            boolean r0 = r0.A0D(r1)
            if (r0 == 0) goto L_0x0961
            X.2ss r0 = r4.A0N
            X.31A r0 = r0.A0A(r1, r2)
            if (r0 == 0) goto L_0x04e7
            X.2fO r0 = r0.A0e
            if (r0 == 0) goto L_0x04e7
            int r0 = r0.A00
            if (r0 != r5) goto L_0x04e7
        L_0x04df:
            X.4ea r15 = (X.C89654ea) r15
            com.whatsapp.growthlock.InviteLinkUnavailableDialogFragment r4 = com.whatsapp.growthlock.InviteLinkUnavailableDialogFragment.A00(r2, r5)
            goto L_0x07e1
        L_0x04e7:
            r5 = 0
            goto L_0x04df
        L_0x04e9:
            X.2rN r0 = r4.A0L
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0022
            boolean r0 = r6 instanceof X.C31861oy
            if (r0 == 0) goto L_0x0022
            X.1p0 r6 = (X.C31881p0) r6
            com.whatsapp.jid.GroupJid r2 = r6.A1x(r5)
            goto L_0x050c
        L_0x04fc:
            X.2rN r0 = r4.A0L
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0022
            boolean r0 = r6 instanceof X.C31571oV
            if (r0 == 0) goto L_0x0022
            X.1oV r6 = (X.C31571oV) r6
            com.whatsapp.jid.GroupJid r2 = r6.A01
        L_0x050c:
            if (r2 != 0) goto L_0x051b
            return
        L_0x050f:
            boolean r0 = r6 instanceof X.C31851ox
            if (r0 == 0) goto L_0x0022
            X.1p0 r6 = (X.C31881p0) r6
            com.whatsapp.jid.GroupJid r2 = r6.A1x(r5)
            if (r2 == 0) goto L_0x0022
        L_0x051b:
            X.67D r1 = r4.A09
            r0 = 2131430204(0x7f0b0b3c, float:1.8482102E38)
            android.view.View r0 = X.C005205m.A00(r15, r0)
            r1.Bg5(r15, r0, r2)
            return
        L_0x0528:
            boolean r0 = r15 instanceof X.C89654ea
            if (r0 == 0) goto L_0x0022
            boolean r0 = r6.A1v()
            if (r0 == 0) goto L_0x0548
            X.4uZ r1 = r6.A0n()
            if (r1 == 0) goto L_0x0548
            X.2sr r0 = r4.A0Z
            boolean r0 = r0.A0a(r1)
            if (r0 == 0) goto L_0x0548
        L_0x0540:
            X.4ea r15 = (X.C89654ea) r15
            com.whatsapp.conversation.conversationrow.ChatWithBusinessInDirectoryDialogFragment r4 = com.whatsapp.conversation.conversationrow.ChatWithBusinessInDirectoryDialogFragment.A00(r5)
            goto L_0x07e1
        L_0x0548:
            r5 = 0
            goto L_0x0540
        L_0x054a:
            boolean r0 = r6 instanceof X.C31581oW
            goto L_0x054f
        L_0x054d:
            boolean r0 = r6 instanceof X.C31831ov
        L_0x054f:
            if (r0 == 0) goto L_0x0022
            X.2rN r0 = r4.A0L
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0022
            boolean r0 = r6 instanceof X.C31831ov
            if (r0 == 0) goto L_0x05b6
            r0 = r6
            X.1p0 r0 = (X.C31881p0) r0
            com.whatsapp.jid.GroupJid r8 = r0.A1x(r5)
        L_0x0564:
            if (r8 == 0) goto L_0x0022
            X.1VX r9 = r4.A0O
            r7 = 4345(0x10f9, float:6.089E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r9.A0Y(r0, r7)
            if (r0 == 0) goto L_0x097b
            r0 = 108(0x6c, float:1.51E-43)
            if (r10 != r0) goto L_0x05a7
            X.1ov r6 = (X.C31831ov) r6
            r0 = 3
            java.util.List r7 = r6.A20(r0)
            java.util.List r0 = r6.A1z(r1)
            int r0 = r0.size()
        L_0x0585:
            if (r0 != r5) goto L_0x097b
            java.lang.Object r0 = r7.get(r2)
            X.2mC r0 = (X.C52882mC) r0
            com.whatsapp.jid.GroupJid r6 = r0.A02
            X.2ss r0 = r4.A0N
            boolean r0 = r0.A0L(r6)
            r5 = 9
            if (r0 == 0) goto L_0x096a
            X.2sj r0 = r4.A1L
            boolean r0 = r0.A0C(r6)
            if (r0 == 0) goto L_0x096a
            X.67D r0 = r4.A09
            r0.BgD(r15, r6, r5)
            return
        L_0x05a7:
            r0 = 77
            if (r10 != r0) goto L_0x097b
            X.1oW r6 = (X.C31581oW) r6
            java.util.Set r0 = r6.A03
            java.util.ArrayList r7 = X.AnonymousClass002.A0J(r0)
            int r0 = r6.A00
            goto L_0x0585
        L_0x05b6:
            r0 = r6
            X.1oW r0 = (X.C31581oW) r0
            X.1fJ r8 = r0.A01
            goto L_0x0564
        L_0x05bc:
            X.1fJ r3 = X.AnonymousClass34R.A02(r7)
            X.2sj r0 = r4.A1L
            boolean r0 = r0.A0D(r3)
            if (r0 == 0) goto L_0x0022
            android.content.Context r0 = r4.getContext()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupPendingParticipantsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "gid"
            X.AnonymousClass0x2.A0u(r2, r3, r0)
            goto L_0x073e
        L_0x05e0:
            X.C626936e.A06(r7)
            X.1fJ r1 = X.AnonymousClass34R.A01(r7)
            if (r1 == 0) goto L_0x0611
            X.2ss r0 = r4.A0N
            boolean r0 = r0.A0N(r1)
            if (r0 == 0) goto L_0x0611
            X.2Vj r0 = r4.A06
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0611
            X.2so r0 = r4.A07
            X.1fJ r3 = r0.A01(r1)
            if (r3 == 0) goto L_0x0611
            X.67D r1 = r4.A09
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r15.findViewById(r0)
            boolean r0 = r1.Bg9(r15, r0, r3)
            if (r0 == 0) goto L_0x0611
            return
        L_0x0611:
            android.content.Context r0 = r4.getContext()
            android.content.Intent r1 = X.C627736r.A0g(r0, r7, r5, r2, r5)
            goto L_0x06fa
        L_0x061b:
            X.2sj r3 = r4.A1L
            X.C162457s7.A0J(r3, r2)
            X.4uZ r0 = r6.A0n()
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A05(r0)
            X.1fJ r0 = X.AnonymousClass2z0.A02(r6)
            X.C626936e.A06(r0)
            boolean r0 = r3.A0D(r0)
            if (r1 != 0) goto L_0x0022
            if (r0 == 0) goto L_0x0022
            X.5hX r2 = r4.A0V
            android.content.Context r1 = r4.getContext()
            java.lang.String r0 = "market://details?id=com.whatsapp"
            android.content.Intent r0 = X.C18300x5.A08(r0)
            r2.A0A(r1, r0)
            return
        L_0x0647:
            X.1fJ r3 = X.AnonymousClass34R.A02(r7)
            X.3Lq r0 = r4.A1V
            int r2 = r0.A03(r3)
            if (r2 == r5) goto L_0x0657
            r0 = 4
            if (r2 == r0) goto L_0x0657
            return
        L_0x0657:
            X.3Lq r0 = r4.A1V
            boolean r0 = r0.A0g(r3)
            if (r0 == 0) goto L_0x0022
        L_0x065f:
            android.content.Context r0 = r4.getContext()
            android.content.Intent r2 = X.C627736r.A0V(r0, r3, r1)
            goto L_0x073e
        L_0x0669:
            X.2h4 r0 = r4.A0z
            com.whatsapp.jid.UserJid r0 = r0.A00(r7)
            if (r0 != 0) goto L_0x0022
            com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel r3 = r4.A0C
            X.4UC r2 = X.AnonymousClass0x9.A0b()
            boolean r0 = r7 instanceof X.C27981fH
            if (r0 == 0) goto L_0x0682
            X.4FS r1 = r3.A04
            r0 = 34
            X.C70333aK.A00(r1, r3, r7, r2, r0)
        L_0x0682:
            r1 = 2
            X.4K7 r0 = new X.4K7
            r0.<init>(r15, r1, r4)
            r2.A0B(r15, r0)
            return
        L_0x068c:
            boolean r0 = r6 instanceof X.C31821ou
            if (r0 == 0) goto L_0x0022
            X.1p0 r6 = (X.C31881p0) r6
            com.whatsapp.jid.GroupJid r2 = r6.A1x(r5)
            if (r2 == 0) goto L_0x0022
            X.67D r1 = r4.A09
            r0 = 2131430204(0x7f0b0b3c, float:1.8482102E38)
            android.view.View r0 = X.C005205m.A00(r15, r0)
            r1.Bg7(r15, r0, r2)
            return
        L_0x06a5:
            boolean r0 = r6 instanceof X.C31311o5
            if (r0 == 0) goto L_0x0022
            X.1fJ r3 = X.AnonymousClass34R.A02(r7)
            X.4FS r2 = r4.A25
            r1 = 17
            X.3aK r0 = new X.3aK
            r0.<init>(r4, r6, r3, r1)
            r2.BkP(r0)
            return
        L_0x06ba:
            boolean r0 = r15 instanceof X.C89654ea
            if (r0 == 0) goto L_0x0022
            X.4uY r7 = (X.C95804uY) r7
            X.2ss r0 = r4.A0N
            X.31A r2 = r0.A0A(r7, r2)
            X.1RL r2 = (X.AnonymousClass1RL) r2
            if (r2 == 0) goto L_0x0022
            X.4ea r15 = (X.C89654ea) r15
            X.8qC r0 = r4.A2B
            java.lang.Object r1 = r0.get()
            X.2eH r1 = (X.C48062eH) r1
            boolean r0 = r2.A0K()
            X.C106265Yg.A00(r15, r1, r7, r0)
            return
        L_0x06dc:
            X.1fJ r1 = X.AnonymousClass34R.A01(r7)
            if (r1 == 0) goto L_0x0022
            X.2so r0 = r4.A07
            X.1fJ r1 = r0.A01(r1)
            if (r1 == 0) goto L_0x0022
            X.2sj r0 = r4.A1L
            boolean r0 = r0.A0D(r1)
            if (r0 == 0) goto L_0x0022
            android.content.Context r0 = r4.getContext()
            android.content.Intent r1 = X.C627736r.A0h(r0, r1)
        L_0x06fa:
            android.content.Context r0 = r4.getContext()
            goto L_0x09da
        L_0x0700:
            X.1fJ r2 = X.AnonymousClass34R.A02(r7)
            X.3Lq r0 = r4.A1V
            boolean r0 = r0.A0h(r2)
            if (r0 != 0) goto L_0x0736
            r2 = r15
            X.4ea r2 = (X.C89654ea) r2
            r5 = 2131893488(0x7f121cf0, float:1.9421754E38)
            r6 = 2131893486(0x7f121cee, float:1.942175E38)
            r7 = 2131893487(0x7f121cef, float:1.9421752E38)
            r8 = 2131895731(0x7f1225b3, float:1.9426303E38)
            X.3CV r3 = new X.3CV
            r3.<init>(r15, r4)
            r0 = 1
            X.4IA r4 = new X.4IA
            r4.<init>(r0)
            r2.A6b(r3, r4, r5, r6, r7, r8)
            return
        L_0x072a:
            X.1fJ r2 = X.AnonymousClass34R.A02(r7)
            X.3Lq r0 = r4.A1V
            boolean r0 = r0.A0g(r2)
            if (r0 == 0) goto L_0x0022
        L_0x0736:
            android.content.Context r0 = r4.getContext()
            android.content.Intent r2 = X.C627736r.A0V(r0, r2, r1)
        L_0x073e:
            X.5hX r1 = r4.A0V
            android.content.Context r0 = r4.getContext()
            r1.A0A(r0, r2)
            return
        L_0x0748:
            X.1VX r3 = r4.A0O
            X.C162457s7.A0J(r3, r2)
            r1 = 4873(0x1309, float:6.829E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0022
            X.8wH r0 = r4.A26
            r0.BgG(r5)
            return
        L_0x075d:
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass32Y.A03(r7)
            boolean r0 = r6 instanceof X.C31261o0
            if (r0 == 0) goto L_0x0022
            if (r5 == 0) goto L_0x0022
            X.1o0 r6 = (X.C31261o0) r6
            int r1 = r6.A00
            int r0 = r6.A01
            if (r0 != 0) goto L_0x0022
            X.8qC r0 = r4.A2C
            java.lang.Object r2 = r0.get()
            X.2m2 r2 = (X.C52782m2) r2
            android.content.Context r3 = r4.getContext()
            X.0df r4 = r15.getSupportFragmentManager()
            boolean r7 = X.AnonymousClass000.A1T(r1)
            java.lang.String r6 = "suspicious_chat_banner"
            r2.A00(r3, r4, r5, r6, r7)
            return
        L_0x078a:
            boolean r0 = r15 instanceof X.C89654ea
            if (r0 == 0) goto L_0x0022
            X.4ea r15 = (X.C89654ea) r15
            X.3Ex r1 = r4.A0t
            X.2z0 r0 = r6.A1J
            X.4uZ r0 = r0.A00
            X.3ZH r1 = r1.A07(r0)
            if (r1 != 0) goto L_0x09f3
            java.lang.String r0 = "ConversationRowDivider/handleWabaiEducationThirdPartyTapAction/Null contact"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x07a2:
            X.5rC r1 = r4.A0P
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0022
            r1.A04()
            X.4ea r15 = (X.C89654ea) r15
            X.C162457s7.A0J(r15, r2)
            com.whatsapp.inappsupportai.component.AboutAiSupportAssistantBottomSheet r0 = new com.whatsapp.inappsupportai.component.AboutAiSupportAssistantBottomSheet
            r0.<init>()
            r15.Boo(r0)
            return
        L_0x07bb:
            X.1VX r2 = r4.A0O
            r1 = 5869(0x16ed, float:8.224E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0022
            X.34x r0 = r4.A0S
            X.4uZ r2 = X.AnonymousClass2z0.A00(r0)
            boolean r0 = r15 instanceof X.C89654ea
            if (r0 == 0) goto L_0x0022
            X.4ea r15 = (X.C89654ea) r15
            X.214 r1 = X.AnonymousClass214.INFO
            X.8qC r0 = r4.A0M
            java.lang.Object r0 = r0.get()
            X.2zw r0 = (X.C61242zw) r0
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment r4 = X.AnonymousClass26I.A00(r2, r0, r1)
        L_0x07e1:
            r15.Bon(r4, r3)
            return
        L_0x07e5:
            boolean r0 = r6 instanceof X.C31231nx
            if (r0 == 0) goto L_0x080c
            X.1nx r6 = (X.C31231nx) r6
            long r0 = r6.A00
        L_0x07ed:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            if (r0 == 0) goto L_0x0022
            X.2qz r2 = r4.A1x
            long r0 = r0.longValue()
            X.34x r3 = X.C55122pp.A00(r2, r0)
            if (r3 == 0) goto L_0x0022
            X.3Wi r2 = r4.A0X
            r1 = 16
            X.3bw r0 = new X.3bw
            r0.<init>(r4, r1, r3)
            r2.A0S(r0)
            return
        L_0x080c:
            boolean r0 = r6 instanceof X.C31221nw
            if (r0 == 0) goto L_0x0022
            X.1nw r6 = (X.C31221nw) r6
            long r0 = r6.A00
            goto L_0x07ed
        L_0x0815:
            r8 = r15
            X.4ea r8 = (X.C89654ea) r8
            r1 = 2131895159(0x7f122377, float:1.9425143E38)
            goto L_0x092b
        L_0x081d:
            r8 = r15
            X.4ea r8 = (X.C89654ea) r8
            r1 = 2131895178(0x7f12238a, float:1.9425182E38)
            goto L_0x092b
        L_0x0825:
            r8 = r15
            X.4ea r8 = (X.C89654ea) r8
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.PhoneUserJid.WHATSAPP_CAPS_SURVEY
            boolean r0 = r0.equals(r7)
            r1 = 2131895174(0x7f122386, float:1.9425174E38)
            if (r0 == 0) goto L_0x092b
            r1 = 2131895434(0x7f12248a, float:1.94257E38)
            goto L_0x092b
        L_0x0838:
            r5 = r15
            X.4ea r5 = (X.C89654ea) r5
            r0 = 2131895157(0x7f122375, float:1.942514E38)
            goto L_0x0863
        L_0x083f:
            r5 = r15
            X.4ea r5 = (X.C89654ea) r5
            r0 = 2131895167(0x7f12237f, float:1.942516E38)
            goto L_0x0863
        L_0x0846:
            r8 = r15
            X.4ea r8 = (X.C89654ea) r8
            r1 = 2131895162(0x7f12237a, float:1.942515E38)
            goto L_0x092b
        L_0x084e:
            r5 = r15
            X.4ea r5 = (X.C89654ea) r5
            r0 = 2131895156(0x7f122374, float:1.9425137E38)
            goto L_0x0863
        L_0x0855:
            r8 = r15
            X.4ea r8 = (X.C89654ea) r8
            r1 = 2131895176(0x7f122388, float:1.9425178E38)
            goto L_0x092b
        L_0x085d:
            r5 = r15
            X.4ea r5 = (X.C89654ea) r5
            r0 = 2131895180(0x7f12238c, float:1.9425186E38)
        L_0x0863:
            java.lang.String r4 = r15.getString(r0)
            com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment r2 = new com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "message"
            r1.putString(r0, r4)
            r2.A0u(r1)
            r5.Bon(r2, r3)
            return
        L_0x087c:
            r8 = r15
            X.4ea r8 = (X.C89654ea) r8
            r1 = 2131895172(0x7f122384, float:1.942517E38)
            goto L_0x092b
        L_0x0884:
            X.9aq r1 = r4.A0J
            android.content.Context r0 = r4.getContext()
            X.1o9 r6 = (X.C31351o9) r6
            r1.A05(r0, r6)
            return
        L_0x0890:
            r7 = r15
            X.4ea r7 = (X.C89654ea) r7
            X.33j r8 = r4.A0M
            r4 = 2131886844(0x7f1202fc, float:1.9408278E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.1nu r6 = (X.C31201nu) r6
            java.lang.String r0 = r6.A00
            java.lang.String r0 = X.C107555bV.A02(r0)
            java.lang.String r0 = X.AnonymousClass002.A0F(r15, r0, r1, r2, r4)
            java.lang.String r1 = X.C107555bV.A01(r8, r0)
            com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment r4 = new com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment
            r4.<init>()
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r0 = "message"
            r2.putString(r0, r1)
            java.lang.String r1 = "system_action"
            r0 = 46
            r2.putInt(r1, r0)
            r4.A0u(r2)
            r7.Bon(r4, r3)
            return
        L_0x08c7:
            X.3Ex r0 = r4.A0t
            X.3ZH r1 = r0.A07(r7)
            X.5ZU r0 = r4.A0v
            boolean r0 = r0.A0d(r1)
            if (r0 != 0) goto L_0x08ff
            X.2k5 r0 = r1.A0F
            if (r0 == 0) goto L_0x08ff
            r8 = r15
            X.4ea r8 = (X.C89654ea) r8
            X.33j r9 = r4.A0M
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.PhoneUserJid.WHATSAPP_CAPS_SURVEY
            boolean r0 = r0.equals(r7)
            r4 = 2131886846(0x7f1202fe, float:1.9408282E38)
            if (r0 == 0) goto L_0x08ec
            r4 = 2131895436(0x7f12248c, float:1.9425705E38)
        L_0x08ec:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.1nu r6 = (X.C31201nu) r6
            java.lang.String r0 = r6.A00
            java.lang.String r0 = X.C107555bV.A02(r0)
            java.lang.String r0 = X.AnonymousClass002.A0F(r15, r0, r1, r2, r4)
            java.lang.String r4 = X.C107555bV.A01(r9, r0)
            goto L_0x092f
        L_0x08ff:
            r8 = r15
            X.4ea r8 = (X.C89654ea) r8
            X.33j r9 = r4.A0M
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.PhoneUserJid.WHATSAPP_CAPS_SURVEY
            boolean r0 = r0.equals(r7)
            r4 = 2131886845(0x7f1202fd, float:1.940828E38)
            if (r0 == 0) goto L_0x08ec
            r4 = 2131895435(0x7f12248b, float:1.9425703E38)
            goto L_0x08ec
        L_0x0913:
            r8 = r15
            X.4ea r8 = (X.C89654ea) r8
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.PhoneUserJid.WHATSAPP_CAPS_SURVEY
            boolean r0 = r0.equals(r7)
            r1 = 2131895168(0x7f122380, float:1.9425161E38)
            if (r0 == 0) goto L_0x092b
            r1 = 2131895433(0x7f122489, float:1.9425699E38)
            goto L_0x092b
        L_0x0925:
            r8 = r15
            X.4ea r8 = (X.C89654ea) r8
            r1 = 2131895163(0x7f12237b, float:1.9425151E38)
        L_0x092b:
            java.lang.String r4 = X.C31201nu.A01(r15, r6, r1)
        L_0x092f:
            com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment r2 = new com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "message"
            r1.putString(r0, r4)
            r2.A0u(r1)
            r8.Bon(r2, r3)
            return
        L_0x0944:
            X.67D r1 = r4.A09
            X.1fJ r7 = (X.C27991fJ) r7
            r0 = 2131430204(0x7f0b0b3c, float:1.8482102E38)
            android.view.View r0 = X.C005205m.A00(r15, r0)
            r1.Bg8(r15, r0, r7)
            return
        L_0x0953:
            X.8qC r0 = r4.A28
            java.lang.Object r0 = r0.get()
            X.66o r0 = (X.C1229766o) r0
            X.4ea r15 = (X.C89654ea) r15
            r0.BpI(r15, r2)
            return
        L_0x0961:
            X.3Wi r1 = r4.A0X
            r0 = 2131887455(0x7f12055f, float:1.9409518E38)
            r1.A0H(r0, r2)
            return
        L_0x096a:
            X.67D r2 = r4.A09
            X.4ea r15 = (X.C89654ea) r15
            java.util.Objects.requireNonNull(r15)
            r1 = 1
            X.4Hg r0 = new X.4Hg
            r0.<init>(r15, r1)
            r2.BgF(r6, r0, r3, r5)
            return
        L_0x097b:
            X.67D r1 = r4.A09
            r0 = 2131430204(0x7f0b0b3c, float:1.8482102E38)
            android.view.View r0 = X.C005205m.A00(r15, r0)
            r1.Bg5(r15, r0, r8)
            return
        L_0x0988:
            java.lang.String r0 = "ConversationRowDivider/handleHistorySettingTapAction"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2sj r1 = r4.A1L
            X.1VX r2 = r4.A0O
            X.34x r0 = r4.A0S
            X.2z0 r0 = r0.A1J
            X.4uZ r0 = r0.A00
            X.1fJ r0 = X.AnonymousClass34R.A01(r0)
            if (r0 == 0) goto L_0x09de
            boolean r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x09de
            r1 = 5191(0x1447, float:7.274E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x09de
            android.content.Context r1 = r4.getContext()
            X.34x r0 = r4.A0S
            X.1fJ r3 = X.AnonymousClass2z0.A02(r0)
            X.C626936e.A06(r3)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.HistorySettingActivity"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = "group_jid"
            X.AnonymousClass0x2.A0u(r1, r3, r0)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r1.setFlags(r0)
            android.content.Context r0 = r4.getContext()
            android.app.Activity r0 = X.C111095hX.A02(r0)
        L_0x09da:
            r0.startActivity(r1)
            return
        L_0x09de:
            android.content.Context r1 = r4.getContext()
            java.lang.Class<X.4ea> r0 = X.C89654ea.class
            android.app.Activity r1 = X.C111095hX.A03(r1, r0)
            X.4ea r1 = (X.C89654ea) r1
            com.whatsapp.components.GroupHistoryBottomSheet r0 = new com.whatsapp.components.GroupHistoryBottomSheet
            r0.<init>()
            r1.Bon(r0, r3)
            return
        L_0x09f3:
            X.30g r0 = r4.A0B
            java.io.InputStream r4 = r0.A04(r1, r5)
            java.lang.String r1 = r1.A0L()
            X.C162457s7.A0J(r15, r2)
            com.whatsapp.wabai.SystemMessage3PBottomSheet r3 = new com.whatsapp.wabai.SystemMessage3PBottomSheet
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r0 = "ARG_BOT_NAME"
            r2.putString(r0, r1)
            if (r4 == 0) goto L_0x0a20
            byte[] r1 = X.AnonymousClass2A7.A00(r4)
        L_0x0a14:
            java.lang.String r0 = "ARG_PHOTO_STREAM"
            r2.putByteArray(r0, r1)
            r3.A0u(r2)
            r15.Boo(r3)
            return
        L_0x0a20:
            r1 = 0
            goto L_0x0a14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PT.A02(X.1PT):void");
    }

    public static /* synthetic */ void A03(AnonymousClass1PT r5, C30341mI r6, AnonymousClass3ZF r7) {
        int i = ((C31321o6) r6).A00;
        if (r7 == null || r7.A07 == null) {
            C89654ea r2 = (C89654ea) C111095hX.A02(r5.getContext());
            r5.getVoipErrorFragmentBridge();
            int i2 = 12;
            if (i == 2) {
                i2 = 33;
            }
            r2.Bon(VoipErrorDialogFragment.A01(new C47702dg(), i2), (String) null);
        } else {
            ((C112455jl) r5.A04).BJS(r5.getContext(), r7, 8, false);
        }
        r5.A03 = null;
        r5.A1H();
    }

    private AnonymousClass3LD getPhoneNumberSharedBridge() {
        return (AnonymousClass3LD) ((C48062eH) this.A2B.get()).A02(AnonymousClass3LD.class);
    }

    private AnonymousClass3LX getSharePhoneNumberBridge() {
        return (AnonymousClass3LX) ((C48062eH) this.A2B.get()).A02(AnonymousClass3LX.class);
    }

    private AnonymousClass3LB getVoipErrorFragmentBridge() {
        return C48062eH.A00(this.A2B);
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r0 != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        if (r1 == 4) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006d, code lost:
        if (r1 != 4) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A22(X.C30341mI r4) {
        /*
            r3 = this;
            X.2z0 r0 = r4.A1J
            X.4uZ r1 = r0.A00
            X.2mi r0 = r3.A1X
            boolean r0 = r0.A02(r1)
            if (r0 != 0) goto L_0x008f
            X.1VX r0 = r3.A0O
            boolean r0 = X.C616831v.A00(r0, r1)
            if (r0 != 0) goto L_0x008f
            X.3LP r0 = r3.A1T
            boolean r0 = X.C57362tW.A00(r0, r1)
            if (r0 != 0) goto L_0x008f
            int r1 = r4.A00
            r0 = 67
            if (r1 != r0) goto L_0x004b
            boolean r0 = r4 instanceof X.C31211nv
            if (r0 == 0) goto L_0x0074
            r0 = r4
            X.1nv r0 = (X.C31211nv) r0
            int r1 = r0.A00
            X.1VX r0 = r3.A0O
            boolean r0 = X.C616831v.A01(r0, r4)
            switch(r1) {
                case 5: goto L_0x0039;
                case 6: goto L_0x0039;
                case 7: goto L_0x0039;
                case 8: goto L_0x0039;
                case 9: goto L_0x0039;
                case 10: goto L_0x0039;
                case 11: goto L_0x0034;
                case 12: goto L_0x0034;
                case 13: goto L_0x0034;
                case 14: goto L_0x0034;
                case 15: goto L_0x0039;
                case 16: goto L_0x0039;
                case 17: goto L_0x0039;
                default: goto L_0x0034;
            }
        L_0x0034:
            r2 = 2131232596(0x7f080754, float:1.8081306E38)
            if (r0 == 0) goto L_0x003c
        L_0x0039:
            r2 = 2131232539(0x7f08071b, float:1.808119E38)
        L_0x003c:
            switch(r1) {
                case 5: goto L_0x0070;
                case 6: goto L_0x0070;
                case 7: goto L_0x0070;
                case 8: goto L_0x0070;
                case 9: goto L_0x0070;
                case 10: goto L_0x0070;
                case 11: goto L_0x003f;
                case 12: goto L_0x003f;
                case 13: goto L_0x003f;
                case 14: goto L_0x003f;
                case 15: goto L_0x0070;
                case 16: goto L_0x0070;
                case 17: goto L_0x0070;
                default: goto L_0x003f;
            }
        L_0x003f:
            r1 = 2131100221(0x7f06023d, float:1.7812817E38)
        L_0x0042:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            android.util.Pair r0 = X.C18290x4.A0K(r0, r1)
            return r0
        L_0x004b:
            r0 = 69
            if (r1 != r0) goto L_0x0074
            boolean r0 = r4 instanceof X.C31271o1
            if (r0 == 0) goto L_0x0074
            X.1o1 r4 = (X.C31271o1) r4
            int r1 = r4.A00
            r0 = 2
            if (r1 == r0) goto L_0x0063
            r0 = 3
            if (r1 == r0) goto L_0x0063
            r0 = 4
            r2 = 2131232596(0x7f080754, float:1.8081306E38)
            if (r1 != r0) goto L_0x0066
        L_0x0063:
            r2 = 2131232539(0x7f08071b, float:1.808119E38)
        L_0x0066:
            r0 = 2
            if (r1 == r0) goto L_0x0070
            r0 = 3
            if (r1 == r0) goto L_0x0070
            r0 = 4
            if (r1 == r0) goto L_0x0070
            goto L_0x003f
        L_0x0070:
            r1 = 2131101886(0x7f0608be, float:1.7816194E38)
            goto L_0x0042
        L_0x0074:
            boolean r0 = X.C627636p.A0c(r4)
            if (r0 == 0) goto L_0x008b
            boolean r0 = r4 instanceof X.C31211nv
            if (r0 == 0) goto L_0x008b
            X.1nv r4 = (X.C31211nv) r4
            int r0 = r4.A00
            if (r0 == 0) goto L_0x008b
            r2 = 2131232539(0x7f08071b, float:1.808119E38)
            r1 = 2131100220(0x7f06023c, float:1.7812815E38)
            goto L_0x0042
        L_0x008b:
            r2 = 2131232596(0x7f080754, float:1.8081306E38)
            goto L_0x003f
        L_0x008f:
            r2 = 2131234048(0x7f080d00, float:1.808425E38)
            r1 = 2131100217(0x7f060239, float:1.781281E38)
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PT.A22(X.1mI):android.util.Pair");
    }

    public final boolean A23() {
        C27991fJ A012;
        C27991fJ A013 = AnonymousClass34R.A01(this.A0S.A1J.A00);
        if (A013 == null || !this.A0N.A0N(A013) || (A012 = this.A07.A01(A013)) == null || !this.A06.A00()) {
            return false;
        }
        this.A09.Bg7(getContext(), this, A012);
        return true;
    }

    public final boolean A24(C30341mI r7, String str) {
        C31891p1 r72 = (C31891p1) r7;
        if (!C625735q.A07(this.A0O, r72.A01.size())) {
            return false;
        }
        List list = r72.A01;
        C18260x0.A0O(str, list);
        GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet = new GroupChangedParticipantsBottomSheet();
        Bundle A082 = AnonymousClass002.A08();
        A082.putString("changed_participants_title", str);
        ArrayList A0u = C18300x5.A0u(list);
        C627336j.A0H(list, A0u);
        A082.putStringArrayList("changed_participants", A0u);
        groupChangedParticipantsBottomSheet.A0u(A082);
        ((C89654ea) C111095hX.A02(getContext())).Bon(groupChangedParticipantsBottomSheet, (String) null);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getBackgroundResource() {
        /*
            r5 = this;
            X.34x r3 = r5.A0S
            X.1mI r3 = (X.C30341mI) r3
            X.2z0 r0 = r3.A1J
            X.4uZ r4 = r0.A00
            X.2mi r0 = r5.A1X
            boolean r0 = r0.A02(r4)
            if (r0 == 0) goto L_0x0026
            int r1 = r3.A00
            r0 = 67
            if (r1 != r0) goto L_0x001a
            boolean r0 = r3 instanceof X.C31211nv
            if (r0 != 0) goto L_0x0041
        L_0x001a:
            boolean r0 = r3 instanceof X.C31891p1
            if (r0 != 0) goto L_0x0022
            boolean r0 = r3 instanceof X.C31001na
            if (r0 == 0) goto L_0x0094
        L_0x0022:
            r0 = 2131231361(0x7f080281, float:1.80788E38)
            return r0
        L_0x0026:
            X.1VX r0 = r5.A0O
            boolean r0 = X.C616831v.A00(r0, r4)
            if (r0 != 0) goto L_0x0041
            int r2 = r3.A00
            r0 = 67
            if (r2 != r0) goto L_0x0045
            boolean r0 = r3 instanceof X.C31211nv
            r1 = 1
            if (r0 == 0) goto L_0x0072
            X.3LP r0 = r5.A1T
            boolean r0 = X.C57362tW.A00(r0, r4)
            if (r0 == 0) goto L_0x0046
        L_0x0041:
            r0 = 2131233110(0x7f080956, float:1.8082348E38)
            return r0
        L_0x0045:
            r1 = 0
        L_0x0046:
            r0 = 69
            if (r2 != r0) goto L_0x005f
            boolean r0 = r3 instanceof X.C31271o1
            if (r0 == 0) goto L_0x005f
            X.1o1 r3 = (X.C31271o1) r3
            int r1 = r3.A00
            r0 = 2
            if (r1 == r0) goto L_0x0041
            r0 = 3
            if (r1 == r0) goto L_0x0041
            r0 = 4
            if (r1 == r0) goto L_0x0041
        L_0x005b:
            r0 = 2131233564(0x7f080b1c, float:1.808327E38)
            return r0
        L_0x005f:
            if (r1 == 0) goto L_0x0072
            r0 = r3
            X.1nv r0 = (X.C31211nv) r0
            int r1 = r0.A00
            X.1VX r0 = r5.A0O
            boolean r0 = X.C616831v.A01(r0, r3)
            switch(r1) {
                case 5: goto L_0x0041;
                case 6: goto L_0x0041;
                case 7: goto L_0x0041;
                case 8: goto L_0x0041;
                case 9: goto L_0x0041;
                case 10: goto L_0x0041;
                case 11: goto L_0x006f;
                case 12: goto L_0x006f;
                case 13: goto L_0x006f;
                case 14: goto L_0x006f;
                case 15: goto L_0x0041;
                case 16: goto L_0x0041;
                case 17: goto L_0x0041;
                default: goto L_0x006f;
            }
        L_0x006f:
            if (r0 == 0) goto L_0x005b
            goto L_0x0041
        L_0x0072:
            boolean r0 = A04(r3)
            if (r0 != 0) goto L_0x005b
            boolean r0 = X.C627636p.A0q(r3)
            if (r0 != 0) goto L_0x0094
            boolean r0 = X.C627636p.A0b(r3)
            if (r0 != 0) goto L_0x0094
            boolean r0 = X.C627636p.A0c(r3)
            if (r0 == 0) goto L_0x0098
            boolean r0 = r3 instanceof X.C31211nv
            if (r0 == 0) goto L_0x0098
            X.1nv r3 = (X.C31211nv) r3
            int r0 = r3.A00
            if (r0 == 0) goto L_0x0098
        L_0x0094:
            r0 = 2131231183(0x7f0801cf, float:1.807844E38)
            return r0
        L_0x0098:
            r0 = 147(0x93, float:2.06E-43)
            if (r2 == r0) goto L_0x00a0
            r0 = 155(0x9b, float:2.17E-43)
            if (r2 != r0) goto L_0x0022
        L_0x00a0:
            r0 = 2131231337(0x7f080269, float:1.8078752E38)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PT.getBackgroundResource():int");
    }

    public C30341mI getFMessage() {
        return (C30341mI) this.A0S;
    }

    public int getTextColor() {
        C30341mI r2 = (C30341mI) this.A0S;
        C95814uZ r1 = r2.A1J.A00;
        if (this.A1X.A02(r1)) {
            if ((r2.A00 != 67 || !(r2 instanceof C31211nv)) && !(r2 instanceof C31891p1)) {
                return R.color.f5nameremoved;
            }
            return R.color.f5nameremoved;
        } else if (C616831v.A00(this.A0O, r1) || C57362tW.A00(this.A1T, r1)) {
            return R.color.f5nameremoved;
        } else {
            int i = r2.A00;
            if (i == 67) {
                if (r2 instanceof C31211nv) {
                    int i2 = ((C31211nv) r2).A00;
                    boolean A012 = C616831v.A01(this.A0O, r2);
                    switch (i2) {
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 15:
                        case 16:
                        case 17:
                            return R.color.f5nameremoved;
                        default:
                            if (A012) {
                                return R.color.f5nameremoved;
                            }
                            return R.color.f5nameremoved;
                    }
                }
            } else if (i == 69 && (r2 instanceof C31271o1)) {
                int i3 = ((C31271o1) r2).A00;
                if (i3 == 2 || i3 == 3 || i3 != 4) {
                    return R.color.f5nameremoved;
                }
                return R.color.f5nameremoved;
            }
            if (A04(r2) || C627636p.A0q(r2) || C627636p.A0b(r2) || !C627636p.A0c(r2) || !(r2 instanceof C31211nv) || ((C31211nv) r2).A00 != 0) {
                return R.color.f5nameremoved;
            }
            return R.color.f5nameremoved;
        }
    }

    public void onDetachedFromWindow() {
        C33391sv r1 = this.A03;
        if (r1 != null) {
            r1.A0D(true);
            this.A03 = null;
        }
        super.onDetachedFromWindow();
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C30341mI);
        this.A0S = r2;
    }

    public AnonymousClass1PT(Context context, AnonymousClass677 r4, C30341mI r5) {
        super(context, r4, r5);
        setClickable(false);
        this.A0O = AnonymousClass002.A09(this, R.id.info);
        A00();
    }

    public static boolean A04(C30341mI r2) {
        int i;
        if (C627636p.A0j(r2) || ((C627636p.A0c(r2) && (r2 instanceof C31211nv) && ((C31211nv) r2).A00 == 0) || C627636p.A0e(r2) || C627636p.A0f(r2) || (i = r2.A00) == 62 || i == 63)) {
            return true;
        }
        return false;
    }

    public void A1H() {
        A00();
        super.A1H();
    }

    public boolean A1v() {
        return false;
    }

    public boolean A1w() {
        return false;
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }
}
