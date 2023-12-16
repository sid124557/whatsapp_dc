package X;

import java.util.Comparator;
import java.util.List;

/* renamed from: X.6A5  reason: invalid class name */
public class AnonymousClass6A5 implements Comparator {
    public Object A00;
    public final int A01;

    public AnonymousClass6A5(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static List A00(Iterable iterable, Object obj, int i) {
        return C73723fy.A0L(iterable, new AnonymousClass6A5(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        if ((r7 instanceof X.AnonymousClass1fY) != false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x00b0;
                case 1: goto L_0x00d1;
                case 2: goto L_0x0012;
                case 3: goto L_0x0005;
                case 4: goto L_0x00fe;
                case 5: goto L_0x012b;
                case 6: goto L_0x0005;
                case 7: goto L_0x0056;
                case 8: goto L_0x013c;
                case 9: goto L_0x0169;
                case 10: goto L_0x018c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A00
            X.4GR r0 = (X.AnonymousClass4GR) r0
            java.lang.Object r0 = r0.invoke(r11, r12)
            int r2 = X.AnonymousClass001.A0K(r0)
        L_0x0011:
            return r2
        L_0x0012:
            java.lang.Object r7 = r10.A00
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r7 = (com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel) r7
            X.5SQ r11 = (X.AnonymousClass5SQ) r11
            X.5SQ r12 = (X.AnonymousClass5SQ) r12
            int r1 = r11.A00
            r6 = 0
            r5 = 1
            if (r1 != r5) goto L_0x0025
            int r0 = r12.A00
            r2 = 0
            if (r0 == r5) goto L_0x0011
        L_0x0025:
            r2 = -1
            if (r1 == r5) goto L_0x0011
            int r0 = r12.A00
            if (r0 == r5) goto L_0x01cd
            X.3Ex r1 = r7.A08
            com.whatsapp.jid.UserJid r0 = r11.A01
            X.3ZH r4 = r1.A0A(r0)
            com.whatsapp.jid.UserJid r0 = r12.A01
            X.3ZH r3 = r1.A0A(r0)
            X.2k5 r2 = r4.A0F
            boolean r1 = X.AnonymousClass000.A1W(r2)
            X.2k5 r0 = r3.A0F
            if (r0 == 0) goto L_0x0045
            r6 = 1
        L_0x0045:
            if (r1 != r6) goto L_0x01ca
            X.5ZU r0 = r7.A0B
            java.lang.String r1 = r0.A0H(r4)
            java.lang.String r0 = r0.A0H(r3)
            int r2 = r1.compareTo(r0)
            return r2
        L_0x0056:
            java.lang.Object r8 = r10.A00
            X.5R1 r8 = (X.AnonymousClass5R1) r8
            X.34r r11 = (X.C623534r) r11
            X.34r r12 = (X.C623534r) r12
            X.C18260x0.A0Q(r11, r12)
            com.whatsapp.jid.UserJid r6 = r11.A0A
            boolean r0 = r6 instanceof X.AnonymousClass1fX
            if (r0 != 0) goto L_0x01d6
            boolean r0 = r6 instanceof X.AnonymousClass1fY
            if (r0 != 0) goto L_0x01d6
            r9 = 1
            com.whatsapp.jid.UserJid r7 = r12.A0A
            boolean r0 = r7 instanceof X.AnonymousClass1fX
            if (r0 != 0) goto L_0x0077
            boolean r1 = r7 instanceof X.AnonymousClass1fY
            r0 = 0
            if (r1 == 0) goto L_0x0078
        L_0x0077:
            r0 = 1
        L_0x0078:
            r2 = -1
            if (r0 != 0) goto L_0x0011
            boolean r0 = r6 instanceof X.C135216kJ
            if (r0 != 0) goto L_0x01d6
            boolean r0 = r7 instanceof X.C135216kJ
            if (r0 != 0) goto L_0x0011
            long r4 = r11.A05()
            long r0 = r12.A05()
            long r4 = r4 - r0
            int r3 = (int) r4
            java.util.Map r1 = r8.A00
            if (r1 == 0) goto L_0x00a8
            java.lang.Number r0 = X.AnonymousClass0x9.A0q(r6, r1)
            if (r0 == 0) goto L_0x00a9
            int r2 = r0.intValue()
            java.lang.Number r0 = X.AnonymousClass0x9.A0q(r7, r1)
            if (r0 == 0) goto L_0x01ce
            int r0 = r0.intValue()
            int r2 = r2 - r0
            if (r2 != 0) goto L_0x0011
        L_0x00a8:
            return r3
        L_0x00a9:
            java.lang.Object r0 = r1.get(r7)
            if (r0 == 0) goto L_0x00a8
            return r2
        L_0x00b0:
            java.lang.Object r3 = r10.A00
            X.4uI r3 = (X.C95704uI) r3
            java.lang.Number r11 = (java.lang.Number) r11
            java.lang.Number r12 = (java.lang.Number) r12
            X.5Xt r1 = r3.A09
            int r0 = r11.intValue()
            int r2 = r1.A01(r0)
            X.5Xt r1 = r3.A09
            int r0 = r12.intValue()
            int r0 = r1.A01(r0)
            int r2 = java.lang.Integer.compare(r2, r0)
            return r2
        L_0x00d1:
            X.5e1 r11 = (X.C109065e1) r11
            java.lang.Object r3 = r10.A00
            X.5du r3 = (X.C108995du) r3
            X.5ds r1 = r3.A00()
            X.5ds r0 = X.C108975ds.A03(r11)
            double r0 = r1.A05(r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            X.5e1 r12 = (X.C109065e1) r12
            X.5ds r1 = r3.A00()
            X.5ds r0 = X.C108975ds.A03(r12)
            double r0 = r1.A05(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            int r2 = X.AnonymousClass2A6.A00(r2, r0)
            return r2
        L_0x00fe:
            X.66j r11 = (X.C1229266j) r11
            java.lang.Object r2 = r10.A00
            X.5RO r2 = (X.AnonymousClass5RO) r2
            int r0 = r11.getId()
            X.57y r0 = r2.A01(r0)
            int r0 = r0.ordinal()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.66j r12 = (X.C1229266j) r12
            int r0 = r12.getId()
            X.57y r0 = r2.A01(r0)
            int r0 = r0.ordinal()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = X.AnonymousClass2A6.A00(r1, r0)
            return r2
        L_0x012b:
            java.lang.Object r2 = r10.A00
            java.text.Collator r2 = (java.text.Collator) r2
            X.5QG r11 = (X.AnonymousClass5QG) r11
            X.5QG r12 = (X.AnonymousClass5QG) r12
            java.lang.String r1 = r11.A03
            java.lang.String r0 = r12.A03
            int r2 = r2.compare(r1, r0)
            return r2
        L_0x013c:
            X.52r r11 = (X.C986452r) r11
            X.3ZH r0 = r11.A00
            java.lang.String r2 = r0.A0J()
            r3 = 0
            if (r2 == 0) goto L_0x0167
            java.lang.Object r0 = r10.A00
            X.5Nb r0 = (X.C103465Nb) r0
            java.lang.String r1 = r0.A02
            r0 = 1
            int r0 = X.C175728Zm.A0G(r2, r1, r3, r0)
        L_0x0152:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            X.52r r12 = (X.C986452r) r12
            X.3ZH r0 = r12.A00
            java.lang.String r2 = r0.A0J()
            if (r2 == 0) goto L_0x01bf
            java.lang.Object r0 = r10.A00
            X.5Nb r0 = (X.C103465Nb) r0
            java.lang.String r1 = r0.A02
            goto L_0x01ba
        L_0x0167:
            r0 = 0
            goto L_0x0152
        L_0x0169:
            X.536 r11 = (X.AnonymousClass536) r11
            X.1RL r0 = r11.A03
            java.lang.String r2 = r0.A0H
            r3 = 0
            if (r2 == 0) goto L_0x018a
            java.lang.Object r0 = r10.A00
            com.whatsapp.updates.viewmodels.SearchUsecase r0 = (com.whatsapp.updates.viewmodels.SearchUsecase) r0
            java.lang.String r1 = r0.A01()
            r0 = 1
            int r0 = X.C175728Zm.A0G(r2, r1, r3, r0)
        L_0x017f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            X.536 r12 = (X.AnonymousClass536) r12
            X.1RL r0 = r12.A03
            java.lang.String r2 = r0.A0H
            goto L_0x01b0
        L_0x018a:
            r0 = 0
            goto L_0x017f
        L_0x018c:
            X.52r r11 = (X.C986452r) r11
            X.3ZH r0 = r11.A00
            java.lang.String r2 = r0.A0J()
            r3 = 0
            if (r2 == 0) goto L_0x01c8
            java.lang.Object r0 = r10.A00
            com.whatsapp.updates.viewmodels.SearchUsecase r0 = (com.whatsapp.updates.viewmodels.SearchUsecase) r0
            java.lang.String r1 = r0.A01()
            r0 = 1
            int r0 = X.C175728Zm.A0G(r2, r1, r3, r0)
        L_0x01a4:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            X.52r r12 = (X.C986452r) r12
            X.3ZH r0 = r12.A00
            java.lang.String r2 = r0.A0J()
        L_0x01b0:
            if (r2 == 0) goto L_0x01bf
            java.lang.Object r0 = r10.A00
            com.whatsapp.updates.viewmodels.SearchUsecase r0 = (com.whatsapp.updates.viewmodels.SearchUsecase) r0
            java.lang.String r1 = r0.A01()
        L_0x01ba:
            r0 = 1
            int r3 = X.C175728Zm.A0G(r2, r1, r3, r0)
        L_0x01bf:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            int r2 = X.AnonymousClass2A6.A00(r4, r0)
            return r2
        L_0x01c8:
            r0 = 0
            goto L_0x01a4
        L_0x01ca:
            if (r2 == 0) goto L_0x01cd
            r5 = -1
        L_0x01cd:
            return r5
        L_0x01ce:
            java.lang.Object r0 = r1.get(r6)
            if (r0 != 0) goto L_0x01d5
            return r3
        L_0x01d5:
            return r9
        L_0x01d6:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6A5.compare(java.lang.Object, java.lang.Object):int");
    }
}
