package X;

import android.content.DialogInterface;
import android.widget.CheckBox;
import java.util.Set;

/* renamed from: X.5cM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C108065cM implements DialogInterface.OnClickListener {
    public final /* synthetic */ CheckBox A00;
    public final /* synthetic */ C1228165x A01;
    public final /* synthetic */ C835748y A02;
    public final /* synthetic */ AnonymousClass64F A03;
    public final /* synthetic */ C69263Wi A04;
    public final /* synthetic */ C621033m A05;
    public final /* synthetic */ AnonymousClass33p A06;
    public final /* synthetic */ C620733j A07;
    public final /* synthetic */ AnonymousClass36Y A08;
    public final /* synthetic */ AnonymousClass1VX A09;
    public final /* synthetic */ AnonymousClass4FV A0A;
    public final /* synthetic */ AnonymousClass30N A0B;
    public final /* synthetic */ C50222hp A0C;
    public final /* synthetic */ C45042Yl A0D;
    public final /* synthetic */ AnonymousClass4FS A0E;
    public final /* synthetic */ Set A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        if (r16 == false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r30, int r31) {
        /*
            r29 = this;
            r13 = r29
            X.65x r0 = r13.A01
            r16 = r0
            android.widget.CheckBox r14 = r13.A00
            boolean r12 = r13.A0H
            X.33p r11 = r13.A06
            X.4FS r10 = r13.A0E
            X.4FV r0 = r13.A0A
            r17 = r0
            X.36Y r15 = r13.A08
            X.30N r9 = r13.A0B
            java.util.Set r8 = r13.A0F
            X.2hp r7 = r13.A0C
            X.2Yl r6 = r13.A0D
            boolean r5 = r13.A0G
            X.48y r4 = r13.A02
            X.3Wi r3 = r13.A04
            X.33m r2 = r13.A05
            X.1VX r1 = r13.A09
            X.33j r0 = r13.A07
            X.64F r13 = r13.A03
            r16.BZn()
            if (r14 == 0) goto L_0x0036
            boolean r16 = r14.isChecked()
            r14 = 1
            if (r16 != 0) goto L_0x0037
        L_0x0036:
            r14 = 0
        L_0x0037:
            if (r14 == r12) goto L_0x0042
            android.content.SharedPreferences$Editor r12 = X.C18270x1.A03(r11)
            java.lang.String r11 = "pref_delete_media"
            X.C18270x1.A0l(r12, r11, r14)
        L_0x0042:
            X.5s8 r11 = new X.5s8
            r25 = r6
            r26 = r8
            r27 = r5
            r28 = r14
            r21 = r1
            r22 = r17
            r23 = r9
            r24 = r7
            r17 = r3
            r18 = r2
            r19 = r0
            r20 = r15
            r14 = r11
            r15 = r4
            r16 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r10.BkM(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C108065cM.onClick(android.content.DialogInterface, int):void");
    }

    public /* synthetic */ C108065cM(CheckBox checkBox, C1228165x r3, C835748y r4, AnonymousClass64F r5, C69263Wi r6, C621033m r7, AnonymousClass33p r8, C620733j r9, AnonymousClass36Y r10, AnonymousClass1VX r11, AnonymousClass4FV r12, AnonymousClass30N r13, C50222hp r14, C45042Yl r15, AnonymousClass4FS r16, Set set, boolean z, boolean z2) {
        this.A01 = r3;
        this.A00 = checkBox;
        this.A0H = z;
        this.A06 = r8;
        this.A0E = r16;
        this.A0A = r12;
        this.A08 = r10;
        this.A0B = r13;
        this.A0F = set;
        this.A0C = r14;
        this.A0D = r15;
        this.A0G = z2;
        this.A02 = r4;
        this.A04 = r6;
        this.A05 = r7;
        this.A09 = r11;
        this.A07 = r9;
        this.A03 = r5;
    }
}
