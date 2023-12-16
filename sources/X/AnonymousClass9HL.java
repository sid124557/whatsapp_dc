package X;

import android.app.Activity;
import com.whatsapp.wabloks.ext.WaBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1;
import com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity;

/* renamed from: X.9HL  reason: invalid class name */
public class AnonymousClass9HL extends C196249aX {
    public final C60482yd A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9HL(X.C116985rC r43, X.C116985rC r44, X.C183538qC r45, X.C183538qC r46, X.C183538qC r47, X.C183538qC r48, X.C183538qC r49, X.C183538qC r50, X.C183538qC r51, X.C183538qC r52, X.C183538qC r53, X.C183538qC r54, X.C183538qC r55, X.C183538qC r56, X.C183538qC r57, X.C183538qC r58, X.C183538qC r59, X.C183538qC r60, X.C183538qC r61, X.C183538qC r62, X.C183538qC r63, X.C183538qC r64, X.C183538qC r65, X.C183538qC r66, X.C183538qC r67, X.C183538qC r68, X.C183538qC r69, X.C183538qC r70, X.C183538qC r71, X.C183538qC r72, X.C183538qC r73, X.C183538qC r74, X.C183538qC r75, X.C183538qC r76, X.C183538qC r77, X.C183538qC r78, X.C183538qC r79, X.C183538qC r80, X.C183538qC r81, X.C183538qC r82) {
        /*
            r42 = this;
            r27 = r70
            r17 = r69
            r16 = r68
            r15 = r67
            r35 = r66
            r20 = r65
            r13 = r64
            r31 = r63
            r30 = r62
            r29 = r61
            r24 = r60
            r22 = r59
            r21 = r71
            r1 = r42
            r32 = r72
            r2 = r43
            r33 = r73
            r3 = r44
            r34 = r74
            r4 = r45
            r36 = r75
            r5 = r46
            r37 = r76
            r6 = r47
            r38 = r77
            r7 = r48
            r26 = r78
            r10 = r49
            r14 = r79
            r28 = r50
            r11 = r54
            r39 = r80
            r19 = r51
            r40 = r81
            r12 = r52
            r41 = r82
            r25 = r53
            r18 = r55
            r23 = r56
            r8 = r57
            r9 = r58
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            java.lang.Object r0 = r30.get()
            X.2yd r0 = (X.C60482yd) r0
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9HL.<init>(X.5rC, X.5rC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC):void");
    }

    public void BJa(Activity activity, String str, String str2) {
        C08270df supportFragmentManager = ((C003203q) activity).getSupportFragmentManager();
        WaBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1 waBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1 = new WaBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1(this, str, str2);
        waBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1.A1K();
        waBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1.A1O(supportFragmentManager, "bloks-dialog");
    }

    public void Bme(Activity activity, AnonymousClass3EC r5, AnonymousClass49F r6) {
        if (activity instanceof C84744Dn) {
            C84744Dn r1 = (C84744Dn) activity;
            r1.Brn(r5);
            r1.Bro(r6, r5, true);
            if (activity instanceof C203789oJ) {
                ((WaFcsBottomSheetModalActivity) ((C203789oJ) activity)).A04.A0A = r6;
                return;
            }
            return;
        }
        this.A00.A01(activity).A01(new C197949e8(r5.A00()));
    }
}
