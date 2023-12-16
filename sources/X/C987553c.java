package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.status.ContactStatusThumbnail;
import java.util.Map;
import java.util.Set;

/* renamed from: X.53c  reason: invalid class name and case insensitive filesystem */
public abstract class C987553c extends C88504Yz {
    public final AnonymousClass5UX A00;
    public final C105365Uq A01;
    public final AnonymousClass5C9 A02;
    public final C112765kG A03;
    public final C102705Jy A04;
    public final AnonymousClass5JX A05;

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e0, code lost:
        if (X.AnonymousClass75J.A00(r4.A06, r7) != false) goto L_0x00e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(com.whatsapp.status.ContactStatusThumbnail r13, X.C986552s r14) {
        /*
            r12 = this;
            r0 = 1
            X.C162457s7.A0J(r13, r0)
            boolean r1 = r14 instanceof X.C986352q
            if (r1 == 0) goto L_0x0046
            r0 = r14
            X.52q r0 = (X.C986352q) r0
            X.34x r4 = r0.A01
        L_0x000d:
            if (r4 == 0) goto L_0x0040
            if (r1 == 0) goto L_0x0041
            X.52q r14 = (X.C986352q) r14
            boolean r1 = r14.A04
        L_0x0015:
            boolean r0 = r4 instanceof X.C30721mu
            if (r0 == 0) goto L_0x0057
            X.5C9 r0 = r12.A02
            if (r0 == 0) goto L_0x0050
            X.1mu r4 = (X.C30721mu) r4
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            android.content.Context r1 = r13.getContext()
            java.lang.String r0 = ""
            r13.setTag(r0)
            X.C162457s7.A0H(r1)
            int r0 = X.AnonymousClass75C.A00(r1, r4)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass5C2.A00(r1, r0)
            android.graphics.Bitmap r0 = X.AnonymousClass5C7.A00(r1)
            if (r0 == 0) goto L_0x004c
            r13.setImageBitmap(r0)
        L_0x0040:
            return
        L_0x0041:
            X.52r r14 = (X.C986452r) r14
            boolean r1 = r14.A04
            goto L_0x0015
        L_0x0046:
            r0 = r14
            X.52r r0 = (X.C986452r) r0
            X.34x r4 = r0.A02
            goto L_0x000d
        L_0x004c:
            r13.setImageDrawable(r1)
            return
        L_0x0050:
            java.lang.String r0 = "Audio status loader is not provided"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0057:
            boolean r0 = r4 instanceof X.C30471mV
            if (r0 == 0) goto L_0x007a
            X.5Jy r3 = r12.A04
            if (r3 == 0) goto L_0x0073
            if (r1 == 0) goto L_0x0066
            X.5Nt r0 = r3.A02
            r0.A00(r4)
        L_0x0066:
            X.4FS r2 = r3.A04
            r1 = 23
            X.3aN r0 = new X.3aN
            r0.<init>(r4, r3, r13, r1)
            r2.BkP(r0)
            return
        L_0x0073:
            java.lang.String r0 = "Media status loader is not provided"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x007a:
            boolean r0 = r4 instanceof X.C30481mW
            if (r0 == 0) goto L_0x00fa
            X.5JX r3 = r12.A05
            if (r3 == 0) goto L_0x00f3
            X.1mW r4 = (X.C30481mW) r4
            r2 = 0
            X.C162457s7.A0J(r4, r2)
            java.lang.String r0 = ""
            r13.setTag(r0)
            X.5Zz r0 = r3.A02
            java.lang.String r11 = X.C107415bH.A06(r0, r4)
            if (r11 == 0) goto L_0x010b
            int r1 = r11.length()
            r0 = 700(0x2bc, float:9.81E-43)
            if (r1 <= r0) goto L_0x00a4
            java.lang.String r11 = r11.substring(r2, r0)
            X.C162457s7.A0D(r11)
        L_0x00a4:
            android.content.Context r5 = r13.getContext()
            com.whatsapp.TextData r7 = r4.A02
            if (r7 != 0) goto L_0x00b6
            java.lang.String r0 = "Text status missing text data"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            com.whatsapp.TextData r7 = new com.whatsapp.TextData
            r7.<init>()
        L_0x00b6:
            android.graphics.drawable.Drawable r4 = r13.getDrawable()
            X.5Y0 r9 = r3.A01
            X.33i r8 = r3.A00
            X.2y5 r10 = r3.A03
            X.C162457s7.A0H(r5)
            X.C162457s7.A0J(r5, r2)
            int r0 = r7.fontStyle
            android.graphics.Typeface r6 = X.C107415bH.A04(r5, r0)
            boolean r0 = r4 instanceof X.C86814Ly
            if (r0 == 0) goto L_0x00ed
            X.4Ly r4 = (X.C86814Ly) r4
            java.lang.CharSequence r0 = r4.A07
            boolean r0 = X.AnonymousClass75J.A00(r0, r11)
            if (r0 == 0) goto L_0x00ed
            com.whatsapp.TextData r0 = r4.A06
            boolean r0 = X.AnonymousClass75J.A00(r0, r7)
            if (r0 == 0) goto L_0x00ed
        L_0x00e2:
            float r1 = r13.A01
            r0 = 2
            float r0 = (float) r0
            float r1 = r1 / r0
            r4.A00 = r1
            r13.setImageDrawable(r4)
            return
        L_0x00ed:
            X.4Ly r4 = new X.4Ly
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x00e2
        L_0x00f3:
            java.lang.String r0 = "Text status loader is not provided"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x00fa:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Class type not supported: "
            r1.append(r0)
            X.AnonymousClass000.A1A(r4, r1)
            java.lang.String r0 = r1.toString()
            goto L_0x010d
        L_0x010b:
            java.lang.String r0 = "Text status missing content"
        L_0x010d:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C987553c.A09(com.whatsapp.status.ContactStatusThumbnail, X.52s):void");
    }

    public final void A0A(ContactStatusThumbnail contactStatusThumbnail, C986552s r10) {
        int i;
        int i2;
        C162457s7.A0J(contactStatusThumbnail, 1);
        C623534r A002 = r10.A00();
        int i3 = 0;
        if (A002 != null) {
            i = A002.A03();
            i3 = A002.A02();
        } else {
            i = 0;
        }
        Map map = contactStatusThumbnail.A06;
        map.clear();
        contactStatusThumbnail.A08(i, i3);
        if (r10 instanceof C986352q) {
            C103685Ny r0 = ((C986352q) r10).A02;
            C103675Nx r6 = r0.A02;
            Context context = contactStatusThumbnail.getContext();
            int i4 = 0;
            for (Object next : r0.A03) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    throw C18280x3.A0X();
                }
                Set set = r6.A01;
                AnonymousClass2z0 r1 = ((C624134x) next).A1J;
                if (set.contains(r1)) {
                    i2 = R.color.f5nameremoved;
                } else if (r6.A02.contains(r1)) {
                    i2 = R.color.f5nameremoved;
                } else {
                    i4 = i5;
                }
                C18280x3.A1D(Integer.valueOf(i4), map, AnonymousClass0Y8.A04(context, i2));
                i4 = i5;
            }
        }
    }

    public C987553c(View view, AnonymousClass5UX r2, C105365Uq r3, AnonymousClass5C9 r4, C112765kG r5, C102705Jy r6, AnonymousClass5JX r7) {
        super(view);
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
        this.A04 = r6;
        this.A05 = r7;
        this.A02 = r4;
    }

    public final void A08(AnonymousClass3ZH r4, ContactStatusThumbnail contactStatusThumbnail) {
        boolean A1W = C18290x4.A1W(contactStatusThumbnail);
        if (r4.A0H instanceof C135216kJ) {
            this.A00.A07(contactStatusThumbnail, r4);
        } else {
            this.A01.A05(contactStatusThumbnail, this.A03, r4, A1W);
        }
    }
}
